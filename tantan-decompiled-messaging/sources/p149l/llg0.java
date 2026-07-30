package p149l;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
public final class llg0 {

    /* JADX INFO: renamed from: c */
    public static final long f128704c = 100000000;

    /* JADX INFO: renamed from: a */
    public final HashMap f128705a;

    /* JADX INFO: renamed from: b */
    public final HashMap f128706b;

    public llg0() {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        this.f128705a = map;
        this.f128706b = map2;
    }

    /* JADX INFO: renamed from: a */
    public final void m150480a(String str) {
        AtomicInteger atomicInteger;
        Thread thread;
        synchronized (this.f128705a) {
            atomicInteger = (AtomicInteger) this.f128705a.get(str);
        }
        if (atomicInteger == null || atomicInteger.decrementAndGet() != 0) {
            return;
        }
        synchronized (this.f128706b) {
            try {
                thread = (Thread) this.f128706b.get(str);
                if (thread != null) {
                    this.f128706b.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (thread != null) {
            atomicInteger.toString();
            LockSupport.unpark(thread);
        }
        synchronized (this.f128705a) {
            this.f128705a.remove(str);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m150481b(String str) {
        AtomicInteger atomicInteger;
        synchronized (this.f128705a) {
            atomicInteger = (AtomicInteger) this.f128705a.get(str);
        }
        if (atomicInteger == null || atomicInteger.get() <= 0) {
            return;
        }
        synchronized (this.f128706b) {
            this.f128706b.put(str, Thread.currentThread());
        }
        while (atomicInteger.get() > 0) {
            LockSupport.park(Long.valueOf(f128704c));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m150482c(String str) {
        AtomicInteger atomicInteger;
        synchronized (this.f128705a) {
            atomicInteger = (AtomicInteger) this.f128705a.get(str);
        }
        if (atomicInteger == null) {
            atomicInteger = new AtomicInteger(0);
            synchronized (this.f128705a) {
                this.f128705a.put(str, atomicInteger);
            }
        }
        atomicInteger.incrementAndGet();
    }
}
