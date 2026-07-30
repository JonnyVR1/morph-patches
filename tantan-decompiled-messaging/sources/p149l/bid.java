package p149l;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class bid implements sj0 {

    /* JADX INFO: renamed from: a */
    public final boolean f75718a;

    /* JADX INFO: renamed from: b */
    public final int f75719b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final byte[] f75720c;

    /* JADX INFO: renamed from: d */
    public int f75721d;

    /* JADX INFO: renamed from: e */
    public int f75722e;

    /* JADX INFO: renamed from: f */
    public int f75723f;

    /* JADX INFO: renamed from: g */
    public rj0[] f75724g;

    public bid(boolean z, int i, int i2) {
        p11.m167007a(i > 0);
        p11.m167007a(i2 >= 0);
        this.f75718a = z;
        this.f75719b = i;
        this.f75723f = i2;
        this.f75724g = new rj0[i2 + 100];
        if (i2 <= 0) {
            this.f75720c = null;
            return;
        }
        this.f75720c = new byte[i2 * i];
        for (int i3 = 0; i3 < i2; i3++) {
            this.f75724g[i3] = new rj0(this.f75720c, i3 * i);
        }
    }

    @Override // p149l.sj0
    /* JADX INFO: renamed from: a */
    public synchronized void mo101994a(@Nullable sj0.InterfaceC19953a interfaceC19953a) {
        while (interfaceC19953a != null) {
            try {
                rj0[] rj0VarArr = this.f75724g;
                int i = this.f75723f;
                this.f75723f = i + 1;
                rj0VarArr[i] = interfaceC19953a.mo11405a();
                this.f75722e--;
                interfaceC19953a = interfaceC19953a.next();
            } catch (Throwable th) {
                throw th;
            }
        }
        notifyAll();
    }

    @Override // p149l.sj0
    /* JADX INFO: renamed from: b */
    public synchronized void mo101995b() {
        try {
            int i = 0;
            int iMax = Math.max(0, vck0.m197872l(this.f75721d, this.f75719b) - this.f75722e);
            int i2 = this.f75723f;
            if (iMax >= i2) {
                return;
            }
            if (this.f75720c != null) {
                int i3 = i2 - 1;
                while (i <= i3) {
                    rj0 rj0Var = (rj0) p11.m167011e(this.f75724g[i]);
                    if (rj0Var.f159616a == this.f75720c) {
                        i++;
                    } else {
                        rj0 rj0Var2 = (rj0) p11.m167011e(this.f75724g[i3]);
                        if (rj0Var2.f159616a != this.f75720c) {
                            i3--;
                        } else {
                            rj0[] rj0VarArr = this.f75724g;
                            rj0VarArr[i] = rj0Var2;
                            rj0VarArr[i3] = rj0Var;
                            i3--;
                            i++;
                        }
                    }
                }
                iMax = Math.max(iMax, i);
                if (iMax >= this.f75723f) {
                    return;
                }
            }
            Arrays.fill(this.f75724g, iMax, this.f75723f, (Object) null);
            this.f75723f = iMax;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.sj0
    /* JADX INFO: renamed from: c */
    public synchronized rj0 mo101996c() {
        rj0 rj0Var;
        try {
            this.f75722e++;
            int i = this.f75723f;
            if (i > 0) {
                rj0[] rj0VarArr = this.f75724g;
                int i2 = i - 1;
                this.f75723f = i2;
                rj0Var = (rj0) p11.m167011e(rj0VarArr[i2]);
                this.f75724g[this.f75723f] = null;
            } else {
                rj0Var = new rj0(new byte[this.f75719b], 0);
                int i3 = this.f75722e;
                rj0[] rj0VarArr2 = this.f75724g;
                if (i3 > rj0VarArr2.length) {
                    this.f75724g = (rj0[]) Arrays.copyOf(rj0VarArr2, rj0VarArr2.length * 2);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return rj0Var;
    }

    @Override // p149l.sj0
    /* JADX INFO: renamed from: d */
    public synchronized void mo101997d(rj0 rj0Var) {
        rj0[] rj0VarArr = this.f75724g;
        int i = this.f75723f;
        this.f75723f = i + 1;
        rj0VarArr[i] = rj0Var;
        this.f75722e--;
        notifyAll();
    }

    @Override // p149l.sj0
    /* JADX INFO: renamed from: e */
    public int mo101998e() {
        return this.f75719b;
    }

    /* JADX INFO: renamed from: f */
    public synchronized int m101999f() {
        return this.f75722e * this.f75719b;
    }

    /* JADX INFO: renamed from: g */
    public synchronized void m102000g() {
        if (this.f75718a) {
            m102001h(0);
        }
    }

    /* JADX INFO: renamed from: h */
    public synchronized void m102001h(int i) {
        boolean z = i < this.f75721d;
        this.f75721d = i;
        if (z) {
            mo101995b();
        }
    }

    public bid(boolean z, int i) {
        this(z, i, 0);
    }
}
