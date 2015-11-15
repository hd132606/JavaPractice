package org.dimigo.thread;

/**
 * Created by xeros on 2015. 11. 15..
 */
public class Runner extends Thread {
    private String name;

    public Runner(){
    }

    public Runner(String name){
        this.name = name;
    }

    public void run(){
        System.out.println(this.name + " 출발");

        for(int movement = 100; movement>=0; movement-=10){
            System.out.println(this.name + " " + movement + "미터");
        }
        System.out.println(this.name+" 골인");
    }
}
