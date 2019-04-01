package com.ugurozalp.generics;

public class JenericMethod {

    Object obj;

    <T> void set(T obj) {
        this.obj = obj;
    }

    Object get() {
        return obj;
    }

    public static void main(String[] args) {
        JenericMethod method = new JenericMethod();
        method.set("1");
        method.set(1);
        method.set(1.00);
    }
}
