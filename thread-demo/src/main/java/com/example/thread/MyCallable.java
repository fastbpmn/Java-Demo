package com.example.thread;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    private Long waitTime;

    public MyCallable(Long timeInMillis) {
        this.waitTime = timeInMillis;
    }
    @Override
    public String call() throws Exception {
        Thread.sleep(waitTime);
        return Thread.currentThread().getName();
    }
}
