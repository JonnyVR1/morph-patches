package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
final class zzbof implements Thread.UncaughtExceptionHandler {
    public zzbof(zzbpo zzbpoVar) {
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        throw new zzbdq(zzbdo.zze(th).zzg("Uncaught exception in the SynchronizationContext. Re-thrown."), null);
    }
}
