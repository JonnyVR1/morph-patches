package com.google.android.gms.internal.play_billing;

import com.clevertap.android.sdk.Constants;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;
import p153l.plv0;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzes extends AtomicReference implements Runnable {
    private static final Runnable zza = new plv0(null);
    private static final Runnable zzb = new plv0(null);

    private final void zzg(Thread thread) {
        Runnable runnable = (Runnable) get();
        zzep zzepVar = null;
        boolean z = false;
        int i = 0;
        while (true) {
            if (!(runnable instanceof zzep)) {
                if (runnable != zzb) {
                    break;
                }
            } else {
                zzepVar = (zzep) runnable;
            }
            i++;
            if (i > 1000) {
                Runnable runnable2 = zzb;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z = Thread.interrupted() || z;
                    LockSupport.park(zzepVar);
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
            boolean zZzf = zzf();
            if (!zZzf) {
                try {
                    objZza = zza();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(threadCurrentThread, zza)) {
                            zzg(threadCurrentThread);
                        }
                        zzc(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(threadCurrentThread, zza)) {
                            zzg(threadCurrentThread);
                        }
                        zzd(null);
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, zza)) {
                zzg(threadCurrentThread);
            }
            if (zZzf) {
                return;
            }
            zzd(objZza);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == zza) {
            str = "running=[DONE]";
        } else if (runnable instanceof zzep) {
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

    public abstract void zzc(Throwable th);

    public abstract void zzd(Object obj);

    public final void zze() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            zzep zzepVar = new zzep(this, null);
            super/*java.util.concurrent.locks.AbstractOwnableSynchronizer*/.setExclusiveOwnerThread(Thread.currentThread());
            if (compareAndSet(runnable, zzepVar)) {
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

    public abstract boolean zzf();
}
