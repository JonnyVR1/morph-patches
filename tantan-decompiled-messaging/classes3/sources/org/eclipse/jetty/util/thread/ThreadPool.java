package org.eclipse.jetty.util.thread;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface ThreadPool {

    public interface SizedThreadPool extends ThreadPool {
        int getMaxThreads();

        int getMinThreads();

        void setMaxThreads(int i);

        void setMinThreads(int i);
    }

    boolean dispatch(Runnable runnable);

    int getIdleThreads();

    int getThreads();

    boolean isLowOnThreads();

    void join() throws InterruptedException;
}
