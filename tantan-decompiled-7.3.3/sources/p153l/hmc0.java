package p153l;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.internal.platform.Platform;

/* JADX INFO: loaded from: classes2.dex */
public final class hmc0 implements ry3 {

    /* JADX INFO: renamed from: a */
    public final rg50 f110614a;

    /* JADX INFO: renamed from: b */
    public oij0 f110615b;

    /* JADX INFO: renamed from: c */
    public final x1d0 f110616c;

    /* JADX INFO: renamed from: d */
    public final boolean f110617d;

    /* JADX INFO: renamed from: e */
    public boolean f110618e;

    /* JADX INFO: renamed from: l.hmc0$a */
    public final class C17508a extends gc20 {

        /* JADX INFO: renamed from: b */
        public final w84 f110619b;

        /* JADX INFO: renamed from: c */
        public volatile AtomicInteger f110620c;

        public C17508a(w84 w84Var) {
            super("OkHttp %s", hmc0.this.m135838e());
            this.f110620c = new AtomicInteger(0);
            this.f110619b = w84Var;
        }

        @Override // p153l.gc20
        /* JADX INFO: renamed from: k */
        public void mo117004k() {
            hmc0.this.f110615b.m167791p();
            boolean z = false;
            try {
                try {
                    try {
                        this.f110619b.onResponse(hmc0.this, hmc0.this.m135837c());
                    } catch (IOException e) {
                        e = e;
                        z = true;
                        if (z) {
                            Platform.get().log(4, "Callback failure for " + hmc0.this.m135839f(), e);
                        } else {
                            this.f110619b.onFailure(hmc0.this, e);
                        }
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        hmc0.this.cancel();
                        if (!z) {
                            IOException iOException = new IOException("canceled due to " + th);
                            iOException.addSuppressed(th);
                            this.f110619b.onFailure(hmc0.this, iOException);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    hmc0.this.f110614a.m181350m().m166113f(this);
                    throw th2;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (Throwable th3) {
                th = th3;
            }
            hmc0.this.f110614a.m181350m().m166113f(this);
        }

        /* JADX INFO: renamed from: l */
        public AtomicInteger m135841l() {
            return this.f110620c;
        }

        /* JADX INFO: renamed from: m */
        public void m135842m(ExecutorService executorService) {
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e);
                    hmc0.this.f110615b.m167787l(interruptedIOException);
                    this.f110619b.onFailure(hmc0.this, interruptedIOException);
                    hmc0.this.f110614a.m181350m().m166113f(this);
                }
            } catch (Throwable th) {
                hmc0.this.f110614a.m181350m().m166113f(this);
                throw th;
            }
        }

        /* JADX INFO: renamed from: n */
        public hmc0 m135843n() {
            return hmc0.this;
        }

        /* JADX INFO: renamed from: o */
        public String m135844o() {
            return hmc0.this.f110616c.m209026k().m182286m();
        }

        /* JADX INFO: renamed from: p */
        public void m135845p(C17508a c17508a) {
            this.f110620c = c17508a.f110620c;
        }
    }

    public hmc0(rg50 rg50Var, x1d0 x1d0Var, boolean z) {
        this.f110614a = rg50Var;
        this.f110616c = x1d0Var;
        this.f110617d = z;
    }

    /* JADX INFO: renamed from: d */
    public static hmc0 m135835d(rg50 rg50Var, x1d0 x1d0Var, boolean z) {
        hmc0 hmc0Var = new hmc0(rg50Var, x1d0Var, z);
        hmc0Var.f110615b = new oij0(rg50Var, hmc0Var);
        return hmc0Var;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public hmc0 clone() {
        return m135835d(this.f110614a, this.f110616c, this.f110617d);
    }

    /* JADX INFO: renamed from: c */
    public i5d0 m135837c() throws IOException {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f110614a.m181356s());
        arrayList.add(new y5d0(this.f110614a));
        arrayList.add(new nf3(this.f110614a.m181349l()));
        arrayList.add(new ay3(this.f110614a.m181357t()));
        arrayList.add(new yw5(this.f110614a));
        if (!this.f110617d) {
            arrayList.addAll(this.f110614a.m181358u());
        }
        arrayList.add(new s54(this.f110617d));
        try {
            try {
                i5d0 i5d0VarMo101076a = new tmc0(arrayList, this.f110615b, null, 0, this.f110616c, this, this.f110614a.m181346f(), this.f110614a.m181336D(), this.f110614a.m181340L()).mo101076a(this.f110616c);
                if (this.f110615b.m167784i()) {
                    zlk0.m220245g(i5d0VarMo101076a);
                    throw new IOException("Canceled");
                }
                this.f110615b.m167787l(null);
                return i5d0VarMo101076a;
            } catch (IOException e) {
                throw this.f110615b.m167787l(e);
            }
        } catch (Throwable th) {
            if (0 == 0) {
                this.f110615b.m167787l(null);
            }
            throw th;
        }
    }

    @Override // p153l.ry3
    public void cancel() {
        this.f110615b.m167779d();
    }

    /* JADX INFO: renamed from: e */
    public String m135838e() {
        return this.f110616c.m209026k().m182276G();
    }

    @Override // p153l.ry3
    public i5d0 execute() throws IOException {
        synchronized (this) {
            if (this.f110618e) {
                throw new IllegalStateException("Already Executed");
            }
            this.f110618e = true;
        }
        this.f110615b.m167791p();
        this.f110615b.m167777b();
        try {
            this.f110614a.m181350m().m166109b(this);
            return m135837c();
        } finally {
            this.f110614a.m181350m().m166114g(this);
        }
    }

    /* JADX INFO: renamed from: f */
    public String m135839f() {
        StringBuilder sb = new StringBuilder();
        sb.append(isCanceled() ? "canceled " : "");
        sb.append(this.f110617d ? "web socket" : "call");
        sb.append(" to ");
        sb.append(m135838e());
        return sb.toString();
    }

    @Override // p153l.ry3
    /* JADX INFO: renamed from: h */
    public void mo135840h(w84 w84Var) {
        synchronized (this) {
            if (this.f110618e) {
                throw new IllegalStateException("Already Executed");
            }
            this.f110618e = true;
        }
        this.f110615b.m167777b();
        this.f110614a.m181350m().m166108a(new C17508a(w84Var));
    }

    @Override // p153l.ry3
    public boolean isCanceled() {
        return this.f110615b.m167784i();
    }

    @Override // p153l.ry3
    public synchronized boolean isExecuted() {
        return this.f110618e;
    }

    @Override // p153l.ry3
    public x1d0 request() {
        return this.f110616c;
    }
}
