package com.tantanapp.media.ttmediautils.task;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public class MyThreadFactory implements ThreadFactory {
    private final AtomicInteger mCount = new AtomicInteger(1);
    private String mThreadPoolName;

    public MyThreadFactory(String str) {
        this.mThreadPoolName = str;
    }

    public String getThreadPoolName() {
        return this.mThreadPoolName;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        return RunnablePool.getInstance().getThread(runnable, this.mThreadPoolName + "#" + this.mCount.getAndIncrement());
    }
}
