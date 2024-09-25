package com.example;

public class Main {
    public static void main(String[] args) {
        int l =100;
        MyThread t1 = new MyThread(l);
        MyThread t2 = new MyThread(l);
        new Thread(t1).start();
        new Thread(t2).start();
    //  t1.start();
    //  t2.start();
        System.out.println("Hello world!");

     //   for(int i=0; i<100 ;i++){
     //       System.out.println(Thread.currentThread().getName() + ": " + i);
     //   }
    }
}
    