package com.ugurozalp.generics;

public class VariablesJeneric<T> {

    T element;

    T getVaraiable() {
        return element;
    }

    void setVariable(T element) {
        this.element = element;
    }
}
