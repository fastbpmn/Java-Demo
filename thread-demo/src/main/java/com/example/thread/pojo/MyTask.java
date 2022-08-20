package com.example.thread.pojo;

public class MyTask extends Thread{
    @Override
    public void run() {
        System.out.println("这是一个线程");
    }
}
