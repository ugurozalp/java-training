package com.ugurozalp.utilities;

public class StringTokenizer {
    public static void main(String[] args) {
        final java.util.StringTokenizer st = new java.util.StringTokenizer("this is test");

        while (st.hasMoreElements()) {
            System.out.println(st.nextElement());
        }
    }
}
