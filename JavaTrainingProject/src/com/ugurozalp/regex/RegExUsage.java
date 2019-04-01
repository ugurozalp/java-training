package com.ugurozalp.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExUsage {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\d{5}");
        // Pattern pattern = Pattern.compile("[0-9]{6}");
        // Pattern pattern = Pattern.compile("[a-zA-z]+");

        Matcher matcher = pattern.matcher("34562");
        boolean bool = matcher.matches();
        System.out.println(bool);

    }
}
