package com.example.thread;

import com.example.thread.pojo.MyTask;
import com.example.thread.pojo.MyTask2;

public class ThreadDemo {
    public static void main(String[] args) {
        Thread thread = new MyTask();
        thread.start();

        Runnable thread2 = new MyTask2();
        thread2.run();
    }
}
