package ru.ncedu.java.tasks;

/**
 * Created by root on 07.08.16.
 */

public class ArrayVectorImpl implements ArrayVector {
    private double[] arr;
    private int size;

    @Override
    public void set(double... elements) {
        arr = new double[elements.length];
        size = elements.length;
        System.arraycopy(elements, 0, arr, 0, size);
    }

    @Override
    public double[] get() {
        return arr;
    }

    @Override
    public ArrayVector clone() {
        ArrayVector rt = new ArrayVectorImpl();
        rt.set(arr);
        return rt;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void set(int index, double value) {
        if (index < 0)
            return;
        if (index >= size) {
            double[] tmp = new double[index + 1];
            System.arraycopy(arr, 0, tmp, 0, size);
            for (int i = size; i < index + 1; i++)
                tmp[i] = 0;
            tmp[index] = value;
            arr = tmp;
        }
        arr[index] = value;
        size = index + 1;
    }

    @Override
    public double get(int index) throws ArrayIndexOutOfBoundsException {
        if (index >= size)
            throw new ArrayIndexOutOfBoundsException();
        return arr[index];
    }

    @Override
    public double getMax() {
        double max = arr[0];
        for (double v: arr) {
            if (v > max)
                max = v;
        }
        return max;
    }

    @Override
    public double getMin() {
        double min = arr[0];
        for (double v: arr) {
            if (v < min)
                min = v;
        }
        return min;
    }

    @Override
    public void sortAscending() {
        for (int i = 0; i < size; i++)
            for(int j = i; j < size; j++) {
                if (arr[i] > arr[j]) {
                    double tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
    }

    @Override
    public void mult(double factor) {
        for (int i = 0; i < size; i++)
            arr[i] *= factor;
    }

    @Override
    public ArrayVector sum(ArrayVector anotherVector) {
        double[] anotherArr = anotherVector.get();
        int maxSize;
        if (anotherArr.length > size) {
            maxSize = anotherArr.length;
        } else {
            maxSize = size;
        }
        for (int i = 0; i < maxSize; i++) {
            arr[i] += anotherArr[i];
        }
        return this;
    }

    @Override
    public double scalarMult(ArrayVector anotherVector) {
        double result = 0;
        double[] anotherArr = anotherVector.get();
        int maxSize;
        if (anotherArr.length > size) {
            maxSize = anotherArr.length;
        } else {
            maxSize = size;
        }
        for (int i = 0; i < maxSize; i++) {
            result += (arr[i] * anotherArr[i]);
        }
        return result;
    }

    @Override
    public double getNorm() {
        return Math.sqrt(scalarMult(this));
    }
}
