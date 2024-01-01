package org.gfg.executorService;

import java.util.concurrent.ThreadFactory;

public class ThreadFactoryDemo implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        Thread t =new Thread(r);
        return t;
    }
}
