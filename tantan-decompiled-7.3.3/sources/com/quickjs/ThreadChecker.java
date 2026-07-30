package com.quickjs;

/* JADX INFO: loaded from: classes10.dex */
class ThreadChecker {
    private boolean released;
    private QuickJS runtime;
    private Thread thread;

    public ThreadChecker(QuickJS quickJS) {
        this.runtime = quickJS;
        acquire();
    }

    public synchronized void acquire() {
        try {
            Thread thread = this.thread;
            if (thread != null && thread != Thread.currentThread()) {
                throw new Error("All QuickJS methods must be called on the same thread. Invalid QuickJS thread access: current thread is " + Thread.currentThread() + " while the locker has thread " + this.thread);
            }
            if (this.thread != Thread.currentThread()) {
                this.thread = Thread.currentThread();
                this.released = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void checkThread() {
        if (this.released && this.thread == null) {
            throw new Error("Invalid QuickJS thread access: the locker has been released!");
        }
        if (this.thread == Thread.currentThread()) {
            return;
        }
        StringBuilder sb = new StringBuilder("All QuickJS methods must be called on the same thread. Invalid QuickJS thread access: current thread is ");
        sb.append(Thread.currentThread());
        Thread thread = this.thread;
        sb.append(" while the locker has thread ");
        sb.append(thread);
        throw new Error(sb.toString());
    }
}
