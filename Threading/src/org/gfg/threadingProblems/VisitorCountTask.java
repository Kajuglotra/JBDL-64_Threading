package org.gfg.threadingProblems;

import java.util.concurrent.atomic.AtomicInteger;

public class VisitorCountTask implements Runnable{

    AtomicInteger visitor;

    public VisitorCountTask() {
        this.visitor = new AtomicInteger(0);
    }

    public int getVisitor() {
        return visitor.get();
    }

    @Override
    public void run() {
       visitor.getAndAdd(1);
    }
    // only one thread can go inside this synchronized block
    // it is making ur prog slow
    // ur task is so small
    // synchronized block as small as possible

//    public synchronized void getCount(){
//        visitor++;
//    }
}
