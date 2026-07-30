package p153l;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class hjd implements oj0 {

    /* JADX INFO: renamed from: a */
    public final boolean f110174a;

    /* JADX INFO: renamed from: b */
    public final int f110175b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final byte[] f110176c;

    /* JADX INFO: renamed from: d */
    public int f110177d;

    /* JADX INFO: renamed from: e */
    public int f110178e;

    /* JADX INFO: renamed from: f */
    public int f110179f;

    /* JADX INFO: renamed from: g */
    public nj0[] f110180g;

    public hjd(boolean z, int i, int i2) {
        w11.m204365a(i > 0);
        w11.m204365a(i2 >= 0);
        this.f110174a = z;
        this.f110175b = i;
        this.f110179f = i2;
        this.f110180g = new nj0[i2 + 100];
        if (i2 <= 0) {
            this.f110176c = null;
            return;
        }
        this.f110176c = new byte[i2 * i];
        for (int i3 = 0; i3 < i2; i3++) {
            this.f110180g[i3] = new nj0(this.f110176c, i3 * i);
        }
    }

    @Override // p153l.oj0
    /* JADX INFO: renamed from: a */
    public synchronized void mo135327a(@Nullable oj0.InterfaceC19147a interfaceC19147a) {
        while (interfaceC19147a != null) {
            try {
                nj0[] nj0VarArr = this.f110180g;
                int i = this.f110179f;
                this.f110179f = i + 1;
                nj0VarArr[i] = interfaceC19147a.mo11459a();
                this.f110178e--;
                interfaceC19147a = interfaceC19147a.next();
            } catch (Throwable th) {
                throw th;
            }
        }
        notifyAll();
    }

    @Override // p153l.oj0
    /* JADX INFO: renamed from: b */
    public synchronized void mo135328b() {
        try {
            int i = 0;
            int iMax = Math.max(0, bmk0.m105150l(this.f110177d, this.f110175b) - this.f110178e);
            int i2 = this.f110179f;
            if (iMax >= i2) {
                return;
            }
            if (this.f110176c != null) {
                int i3 = i2 - 1;
                while (i <= i3) {
                    nj0 nj0Var = (nj0) w11.m204369e(this.f110180g[i]);
                    if (nj0Var.f142252a == this.f110176c) {
                        i++;
                    } else {
                        nj0 nj0Var2 = (nj0) w11.m204369e(this.f110180g[i3]);
                        if (nj0Var2.f142252a != this.f110176c) {
                            i3--;
                        } else {
                            nj0[] nj0VarArr = this.f110180g;
                            nj0VarArr[i] = nj0Var2;
                            nj0VarArr[i3] = nj0Var;
                            i3--;
                            i++;
                        }
                    }
                }
                iMax = Math.max(iMax, i);
                if (iMax >= this.f110179f) {
                    return;
                }
            }
            Arrays.fill(this.f110180g, iMax, this.f110179f, (Object) null);
            this.f110179f = iMax;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.oj0
    /* JADX INFO: renamed from: c */
    public synchronized nj0 mo135329c() {
        nj0 nj0Var;
        try {
            this.f110178e++;
            int i = this.f110179f;
            if (i > 0) {
                nj0[] nj0VarArr = this.f110180g;
                int i2 = i - 1;
                this.f110179f = i2;
                nj0Var = (nj0) w11.m204369e(nj0VarArr[i2]);
                this.f110180g[this.f110179f] = null;
            } else {
                nj0Var = new nj0(new byte[this.f110175b], 0);
                int i3 = this.f110178e;
                nj0[] nj0VarArr2 = this.f110180g;
                if (i3 > nj0VarArr2.length) {
                    this.f110180g = (nj0[]) Arrays.copyOf(nj0VarArr2, nj0VarArr2.length * 2);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return nj0Var;
    }

    @Override // p153l.oj0
    /* JADX INFO: renamed from: d */
    public synchronized void mo135330d(nj0 nj0Var) {
        nj0[] nj0VarArr = this.f110180g;
        int i = this.f110179f;
        this.f110179f = i + 1;
        nj0VarArr[i] = nj0Var;
        this.f110178e--;
        notifyAll();
    }

    @Override // p153l.oj0
    /* JADX INFO: renamed from: e */
    public int mo135331e() {
        return this.f110175b;
    }

    /* JADX INFO: renamed from: f */
    public synchronized int m135332f() {
        return this.f110178e * this.f110175b;
    }

    /* JADX INFO: renamed from: g */
    public synchronized void m135333g() {
        if (this.f110174a) {
            m135334h(0);
        }
    }

    /* JADX INFO: renamed from: h */
    public synchronized void m135334h(int i) {
        boolean z = i < this.f110177d;
        this.f110177d = i;
        if (z) {
            mo135328b();
        }
    }

    public hjd(boolean z, int i) {
        this(z, i, 0);
    }
}
