package org.gfg.streaming;
@FunctionalInterface
public interface Calculator {

    int add(int a, int b);

//    int divide(int a, int b);

    default int multiple(int a, int b){
        return a*b;
    }

    static int subtract(int a ,int b){
        return b-a;
    }
}
