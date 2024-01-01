package org.gfg.threadingProblems;

import org.gfg.executorService.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CallableTask callableTask =new CallableTask();
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        Future<String> f = null;
        List<Future<String>> list = new ArrayList<>();
        for(int i = 0 ; i<20;i++){
          list.add(executorService.submit(callableTask)); // blocking code or not
        }
        list.stream().forEach(str -> {
            try {
                System.out.println(str.get()); // this is correct, blocking code 
            } catch (InterruptedException e) {


            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
