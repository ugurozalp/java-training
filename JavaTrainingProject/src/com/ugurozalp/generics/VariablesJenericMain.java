package com.ugurozalp.generics;

public class VariablesJenericMain {
    public static void main(String[] args) {
        
        VariablesJeneric<String> strVars = new VariablesJeneric<>();
        strVars.setVariable("arg");
        System.out.println(strVars);

        VariablesJeneric<Integer> intVars = new VariablesJeneric<>();
        intVars.setVariable(1);
        System.out.println(intVars);
    }
}
