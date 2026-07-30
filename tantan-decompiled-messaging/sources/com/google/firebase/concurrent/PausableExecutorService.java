package com.google.firebase.concurrent;

import java.util.concurrent.ExecutorService;
import p149l.reg0;

/* JADX INFO: loaded from: classes7.dex */
public interface PausableExecutorService extends ExecutorService, PausableExecutor, AutoCloseable {
    @Override // java.lang.AutoCloseable
    /* synthetic */ default void close() {
        reg0.m179043a(this);
    }
}
