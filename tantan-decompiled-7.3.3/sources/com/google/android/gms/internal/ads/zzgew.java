package com.google.android.gms.internal.ads;

import com.clevertap.android.sdk.Constants;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;
import p153l.eww0;
import p153l.vvw0;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzgew extends AtomicReference implements Runnable {
    private static final Runnable zza = new vvw0(null);
    private static final Runnable zzb = new vvw0(null);

    private final void zzc(Thread thread) {
        Runnable runnable = (Runnable) get();
        zzget zzgetVar = null;
        boolean z = false;
        int i = 0;
        while (true) {
            if (!(runnable instanceof zzget)) {
                if (runnable != zzb) {
                    break;
                }
            } else {
                zzgetVar = (zzget) runnable;
            }
            i++;
            if (i > 1000) {
                Runnable runnable2 = zzb;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z = Thread.interrupted() || z;
                    LockSupport.park(zzgetVar);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objZza = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zZzg = zzg();
            if (!zZzg) {
                try {
                    objZza = zza();
                } catch (Throwable th) {
                    try {
                        eww0.m122993a(th);
                        if (!compareAndSet(threadCurrentThread, zza)) {
                            zzc(threadCurrentThread);
                        }
                        zzd(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(threadCurrentThread, zza)) {
                            zzc(threadCurrentThread);
                        }
                        zze(null);
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, zza)) {
                zzc(threadCurrentThread);
            }
            if (zZzg) {
                return;
            }
            zze(objZza);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == zza) {
            str = "running=[DONE]";
        } else if (runnable instanceof zzget) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + Constants.AES_SUFFIX;
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + zzb();
    }

    public abstract Object zza() throws Exception;

    public abstract String zzb();

    public abstract void zzd(Throwable th);

    public abstract void zze(Object obj);

    public abstract boolean zzg();

    public final void zzh() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            zzget zzgetVar = new zzget(this, null);
            super/*java.util.concurrent.locks.AbstractOwnableSynchronizer*/.setExclusiveOwnerThread(Thread.currentThread());
            if (compareAndSet(runnable, zzgetVar)) {
                try {
                    ((Thread) runnable).interrupt();
                    if (((Runnable) getAndSet(zza)) == zzb) {
                    }
                } finally {
                    if (((Runnable) getAndSet(zza)) == zzb) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }
}
