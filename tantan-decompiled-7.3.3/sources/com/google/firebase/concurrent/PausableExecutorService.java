package com.google.firebase.concurrent;

import java.util.concurrent.ExecutorService;
import p153l.zmg0;

/* JADX INFO: loaded from: classes7.dex */
public interface PausableExecutorService extends ExecutorService, PausableExecutor, AutoCloseable {
    @Override // java.lang.AutoCloseable
    /* synthetic */ default void close() {
        zmg0.m220382a(this);
    }
}
