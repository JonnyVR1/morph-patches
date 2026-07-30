package com.momo.xeengine.utils;

import androidx.annotation.Keep;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import p149l.upk0;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public class XERenderThreadExecutor implements Executor {
    public static final int NOT_INIT_THREAD_ID = -1;
    private final Queue<Runnable> mEventQueue = new ConcurrentLinkedQueue();
    private long threadID = -1;

    private boolean isInRenderThread() {
        long j = this.threadID;
        return j != -1 && j == Thread.currentThread().getId();
    }

    public void checkRenderThread() {
        if (isInRenderThread()) {
            return;
        }
        upk0.m194883a("渲染线程错误");
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (isInRenderThread()) {
            runnable.run();
        } else {
            this.mEventQueue.add(runnable);
        }
    }

    public void executeQueue() {
        checkRenderThread();
        while (!this.mEventQueue.isEmpty()) {
            Runnable runnablePoll = this.mEventQueue.poll();
            if (runnablePoll != null) {
                runnablePoll.run();
            }
        }
    }

    public void init() {
        if (this.threadID == -1) {
            this.threadID = Thread.currentThread().getId();
        }
    }

    public void release() {
        this.threadID = -1L;
    }
}
