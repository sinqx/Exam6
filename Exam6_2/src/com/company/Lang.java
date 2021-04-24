package com.company;

public class Lang implements Runnable{
    public Lang() {
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

}
