package org.gfg.threading;

public class Client{
    public static void main(String[] args) throws InterruptedException {
        Task task = new Task();
        Thread thread = new Thread(task);
        thread.start();
//        thread.start();
        Task2 task2 = new Task2();
        task2.start();
        task2.join();
        thread.join();
        System.out.println("Thread name is "+ Thread.currentThread());
    }
}
