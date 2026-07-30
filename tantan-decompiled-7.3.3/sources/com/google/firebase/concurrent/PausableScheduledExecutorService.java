package com.google.firebase.concurrent;

import java.util.concurrent.ScheduledExecutorService;
import p153l.zmg0;

/* JADX INFO: loaded from: classes7.dex */
public interface PausableScheduledExecutorService extends ScheduledExecutorService, PausableExecutorService, AutoCloseable {
    @Override // com.google.firebase.concurrent.PausableExecutorService, java.lang.AutoCloseable
    /* synthetic */ default void close() {
        zmg0.m220382a(this);
    }
}
