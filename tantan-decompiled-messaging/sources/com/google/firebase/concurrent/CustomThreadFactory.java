package com.google.firebase.concurrent;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes7.dex */
class CustomThreadFactory implements ThreadFactory {
    private static final ThreadFactory DEFAULT = Executors.defaultThreadFactory();
    private final String namePrefix;
    private final StrictMode.ThreadPolicy policy;
    private final int priority;
    private final AtomicLong threadCount = new AtomicLong();

    public CustomThreadFactory(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        this.namePrefix = str;
        this.priority = i;
        this.policy = threadPolicy;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m16688a(CustomThreadFactory customThreadFactory, Runnable runnable) {
        Process.setThreadPriority(customThreadFactory.priority);
        StrictMode.ThreadPolicy threadPolicy = customThreadFactory.policy;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        Thread threadNewThread = DEFAULT.newThread(new Runnable() { // from class: com.google.firebase.concurrent.a
            @Override // java.lang.Runnable
            public final void run() {
                CustomThreadFactory.m16688a(this.f11395a, runnable);
            }
        });
        threadNewThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.namePrefix, Long.valueOf(this.threadCount.getAndIncrement())));
        return threadNewThread;
    }
}
