package p153l;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.internal.platform.Platform;
import okio.AsyncTimeout;

/* JADX INFO: loaded from: classes2.dex */
public final class oij0 {

    /* JADX INFO: renamed from: a */
    public final rg50 f147536a;

    /* JADX INFO: renamed from: b */
    public final kmc0 f147537b;

    /* JADX INFO: renamed from: c */
    public final ry3 f147538c;

    /* JADX INFO: renamed from: d */
    public final t4f f147539d;

    /* JADX INFO: renamed from: e */
    public final AsyncTimeout f147540e;

    /* JADX INFO: renamed from: f */
    public Object f147541f;

    /* JADX INFO: renamed from: g */
    public x1d0 f147542g;

    /* JADX INFO: renamed from: h */
    public p6f f147543h;

    /* JADX INFO: renamed from: i */
    public imc0 f147544i;

    /* JADX INFO: renamed from: j */
    public n6f f147545j;

    /* JADX INFO: renamed from: k */
    public boolean f147546k;

    /* JADX INFO: renamed from: l */
    public boolean f147547l;

    /* JADX INFO: renamed from: m */
    public boolean f147548m;

    /* JADX INFO: renamed from: n */
    public boolean f147549n;

    /* JADX INFO: renamed from: o */
    public boolean f147550o;

    /* JADX INFO: renamed from: l.oij0$a */
    public class C19143a extends AsyncTimeout {
        public C19143a() {
        }

        @Override // okio.AsyncTimeout
        public void timedOut() {
            oij0.this.m167779d();
        }
    }

    /* JADX INFO: renamed from: l.oij0$b */
    public static final class C19144b extends WeakReference<oij0> {

        /* JADX INFO: renamed from: a */
        public final Object f147552a;

        public C19144b(oij0 oij0Var, Object obj) {
            super(oij0Var);
            this.f147552a = obj;
        }
    }

    public oij0(rg50 rg50Var, ry3 ry3Var) {
        C19143a c19143a = new C19143a();
        this.f147540e = c19143a;
        this.f147536a = rg50Var;
        this.f147537b = kzm.f129436a.mo152200i(rg50Var.m181347j());
        this.f147538c = ry3Var;
        this.f147539d = rg50Var.m181352o().create(ry3Var);
        c19143a.timeout(rg50Var.m181344d(), TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: a */
    public void m167776a(imc0 imc0Var) {
        if (this.f147544i != null) {
            wpg0.m207458a();
        } else {
            this.f147544i = imc0Var;
            imc0Var.f115767p.add(new C19144b(this, this.f147541f));
        }
    }

    /* JADX INFO: renamed from: b */
    public void m167777b() {
        this.f147541f = Platform.get().getStackTraceForCloseable("response.body().close()");
        this.f147539d.callStart(this.f147538c);
    }

    /* JADX INFO: renamed from: c */
    public boolean m167778c() {
        return this.f147543h.m170863f() && this.f147543h.m170862e();
    }

    /* JADX INFO: renamed from: d */
    public void m167779d() {
        n6f n6fVar;
        imc0 imc0VarM170858a;
        synchronized (this.f147537b) {
            try {
                this.f147548m = true;
                n6fVar = this.f147545j;
                p6f p6fVar = this.f147543h;
                imc0VarM170858a = (p6fVar == null || p6fVar.m170858a() == null) ? this.f147544i : this.f147543h.m170858a();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (n6fVar != null) {
            n6fVar.m161765b();
        } else if (imc0VarM170858a != null) {
            imc0VarM170858a.m140903g();
        }
    }

    /* JADX INFO: renamed from: e */
    public final y80 m167780e(rnl rnlVar) {
        SSLSocketFactory sSLSocketFactoryM181339K;
        HostnameVerifier hostnameVerifierM181355r;
        xq4 xq4VarM181345e;
        if (rnlVar.m182287n()) {
            sSLSocketFactoryM181339K = this.f147536a.m181339K();
            hostnameVerifierM181355r = this.f147536a.m181355r();
            xq4VarM181345e = this.f147536a.m181345e();
        } else {
            sSLSocketFactoryM181339K = null;
            hostnameVerifierM181355r = null;
            xq4VarM181345e = null;
        }
        return new y80(rnlVar.m182286m(), rnlVar.m182291y(), this.f147536a.m181351n(), this.f147536a.m181338G(), sSLSocketFactoryM181339K, hostnameVerifierM181355r, xq4VarM181345e, this.f147536a.m181334B(), this.f147536a.m181333A(), this.f147536a.m181362z(), this.f147536a.m181348k(), this.f147536a.m181335C());
    }

    /* JADX INFO: renamed from: f */
    public void m167781f() {
        synchronized (this.f147537b) {
            try {
                if (this.f147550o) {
                    throw new IllegalStateException();
                }
                this.f147545j = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public IOException m167782g(n6f n6fVar, boolean z, boolean z2, IOException iOException) {
        boolean z3;
        synchronized (this.f147537b) {
            try {
                n6f n6fVar2 = this.f147545j;
                if (n6fVar != n6fVar2) {
                    return iOException;
                }
                boolean z4 = true;
                if (z) {
                    z3 = !this.f147546k;
                    this.f147546k = true;
                } else {
                    z3 = false;
                }
                if (z2) {
                    if (!this.f147547l) {
                        z3 = true;
                    }
                    this.f147547l = true;
                }
                if (this.f147546k && this.f147547l && z3) {
                    n6fVar2.m161766c().f115764m++;
                    this.f147545j = null;
                } else {
                    z4 = false;
                }
                return z4 ? m167785j(iOException, false) : iOException;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean m167783h() {
        boolean z;
        synchronized (this.f147537b) {
            z = this.f147545j != null;
        }
        return z;
    }

    /* JADX INFO: renamed from: i */
    public boolean m167784i() {
        boolean z;
        synchronized (this.f147537b) {
            z = this.f147548m;
        }
        return z;
    }

    /* JADX INFO: renamed from: j */
    public final IOException m167785j(IOException iOException, boolean z) {
        imc0 imc0Var;
        Socket socketM167789n;
        boolean z2;
        synchronized (this.f147537b) {
            if (z) {
                try {
                    if (this.f147545j != null) {
                        throw new IllegalStateException("cannot release connection while it is in use");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            imc0Var = this.f147544i;
            socketM167789n = (imc0Var != null && this.f147545j == null && (z || this.f147550o)) ? m167789n() : null;
            if (this.f147544i != null) {
                imc0Var = null;
            }
            z2 = this.f147550o && this.f147545j == null;
        }
        jj5.m145008b(socketM167789n);
        if (imc0Var != null) {
            this.f147539d.connectionReleased(this.f147538c, imc0Var);
        }
        if (z2) {
            boolean z3 = iOException != null;
            iOException = m167792q(iOException);
            t4f t4fVar = this.f147539d;
            if (z3) {
                t4fVar.callFailed(this.f147538c, iOException);
                return iOException;
            }
            t4fVar.callEnd(this.f147538c);
        }
        return iOException;
    }

    /* JADX INFO: renamed from: k */
    public n6f m167786k(azm.InterfaceC15867a interfaceC15867a, boolean z) throws IOException {
        synchronized (this.f147537b) {
            if (this.f147550o) {
                throw new IllegalStateException("released");
            }
            if (this.f147545j != null) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
            }
        }
        n6f n6fVar = new n6f(this, this.f147538c, this.f147539d, this.f147543h, this.f147543h.m170859b(this.f147536a, interfaceC15867a, z));
        synchronized (this.f147537b) {
            this.f147545j = n6fVar;
            this.f147546k = false;
            this.f147547l = false;
        }
        return n6fVar;
    }

    /* JADX INFO: renamed from: l */
    public IOException m167787l(IOException iOException) {
        synchronized (this.f147537b) {
            this.f147550o = true;
        }
        return m167785j(iOException, false);
    }

    /* JADX INFO: renamed from: m */
    public void m167788m(x1d0 x1d0Var) {
        x1d0 x1d0Var2 = this.f147542g;
        if (x1d0Var2 != null) {
            if (zlk0.m220230D(x1d0Var2.m209026k(), x1d0Var.m209026k()) && this.f147543h.m170862e()) {
                return;
            }
            if (this.f147545j != null) {
                wpg0.m207458a();
                return;
            } else if (this.f147543h != null) {
                m167785j(null, true);
                this.f147543h = null;
            }
        }
        this.f147542g = x1d0Var;
        this.f147543h = new p6f(this, this.f147537b, m167780e(x1d0Var.m209026k()), this.f147538c, this.f147539d);
    }

    /* JADX INFO: renamed from: n */
    public Socket m167789n() {
        int size = this.f147544i.f115767p.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            if (this.f147544i.f115767p.get(i).get() == this) {
                break;
            }
            i++;
        }
        if (i == -1) {
            wpg0.m207458a();
            return null;
        }
        imc0 imc0Var = this.f147544i;
        imc0Var.f115767p.remove(i);
        this.f147544i = null;
        if (imc0Var.f115767p.isEmpty()) {
            imc0Var.f115768q = System.nanoTime();
            if (this.f147537b.m150424d(imc0Var)) {
                return imc0Var.mo106827d();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public void m167790o() {
        if (this.f147549n) {
            wpg0.m207458a();
        } else {
            this.f147549n = true;
            this.f147540e.exit();
        }
    }

    /* JADX INFO: renamed from: p */
    public void m167791p() {
        this.f147540e.enter();
    }

    /* JADX INFO: renamed from: q */
    public final IOException m167792q(IOException iOException) {
        if (this.f147549n || !this.f147540e.exit()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }
}
