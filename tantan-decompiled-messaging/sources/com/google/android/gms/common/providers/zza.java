package com.google.android.gms.common.providers;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import p149l.y8x0;

/* JADX INFO: loaded from: classes6.dex */
final class zza implements PooledExecutorsProvider.PooledExecutorFactory {
    @Override // com.google.android.gms.common.providers.PooledExecutorsProvider.PooledExecutorFactory
    public final ScheduledExecutorService newSingleThreadScheduledExecutor() {
        y8x0.m213517a();
        return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
    }
}
