package p149l;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.C2111b7;

/* JADX INFO: loaded from: classes6.dex */
public final class w1y0 {

    /* JADX INFO: renamed from: a */
    public final bnt0 f184067a = new bnt0();

    /* JADX INFO: renamed from: b */
    public final qpt0 f184068b = new qpt0();

    /* JADX INFO: renamed from: c */
    public final q6y0 f184069c;

    /* JADX INFO: renamed from: d */
    public final ojv0 f184070d;

    /* JADX INFO: renamed from: e */
    public long f184071e;

    /* JADX INFO: renamed from: f */
    public int f184072f;

    /* JADX INFO: renamed from: g */
    public boolean f184073g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public i1y0 f184074h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public i1y0 f184075i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public i1y0 f184076j;

    /* JADX INFO: renamed from: k */
    public int f184077k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public Object f184078l;

    /* JADX INFO: renamed from: m */
    public long f184079m;

    /* JADX INFO: renamed from: n */
    public final vxx0 f184080n;

    public w1y0(q6y0 q6y0Var, ojv0 ojv0Var, vxx0 vxx0Var) {
        this.f184069c = q6y0Var;
        this.f184070d = ojv0Var;
        this.f184080n = vxx0Var;
    }

    /* JADX INFO: renamed from: A */
    public static eqy0 m200984A(xqt0 xqt0Var, Object obj, long j, long j2, qpt0 qpt0Var, bnt0 bnt0Var) {
        xqt0Var.mo112558n(obj, bnt0Var);
        xqt0Var.mo112552e(bnt0Var.f76445c, qpt0Var, 0L);
        xqt0Var.mo112550a(obj);
        bnt0Var.m102861b();
        xqt0Var.mo112558n(obj, bnt0Var);
        int iM102863d = bnt0Var.m102863d(j);
        return iM102863d == -1 ? new eqy0(obj, j2, bnt0Var.m102862c(j)) : new eqy0(obj, iM102863d, bnt0Var.m102864e(iM102863d), j2);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m200985c(eqy0 eqy0Var) {
        return !eqy0Var.m117807b() && eqy0Var.f92871e == -1;
    }

    /* JADX INFO: renamed from: B */
    public final void m200986B() {
        final ghw0 ghw0Var = new ghw0();
        for (i1y0 i1y0VarM134025g = this.f184074h; i1y0VarM134025g != null; i1y0VarM134025g = i1y0VarM134025g.m134025g()) {
            ghw0Var.m126240g(i1y0VarM134025g.f110514f.f136736a);
        }
        i1y0 i1y0Var = this.f184075i;
        final eqy0 eqy0Var = i1y0Var == null ? null : i1y0Var.f110514f.f136736a;
        this.f184070d.mo164792g(new Runnable() { // from class: l.r1y0
            @Override // java.lang.Runnable
            public final void run() {
                this.f157347a.m201000n(ghw0Var, eqy0Var);
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public final boolean m200987C(xqt0 xqt0Var, eqy0 eqy0Var, boolean z) {
        int iMo112550a = xqt0Var.mo112550a(eqy0Var.f92867a);
        return !xqt0Var.mo112552e(xqt0Var.mo112551d(iMo112550a, this.f184067a, false).f76445c, this.f184068b, 0L).f155821h && xqt0Var.m210612i(iMo112550a, this.f184067a, this.f184068b, this.f184072f, this.f184073g) == -1 && z;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m200988a(xqt0 xqt0Var, eqy0 eqy0Var) {
        if (m200985c(eqy0Var)) {
            return xqt0Var.mo112552e(xqt0Var.mo112558n(eqy0Var.f92867a, this.f184067a).f76445c, this.f184068b, 0L).f155828o == xqt0Var.mo112550a(eqy0Var.f92867a);
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m200989b(xqt0 xqt0Var) {
        xqt0 xqt0Var2;
        i1y0 i1y0VarM134025g = this.f184074h;
        if (i1y0VarM134025g == null) {
            return true;
        }
        int iMo112550a = xqt0Var.mo112550a(i1y0VarM134025g.f110510b);
        while (true) {
            xqt0Var2 = xqt0Var;
            iMo112550a = xqt0Var2.m210612i(iMo112550a, this.f184067a, this.f184068b, this.f184072f, this.f184073g);
            while (true) {
                i1y0VarM134025g.getClass();
                if (i1y0VarM134025g.m134025g() == null || i1y0VarM134025g.f110514f.f136742g) {
                    break;
                }
                i1y0VarM134025g = i1y0VarM134025g.m134025g();
            }
            i1y0 i1y0VarM134025g2 = i1y0VarM134025g.m134025g();
            if (iMo112550a == -1 || i1y0VarM134025g2 == null || xqt0Var2.mo112550a(i1y0VarM134025g2.f110510b) != iMo112550a) {
                break;
            }
            i1y0VarM134025g = i1y0VarM134025g2;
            xqt0Var = xqt0Var2;
        }
        boolean zM201003q = m201003q(i1y0VarM134025g);
        i1y0VarM134025g.f110514f = m200997k(xqt0Var2, i1y0VarM134025g.f110514f);
        return !zM201003q;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final i1y0 m200990d() {
        i1y0 i1y0Var = this.f184074h;
        if (i1y0Var == null) {
            return null;
        }
        if (i1y0Var == this.f184075i) {
            this.f184075i = i1y0Var.m134025g();
        }
        i1y0Var.m134032n();
        int i = this.f184077k - 1;
        this.f184077k = i;
        if (i == 0) {
            this.f184076j = null;
            i1y0 i1y0Var2 = this.f184074h;
            this.f184078l = i1y0Var2.f110510b;
            this.f184079m = i1y0Var2.f110514f.f136736a.f92870d;
        }
        this.f184074h = this.f184074h.m134025g();
        m200986B();
        return this.f184074h;
    }

    /* JADX INFO: renamed from: e */
    public final i1y0 m200991e() {
        i1y0 i1y0Var = this.f184075i;
        f5v0.m119531b(i1y0Var);
        this.f184075i = i1y0Var.m134025g();
        m200986B();
        i1y0 i1y0Var2 = this.f184075i;
        f5v0.m119531b(i1y0Var2);
        return i1y0Var2;
    }

    /* JADX INFO: renamed from: f */
    public final i1y0 m200992f(n1y0 n1y0Var) {
        i1y0 i1y0Var = this.f184076j;
        i1y0 i1y0VarM12554U = C2111b7.m12554U(this.f184080n.f183485a, n1y0Var, i1y0Var == null ? 1000000000000L : (i1y0Var.m134023e() + i1y0Var.f110514f.f136740e) - n1y0Var.f136737b);
        i1y0 i1y0Var2 = this.f184076j;
        if (i1y0Var2 != null) {
            i1y0Var2.m134033o(i1y0VarM12554U);
        } else {
            this.f184074h = i1y0VarM12554U;
            this.f184075i = i1y0VarM12554U;
        }
        this.f184078l = null;
        this.f184076j = i1y0VarM12554U;
        this.f184077k++;
        m200986B();
        return i1y0VarM12554U;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final i1y0 m200993g() {
        return this.f184076j;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final i1y0 m200994h() {
        return this.f184074h;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final i1y0 m200995i() {
        return this.f184075i;
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public final n1y0 m200996j(long j, y3y0 y3y0Var) {
        i1y0 i1y0Var = this.f184076j;
        return i1y0Var == null ? m201010x(y3y0Var.f195863a, y3y0Var.f195864b, y3y0Var.f195865c, y3y0Var.f195880r) : m201009w(y3y0Var.f195863a, i1y0Var, j);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0065  */
    /* JADX WARN: Code duplicated, block: B:21:0x0069  */
    /* JADX INFO: renamed from: k */
    public final n1y0 m200997k(xqt0 xqt0Var, n1y0 n1y0Var) {
        long j;
        long jM102867h;
        long j2;
        long j3;
        int i;
        int i2;
        eqy0 eqy0Var = n1y0Var.f136736a;
        boolean zM200985c = m200985c(eqy0Var);
        boolean zM200988a = m200988a(xqt0Var, eqy0Var);
        boolean zM200987C = m200987C(xqt0Var, eqy0Var, zM200985c);
        xqt0Var.mo112558n(n1y0Var.f136736a.f92867a, this.f184067a);
        if (eqy0Var.m117807b() || (i2 = eqy0Var.f92871e) == -1) {
            j = -9223372036854775807L;
        } else {
            this.f184067a.m102868i(i2);
            j = 0;
        }
        if (!eqy0Var.m117807b()) {
            if (j != -9223372036854775807L) {
                j2 = 0;
                j3 = 0;
            } else {
                jM102867h = this.f184067a.f76446d;
            }
            if (eqy0Var.m117807b()) {
                this.f184067a.m102873n(eqy0Var.f92868b);
            } else {
                i = eqy0Var.f92871e;
                if (i != -1) {
                    this.f184067a.m102873n(i);
                }
            }
            return new n1y0(eqy0Var, n1y0Var.f136737b, n1y0Var.f136738c, j3, j2, false, zM200985c, zM200988a, zM200987C);
        }
        jM102867h = this.f184067a.m102867h(eqy0Var.f92868b, eqy0Var.f92869c);
        j2 = jM102867h;
        j3 = j;
        if (eqy0Var.m117807b()) {
            this.f184067a.m102873n(eqy0Var.f92868b);
        } else {
            i = eqy0Var.f92871e;
            if (i != -1) {
                this.f184067a.m102873n(i);
            }
        }
        return new n1y0(eqy0Var, n1y0Var.f136737b, n1y0Var.f136738c, j3, j2, false, zM200985c, zM200988a, zM200987C);
    }

    /* JADX INFO: renamed from: l */
    public final eqy0 m200998l(xqt0 xqt0Var, Object obj, long j) {
        long j2;
        int iMo112550a;
        int i = xqt0Var.mo112558n(obj, this.f184067a).f76445c;
        Object obj2 = this.f184078l;
        if (obj2 == null || (iMo112550a = xqt0Var.mo112550a(obj2)) == -1 || xqt0Var.mo112551d(iMo112550a, this.f184067a, false).f76445c != i) {
            i1y0 i1y0VarM134025g = this.f184074h;
            while (true) {
                if (i1y0VarM134025g == null) {
                    i1y0 i1y0VarM134025g2 = this.f184074h;
                    while (true) {
                        if (i1y0VarM134025g2 != null) {
                            int iMo112550a2 = xqt0Var.mo112550a(i1y0VarM134025g2.f110510b);
                            if (iMo112550a2 != -1 && xqt0Var.mo112551d(iMo112550a2, this.f184067a, false).f76445c == i) {
                                j2 = i1y0VarM134025g2.f110514f.f136736a.f92870d;
                                break;
                            }
                            i1y0VarM134025g2 = i1y0VarM134025g2.m134025g();
                        } else {
                            j2 = this.f184071e;
                            this.f184071e = 1 + j2;
                            if (this.f184074h != null) {
                                break;
                            }
                            this.f184078l = obj;
                            this.f184079m = j2;
                            break;
                        }
                    }
                } else {
                    if (i1y0VarM134025g.f110510b.equals(obj)) {
                        j2 = i1y0VarM134025g.f110514f.f136736a.f92870d;
                        break;
                    }
                    i1y0VarM134025g = i1y0VarM134025g.m134025g();
                }
            }
        } else {
            j2 = this.f184079m;
        }
        long j3 = j2;
        xqt0Var.mo112558n(obj, this.f184067a);
        xqt0Var.mo112552e(this.f184067a.f76445c, this.f184068b, 0L);
        int iMo112550a3 = xqt0Var.mo112550a(obj);
        Object obj3 = obj;
        while (true) {
            qpt0 qpt0Var = this.f184068b;
            int i2 = qpt0Var.f155827n;
            bnt0 bnt0Var = this.f184067a;
            if (iMo112550a3 < i2) {
                return m200984A(xqt0Var, obj3, j, j3, qpt0Var, bnt0Var);
            }
            xqt0Var.mo112551d(iMo112550a3, bnt0Var, true);
            this.f184067a.m102861b();
            bnt0 bnt0Var2 = this.f184067a;
            if (bnt0Var2.m102863d(bnt0Var2.f76446d) != -1) {
                obj3 = this.f184067a.f76444b;
                obj3.getClass();
            }
            iMo112550a3--;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m200999m() {
        if (this.f184077k == 0) {
            return;
        }
        i1y0 i1y0VarM134025g = this.f184074h;
        f5v0.m119531b(i1y0VarM134025g);
        this.f184078l = i1y0VarM134025g.f110510b;
        this.f184079m = i1y0VarM134025g.f110514f.f136736a.f92870d;
        while (i1y0VarM134025g != null) {
            i1y0VarM134025g.m134032n();
            i1y0VarM134025g = i1y0VarM134025g.m134025g();
        }
        this.f184074h = null;
        this.f184076j = null;
        this.f184075i = null;
        this.f184077k = 0;
        m200986B();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m201000n(ghw0 ghw0Var, eqy0 eqy0Var) {
        this.f184069c.mo106367J(ghw0Var.m126243j(), eqy0Var);
    }

    /* JADX INFO: renamed from: o */
    public final void m201001o(long j) {
        i1y0 i1y0Var = this.f184076j;
        if (i1y0Var != null) {
            i1y0Var.m134031m(j);
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m201002p(cqy0 cqy0Var) {
        i1y0 i1y0Var = this.f184076j;
        return i1y0Var != null && i1y0Var.f110509a == cqy0Var;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m201003q(i1y0 i1y0Var) {
        f5v0.m119531b(i1y0Var);
        boolean z = false;
        if (i1y0Var.equals(this.f184076j)) {
            return false;
        }
        this.f184076j = i1y0Var;
        while (i1y0Var.m134025g() != null) {
            i1y0Var = i1y0Var.m134025g();
            i1y0Var.getClass();
            if (i1y0Var == this.f184075i) {
                this.f184075i = this.f184074h;
                z = true;
            }
            i1y0Var.m134032n();
            this.f184077k--;
        }
        i1y0 i1y0Var2 = this.f184076j;
        i1y0Var2.getClass();
        i1y0Var2.m134033o(null);
        m200986B();
        return z;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m201004r() {
        i1y0 i1y0Var = this.f184076j;
        if (i1y0Var != null) {
            return !i1y0Var.f110514f.f136744i && i1y0Var.m134036r() && this.f184076j.f110514f.f136740e != -9223372036854775807L && this.f184077k < 100;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007b  */
    /* JADX INFO: renamed from: s */
    public final boolean m201005s(xqt0 xqt0Var, long j, long j2) {
        n1y0 n1y0VarM200997k;
        boolean z;
        i1y0 i1y0Var = null;
        for (i1y0 i1y0VarM134025g = this.f184074h; i1y0VarM134025g != null; i1y0VarM134025g = i1y0VarM134025g.m134025g()) {
            n1y0 n1y0Var = i1y0VarM134025g.f110514f;
            if (i1y0Var == null) {
                n1y0VarM200997k = m200997k(xqt0Var, n1y0Var);
            } else {
                n1y0 n1y0VarM201009w = m201009w(xqt0Var, i1y0Var, j);
                if (n1y0VarM201009w == null) {
                    return !m201003q(i1y0Var);
                }
                if (n1y0Var.f136737b != n1y0VarM201009w.f136737b || !n1y0Var.f136736a.equals(n1y0VarM201009w.f136736a)) {
                    return !m201003q(i1y0Var);
                }
                n1y0VarM200997k = n1y0VarM201009w;
            }
            i1y0VarM134025g.f110514f = n1y0VarM200997k.m157517a(n1y0Var.f136738c);
            long j3 = n1y0Var.f136740e;
            long j4 = n1y0VarM200997k.f136740e;
            if (j3 != -9223372036854775807L && j3 != j4) {
                i1y0VarM134025g.m134035q();
                long j5 = n1y0VarM200997k.f136740e;
                long jM134023e = j5 == -9223372036854775807L ? Long.MAX_VALUE : j5 + i1y0VarM134025g.m134023e();
                if (i1y0VarM134025g == this.f184075i) {
                    boolean z2 = i1y0VarM134025g.f110514f.f136741f;
                    if (j2 == Long.MIN_VALUE || j2 >= jM134023e) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                return (m201003q(i1y0VarM134025g) || z) ? false : true;
            }
            i1y0Var = i1y0VarM134025g;
        }
        return true;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m201006t(xqt0 xqt0Var, int i) {
        this.f184072f = i;
        return m200989b(xqt0Var);
    }

    /* JADX INFO: renamed from: u */
    public final boolean m201007u(xqt0 xqt0Var, boolean z) {
        this.f184073g = z;
        return m200989b(xqt0Var);
    }

    /* JADX INFO: renamed from: v */
    public final long m201008v(xqt0 xqt0Var, Object obj, int i) {
        xqt0Var.mo112558n(obj, this.f184067a);
        this.f184067a.m102868i(i);
        this.f184067a.m102870k(i);
        return 0L;
    }

    @Nullable
    /* JADX INFO: renamed from: w */
    public final n1y0 m201009w(xqt0 xqt0Var, i1y0 i1y0Var, long j) {
        xqt0 xqt0Var2;
        Object obj;
        long j2;
        n1y0 n1y0Var = i1y0Var.f110514f;
        long jM134023e = i1y0Var.m134023e() + n1y0Var.f136740e;
        boolean z = n1y0Var.f136742g;
        long j3 = jM134023e - j;
        eqy0 eqy0Var = n1y0Var.f136736a;
        if (!z) {
            xqt0Var.mo112558n(eqy0Var.f92867a, this.f184067a);
            if (!eqy0Var.m117807b()) {
                int i = eqy0Var.f92871e;
                if (i != -1) {
                    this.f184067a.m102872m(i);
                }
                bnt0 bnt0Var = this.f184067a;
                int i2 = eqy0Var.f92871e;
                int iM102864e = bnt0Var.m102864e(i2);
                bnt0Var.m102873n(i2);
                int iM102860a = this.f184067a.m102860a(eqy0Var.f92871e);
                Object obj2 = eqy0Var.f92867a;
                if (iM102864e != iM102860a) {
                    return m201011y(xqt0Var, obj2, eqy0Var.f92871e, iM102864e, n1y0Var.f136740e, eqy0Var.f92870d);
                }
                m201008v(xqt0Var, obj2, eqy0Var.f92871e);
                return m201012z(xqt0Var, eqy0Var.f92867a, 0L, n1y0Var.f136740e, eqy0Var.f92870d);
            }
            int i3 = eqy0Var.f92868b;
            if (this.f184067a.m102860a(i3) == -1) {
                return null;
            }
            int iM102865f = this.f184067a.m102865f(i3, eqy0Var.f92869c);
            if (iM102865f < 0) {
                return m201011y(xqt0Var, eqy0Var.f92867a, i3, iM102865f, n1y0Var.f136738c, eqy0Var.f92870d);
            }
            long jLongValue = n1y0Var.f136738c;
            if (jLongValue == -9223372036854775807L) {
                qpt0 qpt0Var = this.f184068b;
                bnt0 bnt0Var2 = this.f184067a;
                Pair pairM210614m = xqt0Var.m210614m(qpt0Var, bnt0Var2, bnt0Var2.f76445c, -9223372036854775807L, Math.max(0L, j3));
                xqt0Var2 = xqt0Var;
                if (pairM210614m == null) {
                    return null;
                }
                jLongValue = ((Long) pairM210614m.second).longValue();
            } else {
                xqt0Var2 = xqt0Var;
            }
            m201008v(xqt0Var2, eqy0Var.f92867a, eqy0Var.f92868b);
            return m201012z(xqt0Var, eqy0Var.f92867a, Math.max(0L, jLongValue), n1y0Var.f136738c, eqy0Var.f92870d);
        }
        long j4 = 0;
        int iM210612i = xqt0Var.m210612i(xqt0Var.mo112550a(eqy0Var.f92867a), this.f184067a, this.f184068b, this.f184072f, this.f184073g);
        if (iM210612i == -1) {
            return null;
        }
        int i4 = xqt0Var.mo112551d(iM210612i, this.f184067a, true).f76445c;
        Object obj3 = this.f184067a.f76444b;
        obj3.getClass();
        long j5 = n1y0Var.f136736a.f92870d;
        if (xqt0Var.mo112552e(i4, this.f184068b, 0L).f155827n == iM210612i) {
            Pair pairM210614m2 = xqt0Var.m210614m(this.f184068b, this.f184067a, i4, -9223372036854775807L, Math.max(0L, j3));
            if (pairM210614m2 == null) {
                return null;
            }
            Object obj4 = pairM210614m2.first;
            long jLongValue2 = ((Long) pairM210614m2.second).longValue();
            i1y0 i1y0VarM134025g = i1y0Var.m134025g();
            if (i1y0VarM134025g == null || !i1y0VarM134025g.f110510b.equals(obj4)) {
                j5 = this.f184071e;
                this.f184071e = 1 + j5;
            } else {
                j5 = i1y0VarM134025g.f110514f.f136736a.f92870d;
            }
            obj = obj4;
            j2 = jLongValue2;
            j4 = -9223372036854775807L;
        } else {
            obj = obj3;
            j2 = 0;
        }
        eqy0 eqy0VarM200984A = m200984A(xqt0Var, obj, j2, j5, this.f184068b, this.f184067a);
        if (j4 != -9223372036854775807L && n1y0Var.f136738c != -9223372036854775807L) {
            xqt0Var.mo112558n(n1y0Var.f136736a.f92867a, this.f184067a).m102861b();
            this.f184067a.m102866g();
        }
        return m201010x(xqt0Var, eqy0VarM200984A, j4, j2);
    }

    @Nullable
    /* JADX INFO: renamed from: x */
    public final n1y0 m201010x(xqt0 xqt0Var, eqy0 eqy0Var, long j, long j2) {
        xqt0Var.mo112558n(eqy0Var.f92867a, this.f184067a);
        boolean zM117807b = eqy0Var.m117807b();
        Object obj = eqy0Var.f92867a;
        return zM117807b ? m201011y(xqt0Var, obj, eqy0Var.f92868b, eqy0Var.f92869c, j, eqy0Var.f92870d) : m201012z(xqt0Var, obj, j2, j, eqy0Var.f92870d);
    }

    /* JADX INFO: renamed from: y */
    public final n1y0 m201011y(xqt0 xqt0Var, Object obj, int i, int i2, long j, long j2) {
        eqy0 eqy0Var = new eqy0(obj, i, i2, j2);
        Object obj2 = eqy0Var.f92867a;
        long jM102867h = xqt0Var.mo112558n(obj2, this.f184067a).m102867h(eqy0Var.f92868b, eqy0Var.f92869c);
        if (i2 == this.f184067a.m102864e(i)) {
            this.f184067a.m102869j();
        }
        this.f184067a.m102873n(eqy0Var.f92868b);
        long jMax = 0;
        if (jM102867h != -9223372036854775807L && jM102867h <= 0) {
            jMax = Math.max(0L, (-1) + jM102867h);
        }
        return new n1y0(eqy0Var, jMax, j, -9223372036854775807L, jM102867h, false, false, false, false);
    }

    /* JADX INFO: renamed from: z */
    public final n1y0 m201012z(xqt0 xqt0Var, Object obj, long j, long j2, long j3) {
        long j4;
        long j5;
        long j6;
        xqt0Var.mo112558n(obj, this.f184067a);
        int iM102862c = this.f184067a.m102862c(j);
        if (iM102862c != -1) {
            this.f184067a.m102872m(iM102862c);
        }
        bnt0 bnt0Var = this.f184067a;
        if (iM102862c == -1) {
            bnt0Var.m102861b();
        } else {
            bnt0Var.m102873n(iM102862c);
        }
        eqy0 eqy0Var = new eqy0(obj, j3, iM102862c);
        boolean zM200985c = m200985c(eqy0Var);
        boolean zM200988a = m200988a(xqt0Var, eqy0Var);
        boolean zM200987C = m200987C(xqt0Var, eqy0Var, zM200985c);
        if (iM102862c != -1) {
            this.f184067a.m102873n(iM102862c);
        }
        if (iM102862c != -1) {
            this.f184067a.m102868i(iM102862c);
            j4 = 0;
        } else {
            j4 = -9223372036854775807L;
        }
        if (j4 != -9223372036854775807L) {
            j6 = 0;
            j5 = 0;
        } else {
            j5 = this.f184067a.f76446d;
            j6 = j4;
        }
        return new n1y0(eqy0Var, (j5 == -9223372036854775807L || j < j5) ? j : Math.max(0L, j5 - 1), j2, j6, j5, false, zM200985c, zM200988a, zM200987C);
    }
}
