package org.dimigo.thread;

/**
 * Created by xeros on 2015. 11. 15..
 */
public class Race2 {
    public static void main(String args[]){
        System.out.println("main thread start");

        Thread t1 = new Thread(new Runner("홍길동"));
        Thread t2 = new Thread(new Runner("홍길순"));

        t1.start();
        t2.start();

        System.out.println("main thread end");
    }
}
