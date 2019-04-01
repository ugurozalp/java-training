package com.ugurozalp.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetApps {
    public static void main(String[] args) {
        hashSet();

        treeSet();

    }

    private static void hashSet() {
        Set<Integer> set = new HashSet<Integer>();
        set.add(new Integer(100));
        set.add(new Integer(5));
        set.add(new Integer(25));
        for (Integer i : set) {
            System.out.println(i);
        }
    }

    private static void treeSet() {
        // Girilen değeleri küçükten büyüğe sıralar.
        Set<Integer> setInteger = new TreeSet<Integer>();
        setInteger.add(new Integer(100));
        setInteger.add(new Integer(5));
        setInteger.add(new Integer(25));
        setInteger.add(new Integer(101));
        for (Integer i : setInteger) {
            System.out.println(i);
        }
    }
}
