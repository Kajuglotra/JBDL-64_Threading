package org.gfg.executorService;

public class Task implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("I am inside the task with thread name : " + Thread.currentThread().getName());
    }
}
