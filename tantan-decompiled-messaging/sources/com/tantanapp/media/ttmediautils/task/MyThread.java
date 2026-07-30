package com.tantanapp.media.ttmediautils.task;

import com.tantanapp.media.ttmediautils.log.SLog;

/* JADX INFO: loaded from: classes13.dex */
public class MyThread extends Thread {
    public MyThread(ThreadGroup threadGroup, Runnable runnable, String str) {
        super(threadGroup, runnable, str);
        SLog.m81406d("MyThread", "create MyThread name:" + str);
    }

    private MyThread(Runnable runnable) {
        super(runnable);
    }

    private MyThread(ThreadGroup threadGroup, Runnable runnable) {
        super(threadGroup, runnable);
    }

    public MyThread(Runnable runnable, String str) {
        super(runnable, str);
    }

    public MyThread(String str) {
        super(str);
    }

    private MyThread() {
    }

    public MyThread(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }

    public MyThread(ThreadGroup threadGroup, Runnable runnable, String str, long j) {
        super(threadGroup, runnable, str, j);
    }
}
