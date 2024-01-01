package org.gfg.threading;

public class Task2 extends Thread{

    @Override
    public void run(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Kajal with thread name "+ Thread.currentThread());
    }
}

// 1) create a class and extends thread class
// 2) it will not ask to implement any method becoz thread is a concrete class
//3) i need to Override the run method and provide everything u need to execute inside the run method
//4) create object of class in which u have defined the task/run method
// 5 ) start the thread with start method

