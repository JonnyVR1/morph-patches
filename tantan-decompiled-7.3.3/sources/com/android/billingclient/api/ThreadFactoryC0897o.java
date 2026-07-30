package com.android.billingclient.api;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.android.billingclient.api.o */
/* JADX INFO: loaded from: classes.dex */
final class ThreadFactoryC0897o implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    private final ThreadFactory f4093a = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: b */
    private final AtomicInteger f4094b = new AtomicInteger(1);

    public ThreadFactoryC0897o(C0871b c0871b) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        AtomicInteger atomicInteger = this.f4094b;
        Thread threadNewThread = this.f4093a.newThread(runnable);
        threadNewThread.setName("PlayBillingLibrary-" + atomicInteger.getAndIncrement());
        return threadNewThread;
    }
}
