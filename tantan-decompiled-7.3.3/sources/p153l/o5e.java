package p153l;

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
public final class o5e {

    /* JADX INFO: renamed from: c */
    public Runnable f145058c;

    /* JADX INFO: renamed from: d */
    public ExecutorService f145059d;

    /* JADX INFO: renamed from: a */
    public int f145056a = 64;

    /* JADX INFO: renamed from: b */
    public int f145057b = 5;

    /* JADX INFO: renamed from: e */
    public final Deque<hmc0.C17508a> f145060e = new ArrayDeque();

    /* JADX INFO: renamed from: f */
    public final Deque<hmc0.C17508a> f145061f = new ArrayDeque();

    /* JADX INFO: renamed from: g */
    public final Deque<hmc0> f145062g = new ArrayDeque();

    /* JADX INFO: renamed from: a */
    public void m166108a(hmc0.C17508a c17508a) {
        hmc0.C17508a c17508aM166111d;
        synchronized (this) {
            try {
                this.f145060e.add(c17508a);
                if (!c17508a.m135843n().f110617d && (c17508aM166111d = m166111d(c17508a.m135844o())) != null) {
                    c17508a.m135845p(c17508aM166111d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        m166115h();
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m166109b(hmc0 hmc0Var) {
        this.f145062g.add(hmc0Var);
    }

    /* JADX INFO: renamed from: c */
    public synchronized ExecutorService m166110c() {
        try {
            if (this.f145059d == null) {
                this.f145059d = new ThreadPoolExecutor(0, Api.BaseClientBuilder.API_PRIORITY_OTHER, 60L, TimeUnit.SECONDS, new SynchronousQueue(), zlk0.m220234H("OkHttp Dispatcher", false));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f145059d;
    }

    /* JADX INFO: renamed from: d */
    public final hmc0.C17508a m166111d(String str) {
        for (hmc0.C17508a c17508a : this.f145061f) {
            if (c17508a.m135844o().equals(str)) {
                return c17508a;
            }
        }
        for (hmc0.C17508a c17508a2 : this.f145060e) {
            if (c17508a2.m135844o().equals(str)) {
                return c17508a2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final <T> void m166112e(Deque<T> deque, T t) {
        Runnable runnable;
        synchronized (this) {
            if (!deque.remove(t)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnable = this.f145058c;
        }
        if (m166115h() || runnable == null) {
            return;
        }
        runnable.run();
    }

    /* JADX INFO: renamed from: f */
    public void m166113f(hmc0.C17508a c17508a) {
        c17508a.m135841l().decrementAndGet();
        m166112e(this.f145061f, c17508a);
    }

    /* JADX INFO: renamed from: g */
    public void m166114g(hmc0 hmc0Var) {
        m166112e(this.f145062g, hmc0Var);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m166115h() {
        int i;
        boolean z;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator<hmc0.C17508a> it = this.f145060e.iterator();
                while (it.hasNext()) {
                    hmc0.C17508a next = it.next();
                    if (this.f145061f.size() >= this.f145056a) {
                        break;
                    }
                    if (next.m135841l().get() < this.f145057b) {
                        it.remove();
                        next.m135841l().incrementAndGet();
                        arrayList.add(next);
                        this.f145061f.add(next);
                    }
                }
                z = m166116i() > 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((hmc0.C17508a) arrayList.get(i)).m135842m(m166110c());
        }
        return z;
    }

    /* JADX INFO: renamed from: i */
    public synchronized int m166116i() {
        return this.f145061f.size() + this.f145062g.size();
    }

    /* JADX INFO: renamed from: j */
    public void m166117j(int i) {
        if (i < 1) {
            za50.m219101a("max < 1: ", i);
            return;
        }
        synchronized (this) {
            this.f145056a = i;
        }
        m166115h();
    }

    /* JADX INFO: renamed from: k */
    public void m166118k(int i) {
        if (i < 1) {
            za50.m219101a("max < 1: ", i);
            return;
        }
        synchronized (this) {
            this.f145057b = i;
        }
        m166115h();
    }
}
