package com.google.firebase.concurrent;

import java.util.concurrent.ScheduledExecutorService;
import p149l.reg0;

/* JADX INFO: loaded from: classes7.dex */
public interface PausableScheduledExecutorService extends ScheduledExecutorService, PausableExecutorService, AutoCloseable {
    @Override // com.google.firebase.concurrent.PausableExecutorService, java.lang.AutoCloseable
    /* synthetic */ default void close() {
        reg0.m179043a(this);
    }
}
