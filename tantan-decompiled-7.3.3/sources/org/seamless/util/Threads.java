package org.seamless.util;

import java.lang.management.ManagementFactory;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class Threads {
    public static Thread[] getAllThreads() {
        Thread[] threadArr;
        int iEnumerate;
        ThreadGroup rootThreadGroup = getRootThreadGroup();
        int threadCount = ManagementFactory.getThreadMXBean().getThreadCount();
        do {
            threadCount *= 2;
            threadArr = new Thread[threadCount];
            iEnumerate = rootThreadGroup.enumerate(threadArr, true);
        } while (iEnumerate == threadCount);
        return (Thread[]) Arrays.copyOf(threadArr, iEnumerate);
    }

    public static ThreadGroup getRootThreadGroup() {
        ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
        while (true) {
            ThreadGroup parent = threadGroup.getParent();
            if (parent == null) {
                return threadGroup;
            }
            threadGroup = parent;
        }
    }

    public static Thread getThread(long j) {
        for (Thread thread : getAllThreads()) {
            if (thread.getId() == j) {
                return thread;
            }
        }
        return null;
    }
}
