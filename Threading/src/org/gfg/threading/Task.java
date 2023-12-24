package org.gfg.threading;

public class Task implements Runnable  {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Kajal with thread name" + Thread.currentThread());
    }
}

//1) create a class and implements Runnable
//2) always have to implement run method (mandatory)
// 3) write down your task inside ur run method
// 4) u have to create, object of your class which is implementing runnable
// 5) Thread with my runnable in it and i will start it

