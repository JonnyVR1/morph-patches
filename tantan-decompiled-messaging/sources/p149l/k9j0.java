package p149l;

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
public final class k9j0 {

    /* JADX INFO: renamed from: a */
    public final k850 f122030a;

    /* JADX INFO: renamed from: b */
    public final dec0 f122031b;

    /* JADX INFO: renamed from: c */
    public final sx3 f122032c;

    /* JADX INFO: renamed from: d */
    public final o3f f122033d;

    /* JADX INFO: renamed from: e */
    public final AsyncTimeout f122034e;

    /* JADX INFO: renamed from: f */
    public Object f122035f;

    /* JADX INFO: renamed from: g */
    public stc0 f122036g;

    /* JADX INFO: renamed from: h */
    public l5f f122037h;

    /* JADX INFO: renamed from: i */
    public bec0 f122038i;

    /* JADX INFO: renamed from: j */
    public j5f f122039j;

    /* JADX INFO: renamed from: k */
    public boolean f122040k;

    /* JADX INFO: renamed from: l */
    public boolean f122041l;

    /* JADX INFO: renamed from: m */
    public boolean f122042m;

    /* JADX INFO: renamed from: n */
    public boolean f122043n;

    /* JADX INFO: renamed from: o */
    public boolean f122044o;

    /* JADX INFO: renamed from: l.k9j0$a */
    public class C17961a extends AsyncTimeout {
        public C17961a() {
        }

        @Override // okio.AsyncTimeout
        public void timedOut() {
            k9j0.this.m145087d();
        }
    }

    /* JADX INFO: renamed from: l.k9j0$b */
    public static final class C17962b extends WeakReference<k9j0> {

        /* JADX INFO: renamed from: a */
        public final Object f122046a;

        public C17962b(k9j0 k9j0Var, Object obj) {
            super(k9j0Var);
            this.f122046a = obj;
        }
    }

    public k9j0(k850 k850Var, sx3 sx3Var) {
        C17961a c17961a = new C17961a();
        this.f122034e = c17961a;
        this.f122030a = k850Var;
        this.f122031b = kxm.f125142a.mo144879i(k850Var.m144855j());
        this.f122032c = sx3Var;
        this.f122033d = k850Var.m144860o().create(sx3Var);
        c17961a.timeout(k850Var.m144852d(), TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: a */
    public void m145084a(bec0 bec0Var) {
        if (this.f122038i != null) {
            ohg0.m164364a();
        } else {
            this.f122038i = bec0Var;
            bec0Var.f75148p.add(new C17962b(this, this.f122035f));
        }
    }

    /* JADX INFO: renamed from: b */
    public void m145085b() {
        this.f122035f = Platform.get().getStackTraceForCloseable("response.body().close()");
        this.f122033d.callStart(this.f122032c);
    }

    /* JADX INFO: renamed from: c */
    public boolean m145086c() {
        return this.f122037h.m148627f() && this.f122037h.m148626e();
    }

    /* JADX INFO: renamed from: d */
    public void m145087d() {
        j5f j5fVar;
        bec0 bec0VarM148622a;
        synchronized (this.f122031b) {
            try {
                this.f122042m = true;
                j5fVar = this.f122039j;
                l5f l5fVar = this.f122037h;
                bec0VarM148622a = (l5fVar == null || l5fVar.m148622a() == null) ? this.f122038i : this.f122037h.m148622a();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (j5fVar != null) {
            j5fVar.m139845b();
        } else if (bec0VarM148622a != null) {
            bec0VarM148622a.m101335g();
        }
    }

    /* JADX INFO: renamed from: e */
    public final c90 m145088e(cll cllVar) {
        SSLSocketFactory sSLSocketFactoryM144847K;
        HostnameVerifier hostnameVerifierM144863r;
        yp4 yp4VarM144853e;
        if (cllVar.m107523n()) {
            sSLSocketFactoryM144847K = this.f122030a.m144847K();
            hostnameVerifierM144863r = this.f122030a.m144863r();
            yp4VarM144853e = this.f122030a.m144853e();
        } else {
            sSLSocketFactoryM144847K = null;
            hostnameVerifierM144863r = null;
            yp4VarM144853e = null;
        }
        return new c90(cllVar.m107522m(), cllVar.m107527y(), this.f122030a.m144859n(), this.f122030a.m144846G(), sSLSocketFactoryM144847K, hostnameVerifierM144863r, yp4VarM144853e, this.f122030a.m144842B(), this.f122030a.m144841A(), this.f122030a.m144870z(), this.f122030a.m144856k(), this.f122030a.m144843C());
    }

    /* JADX INFO: renamed from: f */
    public void m145089f() {
        synchronized (this.f122031b) {
            try {
                if (this.f122044o) {
                    throw new IllegalStateException();
                }
                this.f122039j = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public IOException m145090g(j5f j5fVar, boolean z, boolean z2, IOException iOException) {
        boolean z3;
        synchronized (this.f122031b) {
            try {
                j5f j5fVar2 = this.f122039j;
                if (j5fVar != j5fVar2) {
                    return iOException;
                }
                boolean z4 = true;
                if (z) {
                    z3 = !this.f122040k;
                    this.f122040k = true;
                } else {
                    z3 = false;
                }
                if (z2) {
                    if (!this.f122041l) {
                        z3 = true;
                    }
                    this.f122041l = true;
                }
                if (this.f122040k && this.f122041l && z3) {
                    j5fVar2.m139846c().f75145m++;
                    this.f122039j = null;
                } else {
                    z4 = false;
                }
                return z4 ? m145093j(iOException, false) : iOException;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean m145091h() {
        boolean z;
        synchronized (this.f122031b) {
            z = this.f122039j != null;
        }
        return z;
    }

    /* JADX INFO: renamed from: i */
    public boolean m145092i() {
        boolean z;
        synchronized (this.f122031b) {
            z = this.f122042m;
        }
        return z;
    }

    /* JADX INFO: renamed from: j */
    public final IOException m145093j(IOException iOException, boolean z) {
        bec0 bec0Var;
        Socket socketM145097n;
        boolean z2;
        synchronized (this.f122031b) {
            if (z) {
                try {
                    if (this.f122039j != null) {
                        throw new IllegalStateException("cannot release connection while it is in use");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            bec0Var = this.f122038i;
            socketM145097n = (bec0Var != null && this.f122039j == null && (z || this.f122044o)) ? m145097n() : null;
            if (this.f122038i != null) {
                bec0Var = null;
            }
            z2 = this.f122044o && this.f122039j == null;
        }
        ii5.m136332b(socketM145097n);
        if (bec0Var != null) {
            this.f122033d.connectionReleased(this.f122032c, bec0Var);
        }
        if (z2) {
            boolean z3 = iOException != null;
            iOException = m145100q(iOException);
            o3f o3fVar = this.f122033d;
            if (z3) {
                o3fVar.callFailed(this.f122032c, iOException);
                return iOException;
            }
            o3fVar.callEnd(this.f122032c);
        }
        return iOException;
    }

    /* JADX INFO: renamed from: k */
    public j5f m145094k(axm.InterfaceC15754a interfaceC15754a, boolean z) throws IOException {
        synchronized (this.f122031b) {
            if (this.f122044o) {
                throw new IllegalStateException("released");
            }
            if (this.f122039j != null) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
            }
        }
        j5f j5fVar = new j5f(this, this.f122032c, this.f122033d, this.f122037h, this.f122037h.m148623b(this.f122030a, interfaceC15754a, z));
        synchronized (this.f122031b) {
            this.f122039j = j5fVar;
            this.f122040k = false;
            this.f122041l = false;
        }
        return j5fVar;
    }

    /* JADX INFO: renamed from: l */
    public IOException m145095l(IOException iOException) {
        synchronized (this.f122031b) {
            this.f122044o = true;
        }
        return m145093j(iOException, false);
    }

    /* JADX INFO: renamed from: m */
    public void m145096m(stc0 stc0Var) {
        stc0 stc0Var2 = this.f122036g;
        if (stc0Var2 != null) {
            if (tck0.m187991D(stc0Var2.m185881k(), stc0Var.m185881k()) && this.f122037h.m148626e()) {
                return;
            }
            if (this.f122039j != null) {
                ohg0.m164364a();
                return;
            } else if (this.f122037h != null) {
                m145093j(null, true);
                this.f122037h = null;
            }
        }
        this.f122036g = stc0Var;
        this.f122037h = new l5f(this, this.f122031b, m145088e(stc0Var.m185881k()), this.f122032c, this.f122033d);
    }

    /* JADX INFO: renamed from: n */
    public Socket m145097n() {
        int size = this.f122038i.f75148p.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            if (this.f122038i.f75148p.get(i).get() == this) {
                break;
            }
            i++;
        }
        if (i == -1) {
            ohg0.m164364a();
            return null;
        }
        bec0 bec0Var = this.f122038i;
        bec0Var.f75148p.remove(i);
        this.f122038i = null;
        if (bec0Var.f75148p.isEmpty()) {
            bec0Var.f75149q = System.nanoTime();
            if (this.f122031b.m111196d(bec0Var)) {
                return bec0Var.mo101332d();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public void m145098o() {
        if (this.f122043n) {
            ohg0.m164364a();
        } else {
            this.f122043n = true;
            this.f122034e.exit();
        }
    }

    /* JADX INFO: renamed from: p */
    public void m145099p() {
        this.f122034e.enter();
    }

    /* JADX INFO: renamed from: q */
    public final IOException m145100q(IOException iOException) {
        if (this.f122043n || !this.f122034e.exit()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }
}
