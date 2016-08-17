package com.netcracker.edu.java.tasks;

import java.util.Objects;

/**
 * Created by root on 08.08.16.
 */

public class ComplexNumberImpl implements ComplexNumber {
    private double re, im;

    public ComplexNumberImpl() {
        re = 0;
        im = 0;
    }

    public ComplexNumberImpl(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public ComplexNumberImpl(String value) {
        if (value.equals("i")) {
            im = 1;
            re = 0;
            return;
        }
        String reString, imString;
        if (value.charAt(value.length() - 1) != 'i') {
            im = 0;
            re = Double.parseDouble(value);
            return;
        }
        int k = value.length() - 2;
        while (value.charAt(k) != '-' && value.charAt(k) != '+' && k >= 0) {
            k--;
        }
        if (k == 0) {
            imString = value.substring(0, value.length() - 1);
            if (imString.equals("-") || imString.equals("+"))
                imString += '1';
            re = 0;
            im = Double.parseDouble(imString);
            return;
        }
        reString = value.substring(0, k);
        imString = value.substring(k, value.length() - 1);
        if (imString.equals("-") || imString.equals("+"))
            imString += '1';
        re = Double.parseDouble(reString);
        im = Double.parseDouble(imString);
    }

    @Override
    public double getRe() {
        return re;
    }

    @Override
    public double getIm() {
        return im;
    }

    @Override
    public boolean isReal() {
        if (im == 0)
            return true;
        else
            return false;
    }

    @Override
    public void set(double re, double im) {
        this.re = re;
        this.im = im;
    }

    @Override
    public void set(String value) throws NumberFormatException {
        if (value.equals("i")) {
            im = 1;
            re = 0;
            return;
        }
        String reString, imString;
        if (value.charAt(value.length() - 1) != 'i') {
            im = 0;
            re = Double.parseDouble(value);
            return;
        }
        int k = value.length() - 2;
        while (value.charAt(k) != '-' && value.charAt(k) != '+' && k > 0) {
            k--;
        }
        if (k == 0) {
            imString = value.substring(0, value.length() - 1);
            if (imString.equals("-") || imString.equals("+"))
                imString += '1';
            re = 0;
            im = Double.parseDouble(imString);
            return;
        }
        reString = value.substring(0, k);
        imString = value.substring(k, value.length() - 1);
        if (imString.equals("-") || imString.equals("+"))
            imString += '1';
        re = Double.parseDouble(reString);
        im = Double.parseDouble(imString);
    }

    @Override
    public ComplexNumber copy() {
        ComplexNumber ret = new ComplexNumberImpl(re, im);
        return ret;
    }

    @Override
    public ComplexNumber clone() throws CloneNotSupportedException {
        ComplexNumber ret = new ComplexNumberImpl(re, im);
        return ret;
    }

    @Override
    public String toString() {
        String res;
        if (re == 0 && im == 0)
            res = "0";
        else if (re != 0 && im == 0)
            res = Double.toString(re);
        else if (re == 0 && im != 0) {
            res = Double.toString(im);
            res += 'i';
        } else {
           res = Double.toString(re);
           if (im > 0)
               res += '+';
           res += Double.toString(im);
           res += 'i';
        }
        return res;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ComplexNumber that = (ComplexNumber) object;
        return Double.compare(that.getRe(), re) == 0 &&
                Double.compare(that.getIm(), im) == 0;
    }

    @Override
    public int compareTo(ComplexNumber other) {
        double mod1 = Math.sqrt(re*re + im*im);
        double mod2 = Math.sqrt(other.getRe()*other.getRe() + other.getIm()*other.getIm());
        if (mod1 < mod2)
            return -1;
        else if (mod1 == mod2)
            return 0;
        else if (mod1 > mod2)
            return 1;
        return 0;
    }

    @Override
    public void sort(ComplexNumber[] array) {
        for(int i = 0; i < array.length; i++)
            for(int j = i; j < array.length; j++)
                if (array[i].compareTo(array[j]) > 0) {
                    ComplexNumber tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
    }

    @Override
    public ComplexNumber negate() {
        re *= -1;
        im *= -1;
        return this;
    }

    @Override
    public ComplexNumber add(ComplexNumber arg2) {
        re += arg2.getRe();
        im += arg2.getIm();
        return this;
    }
//(a*c-b*d)+(b*c+a*d)
    @Override
    public ComplexNumber multiply(ComplexNumber arg2) {
        double re2 = re;
        re = re * arg2.getRe() - im * arg2.getIm();
        im = im * arg2.getRe() + re2 * arg2.getIm();
        return this;
    }
}
