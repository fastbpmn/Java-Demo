package com.example.thread.pojo;

public class MyTask2 implements Runnable{
    @Override
    public void run() {
        System.out.println("实现Runnable接口的线程");
    }
}
