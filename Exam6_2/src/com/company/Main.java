package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Lang(), "Java");
        Thread t2 = new Thread(new Lang(), "C#");
        Thread t3 = new Thread(new Lang(), "PHP");
        Thread t4 = new Thread(new Lang(), "JavaScript");
        Thread t5 = new Thread(new Lang(), "Go");
        Thread t6 = new Thread(new Lang(), "Python");

            t1.start();
            t1.join();

            t2.start();
            t2.join();

            t3.start();
            t3.join();

            t4.start();
            t4.join();

            t5.start();
            t5.join();

            t6.start();
    }

}
