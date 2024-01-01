package org.gfg.threadingProblems;

import java.util.concurrent.Callable;

public class CallableTask implements Callable {
    @Override
    public String call() throws Exception {
        return "I am inside the call method with thread name :" +Thread.currentThread().getName();
    }
}
