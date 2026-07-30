package p153l;

import androidx.annotation.CallSuper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzae;
import com.google.android.gms.internal.ads.zzrq;
import com.google.android.gms.internal.ads.zzsb;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class e2z0 implements sgr0 {

    /* JADX INFO: renamed from: B */
    public boolean f91880B;

    /* JADX INFO: renamed from: C */
    @Nullable
    public juy0 f91881C;

    /* JADX INFO: renamed from: a */
    public final y1z0 f91882a;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final huy0 f91885d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final zty0 f91886e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public d2z0 f91887f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public sqr0 f91888g;

    /* JADX INFO: renamed from: o */
    public int f91896o;

    /* JADX INFO: renamed from: p */
    public int f91897p;

    /* JADX INFO: renamed from: q */
    public int f91898q;

    /* JADX INFO: renamed from: r */
    public int f91899r;

    /* JADX INFO: renamed from: v */
    public boolean f91903v;

    /* JADX INFO: renamed from: y */
    @Nullable
    public sqr0 f91906y;

    /* JADX INFO: renamed from: z */
    @Nullable
    public sqr0 f91907z;

    /* JADX INFO: renamed from: b */
    public final a2z0 f91883b = new a2z0();

    /* JADX INFO: renamed from: h */
    public int f91889h = 1000;

    /* JADX INFO: renamed from: i */
    public long[] f91890i = new long[1000];

    /* JADX INFO: renamed from: j */
    public long[] f91891j = new long[1000];

    /* JADX INFO: renamed from: m */
    public long[] f91894m = new long[1000];

    /* JADX INFO: renamed from: l */
    public int[] f91893l = new int[1000];

    /* JADX INFO: renamed from: k */
    public int[] f91892k = new int[1000];

    /* JADX INFO: renamed from: n */
    public ggr0[] f91895n = new ggr0[1000];

    /* JADX INFO: renamed from: c */
    public final l2z0 f91884c = new l2z0(new hkv0() { // from class: l.z1z0
        @Override // p153l.hkv0
        public final void zza(Object obj) {
            throw null;
        }
    });

    /* JADX INFO: renamed from: s */
    public long f91900s = Long.MIN_VALUE;

    /* JADX INFO: renamed from: t */
    public long f91901t = Long.MIN_VALUE;

    /* JADX INFO: renamed from: u */
    public long f91902u = Long.MIN_VALUE;

    /* JADX INFO: renamed from: x */
    public boolean f91905x = true;

    /* JADX INFO: renamed from: w */
    public boolean f91904w = true;

    /* JADX INFO: renamed from: A */
    public boolean f91879A = true;

    public e2z0(c6z0 c6z0Var, @Nullable huy0 huy0Var, @Nullable zty0 zty0Var) {
        this.f91885d = huy0Var;
        this.f91886e = zty0Var;
        this.f91882a = new y1z0(c6z0Var);
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m119202D(c2z0 c2z0Var) {
        guy0 guy0Var = c2z0Var.f79535b;
        int i = fuy0.f100959a;
    }

    @Nullable
    /* JADX INFO: renamed from: A */
    public final synchronized sqr0 m119203A() {
        if (this.f91905x) {
            return null;
        }
        return this.f91907z;
    }

    /* JADX INFO: renamed from: B */
    public final void m119204B(long j, boolean z, boolean z2) {
        this.f91882a.m214005c(m119220k(j, false, z2));
    }

    /* JADX INFO: renamed from: C */
    public final void m119205C() {
        this.f91882a.m214005c(m119221l());
    }

    @CallSuper
    /* JADX INFO: renamed from: E */
    public final void m119206E() throws IOException {
        juy0 juy0Var = this.f91881C;
        if (juy0Var != null) {
            throw juy0Var.m147000a();
        }
    }

    @CallSuper
    /* JADX INFO: renamed from: F */
    public final void m119207F() {
        m119205C();
        m119225p();
    }

    @CallSuper
    /* JADX INFO: renamed from: G */
    public final void m119208G() {
        m119209H(true);
        m119225p();
    }

    @CallSuper
    /* JADX INFO: renamed from: H */
    public final void m119209H(boolean z) {
        this.f91882a.m214008f();
        this.f91896o = 0;
        this.f91897p = 0;
        this.f91898q = 0;
        this.f91899r = 0;
        this.f91904w = true;
        this.f91900s = Long.MIN_VALUE;
        this.f91901t = Long.MIN_VALUE;
        this.f91902u = Long.MIN_VALUE;
        this.f91903v = false;
        this.f91884c.m152654d();
        if (z) {
            this.f91906y = null;
            this.f91907z = null;
            this.f91905x = true;
            this.f91879A = true;
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m119210I(long j) {
        this.f91900s = j;
    }

    /* JADX INFO: renamed from: J */
    public final void m119211J(@Nullable d2z0 d2z0Var) {
        this.f91887f = d2z0Var;
    }

    /* JADX INFO: renamed from: K */
    public final synchronized void m119212K(int i) {
        boolean z = false;
        if (i >= 0) {
            try {
                if (this.f91899r + i <= this.f91896o) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        lev0.m153956d(z);
        this.f91899r += i;
    }

    /* JADX INFO: renamed from: L */
    public final synchronized boolean m119213L() {
        return this.f91903v;
    }

    @CallSuper
    /* JADX INFO: renamed from: M */
    public final synchronized boolean m119214M(boolean z) {
        boolean z2 = true;
        if (m119227r()) {
            if (((c2z0) this.f91884c.m152651a(this.f91897p + this.f91899r)).f79534a != this.f91888g) {
                return true;
            }
            return m119228s(m119218i(this.f91899r));
        }
        if (!z && !this.f91903v) {
            sqr0 sqr0Var = this.f91907z;
            if (sqr0Var == null) {
                z2 = false;
            } else if (sqr0Var == this.f91888g) {
                return false;
            }
        }
        return z2;
    }

    /* JADX INFO: renamed from: N */
    public final synchronized boolean m119215N(int i) {
        m119226q();
        int i2 = this.f91897p;
        if (i >= i2 && i <= this.f91896o + i2) {
            this.f91900s = Long.MIN_VALUE;
            this.f91899r = i - i2;
            return true;
        }
        return false;
    }

    @Override // p153l.sgr0
    /* JADX INFO: renamed from: a */
    public final void mo99370a(bgw0 bgw0Var, int i, int i2) {
        this.f91882a.m214010h(bgw0Var, i);
    }

    @Override // p153l.sgr0
    /* JADX INFO: renamed from: b */
    public final int mo99371b(nyy0 nyy0Var, int i, boolean z, int i2) throws IOException {
        return this.f91882a.m214003a(nyy0Var, i, z);
    }

    @Override // p153l.sgr0
    /* JADX INFO: renamed from: c */
    public final void mo99372c(long j, int i, int i2, int i3, @Nullable ggr0 ggr0Var) {
        if (this.f91904w) {
            if ((i & 1) == 0) {
                return;
            } else {
                this.f91904w = false;
            }
        }
        if (this.f91879A) {
            if (j < this.f91900s) {
                return;
            }
            if ((i & 1) == 0) {
                if (!this.f91880B) {
                    y4w0.m214278f("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.f91907z)));
                    this.f91880B = true;
                }
                i |= 1;
            }
        }
        int i4 = i;
        m119223n(j, i4, (this.f91882a.m214004b() - ((long) i2)) - ((long) i3), i2, ggr0Var);
    }

    @Override // p153l.sgr0
    /* JADX INFO: renamed from: d */
    public final void mo99373d(sqr0 sqr0Var) {
        this.f91906y = sqr0Var;
        boolean zM119229t = m119229t(sqr0Var);
        d2z0 d2z0Var = this.f91887f;
        if (d2z0Var == null || !zM119229t) {
            return;
        }
        d2z0Var.mo101555n(sqr0Var);
    }

    @Override // p153l.sgr0
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int mo99374e(nyy0 nyy0Var, int i, boolean z) {
        return fgr0.m125514a(this, nyy0Var, i, z);
    }

    @Override // p153l.sgr0
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void mo99375f(bgw0 bgw0Var, int i) {
        fgr0.m125515b(this, bgw0Var, i);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    /* JADX INFO: renamed from: g */
    public final synchronized boolean m119216g(long j, boolean z) throws Throwable {
        Throwable th;
        e2z0 e2z0Var;
        long j2;
        int iM119217h;
        try {
            try {
                m119226q();
                int i = this.f91899r;
                int iM119218i = m119218i(i);
                if (!m119227r() || j < this.f91894m[iM119218i]) {
                    e2z0Var = this;
                } else {
                    if (j > this.f91902u) {
                        if (z) {
                            z = true;
                        } else {
                            e2z0Var = this;
                        }
                    }
                    boolean z2 = this.f91879A;
                    int i2 = this.f91896o;
                    if (z2) {
                        iM119217h = i2 - i;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= iM119217h) {
                                e2z0Var = this;
                                j2 = j;
                                if (!z) {
                                    iM119217h = -1;
                                    break;
                                }
                                break;
                            }
                            try {
                                if (this.f91894m[iM119218i] >= j) {
                                    e2z0Var = this;
                                    j2 = j;
                                    iM119217h = i3;
                                    break;
                                }
                                iM119218i++;
                                if (iM119218i == this.f91889h) {
                                    iM119218i = 0;
                                }
                                i3++;
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                    } else {
                        e2z0Var = this;
                        j2 = j;
                        iM119217h = e2z0Var.m119217h(iM119218i, i2 - i, j2, true);
                    }
                    if (iM119217h != -1) {
                        e2z0Var.f91900s = j2;
                        e2z0Var.f91899r += iM119217h;
                        return true;
                    }
                }
                return false;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
        throw th;
    }

    /* JADX INFO: renamed from: h */
    public final int m119217h(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.f91894m[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.f91893l[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.f91889h) {
                i = 0;
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: i */
    public final int m119218i(int i) {
        int i2 = this.f91898q + i;
        int i3 = this.f91889h;
        return i2 < i3 ? i2 : i2 - i3;
    }

    /* JADX INFO: renamed from: j */
    public final synchronized int m119219j(l9y0 l9y0Var, evx0 evx0Var, boolean z, boolean z2, a2z0 a2z0Var) {
        try {
            evx0Var.f96058e = false;
            if (!m119227r()) {
                if (!z2 && !this.f91903v) {
                    sqr0 sqr0Var = this.f91907z;
                    if (sqr0Var == null || (!z && sqr0Var == this.f91888g)) {
                        return -3;
                    }
                    m119224o(sqr0Var, l9y0Var);
                    return -5;
                }
                evx0Var.m127551c(4);
                evx0Var.f96059f = Long.MIN_VALUE;
                return -4;
            }
            sqr0 sqr0Var2 = ((c2z0) this.f91884c.m152651a(this.f91897p + this.f91899r)).f79534a;
            if (!z && sqr0Var2 == this.f91888g) {
                int iM119218i = m119218i(this.f91899r);
                if (!m119228s(iM119218i)) {
                    evx0Var.f96058e = true;
                    return -3;
                }
                evx0Var.m127551c(this.f91893l[iM119218i]);
                if (this.f91899r == this.f91896o - 1 && (z2 || this.f91903v)) {
                    evx0Var.m127550a(536870912);
                }
                long j = this.f91894m[iM119218i];
                evx0Var.f96059f = j;
                if (j < this.f91900s) {
                    evx0Var.m127550a(Integer.MIN_VALUE);
                }
                a2z0Var.f68232a = this.f91892k[iM119218i];
                a2z0Var.f68233b = this.f91891j[iM119218i];
                a2z0Var.f68234c = this.f91895n[iM119218i];
                return -4;
            }
            m119224o(sqr0Var2, l9y0Var);
            return -5;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x000f  */
    /* JADX INFO: renamed from: k */
    public final synchronized long m119220k(long j, boolean z, boolean z2) throws Throwable {
        Throwable th;
        e2z0 e2z0Var;
        try {
            try {
                int i = this.f91896o;
                if (i != 0) {
                    long[] jArr = this.f91894m;
                    int i2 = this.f91898q;
                    if (j < jArr[i2]) {
                        e2z0Var = this;
                    } else {
                        if (z2) {
                            try {
                                int i3 = this.f91899r;
                                if (i3 != i) {
                                    i = i3 + 1;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                        e2z0Var = this;
                        int iM119217h = e2z0Var.m119217h(i2, i, j, false);
                        if (iM119217h != -1) {
                            long jM119222m = e2z0Var.m119222m(iM119217h);
                            return jM119222m;
                        }
                    }
                } else {
                    e2z0Var = this;
                }
                return -1L;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        throw th;
    }

    /* JADX INFO: renamed from: l */
    public final synchronized long m119221l() {
        int i = this.f91896o;
        if (i == 0) {
            return -1L;
        }
        return m119222m(i);
    }

    @GuardedBy("this")
    /* JADX INFO: renamed from: m */
    public final long m119222m(int i) {
        long j = this.f91901t;
        long jMax = Long.MIN_VALUE;
        if (i != 0) {
            int iM119218i = m119218i(i - 1);
            for (int i2 = 0; i2 < i; i2++) {
                jMax = Math.max(jMax, this.f91894m[iM119218i]);
                if ((this.f91893l[iM119218i] & 1) != 0) {
                    break;
                }
                iM119218i--;
                if (iM119218i == -1) {
                    iM119218i = this.f91889h - 1;
                }
            }
        }
        this.f91901t = Math.max(j, jMax);
        this.f91896o -= i;
        int i3 = this.f91897p + i;
        this.f91897p = i3;
        int i4 = this.f91898q + i;
        this.f91898q = i4;
        int i5 = this.f91889h;
        if (i4 >= i5) {
            this.f91898q = i4 - i5;
        }
        int i6 = this.f91899r - i;
        this.f91899r = i6;
        if (i6 < 0) {
            this.f91899r = 0;
        }
        this.f91884c.m152655e(i3);
        if (this.f91896o != 0) {
            return this.f91891j[this.f91898q];
        }
        int i7 = this.f91898q;
        if (i7 == 0) {
            i7 = this.f91889h;
        }
        int i8 = i7 - 1;
        return this.f91891j[i8] + ((long) this.f91892k[i8]);
    }

    /* JADX INFO: renamed from: n */
    public final synchronized void m119223n(long j, int i, long j2, int i2, @Nullable ggr0 ggr0Var) {
        try {
            int i3 = this.f91896o;
            if (i3 > 0) {
                int iM119218i = m119218i(i3 - 1);
                lev0.m153956d(this.f91891j[iM119218i] + ((long) this.f91892k[iM119218i]) <= j2);
            }
            this.f91903v = (536870912 & i) != 0;
            this.f91902u = Math.max(this.f91902u, j);
            int iM119218i2 = m119218i(this.f91896o);
            this.f91894m[iM119218i2] = j;
            this.f91891j[iM119218i2] = j2;
            this.f91892k[iM119218i2] = i2;
            this.f91893l[iM119218i2] = i;
            this.f91895n[iM119218i2] = ggr0Var;
            this.f91890i[iM119218i2] = 0;
            if (this.f91884c.m152656f() || !((c2z0) this.f91884c.m152652b()).f79534a.equals(this.f91907z)) {
                sqr0 sqr0Var = this.f91907z;
                if (sqr0Var == null) {
                    throw null;
                }
                this.f91884c.m152653c(this.f91897p + this.f91896o, new c2z0(sqr0Var, guy0.f106593a, null));
            }
            int i4 = this.f91896o + 1;
            this.f91896o = i4;
            int i5 = this.f91889h;
            if (i4 == i5) {
                int i6 = i5 + 1000;
                long[] jArr = new long[i6];
                long[] jArr2 = new long[i6];
                long[] jArr3 = new long[i6];
                int[] iArr = new int[i6];
                int[] iArr2 = new int[i6];
                ggr0[] ggr0VarArr = new ggr0[i6];
                int i7 = this.f91898q;
                int i8 = i5 - i7;
                System.arraycopy(this.f91891j, i7, jArr2, 0, i8);
                System.arraycopy(this.f91894m, this.f91898q, jArr3, 0, i8);
                System.arraycopy(this.f91893l, this.f91898q, iArr, 0, i8);
                System.arraycopy(this.f91892k, this.f91898q, iArr2, 0, i8);
                System.arraycopy(this.f91895n, this.f91898q, ggr0VarArr, 0, i8);
                System.arraycopy(this.f91890i, this.f91898q, jArr, 0, i8);
                int i9 = this.f91898q;
                System.arraycopy(this.f91891j, 0, jArr2, i8, i9);
                System.arraycopy(this.f91894m, 0, jArr3, i8, i9);
                System.arraycopy(this.f91893l, 0, iArr, i8, i9);
                System.arraycopy(this.f91892k, 0, iArr2, i8, i9);
                System.arraycopy(this.f91895n, 0, ggr0VarArr, i8, i9);
                System.arraycopy(this.f91890i, 0, jArr, i8, i9);
                this.f91891j = jArr2;
                this.f91894m = jArr3;
                this.f91893l = iArr;
                this.f91892k = iArr2;
                this.f91895n = ggr0VarArr;
                this.f91890i = jArr;
                this.f91898q = 0;
                this.f91889h = i6;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m119224o(sqr0 sqr0Var, l9y0 l9y0Var) {
        sqr0 sqr0Var2 = this.f91888g;
        zzae zzaeVar = sqr0Var2 == null ? null : sqr0Var2.f170254o;
        this.f91888g = sqr0Var;
        zzae zzaeVar2 = sqr0Var.f170254o;
        l9y0Var.f130645a = sqr0Var.m187560c(this.f91885d.mo118230a(sqr0Var));
        l9y0Var.f130646b = this.f91881C;
        if (sqr0Var2 == null || !mpw0.m159408f(zzaeVar, zzaeVar2)) {
            juy0 juy0Var = sqr0Var.f170254o != null ? new juy0(new zzrq(new zzsb(1), 6001)) : null;
            this.f91881C = juy0Var;
            l9y0Var.f130646b = juy0Var;
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m119225p() {
        if (this.f91881C != null) {
            this.f91881C = null;
            this.f91888g = null;
        }
    }

    /* JADX INFO: renamed from: q */
    public final synchronized void m119226q() {
        this.f91899r = 0;
        this.f91882a.m214009g();
    }

    /* JADX INFO: renamed from: r */
    public final boolean m119227r() {
        return this.f91899r != this.f91896o;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m119228s(int i) {
        if (this.f91881C == null) {
            return true;
        }
        int i2 = this.f91893l[i];
        return false;
    }

    /* JADX INFO: renamed from: t */
    public final synchronized boolean m119229t(sqr0 sqr0Var) {
        try {
            this.f91905x = false;
            if (mpw0.m159408f(sqr0Var, this.f91907z)) {
                return false;
            }
            if (this.f91884c.m152656f() || !((c2z0) this.f91884c.m152652b()).f79534a.equals(sqr0Var)) {
                this.f91907z = sqr0Var;
            } else {
                this.f91907z = ((c2z0) this.f91884c.m152652b()).f79534a;
            }
            boolean z = this.f91879A;
            sqr0 sqr0Var2 = this.f91907z;
            this.f91879A = z & a8t0.m96494f(sqr0Var2.f170251l, sqr0Var2.f170248i);
            this.f91880B = false;
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: u */
    public final int m119230u() {
        return this.f91897p;
    }

    /* JADX INFO: renamed from: v */
    public final int m119231v() {
        return this.f91897p + this.f91899r;
    }

    /* JADX INFO: renamed from: w */
    public final synchronized int m119232w(long j, boolean z) throws Throwable {
        Throwable th;
        try {
            try {
                int i = this.f91899r;
                int iM119218i = m119218i(i);
                if (!m119227r() || j < this.f91894m[iM119218i]) {
                    return 0;
                }
                if (j <= this.f91902u || !z) {
                    int iM119217h = m119217h(iM119218i, this.f91896o - i, j, true);
                    if (iM119217h == -1) {
                        return 0;
                    }
                    return iM119217h;
                }
                try {
                    return this.f91896o - i;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
        }
        throw th;
    }

    /* JADX INFO: renamed from: x */
    public final int m119233x() {
        return this.f91897p + this.f91896o;
    }

    @CallSuper
    /* JADX INFO: renamed from: y */
    public final int m119234y(l9y0 l9y0Var, evx0 evx0Var, int i, boolean z) {
        int iM119219j = m119219j(l9y0Var, evx0Var, (i & 2) != 0, z, this.f91883b);
        if (iM119219j != -4) {
            return iM119219j;
        }
        if (!evx0Var.m127554f()) {
            int i2 = i & 1;
            if ((i & 4) == 0) {
                y1z0 y1z0Var = this.f91882a;
                if (i2 != 0) {
                    y1z0Var.m214006d(evx0Var, this.f91883b);
                    return -4;
                }
                y1z0Var.m214007e(evx0Var, this.f91883b);
            } else if (i2 != 0) {
                return -4;
            }
            this.f91899r++;
        }
        return -4;
    }

    /* JADX INFO: renamed from: z */
    public final synchronized long m119235z() {
        return this.f91902u;
    }
}
