package org.gfg.executorService;

import org.gfg.threading.FactorialMT;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class ExecutorServiceDemo {
    public static void main(String[] args) throws InterruptedException {
//        ThreadFactory
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        Task task =new Task();
        for(int i =0 ;i< 20;i++){
            System.out.println("I am in main method with thread name :" + Thread.currentThread().getName());
            executorService.submit(task);
        }
        System.out.println("I am out of for loop in main method with thread name :" + Thread.currentThread().getName());
        FactorialMT factorialMT  = new FactorialMT(2);

        executorService.shutdown(); //signal which will go to my executor service, that
        // executor service should not take more task after this.
//        Thread.sleep(500);
//        executorService.shutdownNow(); // it will shut down the executor service at the same time,
        // when it got this command
//        executorService.submit(factorialMT);


    }
}
