package com.tantanapp.media.ttmediautils.task;

/* JADX INFO: loaded from: classes13.dex */
public class TaskManager {
    public static void startRunnableRequestInPool(Runnable runnable, int i) {
        RunnablePool.getInstance().addTaskIntoPool(runnable, i);
    }

    public static void startThread(Runnable runnable, String str) {
        RunnablePool.getInstance().startThread(runnable, str);
    }

    public static void startRunnableRequestInPool(NamedRunnable namedRunnable, int i) {
        RunnablePool.getInstance().addTaskIntoPool(namedRunnable, i);
    }
}
