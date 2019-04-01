package com.ugurozalp.languagefiles;

import java.util.Locale;
import java.util.ResourceBundle;

public class LanguageFiles {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("com.ugurozalp.languagefiles/language", new Locale("en_EN"));

        System.out.println(bundle.getString("sample_key"));
    }
}
