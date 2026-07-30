package com.facebook.datasource;

import android.util.Pair;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import p153l.i6c;
import p153l.s6c;
import p153l.wn80;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractDataSource<T> implements i6c<T> {

    /* JADX INFO: renamed from: a */
    public Map<String, Object> f6315a;

    /* JADX INFO: renamed from: d */
    public T f6318d = null;

    /* JADX INFO: renamed from: e */
    public Throwable f6319e = null;

    /* JADX INFO: renamed from: f */
    public float f6320f = 0.0f;

    /* JADX INFO: renamed from: c */
    public boolean f6317c = false;

    /* JADX INFO: renamed from: b */
    public DataSourceStatus f6316b = DataSourceStatus.IN_PROGRESS;

    /* JADX INFO: renamed from: g */
    public final ConcurrentLinkedQueue<Pair<s6c<T>, Executor>> f6321g = new ConcurrentLinkedQueue<>();

    public enum DataSourceStatus {
        IN_PROGRESS,
        SUCCESS,
        FAILURE
    }

    /* JADX INFO: renamed from: com.facebook.datasource.AbstractDataSource$a */
    public class RunnableC1615a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f6322a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ s6c f6323b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f6324c;

        public RunnableC1615a(boolean z, s6c s6cVar, boolean z2) {
            this.f6322a = z;
            this.f6323b = s6cVar;
            this.f6324c = z2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f6322a) {
                this.f6323b.mo98345d(AbstractDataSource.this);
                return;
            }
            boolean z = this.f6324c;
            s6c s6cVar = this.f6323b;
            if (z) {
                s6cVar.mo98344c(AbstractDataSource.this);
            } else {
                s6cVar.mo98343b(AbstractDataSource.this);
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.datasource.AbstractDataSource$b */
    public class RunnableC1616b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ s6c f6326a;

        public RunnableC1616b(s6c s6cVar) {
            this.f6326a = s6cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6326a.mo98342a(AbstractDataSource.this);
        }
    }

    /* JADX INFO: renamed from: com.facebook.datasource.AbstractDataSource$c */
    public interface InterfaceC1617c {
    }

    /* JADX INFO: renamed from: h */
    public static InterfaceC1617c m8231h() {
        return null;
    }

    @Override // p153l.i6c
    /* JADX INFO: renamed from: a */
    public synchronized boolean mo8232a() {
        return this.f6318d != null;
    }

    @Override // p153l.i6c
    /* JADX INFO: renamed from: b */
    public synchronized Throwable mo8233b() {
        return this.f6319e;
    }

    @Override // p153l.i6c
    /* JADX INFO: renamed from: c */
    public synchronized float mo8234c() {
        return this.f6320f;
    }

    @Override // p153l.i6c
    public boolean close() {
        synchronized (this) {
            try {
                if (this.f6317c) {
                    return false;
                }
                this.f6317c = true;
                T t = this.f6318d;
                this.f6318d = null;
                if (t != null) {
                    mo8238g(t);
                }
                if (!mo8236e()) {
                    m8242l();
                }
                synchronized (this) {
                    this.f6321g.clear();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.i6c
    /* JADX INFO: renamed from: d */
    public boolean mo8235d() {
        return false;
    }

    @Override // p153l.i6c
    /* JADX INFO: renamed from: e */
    public synchronized boolean mo8236e() {
        return this.f6316b != DataSourceStatus.IN_PROGRESS;
    }

    @Override // p153l.i6c
    /* JADX INFO: renamed from: f */
    public void mo8237f(s6c<T> s6cVar, Executor executor) {
        wn80.m207182g(s6cVar);
        wn80.m207182g(executor);
        synchronized (this) {
            try {
                if (this.f6317c) {
                    return;
                }
                if (this.f6316b == DataSourceStatus.IN_PROGRESS) {
                    this.f6321g.add(Pair.create(s6cVar, executor));
                }
                boolean z = mo8232a() || mo8236e() || m8253w();
                if (z) {
                    m8241k(s6cVar, executor, m8239i(), m8253w());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void mo8238g(T t) {
    }

    @Override // p153l.i6c
    public Map<String, Object> getExtras() {
        return this.f6315a;
    }

    @Override // p153l.i6c
    public synchronized T getResult() {
        return this.f6318d;
    }

    /* JADX INFO: renamed from: i */
    public synchronized boolean m8239i() {
        return this.f6316b == DataSourceStatus.FAILURE;
    }

    /* JADX INFO: renamed from: j */
    public synchronized boolean m8240j() {
        return this.f6317c;
    }

    /* JADX INFO: renamed from: k */
    public void m8241k(s6c<T> s6cVar, Executor executor, boolean z, boolean z2) {
        RunnableC1615a runnableC1615a = new RunnableC1615a(z, s6cVar, z2);
        m8231h();
        executor.execute(runnableC1615a);
    }

    /* JADX INFO: renamed from: l */
    public final void m8242l() {
        boolean zM8239i = m8239i();
        boolean zM8253w = m8253w();
        for (Pair<s6c<T>, Executor> pair : this.f6321g) {
            m8241k((s6c) pair.first, (Executor) pair.second, zM8239i, zM8253w);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m8243m() {
        for (Pair<s6c<T>, Executor> pair : this.f6321g) {
            ((Executor) pair.second).execute(new RunnableC1616b((s6c) pair.first));
        }
    }

    /* JADX INFO: renamed from: n */
    public void m8244n(Map<String, Object> map) {
        this.f6315a = map;
    }

    /* JADX INFO: renamed from: o */
    public boolean mo8245o(Throwable th) {
        return m8246p(th, null);
    }

    /* JADX INFO: renamed from: p */
    public boolean m8246p(Throwable th, Map<String, Object> map) {
        boolean zM8247q = m8247q(th, map);
        if (zM8247q) {
            m8242l();
        }
        return zM8247q;
    }

    /* JADX INFO: renamed from: q */
    public final synchronized boolean m8247q(Throwable th, Map<String, Object> map) {
        if (!this.f6317c && this.f6316b == DataSourceStatus.IN_PROGRESS) {
            this.f6316b = DataSourceStatus.FAILURE;
            this.f6319e = th;
            this.f6315a = map;
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public boolean m8248r(float f) {
        boolean zM8249s = m8249s(f);
        if (zM8249s) {
            m8243m();
        }
        return zM8249s;
    }

    /* JADX INFO: renamed from: s */
    public final synchronized boolean m8249s(float f) {
        if (!this.f6317c && this.f6316b == DataSourceStatus.IN_PROGRESS) {
            if (f < this.f6320f) {
                return false;
            }
            this.f6320f = f;
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: t */
    public boolean m8250t(T t, boolean z) {
        return mo8251u(t, z, null);
    }

    /* JADX INFO: renamed from: u */
    public boolean mo8251u(T t, boolean z, Map<String, Object> map) {
        m8244n(map);
        boolean zM8252v = m8252v(t, z);
        if (zM8252v) {
            m8242l();
        }
        return zM8252v;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0019 -> B:32:0x003a). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: v */
    public final boolean m8252v(T t, boolean z) {
        T t2;
        T t3 = null;
        try {
            synchronized (this) {
                try {
                    try {
                        if (!this.f6317c && this.f6316b == DataSourceStatus.IN_PROGRESS) {
                            if (z) {
                                this.f6316b = DataSourceStatus.SUCCESS;
                                this.f6320f = 1.0f;
                            }
                            T t4 = this.f6318d;
                            if (t4 != t) {
                                try {
                                    this.f6318d = t;
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
                                mo8238g(t2);
                            }
                            return true;
                        }
                        if (t != null) {
                            mo8238g(t);
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
                mo8238g(t3);
            }
            throw th4;
        }
    }

    /* JADX INFO: renamed from: w */
    public final synchronized boolean m8253w() {
        return m8240j() && !mo8236e();
    }
}
