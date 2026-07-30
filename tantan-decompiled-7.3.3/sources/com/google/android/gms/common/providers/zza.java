package com.google.android.gms.common.providers;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import p153l.eix0;

/* JADX INFO: loaded from: classes6.dex */
final class zza implements PooledExecutorsProvider.PooledExecutorFactory {
    @Override // com.google.android.gms.common.providers.PooledExecutorsProvider.PooledExecutorFactory
    public final ScheduledExecutorService newSingleThreadScheduledExecutor() {
        eix0.m120949a();
        return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
    }
}
