package com.ugurozalp.lambda.singlemethodinterface;

import java.lang.Thread.State;

public interface StateChangeListener {
    public void onStateChange(State oldState, State newState);
}
