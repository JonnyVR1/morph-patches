package p149l;

import com.google.android.gms.common.api.Api;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class a4e {

    /* JADX INFO: renamed from: c */
    public Runnable f67498c;

    /* JADX INFO: renamed from: d */
    public ExecutorService f67499d;

    /* JADX INFO: renamed from: a */
    public int f67496a = 64;

    /* JADX INFO: renamed from: b */
    public int f67497b = 5;

    /* JADX INFO: renamed from: e */
    public final Deque<aec0.C15590a> f67500e = new ArrayDeque();

    /* JADX INFO: renamed from: f */
    public final Deque<aec0.C15590a> f67501f = new ArrayDeque();

    /* JADX INFO: renamed from: g */
    public final Deque<aec0> f67502g = new ArrayDeque();

    /* JADX INFO: renamed from: a */
    public void m94832a(aec0.C15590a c15590a) {
        aec0.C15590a c15590aM94835d;
        synchronized (this) {
            try {
                this.f67500e.add(c15590a);
                if (!c15590a.m96081n().f69029d && (c15590aM94835d = m94835d(c15590a.m96082o())) != null) {
                    c15590a.m96083p(c15590aM94835d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        m94839h();
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m94833b(aec0 aec0Var) {
        this.f67502g.add(aec0Var);
    }

    /* JADX INFO: renamed from: c */
    public synchronized ExecutorService m94834c() {
        try {
            if (this.f67499d == null) {
                this.f67499d = new ThreadPoolExecutor(0, Api.BaseClientBuilder.API_PRIORITY_OTHER, 60L, TimeUnit.SECONDS, new SynchronousQueue(), tck0.m187995H("OkHttp Dispatcher", false));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f67499d;
    }

    /* JADX INFO: renamed from: d */
    public final aec0.C15590a m94835d(String str) {
        for (aec0.C15590a c15590a : this.f67501f) {
            if (c15590a.m96082o().equals(str)) {
                return c15590a;
            }
        }
        for (aec0.C15590a c15590a2 : this.f67500e) {
            if (c15590a2.m96082o().equals(str)) {
                return c15590a2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final <T> void m94836e(Deque<T> deque, T t) {
        Runnable runnable;
        synchronized (this) {
            if (!deque.remove(t)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnable = this.f67498c;
        }
        if (m94839h() || runnable == null) {
            return;
        }
        runnable.run();
    }

    /* JADX INFO: renamed from: f */
    public void m94837f(aec0.C15590a c15590a) {
        c15590a.m96079l().decrementAndGet();
        m94836e(this.f67501f, c15590a);
    }

    /* JADX INFO: renamed from: g */
    public void m94838g(aec0 aec0Var) {
        m94836e(this.f67502g, aec0Var);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m94839h() {
        int i;
        boolean z;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator<aec0.C15590a> it = this.f67500e.iterator();
                while (it.hasNext()) {
                    aec0.C15590a next = it.next();
                    if (this.f67501f.size() >= this.f67496a) {
                        break;
                    }
                    if (next.m96079l().get() < this.f67497b) {
                        it.remove();
                        next.m96079l().incrementAndGet();
                        arrayList.add(next);
                        this.f67501f.add(next);
                    }
                }
                z = m94840i() > 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((aec0.C15590a) arrayList.get(i)).m96080m(m94834c());
        }
        return z;
    }

    /* JADX INFO: renamed from: i */
    public synchronized int m94840i() {
        return this.f67501f.size() + this.f67502g.size();
    }

    /* JADX INFO: renamed from: j */
    public void m94841j(int i) {
        if (i < 1) {
            k250.m144273a("max < 1: ", i);
            return;
        }
        synchronized (this) {
            this.f67496a = i;
        }
        m94839h();
    }

    /* JADX INFO: renamed from: k */
    public void m94842k(int i) {
        if (i < 1) {
            k250.m144273a("max < 1: ", i);
            return;
        }
        synchronized (this) {
            this.f67497b = i;
        }
        m94839h();
    }
}
