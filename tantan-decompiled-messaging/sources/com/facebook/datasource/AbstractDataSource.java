package com.facebook.datasource;

import android.util.Pair;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import p149l.c5c;
import p149l.m5c;
import p149l.rf80;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractDataSource<T> implements c5c<T> {

    /* JADX INFO: renamed from: a */
    public Map<String, Object> f6278a;

    /* JADX INFO: renamed from: d */
    public T f6281d = null;

    /* JADX INFO: renamed from: e */
    public Throwable f6282e = null;

    /* JADX INFO: renamed from: f */
    public float f6283f = 0.0f;

    /* JADX INFO: renamed from: c */
    public boolean f6280c = false;

    /* JADX INFO: renamed from: b */
    public DataSourceStatus f6279b = DataSourceStatus.IN_PROGRESS;

    /* JADX INFO: renamed from: g */
    public final ConcurrentLinkedQueue<Pair<m5c<T>, Executor>> f6284g = new ConcurrentLinkedQueue<>();

    public enum DataSourceStatus {
        IN_PROGRESS,
        SUCCESS,
        FAILURE
    }

    /* JADX INFO: renamed from: com.facebook.datasource.AbstractDataSource$a */
    public class RunnableC1592a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f6285a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ m5c f6286b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f6287c;

        public RunnableC1592a(boolean z, m5c m5cVar, boolean z2) {
            this.f6285a = z;
            this.f6286b = m5cVar;
            this.f6287c = z2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f6285a) {
                this.f6286b.mo153135d(AbstractDataSource.this);
                return;
            }
            boolean z = this.f6287c;
            m5c m5cVar = this.f6286b;
            if (z) {
                m5cVar.mo153134c(AbstractDataSource.this);
            } else {
                m5cVar.mo153133b(AbstractDataSource.this);
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.datasource.AbstractDataSource$b */
    public class RunnableC1593b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ m5c f6289a;

        public RunnableC1593b(m5c m5cVar) {
            this.f6289a = m5cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6289a.mo129617a(AbstractDataSource.this);
        }
    }

    /* JADX INFO: renamed from: com.facebook.datasource.AbstractDataSource$c */
    public interface InterfaceC1594c {
    }

    /* JADX INFO: renamed from: h */
    public static InterfaceC1594c m8177h() {
        return null;
    }

    @Override // p149l.c5c
    /* JADX INFO: renamed from: a */
    public synchronized boolean mo8178a() {
        return this.f6281d != null;
    }

    @Override // p149l.c5c
    /* JADX INFO: renamed from: b */
    public synchronized Throwable mo8179b() {
        return this.f6282e;
    }

    @Override // p149l.c5c
    /* JADX INFO: renamed from: c */
    public synchronized float mo8180c() {
        return this.f6283f;
    }

    @Override // p149l.c5c
    public boolean close() {
        synchronized (this) {
            try {
                if (this.f6280c) {
                    return false;
                }
                this.f6280c = true;
                T t = this.f6281d;
                this.f6281d = null;
                if (t != null) {
                    mo8184g(t);
                }
                if (!mo8182e()) {
                    m8188l();
                }
                synchronized (this) {
                    this.f6284g.clear();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.c5c
    /* JADX INFO: renamed from: d */
    public boolean mo8181d() {
        return false;
    }

    @Override // p149l.c5c
    /* JADX INFO: renamed from: e */
    public synchronized boolean mo8182e() {
        return this.f6279b != DataSourceStatus.IN_PROGRESS;
    }

    @Override // p149l.c5c
    /* JADX INFO: renamed from: f */
    public void mo8183f(m5c<T> m5cVar, Executor executor) {
        rf80.m179116g(m5cVar);
        rf80.m179116g(executor);
        synchronized (this) {
            try {
                if (this.f6280c) {
                    return;
                }
                if (this.f6279b == DataSourceStatus.IN_PROGRESS) {
                    this.f6284g.add(Pair.create(m5cVar, executor));
                }
                boolean z = mo8178a() || mo8182e() || m8199w();
                if (z) {
                    m8187k(m5cVar, executor, m8185i(), m8199w());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void mo8184g(T t) {
    }

    @Override // p149l.c5c
    public Map<String, Object> getExtras() {
        return this.f6278a;
    }

    @Override // p149l.c5c
    public synchronized T getResult() {
        return this.f6281d;
    }

    /* JADX INFO: renamed from: i */
    public synchronized boolean m8185i() {
        return this.f6279b == DataSourceStatus.FAILURE;
    }

    /* JADX INFO: renamed from: j */
    public synchronized boolean m8186j() {
        return this.f6280c;
    }

    /* JADX INFO: renamed from: k */
    public void m8187k(m5c<T> m5cVar, Executor executor, boolean z, boolean z2) {
        RunnableC1592a runnableC1592a = new RunnableC1592a(z, m5cVar, z2);
        m8177h();
        executor.execute(runnableC1592a);
    }

    /* JADX INFO: renamed from: l */
    public final void m8188l() {
        boolean zM8185i = m8185i();
        boolean zM8199w = m8199w();
        for (Pair<m5c<T>, Executor> pair : this.f6284g) {
            m8187k((m5c) pair.first, (Executor) pair.second, zM8185i, zM8199w);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m8189m() {
        for (Pair<m5c<T>, Executor> pair : this.f6284g) {
            ((Executor) pair.second).execute(new RunnableC1593b((m5c) pair.first));
        }
    }

    /* JADX INFO: renamed from: n */
    public void m8190n(Map<String, Object> map) {
        this.f6278a = map;
    }

    /* JADX INFO: renamed from: o */
    public boolean mo8191o(Throwable th) {
        return m8192p(th, null);
    }

    /* JADX INFO: renamed from: p */
    public boolean m8192p(Throwable th, Map<String, Object> map) {
        boolean zM8193q = m8193q(th, map);
        if (zM8193q) {
            m8188l();
        }
        return zM8193q;
    }

    /* JADX INFO: renamed from: q */
    public final synchronized boolean m8193q(Throwable th, Map<String, Object> map) {
        if (!this.f6280c && this.f6279b == DataSourceStatus.IN_PROGRESS) {
            this.f6279b = DataSourceStatus.FAILURE;
            this.f6282e = th;
            this.f6278a = map;
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public boolean m8194r(float f) {
        boolean zM8195s = m8195s(f);
        if (zM8195s) {
            m8189m();
        }
        return zM8195s;
    }

    /* JADX INFO: renamed from: s */
    public final synchronized boolean m8195s(float f) {
        if (!this.f6280c && this.f6279b == DataSourceStatus.IN_PROGRESS) {
            if (f < this.f6283f) {
                return false;
            }
            this.f6283f = f;
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: t */
    public boolean m8196t(T t, boolean z) {
        return mo8197u(t, z, null);
    }

    /* JADX INFO: renamed from: u */
    public boolean mo8197u(T t, boolean z, Map<String, Object> map) {
        m8190n(map);
        boolean zM8198v = m8198v(t, z);
        if (zM8198v) {
            m8188l();
        }
        return zM8198v;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0019 -> B:32:0x003a). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: v */
    public final boolean m8198v(T t, boolean z) {
        T t2;
        T t3 = null;
        try {
            synchronized (this) {
                try {
                    try {
                        if (!this.f6280c && this.f6279b == DataSourceStatus.IN_PROGRESS) {
                            if (z) {
                                this.f6279b = DataSourceStatus.SUCCESS;
                                this.f6283f = 1.0f;
                            }
                            T t4 = this.f6281d;
                            if (t4 != t) {
                                try {
                                    this.f6281d = t;
                                    t2 = t4;
                                } catch (Throwable th) {
                                    th = th;
                                    t3 = t4;
                                    throw th;
                                }
                            } else {
                                t2 = null;
                            }
                            if (t2 != null) {
                                mo8184g(t2);
                            }
                            return true;
                        }
                        if (t != null) {
                            mo8184g(t);
                        }
                        return false;
                    } catch (Throwable th2) {
                        t3 = t;
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            if (t3 != null) {
                mo8184g(t3);
            }
            throw th4;
        }
    }

    /* JADX INFO: renamed from: w */
    public final synchronized boolean m8199w() {
        return m8186j() && !mo8182e();
    }
}
