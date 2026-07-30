package p149l;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.internal.platform.Platform;

/* JADX INFO: loaded from: classes2.dex */
public final class aec0 implements sx3 {

    /* JADX INFO: renamed from: a */
    public final k850 f69026a;

    /* JADX INFO: renamed from: b */
    public k9j0 f69027b;

    /* JADX INFO: renamed from: c */
    public final stc0 f69028c;

    /* JADX INFO: renamed from: d */
    public final boolean f69029d;

    /* JADX INFO: renamed from: e */
    public boolean f69030e;

    /* JADX INFO: renamed from: l.aec0$a */
    public final class C15590a extends y320 {

        /* JADX INFO: renamed from: b */
        public final x74 f69031b;

        /* JADX INFO: renamed from: c */
        public volatile AtomicInteger f69032c;

        public C15590a(x74 x74Var) {
            super("OkHttp %s", aec0.this.m96075e());
            this.f69032c = new AtomicInteger(0);
            this.f69031b = x74Var;
        }

        @Override // p149l.y320
        /* JADX INFO: renamed from: k */
        public void mo96078k() {
            aec0.this.f69027b.m145099p();
            boolean z = false;
            try {
                try {
                    try {
                        this.f69031b.onResponse(aec0.this, aec0.this.m96074c());
                    } catch (IOException e) {
                        e = e;
                        z = true;
                        if (z) {
                            Platform.get().log(4, "Callback failure for " + aec0.this.m96076f(), e);
                        } else {
                            this.f69031b.onFailure(aec0.this, e);
                        }
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        aec0.this.cancel();
                        if (!z) {
                            IOException iOException = new IOException("canceled due to " + th);
                            iOException.addSuppressed(th);
                            this.f69031b.onFailure(aec0.this, iOException);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    aec0.this.f69026a.m144858m().m94837f(this);
                    throw th2;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (Throwable th3) {
                th = th3;
            }
            aec0.this.f69026a.m144858m().m94837f(this);
        }

        /* JADX INFO: renamed from: l */
        public AtomicInteger m96079l() {
            return this.f69032c;
        }

        /* JADX INFO: renamed from: m */
        public void m96080m(ExecutorService executorService) {
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e);
                    aec0.this.f69027b.m145095l(interruptedIOException);
                    this.f69031b.onFailure(aec0.this, interruptedIOException);
                    aec0.this.f69026a.m144858m().m94837f(this);
                }
            } catch (Throwable th) {
                aec0.this.f69026a.m144858m().m94837f(this);
                throw th;
            }
        }

        /* JADX INFO: renamed from: n */
        public aec0 m96081n() {
            return aec0.this;
        }

        /* JADX INFO: renamed from: o */
        public String m96082o() {
            return aec0.this.f69028c.m185881k().m107522m();
        }

        /* JADX INFO: renamed from: p */
        public void m96083p(C15590a c15590a) {
            this.f69032c = c15590a.f69032c;
        }
    }

    public aec0(k850 k850Var, stc0 stc0Var, boolean z) {
        this.f69026a = k850Var;
        this.f69028c = stc0Var;
        this.f69029d = z;
    }

    /* JADX INFO: renamed from: d */
    public static aec0 m96072d(k850 k850Var, stc0 stc0Var, boolean z) {
        aec0 aec0Var = new aec0(k850Var, stc0Var, z);
        aec0Var.f69027b = new k9j0(k850Var, aec0Var);
        return aec0Var;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public aec0 clone() {
        return m96072d(this.f69026a, this.f69028c, this.f69029d);
    }

    /* JADX INFO: renamed from: c */
    public exc0 m96074c() throws IOException {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f69026a.m144864s());
        arrayList.add(new vxc0(this.f69026a));
        arrayList.add(new ye3(this.f69026a.m144857l()));
        arrayList.add(new bx3(this.f69026a.m144865t()));
        arrayList.add(new tv5(this.f69026a));
        if (!this.f69029d) {
            arrayList.addAll(this.f69026a.m144866u());
        }
        arrayList.add(new t44(this.f69029d));
        try {
            try {
                exc0 exc0VarMo99454a = new mec0(arrayList, this.f69027b, null, 0, this.f69028c, this, this.f69026a.m144854f(), this.f69026a.m144844D(), this.f69026a.m144848L()).mo99454a(this.f69028c);
                if (this.f69027b.m145092i()) {
                    tck0.m188006g(exc0VarMo99454a);
                    throw new IOException("Canceled");
                }
                this.f69027b.m145095l(null);
                return exc0VarMo99454a;
            } catch (IOException e) {
                throw this.f69027b.m145095l(e);
            }
        } catch (Throwable th) {
            if (0 == 0) {
                this.f69027b.m145095l(null);
            }
            throw th;
        }
    }

    @Override // p149l.sx3
    public void cancel() {
        this.f69027b.m145087d();
    }

    /* JADX INFO: renamed from: e */
    public String m96075e() {
        return this.f69028c.m185881k().m107512G();
    }

    @Override // p149l.sx3
    public exc0 execute() throws IOException {
        synchronized (this) {
            if (this.f69030e) {
                throw new IllegalStateException("Already Executed");
            }
            this.f69030e = true;
        }
        this.f69027b.m145099p();
        this.f69027b.m145085b();
        try {
            this.f69026a.m144858m().m94833b(this);
            return m96074c();
        } finally {
            this.f69026a.m144858m().m94838g(this);
        }
    }

    /* JADX INFO: renamed from: f */
    public String m96076f() {
        StringBuilder sb = new StringBuilder();
        sb.append(isCanceled() ? "canceled " : "");
        sb.append(this.f69029d ? "web socket" : "call");
        sb.append(" to ");
        sb.append(m96075e());
        return sb.toString();
    }

    @Override // p149l.sx3
    /* JADX INFO: renamed from: h */
    public void mo96077h(x74 x74Var) {
        synchronized (this) {
            if (this.f69030e) {
                throw new IllegalStateException("Already Executed");
            }
            this.f69030e = true;
        }
        this.f69027b.m145085b();
        this.f69026a.m144858m().m94832a(new C15590a(x74Var));
    }

    @Override // p149l.sx3
    public boolean isCanceled() {
        return this.f69027b.m145092i();
    }

    @Override // p149l.sx3
    public synchronized boolean isExecuted() {
        return this.f69030e;
    }

    @Override // p149l.sx3
    public stc0 request() {
        return this.f69028c;
    }
}
