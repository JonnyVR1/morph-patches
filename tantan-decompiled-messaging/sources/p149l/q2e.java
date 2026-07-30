package p149l;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
final class q2e {

    /* JADX INFO: renamed from: a */
    private final Map<String, C19392a> f152229a = new HashMap();

    /* JADX INFO: renamed from: b */
    private final C19393b f152230b = new C19393b();

    /* JADX INFO: renamed from: l.q2e$a */
    public static class C19392a {

        /* JADX INFO: renamed from: a */
        final Lock f152231a = new ReentrantLock();

        /* JADX INFO: renamed from: b */
        int f152232b;
    }

    /* JADX INFO: renamed from: l.q2e$b */
    public static class C19393b {

        /* JADX INFO: renamed from: a */
        private final Queue<C19392a> f152233a = new ArrayDeque();

        /* JADX INFO: renamed from: a */
        public C19392a m172439a() {
            C19392a c19392aPoll;
            synchronized (this.f152233a) {
                c19392aPoll = this.f152233a.poll();
            }
            return c19392aPoll == null ? new C19392a() : c19392aPoll;
        }

        /* JADX INFO: renamed from: b */
        public void m172440b(C19392a c19392a) {
            synchronized (this.f152233a) {
                try {
                    if (this.f152233a.size() < 10) {
                        this.f152233a.offer(c19392a);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m172437a(String str) {
        C19392a c19392aM172439a;
        synchronized (this) {
            try {
                c19392aM172439a = this.f152229a.get(str);
                if (c19392aM172439a == null) {
                    c19392aM172439a = this.f152230b.m172439a();
                    this.f152229a.put(str, c19392aM172439a);
                }
                c19392aM172439a.f152232b++;
            } catch (Throwable th) {
                throw th;
            }
        }
        c19392aM172439a.f152231a.lock();
    }

    /* JADX INFO: renamed from: b */
    public void m172438b(String str) {
        C19392a c19392a;
        synchronized (this) {
            try {
                c19392a = (C19392a) qf80.m174276d(this.f152229a.get(str));
                int i = c19392a.f152232b;
                if (i < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + c19392a.f152232b);
                }
                int i2 = i - 1;
                c19392a.f152232b = i2;
                if (i2 == 0) {
                    C19392a c19392aRemove = this.f152229a.remove(str);
                    if (!c19392aRemove.equals(c19392a)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + c19392a + ", but actually removed: " + c19392aRemove + ", safeKey: " + str);
                    }
                    this.f152230b.m172440b(c19392aRemove);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        c19392a.f152231a.unlock();
    }
}
