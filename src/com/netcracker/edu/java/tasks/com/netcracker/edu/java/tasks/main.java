package com.netcracker.edu.java.tasks.com.netcracker.edu.java.tasks;

import com.netcracker.edu.java.tasks.ComplexNumber;
import com.netcracker.edu.java.tasks.ComplexNumberImpl;

/**
 * Created by Senketsu on 10.08.2016.
 */
public class main {
    public static void main(String[] args) {
        ComplexNumberImpl a = new ComplexNumberImpl("-10.0-8.0i");
        a.set("-5+2i");
        a.set("1+i");
        a.set("+4-i");
        a.set("0.0i");
        a.set("3");
    }
}
