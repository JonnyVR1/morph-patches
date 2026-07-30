package com.google.android.libraries.places.internal;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p153l.m31;

/* JADX INFO: loaded from: classes7.dex */
public final class zzbdw implements Executor {
    private final Thread.UncaughtExceptionHandler zza;
    private final Queue zzb = new ConcurrentLinkedQueue();
    private final AtomicReference zzc = new AtomicReference();

    public zzbdw(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.zza = uncaughtExceptionHandler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        zzc(runnable);
        zzb();
    }

    public final zzbdv zza(Runnable runnable, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzbdt zzbdtVar = new zzbdt(runnable);
        return new zzbdv(zzbdtVar, scheduledExecutorService.schedule(new zzbds(this, zzbdtVar, runnable), j, timeUnit), null);
    }

    public final void zzb() {
        do {
            AtomicReference atomicReference = this.zzc;
            Thread threadCurrentThread = Thread.currentThread();
            while (!m31.m156916a(atomicReference, null, threadCurrentThread)) {
                if (atomicReference.get() != null) {
                    return;
                }
            }
            while (true) {
                try {
                    Runnable runnable = (Runnable) this.zzb.poll();
                    if (runnable == null) {
                        break;
                    }
                    try {
                        runnable.run();
                    } catch (Throwable th) {
                        this.zza.uncaughtException(Thread.currentThread(), th);
                    }
                } catch (Throwable th2) {
                    this.zzc.set(null);
                    throw th2;
                }
            }
            this.zzc.set(null);
        } while (!this.zzb.isEmpty());
    }

    public final void zzc(Runnable runnable) {
        zzmt.zzc(runnable, "runnable is null");
        this.zzb.add(runnable);
    }

    public final void zzd() {
        zzmt.zzp(Thread.currentThread() == this.zzc.get(), "Not called from the SynchronizationContext");
    }
}
