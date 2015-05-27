package com.imooc.concurrent;

/**
 * Created by William on 2015/5/28.
 */
public class Actor extends Thread{

    public void run(){
        //System.out.println(getName()+"是一个演员!");
        int count = 0;
        boolean keepRunning = true;
        while(keepRunning){
            System.out.println(getName()+"登台演出:"+(++count));
            if(count == 100){
                keepRunning =false;
            }


            if(count%10 == 0){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }



        System.out.println(getName()+"的演出结束了!");
    }

    public static void main(String[] args) {
        Thread actor = new Actor();
        actor.setName("Mr.Thread");

        actor.start();

        Thread actressThread = new Thread(new Actress(), "Ms.Runnable");
        actressThread.start();
    }


}


class Actress implements Runnable{

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName()+"是一个演员!");
        int count = 0;
        boolean keepRunning = true;
        while(keepRunning){
            System.out.println(Thread.currentThread().getName()+"登台演出:"+(++count));
            if(count == 100){
                keepRunning =false;
            }


            if(count%10 == 0){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }



        System.out.println(Thread.currentThread().getName()+"的演出结束了!");

    }
}
