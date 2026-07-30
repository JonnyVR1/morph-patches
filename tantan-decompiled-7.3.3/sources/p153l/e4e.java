package p153l;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
final class e4e {

    /* JADX INFO: renamed from: a */
    private final Map<String, C16710a> f92090a = new HashMap();

    /* JADX INFO: renamed from: b */
    private final C16711b f92091b = new C16711b();

    /* JADX INFO: renamed from: l.e4e$a */
    public static class C16710a {

        /* JADX INFO: renamed from: a */
        final Lock f92092a = new ReentrantLock();

        /* JADX INFO: renamed from: b */
        int f92093b;
    }

    /* JADX INFO: renamed from: l.e4e$b */
    public static class C16711b {

        /* JADX INFO: renamed from: a */
        private final Queue<C16710a> f92094a = new ArrayDeque();

        /* JADX INFO: renamed from: a */
        public C16710a m119414a() {
            C16710a c16710aPoll;
            synchronized (this.f92094a) {
                c16710aPoll = this.f92094a.poll();
            }
            return c16710aPoll == null ? new C16710a() : c16710aPoll;
        }

        /* JADX INFO: renamed from: b */
        public void m119415b(C16710a c16710a) {
            synchronized (this.f92094a) {
                try {
                    if (this.f92094a.size() < 10) {
                        this.f92094a.offer(c16710a);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m119412a(String str) {
        C16710a c16710aM119414a;
        synchronized (this) {
            try {
                c16710aM119414a = this.f92090a.get(str);
                if (c16710aM119414a == null) {
                    c16710aM119414a = this.f92091b.m119414a();
                    this.f92090a.put(str, c16710aM119414a);
                }
                c16710aM119414a.f92093b++;
            } catch (Throwable th) {
                throw th;
            }
        }
        c16710aM119414a.f92092a.lock();
    }

    /* JADX INFO: renamed from: b */
    public void m119413b(String str) {
        C16710a c16710a;
        synchronized (this) {
            try {
                c16710a = (C16710a) vn80.m201944d(this.f92090a.get(str));
                int i = c16710a.f92093b;
                if (i < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + c16710a.f92093b);
                }
                int i2 = i - 1;
                c16710a.f92093b = i2;
                if (i2 == 0) {
                    C16710a c16710aRemove = this.f92090a.remove(str);
                    if (!c16710aRemove.equals(c16710a)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + c16710a + ", but actually removed: " + c16710aRemove + ", safeKey: " + str);
                    }
                    this.f92091b.m119415b(c16710aRemove);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        c16710a.f92092a.unlock();
    }
}
