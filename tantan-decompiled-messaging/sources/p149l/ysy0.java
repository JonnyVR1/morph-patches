package p149l;

import androidx.annotation.CallSuper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzae;
import com.google.android.gms.internal.ads.zzrq;
import com.google.android.gms.internal.ads.zzsb;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class ysy0 implements m7r0 {

    /* JADX INFO: renamed from: B */
    public boolean f199849B;

    /* JADX INFO: renamed from: C */
    @Nullable
    public dly0 f199850C;

    /* JADX INFO: renamed from: a */
    public final ssy0 f199851a;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final bly0 f199854d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final tky0 f199855e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public xsy0 f199856f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public mhr0 f199857g;

    /* JADX INFO: renamed from: o */
    public int f199865o;

    /* JADX INFO: renamed from: p */
    public int f199866p;

    /* JADX INFO: renamed from: q */
    public int f199867q;

    /* JADX INFO: renamed from: r */
    public int f199868r;

    /* JADX INFO: renamed from: v */
    public boolean f199872v;

    /* JADX INFO: renamed from: y */
    @Nullable
    public mhr0 f199875y;

    /* JADX INFO: renamed from: z */
    @Nullable
    public mhr0 f199876z;

    /* JADX INFO: renamed from: b */
    public final usy0 f199852b = new usy0();

    /* JADX INFO: renamed from: h */
    public int f199858h = 1000;

    /* JADX INFO: renamed from: i */
    public long[] f199859i = new long[1000];

    /* JADX INFO: renamed from: j */
    public long[] f199860j = new long[1000];

    /* JADX INFO: renamed from: m */
    public long[] f199863m = new long[1000];

    /* JADX INFO: renamed from: l */
    public int[] f199862l = new int[1000];

    /* JADX INFO: renamed from: k */
    public int[] f199861k = new int[1000];

    /* JADX INFO: renamed from: n */
    public a7r0[] f199864n = new a7r0[1000];

    /* JADX INFO: renamed from: c */
    public final fty0 f199853c = new fty0(new bbv0() { // from class: l.tsy0
        @Override // p149l.bbv0
        public final void zza(Object obj) {
            throw null;
        }
    });

    /* JADX INFO: renamed from: s */
    public long f199869s = Long.MIN_VALUE;

    /* JADX INFO: renamed from: t */
    public long f199870t = Long.MIN_VALUE;

    /* JADX INFO: renamed from: u */
    public long f199871u = Long.MIN_VALUE;

    /* JADX INFO: renamed from: x */
    public boolean f199874x = true;

    /* JADX INFO: renamed from: w */
    public boolean f199873w = true;

    /* JADX INFO: renamed from: A */
    public boolean f199848A = true;

    public ysy0(wwy0 wwy0Var, @Nullable bly0 bly0Var, @Nullable tky0 tky0Var) {
        this.f199854d = bly0Var;
        this.f199855e = tky0Var;
        this.f199851a = new ssy0(wwy0Var);
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m215957D(wsy0 wsy0Var) {
        aly0 aly0Var = wsy0Var.f187987b;
        int i = zky0.f203581a;
    }

    @Nullable
    /* JADX INFO: renamed from: A */
    public final synchronized mhr0 m215958A() {
        if (this.f199874x) {
            return null;
        }
        return this.f199876z;
    }

    /* JADX INFO: renamed from: B */
    public final void m215959B(long j, boolean z, boolean z2) {
        this.f199851a.m185784c(m215975k(j, false, z2));
    }

    /* JADX INFO: renamed from: C */
    public final void m215960C() {
        this.f199851a.m185784c(m215976l());
    }

    @CallSuper
    /* JADX INFO: renamed from: E */
    public final void m215961E() throws IOException {
        dly0 dly0Var = this.f199850C;
        if (dly0Var != null) {
            throw dly0Var.m112427a();
        }
    }

    @CallSuper
    /* JADX INFO: renamed from: F */
    public final void m215962F() {
        m215960C();
        m215980p();
    }

    @CallSuper
    /* JADX INFO: renamed from: G */
    public final void m215963G() {
        m215964H(true);
        m215980p();
    }

    @CallSuper
    /* JADX INFO: renamed from: H */
    public final void m215964H(boolean z) {
        this.f199851a.m185787f();
        this.f199865o = 0;
        this.f199866p = 0;
        this.f199867q = 0;
        this.f199868r = 0;
        this.f199873w = true;
        this.f199869s = Long.MIN_VALUE;
        this.f199870t = Long.MIN_VALUE;
        this.f199871u = Long.MIN_VALUE;
        this.f199872v = false;
        this.f199853c.m123127d();
        if (z) {
            this.f199875y = null;
            this.f199876z = null;
            this.f199874x = true;
            this.f199848A = true;
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m215965I(long j) {
        this.f199869s = j;
    }

    /* JADX INFO: renamed from: J */
    public final void m215966J(@Nullable xsy0 xsy0Var) {
        this.f199856f = xsy0Var;
    }

    /* JADX INFO: renamed from: K */
    public final synchronized void m215967K(int i) {
        boolean z = false;
        if (i >= 0) {
            try {
                if (this.f199868r + i <= this.f199865o) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        f5v0.m119533d(z);
        this.f199868r += i;
    }

    /* JADX INFO: renamed from: L */
    public final synchronized boolean m215968L() {
        return this.f199872v;
    }

    @CallSuper
    /* JADX INFO: renamed from: M */
    public final synchronized boolean m215969M(boolean z) {
        boolean z2 = true;
        if (m215982r()) {
            if (((wsy0) this.f199853c.m123124a(this.f199866p + this.f199868r)).f187986a != this.f199857g) {
                return true;
            }
            return m215983s(m215973i(this.f199868r));
        }
        if (!z && !this.f199872v) {
            mhr0 mhr0Var = this.f199876z;
            if (mhr0Var == null) {
                z2 = false;
            } else if (mhr0Var == this.f199857g) {
                return false;
            }
        }
        return z2;
    }

    /* JADX INFO: renamed from: N */
    public final synchronized boolean m215970N(int i) {
        m215981q();
        int i2 = this.f199866p;
        if (i >= i2 && i <= this.f199865o + i2) {
            this.f199869s = Long.MIN_VALUE;
            this.f199868r = i - i2;
            return true;
        }
        return false;
    }

    @Override // p149l.m7r0
    /* JADX INFO: renamed from: a */
    public final void mo134528a(v6w0 v6w0Var, int i, int i2) {
        this.f199851a.m185789h(v6w0Var, i);
    }

    @Override // p149l.m7r0
    /* JADX INFO: renamed from: b */
    public final int mo134529b(hpy0 hpy0Var, int i, boolean z, int i2) throws IOException {
        return this.f199851a.m185782a(hpy0Var, i, z);
    }

    @Override // p149l.m7r0
    /* JADX INFO: renamed from: c */
    public final void mo134530c(long j, int i, int i2, int i3, @Nullable a7r0 a7r0Var) {
        if (this.f199873w) {
            if ((i & 1) == 0) {
                return;
            } else {
                this.f199873w = false;
            }
        }
        if (this.f199848A) {
            if (j < this.f199869s) {
                return;
            }
            if ((i & 1) == 0) {
                if (!this.f199849B) {
                    svv0.m186111f("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.f199876z)));
                    this.f199849B = true;
                }
                i |= 1;
            }
        }
        int i4 = i;
        m215978n(j, i4, (this.f199851a.m185783b() - ((long) i2)) - ((long) i3), i2, a7r0Var);
    }

    @Override // p149l.m7r0
    /* JADX INFO: renamed from: d */
    public final void mo134531d(mhr0 mhr0Var) {
        this.f199875y = mhr0Var;
        boolean zM215984t = m215984t(mhr0Var);
        xsy0 xsy0Var = this.f199856f;
        if (xsy0Var == null || !zM215984t) {
            return;
        }
        xsy0Var.mo199780n(mhr0Var);
    }

    @Override // p149l.m7r0
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int mo134532e(hpy0 hpy0Var, int i, boolean z) {
        return z6r0.m217415a(this, hpy0Var, i, z);
    }

    @Override // p149l.m7r0
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void mo134533f(v6w0 v6w0Var, int i) {
        z6r0.m217416b(this, v6w0Var, i);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    /* JADX INFO: renamed from: g */
    public final synchronized boolean m215971g(long j, boolean z) throws Throwable {
        Throwable th;
        ysy0 ysy0Var;
        long j2;
        int iM215972h;
        try {
            try {
                m215981q();
                int i = this.f199868r;
                int iM215973i = m215973i(i);
                if (!m215982r() || j < this.f199863m[iM215973i]) {
                    ysy0Var = this;
                } else {
                    if (j > this.f199871u) {
                        if (z) {
                            z = true;
                        } else {
                            ysy0Var = this;
                        }
                    }
                    boolean z2 = this.f199848A;
                    int i2 = this.f199865o;
                    if (z2) {
                        iM215972h = i2 - i;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= iM215972h) {
                                ysy0Var = this;
                                j2 = j;
                                if (!z) {
                                    iM215972h = -1;
                                    break;
                                }
                                break;
                            }
                            try {
                                if (this.f199863m[iM215973i] >= j) {
                                    ysy0Var = this;
                                    j2 = j;
                                    iM215972h = i3;
                                    break;
                                }
                                iM215973i++;
                                if (iM215973i == this.f199858h) {
                                    iM215973i = 0;
                                }
                                i3++;
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                    } else {
                        ysy0Var = this;
                        j2 = j;
                        iM215972h = ysy0Var.m215972h(iM215973i, i2 - i, j2, true);
                    }
                    if (iM215972h != -1) {
                        ysy0Var.f199869s = j2;
                        ysy0Var.f199868r += iM215972h;
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
    public final int m215972h(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.f199863m[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.f199862l[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.f199858h) {
                i = 0;
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: i */
    public final int m215973i(int i) {
        int i2 = this.f199867q + i;
        int i3 = this.f199858h;
        return i2 < i3 ? i2 : i2 - i3;
    }

    /* JADX INFO: renamed from: j */
    public final synchronized int m215974j(f0y0 f0y0Var, ylx0 ylx0Var, boolean z, boolean z2, usy0 usy0Var) {
        try {
            ylx0Var.f198946e = false;
            if (!m215982r()) {
                if (!z2 && !this.f199872v) {
                    mhr0 mhr0Var = this.f199876z;
                    if (mhr0Var == null || (!z && mhr0Var == this.f199857g)) {
                        return -3;
                    }
                    m215979o(mhr0Var, f0y0Var);
                    return -5;
                }
                ylx0Var.m219210c(4);
                ylx0Var.f198947f = Long.MIN_VALUE;
                return -4;
            }
            mhr0 mhr0Var2 = ((wsy0) this.f199853c.m123124a(this.f199866p + this.f199868r)).f187986a;
            if (!z && mhr0Var2 == this.f199857g) {
                int iM215973i = m215973i(this.f199868r);
                if (!m215983s(iM215973i)) {
                    ylx0Var.f198946e = true;
                    return -3;
                }
                ylx0Var.m219210c(this.f199862l[iM215973i]);
                if (this.f199868r == this.f199865o - 1 && (z2 || this.f199872v)) {
                    ylx0Var.m219209a(536870912);
                }
                long j = this.f199863m[iM215973i];
                ylx0Var.f198947f = j;
                if (j < this.f199869s) {
                    ylx0Var.m219209a(Integer.MIN_VALUE);
                }
                usy0Var.f178213a = this.f199861k[iM215973i];
                usy0Var.f178214b = this.f199860j[iM215973i];
                usy0Var.f178215c = this.f199864n[iM215973i];
                return -4;
            }
            m215979o(mhr0Var2, f0y0Var);
            return -5;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x000f  */
    /* JADX INFO: renamed from: k */
    public final synchronized long m215975k(long j, boolean z, boolean z2) throws Throwable {
        Throwable th;
        ysy0 ysy0Var;
        try {
            try {
                int i = this.f199865o;
                if (i != 0) {
                    long[] jArr = this.f199863m;
                    int i2 = this.f199867q;
                    if (j < jArr[i2]) {
                        ysy0Var = this;
                    } else {
                        if (z2) {
                            try {
                                int i3 = this.f199868r;
                                if (i3 != i) {
                                    i = i3 + 1;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                        ysy0Var = this;
                        int iM215972h = ysy0Var.m215972h(i2, i, j, false);
                        if (iM215972h != -1) {
                            long jM215977m = ysy0Var.m215977m(iM215972h);
                            return jM215977m;
                        }
                    }
                } else {
                    ysy0Var = this;
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
    public final synchronized long m215976l() {
        int i = this.f199865o;
        if (i == 0) {
            return -1L;
        }
        return m215977m(i);
    }

    @GuardedBy("this")
    /* JADX INFO: renamed from: m */
    public final long m215977m(int i) {
        long j = this.f199870t;
        long jMax = Long.MIN_VALUE;
        if (i != 0) {
            int iM215973i = m215973i(i - 1);
            for (int i2 = 0; i2 < i; i2++) {
                jMax = Math.max(jMax, this.f199863m[iM215973i]);
                if ((this.f199862l[iM215973i] & 1) != 0) {
                    break;
                }
                iM215973i--;
                if (iM215973i == -1) {
                    iM215973i = this.f199858h - 1;
                }
            }
        }
        this.f199870t = Math.max(j, jMax);
        this.f199865o -= i;
        int i3 = this.f199866p + i;
        this.f199866p = i3;
        int i4 = this.f199867q + i;
        this.f199867q = i4;
        int i5 = this.f199858h;
        if (i4 >= i5) {
            this.f199867q = i4 - i5;
        }
        int i6 = this.f199868r - i;
        this.f199868r = i6;
        if (i6 < 0) {
            this.f199868r = 0;
        }
        this.f199853c.m123128e(i3);
        if (this.f199865o != 0) {
            return this.f199860j[this.f199867q];
        }
        int i7 = this.f199867q;
        if (i7 == 0) {
            i7 = this.f199858h;
        }
        int i8 = i7 - 1;
        return this.f199860j[i8] + ((long) this.f199861k[i8]);
    }

    /* JADX INFO: renamed from: n */
    public final synchronized void m215978n(long j, int i, long j2, int i2, @Nullable a7r0 a7r0Var) {
        try {
            int i3 = this.f199865o;
            if (i3 > 0) {
                int iM215973i = m215973i(i3 - 1);
                f5v0.m119533d(this.f199860j[iM215973i] + ((long) this.f199861k[iM215973i]) <= j2);
            }
            this.f199872v = (536870912 & i) != 0;
            this.f199871u = Math.max(this.f199871u, j);
            int iM215973i2 = m215973i(this.f199865o);
            this.f199863m[iM215973i2] = j;
            this.f199860j[iM215973i2] = j2;
            this.f199861k[iM215973i2] = i2;
            this.f199862l[iM215973i2] = i;
            this.f199864n[iM215973i2] = a7r0Var;
            this.f199859i[iM215973i2] = 0;
            if (this.f199853c.m123129f() || !((wsy0) this.f199853c.m123125b()).f187986a.equals(this.f199876z)) {
                mhr0 mhr0Var = this.f199876z;
                if (mhr0Var == null) {
                    throw null;
                }
                this.f199853c.m123126c(this.f199866p + this.f199865o, new wsy0(mhr0Var, aly0.f70522a, null));
            }
            int i4 = this.f199865o + 1;
            this.f199865o = i4;
            int i5 = this.f199858h;
            if (i4 == i5) {
                int i6 = i5 + 1000;
                long[] jArr = new long[i6];
                long[] jArr2 = new long[i6];
                long[] jArr3 = new long[i6];
                int[] iArr = new int[i6];
                int[] iArr2 = new int[i6];
                a7r0[] a7r0VarArr = new a7r0[i6];
                int i7 = this.f199867q;
                int i8 = i5 - i7;
                System.arraycopy(this.f199860j, i7, jArr2, 0, i8);
                System.arraycopy(this.f199863m, this.f199867q, jArr3, 0, i8);
                System.arraycopy(this.f199862l, this.f199867q, iArr, 0, i8);
                System.arraycopy(this.f199861k, this.f199867q, iArr2, 0, i8);
                System.arraycopy(this.f199864n, this.f199867q, a7r0VarArr, 0, i8);
                System.arraycopy(this.f199859i, this.f199867q, jArr, 0, i8);
                int i9 = this.f199867q;
                System.arraycopy(this.f199860j, 0, jArr2, i8, i9);
                System.arraycopy(this.f199863m, 0, jArr3, i8, i9);
                System.arraycopy(this.f199862l, 0, iArr, i8, i9);
                System.arraycopy(this.f199861k, 0, iArr2, i8, i9);
                System.arraycopy(this.f199864n, 0, a7r0VarArr, i8, i9);
                System.arraycopy(this.f199859i, 0, jArr, i8, i9);
                this.f199860j = jArr2;
                this.f199863m = jArr3;
                this.f199862l = iArr;
                this.f199861k = iArr2;
                this.f199864n = a7r0VarArr;
                this.f199859i = jArr;
                this.f199867q = 0;
                this.f199858h = i6;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m215979o(mhr0 mhr0Var, f0y0 f0y0Var) {
        mhr0 mhr0Var2 = this.f199857g;
        zzae zzaeVar = mhr0Var2 == null ? null : mhr0Var2.f133895o;
        this.f199857g = mhr0Var;
        zzae zzaeVar2 = mhr0Var.f133895o;
        f0y0Var.f94022a = mhr0Var.m154635c(this.f199854d.mo102566a(mhr0Var));
        f0y0Var.f94023b = this.f199850C;
        if (mhr0Var2 == null || !ggw0.m126064f(zzaeVar, zzaeVar2)) {
            dly0 dly0Var = mhr0Var.f133895o != null ? new dly0(new zzrq(new zzsb(1), 6001)) : null;
            this.f199850C = dly0Var;
            f0y0Var.f94023b = dly0Var;
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m215980p() {
        if (this.f199850C != null) {
            this.f199850C = null;
            this.f199857g = null;
        }
    }

    /* JADX INFO: renamed from: q */
    public final synchronized void m215981q() {
        this.f199868r = 0;
        this.f199851a.m185788g();
    }

    /* JADX INFO: renamed from: r */
    public final boolean m215982r() {
        return this.f199868r != this.f199865o;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m215983s(int i) {
        if (this.f199850C == null) {
            return true;
        }
        int i2 = this.f199862l[i];
        return false;
    }

    /* JADX INFO: renamed from: t */
    public final synchronized boolean m215984t(mhr0 mhr0Var) {
        try {
            this.f199874x = false;
            if (ggw0.m126064f(mhr0Var, this.f199876z)) {
                return false;
            }
            if (this.f199853c.m123129f() || !((wsy0) this.f199853c.m123125b()).f187986a.equals(mhr0Var)) {
                this.f199876z = mhr0Var;
            } else {
                this.f199876z = ((wsy0) this.f199853c.m123125b()).f187986a;
            }
            boolean z = this.f199848A;
            mhr0 mhr0Var2 = this.f199876z;
            this.f199848A = z & uys0.m196369f(mhr0Var2.f133892l, mhr0Var2.f133889i);
            this.f199849B = false;
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: u */
    public final int m215985u() {
        return this.f199866p;
    }

    /* JADX INFO: renamed from: v */
    public final int m215986v() {
        return this.f199866p + this.f199868r;
    }

    /* JADX INFO: renamed from: w */
    public final synchronized int m215987w(long j, boolean z) throws Throwable {
        Throwable th;
        try {
            try {
                int i = this.f199868r;
                int iM215973i = m215973i(i);
                if (!m215982r() || j < this.f199863m[iM215973i]) {
                    return 0;
                }
                if (j <= this.f199871u || !z) {
                    int iM215972h = m215972h(iM215973i, this.f199865o - i, j, true);
                    if (iM215972h == -1) {
                        return 0;
                    }
                    return iM215972h;
                }
                try {
                    return this.f199865o - i;
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
    public final int m215988x() {
        return this.f199866p + this.f199865o;
    }

    @CallSuper
    /* JADX INFO: renamed from: y */
    public final int m215989y(f0y0 f0y0Var, ylx0 ylx0Var, int i, boolean z) {
        int iM215974j = m215974j(f0y0Var, ylx0Var, (i & 2) != 0, z, this.f199852b);
        if (iM215974j != -4) {
            return iM215974j;
        }
        if (!ylx0Var.m219213f()) {
            int i2 = i & 1;
            if ((i & 4) == 0) {
                ssy0 ssy0Var = this.f199851a;
                if (i2 != 0) {
                    ssy0Var.m185785d(ylx0Var, this.f199852b);
                    return -4;
                }
                ssy0Var.m185786e(ylx0Var, this.f199852b);
            } else if (i2 != 0) {
                return -4;
            }
            this.f199868r++;
        }
        return -4;
    }

    /* JADX INFO: renamed from: z */
    public final synchronized long m215990z() {
        return this.f199871u;
    }
}
