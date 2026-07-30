package p153l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zziz;

/* JADX INFO: loaded from: classes6.dex */
public final class oay0 {

    /* JADX INFO: renamed from: a */
    public final izy0 f145765a;

    /* JADX INFO: renamed from: b */
    public final Object f145766b;

    /* JADX INFO: renamed from: c */
    public final f2z0[] f145767c;

    /* JADX INFO: renamed from: d */
    public boolean f145768d;

    /* JADX INFO: renamed from: e */
    public boolean f145769e;

    /* JADX INFO: renamed from: f */
    public tay0 f145770f;

    /* JADX INFO: renamed from: g */
    public boolean f145771g;

    /* JADX INFO: renamed from: h */
    public final boolean[] f145772h;

    /* JADX INFO: renamed from: i */
    public final afy0[] f145773i;

    /* JADX INFO: renamed from: j */
    public final t5z0 f145774j;

    /* JADX INFO: renamed from: k */
    public final bdy0 f145775k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public oay0 f145776l;

    /* JADX INFO: renamed from: m */
    public q2z0 f145777m;

    /* JADX INFO: renamed from: n */
    public u5z0 f145778n;

    /* JADX INFO: renamed from: o */
    public long f145779o;

    public oay0(afy0[] afy0VarArr, long j, t5z0 t5z0Var, c6z0 c6z0Var, bdy0 bdy0Var, tay0 tay0Var, u5z0 u5z0Var) {
        this.f145773i = afy0VarArr;
        this.f145779o = j;
        this.f145774j = t5z0Var;
        this.f145775k = bdy0Var;
        kzy0 kzy0Var = tay0Var.f172814a;
        this.f145766b = kzy0Var.f129476a;
        this.f145770f = tay0Var;
        this.f145777m = q2z0.f155398d;
        this.f145778n = u5z0Var;
        this.f145767c = new f2z0[2];
        this.f145772h = new boolean[2];
        long j2 = tay0Var.f172815b;
        long j3 = tay0Var.f172817d;
        izy0 izy0VarM103657p = bdy0Var.m103657p(kzy0Var, c6z0Var, j2);
        this.f145765a = j3 != -9223372036854775807L ? new wxy0(izy0VarM103657p, true, 0L, j3) : izy0VarM103657p;
    }

    /* JADX INFO: renamed from: a */
    public final long m166858a(u5z0 u5z0Var, long j, boolean z) {
        return m166859b(u5z0Var, j, false, new boolean[2]);
    }

    /* JADX INFO: renamed from: b */
    public final long m166859b(u5z0 u5z0Var, long j, boolean z, boolean[] zArr) {
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= u5z0Var.f177697a) {
                break;
            }
            boolean[] zArr2 = this.f145772h;
            if (z || !u5z0Var.m194639a(this.f145778n, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            afy0[] afy0VarArr = this.f145773i;
            if (i2 >= 2) {
                break;
            }
            afy0VarArr[i2].mo97570c();
            i2++;
        }
        m166876s();
        this.f145778n = u5z0Var;
        m166877t();
        long jMo101546e = this.f145765a.mo101546e(u5z0Var.f177699c, this.f145772h, this.f145767c, zArr, j);
        int i3 = 0;
        while (true) {
            afy0[] afy0VarArr2 = this.f145773i;
            if (i3 >= 2) {
                break;
            }
            afy0VarArr2[i3].mo97570c();
            i3++;
        }
        this.f145769e = false;
        int i4 = 0;
        while (true) {
            f2z0[] f2z0VarArr = this.f145767c;
            if (i4 >= 2) {
                return jMo101546e;
            }
            if (f2z0VarArr[i4] != null) {
                lev0.m153958f(u5z0Var.m194640b(i4));
                this.f145773i[i4].mo97570c();
                this.f145769e = true;
            } else {
                lev0.m153958f(u5z0Var.f177699c[i4] == null);
            }
            i4++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final long m166860c() {
        if (!this.f145768d) {
            return this.f145770f.f172815b;
        }
        long jZzb = this.f145769e ? this.f145765a.zzb() : Long.MIN_VALUE;
        return jZzb == Long.MIN_VALUE ? this.f145770f.f172818e : jZzb;
    }

    /* JADX INFO: renamed from: d */
    public final long m166861d() {
        if (this.f145768d) {
            return this.f145765a.zzc();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: e */
    public final long m166862e() {
        return this.f145779o;
    }

    /* JADX INFO: renamed from: f */
    public final long m166863f() {
        return this.f145770f.f172815b + this.f145779o;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final oay0 m166864g() {
        return this.f145776l;
    }

    /* JADX INFO: renamed from: h */
    public final q2z0 m166865h() {
        return this.f145777m;
    }

    /* JADX INFO: renamed from: i */
    public final u5z0 m166866i() {
        return this.f145778n;
    }

    /* JADX INFO: renamed from: j */
    public final u5z0 m166867j(float f, d0u0 d0u0Var) throws zziz {
        u5z0 u5z0VarMo175537e = this.f145774j.mo175537e(this.f145773i, this.f145777m, this.f145770f.f172814a, d0u0Var);
        for (n5z0 n5z0Var : u5z0VarMo175537e.f177699c) {
        }
        return u5z0VarMo175537e;
    }

    /* JADX INFO: renamed from: k */
    public final void m166868k(long j, float f, long j2) {
        lev0.m153958f(m166878u());
        long j3 = j - this.f145779o;
        z9y0 z9y0Var = new z9y0();
        z9y0Var.m219093e(j3);
        z9y0Var.m219094f(f);
        z9y0Var.m219092d(j2);
        this.f145765a.mo101542a(new gay0(z9y0Var, null));
    }

    /* JADX INFO: renamed from: l */
    public final void m166869l(float f, d0u0 d0u0Var) throws zziz {
        this.f145768d = true;
        this.f145777m = this.f145765a.zzh();
        u5z0 u5z0VarM166867j = m166867j(f, d0u0Var);
        tay0 tay0Var = this.f145770f;
        long jMax = tay0Var.f172815b;
        long j = tay0Var.f172818e;
        if (j != -9223372036854775807L && jMax >= j) {
            jMax = Math.max(0L, j - 1);
        }
        long jM166858a = m166858a(u5z0VarM166867j, jMax, false);
        long j2 = this.f145779o;
        tay0 tay0Var2 = this.f145770f;
        this.f145779o = j2 + (tay0Var2.f172815b - jM166858a);
        this.f145770f = tay0Var2.m189963b(jM166858a);
    }

    /* JADX INFO: renamed from: m */
    public final void m166870m(long j) {
        lev0.m153958f(m166878u());
        if (this.f145768d) {
            this.f145765a.mo101543b(j - this.f145779o);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m166871n() {
        m166876s();
        izy0 izy0Var = this.f145765a;
        try {
            boolean z = izy0Var instanceof wxy0;
            bdy0 bdy0Var = this.f145775k;
            if (z) {
                bdy0Var.m103650i(((wxy0) izy0Var).f191545a);
            } else {
                bdy0Var.m103650i(izy0Var);
            }
        } catch (RuntimeException e) {
            y4w0.m214276d("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m166872o(@Nullable oay0 oay0Var) {
        if (oay0Var == this.f145776l) {
            return;
        }
        m166876s();
        this.f145776l = oay0Var;
        m166877t();
    }

    /* JADX INFO: renamed from: p */
    public final void m166873p(long j) {
        this.f145779o = 1000000000000L;
    }

    /* JADX INFO: renamed from: q */
    public final void m166874q() {
        izy0 izy0Var = this.f145765a;
        if (izy0Var instanceof wxy0) {
            long j = this.f145770f.f172817d;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            ((wxy0) izy0Var).m208462h(0L, j);
        }
    }

    /* JADX INFO: renamed from: r */
    public final boolean m166875r() {
        if (this.f145768d) {
            return !this.f145769e || this.f145765a.zzb() == Long.MIN_VALUE;
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    public final void m166876s() {
        if (!m166878u()) {
            return;
        }
        int i = 0;
        while (true) {
            u5z0 u5z0Var = this.f145778n;
            if (i >= u5z0Var.f177697a) {
                return;
            }
            u5z0Var.m194640b(i);
            n5z0 n5z0Var = this.f145778n.f177699c[i];
            i++;
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m166877t() {
        if (!m166878u()) {
            return;
        }
        int i = 0;
        while (true) {
            u5z0 u5z0Var = this.f145778n;
            if (i >= u5z0Var.f177697a) {
                return;
            }
            u5z0Var.m194640b(i);
            n5z0 n5z0Var = this.f145778n.f177699c[i];
            i++;
        }
    }

    /* JADX INFO: renamed from: u */
    public final boolean m166878u() {
        return this.f145776l == null;
    }
}
