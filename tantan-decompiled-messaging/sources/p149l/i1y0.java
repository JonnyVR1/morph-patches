package p149l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zziz;

/* JADX INFO: loaded from: classes6.dex */
public final class i1y0 {

    /* JADX INFO: renamed from: a */
    public final cqy0 f110509a;

    /* JADX INFO: renamed from: b */
    public final Object f110510b;

    /* JADX INFO: renamed from: c */
    public final zsy0[] f110511c;

    /* JADX INFO: renamed from: d */
    public boolean f110512d;

    /* JADX INFO: renamed from: e */
    public boolean f110513e;

    /* JADX INFO: renamed from: f */
    public n1y0 f110514f;

    /* JADX INFO: renamed from: g */
    public boolean f110515g;

    /* JADX INFO: renamed from: h */
    public final boolean[] f110516h;

    /* JADX INFO: renamed from: i */
    public final u5y0[] f110517i;

    /* JADX INFO: renamed from: j */
    public final nwy0 f110518j;

    /* JADX INFO: renamed from: k */
    public final v3y0 f110519k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public i1y0 f110520l;

    /* JADX INFO: renamed from: m */
    public kty0 f110521m;

    /* JADX INFO: renamed from: n */
    public owy0 f110522n;

    /* JADX INFO: renamed from: o */
    public long f110523o;

    public i1y0(u5y0[] u5y0VarArr, long j, nwy0 nwy0Var, wwy0 wwy0Var, v3y0 v3y0Var, n1y0 n1y0Var, owy0 owy0Var) {
        this.f110517i = u5y0VarArr;
        this.f110523o = j;
        this.f110518j = nwy0Var;
        this.f110519k = v3y0Var;
        eqy0 eqy0Var = n1y0Var.f136736a;
        this.f110510b = eqy0Var.f92867a;
        this.f110514f = n1y0Var;
        this.f110521m = kty0.f124626d;
        this.f110522n = owy0Var;
        this.f110511c = new zsy0[2];
        this.f110516h = new boolean[2];
        long j2 = n1y0Var.f136737b;
        long j3 = n1y0Var.f136739d;
        cqy0 cqy0VarM196890p = v3y0Var.m196890p(eqy0Var, wwy0Var, j2);
        this.f110509a = j3 != -9223372036854775807L ? new qoy0(cqy0VarM196890p, true, 0L, j3) : cqy0VarM196890p;
    }

    /* JADX INFO: renamed from: a */
    public final long m134019a(owy0 owy0Var, long j, boolean z) {
        return m134020b(owy0Var, j, false, new boolean[2]);
    }

    /* JADX INFO: renamed from: b */
    public final long m134020b(owy0 owy0Var, long j, boolean z, boolean[] zArr) {
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= owy0Var.f146093a) {
                break;
            }
            boolean[] zArr2 = this.f110516h;
            if (z || !owy0Var.m166452a(this.f110522n, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            u5y0[] u5y0VarArr = this.f110517i;
            if (i2 >= 2) {
                break;
            }
            u5y0VarArr[i2].mo146606c();
            i2++;
        }
        m134037s();
        this.f110522n = owy0Var;
        m134038t();
        long jMo108304e = this.f110509a.mo108304e(owy0Var.f146095c, this.f110516h, this.f110511c, zArr, j);
        int i3 = 0;
        while (true) {
            u5y0[] u5y0VarArr2 = this.f110517i;
            if (i3 >= 2) {
                break;
            }
            u5y0VarArr2[i3].mo146606c();
            i3++;
        }
        this.f110513e = false;
        int i4 = 0;
        while (true) {
            zsy0[] zsy0VarArr = this.f110511c;
            if (i4 >= 2) {
                return jMo108304e;
            }
            if (zsy0VarArr[i4] != null) {
                f5v0.m119535f(owy0Var.m166453b(i4));
                this.f110517i[i4].mo146606c();
                this.f110513e = true;
            } else {
                f5v0.m119535f(owy0Var.f146095c[i4] == null);
            }
            i4++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final long m134021c() {
        if (!this.f110512d) {
            return this.f110514f.f136737b;
        }
        long jZzb = this.f110513e ? this.f110509a.zzb() : Long.MIN_VALUE;
        return jZzb == Long.MIN_VALUE ? this.f110514f.f136740e : jZzb;
    }

    /* JADX INFO: renamed from: d */
    public final long m134022d() {
        if (this.f110512d) {
            return this.f110509a.zzc();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: e */
    public final long m134023e() {
        return this.f110523o;
    }

    /* JADX INFO: renamed from: f */
    public final long m134024f() {
        return this.f110514f.f136737b + this.f110523o;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final i1y0 m134025g() {
        return this.f110520l;
    }

    /* JADX INFO: renamed from: h */
    public final kty0 m134026h() {
        return this.f110521m;
    }

    /* JADX INFO: renamed from: i */
    public final owy0 m134027i() {
        return this.f110522n;
    }

    /* JADX INFO: renamed from: j */
    public final owy0 m134028j(float f, xqt0 xqt0Var) throws zziz {
        owy0 owy0VarMo147668e = this.f110518j.mo147668e(this.f110517i, this.f110521m, this.f110514f.f136736a, xqt0Var);
        for (hwy0 hwy0Var : owy0VarMo147668e.f146095c) {
        }
        return owy0VarMo147668e;
    }

    /* JADX INFO: renamed from: k */
    public final void m134029k(long j, float f, long j2) {
        f5v0.m119535f(m134039u());
        long j3 = j - this.f110523o;
        t0y0 t0y0Var = new t0y0();
        t0y0Var.m186883e(j3);
        t0y0Var.m186884f(f);
        t0y0Var.m186882d(j2);
        this.f110509a.mo103896a(new a1y0(t0y0Var, null));
    }

    /* JADX INFO: renamed from: l */
    public final void m134030l(float f, xqt0 xqt0Var) throws zziz {
        this.f110512d = true;
        this.f110521m = this.f110509a.zzh();
        owy0 owy0VarM134028j = m134028j(f, xqt0Var);
        n1y0 n1y0Var = this.f110514f;
        long jMax = n1y0Var.f136737b;
        long j = n1y0Var.f136740e;
        if (j != -9223372036854775807L && jMax >= j) {
            jMax = Math.max(0L, j - 1);
        }
        long jM134019a = m134019a(owy0VarM134028j, jMax, false);
        long j2 = this.f110523o;
        n1y0 n1y0Var2 = this.f110514f;
        this.f110523o = j2 + (n1y0Var2.f136737b - jM134019a);
        this.f110514f = n1y0Var2.m157518b(jM134019a);
    }

    /* JADX INFO: renamed from: m */
    public final void m134031m(long j) {
        f5v0.m119535f(m134039u());
        if (this.f110512d) {
            this.f110509a.mo103897b(j - this.f110523o);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m134032n() {
        m134037s();
        cqy0 cqy0Var = this.f110509a;
        try {
            boolean z = cqy0Var instanceof qoy0;
            v3y0 v3y0Var = this.f110519k;
            if (z) {
                v3y0Var.m196883i(((qoy0) cqy0Var).f155648a);
            } else {
                v3y0Var.m196883i(cqy0Var);
            }
        } catch (RuntimeException e) {
            svv0.m186109d("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m134033o(@Nullable i1y0 i1y0Var) {
        if (i1y0Var == this.f110520l) {
            return;
        }
        m134037s();
        this.f110520l = i1y0Var;
        m134038t();
    }

    /* JADX INFO: renamed from: p */
    public final void m134034p(long j) {
        this.f110523o = 1000000000000L;
    }

    /* JADX INFO: renamed from: q */
    public final void m134035q() {
        cqy0 cqy0Var = this.f110509a;
        if (cqy0Var instanceof qoy0) {
            long j = this.f110514f.f136739d;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            ((qoy0) cqy0Var).m175787h(0L, j);
        }
    }

    /* JADX INFO: renamed from: r */
    public final boolean m134036r() {
        if (this.f110512d) {
            return !this.f110513e || this.f110509a.zzb() == Long.MIN_VALUE;
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    public final void m134037s() {
        if (!m134039u()) {
            return;
        }
        int i = 0;
        while (true) {
            owy0 owy0Var = this.f110522n;
            if (i >= owy0Var.f146093a) {
                return;
            }
            owy0Var.m166453b(i);
            hwy0 hwy0Var = this.f110522n.f146095c[i];
            i++;
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m134038t() {
        if (!m134039u()) {
            return;
        }
        int i = 0;
        while (true) {
            owy0 owy0Var = this.f110522n;
            if (i >= owy0Var.f146093a) {
                return;
            }
            owy0Var.m166453b(i);
            hwy0 hwy0Var = this.f110522n.f146095c[i];
            i++;
        }
    }

    /* JADX INFO: renamed from: u */
    public final boolean m134039u() {
        return this.f110520l == null;
    }
}
