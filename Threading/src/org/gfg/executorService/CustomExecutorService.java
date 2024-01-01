package org.gfg.executorService;

import java.util.concurrent.*;

public class CustomExecutorService {
    public static void main(String[] args) throws InterruptedException {
        int corePoolSize = 4;
        int maxPoolSize = 8;
        // custom thread pool
        // predefined methos is best for your case -> u can use any predefined
        // custom thread pool

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(corePoolSize,
                maxPoolSize, 60, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
        Task task = new Task();
        for(int i = 0; i<20;i++){
            threadPoolExecutor.submit(task);
        }
       threadPoolExecutor.shutdown();
        // main thread waiting for going to the next line
       threadPoolExecutor.awaitTermination(10, TimeUnit.MINUTES); // join
       // await termination says, it will wait at max for 60 sec, and then only it will go to next line
       // executorService is not able to do all the task in 60 sec, it will just move to the next line
       // executorService is able to do the task before 30 sec, after 30 sec it will go to next line

       System.out.println("I am at the last line");

        ScheduledExecutorService service = Executors.newScheduledThreadPool(2);
        service.schedule(task, 60, TimeUnit.SECONDS);
        service.shutdown();
    }
}
