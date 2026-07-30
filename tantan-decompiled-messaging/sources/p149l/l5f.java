package p149l;

import java.io.IOException;
import java.net.Socket;
import java.util.List;
import java.util.NoSuchElementException;
import okhttp3.internal.connection.RouteException;

/* JADX INFO: loaded from: classes2.dex */
public final class l5f {

    /* JADX INFO: renamed from: a */
    public final k9j0 f126116a;

    /* JADX INFO: renamed from: b */
    public final c90 f126117b;

    /* JADX INFO: renamed from: c */
    public final dec0 f126118c;

    /* JADX INFO: renamed from: d */
    public final sx3 f126119d;

    /* JADX INFO: renamed from: e */
    public final o3f f126120e;

    /* JADX INFO: renamed from: f */
    public mfd0.C18451a f126121f;

    /* JADX INFO: renamed from: g */
    public final mfd0 f126122g;

    /* JADX INFO: renamed from: h */
    public bec0 f126123h;

    /* JADX INFO: renamed from: i */
    public boolean f126124i;

    /* JADX INFO: renamed from: j */
    public kfd0 f126125j;

    public l5f(k9j0 k9j0Var, dec0 dec0Var, c90 c90Var, sx3 sx3Var, o3f o3fVar) {
        this.f126116a = k9j0Var;
        this.f126118c = dec0Var;
        this.f126117b = c90Var;
        this.f126119d = sx3Var;
        this.f126120e = o3fVar;
        this.f126122g = new mfd0(c90Var, dec0Var.f85780e, sx3Var, o3fVar);
    }

    /* JADX INFO: renamed from: a */
    public bec0 m148622a() {
        return this.f126123h;
    }

    /* JADX INFO: renamed from: b */
    public k5f m148623b(k850 k850Var, axm.InterfaceC15754a interfaceC15754a, boolean z) throws IOException {
        try {
            return m148625d(interfaceC15754a.connectTimeoutMillis(), interfaceC15754a.readTimeoutMillis(), interfaceC15754a.writeTimeoutMillis(), k850Var.m144869y(), k850Var.m144845E(), z).m101346r(k850Var, interfaceC15754a);
        } catch (IOException e) {
            m148629h();
            throw new RouteException(e);
        } catch (NoSuchElementException e2) {
            throw new IOException(e2);
        } catch (RouteException e3) {
            m148629h();
            throw e3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX INFO: renamed from: c */
    public final bec0 m148624c(int i, int i2, int i3, int i4, boolean z) throws Throwable {
        bec0 bec0Var;
        Socket socketMo101332d;
        Socket socketM145097n;
        bec0 bec0Var2;
        boolean z2;
        kfd0 kfd0VarM154380c;
        boolean z3;
        List<kfd0> listM154378a;
        bec0 bec0Var3;
        mfd0.C18451a c18451a;
        synchronized (this.f126118c) {
            try {
                if (this.f126116a.m145092i()) {
                    throw new IOException("Canceled");
                }
                this.f126124i = false;
                k9j0 k9j0Var = this.f126116a;
                bec0Var = k9j0Var.f122038i;
                socketMo101332d = null;
                socketM145097n = (bec0Var == null || !bec0Var.f75143k) ? null : k9j0Var.m145097n();
                k9j0 k9j0Var2 = this.f126116a;
                bec0Var2 = k9j0Var2.f122038i;
                if (bec0Var2 != null) {
                    bec0Var = null;
                } else {
                    bec0Var2 = null;
                }
                if (bec0Var2 != null) {
                    z2 = false;
                    kfd0VarM154380c = null;
                } else if (this.f126118c.m111199g(this.f126117b, k9j0Var2, null, false)) {
                    bec0Var2 = this.f126116a.f122038i;
                    kfd0VarM154380c = null;
                    z2 = true;
                } else {
                    kfd0VarM154380c = this.f126125j;
                    if (kfd0VarM154380c != null) {
                        this.f126125j = null;
                    } else if (m148628g()) {
                        kfd0VarM154380c = this.f126116a.f122038i.mo101330b();
                    } else {
                        z2 = false;
                        kfd0VarM154380c = null;
                    }
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ii5.m136332b(socketM145097n);
        if (bec0Var != null) {
            this.f126120e.connectionReleased(this.f126119d, bec0Var);
        }
        if (z2) {
            this.f126120e.connectionAcquired(this.f126119d, bec0Var2);
        }
        if (bec0Var2 != null) {
            return bec0Var2;
        }
        if (kfd0VarM154380c != null || (((c18451a = this.f126121f) != null && c18451a.m154379b()) || !this.f126122g.m154372b())) {
            z3 = false;
        } else {
            this.f126121f = this.f126122g.m154374d();
            z3 = true;
        }
        synchronized (this.f126118c) {
            try {
                if (this.f126116a.m145092i()) {
                    throw new IOException("Canceled");
                }
                if (z3) {
                    listM154378a = this.f126121f.m154378a();
                    if (this.f126118c.m111199g(this.f126117b, this.f126116a, listM154378a, false)) {
                        bec0Var2 = this.f126116a.f122038i;
                        z2 = true;
                    }
                } else {
                    listM154378a = null;
                }
                if (!z2) {
                    if (kfd0VarM154380c == null) {
                        kfd0VarM154380c = this.f126121f.m154380c();
                    }
                    bec0Var2 = new bec0(this.f126118c, kfd0VarM154380c);
                    this.f126123h = bec0Var2;
                }
                bec0Var3 = bec0Var2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z2) {
            this.f126120e.connectionAcquired(this.f126119d, bec0Var3);
            return bec0Var3;
        }
        bec0Var3.m101336h(i, i2, i3, i4, z, this.f126119d, this.f126120e);
        this.f126118c.f85780e.m149673a(bec0Var3.mo101330b());
        synchronized (this.f126118c) {
            try {
                this.f126123h = null;
                if (this.f126118c.m111199g(this.f126117b, this.f126116a, listM154378a, true)) {
                    bec0Var3.f75143k = true;
                    socketMo101332d = bec0Var3.mo101332d();
                    bec0Var3 = this.f126116a.f122038i;
                    this.f126125j = kfd0VarM154380c;
                } else {
                    this.f126118c.m111198f(bec0Var3);
                    this.f126116a.m145084a(bec0Var3);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        ii5.m136332b(socketMo101332d);
        this.f126120e.connectionAcquired(this.f126119d, bec0Var3);
        return bec0Var3;
    }

    /* JADX INFO: renamed from: d */
    public final bec0 m148625d(int i, int i2, int i3, int i4, boolean z, boolean z2) throws Throwable {
        while (true) {
            bec0 bec0VarM148624c = m148624c(i, i2, i3, i4, z);
            synchronized (this.f126118c) {
                try {
                    if (bec0VarM148624c.f75145m == 0 && !bec0VarM148624c.m101345q()) {
                        return bec0VarM148624c;
                    }
                    if (bec0VarM148624c.m101344p(z2)) {
                        return bec0VarM148624c;
                    }
                    bec0VarM148624c.m101348t();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m148626e() {
        synchronized (this.f126118c) {
            try {
                boolean z = true;
                if (this.f126125j != null) {
                    return true;
                }
                if (m148628g()) {
                    this.f126125j = this.f126116a.f122038i.mo101330b();
                    return true;
                }
                mfd0.C18451a c18451a = this.f126121f;
                if ((c18451a == null || !c18451a.m154379b()) && !this.f126122g.m154372b()) {
                    z = false;
                }
                return z;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m148627f() {
        boolean z;
        synchronized (this.f126118c) {
            z = this.f126124i;
        }
        return z;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m148628g() {
        bec0 bec0Var = this.f126116a.f122038i;
        return bec0Var != null && bec0Var.f75144l == 0 && tck0.m187991D(bec0Var.mo101330b().m145831a().m105837l(), this.f126117b.m105837l());
    }

    /* JADX INFO: renamed from: h */
    public void m148629h() {
        synchronized (this.f126118c) {
            this.f126124i = true;
        }
    }
}
