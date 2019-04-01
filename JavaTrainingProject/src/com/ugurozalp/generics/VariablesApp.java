package com.ugurozalp.generics;

import java.util.ArrayList;
import java.util.List;

public class VariablesApp {
    public static void main(String[] args) {
        VariablesJeneric<String> t1 = new VariablesJeneric<>();
        VariablesJeneric<Integer> t2 = new VariablesJeneric<>();

        List<VariablesJeneric<String>> varsList = new ArrayList<>();
        varsList.add(t1);
        // varsList.add(t2);

        List<VariablesJeneric<?>> varsList2 = new ArrayList<>();
        varsList2.add(t1);
        varsList2.add(t2);

        for (VariablesJeneric<?> element : varsList2) {
            Object getVars = element.getVaraiable();
            getVars.toString();
            // jenerik sınıflar derlendikten sonra java veri tiplerini silmekte ve Object veri tipine dönüştürmektedir.
            // if (getVars instanceof VariablesJeneric<String>) {
            //
            // }
        }

    }
}
