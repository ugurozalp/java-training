package com.ugurozalp.generics;

public interface JenericInterface<E, T, X> {

    E getE();

    T getT();

    X getX();
}

class JenericInterfaceImpl implements JenericInterface<String, Integer, Double> {

    @Override
    public String getE() {
        return null;
    }

    @Override
    public Integer getT() {
        return null;
    }

    @Override
    public Double getX() {
        return null;
    }

}
