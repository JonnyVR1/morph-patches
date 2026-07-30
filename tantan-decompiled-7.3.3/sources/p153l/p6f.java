package p153l;

import java.io.IOException;
import java.net.Socket;
import java.util.List;
import java.util.NoSuchElementException;
import okhttp3.internal.connection.RouteException;

/* JADX INFO: loaded from: classes2.dex */
public final class p6f {

    /* JADX INFO: renamed from: a */
    public final oij0 f150829a;

    /* JADX INFO: renamed from: b */
    public final y80 f150830b;

    /* JADX INFO: renamed from: c */
    public final kmc0 f150831c;

    /* JADX INFO: renamed from: d */
    public final ry3 f150832d;

    /* JADX INFO: renamed from: e */
    public final t4f f150833e;

    /* JADX INFO: renamed from: f */
    public pnd0.C19408a f150834f;

    /* JADX INFO: renamed from: g */
    public final pnd0 f150835g;

    /* JADX INFO: renamed from: h */
    public imc0 f150836h;

    /* JADX INFO: renamed from: i */
    public boolean f150837i;

    /* JADX INFO: renamed from: j */
    public nnd0 f150838j;

    public p6f(oij0 oij0Var, kmc0 kmc0Var, y80 y80Var, ry3 ry3Var, t4f t4fVar) {
        this.f150829a = oij0Var;
        this.f150831c = kmc0Var;
        this.f150830b = y80Var;
        this.f150832d = ry3Var;
        this.f150833e = t4fVar;
        this.f150835g = new pnd0(y80Var, kmc0Var.f127466e, ry3Var, t4fVar);
    }

    /* JADX INFO: renamed from: a */
    public imc0 m170858a() {
        return this.f150836h;
    }

    /* JADX INFO: renamed from: b */
    public o6f m170859b(rg50 rg50Var, azm.InterfaceC15867a interfaceC15867a, boolean z) throws IOException {
        try {
            return m170861d(interfaceC15867a.connectTimeoutMillis(), interfaceC15867a.readTimeoutMillis(), interfaceC15867a.writeTimeoutMillis(), rg50Var.m181361y(), rg50Var.m181337E(), z).m140914r(rg50Var, interfaceC15867a);
        } catch (IOException e) {
            m170865h();
            throw new RouteException(e);
        } catch (NoSuchElementException e2) {
            throw new IOException(e2);
        } catch (RouteException e3) {
            m170865h();
            throw e3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX INFO: renamed from: c */
    public final imc0 m170860c(int i, int i2, int i3, int i4, boolean z) throws Throwable {
        imc0 imc0Var;
        Socket socketMo106827d;
        Socket socketM167789n;
        imc0 imc0Var2;
        boolean z2;
        nnd0 nnd0VarM173069c;
        boolean z3;
        List<nnd0> listM173067a;
        imc0 imc0Var3;
        pnd0.C19408a c19408a;
        synchronized (this.f150831c) {
            try {
                if (this.f150829a.m167784i()) {
                    throw new IOException("Canceled");
                }
                this.f150837i = false;
                oij0 oij0Var = this.f150829a;
                imc0Var = oij0Var.f147544i;
                socketMo106827d = null;
                socketM167789n = (imc0Var == null || !imc0Var.f115762k) ? null : oij0Var.m167789n();
                oij0 oij0Var2 = this.f150829a;
                imc0Var2 = oij0Var2.f147544i;
                if (imc0Var2 != null) {
                    imc0Var = null;
                } else {
                    imc0Var2 = null;
                }
                if (imc0Var2 != null) {
                    z2 = false;
                    nnd0VarM173069c = null;
                } else if (this.f150831c.m150427g(this.f150830b, oij0Var2, null, false)) {
                    imc0Var2 = this.f150829a.f147544i;
                    nnd0VarM173069c = null;
                    z2 = true;
                } else {
                    nnd0VarM173069c = this.f150838j;
                    if (nnd0VarM173069c != null) {
                        this.f150838j = null;
                    } else if (m170864g()) {
                        nnd0VarM173069c = this.f150829a.f147544i.mo106825b();
                    } else {
                        z2 = false;
                        nnd0VarM173069c = null;
                    }
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        jj5.m145008b(socketM167789n);
        if (imc0Var != null) {
            this.f150833e.connectionReleased(this.f150832d, imc0Var);
        }
        if (z2) {
            this.f150833e.connectionAcquired(this.f150832d, imc0Var2);
        }
        if (imc0Var2 != null) {
            return imc0Var2;
        }
        if (nnd0VarM173069c != null || (((c19408a = this.f150834f) != null && c19408a.m173068b()) || !this.f150835g.m173061b())) {
            z3 = false;
        } else {
            this.f150834f = this.f150835g.m173063d();
            z3 = true;
        }
        synchronized (this.f150831c) {
            try {
                if (this.f150829a.m167784i()) {
                    throw new IOException("Canceled");
                }
                if (z3) {
                    listM173067a = this.f150834f.m173067a();
                    if (this.f150831c.m150427g(this.f150830b, this.f150829a, listM173067a, false)) {
                        imc0Var2 = this.f150829a.f147544i;
                        z2 = true;
                    }
                } else {
                    listM173067a = null;
                }
                if (!z2) {
                    if (nnd0VarM173069c == null) {
                        nnd0VarM173069c = this.f150834f.m173069c();
                    }
                    imc0Var2 = new imc0(this.f150831c, nnd0VarM173069c);
                    this.f150836h = imc0Var2;
                }
                imc0Var3 = imc0Var2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z2) {
            this.f150833e.connectionAcquired(this.f150832d, imc0Var3);
            return imc0Var3;
        }
        imc0Var3.m140904h(i, i2, i3, i4, z, this.f150832d, this.f150833e);
        this.f150831c.f127466e.m168330a(imc0Var3.mo106825b());
        synchronized (this.f150831c) {
            try {
                this.f150836h = null;
                if (this.f150831c.m150427g(this.f150830b, this.f150829a, listM173067a, true)) {
                    imc0Var3.f115762k = true;
                    socketMo106827d = imc0Var3.mo106827d();
                    imc0Var3 = this.f150829a.f147544i;
                    this.f150838j = nnd0VarM173069c;
                } else {
                    this.f150831c.m150426f(imc0Var3);
                    this.f150829a.m167776a(imc0Var3);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        jj5.m145008b(socketMo106827d);
        this.f150833e.connectionAcquired(this.f150832d, imc0Var3);
        return imc0Var3;
    }

    /* JADX INFO: renamed from: d */
    public final imc0 m170861d(int i, int i2, int i3, int i4, boolean z, boolean z2) throws Throwable {
        while (true) {
            imc0 imc0VarM170860c = m170860c(i, i2, i3, i4, z);
            synchronized (this.f150831c) {
                try {
                    if (imc0VarM170860c.f115764m == 0 && !imc0VarM170860c.m140913q()) {
                        return imc0VarM170860c;
                    }
                    if (imc0VarM170860c.m140912p(z2)) {
                        return imc0VarM170860c;
                    }
                    imc0VarM170860c.m140916t();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m170862e() {
        synchronized (this.f150831c) {
            try {
                boolean z = true;
                if (this.f150838j != null) {
                    return true;
                }
                if (m170864g()) {
                    this.f150838j = this.f150829a.f147544i.mo106825b();
                    return true;
                }
                pnd0.C19408a c19408a = this.f150834f;
                if ((c19408a == null || !c19408a.m173068b()) && !this.f150835g.m173061b()) {
                    z = false;
                }
                return z;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m170863f() {
        boolean z;
        synchronized (this.f150831c) {
            z = this.f150837i;
        }
        return z;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m170864g() {
        imc0 imc0Var = this.f150829a.f147544i;
        return imc0Var != null && imc0Var.f115763l == 0 && zlk0.m220230D(imc0Var.mo106825b().m163861a().m214721l(), this.f150830b.m214721l());
    }

    /* JADX INFO: renamed from: h */
    public void m170865h() {
        synchronized (this.f150831c) {
            this.f150837i = true;
        }
    }
}
