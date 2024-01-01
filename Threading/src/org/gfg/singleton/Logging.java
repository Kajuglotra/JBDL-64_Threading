package org.gfg.singleton;

public class Logging {

    int num;

    private Logging(){
    }
//    public static Logging instance = new Logging(); // early intialization // thread safe
    public static Logging instance;
//    Collection

//    public synchronized static Logging getInstance(){ // which can be prevented from multi threading
//        if(instance == null){ // 2 thread at the same time?
//            System.out.println("My instance is null");
//            instance = new Logging();
//        }
//        return instance;
//    }

    public static Logging getInstancess(){ // which can be prevented from multi threading
        if(instance == null){
            // 2 thread at the same time?
            synchronized (Logging.class){
                if(instance == null){
                    System.out.println("My instance is null");
                    instance = new Logging();
                }
            }

        }
        return instance;
    }

    public void printMsg(String msg){
        System.out.println("msg is " +msg);
    }

    public static void main(String[] args) {
        Logging logging = Logging.getInstancess();
        logging.printMsg("My msg is this");

        Logging logging1 = Logging.getInstancess();
        logging1.printMsg("This is my msg 2");
    }



}
