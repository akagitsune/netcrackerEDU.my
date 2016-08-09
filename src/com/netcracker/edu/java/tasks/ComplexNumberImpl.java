package com.netcracker.edu.java.tasks;

import com.sun.beans.editors.StringEditor;

/**
 * Created by root on 08.08.16.
 */
public class ComplexNumberImpl implements ComplexNumber {
    double re, im;

    public ComplexNumberImpl() {
        re = 0;
        im = 0;
    }

    public ComplexNumberImpl(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public ComplexNumberImpl(String value) {
        String reString, imString;
        
    }

    @Override
    public double getRe() {
        return 0;
    }

    @Override
    public double getIm() {
        return 0;
    }

    @Override
    public boolean isReal() {
        return false;
    }

    @Override
    public void set(double re, double im) {

    }

    @Override
    public void set(String value) throws NumberFormatException {

    }

    @Override
    public ComplexNumber copy() {
        return null;
    }

    @Override
    public ComplexNumber clone() throws CloneNotSupportedException {
        return null;
    }

    @Override
    public int compareTo(ComplexNumber other) {
        return 0;
    }

    @Override
    public void sort(ComplexNumber[] array) {

    }

    @Override
    public ComplexNumber negate() {
        return null;
    }

    @Override
    public ComplexNumber add(ComplexNumber arg2) {
        return null;
    }

    @Override
    public ComplexNumber multiply(ComplexNumber arg2) {
        return null;
    }
}
