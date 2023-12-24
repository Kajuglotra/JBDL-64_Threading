package org.gfg.singleton;

public class Logging {

    int num;

    private Logging(){
    }
    public static Logging instance;
//    Collections

    public static Logging getInstance(){
        if(instance == null){
            System.out.println("My instance is null");
            instance = new Logging();
        }
        return instance;
    }

    public void printMsg(String msg){
        System.out.println("msg is " +msg);
    }

    public static void main(String[] args) {
        Logging logging = Logging.getInstance();
        logging.printMsg("My msg is this");

        Logging logging1 = Logging.getInstance();
        logging1.printMsg("This is my msg 2");
    }



}
