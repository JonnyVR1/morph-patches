package p153l;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
public final class ttg0 {

    /* JADX INFO: renamed from: c */
    public static final long f176071c = 100000000;

    /* JADX INFO: renamed from: a */
    public final HashMap f176072a;

    /* JADX INFO: renamed from: b */
    public final HashMap f176073b;

    public ttg0() {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        this.f176072a = map;
        this.f176073b = map2;
    }

    /* JADX INFO: renamed from: a */
    public final void m192667a(String str) {
        AtomicInteger atomicInteger;
        Thread thread;
        synchronized (this.f176072a) {
            atomicInteger = (AtomicInteger) this.f176072a.get(str);
        }
        if (atomicInteger == null || atomicInteger.decrementAndGet() != 0) {
            return;
        }
        synchronized (this.f176073b) {
            try {
                thread = (Thread) this.f176073b.get(str);
                if (thread != null) {
                    this.f176073b.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (thread != null) {
            atomicInteger.toString();
            LockSupport.unpark(thread);
        }
        synchronized (this.f176072a) {
            this.f176072a.remove(str);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m192668b(String str) {
        AtomicInteger atomicInteger;
        synchronized (this.f176072a) {
            atomicInteger = (AtomicInteger) this.f176072a.get(str);
        }
        if (atomicInteger == null || atomicInteger.get() <= 0) {
            return;
        }
        synchronized (this.f176073b) {
            this.f176073b.put(str, Thread.currentThread());
        }
        while (atomicInteger.get() > 0) {
            LockSupport.park(Long.valueOf(f176071c));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m192669c(String str) {
        AtomicInteger atomicInteger;
        synchronized (this.f176072a) {
            atomicInteger = (AtomicInteger) this.f176072a.get(str);
        }
        if (atomicInteger == null) {
            atomicInteger = new AtomicInteger(0);
            synchronized (this.f176072a) {
                this.f176072a.put(str, atomicInteger);
            }
        }
        atomicInteger.incrementAndGet();
    }
}
