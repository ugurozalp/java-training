package com.ugurozalp.generics;

public class ExtendsJeneric {

    public static class MyApp<T extends Number> {
        T number;

        public T getNumber() {
            return number;
        }

        public void setNumber(T x) {
            this.number = x;
        }
    }

    public static void main(String[] args) {
        MyApp<Integer> app = new MyApp<Integer>();
        // MyApp<String> app2 = new MyApp<>();
        app.getNumber();
    }
}
