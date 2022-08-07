package com.example.javalibrary;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyJavaClassTest {

    @Test
    public void addJava() {
        MyJavaClass myJavaClass = new MyJavaClass();
        int sum = myJavaClass.add(1, 1);
        assertEquals(2, sum);
    }
}