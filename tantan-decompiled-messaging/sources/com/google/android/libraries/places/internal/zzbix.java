package com.google.android.libraries.places.internal;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import p149l.aag0;

/* JADX INFO: loaded from: classes7.dex */
final class zzbix implements zzbql {
    @Override // com.google.android.libraries.places.internal.zzbql
    public final /* bridge */ /* synthetic */ Object zza() {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, zzbjd.zzg("grpc-timer-%d", true));
        try {
            scheduledExecutorServiceNewScheduledThreadPool.getClass().getMethod("setRemoveOnCancelPolicy", Boolean.TYPE).invoke(scheduledExecutorServiceNewScheduledThreadPool, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            aag0.m95543a(e2);
            return null;
        }
        return Executors.unconfigurableScheduledExecutorService(scheduledExecutorServiceNewScheduledThreadPool);
    }

    @Override // com.google.android.libraries.places.internal.zzbql
    public final /* synthetic */ void zzb(Object obj) {
        ((ScheduledExecutorService) obj).shutdown();
    }
}
