package p153l;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.C2134b7;

/* JADX INFO: loaded from: classes6.dex */
public final class cby0 {

    /* JADX INFO: renamed from: a */
    public final hwt0 f80864a = new hwt0();

    /* JADX INFO: renamed from: b */
    public final wyt0 f80865b = new wyt0();

    /* JADX INFO: renamed from: c */
    public final wfy0 f80866c;

    /* JADX INFO: renamed from: d */
    public final usv0 f80867d;

    /* JADX INFO: renamed from: e */
    public long f80868e;

    /* JADX INFO: renamed from: f */
    public int f80869f;

    /* JADX INFO: renamed from: g */
    public boolean f80870g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public oay0 f80871h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public oay0 f80872i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public oay0 f80873j;

    /* JADX INFO: renamed from: k */
    public int f80874k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public Object f80875l;

    /* JADX INFO: renamed from: m */
    public long f80876m;

    /* JADX INFO: renamed from: n */
    public final b7y0 f80877n;

    public cby0(wfy0 wfy0Var, usv0 usv0Var, b7y0 b7y0Var) {
        this.f80866c = wfy0Var;
        this.f80867d = usv0Var;
        this.f80877n = b7y0Var;
    }

    /* JADX INFO: renamed from: A */
    public static kzy0 m108663A(d0u0 d0u0Var, Object obj, long j, long j2, wyt0 wyt0Var, hwt0 hwt0Var) {
        d0u0Var.mo113468n(obj, hwt0Var);
        d0u0Var.mo107663e(hwt0Var.f111930c, wyt0Var, 0L);
        d0u0Var.mo113457a(obj);
        hwt0Var.m137506b();
        d0u0Var.mo113468n(obj, hwt0Var);
        int iM137508d = hwt0Var.m137508d(j);
        return iM137508d == -1 ? new kzy0(obj, j2, hwt0Var.m137507c(j)) : new kzy0(obj, iM137508d, hwt0Var.m137509e(iM137508d), j2);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m108664c(kzy0 kzy0Var) {
        return !kzy0Var.m152240b() && kzy0Var.f129480e == -1;
    }

    /* JADX INFO: renamed from: B */
    public final void m108665B() {
        final mqw0 mqw0Var = new mqw0();
        for (oay0 oay0VarM166864g = this.f80871h; oay0VarM166864g != null; oay0VarM166864g = oay0VarM166864g.m166864g()) {
            mqw0Var.m159613g(oay0VarM166864g.f145770f.f172814a);
        }
        oay0 oay0Var = this.f80872i;
        final kzy0 kzy0Var = oay0Var == null ? null : oay0Var.f145770f.f172814a;
        this.f80867d.mo121303g(new Runnable() { // from class: l.xay0
            @Override // java.lang.Runnable
            public final void run() {
                this.f193093a.m108679n(mqw0Var, kzy0Var);
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public final boolean m108666C(d0u0 d0u0Var, kzy0 kzy0Var, boolean z) {
        int iMo113457a = d0u0Var.mo113457a(kzy0Var.f129476a);
        return !d0u0Var.mo107663e(d0u0Var.mo107662d(iMo113457a, this.f80864a, false).f111930c, this.f80865b, 0L).f191698h && d0u0Var.m113463i(iMo113457a, this.f80864a, this.f80865b, this.f80869f, this.f80870g) == -1 && z;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m108667a(d0u0 d0u0Var, kzy0 kzy0Var) {
        if (m108664c(kzy0Var)) {
            return d0u0Var.mo107663e(d0u0Var.mo113468n(kzy0Var.f129476a, this.f80864a).f111930c, this.f80865b, 0L).f191705o == d0u0Var.mo113457a(kzy0Var.f129476a);
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m108668b(d0u0 d0u0Var) {
        d0u0 d0u0Var2;
        oay0 oay0VarM166864g = this.f80871h;
        if (oay0VarM166864g == null) {
            return true;
        }
        int iMo113457a = d0u0Var.mo113457a(oay0VarM166864g.f145766b);
        while (true) {
            d0u0Var2 = d0u0Var;
            iMo113457a = d0u0Var2.m113463i(iMo113457a, this.f80864a, this.f80865b, this.f80869f, this.f80870g);
            while (true) {
                oay0VarM166864g.getClass();
                if (oay0VarM166864g.m166864g() == null || oay0VarM166864g.f145770f.f172820g) {
                    break;
                }
                oay0VarM166864g = oay0VarM166864g.m166864g();
            }
            oay0 oay0VarM166864g2 = oay0VarM166864g.m166864g();
            if (iMo113457a == -1 || oay0VarM166864g2 == null || d0u0Var2.mo113457a(oay0VarM166864g2.f145766b) != iMo113457a) {
                break;
            }
            oay0VarM166864g = oay0VarM166864g2;
            d0u0Var = d0u0Var2;
        }
        boolean zM108682q = m108682q(oay0VarM166864g);
        oay0VarM166864g.f145770f = m108676k(d0u0Var2, oay0VarM166864g.f145770f);
        return !zM108682q;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final oay0 m108669d() {
        oay0 oay0Var = this.f80871h;
        if (oay0Var == null) {
            return null;
        }
        if (oay0Var == this.f80872i) {
            this.f80872i = oay0Var.m166864g();
        }
        oay0Var.m166871n();
        int i = this.f80874k - 1;
        this.f80874k = i;
        if (i == 0) {
            this.f80873j = null;
            oay0 oay0Var2 = this.f80871h;
            this.f80875l = oay0Var2.f145766b;
            this.f80876m = oay0Var2.f145770f.f172814a.f129479d;
        }
        this.f80871h = this.f80871h.m166864g();
        m108665B();
        return this.f80871h;
    }

    /* JADX INFO: renamed from: e */
    public final oay0 m108670e() {
        oay0 oay0Var = this.f80872i;
        lev0.m153954b(oay0Var);
        this.f80872i = oay0Var.m166864g();
        m108665B();
        oay0 oay0Var2 = this.f80872i;
        lev0.m153954b(oay0Var2);
        return oay0Var2;
    }

    /* JADX INFO: renamed from: f */
    public final oay0 m108671f(tay0 tay0Var) {
        oay0 oay0Var = this.f80873j;
        oay0 oay0VarM12608U = C2134b7.m12608U(this.f80877n.f75379a, tay0Var, oay0Var == null ? 1000000000000L : (oay0Var.m166862e() + oay0Var.f145770f.f172818e) - tay0Var.f172815b);
        oay0 oay0Var2 = this.f80873j;
        if (oay0Var2 != null) {
            oay0Var2.m166872o(oay0VarM12608U);
        } else {
            this.f80871h = oay0VarM12608U;
            this.f80872i = oay0VarM12608U;
        }
        this.f80875l = null;
        this.f80873j = oay0VarM12608U;
        this.f80874k++;
        m108665B();
        return oay0VarM12608U;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final oay0 m108672g() {
        return this.f80873j;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final oay0 m108673h() {
        return this.f80871h;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final oay0 m108674i() {
        return this.f80872i;
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public final tay0 m108675j(long j, edy0 edy0Var) {
        oay0 oay0Var = this.f80873j;
        return oay0Var == null ? m108689x(edy0Var.f93590a, edy0Var.f93591b, edy0Var.f93592c, edy0Var.f93607r) : m108688w(edy0Var.f93590a, oay0Var, j);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0065  */
    /* JADX WARN: Code duplicated, block: B:21:0x0069  */
    /* JADX INFO: renamed from: k */
    public final tay0 m108676k(d0u0 d0u0Var, tay0 tay0Var) {
        long j;
        long jM137512h;
        long j2;
        long j3;
        int i;
        int i2;
        kzy0 kzy0Var = tay0Var.f172814a;
        boolean zM108664c = m108664c(kzy0Var);
        boolean zM108667a = m108667a(d0u0Var, kzy0Var);
        boolean zM108666C = m108666C(d0u0Var, kzy0Var, zM108664c);
        d0u0Var.mo113468n(tay0Var.f172814a.f129476a, this.f80864a);
        if (kzy0Var.m152240b() || (i2 = kzy0Var.f129480e) == -1) {
            j = -9223372036854775807L;
        } else {
            this.f80864a.m137513i(i2);
            j = 0;
        }
        if (!kzy0Var.m152240b()) {
            if (j != -9223372036854775807L) {
                j2 = 0;
                j3 = 0;
            } else {
                jM137512h = this.f80864a.f111931d;
            }
            if (kzy0Var.m152240b()) {
                this.f80864a.m137518n(kzy0Var.f129477b);
            } else {
                i = kzy0Var.f129480e;
                if (i != -1) {
                    this.f80864a.m137518n(i);
                }
            }
            return new tay0(kzy0Var, tay0Var.f172815b, tay0Var.f172816c, j3, j2, false, zM108664c, zM108667a, zM108666C);
        }
        jM137512h = this.f80864a.m137512h(kzy0Var.f129477b, kzy0Var.f129478c);
        j2 = jM137512h;
        j3 = j;
        if (kzy0Var.m152240b()) {
            this.f80864a.m137518n(kzy0Var.f129477b);
        } else {
            i = kzy0Var.f129480e;
            if (i != -1) {
                this.f80864a.m137518n(i);
            }
        }
        return new tay0(kzy0Var, tay0Var.f172815b, tay0Var.f172816c, j3, j2, false, zM108664c, zM108667a, zM108666C);
    }

    /* JADX INFO: renamed from: l */
    public final kzy0 m108677l(d0u0 d0u0Var, Object obj, long j) {
        long j2;
        int iMo113457a;
        int i = d0u0Var.mo113468n(obj, this.f80864a).f111930c;
        Object obj2 = this.f80875l;
        if (obj2 == null || (iMo113457a = d0u0Var.mo113457a(obj2)) == -1 || d0u0Var.mo107662d(iMo113457a, this.f80864a, false).f111930c != i) {
            oay0 oay0VarM166864g = this.f80871h;
            while (true) {
                if (oay0VarM166864g == null) {
                    oay0 oay0VarM166864g2 = this.f80871h;
                    while (true) {
                        if (oay0VarM166864g2 != null) {
                            int iMo113457a2 = d0u0Var.mo113457a(oay0VarM166864g2.f145766b);
                            if (iMo113457a2 != -1 && d0u0Var.mo107662d(iMo113457a2, this.f80864a, false).f111930c == i) {
                                j2 = oay0VarM166864g2.f145770f.f172814a.f129479d;
                                break;
                            }
                            oay0VarM166864g2 = oay0VarM166864g2.m166864g();
                        } else {
                            j2 = this.f80868e;
                            this.f80868e = 1 + j2;
                            if (this.f80871h != null) {
                                break;
                            }
                            this.f80875l = obj;
                            this.f80876m = j2;
                            break;
                        }
                    }
                } else {
                    if (oay0VarM166864g.f145766b.equals(obj)) {
                        j2 = oay0VarM166864g.f145770f.f172814a.f129479d;
                        break;
                    }
                    oay0VarM166864g = oay0VarM166864g.m166864g();
                }
            }
        } else {
            j2 = this.f80876m;
        }
        long j3 = j2;
        d0u0Var.mo113468n(obj, this.f80864a);
        d0u0Var.mo107663e(this.f80864a.f111930c, this.f80865b, 0L);
        int iMo113457a3 = d0u0Var.mo113457a(obj);
        Object obj3 = obj;
        while (true) {
            wyt0 wyt0Var = this.f80865b;
            int i2 = wyt0Var.f191704n;
            hwt0 hwt0Var = this.f80864a;
            if (iMo113457a3 < i2) {
                return m108663A(d0u0Var, obj3, j, j3, wyt0Var, hwt0Var);
            }
            d0u0Var.mo107662d(iMo113457a3, hwt0Var, true);
            this.f80864a.m137506b();
            hwt0 hwt0Var2 = this.f80864a;
            if (hwt0Var2.m137508d(hwt0Var2.f111931d) != -1) {
                obj3 = this.f80864a.f111929b;
                obj3.getClass();
            }
            iMo113457a3--;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m108678m() {
        if (this.f80874k == 0) {
            return;
        }
        oay0 oay0VarM166864g = this.f80871h;
        lev0.m153954b(oay0VarM166864g);
        this.f80875l = oay0VarM166864g.f145766b;
        this.f80876m = oay0VarM166864g.f145770f.f172814a.f129479d;
        while (oay0VarM166864g != null) {
            oay0VarM166864g.m166871n();
            oay0VarM166864g = oay0VarM166864g.m166864g();
        }
        this.f80871h = null;
        this.f80873j = null;
        this.f80872i = null;
        this.f80874k = 0;
        m108665B();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m108679n(mqw0 mqw0Var, kzy0 kzy0Var) {
        this.f80866c.mo141195J(mqw0Var.m159616j(), kzy0Var);
    }

    /* JADX INFO: renamed from: o */
    public final void m108680o(long j) {
        oay0 oay0Var = this.f80873j;
        if (oay0Var != null) {
            oay0Var.m166870m(j);
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m108681p(izy0 izy0Var) {
        oay0 oay0Var = this.f80873j;
        return oay0Var != null && oay0Var.f145765a == izy0Var;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m108682q(oay0 oay0Var) {
        lev0.m153954b(oay0Var);
        boolean z = false;
        if (oay0Var.equals(this.f80873j)) {
            return false;
        }
        this.f80873j = oay0Var;
        while (oay0Var.m166864g() != null) {
            oay0Var = oay0Var.m166864g();
            oay0Var.getClass();
            if (oay0Var == this.f80872i) {
                this.f80872i = this.f80871h;
                z = true;
            }
            oay0Var.m166871n();
            this.f80874k--;
        }
        oay0 oay0Var2 = this.f80873j;
        oay0Var2.getClass();
        oay0Var2.m166872o(null);
        m108665B();
        return z;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m108683r() {
        oay0 oay0Var = this.f80873j;
        if (oay0Var != null) {
            return !oay0Var.f145770f.f172822i && oay0Var.m166875r() && this.f80873j.f145770f.f172818e != -9223372036854775807L && this.f80874k < 100;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007b  */
    /* JADX INFO: renamed from: s */
    public final boolean m108684s(d0u0 d0u0Var, long j, long j2) {
        tay0 tay0VarM108676k;
        boolean z;
        oay0 oay0Var = null;
        for (oay0 oay0VarM166864g = this.f80871h; oay0VarM166864g != null; oay0VarM166864g = oay0VarM166864g.m166864g()) {
            tay0 tay0Var = oay0VarM166864g.f145770f;
            if (oay0Var == null) {
                tay0VarM108676k = m108676k(d0u0Var, tay0Var);
            } else {
                tay0 tay0VarM108688w = m108688w(d0u0Var, oay0Var, j);
                if (tay0VarM108688w == null) {
                    return !m108682q(oay0Var);
                }
                if (tay0Var.f172815b != tay0VarM108688w.f172815b || !tay0Var.f172814a.equals(tay0VarM108688w.f172814a)) {
                    return !m108682q(oay0Var);
                }
                tay0VarM108676k = tay0VarM108688w;
            }
            oay0VarM166864g.f145770f = tay0VarM108676k.m189962a(tay0Var.f172816c);
            long j3 = tay0Var.f172818e;
            long j4 = tay0VarM108676k.f172818e;
            if (j3 != -9223372036854775807L && j3 != j4) {
                oay0VarM166864g.m166874q();
                long j5 = tay0VarM108676k.f172818e;
                long jM166862e = j5 == -9223372036854775807L ? Long.MAX_VALUE : j5 + oay0VarM166864g.m166862e();
                if (oay0VarM166864g == this.f80872i) {
                    boolean z2 = oay0VarM166864g.f145770f.f172819f;
                    if (j2 == Long.MIN_VALUE || j2 >= jM166862e) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                return (m108682q(oay0VarM166864g) || z) ? false : true;
            }
            oay0Var = oay0VarM166864g;
        }
        return true;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m108685t(d0u0 d0u0Var, int i) {
        this.f80869f = i;
        return m108668b(d0u0Var);
    }

    /* JADX INFO: renamed from: u */
    public final boolean m108686u(d0u0 d0u0Var, boolean z) {
        this.f80870g = z;
        return m108668b(d0u0Var);
    }

    /* JADX INFO: renamed from: v */
    public final long m108687v(d0u0 d0u0Var, Object obj, int i) {
        d0u0Var.mo113468n(obj, this.f80864a);
        this.f80864a.m137513i(i);
        this.f80864a.m137515k(i);
        return 0L;
    }

    @Nullable
    /* JADX INFO: renamed from: w */
    public final tay0 m108688w(d0u0 d0u0Var, oay0 oay0Var, long j) {
        d0u0 d0u0Var2;
        Object obj;
        long j2;
        tay0 tay0Var = oay0Var.f145770f;
        long jM166862e = oay0Var.m166862e() + tay0Var.f172818e;
        boolean z = tay0Var.f172820g;
        long j3 = jM166862e - j;
        kzy0 kzy0Var = tay0Var.f172814a;
        if (!z) {
            d0u0Var.mo113468n(kzy0Var.f129476a, this.f80864a);
            if (!kzy0Var.m152240b()) {
                int i = kzy0Var.f129480e;
                if (i != -1) {
                    this.f80864a.m137517m(i);
                }
                hwt0 hwt0Var = this.f80864a;
                int i2 = kzy0Var.f129480e;
                int iM137509e = hwt0Var.m137509e(i2);
                hwt0Var.m137518n(i2);
                int iM137505a = this.f80864a.m137505a(kzy0Var.f129480e);
                Object obj2 = kzy0Var.f129476a;
                if (iM137509e != iM137505a) {
                    return m108690y(d0u0Var, obj2, kzy0Var.f129480e, iM137509e, tay0Var.f172818e, kzy0Var.f129479d);
                }
                m108687v(d0u0Var, obj2, kzy0Var.f129480e);
                return m108691z(d0u0Var, kzy0Var.f129476a, 0L, tay0Var.f172818e, kzy0Var.f129479d);
            }
            int i3 = kzy0Var.f129477b;
            if (this.f80864a.m137505a(i3) == -1) {
                return null;
            }
            int iM137510f = this.f80864a.m137510f(i3, kzy0Var.f129478c);
            if (iM137510f < 0) {
                return m108690y(d0u0Var, kzy0Var.f129476a, i3, iM137510f, tay0Var.f172816c, kzy0Var.f129479d);
            }
            long jLongValue = tay0Var.f172816c;
            if (jLongValue == -9223372036854775807L) {
                wyt0 wyt0Var = this.f80865b;
                hwt0 hwt0Var2 = this.f80864a;
                Pair pairM113467m = d0u0Var.m113467m(wyt0Var, hwt0Var2, hwt0Var2.f111930c, -9223372036854775807L, Math.max(0L, j3));
                d0u0Var2 = d0u0Var;
                if (pairM113467m == null) {
                    return null;
                }
                jLongValue = ((Long) pairM113467m.second).longValue();
            } else {
                d0u0Var2 = d0u0Var;
            }
            m108687v(d0u0Var2, kzy0Var.f129476a, kzy0Var.f129477b);
            return m108691z(d0u0Var, kzy0Var.f129476a, Math.max(0L, jLongValue), tay0Var.f172816c, kzy0Var.f129479d);
        }
        long j4 = 0;
        int iM113463i = d0u0Var.m113463i(d0u0Var.mo113457a(kzy0Var.f129476a), this.f80864a, this.f80865b, this.f80869f, this.f80870g);
        if (iM113463i == -1) {
            return null;
        }
        int i4 = d0u0Var.mo107662d(iM113463i, this.f80864a, true).f111930c;
        Object obj3 = this.f80864a.f111929b;
        obj3.getClass();
        long j5 = tay0Var.f172814a.f129479d;
        if (d0u0Var.mo107663e(i4, this.f80865b, 0L).f191704n == iM113463i) {
            Pair pairM113467m2 = d0u0Var.m113467m(this.f80865b, this.f80864a, i4, -9223372036854775807L, Math.max(0L, j3));
            if (pairM113467m2 == null) {
                return null;
            }
            Object obj4 = pairM113467m2.first;
            long jLongValue2 = ((Long) pairM113467m2.second).longValue();
            oay0 oay0VarM166864g = oay0Var.m166864g();
            if (oay0VarM166864g == null || !oay0VarM166864g.f145766b.equals(obj4)) {
                j5 = this.f80868e;
                this.f80868e = 1 + j5;
            } else {
                j5 = oay0VarM166864g.f145770f.f172814a.f129479d;
            }
            obj = obj4;
            j2 = jLongValue2;
            j4 = -9223372036854775807L;
        } else {
            obj = obj3;
            j2 = 0;
        }
        kzy0 kzy0VarM108663A = m108663A(d0u0Var, obj, j2, j5, this.f80865b, this.f80864a);
        if (j4 != -9223372036854775807L && tay0Var.f172816c != -9223372036854775807L) {
            d0u0Var.mo113468n(tay0Var.f172814a.f129476a, this.f80864a).m137506b();
            this.f80864a.m137511g();
        }
        return m108689x(d0u0Var, kzy0VarM108663A, j4, j2);
    }

    @Nullable
    /* JADX INFO: renamed from: x */
    public final tay0 m108689x(d0u0 d0u0Var, kzy0 kzy0Var, long j, long j2) {
        d0u0Var.mo113468n(kzy0Var.f129476a, this.f80864a);
        boolean zM152240b = kzy0Var.m152240b();
        Object obj = kzy0Var.f129476a;
        return zM152240b ? m108690y(d0u0Var, obj, kzy0Var.f129477b, kzy0Var.f129478c, j, kzy0Var.f129479d) : m108691z(d0u0Var, obj, j2, j, kzy0Var.f129479d);
    }

    /* JADX INFO: renamed from: y */
    public final tay0 m108690y(d0u0 d0u0Var, Object obj, int i, int i2, long j, long j2) {
        kzy0 kzy0Var = new kzy0(obj, i, i2, j2);
        Object obj2 = kzy0Var.f129476a;
        long jM137512h = d0u0Var.mo113468n(obj2, this.f80864a).m137512h(kzy0Var.f129477b, kzy0Var.f129478c);
        if (i2 == this.f80864a.m137509e(i)) {
            this.f80864a.m137514j();
        }
        this.f80864a.m137518n(kzy0Var.f129477b);
        long jMax = 0;
        if (jM137512h != -9223372036854775807L && jM137512h <= 0) {
            jMax = Math.max(0L, (-1) + jM137512h);
        }
        return new tay0(kzy0Var, jMax, j, -9223372036854775807L, jM137512h, false, false, false, false);
    }

    /* JADX INFO: renamed from: z */
    public final tay0 m108691z(d0u0 d0u0Var, Object obj, long j, long j2, long j3) {
        long j4;
        long j5;
        long j6;
        d0u0Var.mo113468n(obj, this.f80864a);
        int iM137507c = this.f80864a.m137507c(j);
        if (iM137507c != -1) {
            this.f80864a.m137517m(iM137507c);
        }
        hwt0 hwt0Var = this.f80864a;
        if (iM137507c == -1) {
            hwt0Var.m137506b();
        } else {
            hwt0Var.m137518n(iM137507c);
        }
        kzy0 kzy0Var = new kzy0(obj, j3, iM137507c);
        boolean zM108664c = m108664c(kzy0Var);
        boolean zM108667a = m108667a(d0u0Var, kzy0Var);
        boolean zM108666C = m108666C(d0u0Var, kzy0Var, zM108664c);
        if (iM137507c != -1) {
            this.f80864a.m137518n(iM137507c);
        }
        if (iM137507c != -1) {
            this.f80864a.m137513i(iM137507c);
            j4 = 0;
        } else {
            j4 = -9223372036854775807L;
        }
        if (j4 != -9223372036854775807L) {
            j6 = 0;
            j5 = 0;
        } else {
            j5 = this.f80864a.f111931d;
            j6 = j4;
        }
        return new tay0(kzy0Var, (j5 == -9223372036854775807L || j < j5) ? j : Math.max(0L, j5 - 1), j2, j6, j5, false, zM108664c, zM108667a, zM108666C);
    }
}
