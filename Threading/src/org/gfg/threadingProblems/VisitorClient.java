package org.gfg.threadingProblems;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class VisitorClient {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        VisitorCountTask visitorCountTask =new VisitorCountTask();
        for(int i =0;i<2000000; i++){
            executorService.submit(visitorCountTask);
        }
        executorService.shutdown();
        executorService.awaitTermination(10, TimeUnit.MINUTES);
        System.out.println("total no of visitors are :" + visitorCountTask.getVisitor());
    }
}
