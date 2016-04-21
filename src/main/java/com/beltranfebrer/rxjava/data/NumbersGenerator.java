package com.beltranfebrer.rxjava.data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Miquel Beltran on 15.04.16.
 * More on http://beltranfebrer.com
 */
public class NumbersGenerator {
    public static int fibonacci(int n) {
        int a = 0;
        int b = 1;

        // Compute Fibonacci sequence.
        for (int i = 0; i < n; i++) {
            int temp = a;
            a = b;
            b = temp + b;
        }
        return a;
    }

    public static List getList(int length) {
        ArrayList list = new ArrayList();
        for (int i = 0; i < length; i++) {
            list.add(i);
        }
        return list;
    }
}
