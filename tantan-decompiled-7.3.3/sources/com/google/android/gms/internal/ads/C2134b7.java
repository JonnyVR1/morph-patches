package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.C2134b7;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p153l.afy0;
import p153l.b6z0;
import p153l.b7y0;
import p153l.bdy0;
import p153l.c6z0;
import p153l.c8y0;
import p153l.cby0;
import p153l.d0u0;
import p153l.dfy0;
import p153l.edy0;
import p153l.f2z0;
import p153l.fpw0;
import p153l.g7y0;
import p153l.gfy0;
import p153l.h2z0;
import p153l.h8y0;
import p153l.hdy0;
import p153l.hwt0;
import p153l.hzy0;
import p153l.i2z0;
import p153l.iet0;
import p153l.iig0;
import p153l.ixx0;
import p153l.izy0;
import p153l.jey0;
import p153l.jfs0;
import p153l.kzy0;
import p153l.mfv0;
import p153l.mpw0;
import p153l.mqw0;
import p153l.n5z0;
import p153l.oay0;
import p153l.p7y0;
import p153l.pey0;
import p153l.q0y0;
import p153l.q2z0;
import p153l.q9y0;
import p153l.rxx0;
import p153l.s5z0;
import p153l.s6y0;
import p153l.sqr0;
import p153l.t2z0;
import p153l.t5z0;
import p153l.tay0;
import p153l.u5z0;
import p153l.u7y0;
import p153l.usv0;
import p153l.vey0;
import p153l.voy0;
import p153l.wfy0;
import p153l.wxx0;
import p153l.wyt0;
import p153l.y4w0;
import p153l.y7y0;
import p153l.ycy0;
import p153l.yey0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.b7 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2134b7 implements Handler.Callback, hzy0, s5z0, ycy0, rxx0, hdy0 {

    /* JADX INFO: renamed from: B */
    public boolean f9871B;

    /* JADX INFO: renamed from: E */
    public boolean f9874E;

    /* JADX INFO: renamed from: F */
    public int f9875F;

    /* JADX INFO: renamed from: G */
    @Nullable
    public h8y0 f9876G;

    /* JADX INFO: renamed from: H */
    public long f9877H;

    /* JADX INFO: renamed from: I */
    public int f9878I;

    /* JADX INFO: renamed from: J */
    public boolean f9879J;

    /* JADX INFO: renamed from: K */
    @Nullable
    public zziz f9880K;

    /* JADX INFO: renamed from: M */
    public final q0y0 f9882M;

    /* JADX INFO: renamed from: N */
    public final ixx0 f9883N;

    /* JADX INFO: renamed from: a */
    public final vey0[] f9884a;

    /* JADX INFO: renamed from: b */
    public final Set f9885b;

    /* JADX INFO: renamed from: c */
    public final afy0[] f9886c;

    /* JADX INFO: renamed from: d */
    public final t5z0 f9887d;

    /* JADX INFO: renamed from: e */
    public final u5z0 f9888e;

    /* JADX INFO: renamed from: f */
    public final q9y0 f9889f;

    /* JADX INFO: renamed from: g */
    public final b6z0 f9890g;

    /* JADX INFO: renamed from: h */
    public final usv0 f9891h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public final HandlerThread f9892i;

    /* JADX INFO: renamed from: j */
    public final Looper f9893j;

    /* JADX INFO: renamed from: k */
    public final wyt0 f9894k;

    /* JADX INFO: renamed from: l */
    public final hwt0 f9895l;

    /* JADX INFO: renamed from: m */
    public final long f9896m;

    /* JADX INFO: renamed from: n */
    public final wxx0 f9897n;

    /* JADX INFO: renamed from: o */
    public final ArrayList f9898o;

    /* JADX INFO: renamed from: p */
    public final mfv0 f9899p;

    /* JADX INFO: renamed from: q */
    public final cby0 f9900q;

    /* JADX INFO: renamed from: r */
    public final bdy0 f9901r;

    /* JADX INFO: renamed from: s */
    public final long f9902s;

    /* JADX INFO: renamed from: t */
    public gfy0 f9903t;

    /* JADX INFO: renamed from: u */
    public edy0 f9904u;

    /* JADX INFO: renamed from: v */
    public c8y0 f9905v;

    /* JADX INFO: renamed from: w */
    public boolean f9906w;

    /* JADX INFO: renamed from: y */
    public boolean f9908y;

    /* JADX INFO: renamed from: z */
    public boolean f9909z;

    /* JADX INFO: renamed from: C */
    public int f9872C = 0;

    /* JADX INFO: renamed from: D */
    public boolean f9873D = false;

    /* JADX INFO: renamed from: x */
    public boolean f9907x = false;

    /* JADX INFO: renamed from: L */
    public long f9881L = -9223372036854775807L;

    /* JADX INFO: renamed from: A */
    public long f9870A = -9223372036854775807L;

    public C2134b7(vey0[] vey0VarArr, t5z0 t5z0Var, u5z0 u5z0Var, q9y0 q9y0Var, b6z0 b6z0Var, int i, boolean z, wfy0 wfy0Var, gfy0 gfy0Var, ixx0 ixx0Var, long j, boolean z2, Looper looper, mfv0 mfv0Var, q0y0 q0y0Var, voy0 voy0Var, Looper looper2) {
        this.f9882M = q0y0Var;
        this.f9884a = vey0VarArr;
        this.f9887d = t5z0Var;
        this.f9888e = u5z0Var;
        this.f9889f = q9y0Var;
        this.f9890g = b6z0Var;
        this.f9903t = gfy0Var;
        this.f9883N = ixx0Var;
        this.f9902s = j;
        this.f9899p = mfv0Var;
        this.f9896m = q9y0Var.zza();
        q9y0Var.zzf();
        edy0 edy0VarM120528g = edy0.m120528g(u5z0Var);
        this.f9904u = edy0VarM120528g;
        this.f9905v = new c8y0(edy0VarM120528g);
        int length = vey0VarArr.length;
        this.f9886c = new afy0[2];
        yey0 yey0VarMo153037a = t5z0Var.mo153037a();
        for (int i2 = 0; i2 < 2; i2++) {
            vey0VarArr[i2].mo178558n(i2, voy0Var, mfv0Var);
            this.f9886c[i2] = vey0VarArr[i2].zzl();
            this.f9886c[i2].mo97573t(yey0VarMo153037a);
        }
        this.f9897n = new wxx0(this, mfv0Var);
        this.f9898o = new ArrayList();
        this.f9885b = Collections.newSetFromMap(new IdentityHashMap());
        this.f9894k = new wyt0();
        this.f9895l = new hwt0();
        t5z0Var.m189441h(this, b6z0Var);
        this.f9879J = true;
        usv0 usv0VarMo135184a = mfv0Var.mo135184a(looper, null);
        this.f9900q = new cby0(wfy0Var, usv0VarMo135184a, new b7y0(this));
        this.f9901r = new bdy0(this, wfy0Var, usv0VarMo135184a, voy0Var);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f9892i = handlerThread;
        handlerThread.start();
        Looper looper3 = handlerThread.getLooper();
        this.f9893j = looper3;
        this.f9891h = mfv0Var.mo135184a(looper3, this);
    }

    /* JADX INFO: renamed from: B */
    private final void m12600B() throws zziz {
        this.f9897n.m208459f();
        vey0[] vey0VarArr = this.f9884a;
        int length = vey0VarArr.length;
        for (int i = 0; i < 2; i++) {
            vey0 vey0Var = vey0VarArr[i];
            if (m12601J(vey0Var)) {
                m12605Q(vey0Var);
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public static boolean m12601J(vey0 vey0Var) {
        return vey0Var.mo178561s() != 0;
    }

    /* JADX INFO: renamed from: L */
    public static boolean m12602L(edy0 edy0Var, hwt0 hwt0Var) {
        kzy0 kzy0Var = edy0Var.f93591b;
        d0u0 d0u0Var = edy0Var.f93590a;
        return d0u0Var.m113469o() || d0u0Var.mo113468n(kzy0Var.f129476a, hwt0Var).f111933f;
    }

    /* JADX INFO: renamed from: O */
    public static sqr0[] m12603O(n5z0 n5z0Var) {
        int iZzc = n5z0Var != null ? n5z0Var.zzc() : 0;
        sqr0[] sqr0VarArr = new sqr0[iZzc];
        for (int i = 0; i < iZzc; i++) {
            sqr0VarArr[i] = n5z0Var.zzd(i);
        }
        return sqr0VarArr;
    }

    /* JADX INFO: renamed from: P */
    public static final void m12604P(jey0 jey0Var) throws zziz {
        jey0Var.m144638j();
        try {
            jey0Var.m144631c().mo119682u(jey0Var.m144629a(), jey0Var.m144635g());
        } finally {
            jey0Var.m144636h(true);
        }
    }

    /* JADX INFO: renamed from: Q */
    public static final void m12605Q(vey0 vey0Var) {
        if (vey0Var.mo178561s() == 2) {
            vey0Var.zzO();
        }
    }

    /* JADX INFO: renamed from: R */
    public static final void m12606R(vey0 vey0Var, long j) {
        vey0Var.mo178553d();
        if (vey0Var instanceof t2z0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ oay0 m12608U(C2134b7 c2134b7, tay0 tay0Var, long j) {
        q9y0 q9y0Var = c2134b7.f9889f;
        t5z0 t5z0Var = c2134b7.f9887d;
        c6z0 c6z0VarZzi = q9y0Var.zzi();
        u5z0 u5z0Var = c2134b7.f9888e;
        return new oay0(c2134b7.f9886c, j, t5z0Var, c6z0VarZzi, c2134b7.f9901r, tay0Var, u5z0Var);
    }

    @Nullable
    /* JADX INFO: renamed from: W */
    public static Object m12609W(wyt0 wyt0Var, hwt0 hwt0Var, int i, boolean z, Object obj, d0u0 d0u0Var, d0u0 d0u0Var2) {
        int iMo113457a = d0u0Var.mo113457a(obj);
        int iMo113458b = d0u0Var.mo113458b();
        int i2 = 0;
        int iM113463i = iMo113457a;
        int iMo113457a2 = -1;
        while (i2 < iMo113458b && iMo113457a2 == -1) {
            wyt0 wyt0Var2 = wyt0Var;
            hwt0 hwt0Var2 = hwt0Var;
            int i3 = i;
            boolean z2 = z;
            d0u0 d0u0Var3 = d0u0Var;
            iM113463i = d0u0Var3.m113463i(iM113463i, hwt0Var2, wyt0Var2, i3, z2);
            if (iM113463i == -1) {
                iMo113457a2 = -1;
                break;
            }
            iMo113457a2 = d0u0Var2.mo113457a(d0u0Var3.mo113460f(iM113463i));
            i2++;
            d0u0Var = d0u0Var3;
            hwt0Var = hwt0Var2;
            wyt0Var = wyt0Var2;
            i = i3;
            z = z2;
        }
        if (iMo113457a2 == -1) {
            return null;
        }
        return d0u0Var2.mo113460f(iMo113457a2);
    }

    /* JADX INFO: renamed from: d0 */
    public static final /* synthetic */ void m12610d0(jey0 jey0Var) {
        try {
            m12604P(jey0Var);
        } catch (zziz e) {
            y4w0.m214276d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
            iig0.m140070a(e);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: k0 */
    public static Pair m12611k0(d0u0 d0u0Var, h8y0 h8y0Var, boolean z, int i, boolean z2, wyt0 wyt0Var, hwt0 hwt0Var) {
        d0u0 d0u0Var2;
        d0u0 d0u0Var3 = h8y0Var.f108286a;
        if (d0u0Var.m113469o()) {
            return null;
        }
        if (true == d0u0Var3.m113469o()) {
            d0u0Var2 = d0u0Var3;
            d0u0Var2 = d0u0Var;
        }
        try {
            d0u0Var2 = d0u0Var3;
            Pair pairM113466l = d0u0Var2.m113466l(wyt0Var, hwt0Var, h8y0Var.f108287b, h8y0Var.f108288c);
            d0u0 d0u0Var4 = d0u0Var2;
            if (d0u0Var.equals(d0u0Var4)) {
                return pairM113466l;
            }
            int iMo113457a = d0u0Var.mo113457a(pairM113466l.first);
            Object obj = pairM113466l.first;
            if (iMo113457a != -1) {
                return (d0u0Var4.mo113468n(obj, hwt0Var).f111933f && d0u0Var4.mo107663e(hwt0Var.f111930c, wyt0Var, 0L).f191704n == d0u0Var4.mo113457a(pairM113466l.first)) ? d0u0Var.m113466l(wyt0Var, hwt0Var, d0u0Var.mo113468n(pairM113466l.first, hwt0Var).f111930c, h8y0Var.f108288c) : pairM113466l;
            }
            Object objM12609W = m12609W(wyt0Var, hwt0Var, i, z2, obj, d0u0Var4, d0u0Var);
            if (objM12609W != null) {
                return d0u0Var.m113466l(wyt0Var, hwt0Var, d0u0Var.mo113468n(objM12609W, hwt0Var).f111930c, -9223372036854775807L);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    /* JADX INFO: renamed from: p */
    private final void m12612p() throws zziz {
        m12654o();
        m12659v(true);
    }

    /* JADX INFO: renamed from: r */
    private final void m12613r() {
        oay0 oay0VarM108673h = this.f9900q.m108673h();
        boolean z = false;
        if (oay0VarM108673h != null && oay0VarM108673h.f145770f.f172821h && this.f9907x) {
            z = true;
        }
        this.f9908y = z;
    }

    /* JADX INFO: renamed from: A */
    public final void m12614A(boolean z, boolean z2) {
        m12655q(z || !this.f9874E, false, true, false);
        this.f9905v.m108392a(z2 ? 1 : 0);
        this.f9889f.zzd();
        m12662y(1);
    }

    /* JADX INFO: renamed from: C */
    public final void m12615C() {
        oay0 oay0VarM108672g = this.f9900q.m108672g();
        boolean z = this.f9871B || (oay0VarM108672g != null && oay0VarM108672g.f145765a.zzp());
        edy0 edy0Var = this.f9904u;
        if (z != edy0Var.f93596g) {
            this.f9904u = new edy0(edy0Var.f93590a, edy0Var.f93591b, edy0Var.f93592c, edy0Var.f93593d, edy0Var.f93594e, edy0Var.f93595f, z, edy0Var.f93597h, edy0Var.f93598i, edy0Var.f93599j, edy0Var.f93600k, edy0Var.f93601l, edy0Var.f93602m, edy0Var.f93603n, edy0Var.f93605p, edy0Var.f93606q, edy0Var.f93607r, edy0Var.f93608s, false);
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m12616D(kzy0 kzy0Var, q2z0 q2z0Var, u5z0 u5z0Var) {
        d0u0 d0u0Var = this.f9904u.f93590a;
        n5z0[] n5z0VarArr = u5z0Var.f177699c;
        this.f9889f.mo160708a(d0u0Var, kzy0Var, this.f9884a, q2z0Var, n5z0VarArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00af, code lost:
    
        r8 = null;
     */
    /* JADX INFO: renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m12617E() throws zziz {
        y7y0 y7y0Var;
        oay0 oay0VarM108673h = this.f9900q.m108673h();
        if (oay0VarM108673h == null) {
            return;
        }
        long jZzd = oay0VarM108673h.f145768d ? oay0VarM108673h.f145765a.zzd() : -9223372036854775807L;
        if (jZzd != -9223372036854775807L) {
            if (!oay0VarM108673h.m166875r()) {
                this.f9900q.m108682q(oay0VarM108673h);
                m12645i(false);
                m12652m();
            }
            m12656s(jZzd);
            if (jZzd != this.f9904u.f93607r) {
                edy0 edy0Var = this.f9904u;
                long j = jZzd;
                this.f9904u = m12651l0(edy0Var.f93591b, j, edy0Var.f93592c, j, true, 5);
            }
        } else {
            long jM208454a = this.f9897n.m208454a(oay0VarM108673h != this.f9900q.m108674i());
            this.f9877H = jM208454a;
            long jM166862e = jM208454a - oay0VarM108673h.m166862e();
            long j2 = this.f9904u.f93607r;
            if (!this.f9898o.isEmpty() && !this.f9904u.f93591b.m152240b()) {
                if (this.f9879J) {
                    j2--;
                    this.f9879J = false;
                }
                edy0 edy0Var2 = this.f9904u;
                int iMo113457a = edy0Var2.f93590a.mo113457a(edy0Var2.f93591b.f129476a);
                int iMin = Math.min(this.f9878I, this.f9898o.size());
                if (iMin > 0) {
                    y7y0Var = (y7y0) this.f9898o.get(iMin - 1);
                    while (y7y0Var != null && (iMo113457a < 0 || (iMo113457a == 0 && j2 < 0))) {
                        int i = iMin - 1;
                        if (i > 0) {
                            y7y0Var = (y7y0) this.f9898o.get(iMin - 2);
                            iMin = i;
                        } else {
                            iMin = i;
                            y7y0Var = null;
                        }
                    }
                    if (iMin < this.f9898o.size()) {
                    }
                    this.f9878I = iMin;
                } else {
                    y7y0Var = null;
                }
            }
            boolean zZzj = this.f9897n.zzj();
            edy0 edy0Var3 = this.f9904u;
            if (zZzj) {
                this.f9904u = m12651l0(edy0Var3.f93591b, jM166862e, edy0Var3.f93592c, jM166862e, true, 6);
            } else {
                edy0Var3.f93607r = jM166862e;
                edy0Var3.f93608s = SystemClock.elapsedRealtime();
            }
        }
        this.f9904u.f93605p = this.f9900q.m108672g().m166860c();
        this.f9904u.f93606q = m12640f0();
        edy0 edy0Var4 = this.f9904u;
        if (edy0Var4.f93601l && edy0Var4.f93594e == 3 && m12624N(edy0Var4.f93590a, edy0Var4.f93591b)) {
            edy0 edy0Var5 = this.f9904u;
            if (edy0Var5.f93603n.f114615a == 1.0f) {
                float fM142595a = this.f9883N.m142595a(m12638e0(edy0Var5.f93590a, edy0Var5.f93591b.f129476a, edy0Var5.f93607r), m12640f0());
                if (this.f9897n.zzc().f114615a != fM142595a) {
                    m12660w(new iet0(fM142595a, this.f9904u.f93603n.f114616b));
                    m12650l(this.f9904u.f93603n, this.f9897n.zzc().f114615a, false, false);
                }
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m12618F(d0u0 d0u0Var, kzy0 kzy0Var, d0u0 d0u0Var2, kzy0 kzy0Var2, long j, boolean z) throws zziz {
        if (!m12624N(d0u0Var, kzy0Var)) {
            iet0 iet0Var = kzy0Var.m152240b() ? iet0.f114611d : this.f9904u.f93603n;
            if (this.f9897n.zzc().equals(iet0Var)) {
                return;
            }
            m12660w(iet0Var);
            m12650l(this.f9904u.f93603n, iet0Var.f114615a, false, false);
            return;
        }
        d0u0Var.mo107663e(d0u0Var.mo113468n(kzy0Var.f129476a, this.f9895l).f111930c, this.f9894k, 0L);
        ixx0 ixx0Var = this.f9883N;
        jfs0 jfs0Var = this.f9894k.f191700j;
        int i = mpw0.f137957a;
        ixx0Var.m142598d(jfs0Var);
        if (j != -9223372036854775807L) {
            this.f9883N.m142599e(m12638e0(d0u0Var, kzy0Var.f129476a, j));
            return;
        }
        if (!mpw0.m159408f(!d0u0Var2.m113469o() ? d0u0Var2.mo107663e(d0u0Var2.mo113468n(kzy0Var2.f129476a, this.f9895l).f111930c, this.f9894k, 0L).f191691a : null, this.f9894k.f191691a) || z) {
            this.f9883N.m142599e(-9223372036854775807L);
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m12619G(boolean z, boolean z2) {
        this.f9909z = z;
        this.f9870A = z2 ? -9223372036854775807L : SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: H */
    public final synchronized void m12620H(fpw0 fpw0Var, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j;
        boolean z = false;
        while (!((s6y0) fpw0Var).f166624a.f9906w && j > 0) {
            try {
                wait(j);
            } catch (InterruptedException unused) {
                z = true;
            }
            j = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: renamed from: I */
    public final boolean m12621I() {
        oay0 oay0VarM108672g = this.f9900q.m108672g();
        return (oay0VarM108672g == null || oay0VarM108672g.m166861d() == Long.MIN_VALUE) ? false : true;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m12622K() {
        oay0 oay0VarM108673h = this.f9900q.m108673h();
        long j = oay0VarM108673h.f145770f.f172818e;
        if (oay0VarM108673h.f145768d) {
            return j == -9223372036854775807L || this.f9904u.f93607r < j || !m12623M();
        }
        return false;
    }

    /* JADX INFO: renamed from: M */
    public final boolean m12623M() {
        edy0 edy0Var = this.f9904u;
        return edy0Var.f93601l && edy0Var.f93602m == 0;
    }

    /* JADX INFO: renamed from: N */
    public final boolean m12624N(d0u0 d0u0Var, kzy0 kzy0Var) {
        if (!kzy0Var.m152240b() && !d0u0Var.m113469o()) {
            d0u0Var.mo107663e(d0u0Var.mo113468n(kzy0Var.f129476a, this.f9895l).f111930c, this.f9894k, 0L);
            if (this.f9894k.m208629b()) {
                wyt0 wyt0Var = this.f9894k;
                if (wyt0Var.f191698h && wyt0Var.f191695e != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: S */
    public final Looper m12625S() {
        return this.f9893j;
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ Boolean m12626V() {
        return Boolean.valueOf(this.f9906w);
    }

    /* JADX INFO: renamed from: X */
    public final void m12627X() {
        this.f9891h.mo121301e(0).zza();
    }

    /* JADX INFO: renamed from: Y */
    public final void m12628Y(d0u0 d0u0Var, int i, long j) {
        this.f9891h.mo121299c(3, new h8y0(d0u0Var, i, j)).zza();
    }

    /* JADX INFO: renamed from: Z */
    public final void m12629Z(boolean z, int i) {
        this.f9891h.mo121304h(1, z ? 1 : 0, i).zza();
    }

    @Override // p153l.rxx0
    /* JADX INFO: renamed from: a */
    public final void mo12630a(iet0 iet0Var) {
        this.f9891h.mo121299c(16, iet0Var).zza();
    }

    /* JADX INFO: renamed from: a0 */
    public final void m12631a0() {
        this.f9891h.mo121301e(6).zza();
    }

    @Override // p153l.hdy0
    /* JADX INFO: renamed from: b */
    public final synchronized void mo12632b(jey0 jey0Var) {
        if (!this.f9906w && this.f9893j.getThread().isAlive()) {
            this.f9891h.mo121299c(14, jey0Var).zza();
            return;
        }
        y4w0.m214278f("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        jey0Var.m144636h(false);
    }

    /* JADX INFO: renamed from: b0 */
    public final synchronized boolean m12633b0() {
        if (!this.f9906w && this.f9893j.getThread().isAlive()) {
            this.f9891h.mo121305n(7);
            m12620H(new s6y0(this), this.f9902s);
            return this.f9906w;
        }
        return true;
    }

    @Override // p153l.g2z0
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ void mo12634c(h2z0 h2z0Var) {
        this.f9891h.mo121299c(9, (izy0) h2z0Var).zza();
    }

    /* JADX INFO: renamed from: c0 */
    public final void m12635c0(List list, int i, long j, i2z0 i2z0Var) {
        this.f9891h.mo121299c(17, new p7y0(list, i2z0Var, i, j, null)).zza();
    }

    @Override // p153l.hzy0
    /* JADX INFO: renamed from: d */
    public final void mo12636d(izy0 izy0Var) {
        this.f9891h.mo121299c(8, izy0Var).zza();
    }

    /* JADX INFO: renamed from: e */
    public final void m12637e(vey0 vey0Var) throws zziz {
        if (m12601J(vey0Var)) {
            this.f9897n.m208455b(vey0Var);
            m12605Q(vey0Var);
            vey0Var.mo178551a();
            this.f9875F--;
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final long m12638e0(d0u0 d0u0Var, Object obj, long j) {
        d0u0Var.mo107663e(d0u0Var.mo113468n(obj, this.f9895l).f111930c, this.f9894k, 0L);
        wyt0 wyt0Var = this.f9894k;
        if (wyt0Var.f191695e != -9223372036854775807L && wyt0Var.m208629b()) {
            wyt0 wyt0Var2 = this.f9894k;
            if (wyt0Var2.f191698h) {
                long j2 = wyt0Var2.f191696f;
                return mpw0.m159393F((j2 == -9223372036854775807L ? System.currentTimeMillis() : j2 + SystemClock.elapsedRealtime()) - this.f9894k.f191695e) - j;
            }
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: f */
    public final void m12639f() throws zziz {
        int length = this.f9884a.length;
        m12641g(new boolean[2], this.f9900q.m108674i().m166863f());
    }

    /* JADX INFO: renamed from: f0 */
    public final long m12640f0() {
        return m12642g0(this.f9904u.f93605p);
    }

    /* JADX INFO: renamed from: g */
    public final void m12641g(boolean[] zArr, long j) throws zziz {
        oay0 oay0VarM108674i = this.f9900q.m108674i();
        u5z0 u5z0VarM166866i = oay0VarM108674i.m166866i();
        int i = 0;
        while (true) {
            int length = this.f9884a.length;
            if (i >= 2) {
                break;
            }
            if (!u5z0VarM166866i.m194640b(i) && this.f9885b.remove(this.f9884a[i])) {
                this.f9884a[i].mo178559o();
            }
            i++;
        }
        int i2 = 0;
        while (true) {
            int length2 = this.f9884a.length;
            if (i2 >= 2) {
                oay0VarM108674i.f145771g = true;
                return;
            }
            if (u5z0VarM166866i.m194640b(i2)) {
                boolean z = zArr[i2];
                vey0 vey0Var = this.f9884a[i2];
                if (!m12601J(vey0Var)) {
                    cby0 cby0Var = this.f9900q;
                    oay0 oay0VarM108674i2 = cby0Var.m108674i();
                    boolean z2 = oay0VarM108674i2 == cby0Var.m108673h();
                    u5z0 u5z0VarM166866i2 = oay0VarM108674i2.m166866i();
                    dfy0 dfy0Var = u5z0VarM166866i2.f177698b[i2];
                    sqr0[] sqr0VarArrM12603O = m12603O(u5z0VarM166866i2.f177699c[i2]);
                    boolean z3 = m12623M() && this.f9904u.f93594e == 3;
                    boolean z4 = !z && z3;
                    this.f9875F++;
                    this.f9885b.add(vey0Var);
                    vey0Var.mo178563y(dfy0Var, sqr0VarArrM12603O, oay0VarM108674i2.f145767c[i2], this.f9877H, z4, z2, j, oay0VarM108674i2.m166862e(), oay0VarM108674i2.f145770f.f172814a);
                    vey0Var.mo119682u(11, new g7y0(this));
                    this.f9897n.m208456c(vey0Var);
                    if (z3) {
                        vey0Var.zzN();
                    }
                }
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final long m12642g0(long j) {
        oay0 oay0VarM108672g = this.f9900q.m108672g();
        if (oay0VarM108672g == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.f9877H - oay0VarM108672g.m166862e()));
    }

    /* JADX INFO: renamed from: h */
    public final void m12643h(IOException iOException, int i) {
        cby0 cby0Var = this.f9900q;
        zziz zzizVarZzc = zziz.zzc(iOException, i);
        oay0 oay0VarM108673h = cby0Var.m108673h();
        if (oay0VarM108673h != null) {
            zzizVarZzc = zzizVarZzc.zza(oay0VarM108673h.f145770f.f172814a);
        }
        y4w0.m214276d("ExoPlayerImplInternal", "Playback error", zzizVarZzc);
        m12614A(false, false);
        this.f9904u = this.f9904u.m120533d(zzizVarZzc);
    }

    /* JADX INFO: renamed from: h0 */
    public final long m12644h0(kzy0 kzy0Var, long j, boolean z) throws zziz {
        cby0 cby0Var = this.f9900q;
        return m12646i0(kzy0Var, j, cby0Var.m108673h() != cby0Var.m108674i(), z);
    }

    /* JADX WARN: Code duplicated, block: B:240:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:360:0x06f1  */
    /* JADX WARN: Code duplicated, block: B:465:0x08ba A[Catch: RuntimeException -> 0x002a, IOException -> 0x002d, zztt -> 0x0030, zzgx -> 0x0033, zzcc -> 0x0036, zzrq -> 0x0039, zziz -> 0x003c, TryCatch #10 {zzcc -> 0x0036, zzgx -> 0x0033, zziz -> 0x003c, zzrq -> 0x0039, zztt -> 0x0030, IOException -> 0x002d, RuntimeException -> 0x002a, blocks: (B:3:0x0006, B:4:0x000d, B:6:0x0011, B:22:0x003f, B:23:0x0043, B:24:0x0047, B:28:0x004e, B:30:0x0057, B:32:0x0065, B:33:0x006c, B:34:0x0076, B:35:0x0089, B:36:0x00a0, B:37:0x00b6, B:39:0x00c5, B:40:0x00c9, B:41:0x00da, B:43:0x00e9, B:44:0x0105, B:45:0x0118, B:46:0x0121, B:48:0x0133, B:49:0x013f, B:50:0x014f, B:52:0x015b, B:55:0x0166, B:56:0x016d, B:57:0x017a, B:61:0x0181, B:63:0x0189, B:65:0x018d, B:67:0x0193, B:69:0x019b, B:71:0x01a3, B:72:0x01a6, B:74:0x01ab, B:80:0x01b7, B:81:0x01b8, B:85:0x01bf, B:87:0x01cd, B:88:0x01d0, B:89:0x01d5, B:91:0x01e5, B:92:0x01e8, B:93:0x01ed, B:94:0x01f2, B:96:0x01fe, B:97:0x020a, B:99:0x0216, B:101:0x0242, B:102:0x0262, B:103:0x0267, B:104:0x026b, B:106:0x0270, B:107:0x0281, B:109:0x028d, B:110:0x0290, B:116:0x029a, B:117:0x029b, B:118:0x02a0, B:119:0x02a8, B:123:0x02e0, B:198:0x0412, B:177:0x03d6, B:176:0x03d2, B:205:0x041f, B:206:0x042d, B:131:0x0333, B:133:0x034a, B:221:0x0451, B:223:0x046c, B:226:0x047b, B:228:0x048a, B:230:0x0496, B:232:0x04ab, B:233:0x04b0, B:234:0x04b3, B:236:0x04b7, B:238:0x04c4, B:309:0x061a, B:311:0x0622, B:313:0x062a, B:316:0x062f, B:317:0x063b, B:319:0x0640, B:321:0x0648, B:324:0x0658, B:326:0x065e, B:327:0x067c, B:329:0x0684, B:331:0x068a, B:333:0x068f, B:335:0x0693, B:337:0x0699, B:339:0x069d, B:341:0x06a5, B:343:0x06ab, B:345:0x06b5, B:348:0x06bb, B:349:0x06be, B:351:0x06c6, B:353:0x06d8, B:355:0x06e0, B:357:0x06e8, B:361:0x06f2, B:362:0x071d, B:364:0x0722, B:366:0x0728, B:367:0x072f, B:370:0x0742, B:372:0x0748, B:376:0x0755, B:378:0x075f, B:379:0x0763, B:381:0x0771, B:382:0x0788, B:384:0x078d, B:386:0x0795, B:388:0x079c, B:392:0x07a5, B:397:0x07b4, B:403:0x07c1, B:405:0x07c7, B:414:0x07d9, B:415:0x07dc, B:417:0x07e6, B:419:0x07ec, B:423:0x07f9, B:432:0x0822, B:434:0x0828, B:436:0x082c, B:463:0x08ad, B:465:0x08ba, B:484:0x0903, B:487:0x090a, B:489:0x090f, B:491:0x0917, B:493:0x0925, B:494:0x092c, B:495:0x092f, B:497:0x0935, B:499:0x093e, B:501:0x0944, B:503:0x094a, B:510:0x0969, B:512:0x096f, B:516:0x0978, B:527:0x0997, B:523:0x098a, B:525:0x098e, B:526:0x0994, B:504:0x0951, B:507:0x095f, B:508:0x0966, B:509:0x0967, B:441:0x0838, B:443:0x083c, B:445:0x0850, B:447:0x085b, B:449:0x0867, B:453:0x0870, B:455:0x087a, B:461:0x0885, B:466:0x08be, B:468:0x08c4, B:470:0x08c8, B:474:0x08d1, B:476:0x08df, B:478:0x08e7, B:480:0x08f1, B:481:0x08f6, B:482:0x08fb, B:483:0x0900, B:425:0x0801, B:427:0x0805, B:428:0x080f, B:430:0x0815, B:416:0x07df, B:241:0x04d3, B:243:0x04d9, B:246:0x04e4, B:249:0x04ef, B:251:0x04f4, B:254:0x0502, B:256:0x0508, B:257:0x0510, B:258:0x0513, B:260:0x051b, B:262:0x0529, B:264:0x0566, B:266:0x0570, B:268:0x057a, B:270:0x0582, B:271:0x0585, B:272:0x0588, B:274:0x058e, B:276:0x059c, B:278:0x05a1, B:280:0x05ab, B:282:0x05b5, B:284:0x05c6, B:286:0x05cc, B:287:0x05d7, B:288:0x05da, B:290:0x05e0, B:293:0x05e5, B:295:0x05ea, B:297:0x05f2, B:299:0x05f8, B:301:0x05fe, B:305:0x060c, B:307:0x0614, B:308:0x0617, B:237:0x04c1, B:528:0x099c, B:532:0x09a3, B:533:0x09ab, B:537:0x09c9), top: B:604:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:466:0x08be A[Catch: RuntimeException -> 0x002a, IOException -> 0x002d, zztt -> 0x0030, zzgx -> 0x0033, zzcc -> 0x0036, zzrq -> 0x0039, zziz -> 0x003c, TryCatch #10 {zzcc -> 0x0036, zzgx -> 0x0033, zziz -> 0x003c, zzrq -> 0x0039, zztt -> 0x0030, IOException -> 0x002d, RuntimeException -> 0x002a, blocks: (B:3:0x0006, B:4:0x000d, B:6:0x0011, B:22:0x003f, B:23:0x0043, B:24:0x0047, B:28:0x004e, B:30:0x0057, B:32:0x0065, B:33:0x006c, B:34:0x0076, B:35:0x0089, B:36:0x00a0, B:37:0x00b6, B:39:0x00c5, B:40:0x00c9, B:41:0x00da, B:43:0x00e9, B:44:0x0105, B:45:0x0118, B:46:0x0121, B:48:0x0133, B:49:0x013f, B:50:0x014f, B:52:0x015b, B:55:0x0166, B:56:0x016d, B:57:0x017a, B:61:0x0181, B:63:0x0189, B:65:0x018d, B:67:0x0193, B:69:0x019b, B:71:0x01a3, B:72:0x01a6, B:74:0x01ab, B:80:0x01b7, B:81:0x01b8, B:85:0x01bf, B:87:0x01cd, B:88:0x01d0, B:89:0x01d5, B:91:0x01e5, B:92:0x01e8, B:93:0x01ed, B:94:0x01f2, B:96:0x01fe, B:97:0x020a, B:99:0x0216, B:101:0x0242, B:102:0x0262, B:103:0x0267, B:104:0x026b, B:106:0x0270, B:107:0x0281, B:109:0x028d, B:110:0x0290, B:116:0x029a, B:117:0x029b, B:118:0x02a0, B:119:0x02a8, B:123:0x02e0, B:198:0x0412, B:177:0x03d6, B:176:0x03d2, B:205:0x041f, B:206:0x042d, B:131:0x0333, B:133:0x034a, B:221:0x0451, B:223:0x046c, B:226:0x047b, B:228:0x048a, B:230:0x0496, B:232:0x04ab, B:233:0x04b0, B:234:0x04b3, B:236:0x04b7, B:238:0x04c4, B:309:0x061a, B:311:0x0622, B:313:0x062a, B:316:0x062f, B:317:0x063b, B:319:0x0640, B:321:0x0648, B:324:0x0658, B:326:0x065e, B:327:0x067c, B:329:0x0684, B:331:0x068a, B:333:0x068f, B:335:0x0693, B:337:0x0699, B:339:0x069d, B:341:0x06a5, B:343:0x06ab, B:345:0x06b5, B:348:0x06bb, B:349:0x06be, B:351:0x06c6, B:353:0x06d8, B:355:0x06e0, B:357:0x06e8, B:361:0x06f2, B:362:0x071d, B:364:0x0722, B:366:0x0728, B:367:0x072f, B:370:0x0742, B:372:0x0748, B:376:0x0755, B:378:0x075f, B:379:0x0763, B:381:0x0771, B:382:0x0788, B:384:0x078d, B:386:0x0795, B:388:0x079c, B:392:0x07a5, B:397:0x07b4, B:403:0x07c1, B:405:0x07c7, B:414:0x07d9, B:415:0x07dc, B:417:0x07e6, B:419:0x07ec, B:423:0x07f9, B:432:0x0822, B:434:0x0828, B:436:0x082c, B:463:0x08ad, B:465:0x08ba, B:484:0x0903, B:487:0x090a, B:489:0x090f, B:491:0x0917, B:493:0x0925, B:494:0x092c, B:495:0x092f, B:497:0x0935, B:499:0x093e, B:501:0x0944, B:503:0x094a, B:510:0x0969, B:512:0x096f, B:516:0x0978, B:527:0x0997, B:523:0x098a, B:525:0x098e, B:526:0x0994, B:504:0x0951, B:507:0x095f, B:508:0x0966, B:509:0x0967, B:441:0x0838, B:443:0x083c, B:445:0x0850, B:447:0x085b, B:449:0x0867, B:453:0x0870, B:455:0x087a, B:461:0x0885, B:466:0x08be, B:468:0x08c4, B:470:0x08c8, B:474:0x08d1, B:476:0x08df, B:478:0x08e7, B:480:0x08f1, B:481:0x08f6, B:482:0x08fb, B:483:0x0900, B:425:0x0801, B:427:0x0805, B:428:0x080f, B:430:0x0815, B:416:0x07df, B:241:0x04d3, B:243:0x04d9, B:246:0x04e4, B:249:0x04ef, B:251:0x04f4, B:254:0x0502, B:256:0x0508, B:257:0x0510, B:258:0x0513, B:260:0x051b, B:262:0x0529, B:264:0x0566, B:266:0x0570, B:268:0x057a, B:270:0x0582, B:271:0x0585, B:272:0x0588, B:274:0x058e, B:276:0x059c, B:278:0x05a1, B:280:0x05ab, B:282:0x05b5, B:284:0x05c6, B:286:0x05cc, B:287:0x05d7, B:288:0x05da, B:290:0x05e0, B:293:0x05e5, B:295:0x05ea, B:297:0x05f2, B:299:0x05f8, B:301:0x05fe, B:305:0x060c, B:307:0x0614, B:308:0x0617, B:237:0x04c1, B:528:0x099c, B:532:0x09a3, B:533:0x09ab, B:537:0x09c9), top: B:604:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:468:0x08c4 A[Catch: RuntimeException -> 0x002a, IOException -> 0x002d, zztt -> 0x0030, zzgx -> 0x0033, zzcc -> 0x0036, zzrq -> 0x0039, zziz -> 0x003c, TryCatch #10 {zzcc -> 0x0036, zzgx -> 0x0033, zziz -> 0x003c, zzrq -> 0x0039, zztt -> 0x0030, IOException -> 0x002d, RuntimeException -> 0x002a, blocks: (B:3:0x0006, B:4:0x000d, B:6:0x0011, B:22:0x003f, B:23:0x0043, B:24:0x0047, B:28:0x004e, B:30:0x0057, B:32:0x0065, B:33:0x006c, B:34:0x0076, B:35:0x0089, B:36:0x00a0, B:37:0x00b6, B:39:0x00c5, B:40:0x00c9, B:41:0x00da, B:43:0x00e9, B:44:0x0105, B:45:0x0118, B:46:0x0121, B:48:0x0133, B:49:0x013f, B:50:0x014f, B:52:0x015b, B:55:0x0166, B:56:0x016d, B:57:0x017a, B:61:0x0181, B:63:0x0189, B:65:0x018d, B:67:0x0193, B:69:0x019b, B:71:0x01a3, B:72:0x01a6, B:74:0x01ab, B:80:0x01b7, B:81:0x01b8, B:85:0x01bf, B:87:0x01cd, B:88:0x01d0, B:89:0x01d5, B:91:0x01e5, B:92:0x01e8, B:93:0x01ed, B:94:0x01f2, B:96:0x01fe, B:97:0x020a, B:99:0x0216, B:101:0x0242, B:102:0x0262, B:103:0x0267, B:104:0x026b, B:106:0x0270, B:107:0x0281, B:109:0x028d, B:110:0x0290, B:116:0x029a, B:117:0x029b, B:118:0x02a0, B:119:0x02a8, B:123:0x02e0, B:198:0x0412, B:177:0x03d6, B:176:0x03d2, B:205:0x041f, B:206:0x042d, B:131:0x0333, B:133:0x034a, B:221:0x0451, B:223:0x046c, B:226:0x047b, B:228:0x048a, B:230:0x0496, B:232:0x04ab, B:233:0x04b0, B:234:0x04b3, B:236:0x04b7, B:238:0x04c4, B:309:0x061a, B:311:0x0622, B:313:0x062a, B:316:0x062f, B:317:0x063b, B:319:0x0640, B:321:0x0648, B:324:0x0658, B:326:0x065e, B:327:0x067c, B:329:0x0684, B:331:0x068a, B:333:0x068f, B:335:0x0693, B:337:0x0699, B:339:0x069d, B:341:0x06a5, B:343:0x06ab, B:345:0x06b5, B:348:0x06bb, B:349:0x06be, B:351:0x06c6, B:353:0x06d8, B:355:0x06e0, B:357:0x06e8, B:361:0x06f2, B:362:0x071d, B:364:0x0722, B:366:0x0728, B:367:0x072f, B:370:0x0742, B:372:0x0748, B:376:0x0755, B:378:0x075f, B:379:0x0763, B:381:0x0771, B:382:0x0788, B:384:0x078d, B:386:0x0795, B:388:0x079c, B:392:0x07a5, B:397:0x07b4, B:403:0x07c1, B:405:0x07c7, B:414:0x07d9, B:415:0x07dc, B:417:0x07e6, B:419:0x07ec, B:423:0x07f9, B:432:0x0822, B:434:0x0828, B:436:0x082c, B:463:0x08ad, B:465:0x08ba, B:484:0x0903, B:487:0x090a, B:489:0x090f, B:491:0x0917, B:493:0x0925, B:494:0x092c, B:495:0x092f, B:497:0x0935, B:499:0x093e, B:501:0x0944, B:503:0x094a, B:510:0x0969, B:512:0x096f, B:516:0x0978, B:527:0x0997, B:523:0x098a, B:525:0x098e, B:526:0x0994, B:504:0x0951, B:507:0x095f, B:508:0x0966, B:509:0x0967, B:441:0x0838, B:443:0x083c, B:445:0x0850, B:447:0x085b, B:449:0x0867, B:453:0x0870, B:455:0x087a, B:461:0x0885, B:466:0x08be, B:468:0x08c4, B:470:0x08c8, B:474:0x08d1, B:476:0x08df, B:478:0x08e7, B:480:0x08f1, B:481:0x08f6, B:482:0x08fb, B:483:0x0900, B:425:0x0801, B:427:0x0805, B:428:0x080f, B:430:0x0815, B:416:0x07df, B:241:0x04d3, B:243:0x04d9, B:246:0x04e4, B:249:0x04ef, B:251:0x04f4, B:254:0x0502, B:256:0x0508, B:257:0x0510, B:258:0x0513, B:260:0x051b, B:262:0x0529, B:264:0x0566, B:266:0x0570, B:268:0x057a, B:270:0x0582, B:271:0x0585, B:272:0x0588, B:274:0x058e, B:276:0x059c, B:278:0x05a1, B:280:0x05ab, B:282:0x05b5, B:284:0x05c6, B:286:0x05cc, B:287:0x05d7, B:288:0x05da, B:290:0x05e0, B:293:0x05e5, B:295:0x05ea, B:297:0x05f2, B:299:0x05f8, B:301:0x05fe, B:305:0x060c, B:307:0x0614, B:308:0x0617, B:237:0x04c1, B:528:0x099c, B:532:0x09a3, B:533:0x09ab, B:537:0x09c9), top: B:604:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:470:0x08c8 A[Catch: RuntimeException -> 0x002a, IOException -> 0x002d, zztt -> 0x0030, zzgx -> 0x0033, zzcc -> 0x0036, zzrq -> 0x0039, zziz -> 0x003c, TryCatch #10 {zzcc -> 0x0036, zzgx -> 0x0033, zziz -> 0x003c, zzrq -> 0x0039, zztt -> 0x0030, IOException -> 0x002d, RuntimeException -> 0x002a, blocks: (B:3:0x0006, B:4:0x000d, B:6:0x0011, B:22:0x003f, B:23:0x0043, B:24:0x0047, B:28:0x004e, B:30:0x0057, B:32:0x0065, B:33:0x006c, B:34:0x0076, B:35:0x0089, B:36:0x00a0, B:37:0x00b6, B:39:0x00c5, B:40:0x00c9, B:41:0x00da, B:43:0x00e9, B:44:0x0105, B:45:0x0118, B:46:0x0121, B:48:0x0133, B:49:0x013f, B:50:0x014f, B:52:0x015b, B:55:0x0166, B:56:0x016d, B:57:0x017a, B:61:0x0181, B:63:0x0189, B:65:0x018d, B:67:0x0193, B:69:0x019b, B:71:0x01a3, B:72:0x01a6, B:74:0x01ab, B:80:0x01b7, B:81:0x01b8, B:85:0x01bf, B:87:0x01cd, B:88:0x01d0, B:89:0x01d5, B:91:0x01e5, B:92:0x01e8, B:93:0x01ed, B:94:0x01f2, B:96:0x01fe, B:97:0x020a, B:99:0x0216, B:101:0x0242, B:102:0x0262, B:103:0x0267, B:104:0x026b, B:106:0x0270, B:107:0x0281, B:109:0x028d, B:110:0x0290, B:116:0x029a, B:117:0x029b, B:118:0x02a0, B:119:0x02a8, B:123:0x02e0, B:198:0x0412, B:177:0x03d6, B:176:0x03d2, B:205:0x041f, B:206:0x042d, B:131:0x0333, B:133:0x034a, B:221:0x0451, B:223:0x046c, B:226:0x047b, B:228:0x048a, B:230:0x0496, B:232:0x04ab, B:233:0x04b0, B:234:0x04b3, B:236:0x04b7, B:238:0x04c4, B:309:0x061a, B:311:0x0622, B:313:0x062a, B:316:0x062f, B:317:0x063b, B:319:0x0640, B:321:0x0648, B:324:0x0658, B:326:0x065e, B:327:0x067c, B:329:0x0684, B:331:0x068a, B:333:0x068f, B:335:0x0693, B:337:0x0699, B:339:0x069d, B:341:0x06a5, B:343:0x06ab, B:345:0x06b5, B:348:0x06bb, B:349:0x06be, B:351:0x06c6, B:353:0x06d8, B:355:0x06e0, B:357:0x06e8, B:361:0x06f2, B:362:0x071d, B:364:0x0722, B:366:0x0728, B:367:0x072f, B:370:0x0742, B:372:0x0748, B:376:0x0755, B:378:0x075f, B:379:0x0763, B:381:0x0771, B:382:0x0788, B:384:0x078d, B:386:0x0795, B:388:0x079c, B:392:0x07a5, B:397:0x07b4, B:403:0x07c1, B:405:0x07c7, B:414:0x07d9, B:415:0x07dc, B:417:0x07e6, B:419:0x07ec, B:423:0x07f9, B:432:0x0822, B:434:0x0828, B:436:0x082c, B:463:0x08ad, B:465:0x08ba, B:484:0x0903, B:487:0x090a, B:489:0x090f, B:491:0x0917, B:493:0x0925, B:494:0x092c, B:495:0x092f, B:497:0x0935, B:499:0x093e, B:501:0x0944, B:503:0x094a, B:510:0x0969, B:512:0x096f, B:516:0x0978, B:527:0x0997, B:523:0x098a, B:525:0x098e, B:526:0x0994, B:504:0x0951, B:507:0x095f, B:508:0x0966, B:509:0x0967, B:441:0x0838, B:443:0x083c, B:445:0x0850, B:447:0x085b, B:449:0x0867, B:453:0x0870, B:455:0x087a, B:461:0x0885, B:466:0x08be, B:468:0x08c4, B:470:0x08c8, B:474:0x08d1, B:476:0x08df, B:478:0x08e7, B:480:0x08f1, B:481:0x08f6, B:482:0x08fb, B:483:0x0900, B:425:0x0801, B:427:0x0805, B:428:0x080f, B:430:0x0815, B:416:0x07df, B:241:0x04d3, B:243:0x04d9, B:246:0x04e4, B:249:0x04ef, B:251:0x04f4, B:254:0x0502, B:256:0x0508, B:257:0x0510, B:258:0x0513, B:260:0x051b, B:262:0x0529, B:264:0x0566, B:266:0x0570, B:268:0x057a, B:270:0x0582, B:271:0x0585, B:272:0x0588, B:274:0x058e, B:276:0x059c, B:278:0x05a1, B:280:0x05ab, B:282:0x05b5, B:284:0x05c6, B:286:0x05cc, B:287:0x05d7, B:288:0x05da, B:290:0x05e0, B:293:0x05e5, B:295:0x05ea, B:297:0x05f2, B:299:0x05f8, B:301:0x05fe, B:305:0x060c, B:307:0x0614, B:308:0x0617, B:237:0x04c1, B:528:0x099c, B:532:0x09a3, B:533:0x09ab, B:537:0x09c9), top: B:604:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:472:0x08ce  */
    /* JADX WARN: Code duplicated, block: B:473:0x08cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:474:0x08d1 A[Catch: RuntimeException -> 0x002a, IOException -> 0x002d, zztt -> 0x0030, zzgx -> 0x0033, zzcc -> 0x0036, zzrq -> 0x0039, zziz -> 0x003c, TryCatch #10 {zzcc -> 0x0036, zzgx -> 0x0033, zziz -> 0x003c, zzrq -> 0x0039, zztt -> 0x0030, IOException -> 0x002d, RuntimeException -> 0x002a, blocks: (B:3:0x0006, B:4:0x000d, B:6:0x0011, B:22:0x003f, B:23:0x0043, B:24:0x0047, B:28:0x004e, B:30:0x0057, B:32:0x0065, B:33:0x006c, B:34:0x0076, B:35:0x0089, B:36:0x00a0, B:37:0x00b6, B:39:0x00c5, B:40:0x00c9, B:41:0x00da, B:43:0x00e9, B:44:0x0105, B:45:0x0118, B:46:0x0121, B:48:0x0133, B:49:0x013f, B:50:0x014f, B:52:0x015b, B:55:0x0166, B:56:0x016d, B:57:0x017a, B:61:0x0181, B:63:0x0189, B:65:0x018d, B:67:0x0193, B:69:0x019b, B:71:0x01a3, B:72:0x01a6, B:74:0x01ab, B:80:0x01b7, B:81:0x01b8, B:85:0x01bf, B:87:0x01cd, B:88:0x01d0, B:89:0x01d5, B:91:0x01e5, B:92:0x01e8, B:93:0x01ed, B:94:0x01f2, B:96:0x01fe, B:97:0x020a, B:99:0x0216, B:101:0x0242, B:102:0x0262, B:103:0x0267, B:104:0x026b, B:106:0x0270, B:107:0x0281, B:109:0x028d, B:110:0x0290, B:116:0x029a, B:117:0x029b, B:118:0x02a0, B:119:0x02a8, B:123:0x02e0, B:198:0x0412, B:177:0x03d6, B:176:0x03d2, B:205:0x041f, B:206:0x042d, B:131:0x0333, B:133:0x034a, B:221:0x0451, B:223:0x046c, B:226:0x047b, B:228:0x048a, B:230:0x0496, B:232:0x04ab, B:233:0x04b0, B:234:0x04b3, B:236:0x04b7, B:238:0x04c4, B:309:0x061a, B:311:0x0622, B:313:0x062a, B:316:0x062f, B:317:0x063b, B:319:0x0640, B:321:0x0648, B:324:0x0658, B:326:0x065e, B:327:0x067c, B:329:0x0684, B:331:0x068a, B:333:0x068f, B:335:0x0693, B:337:0x0699, B:339:0x069d, B:341:0x06a5, B:343:0x06ab, B:345:0x06b5, B:348:0x06bb, B:349:0x06be, B:351:0x06c6, B:353:0x06d8, B:355:0x06e0, B:357:0x06e8, B:361:0x06f2, B:362:0x071d, B:364:0x0722, B:366:0x0728, B:367:0x072f, B:370:0x0742, B:372:0x0748, B:376:0x0755, B:378:0x075f, B:379:0x0763, B:381:0x0771, B:382:0x0788, B:384:0x078d, B:386:0x0795, B:388:0x079c, B:392:0x07a5, B:397:0x07b4, B:403:0x07c1, B:405:0x07c7, B:414:0x07d9, B:415:0x07dc, B:417:0x07e6, B:419:0x07ec, B:423:0x07f9, B:432:0x0822, B:434:0x0828, B:436:0x082c, B:463:0x08ad, B:465:0x08ba, B:484:0x0903, B:487:0x090a, B:489:0x090f, B:491:0x0917, B:493:0x0925, B:494:0x092c, B:495:0x092f, B:497:0x0935, B:499:0x093e, B:501:0x0944, B:503:0x094a, B:510:0x0969, B:512:0x096f, B:516:0x0978, B:527:0x0997, B:523:0x098a, B:525:0x098e, B:526:0x0994, B:504:0x0951, B:507:0x095f, B:508:0x0966, B:509:0x0967, B:441:0x0838, B:443:0x083c, B:445:0x0850, B:447:0x085b, B:449:0x0867, B:453:0x0870, B:455:0x087a, B:461:0x0885, B:466:0x08be, B:468:0x08c4, B:470:0x08c8, B:474:0x08d1, B:476:0x08df, B:478:0x08e7, B:480:0x08f1, B:481:0x08f6, B:482:0x08fb, B:483:0x0900, B:425:0x0801, B:427:0x0805, B:428:0x080f, B:430:0x0815, B:416:0x07df, B:241:0x04d3, B:243:0x04d9, B:246:0x04e4, B:249:0x04ef, B:251:0x04f4, B:254:0x0502, B:256:0x0508, B:257:0x0510, B:258:0x0513, B:260:0x051b, B:262:0x0529, B:264:0x0566, B:266:0x0570, B:268:0x057a, B:270:0x0582, B:271:0x0585, B:272:0x0588, B:274:0x058e, B:276:0x059c, B:278:0x05a1, B:280:0x05ab, B:282:0x05b5, B:284:0x05c6, B:286:0x05cc, B:287:0x05d7, B:288:0x05da, B:290:0x05e0, B:293:0x05e5, B:295:0x05ea, B:297:0x05f2, B:299:0x05f8, B:301:0x05fe, B:305:0x060c, B:307:0x0614, B:308:0x0617, B:237:0x04c1, B:528:0x099c, B:532:0x09a3, B:533:0x09ab, B:537:0x09c9), top: B:604:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:476:0x08df A[Catch: RuntimeException -> 0x002a, IOException -> 0x002d, zztt -> 0x0030, zzgx -> 0x0033, zzcc -> 0x0036, zzrq -> 0x0039, zziz -> 0x003c, TryCatch #10 {zzcc -> 0x0036, zzgx -> 0x0033, zziz -> 0x003c, zzrq -> 0x0039, zztt -> 0x0030, IOException -> 0x002d, RuntimeException -> 0x002a, blocks: (B:3:0x0006, B:4:0x000d, B:6:0x0011, B:22:0x003f, B:23:0x0043, B:24:0x0047, B:28:0x004e, B:30:0x0057, B:32:0x0065, B:33:0x006c, B:34:0x0076, B:35:0x0089, B:36:0x00a0, B:37:0x00b6, B:39:0x00c5, B:40:0x00c9, B:41:0x00da, B:43:0x00e9, B:44:0x0105, B:45:0x0118, B:46:0x0121, B:48:0x0133, B:49:0x013f, B:50:0x014f, B:52:0x015b, B:55:0x0166, B:56:0x016d, B:57:0x017a, B:61:0x0181, B:63:0x0189, B:65:0x018d, B:67:0x0193, B:69:0x019b, B:71:0x01a3, B:72:0x01a6, B:74:0x01ab, B:80:0x01b7, B:81:0x01b8, B:85:0x01bf, B:87:0x01cd, B:88:0x01d0, B:89:0x01d5, B:91:0x01e5, B:92:0x01e8, B:93:0x01ed, B:94:0x01f2, B:96:0x01fe, B:97:0x020a, B:99:0x0216, B:101:0x0242, B:102:0x0262, B:103:0x0267, B:104:0x026b, B:106:0x0270, B:107:0x0281, B:109:0x028d, B:110:0x0290, B:116:0x029a, B:117:0x029b, B:118:0x02a0, B:119:0x02a8, B:123:0x02e0, B:198:0x0412, B:177:0x03d6, B:176:0x03d2, B:205:0x041f, B:206:0x042d, B:131:0x0333, B:133:0x034a, B:221:0x0451, B:223:0x046c, B:226:0x047b, B:228:0x048a, B:230:0x0496, B:232:0x04ab, B:233:0x04b0, B:234:0x04b3, B:236:0x04b7, B:238:0x04c4, B:309:0x061a, B:311:0x0622, B:313:0x062a, B:316:0x062f, B:317:0x063b, B:319:0x0640, B:321:0x0648, B:324:0x0658, B:326:0x065e, B:327:0x067c, B:329:0x0684, B:331:0x068a, B:333:0x068f, B:335:0x0693, B:337:0x0699, B:339:0x069d, B:341:0x06a5, B:343:0x06ab, B:345:0x06b5, B:348:0x06bb, B:349:0x06be, B:351:0x06c6, B:353:0x06d8, B:355:0x06e0, B:357:0x06e8, B:361:0x06f2, B:362:0x071d, B:364:0x0722, B:366:0x0728, B:367:0x072f, B:370:0x0742, B:372:0x0748, B:376:0x0755, B:378:0x075f, B:379:0x0763, B:381:0x0771, B:382:0x0788, B:384:0x078d, B:386:0x0795, B:388:0x079c, B:392:0x07a5, B:397:0x07b4, B:403:0x07c1, B:405:0x07c7, B:414:0x07d9, B:415:0x07dc, B:417:0x07e6, B:419:0x07ec, B:423:0x07f9, B:432:0x0822, B:434:0x0828, B:436:0x082c, B:463:0x08ad, B:465:0x08ba, B:484:0x0903, B:487:0x090a, B:489:0x090f, B:491:0x0917, B:493:0x0925, B:494:0x092c, B:495:0x092f, B:497:0x0935, B:499:0x093e, B:501:0x0944, B:503:0x094a, B:510:0x0969, B:512:0x096f, B:516:0x0978, B:527:0x0997, B:523:0x098a, B:525:0x098e, B:526:0x0994, B:504:0x0951, B:507:0x095f, B:508:0x0966, B:509:0x0967, B:441:0x0838, B:443:0x083c, B:445:0x0850, B:447:0x085b, B:449:0x0867, B:453:0x0870, B:455:0x087a, B:461:0x0885, B:466:0x08be, B:468:0x08c4, B:470:0x08c8, B:474:0x08d1, B:476:0x08df, B:478:0x08e7, B:480:0x08f1, B:481:0x08f6, B:482:0x08fb, B:483:0x0900, B:425:0x0801, B:427:0x0805, B:428:0x080f, B:430:0x0815, B:416:0x07df, B:241:0x04d3, B:243:0x04d9, B:246:0x04e4, B:249:0x04ef, B:251:0x04f4, B:254:0x0502, B:256:0x0508, B:257:0x0510, B:258:0x0513, B:260:0x051b, B:262:0x0529, B:264:0x0566, B:266:0x0570, B:268:0x057a, B:270:0x0582, B:271:0x0585, B:272:0x0588, B:274:0x058e, B:276:0x059c, B:278:0x05a1, B:280:0x05ab, B:282:0x05b5, B:284:0x05c6, B:286:0x05cc, B:287:0x05d7, B:288:0x05da, B:290:0x05e0, B:293:0x05e5, B:295:0x05ea, B:297:0x05f2, B:299:0x05f8, B:301:0x05fe, B:305:0x060c, B:307:0x0614, B:308:0x0617, B:237:0x04c1, B:528:0x099c, B:532:0x09a3, B:533:0x09ab, B:537:0x09c9), top: B:604:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:478:0x08e7 A[Catch: RuntimeException -> 0x002a, IOException -> 0x002d, zztt -> 0x0030, zzgx -> 0x0033, zzcc -> 0x0036, zzrq -> 0x0039, zziz -> 0x003c, TryCatch #10 {zzcc -> 0x0036, zzgx -> 0x0033, zziz -> 0x003c, zzrq -> 0x0039, zztt -> 0x0030, IOException -> 0x002d, RuntimeException -> 0x002a, blocks: (B:3:0x0006, B:4:0x000d, B:6:0x0011, B:22:0x003f, B:23:0x0043, B:24:0x0047, B:28:0x004e, B:30:0x0057, B:32:0x0065, B:33:0x006c, B:34:0x0076, B:35:0x0089, B:36:0x00a0, B:37:0x00b6, B:39:0x00c5, B:40:0x00c9, B:41:0x00da, B:43:0x00e9, B:44:0x0105, B:45:0x0118, B:46:0x0121, B:48:0x0133, B:49:0x013f, B:50:0x014f, B:52:0x015b, B:55:0x0166, B:56:0x016d, B:57:0x017a, B:61:0x0181, B:63:0x0189, B:65:0x018d, B:67:0x0193, B:69:0x019b, B:71:0x01a3, B:72:0x01a6, B:74:0x01ab, B:80:0x01b7, B:81:0x01b8, B:85:0x01bf, B:87:0x01cd, B:88:0x01d0, B:89:0x01d5, B:91:0x01e5, B:92:0x01e8, B:93:0x01ed, B:94:0x01f2, B:96:0x01fe, B:97:0x020a, B:99:0x0216, B:101:0x0242, B:102:0x0262, B:103:0x0267, B:104:0x026b, B:106:0x0270, B:107:0x0281, B:109:0x028d, B:110:0x0290, B:116:0x029a, B:117:0x029b, B:118:0x02a0, B:119:0x02a8, B:123:0x02e0, B:198:0x0412, B:177:0x03d6, B:176:0x03d2, B:205:0x041f, B:206:0x042d, B:131:0x0333, B:133:0x034a, B:221:0x0451, B:223:0x046c, B:226:0x047b, B:228:0x048a, B:230:0x0496, B:232:0x04ab, B:233:0x04b0, B:234:0x04b3, B:236:0x04b7, B:238:0x04c4, B:309:0x061a, B:311:0x0622, B:313:0x062a, B:316:0x062f, B:317:0x063b, B:319:0x0640, B:321:0x0648, B:324:0x0658, B:326:0x065e, B:327:0x067c, B:329:0x0684, B:331:0x068a, B:333:0x068f, B:335:0x0693, B:337:0x0699, B:339:0x069d, B:341:0x06a5, B:343:0x06ab, B:345:0x06b5, B:348:0x06bb, B:349:0x06be, B:351:0x06c6, B:353:0x06d8, B:355:0x06e0, B:357:0x06e8, B:361:0x06f2, B:362:0x071d, B:364:0x0722, B:366:0x0728, B:367:0x072f, B:370:0x0742, B:372:0x0748, B:376:0x0755, B:378:0x075f, B:379:0x0763, B:381:0x0771, B:382:0x0788, B:384:0x078d, B:386:0x0795, B:388:0x079c, B:392:0x07a5, B:397:0x07b4, B:403:0x07c1, B:405:0x07c7, B:414:0x07d9, B:415:0x07dc, B:417:0x07e6, B:419:0x07ec, B:423:0x07f9, B:432:0x0822, B:434:0x0828, B:436:0x082c, B:463:0x08ad, B:465:0x08ba, B:484:0x0903, B:487:0x090a, B:489:0x090f, B:491:0x0917, B:493:0x0925, B:494:0x092c, B:495:0x092f, B:497:0x0935, B:499:0x093e, B:501:0x0944, B:503:0x094a, B:510:0x0969, B:512:0x096f, B:516:0x0978, B:527:0x0997, B:523:0x098a, B:525:0x098e, B:526:0x0994, B:504:0x0951, B:507:0x095f, B:508:0x0966, B:509:0x0967, B:441:0x0838, B:443:0x083c, B:445:0x0850, B:447:0x085b, B:449:0x0867, B:453:0x0870, B:455:0x087a, B:461:0x0885, B:466:0x08be, B:468:0x08c4, B:470:0x08c8, B:474:0x08d1, B:476:0x08df, B:478:0x08e7, B:480:0x08f1, B:481:0x08f6, B:482:0x08fb, B:483:0x0900, B:425:0x0801, B:427:0x0805, B:428:0x080f, B:430:0x0815, B:416:0x07df, B:241:0x04d3, B:243:0x04d9, B:246:0x04e4, B:249:0x04ef, B:251:0x04f4, B:254:0x0502, B:256:0x0508, B:257:0x0510, B:258:0x0513, B:260:0x051b, B:262:0x0529, B:264:0x0566, B:266:0x0570, B:268:0x057a, B:270:0x0582, B:271:0x0585, B:272:0x0588, B:274:0x058e, B:276:0x059c, B:278:0x05a1, B:280:0x05ab, B:282:0x05b5, B:284:0x05c6, B:286:0x05cc, B:287:0x05d7, B:288:0x05da, B:290:0x05e0, B:293:0x05e5, B:295:0x05ea, B:297:0x05f2, B:299:0x05f8, B:301:0x05fe, B:305:0x060c, B:307:0x0614, B:308:0x0617, B:237:0x04c1, B:528:0x099c, B:532:0x09a3, B:533:0x09ab, B:537:0x09c9), top: B:604:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:480:0x08f1 A[Catch: RuntimeException -> 0x002a, IOException -> 0x002d, zztt -> 0x0030, zzgx -> 0x0033, zzcc -> 0x0036, zzrq -> 0x0039, zziz -> 0x003c, LOOP:8: B:479:0x08ef->B:480:0x08f1, LOOP_END, TryCatch #10 {zzcc -> 0x0036, zzgx -> 0x0033, zziz -> 0x003c, zzrq -> 0x0039, zztt -> 0x0030, IOException -> 0x002d, RuntimeException -> 0x002a, blocks: (B:3:0x0006, B:4:0x000d, B:6:0x0011, B:22:0x003f, B:23:0x0043, B:24:0x0047, B:28:0x004e, B:30:0x0057, B:32:0x0065, B:33:0x006c, B:34:0x0076, B:35:0x0089, B:36:0x00a0, B:37:0x00b6, B:39:0x00c5, B:40:0x00c9, B:41:0x00da, B:43:0x00e9, B:44:0x0105, B:45:0x0118, B:46:0x0121, B:48:0x0133, B:49:0x013f, B:50:0x014f, B:52:0x015b, B:55:0x0166, B:56:0x016d, B:57:0x017a, B:61:0x0181, B:63:0x0189, B:65:0x018d, B:67:0x0193, B:69:0x019b, B:71:0x01a3, B:72:0x01a6, B:74:0x01ab, B:80:0x01b7, B:81:0x01b8, B:85:0x01bf, B:87:0x01cd, B:88:0x01d0, B:89:0x01d5, B:91:0x01e5, B:92:0x01e8, B:93:0x01ed, B:94:0x01f2, B:96:0x01fe, B:97:0x020a, B:99:0x0216, B:101:0x0242, B:102:0x0262, B:103:0x0267, B:104:0x026b, B:106:0x0270, B:107:0x0281, B:109:0x028d, B:110:0x0290, B:116:0x029a, B:117:0x029b, B:118:0x02a0, B:119:0x02a8, B:123:0x02e0, B:198:0x0412, B:177:0x03d6, B:176:0x03d2, B:205:0x041f, B:206:0x042d, B:131:0x0333, B:133:0x034a, B:221:0x0451, B:223:0x046c, B:226:0x047b, B:228:0x048a, B:230:0x0496, B:232:0x04ab, B:233:0x04b0, B:234:0x04b3, B:236:0x04b7, B:238:0x04c4, B:309:0x061a, B:311:0x0622, B:313:0x062a, B:316:0x062f, B:317:0x063b, B:319:0x0640, B:321:0x0648, B:324:0x0658, B:326:0x065e, B:327:0x067c, B:329:0x0684, B:331:0x068a, B:333:0x068f, B:335:0x0693, B:337:0x0699, B:339:0x069d, B:341:0x06a5, B:343:0x06ab, B:345:0x06b5, B:348:0x06bb, B:349:0x06be, B:351:0x06c6, B:353:0x06d8, B:355:0x06e0, B:357:0x06e8, B:361:0x06f2, B:362:0x071d, B:364:0x0722, B:366:0x0728, B:367:0x072f, B:370:0x0742, B:372:0x0748, B:376:0x0755, B:378:0x075f, B:379:0x0763, B:381:0x0771, B:382:0x0788, B:384:0x078d, B:386:0x0795, B:388:0x079c, B:392:0x07a5, B:397:0x07b4, B:403:0x07c1, B:405:0x07c7, B:414:0x07d9, B:415:0x07dc, B:417:0x07e6, B:419:0x07ec, B:423:0x07f9, B:432:0x0822, B:434:0x0828, B:436:0x082c, B:463:0x08ad, B:465:0x08ba, B:484:0x0903, B:487:0x090a, B:489:0x090f, B:491:0x0917, B:493:0x0925, B:494:0x092c, B:495:0x092f, B:497:0x0935, B:499:0x093e, B:501:0x0944, B:503:0x094a, B:510:0x0969, B:512:0x096f, B:516:0x0978, B:527:0x0997, B:523:0x098a, B:525:0x098e, B:526:0x0994, B:504:0x0951, B:507:0x095f, B:508:0x0966, B:509:0x0967, B:441:0x0838, B:443:0x083c, B:445:0x0850, B:447:0x085b, B:449:0x0867, B:453:0x0870, B:455:0x087a, B:461:0x0885, B:466:0x08be, B:468:0x08c4, B:470:0x08c8, B:474:0x08d1, B:476:0x08df, B:478:0x08e7, B:480:0x08f1, B:481:0x08f6, B:482:0x08fb, B:483:0x0900, B:425:0x0801, B:427:0x0805, B:428:0x080f, B:430:0x0815, B:416:0x07df, B:241:0x04d3, B:243:0x04d9, B:246:0x04e4, B:249:0x04ef, B:251:0x04f4, B:254:0x0502, B:256:0x0508, B:257:0x0510, B:258:0x0513, B:260:0x051b, B:262:0x0529, B:264:0x0566, B:266:0x0570, B:268:0x057a, B:270:0x0582, B:271:0x0585, B:272:0x0588, B:274:0x058e, B:276:0x059c, B:278:0x05a1, B:280:0x05ab, B:282:0x05b5, B:284:0x05c6, B:286:0x05cc, B:287:0x05d7, B:288:0x05da, B:290:0x05e0, B:293:0x05e5, B:295:0x05ea, B:297:0x05f2, B:299:0x05f8, B:301:0x05fe, B:305:0x060c, B:307:0x0614, B:308:0x0617, B:237:0x04c1, B:528:0x099c, B:532:0x09a3, B:533:0x09ab, B:537:0x09c9), top: B:604:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:486:0x0909  */
    /* JADX WARN: Code duplicated, block: B:489:0x090f A[Catch: RuntimeException -> 0x002a, IOException -> 0x002d, zztt -> 0x0030, zzgx -> 0x0033, zzcc -> 0x0036, zzrq -> 0x0039, zziz -> 0x003c, TryCatch #10 {zzcc -> 0x0036, zzgx -> 0x0033, zziz -> 0x003c, zzrq -> 0x0039, zztt -> 0x0030, IOException -> 0x002d, RuntimeException -> 0x002a, blocks: (B:3:0x0006, B:4:0x000d, B:6:0x0011, B:22:0x003f, B:23:0x0043, B:24:0x0047, B:28:0x004e, B:30:0x0057, B:32:0x0065, B:33:0x006c, B:34:0x0076, B:35:0x0089, B:36:0x00a0, B:37:0x00b6, B:39:0x00c5, B:40:0x00c9, B:41:0x00da, B:43:0x00e9, B:44:0x0105, B:45:0x0118, B:46:0x0121, B:48:0x0133, B:49:0x013f, B:50:0x014f, B:52:0x015b, B:55:0x0166, B:56:0x016d, B:57:0x017a, B:61:0x0181, B:63:0x0189, B:65:0x018d, B:67:0x0193, B:69:0x019b, B:71:0x01a3, B:72:0x01a6, B:74:0x01ab, B:80:0x01b7, B:81:0x01b8, B:85:0x01bf, B:87:0x01cd, B:88:0x01d0, B:89:0x01d5, B:91:0x01e5, B:92:0x01e8, B:93:0x01ed, B:94:0x01f2, B:96:0x01fe, B:97:0x020a, B:99:0x0216, B:101:0x0242, B:102:0x0262, B:103:0x0267, B:104:0x026b, B:106:0x0270, B:107:0x0281, B:109:0x028d, B:110:0x0290, B:116:0x029a, B:117:0x029b, B:118:0x02a0, B:119:0x02a8, B:123:0x02e0, B:198:0x0412, B:177:0x03d6, B:176:0x03d2, B:205:0x041f, B:206:0x042d, B:131:0x0333, B:133:0x034a, B:221:0x0451, B:223:0x046c, B:226:0x047b, B:228:0x048a, B:230:0x0496, B:232:0x04ab, B:233:0x04b0, B:234:0x04b3, B:236:0x04b7, B:238:0x04c4, B:309:0x061a, B:311:0x0622, B:313:0x062a, B:316:0x062f, B:317:0x063b, B:319:0x0640, B:321:0x0648, B:324:0x0658, B:326:0x065e, B:327:0x067c, B:329:0x0684, B:331:0x068a, B:333:0x068f, B:335:0x0693, B:337:0x0699, B:339:0x069d, B:341:0x06a5, B:343:0x06ab, B:345:0x06b5, B:348:0x06bb, B:349:0x06be, B:351:0x06c6, B:353:0x06d8, B:355:0x06e0, B:357:0x06e8, B:361:0x06f2, B:362:0x071d, B:364:0x0722, B:366:0x0728, B:367:0x072f, B:370:0x0742, B:372:0x0748, B:376:0x0755, B:378:0x075f, B:379:0x0763, B:381:0x0771, B:382:0x0788, B:384:0x078d, B:386:0x0795, B:388:0x079c, B:392:0x07a5, B:397:0x07b4, B:403:0x07c1, B:405:0x07c7, B:414:0x07d9, B:415:0x07dc, B:417:0x07e6, B:419:0x07ec, B:423:0x07f9, B:432:0x0822, B:434:0x0828, B:436:0x082c, B:463:0x08ad, B:465:0x08ba, B:484:0x0903, B:487:0x090a, B:489:0x090f, B:491:0x0917, B:493:0x0925, B:494:0x092c, B:495:0x092f, B:497:0x0935, B:499:0x093e, B:501:0x0944, B:503:0x094a, B:510:0x0969, B:512:0x096f, B:516:0x0978, B:527:0x0997, B:523:0x098a, B:525:0x098e, B:526:0x0994, B:504:0x0951, B:507:0x095f, B:508:0x0966, B:509:0x0967, B:441:0x0838, B:443:0x083c, B:445:0x0850, B:447:0x085b, B:449:0x0867, B:453:0x0870, B:455:0x087a, B:461:0x0885, B:466:0x08be, B:468:0x08c4, B:470:0x08c8, B:474:0x08d1, B:476:0x08df, B:478:0x08e7, B:480:0x08f1, B:481:0x08f6, B:482:0x08fb, B:483:0x0900, B:425:0x0801, B:427:0x0805, B:428:0x080f, B:430:0x0815, B:416:0x07df, B:241:0x04d3, B:243:0x04d9, B:246:0x04e4, B:249:0x04ef, B:251:0x04f4, B:254:0x0502, B:256:0x0508, B:257:0x0510, B:258:0x0513, B:260:0x051b, B:262:0x0529, B:264:0x0566, B:266:0x0570, B:268:0x057a, B:270:0x0582, B:271:0x0585, B:272:0x0588, B:274:0x058e, B:276:0x059c, B:278:0x05a1, B:280:0x05ab, B:282:0x05b5, B:284:0x05c6, B:286:0x05cc, B:287:0x05d7, B:288:0x05da, B:290:0x05e0, B:293:0x05e5, B:295:0x05ea, B:297:0x05f2, B:299:0x05f8, B:301:0x05fe, B:305:0x060c, B:307:0x0614, B:308:0x0617, B:237:0x04c1, B:528:0x099c, B:532:0x09a3, B:533:0x09ab, B:537:0x09c9), top: B:604:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:509:0x0967 A[Catch: RuntimeException -> 0x002a, IOException -> 0x002d, zztt -> 0x0030, zzgx -> 0x0033, zzcc -> 0x0036, zzrq -> 0x0039, zziz -> 0x003c, TryCatch #10 {zzcc -> 0x0036, zzgx -> 0x0033, zziz -> 0x003c, zzrq -> 0x0039, zztt -> 0x0030, IOException -> 0x002d, RuntimeException -> 0x002a, blocks: (B:3:0x0006, B:4:0x000d, B:6:0x0011, B:22:0x003f, B:23:0x0043, B:24:0x0047, B:28:0x004e, B:30:0x0057, B:32:0x0065, B:33:0x006c, B:34:0x0076, B:35:0x0089, B:36:0x00a0, B:37:0x00b6, B:39:0x00c5, B:40:0x00c9, B:41:0x00da, B:43:0x00e9, B:44:0x0105, B:45:0x0118, B:46:0x0121, B:48:0x0133, B:49:0x013f, B:50:0x014f, B:52:0x015b, B:55:0x0166, B:56:0x016d, B:57:0x017a, B:61:0x0181, B:63:0x0189, B:65:0x018d, B:67:0x0193, B:69:0x019b, B:71:0x01a3, B:72:0x01a6, B:74:0x01ab, B:80:0x01b7, B:81:0x01b8, B:85:0x01bf, B:87:0x01cd, B:88:0x01d0, B:89:0x01d5, B:91:0x01e5, B:92:0x01e8, B:93:0x01ed, B:94:0x01f2, B:96:0x01fe, B:97:0x020a, B:99:0x0216, B:101:0x0242, B:102:0x0262, B:103:0x0267, B:104:0x026b, B:106:0x0270, B:107:0x0281, B:109:0x028d, B:110:0x0290, B:116:0x029a, B:117:0x029b, B:118:0x02a0, B:119:0x02a8, B:123:0x02e0, B:198:0x0412, B:177:0x03d6, B:176:0x03d2, B:205:0x041f, B:206:0x042d, B:131:0x0333, B:133:0x034a, B:221:0x0451, B:223:0x046c, B:226:0x047b, B:228:0x048a, B:230:0x0496, B:232:0x04ab, B:233:0x04b0, B:234:0x04b3, B:236:0x04b7, B:238:0x04c4, B:309:0x061a, B:311:0x0622, B:313:0x062a, B:316:0x062f, B:317:0x063b, B:319:0x0640, B:321:0x0648, B:324:0x0658, B:326:0x065e, B:327:0x067c, B:329:0x0684, B:331:0x068a, B:333:0x068f, B:335:0x0693, B:337:0x0699, B:339:0x069d, B:341:0x06a5, B:343:0x06ab, B:345:0x06b5, B:348:0x06bb, B:349:0x06be, B:351:0x06c6, B:353:0x06d8, B:355:0x06e0, B:357:0x06e8, B:361:0x06f2, B:362:0x071d, B:364:0x0722, B:366:0x0728, B:367:0x072f, B:370:0x0742, B:372:0x0748, B:376:0x0755, B:378:0x075f, B:379:0x0763, B:381:0x0771, B:382:0x0788, B:384:0x078d, B:386:0x0795, B:388:0x079c, B:392:0x07a5, B:397:0x07b4, B:403:0x07c1, B:405:0x07c7, B:414:0x07d9, B:415:0x07dc, B:417:0x07e6, B:419:0x07ec, B:423:0x07f9, B:432:0x0822, B:434:0x0828, B:436:0x082c, B:463:0x08ad, B:465:0x08ba, B:484:0x0903, B:487:0x090a, B:489:0x090f, B:491:0x0917, B:493:0x0925, B:494:0x092c, B:495:0x092f, B:497:0x0935, B:499:0x093e, B:501:0x0944, B:503:0x094a, B:510:0x0969, B:512:0x096f, B:516:0x0978, B:527:0x0997, B:523:0x098a, B:525:0x098e, B:526:0x0994, B:504:0x0951, B:507:0x095f, B:508:0x0966, B:509:0x0967, B:441:0x0838, B:443:0x083c, B:445:0x0850, B:447:0x085b, B:449:0x0867, B:453:0x0870, B:455:0x087a, B:461:0x0885, B:466:0x08be, B:468:0x08c4, B:470:0x08c8, B:474:0x08d1, B:476:0x08df, B:478:0x08e7, B:480:0x08f1, B:481:0x08f6, B:482:0x08fb, B:483:0x0900, B:425:0x0801, B:427:0x0805, B:428:0x080f, B:430:0x0815, B:416:0x07df, B:241:0x04d3, B:243:0x04d9, B:246:0x04e4, B:249:0x04ef, B:251:0x04f4, B:254:0x0502, B:256:0x0508, B:257:0x0510, B:258:0x0513, B:260:0x051b, B:262:0x0529, B:264:0x0566, B:266:0x0570, B:268:0x057a, B:270:0x0582, B:271:0x0585, B:272:0x0588, B:274:0x058e, B:276:0x059c, B:278:0x05a1, B:280:0x05ab, B:282:0x05b5, B:284:0x05c6, B:286:0x05cc, B:287:0x05d7, B:288:0x05da, B:290:0x05e0, B:293:0x05e5, B:295:0x05ea, B:297:0x05f2, B:299:0x05f8, B:301:0x05fe, B:305:0x060c, B:307:0x0614, B:308:0x0617, B:237:0x04c1, B:528:0x099c, B:532:0x09a3, B:533:0x09ab, B:537:0x09c9), top: B:604:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:515:0x0977  */
    /* JADX WARN: Code duplicated, block: B:518:0x0980  */
    /* JADX WARN: Code duplicated, block: B:519:0x0981  */
    /* JADX WARN: Code duplicated, block: B:521:0x0985  */
    /* JADX WARN: Code duplicated, block: B:630:0x092f A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:478:0x08e7, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v70, types: [l.b6z0, l.btx0] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        boolean z;
        oay0 oay0VarM108674i;
        long j;
        long j2;
        boolean z2;
        long j3;
        kzy0 kzy0Var;
        boolean z3;
        boolean z4;
        long j4;
        long j5;
        long j6;
        edy0 edy0Var;
        int i;
        edy0 edy0VarM12651l0;
        int i2;
        zziz zzizVar;
        long j7;
        int i3;
        boolean z5;
        boolean z6;
        long j8;
        boolean z7;
        int i4;
        int i5;
        vey0[] vey0VarArr;
        edy0 edy0Var2;
        oay0 oay0VarM108673h;
        int i6;
        long j9;
        oay0 oay0VarM108673h2;
        oay0 oay0VarM166864g;
        boolean z8;
        tay0 tay0VarM108675j;
        final C2134b7 c2134b7 = this;
        try {
            int i7 = -1;
            zziz zzizVar2 = null;
            switch (message.what) {
                case 0:
                    c2134b7.f9905v.m108392a(1);
                    c2134b7.m12655q(false, false, false, true);
                    c2134b7.f9889f.zzb();
                    c2134b7.m12662y(true != c2134b7.f9904u.f93590a.m113469o() ? 2 : 4);
                    c2134b7.f9901r.m103648g(c2134b7.f9890g);
                    c2134b7.f9891h.mo121305n(2);
                    z = true;
                    c2134b7.m12653n();
                    return z;
                case 1:
                    c2134b7.m12661x(message.arg1 != 0, message.arg2, true, 1);
                    z = true;
                    c2134b7.m12653n();
                    return z;
                case 2:
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    c2134b7.f9891h.zzf(2);
                    if (c2134b7.f9904u.f93590a.m113469o() || !c2134b7.f9901r.m103651j()) {
                        i2 = 4;
                        zzizVar = null;
                        j7 = jUptimeMillis;
                        i3 = 2;
                    } else {
                        c2134b7.f9900q.m108680o(c2134b7.f9877H);
                        if (c2134b7.f9900q.m108683r() && (tay0VarM108675j = c2134b7.f9900q.m108675j(c2134b7.f9877H, c2134b7.f9904u)) != null) {
                            oay0 oay0VarM108671f = c2134b7.f9900q.m108671f(tay0VarM108675j);
                            oay0VarM108671f.f145765a.mo101552k(c2134b7, tay0VarM108675j.f172815b);
                            if (c2134b7.f9900q.m108673h() == oay0VarM108671f) {
                                c2134b7.m12656s(tay0VarM108675j.f172815b);
                            }
                            c2134b7.m12645i(false);
                        }
                        if (c2134b7.f9871B) {
                            c2134b7.f9871B = c2134b7.m12621I();
                            c2134b7.m12615C();
                        } else {
                            c2134b7.m12652m();
                        }
                        oay0 oay0VarM108674i2 = c2134b7.f9900q.m108674i();
                        if (oay0VarM108674i2 == null) {
                            j9 = jUptimeMillis;
                            i3 = 2;
                        } else if (oay0VarM108674i2.m166864g() == null || c2134b7.f9908y) {
                            j9 = jUptimeMillis;
                            i3 = 2;
                            if (oay0VarM108674i2.f145770f.f172822i || c2134b7.f9908y) {
                                int i8 = 0;
                                while (true) {
                                    vey0[] vey0VarArr2 = c2134b7.f9884a;
                                    int length = vey0VarArr2.length;
                                    if (i8 < 2) {
                                        vey0 vey0Var = vey0VarArr2[i8];
                                        f2z0 f2z0Var = oay0VarM108674i2.f145767c[i8];
                                        if (f2z0Var != null && vey0Var.zzo() == f2z0Var && vey0Var.mo178555h()) {
                                            long j10 = oay0VarM108674i2.f145770f.f172818e;
                                            m12606R(vey0Var, (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? -9223372036854775807L : j10 + oay0VarM108674i2.m166862e());
                                        }
                                        i8++;
                                    }
                                }
                            }
                        } else {
                            oay0 oay0VarM108674i3 = c2134b7.f9900q.m108674i();
                            if (oay0VarM108674i3.f145768d) {
                                int i9 = 0;
                                while (true) {
                                    vey0[] vey0VarArr3 = c2134b7.f9884a;
                                    int length2 = vey0VarArr3.length;
                                    if (i9 < 2) {
                                        vey0 vey0Var2 = vey0VarArr3[i9];
                                        f2z0 f2z0Var2 = oay0VarM108674i3.f145767c[i9];
                                        if (vey0Var2.zzo() == f2z0Var2) {
                                            if (f2z0Var2 == null || vey0Var2.mo178555h()) {
                                                i9++;
                                            } else {
                                                oay0VarM108674i3.m166864g();
                                                boolean z9 = oay0VarM108674i3.f145770f.f172819f;
                                            }
                                        }
                                    } else if (oay0VarM108674i2.m166864g().f145768d || c2134b7.f9877H >= oay0VarM108674i2.m166864g().m166863f()) {
                                        u5z0 u5z0VarM166866i = oay0VarM108674i2.m166866i();
                                        oay0 oay0VarM108670e = c2134b7.f9900q.m108670e();
                                        u5z0 u5z0VarM166866i2 = oay0VarM108670e.m166866i();
                                        d0u0 d0u0Var = c2134b7.f9904u.f93590a;
                                        j9 = jUptimeMillis;
                                        i3 = 2;
                                        c2134b7.m12618F(d0u0Var, oay0VarM108670e.f145770f.f172814a, d0u0Var, oay0VarM108674i2.f145770f.f172814a, -9223372036854775807L, false);
                                        if (!oay0VarM108670e.f145768d || oay0VarM108670e.f145765a.zzd() == -9223372036854775807L) {
                                            int i10 = 0;
                                            while (true) {
                                                int length3 = c2134b7.f9884a.length;
                                                if (i10 < 2) {
                                                    boolean zM194640b = u5z0VarM166866i.m194640b(i10);
                                                    boolean zM194640b2 = u5z0VarM166866i2.m194640b(i10);
                                                    if (zM194640b && !c2134b7.f9884a[i10].mo178554f()) {
                                                        c2134b7.f9886c[i10].mo97570c();
                                                        dfy0 dfy0Var = u5z0VarM166866i.f177698b[i10];
                                                        dfy0 dfy0Var2 = u5z0VarM166866i2.f177698b[i10];
                                                        if (!zM194640b2 || !dfy0Var2.equals(dfy0Var)) {
                                                            m12606R(c2134b7.f9884a[i10], oay0VarM108670e.m166863f());
                                                        }
                                                    }
                                                    i10++;
                                                }
                                            }
                                        } else {
                                            long jM166863f = oay0VarM108670e.m166863f();
                                            vey0[] vey0VarArr4 = c2134b7.f9884a;
                                            int length4 = vey0VarArr4.length;
                                            for (int i11 = 0; i11 < 2; i11++) {
                                                vey0 vey0Var3 = vey0VarArr4[i11];
                                                if (vey0Var3.zzo() != null) {
                                                    m12606R(vey0Var3, jM166863f);
                                                }
                                            }
                                            if (!oay0VarM108670e.m166875r()) {
                                                c2134b7.f9900q.m108682q(oay0VarM108670e);
                                                c2134b7.m12645i(false);
                                                c2134b7.m12652m();
                                            }
                                        }
                                    }
                                    j9 = jUptimeMillis;
                                    i3 = 2;
                                }
                            } else {
                                j9 = jUptimeMillis;
                                i3 = 2;
                            }
                        }
                        oay0 oay0VarM108674i4 = c2134b7.f9900q.m108674i();
                        if (oay0VarM108674i4 != null && c2134b7.f9900q.m108673h() != oay0VarM108674i4 && !oay0VarM108674i4.f145771g) {
                            oay0 oay0VarM108674i5 = c2134b7.f9900q.m108674i();
                            u5z0 u5z0VarM166866i3 = oay0VarM108674i5.m166866i();
                            boolean z10 = false;
                            int i12 = 0;
                            while (true) {
                                vey0[] vey0VarArr5 = c2134b7.f9884a;
                                int length5 = vey0VarArr5.length;
                                if (i12 < i3) {
                                    vey0 vey0Var4 = vey0VarArr5[i12];
                                    if (m12601J(vey0Var4)) {
                                        f2z0 f2z0VarZzo = vey0Var4.zzo();
                                        f2z0 f2z0Var3 = oay0VarM108674i5.f145767c[i12];
                                        if (!u5z0VarM166866i3.m194640b(i12) || f2z0VarZzo != f2z0Var3) {
                                            if (!vey0Var4.mo178554f()) {
                                                vey0Var4.mo178556k(m12603O(u5z0VarM166866i3.f177699c[i12]), oay0VarM108674i5.f145767c[i12], oay0VarM108674i5.m166863f(), oay0VarM108674i5.m166862e(), oay0VarM108674i5.f145770f.f172814a);
                                            } else if (vey0Var4.zzV()) {
                                                c2134b7.m12637e(vey0Var4);
                                            } else {
                                                z10 = true;
                                            }
                                        }
                                    }
                                    i12++;
                                } else if (!z10) {
                                    c2134b7.m12639f();
                                }
                            }
                        }
                        boolean z11 = false;
                        while (c2134b7.m12623M() && !c2134b7.f9908y && (oay0VarM108673h2 = c2134b7.f9900q.m108673h()) != null && (oay0VarM166864g = oay0VarM108673h2.m166864g()) != null && c2134b7.f9877H >= oay0VarM166864g.m166863f() && oay0VarM166864g.f145771g) {
                            if (z11) {
                                c2134b7.m12653n();
                            }
                            oay0 oay0VarM108669d = c2134b7.f9900q.m108669d();
                            if (oay0VarM108669d == null) {
                                throw zzizVar2;
                            }
                            if (c2134b7.f9904u.f93591b.f129476a.equals(oay0VarM108669d.f145770f.f172814a.f129476a)) {
                                kzy0 kzy0Var2 = c2134b7.f9904u.f93591b;
                                if (kzy0Var2.f129477b == i7) {
                                    kzy0 kzy0Var3 = oay0VarM108669d.f145770f.f172814a;
                                    if (kzy0Var3.f129477b != i7 || kzy0Var2.f129480e == kzy0Var3.f129480e) {
                                        z8 = false;
                                    } else {
                                        z8 = true;
                                    }
                                } else {
                                    z8 = false;
                                }
                            } else {
                                z8 = false;
                            }
                            tay0 tay0Var = oay0VarM108669d.f145770f;
                            boolean z12 = z8;
                            kzy0 kzy0Var4 = tay0Var.f172814a;
                            long j11 = tay0Var.f172815b;
                            zziz zzizVar3 = zzizVar2;
                            long j12 = j9;
                            c2134b7.f9904u = c2134b7.m12651l0(kzy0Var4, j11, tay0Var.f172816c, j11, !z12, 0);
                            c2134b7.m12613r();
                            c2134b7.m12617E();
                            u5z0 u5z0VarM166866i4 = c2134b7.f9900q.m108673h().m166866i();
                            int i13 = 0;
                            while (true) {
                                int length6 = c2134b7.f9884a.length;
                                if (i13 < i3) {
                                    if (u5z0VarM166866i4.m194640b(i13)) {
                                        c2134b7.f9884a[i13].zzs();
                                    }
                                    i13++;
                                }
                            }
                            j9 = j12;
                            zzizVar2 = zzizVar3;
                            z11 = true;
                            i7 = -1;
                        }
                        zzizVar = zzizVar2;
                        j7 = j9;
                        i2 = 4;
                    }
                    int i14 = c2134b7.f9904u.f93594e;
                    z = true;
                    if (i14 != 1) {
                        if (i14 != i2) {
                            oay0 oay0VarM108673h3 = c2134b7.f9900q.m108673h();
                            if (oay0VarM108673h3 == null) {
                                c2134b7.m12658u(j7, 10L);
                            } else {
                                int i15 = mpw0.f137957a;
                                Trace.beginSection("doSomeWork");
                                c2134b7.m12617E();
                                if (oay0VarM108673h3.f145768d) {
                                    long jM159393F = mpw0.m159393F(SystemClock.elapsedRealtime());
                                    oay0VarM108673h3.f145765a.mo101548g(c2134b7.f9904u.f93607r - c2134b7.f9896m, false);
                                    int i16 = 0;
                                    z5 = true;
                                    z6 = true;
                                    while (true) {
                                        vey0[] vey0VarArr6 = c2134b7.f9884a;
                                        int length7 = vey0VarArr6.length;
                                        if (i16 < i3) {
                                            vey0 vey0Var5 = vey0VarArr6[i16];
                                            if (m12601J(vey0Var5)) {
                                                vey0Var5.mo134403w(c2134b7.f9877H, jM159393F);
                                                z5 = z5 && vey0Var5.zzV();
                                                boolean z13 = oay0VarM108673h3.f145767c[i16] != vey0Var5.zzo();
                                                boolean z14 = z13 || (!z13 && vey0Var5.mo178555h()) || vey0Var5.mo134399r() || vey0Var5.zzV();
                                                z6 = z6 && z14;
                                                if (!z14) {
                                                    vey0Var5.mo178552b();
                                                }
                                            }
                                            i16++;
                                        }
                                    }
                                } else {
                                    oay0VarM108673h3.f145765a.zzk();
                                    z5 = true;
                                    z6 = true;
                                }
                                long j13 = oay0VarM108673h3.f145770f.f172818e;
                                if (z5 && oay0VarM108673h3.f145768d) {
                                    j8 = -9223372036854775807L;
                                    if (j13 == -9223372036854775807L || j13 <= c2134b7.f9904u.f93607r) {
                                        if (c2134b7.f9908y) {
                                            c2134b7.f9908y = false;
                                            c2134b7.m12661x(false, c2134b7.f9904u.f93602m, false, 5);
                                        }
                                        if (oay0VarM108673h3.f145770f.f172822i) {
                                            c2134b7.m12662y(i2);
                                            c2134b7.m12600B();
                                        }
                                    }
                                    if (c2134b7.f9904u.f93594e == i3) {
                                        i5 = 0;
                                        while (true) {
                                            vey0VarArr = c2134b7.f9884a;
                                            int length8 = vey0VarArr.length;
                                            if (i5 < i3) {
                                                if (!m12601J(vey0VarArr[i5]) && c2134b7.f9884a[i5].zzo() == oay0VarM108673h3.f145767c[i5]) {
                                                    c2134b7.f9884a[i5].mo178552b();
                                                }
                                                i5++;
                                            } else {
                                                edy0Var2 = c2134b7.f9904u;
                                                if (!edy0Var2.f93596g || edy0Var2.f93606q >= 500000 || !c2134b7.m12621I()) {
                                                    c2134b7.f9881L = j8;
                                                } else if (c2134b7.f9881L == j8) {
                                                    c2134b7.f9881L = SystemClock.elapsedRealtime();
                                                } else if (SystemClock.elapsedRealtime() - c2134b7.f9881L >= 4000) {
                                                    throw new IllegalStateException("Playback stuck buffering and not loading");
                                                }
                                            }
                                        }
                                    } else {
                                        c2134b7.f9881L = j8;
                                    }
                                    if (c2134b7.m12623M() || c2134b7.f9904u.f93594e != 3) {
                                        z7 = false;
                                    } else {
                                        z7 = true;
                                    }
                                    edy0 edy0Var3 = c2134b7.f9904u;
                                    boolean z15 = edy0Var3.f93604o;
                                    i4 = edy0Var3.f93594e;
                                    if (i4 != i2) {
                                        if (!z7 || i4 == i3) {
                                            c2134b7.m12658u(j7, 10L);
                                        } else if (i4 == 3 && c2134b7.f9875F != 0) {
                                            c2134b7.m12658u(j7, 1000L);
                                        }
                                    }
                                    Trace.endSection();
                                } else {
                                    j8 = -9223372036854775807L;
                                }
                                edy0 edy0Var4 = c2134b7.f9904u;
                                if (edy0Var4.f93594e != i3) {
                                    if (c2134b7.f9904u.f93594e == 3) {
                                        if (c2134b7.f9875F == 0) {
                                            if (!c2134b7.m12622K()) {
                                                c2134b7.m12619G(c2134b7.m12623M(), false);
                                                c2134b7.m12662y(i3);
                                                if (c2134b7.f9909z) {
                                                    for (oay0VarM108673h = c2134b7.f9900q.m108673h(); oay0VarM108673h != null; oay0VarM108673h = oay0VarM108673h.m166864g()) {
                                                        for (n5z0 n5z0Var : oay0VarM108673h.m166866i().f177699c) {
                                                        }
                                                    }
                                                    c2134b7.f9883N.m142597c();
                                                }
                                                c2134b7.m12600B();
                                            }
                                        } else if (!z6) {
                                            c2134b7.m12619G(c2134b7.m12623M(), false);
                                            c2134b7.m12662y(i3);
                                            if (c2134b7.f9909z) {
                                                while (oay0VarM108673h != null) {
                                                    while (i6 < r5) {
                                                    }
                                                }
                                                c2134b7.f9883N.m142597c();
                                            }
                                            c2134b7.m12600B();
                                        }
                                    }
                                } else if (c2134b7.f9875F != 0) {
                                    if (z6) {
                                        if (edy0Var4.f93596g) {
                                            oay0 oay0VarM108673h4 = c2134b7.f9900q.m108673h();
                                            long jM142596b = c2134b7.m12624N(c2134b7.f9904u.f93590a, oay0VarM108673h4.f145770f.f172814a) ? c2134b7.f9883N.m142596b() : j8;
                                            oay0 oay0VarM108672g = c2134b7.f9900q.m108672g();
                                            boolean z16 = oay0VarM108672g.m166875r() && oay0VarM108672g.f145770f.f172822i;
                                            boolean z17 = oay0VarM108672g.f145770f.f172814a.m152240b() && !oay0VarM108672g.f145768d;
                                            if (z16 || z17 || c2134b7.f9889f.mo160709b(c2134b7.f9904u.f93590a, oay0VarM108673h4.f145770f.f172814a, c2134b7.m12640f0(), c2134b7.f9897n.zzc().f114615a, c2134b7.f9909z, jM142596b)) {
                                            }
                                        }
                                        c2134b7.m12662y(3);
                                        c2134b7.f9880K = zzizVar;
                                        if (c2134b7.m12623M()) {
                                            c2134b7.m12663z();
                                        }
                                    }
                                    if (c2134b7.f9904u.f93594e == 3) {
                                        if (c2134b7.f9875F == 0) {
                                            if (!c2134b7.m12622K()) {
                                                c2134b7.m12619G(c2134b7.m12623M(), false);
                                                c2134b7.m12662y(i3);
                                                if (c2134b7.f9909z) {
                                                    while (oay0VarM108673h != null) {
                                                        while (i6 < r5) {
                                                        }
                                                    }
                                                    c2134b7.f9883N.m142597c();
                                                }
                                                c2134b7.m12600B();
                                            }
                                        } else if (!z6) {
                                            c2134b7.m12619G(c2134b7.m12623M(), false);
                                            c2134b7.m12662y(i3);
                                            if (c2134b7.f9909z) {
                                                while (oay0VarM108673h != null) {
                                                    while (i6 < r5) {
                                                    }
                                                }
                                                c2134b7.f9883N.m142597c();
                                            }
                                            c2134b7.m12600B();
                                        }
                                    }
                                } else if (c2134b7.m12622K()) {
                                    c2134b7.m12662y(3);
                                    c2134b7.f9880K = zzizVar;
                                    if (c2134b7.m12623M()) {
                                        c2134b7.m12663z();
                                    }
                                } else if (c2134b7.f9904u.f93594e == 3) {
                                    if (c2134b7.f9875F == 0) {
                                        if (!c2134b7.m12622K()) {
                                            c2134b7.m12619G(c2134b7.m12623M(), false);
                                            c2134b7.m12662y(i3);
                                            if (c2134b7.f9909z) {
                                                while (oay0VarM108673h != null) {
                                                    while (i6 < r5) {
                                                    }
                                                }
                                                c2134b7.f9883N.m142597c();
                                            }
                                            c2134b7.m12600B();
                                        }
                                    } else if (!z6) {
                                        c2134b7.m12619G(c2134b7.m12623M(), false);
                                        c2134b7.m12662y(i3);
                                        if (c2134b7.f9909z) {
                                            while (oay0VarM108673h != null) {
                                                while (i6 < r5) {
                                                }
                                            }
                                            c2134b7.f9883N.m142597c();
                                        }
                                        c2134b7.m12600B();
                                    }
                                }
                                if (c2134b7.f9904u.f93594e == i3) {
                                    i5 = 0;
                                    while (true) {
                                        vey0VarArr = c2134b7.f9884a;
                                        int length9 = vey0VarArr.length;
                                        if (i5 < i3) {
                                            if (!m12601J(vey0VarArr[i5])) {
                                            }
                                            i5++;
                                        } else {
                                            edy0Var2 = c2134b7.f9904u;
                                            if (!edy0Var2.f93596g) {
                                                c2134b7.f9881L = j8;
                                            } else {
                                                c2134b7.f9881L = j8;
                                            }
                                        }
                                    }
                                } else {
                                    c2134b7.f9881L = j8;
                                }
                                if (c2134b7.m12623M()) {
                                    z7 = false;
                                } else {
                                    z7 = false;
                                }
                                edy0 edy0Var5 = c2134b7.f9904u;
                                boolean z18 = edy0Var5.f93604o;
                                i4 = edy0Var5.f93594e;
                                if (i4 != i2) {
                                    if (z7) {
                                        c2134b7.m12658u(j7, 10L);
                                    } else {
                                        c2134b7.m12658u(j7, 10L);
                                    }
                                }
                                Trace.endSection();
                            }
                        }
                        z = true;
                    }
                    c2134b7.m12653n();
                    return z;
                case 3:
                    try {
                        h8y0 h8y0Var = (h8y0) message.obj;
                        c2134b7.f9905v.m108392a(1);
                        Pair pairM12611k0 = m12611k0(c2134b7.f9904u.f93590a, h8y0Var, true, c2134b7.f9872C, c2134b7.f9873D, c2134b7.f9894k, c2134b7.f9895l);
                        if (pairM12611k0 == null) {
                            Pair pairM12648j0 = c2134b7.m12648j0(c2134b7.f9904u.f93590a);
                            kzy0 kzy0Var5 = (kzy0) pairM12648j0.first;
                            long jLongValue = ((Long) pairM12648j0.second).longValue();
                            z2 = !c2134b7.f9904u.f93590a.m113469o();
                            kzy0Var = kzy0Var5;
                            j3 = jLongValue;
                            j2 = -9223372036854775807L;
                            j = 0;
                        } else {
                            Object obj = pairM12611k0.first;
                            long jLongValue2 = ((Long) pairM12611k0.second).longValue();
                            j = 0;
                            j2 = h8y0Var.f108288c == -9223372036854775807L ? -9223372036854775807L : jLongValue2;
                            kzy0 kzy0VarM108677l = c2134b7.f9900q.m108677l(c2134b7.f9904u.f93590a, obj, jLongValue2);
                            if (kzy0VarM108677l.m152240b()) {
                                c2134b7.f9904u.f93590a.mo113468n(kzy0VarM108677l.f129476a, c2134b7.f9895l);
                                if (c2134b7.f9895l.m137509e(kzy0VarM108677l.f129477b) == kzy0VarM108677l.f129478c) {
                                    c2134b7.f9895l.m137514j();
                                }
                                kzy0Var = kzy0VarM108677l;
                                z2 = true;
                                j3 = 0;
                            } else {
                                z2 = h8y0Var.f108288c == -9223372036854775807L;
                                j3 = jLongValue2;
                                kzy0Var = kzy0VarM108677l;
                            }
                        }
                        try {
                            if (!c2134b7.f9904u.f93590a.m113469o()) {
                                edy0 edy0Var6 = c2134b7.f9904u;
                                if (pairM12611k0 == null) {
                                    if (edy0Var6.f93594e != 1) {
                                        c2134b7.m12662y(4);
                                    }
                                    c2134b7.m12655q(false, true, false, true);
                                } else {
                                    if (kzy0Var.equals(edy0Var6.f93591b)) {
                                        oay0 oay0VarM108673h5 = c2134b7.f9900q.m108673h();
                                        long jMo101547f = (oay0VarM108673h5 == null || !oay0VarM108673h5.f145768d || j3 == j) ? j3 : oay0VarM108673h5.f145765a.mo101547f(j3, c2134b7.f9903t);
                                        z4 = true;
                                        long j14 = jMo101547f;
                                        try {
                                            if (mpw0.m159396I(jMo101547f) == mpw0.m159396I(c2134b7.f9904u.f93607r) && ((i = (edy0Var = c2134b7.f9904u).f93594e) == 2 || i == 3)) {
                                                long j15 = edy0Var.f93607r;
                                                edy0VarM12651l0 = c2134b7.m12651l0(kzy0Var, j15, j2, j15, z2, 2);
                                            } else {
                                                j4 = j14;
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            j2 = j2;
                                            z3 = z2;
                                            c2134b7.f9904u = c2134b7.m12651l0(kzy0Var, j3, j2, j3, z3, 2);
                                            throw th;
                                        }
                                    } else {
                                        z4 = true;
                                        j4 = j3;
                                    }
                                    try {
                                        long jM12644h0 = c2134b7.m12644h0(kzy0Var, j4, c2134b7.f9904u.f93594e == 4 ? z4 : false);
                                        z3 = z2 | (j3 != jM12644h0 ? z4 : false);
                                        try {
                                            edy0 edy0Var7 = c2134b7.f9904u;
                                            d0u0 d0u0Var2 = edy0Var7.f93590a;
                                            long j16 = j2;
                                            try {
                                                c2134b7.m12618F(d0u0Var2, kzy0Var, d0u0Var2, edy0Var7.f93591b, j16, true);
                                                j5 = j16;
                                                j6 = jM12644h0;
                                                c2134b7 = this;
                                                edy0VarM12651l0 = c2134b7.m12651l0(kzy0Var, j6, j5, j6, z3, 2);
                                            } catch (Throwable th2) {
                                                th = th2;
                                                j2 = j16;
                                                j3 = jM12644h0;
                                                c2134b7.f9904u = c2134b7.m12651l0(kzy0Var, j3, j2, j3, z3, 2);
                                                throw th;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        z3 = z2;
                                        c2134b7.f9904u = c2134b7.m12651l0(kzy0Var, j3, j2, j3, z3, 2);
                                        throw th;
                                    }
                                }
                                c2134b7.f9904u = edy0VarM12651l0;
                                z = z4;
                                c2134b7.m12653n();
                                return z;
                            }
                            c2134b7.f9876G = h8y0Var;
                            z3 = z2;
                            j5 = j2;
                            j6 = j3;
                            z4 = true;
                            c2134b7 = this;
                            edy0VarM12651l0 = c2134b7.m12651l0(kzy0Var, j6, j5, j6, z3, 2);
                            c2134b7.f9904u = edy0VarM12651l0;
                            z = z4;
                        } catch (Throwable th5) {
                            th = th5;
                            j2 = j2;
                        }
                    } catch (zzcc e) {
                        e = e;
                        c2134b7.m12643h(e, e.zzb == 1 ? true != e.zza ? 3003 : 3001 : 1000);
                        z = true;
                    } catch (zzgx e2) {
                        e = e2;
                        c2134b7.m12643h(e, e.zza);
                        z = true;
                    } catch (zziz e3) {
                        e = e3;
                        if (e.zze == 1 && (oay0VarM108674i = c2134b7.f9900q.m108674i()) != null) {
                            e = e.zza(oay0VarM108674i.f145770f.f172814a);
                        }
                        if (e.zzk && (c2134b7.f9880K == null || e.zzb == 5003)) {
                            y4w0.m214279g("ExoPlayerImplInternal", "Recoverable renderer error", e);
                            zziz zzizVar4 = c2134b7.f9880K;
                            if (zzizVar4 != null) {
                                zzizVar4.addSuppressed(e);
                                e = c2134b7.f9880K;
                            } else {
                                c2134b7.f9880K = e;
                            }
                            usv0 usv0Var = c2134b7.f9891h;
                            usv0Var.mo121302f(usv0Var.mo121299c(25, e));
                            z = true;
                        } else {
                            zziz zzizVar5 = c2134b7.f9880K;
                            if (zzizVar5 != null) {
                                zzizVar5.addSuppressed(e);
                                e = c2134b7.f9880K;
                            }
                            y4w0.m214276d("ExoPlayerImplInternal", "Playback error", e);
                            z = true;
                            if (e.zze == 1) {
                                cby0 cby0Var = c2134b7.f9900q;
                                if (cby0Var.m108673h() != cby0Var.m108674i()) {
                                    while (true) {
                                        cby0 cby0Var2 = c2134b7.f9900q;
                                        oay0 oay0VarM108673h6 = cby0Var2.m108673h();
                                        oay0 oay0VarM108674i6 = cby0Var2.m108674i();
                                        cby0 cby0Var3 = c2134b7.f9900q;
                                        if (oay0VarM108673h6 != oay0VarM108674i6) {
                                            cby0Var3.m108669d();
                                        } else {
                                            oay0 oay0VarM108673h7 = cby0Var3.m108673h();
                                            oay0VarM108673h7.getClass();
                                            tay0 tay0Var2 = oay0VarM108673h7.f145770f;
                                            kzy0 kzy0Var6 = tay0Var2.f172814a;
                                            long j17 = tay0Var2.f172815b;
                                            c2134b7.f9904u = c2134b7.m12651l0(kzy0Var6, j17, tay0Var2.f172816c, j17, true, 0);
                                        }
                                    }
                                }
                                z = true;
                            }
                            c2134b7.m12614A(z, false);
                            c2134b7.f9904u = c2134b7.f9904u.m120533d(e);
                        }
                    } catch (zzrq e4) {
                        e = e4;
                        c2134b7.m12643h(e, e.zza);
                        z = true;
                    } catch (zztt e5) {
                        e = e5;
                        c2134b7.m12643h(e, 1002);
                        z = true;
                    } catch (IOException e6) {
                        e = e6;
                        c2134b7.m12643h(e, 2000);
                        z = true;
                    } catch (RuntimeException e7) {
                        e = e7;
                        zziz zzizVarZzd = zziz.zzd(e, ((e instanceof IllegalStateException) || (e instanceof IllegalArgumentException)) ? 1004 : 1000);
                        y4w0.m214276d("ExoPlayerImplInternal", "Playback error", zzizVarZzd);
                        c2134b7.m12614A(true, false);
                        c2134b7.f9904u = c2134b7.f9904u.m120533d(zzizVarZzd);
                        z = true;
                    }
                    c2134b7.m12653n();
                    return z;
                case 4:
                    c2134b7.m12660w((iet0) message.obj);
                    c2134b7.m12649k(c2134b7.f9897n.zzc(), true);
                    z = true;
                    c2134b7.m12653n();
                    return z;
                case 5:
                    c2134b7.f9903t = (gfy0) message.obj;
                    z = true;
                    c2134b7.m12653n();
                    return z;
                case 6:
                    c2134b7.m12614A(false, true);
                    z = true;
                    c2134b7.m12653n();
                    return z;
                case 7:
                    c2134b7.m12655q(true, false, true, false);
                    int i17 = 0;
                    while (true) {
                        int length10 = c2134b7.f9884a.length;
                        if (i17 >= 2) {
                            c2134b7.f9889f.zzc();
                            c2134b7.m12662y(1);
                            HandlerThread handlerThread = c2134b7.f9892i;
                            if (handlerThread != null) {
                                handlerThread.quit();
                            }
                            synchronized (this) {
                                c2134b7.f9906w = true;
                                c2134b7.notifyAll();
                                break;
                            }
                            return true;
                        }
                        c2134b7.f9886c[i17].zzp();
                        c2134b7.f9884a[i17].zzF();
                        i17++;
                    }
                    break;
                case 8:
                    if (c2134b7.f9900q.m108681p((izy0) message.obj)) {
                        oay0 oay0VarM108672g2 = c2134b7.f9900q.m108672g();
                        oay0VarM108672g2.m166869l(c2134b7.f9897n.zzc().f114615a, c2134b7.f9904u.f93590a);
                        c2134b7.m12616D(oay0VarM108672g2.f145770f.f172814a, oay0VarM108672g2.m166865h(), oay0VarM108672g2.m166866i());
                        if (oay0VarM108672g2 == c2134b7.f9900q.m108673h()) {
                            c2134b7.m12656s(oay0VarM108672g2.f145770f.f172815b);
                            c2134b7.m12639f();
                            edy0 edy0Var8 = c2134b7.f9904u;
                            kzy0 kzy0Var7 = edy0Var8.f93591b;
                            long j18 = oay0VarM108672g2.f145770f.f172815b;
                            c2134b7.f9904u = c2134b7.m12651l0(kzy0Var7, j18, edy0Var8.f93592c, j18, false, 5);
                        }
                        c2134b7.m12652m();
                    }
                    z = true;
                    c2134b7.m12653n();
                    return z;
                case 9:
                    if (c2134b7.f9900q.m108681p((izy0) message.obj)) {
                        c2134b7.f9900q.m108680o(c2134b7.f9877H);
                        c2134b7.m12652m();
                    }
                    z = true;
                    c2134b7.m12653n();
                    return z;
                case 10:
                    c2134b7.m12654o();
                    z = true;
                    c2134b7.m12653n();
                    return z;
                case 11:
                    int i18 = message.arg1;
                    c2134b7.f9872C = i18;
                    if (!c2134b7.f9900q.m108685t(c2134b7.f9904u.f93590a, i18)) {
                        c2134b7.m12659v(true);
                    }
                    c2134b7.m12645i(false);
                    z = true;
                    c2134b7.m12653n();
                    return z;
                case 12:
                    boolean z19 = message.arg1 != 0;
                    c2134b7.f9873D = z19;
                    if (!c2134b7.f9900q.m108686u(c2134b7.f9904u.f93590a, z19)) {
                        c2134b7.m12659v(true);
                    }
                    c2134b7.m12645i(false);
                    z = true;
                    c2134b7.m12653n();
                    return z;
                case 13:
                    boolean z20 = message.arg1 != 0;
                    AtomicBoolean atomicBoolean = (AtomicBoolean) message.obj;
                    if (c2134b7.f9874E != z20) {
                        c2134b7.f9874E = z20;
                        if (!z20) {
                            vey0[] vey0VarArr7 = c2134b7.f9884a;
                            int length11 = vey0VarArr7.length;
                            for (int i19 = 0; i19 < 2; i19++) {
                                vey0 vey0Var6 = vey0VarArr7[i19];
                                if (!m12601J(vey0Var6) && c2134b7.f9885b.remove(vey0Var6)) {
                                    vey0Var6.mo178559o();
                                }
                            }
                        }
                    }
                    if (atomicBoolean != null) {
                        synchronized (this) {
                            atomicBoolean.set(true);
                            c2134b7.notifyAll();
                            break;
                        }
                    }
                    z = true;
                    c2134b7.m12653n();
                    return z;
                case 14:
                    jey0 jey0Var = (jey0) message.obj;
                    if (jey0Var.m144630b() == c2134b7.f9893j) {
                        m12604P(jey0Var);
                        int i20 = c2134b7.f9904u.f93594e;
                        if (i20 == 3 || i20 == 2) {
                            c2134b7.f9891h.mo121305n(2);
                        }
                    } else {
                        c2134b7.f9891h.mo121299c(15, jey0Var).zza();
                    }
                    z = true;
                    c2134b7.m12653n();
                    return z;
                case 15:
                    final jey0 jey0Var2 = (jey0) message.obj;
                    Looper looperM144630b = jey0Var2.m144630b();
                    if (looperM144630b.getThread().isAlive()) {
                        c2134b7.f9899p.mo135184a(looperM144630b, null).mo121303g(new Runnable() { // from class: l.x6y0
                            @Override // java.lang.Runnable
                            public final void run() {
                                C2134b7.m12610d0(jey0Var2);
                            }
                        });
                    } else {
                        y4w0.m214278f("TAG", "Trying to send message on a dead thread.");
                        jey0Var2.m144636h(false);
                    }
                    z = true;
                    c2134b7.m12653n();
                    return z;
                case 16:
                    c2134b7.m12649k((iet0) message.obj, false);
                    z = true;
                    c2134b7.m12653n();
                    return z;
                case 17:
                    p7y0 p7y0Var = (p7y0) message.obj;
                    c2134b7.f9905v.m108392a(1);
                    if (p7y0Var.f150973b != -1) {
                        c2134b7.f9876G = new h8y0(new pey0(p7y0Var.f150972a, p7y0Var.f150975d), p7y0Var.f150973b, p7y0Var.f150974c);
                    }
                    c2134b7.m12647j(c2134b7.f9901r.m103655n(p7y0Var.f150972a, p7y0Var.f150975d), false);
                    z = true;
                    c2134b7.m12653n();
                    return z;
                case 18:
                    p7y0 p7y0Var2 = (p7y0) message.obj;
                    int iM103644a = message.arg1;
                    c2134b7.f9905v.m108392a(1);
                    bdy0 bdy0Var = c2134b7.f9901r;
                    if (iM103644a == -1) {
                        iM103644a = bdy0Var.m103644a();
                    }
                    c2134b7.m12647j(bdy0Var.m103652k(iM103644a, p7y0Var2.f150972a, p7y0Var2.f150975d), false);
                    z = true;
                    c2134b7.m12653n();
                    return z;
                case 19:
                    u7y0 u7y0Var = (u7y0) message.obj;
                    c2134b7.f9905v.m108392a(1);
                    bdy0 bdy0Var2 = c2134b7.f9901r;
                    int i21 = u7y0Var.f177954a;
                    c2134b7.m12647j(bdy0Var2.m103653l(0, 0, 0, null), false);
                    z = true;
                    c2134b7.m12653n();
                    return z;
                case 20:
                    int i22 = message.arg1;
                    int i23 = message.arg2;
                    i2z0 i2z0Var = (i2z0) message.obj;
                    c2134b7.f9905v.m108392a(1);
                    c2134b7.m12647j(c2134b7.f9901r.m103654m(i22, i23, i2z0Var), false);
                    z = true;
                    c2134b7.m12653n();
                    return z;
                case 21:
                    i2z0 i2z0Var2 = (i2z0) message.obj;
                    c2134b7.f9905v.m108392a(1);
                    c2134b7.m12647j(c2134b7.f9901r.m103656o(i2z0Var2), false);
                    z = true;
                    c2134b7.m12653n();
                    return z;
                case 22:
                    c2134b7.m12647j(c2134b7.f9901r.m103645b(), true);
                    z = true;
                    c2134b7.m12653n();
                    return z;
                case 23:
                    c2134b7.f9907x = message.arg1 != 0;
                    c2134b7.m12613r();
                    if (c2134b7.f9908y && c2134b7.f9900q.m108674i() != c2134b7.f9900q.m108673h()) {
                        c2134b7.m12659v(true);
                        c2134b7.m12645i(false);
                    }
                    z = true;
                    c2134b7.m12653n();
                    return z;
                case 24:
                default:
                    return false;
                case 25:
                    c2134b7.m12612p();
                    z = true;
                    c2134b7.m12653n();
                    return z;
                case 26:
                    c2134b7.m12612p();
                    z = true;
                    c2134b7.m12653n();
                    return z;
                case 27:
                    int i24 = message.arg1;
                    int i25 = message.arg2;
                    List list = (List) message.obj;
                    c2134b7.f9905v.m108392a(1);
                    c2134b7.m12647j(c2134b7.f9901r.m103646c(i24, i25, list), false);
                    z = true;
                    c2134b7.m12653n();
                    return z;
            }
        } catch (zzcc e8) {
            e = e8;
        } catch (zzgx e9) {
            e = e9;
        } catch (zziz e10) {
            e = e10;
        } catch (zzrq e11) {
            e = e11;
        } catch (zztt e12) {
            e = e12;
        } catch (IOException e13) {
            e = e13;
        } catch (RuntimeException e14) {
            e = e14;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m12645i(boolean z) {
        oay0 oay0VarM108672g = this.f9900q.m108672g();
        kzy0 kzy0Var = oay0VarM108672g == null ? this.f9904u.f93591b : oay0VarM108672g.f145770f.f172814a;
        boolean zEquals = this.f9904u.f93600k.equals(kzy0Var);
        if (!zEquals) {
            this.f9904u = this.f9904u.m120530a(kzy0Var);
        }
        edy0 edy0Var = this.f9904u;
        edy0Var.f93605p = oay0VarM108672g == null ? edy0Var.f93607r : oay0VarM108672g.m166860c();
        this.f9904u.f93606q = m12640f0();
        if ((!zEquals || z) && oay0VarM108672g != null && oay0VarM108672g.f145768d) {
            m12616D(oay0VarM108672g.f145770f.f172814a, oay0VarM108672g.m166865h(), oay0VarM108672g.m166866i());
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final long m12646i0(kzy0 kzy0Var, long j, boolean z, boolean z2) throws zziz {
        cby0 cby0Var;
        m12600B();
        m12619G(false, true);
        if (z2 || this.f9904u.f93594e == 3) {
            m12662y(2);
        }
        oay0 oay0VarM108673h = this.f9900q.m108673h();
        oay0 oay0VarM166864g = oay0VarM108673h;
        while (oay0VarM166864g != null && !kzy0Var.equals(oay0VarM166864g.f145770f.f172814a)) {
            oay0VarM166864g = oay0VarM166864g.m166864g();
        }
        if (z || oay0VarM108673h != oay0VarM166864g || (oay0VarM166864g != null && oay0VarM166864g.m166862e() + j < 0)) {
            vey0[] vey0VarArr = this.f9884a;
            int length = vey0VarArr.length;
            for (int i = 0; i < 2; i++) {
                m12637e(vey0VarArr[i]);
            }
            if (oay0VarM166864g != null) {
                while (true) {
                    oay0 oay0VarM108673h2 = this.f9900q.m108673h();
                    cby0Var = this.f9900q;
                    if (oay0VarM108673h2 == oay0VarM166864g) {
                        break;
                    }
                    cby0Var.m108669d();
                }
                cby0Var.m108682q(oay0VarM166864g);
                oay0VarM166864g.m166873p(1000000000000L);
                m12639f();
            }
        }
        cby0 cby0Var2 = this.f9900q;
        if (oay0VarM166864g != null) {
            cby0Var2.m108682q(oay0VarM166864g);
            if (!oay0VarM166864g.f145768d) {
                oay0VarM166864g.f145770f = oay0VarM166864g.f145770f.m189963b(j);
            } else if (oay0VarM166864g.f145769e) {
                j = oay0VarM166864g.f145765a.mo101553l(j);
                oay0VarM166864g.f145765a.mo101548g(j - this.f9896m, false);
            }
            m12656s(j);
            m12652m();
        } else {
            cby0Var2.m108678m();
            m12656s(j);
        }
        m12645i(false);
        this.f9891h.mo121305n(2);
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:200:0x0395  */
    /* JADX WARN: Code duplicated, block: B:201:0x0398  */
    /* JADX WARN: Code duplicated, block: B:204:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:208:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:210:0x03b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:216:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:219:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:221:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:225:0x0402  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36, types: [int] */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v40, types: [int] */
    /* JADX WARN: Type inference failed for: r4v53 */
    /* JADX WARN: Type inference failed for: r4v54 */
    /* JADX INFO: renamed from: j */
    public final void m12647j(d0u0 d0u0Var, boolean z) throws Throwable {
        long j;
        long j2;
        kzy0 kzy0Var;
        wyt0 wyt0Var;
        Object obj;
        int iMo113461g;
        long jLongValue;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        d0u0 d0u0Var2;
        long jLongValue2;
        ?? r11;
        long jM12644h0;
        kzy0 kzy0VarM120529h;
        boolean z6;
        boolean z7;
        boolean z8;
        int i;
        long jLongValue3;
        boolean z9;
        Object obj2;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        ?? r25;
        long j3;
        Object obj3;
        int i2;
        char c;
        long j4;
        long j5;
        long j6;
        h8y0 h8y0Var;
        edy0 edy0Var = this.f9904u;
        h8y0 h8y0Var2 = this.f9876G;
        int i3 = this.f9872C;
        boolean z15 = this.f9873D;
        int i4 = -1;
        if (d0u0Var.m113469o()) {
            d0u0Var2 = d0u0Var;
            kzy0VarM120529h = edy0.m120529h();
            z6 = false;
            z8 = false;
            jM12644h0 = 0;
            z7 = true;
            j = -9223372036854775807L;
            j2 = -9223372036854775807L;
        } else {
            hwt0 hwt0Var = this.f9895l;
            kzy0 kzy0Var2 = edy0Var.f93591b;
            Object obj4 = kzy0Var2.f129476a;
            boolean zM12602L = m12602L(edy0Var, hwt0Var);
            if (edy0Var.f93591b.m152240b() || zM12602L) {
                j = -9223372036854775807L;
                j2 = edy0Var.f93592c;
            } else {
                j = -9223372036854775807L;
                j2 = edy0Var.f93607r;
            }
            wyt0 wyt0Var2 = this.f9894k;
            if (h8y0Var2 != null) {
                kzy0Var = kzy0Var2;
                Object obj5 = obj4;
                Pair pairM12611k0 = m12611k0(d0u0Var, h8y0Var2, true, i3, z15, wyt0Var2, hwt0Var);
                if (pairM12611k0 == null) {
                    iMo113461g = d0u0Var.mo113461g(z15);
                    jLongValue3 = j2;
                    obj2 = obj5;
                    z11 = false;
                    z12 = true;
                    z10 = false;
                } else {
                    long j7 = h8y0Var2.f108288c;
                    Object obj6 = pairM12611k0.first;
                    if (j7 == j) {
                        iMo113461g = d0u0Var.mo113468n(obj6, hwt0Var).f111930c;
                        jLongValue3 = j2;
                        z9 = false;
                    } else {
                        jLongValue3 = ((Long) pairM12611k0.second).longValue();
                        obj5 = obj6;
                        iMo113461g = -1;
                        z9 = true;
                    }
                    obj2 = obj5;
                    z10 = z9;
                    z11 = edy0Var.f93594e == 4;
                    z12 = false;
                }
                j2 = jLongValue3;
                wyt0Var = wyt0Var2;
                z3 = z12;
                i4 = -1;
                z4 = z10;
                obj = obj2;
                z2 = z11;
            } else {
                kzy0Var = kzy0Var2;
                if (edy0Var.f93590a.m113469o()) {
                    iMo113461g = d0u0Var.mo113461g(z15);
                    wyt0Var = wyt0Var2;
                    obj = obj4;
                } else if (d0u0Var.mo113457a(obj4) == -1) {
                    Object objM12609W = m12609W(wyt0Var2, hwt0Var, i3, z15, obj4, edy0Var.f93590a, d0u0Var);
                    wyt0Var = wyt0Var2;
                    if (objM12609W == null) {
                        hwt0Var = hwt0Var;
                        iMo113461g = d0u0Var.mo113461g(z15);
                        z5 = true;
                    } else {
                        hwt0Var = hwt0Var;
                        iMo113461g = d0u0Var.mo113468n(objM12609W, hwt0Var).f111930c;
                        z5 = false;
                    }
                    z3 = z5;
                    obj = obj4;
                    j2 = j2;
                    i4 = -1;
                    z2 = false;
                    z4 = false;
                } else {
                    wyt0Var = wyt0Var2;
                    if (j2 == j) {
                        iMo113461g = d0u0Var.mo113468n(obj4, hwt0Var).f111930c;
                        obj = obj4;
                    } else if (zM12602L) {
                        edy0Var.f93590a.mo113468n(kzy0Var.f129476a, hwt0Var);
                        if (edy0Var.f93590a.mo107663e(hwt0Var.f111930c, wyt0Var, 0L).f191704n == edy0Var.f93590a.mo113457a(kzy0Var.f129476a)) {
                            Pair pairM113466l = d0u0Var.m113466l(wyt0Var, hwt0Var, d0u0Var.mo113468n(obj4, hwt0Var).f111930c, j2);
                            obj = pairM113466l.first;
                            jLongValue = ((Long) pairM113466l.second).longValue();
                        } else {
                            obj = obj4;
                            jLongValue = j2;
                        }
                        j2 = jLongValue;
                        iMo113461g = -1;
                        i4 = -1;
                        z2 = false;
                        z3 = false;
                        z4 = true;
                    } else {
                        obj = obj4;
                        j2 = j2;
                        iMo113461g = -1;
                        i4 = -1;
                        z2 = false;
                        z3 = false;
                        z4 = false;
                    }
                }
                z2 = false;
                z3 = false;
                z4 = false;
            }
            if (iMo113461g != i4) {
                d0u0Var2 = d0u0Var;
                Pair pairM113466l2 = d0u0Var2.m113466l(wyt0Var, hwt0Var, iMo113461g, -9223372036854775807L);
                obj = pairM113466l2.first;
                jLongValue2 = ((Long) pairM113466l2.second).longValue();
                j2 = j;
            } else {
                d0u0Var2 = d0u0Var;
                jLongValue2 = j2;
            }
            kzy0 kzy0VarM108677l = this.f9900q.m108677l(d0u0Var2, obj, jLongValue2);
            int i5 = kzy0VarM108677l.f129480e;
            r11 = -1;
            boolean z16 = kzy0Var.f129476a.equals(obj) && !kzy0Var.m152240b() && !kzy0VarM108677l.m152240b() && (i5 == -1 || ((i = kzy0Var.f129480e) != -1 && i5 >= i));
            hwt0 hwt0VarMo113468n = d0u0Var2.mo113468n(obj, hwt0Var);
            if (!zM12602L && j2 == j2 && kzy0Var.f129476a.equals(kzy0VarM108677l.f129476a)) {
                if (kzy0Var.m152240b()) {
                    hwt0VarMo113468n.m137518n(kzy0Var.f129477b);
                }
                if (kzy0VarM108677l.m152240b()) {
                    hwt0VarMo113468n.m137518n(kzy0VarM108677l.f129477b);
                }
            }
            if (true == z16) {
                kzy0VarM108677l = kzy0Var;
            }
            if (kzy0VarM108677l.m152240b()) {
                if (kzy0VarM108677l.equals(kzy0Var)) {
                    jLongValue2 = edy0Var.f93607r;
                } else {
                    d0u0Var2.mo113468n(kzy0VarM108677l.f129476a, hwt0Var);
                    if (kzy0VarM108677l.f129478c == hwt0Var.m137509e(kzy0VarM108677l.f129477b)) {
                        hwt0Var.m137514j();
                    }
                    jLongValue2 = 0;
                }
            }
            jM12644h0 = jLongValue2;
            kzy0VarM120529h = kzy0VarM108677l;
            z6 = z2;
            z7 = z3;
            z8 = z4;
        }
        boolean z17 = (this.f9904u.f93591b.equals(kzy0VarM120529h) && jM12644h0 == this.f9904u.f93607r) ? false : true;
        if (z7) {
            try {
                if (this.f9904u.f93594e != 1) {
                    try {
                        m12662y(4);
                    } catch (Throwable th) {
                        th = th;
                        z14 = z8;
                        z13 = false;
                        r25 = 0;
                        edy0 edy0Var2 = this.f9904u;
                        d0u0 d0u0Var3 = edy0Var2.f93590a;
                        kzy0 kzy0Var3 = edy0Var2.f93591b;
                        if (true != z14) {
                            j3 = j;
                        } else {
                            j3 = jM12644h0;
                        }
                        m12618F(d0u0Var, kzy0VarM120529h, d0u0Var3, kzy0Var3, j3, false);
                        if (z17) {
                            edy0 edy0Var3 = this.f9904u;
                            obj3 = edy0Var3.f93591b.f129476a;
                            d0u0 d0u0Var4 = edy0Var3.f93590a;
                            if (z17) {
                            }
                            long j8 = this.f9904u.f93593d;
                            if (d0u0Var.mo113457a(obj3) == -1) {
                                i2 = 4;
                            } else {
                                i2 = 3;
                            }
                            this.f9904u = m12651l0(kzy0VarM120529h, jM12644h0, j2, j8, z, i2);
                        } else {
                            edy0 edy0Var4 = this.f9904u;
                            obj3 = edy0Var4.f93591b.f129476a;
                            d0u0 d0u0Var5 = edy0Var4.f93590a;
                            if (z17) {
                            }
                            long j9 = this.f9904u.f93593d;
                            if (d0u0Var.mo113457a(obj3) == -1) {
                                i2 = 4;
                            } else {
                                i2 = 3;
                            }
                            this.f9904u = m12651l0(kzy0VarM120529h, jM12644h0, j2, j9, z, i2);
                        }
                        m12613r();
                        m12657t(r2, this.f9904u.f93590a);
                        this.f9904u = this.f9904u.m120535f(r2);
                        if (!d0u0Var.m113469o()) {
                            this.f9876G = r25;
                        }
                        m12645i(z13);
                        throw th;
                    }
                }
                z13 = false;
                try {
                    m12655q(false, false, false, true);
                } catch (Throwable th2) {
                    th = th2;
                    z14 = z8;
                    r25 = 0;
                    edy0 edy0Var5 = this.f9904u;
                    d0u0 d0u0Var6 = edy0Var5.f93590a;
                    kzy0 kzy0Var4 = edy0Var5.f93591b;
                    if (true != z14) {
                        j3 = j;
                    } else {
                        j3 = jM12644h0;
                    }
                    m12618F(d0u0Var, kzy0VarM120529h, d0u0Var6, kzy0Var4, j3, false);
                    if (z17) {
                        edy0 edy0Var6 = this.f9904u;
                        obj3 = edy0Var6.f93591b.f129476a;
                        d0u0 d0u0Var7 = edy0Var6.f93590a;
                        if (z17) {
                        }
                        long j10 = this.f9904u.f93593d;
                        if (d0u0Var.mo113457a(obj3) == -1) {
                            i2 = 4;
                        } else {
                            i2 = 3;
                        }
                        this.f9904u = m12651l0(kzy0VarM120529h, jM12644h0, j2, j10, z, i2);
                    } else {
                        edy0 edy0Var7 = this.f9904u;
                        obj3 = edy0Var7.f93591b.f129476a;
                        d0u0 d0u0Var8 = edy0Var7.f93590a;
                        if (z17) {
                        }
                        long j11 = this.f9904u.f93593d;
                        if (d0u0Var.mo113457a(obj3) == -1) {
                            i2 = 4;
                        } else {
                            i2 = 3;
                        }
                        this.f9904u = m12651l0(kzy0VarM120529h, jM12644h0, j2, j11, z, i2);
                    }
                    m12613r();
                    m12657t(r2, this.f9904u.f93590a);
                    this.f9904u = this.f9904u.m120535f(r2);
                    if (!d0u0Var.m113469o()) {
                        this.f9876G = r25;
                    }
                    m12645i(z13);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                z13 = false;
                z14 = z8;
                r25 = 0;
                edy0 edy0Var8 = this.f9904u;
                d0u0 d0u0Var9 = edy0Var8.f93590a;
                kzy0 kzy0Var5 = edy0Var8.f93591b;
                if (true != z14) {
                    j3 = j;
                } else {
                    j3 = jM12644h0;
                }
                m12618F(d0u0Var, kzy0VarM120529h, d0u0Var9, kzy0Var5, j3, false);
                if (z17) {
                    edy0 edy0Var9 = this.f9904u;
                    obj3 = edy0Var9.f93591b.f129476a;
                    d0u0 d0u0Var10 = edy0Var9.f93590a;
                    if (z17) {
                    }
                    long j12 = this.f9904u.f93593d;
                    if (d0u0Var.mo113457a(obj3) == -1) {
                        i2 = 4;
                    } else {
                        i2 = 3;
                    }
                    this.f9904u = m12651l0(kzy0VarM120529h, jM12644h0, j2, j12, z, i2);
                } else {
                    edy0 edy0Var10 = this.f9904u;
                    obj3 = edy0Var10.f93591b.f129476a;
                    d0u0 d0u0Var11 = edy0Var10.f93590a;
                    if (z17) {
                    }
                    long j13 = this.f9904u.f93593d;
                    if (d0u0Var.mo113457a(obj3) == -1) {
                        i2 = 4;
                    } else {
                        i2 = 3;
                    }
                    this.f9904u = m12651l0(kzy0VarM120529h, jM12644h0, j2, j13, z, i2);
                }
                m12613r();
                m12657t(r2, this.f9904u.f93590a);
                this.f9904u = this.f9904u.m120535f(r2);
                if (!d0u0Var.m113469o()) {
                    this.f9876G = r25;
                }
                m12645i(z13);
                throw th;
            }
        } else {
            z13 = false;
        }
        vey0[] vey0VarArr = this.f9884a;
        int length = vey0VarArr.length;
        ?? r4 = z13;
        while (true) {
            c = 2;
            if (r4 < 2) {
                vey0VarArr[r4].mo178557m(d0u0Var2);
                r4++;
            } else {
                try {
                    break;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        if (z17) {
            z4 = z8;
            h8y0Var = null;
            h8y0Var = null;
            if (!d0u0Var2.m113469o()) {
                for (oay0 oay0VarM108673h = this.f9900q.m108673h(); oay0VarM108673h != null; oay0VarM108673h = oay0VarM108673h.m166864g()) {
                    if (oay0VarM108673h.f145770f.f172814a.equals(kzy0VarM120529h)) {
                        oay0VarM108673h.f145770f = this.f9900q.m108676k(d0u0Var2, oay0VarM108673h.f145770f);
                        oay0VarM108673h.m166874q();
                    }
                }
                jM12644h0 = m12644h0(kzy0VarM120529h, jM12644h0, z6);
            }
        } else {
            try {
                cby0 cby0Var = this.f9900q;
                long j14 = this.f9877H;
                oay0 oay0VarM108674i = cby0Var.m108674i();
                if (oay0VarM108674i == null) {
                    j4 = j14;
                    z4 = z8;
                    j5 = 0;
                } else {
                    long jM166862e = oay0VarM108674i.m166862e();
                    z4 = z8;
                    if (oay0VarM108674i.f145768d) {
                        ?? r5 = z13;
                        long jMax = jM166862e;
                        while (true) {
                            try {
                                vey0[] vey0VarArr2 = this.f9884a;
                                int length2 = vey0VarArr2.length;
                                if (r5 >= c) {
                                    j4 = j14;
                                    j5 = jMax;
                                    break;
                                }
                                if (m12601J(vey0VarArr2[r5]) && this.f9884a[r5].zzo() == oay0VarM108674i.f145767c[r5]) {
                                    j6 = j14;
                                    long jMo178562v = this.f9884a[r5].mo178562v();
                                    if (jMo178562v == Long.MIN_VALUE) {
                                        j5 = Long.MIN_VALUE;
                                        j4 = j6;
                                        break;
                                    }
                                    jMax = Math.max(jMo178562v, jMax);
                                } else {
                                    j6 = j14;
                                }
                                j14 = j6;
                                c = 2;
                                r5++;
                            } catch (Throwable th5) {
                                th = th5;
                                z14 = z4;
                                r25 = 0;
                                edy0 edy0Var11 = this.f9904u;
                                d0u0 d0u0Var12 = edy0Var11.f93590a;
                                kzy0 kzy0Var6 = edy0Var11.f93591b;
                                if (true != z14) {
                                    j3 = j;
                                } else {
                                    j3 = jM12644h0;
                                }
                                m12618F(d0u0Var, kzy0VarM120529h, d0u0Var12, kzy0Var6, j3, false);
                                if (z17) {
                                    edy0 edy0Var12 = this.f9904u;
                                    obj3 = edy0Var12.f93591b.f129476a;
                                    d0u0 d0u0Var13 = edy0Var12.f93590a;
                                    if (z17) {
                                    }
                                    long j15 = this.f9904u.f93593d;
                                    if (d0u0Var.mo113457a(obj3) == -1) {
                                        i2 = 4;
                                    } else {
                                        i2 = 3;
                                    }
                                    this.f9904u = m12651l0(kzy0VarM120529h, jM12644h0, j2, j15, z, i2);
                                } else {
                                    edy0 edy0Var13 = this.f9904u;
                                    obj3 = edy0Var13.f93591b.f129476a;
                                    d0u0 d0u0Var14 = edy0Var13.f93590a;
                                    if (z17) {
                                    }
                                    long j16 = this.f9904u.f93593d;
                                    if (d0u0Var.mo113457a(obj3) == -1) {
                                        i2 = 4;
                                    } else {
                                        i2 = 3;
                                    }
                                    this.f9904u = m12651l0(kzy0VarM120529h, jM12644h0, j2, j16, z, i2);
                                }
                                m12613r();
                                m12657t(r2, this.f9904u.f93590a);
                                this.f9904u = this.f9904u.m120535f(r2);
                                if (!d0u0Var.m113469o()) {
                                    this.f9876G = r25;
                                }
                                m12645i(z13);
                                throw th;
                            }
                        }
                    } else {
                        j4 = j14;
                        j5 = jM166862e;
                    }
                }
                r11 = 0;
                h8y0Var = null;
                h8y0Var = null;
                try {
                    boolean zM108684s = cby0Var.m108684s(d0u0Var, j4, j5);
                    d0u0Var2 = d0u0Var;
                    if (!zM108684s) {
                        m12659v(z13);
                    }
                } catch (Throwable th6) {
                    th = th6;
                    kzy0VarM120529h = kzy0VarM120529h;
                    r25 = r11;
                    z14 = z4;
                    edy0 edy0Var14 = this.f9904u;
                    d0u0 d0u0Var15 = edy0Var14.f93590a;
                    kzy0 kzy0Var7 = edy0Var14.f93591b;
                    if (true != z14) {
                        j3 = j;
                    } else {
                        j3 = jM12644h0;
                    }
                    m12618F(d0u0Var, kzy0VarM120529h, d0u0Var15, kzy0Var7, j3, false);
                    if (z17 || j2 != this.f9904u.f93592c) {
                        edy0 edy0Var15 = this.f9904u;
                        obj3 = edy0Var15.f93591b.f129476a;
                        d0u0 d0u0Var16 = edy0Var15.f93590a;
                        boolean z18 = (z17 || !z || d0u0Var16.m113469o() || d0u0Var16.mo113468n(obj3, this.f9895l).f111933f) ? z13 : true;
                        long j17 = this.f9904u.f93593d;
                        if (d0u0Var.mo113457a(obj3) == -1) {
                            i2 = 4;
                        } else {
                            i2 = 3;
                        }
                        this.f9904u = m12651l0(kzy0VarM120529h, jM12644h0, j2, j17, z18, i2);
                    }
                    m12613r();
                    m12657t(r2, this.f9904u.f93590a);
                    this.f9904u = this.f9904u.m120535f(r2);
                    if (!d0u0Var.m113469o()) {
                        this.f9876G = r25;
                    }
                    m12645i(z13);
                    throw th;
                }
            } catch (Throwable th7) {
                th = th7;
                z4 = z8;
                r11 = 0;
            }
        }
        edy0 edy0Var16 = this.f9904u;
        kzy0 kzy0Var8 = kzy0VarM120529h;
        m12618F(d0u0Var2, kzy0Var8, edy0Var16.f93590a, edy0Var16.f93591b, true != z4 ? j : jM12644h0, false);
        if (z17 || j2 != this.f9904u.f93592c) {
            edy0 edy0Var17 = this.f9904u;
            Object obj7 = edy0Var17.f93591b.f129476a;
            d0u0 d0u0Var17 = edy0Var17.f93590a;
            this.f9904u = m12651l0(kzy0Var8, jM12644h0, j2, this.f9904u.f93593d, (!z17 || !z || d0u0Var17.m113469o() || d0u0Var17.mo113468n(obj7, this.f9895l).f111933f) ? z13 : true, d0u0Var2.mo113457a(obj7) == -1 ? 4 : 3);
        }
        m12613r();
        m12657t(d0u0Var2, this.f9904u.f93590a);
        this.f9904u = this.f9904u.m120535f(d0u0Var2);
        if (!d0u0Var2.m113469o()) {
            this.f9876G = h8y0Var;
        }
        m12645i(z13);
    }

    /* JADX INFO: renamed from: j0 */
    public final Pair m12648j0(d0u0 d0u0Var) {
        long j = 0;
        if (d0u0Var.m113469o()) {
            return Pair.create(edy0.m120529h(), 0L);
        }
        Pair pairM113466l = d0u0Var.m113466l(this.f9894k, this.f9895l, d0u0Var.mo113461g(this.f9873D), -9223372036854775807L);
        kzy0 kzy0VarM108677l = this.f9900q.m108677l(d0u0Var, pairM113466l.first, 0L);
        long jLongValue = ((Long) pairM113466l.second).longValue();
        if (kzy0VarM108677l.m152240b()) {
            d0u0Var.mo113468n(kzy0VarM108677l.f129476a, this.f9895l);
            if (kzy0VarM108677l.f129478c == this.f9895l.m137509e(kzy0VarM108677l.f129477b)) {
                this.f9895l.m137514j();
            }
        } else {
            j = jLongValue;
        }
        return Pair.create(kzy0VarM108677l, Long.valueOf(j));
    }

    /* JADX INFO: renamed from: k */
    public final void m12649k(iet0 iet0Var, boolean z) throws zziz {
        m12650l(iet0Var, iet0Var.f114615a, true, z);
    }

    /* JADX INFO: renamed from: l */
    public final void m12650l(iet0 iet0Var, float f, boolean z, boolean z2) throws zziz {
        iet0 iet0Var2;
        int i;
        if (z) {
            if (z2) {
                this.f9905v.m108392a(1);
            }
            edy0 edy0Var = this.f9904u;
            edy0 edy0Var2 = new edy0(edy0Var.f93590a, edy0Var.f93591b, edy0Var.f93592c, edy0Var.f93593d, edy0Var.f93594e, edy0Var.f93595f, edy0Var.f93596g, edy0Var.f93597h, edy0Var.f93598i, edy0Var.f93599j, edy0Var.f93600k, edy0Var.f93601l, edy0Var.f93602m, iet0Var, edy0Var.f93605p, edy0Var.f93606q, edy0Var.f93607r, edy0Var.f93608s, false);
            iet0Var2 = iet0Var;
            this.f9904u = edy0Var2;
        } else {
            iet0Var2 = iet0Var;
        }
        float f2 = iet0Var2.f114615a;
        oay0 oay0VarM108673h = this.f9900q.m108673h();
        while (true) {
            i = 0;
            if (oay0VarM108673h == null) {
                break;
            }
            n5z0[] n5z0VarArr = oay0VarM108673h.m166866i().f177699c;
            int length = n5z0VarArr.length;
            while (i < length) {
                n5z0 n5z0Var = n5z0VarArr[i];
                i++;
            }
            oay0VarM108673h = oay0VarM108673h.m166864g();
        }
        vey0[] vey0VarArr = this.f9884a;
        int length2 = vey0VarArr.length;
        while (i < 2) {
            vey0 vey0Var = vey0VarArr[i];
            if (vey0Var != null) {
                vey0Var.mo134398p(f, iet0Var2.f114615a);
            }
            i++;
        }
    }

    @CheckResult
    /* JADX INFO: renamed from: l0 */
    public final edy0 m12651l0(kzy0 kzy0Var, long j, long j2, long j3, boolean z, int i) {
        List list;
        q2z0 q2z0Var;
        u5z0 u5z0Var;
        int i2 = 0;
        this.f9879J = (!this.f9879J && j == this.f9904u.f93607r && kzy0Var.equals(this.f9904u.f93591b)) ? false : true;
        m12613r();
        edy0 edy0Var = this.f9904u;
        q2z0 q2z0Var2 = edy0Var.f93597h;
        u5z0 u5z0Var2 = edy0Var.f93598i;
        List listZzl = edy0Var.f93599j;
        if (this.f9901r.m103651j()) {
            oay0 oay0VarM108673h = this.f9900q.m108673h();
            q2z0 q2z0VarM166865h = oay0VarM108673h == null ? q2z0.f155398d : oay0VarM108673h.m166865h();
            u5z0 u5z0VarM166866i = oay0VarM108673h == null ? this.f9888e : oay0VarM108673h.m166866i();
            n5z0[] n5z0VarArr = u5z0VarM166866i.f177699c;
            mqw0 mqw0Var = new mqw0();
            int length = n5z0VarArr.length;
            int i3 = 0;
            boolean z2 = false;
            while (i3 < length) {
                n5z0 n5z0Var = n5z0VarArr[i3];
                if (n5z0Var != null) {
                    zzby zzbyVar = n5z0Var.zzd(0).f170249j;
                    if (zzbyVar == null) {
                        mqw0Var.m159613g(new zzby(-9223372036854775807L, new zzbx[0]));
                    } else {
                        mqw0Var.m159613g(zzbyVar);
                        z2 = true;
                    }
                }
                i3++;
                q2z0VarM166865h = q2z0VarM166865h;
            }
            q2z0 q2z0Var3 = q2z0VarM166865h;
            zzgaa zzgaaVarM159616j = z2 ? mqw0Var.m159616j() : zzgaa.zzl();
            if (oay0VarM108673h != null) {
                tay0 tay0Var = oay0VarM108673h.f145770f;
                if (tay0Var.f172816c != j2) {
                    oay0VarM108673h.f145770f = tay0Var.m189962a(j2);
                }
            }
            oay0 oay0VarM108673h2 = this.f9900q.m108673h();
            if (oay0VarM108673h2 != null) {
                u5z0 u5z0VarM166866i2 = oay0VarM108673h2.m166866i();
                while (true) {
                    int length2 = this.f9884a.length;
                    if (i2 >= 2) {
                        break;
                    }
                    if (u5z0VarM166866i2.m194640b(i2)) {
                        if (this.f9884a[i2].mo97570c() != 1) {
                            break;
                        }
                        int i4 = u5z0VarM166866i2.f177698b[i2].f88237a;
                    }
                    i2++;
                }
            }
            list = zzgaaVarM159616j;
            u5z0Var = u5z0VarM166866i;
            q2z0Var = q2z0Var3;
        } else {
            if (!kzy0Var.equals(this.f9904u.f93591b)) {
                u5z0Var2 = this.f9888e;
                q2z0Var2 = q2z0.f155398d;
                listZzl = zzgaa.zzl();
            }
            list = listZzl;
            q2z0Var = q2z0Var2;
            u5z0Var = u5z0Var2;
        }
        if (z) {
            this.f9905v.m108395d(i);
        }
        return this.f9904u.m120531b(kzy0Var, j, j2, j3, m12640f0(), q2z0Var, u5z0Var, list);
    }

    /* JADX INFO: renamed from: m */
    public final void m12652m() {
        long jM166862e;
        boolean zMo160710c = false;
        if (m12621I()) {
            oay0 oay0VarM108672g = this.f9900q.m108672g();
            long jM12642g0 = m12642g0(oay0VarM108672g.m166861d());
            oay0 oay0VarM108673h = this.f9900q.m108673h();
            long jM166862e2 = this.f9877H;
            if (oay0VarM108672g == oay0VarM108673h) {
                jM166862e = oay0VarM108672g.m166862e();
            } else {
                jM166862e2 -= oay0VarM108672g.m166862e();
                jM166862e = oay0VarM108672g.f145770f.f172815b;
            }
            long j = jM166862e2 - jM166862e;
            boolean zMo160710c2 = this.f9889f.mo160710c(j, jM12642g0, this.f9897n.zzc().f114615a);
            if (zMo160710c2 || jM12642g0 >= 500000 || this.f9896m <= 0) {
                zMo160710c = zMo160710c2;
            } else {
                this.f9900q.m108673h().f145765a.mo101548g(this.f9904u.f93607r, false);
                zMo160710c = this.f9889f.mo160710c(j, jM12642g0, this.f9897n.zzc().f114615a);
            }
        }
        this.f9871B = zMo160710c;
        if (zMo160710c) {
            this.f9900q.m108672g().m166868k(this.f9877H, this.f9897n.zzc().f114615a, this.f9870A);
        }
        m12615C();
    }

    /* JADX INFO: renamed from: n */
    public final void m12653n() {
        this.f9905v.m108394c(this.f9904u);
        if (this.f9905v.f80257a) {
            q0y0 q0y0Var = this.f9882M;
            q0y0Var.f155124a.m161832D(this.f9905v);
            this.f9905v = new c8y0(this.f9904u);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m12654o() throws zziz {
        int i;
        int i2;
        float f = this.f9897n.zzc().f114615a;
        cby0 cby0Var = this.f9900q;
        oay0 oay0VarM108674i = cby0Var.m108674i();
        boolean z = true;
        for (oay0 oay0VarM108673h = cby0Var.m108673h(); oay0VarM108673h != null && oay0VarM108673h.f145768d; oay0VarM108673h = oay0VarM108673h.m166864g()) {
            u5z0 u5z0VarM166867j = oay0VarM108673h.m166867j(f, this.f9904u.f93590a);
            u5z0 u5z0VarM166866i = oay0VarM108673h.m166866i();
            boolean z2 = false;
            if (u5z0VarM166866i != null) {
                if (u5z0VarM166866i.f177699c.length == u5z0VarM166867j.f177699c.length) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= u5z0VarM166867j.f177699c.length) {
                            if (oay0VarM108673h != oay0VarM108674i) {
                                z2 = true;
                            }
                            z &= z2;
                        } else if (u5z0VarM166867j.m194639a(u5z0VarM166866i, i3)) {
                            i3++;
                        }
                    }
                }
            }
            cby0 cby0Var2 = this.f9900q;
            if (z) {
                oay0 oay0VarM108673h2 = cby0Var2.m108673h();
                boolean zM108682q = cby0Var2.m108682q(oay0VarM108673h2);
                int length = this.f9884a.length;
                boolean[] zArr = new boolean[2];
                long jM166859b = oay0VarM108673h2.m166859b(u5z0VarM166867j, this.f9904u.f93607r, zM108682q, zArr);
                edy0 edy0Var = this.f9904u;
                boolean z3 = (edy0Var.f93594e == 4 || jM166859b == edy0Var.f93607r) ? false : true;
                edy0 edy0Var2 = this.f9904u;
                i = 4;
                i2 = 2;
                this.f9904u = m12651l0(edy0Var2.f93591b, jM166859b, edy0Var2.f93592c, edy0Var2.f93593d, z3, 5);
                if (z3) {
                    m12656s(jM166859b);
                }
                int length2 = this.f9884a.length;
                boolean[] zArr2 = new boolean[2];
                int i4 = 0;
                while (true) {
                    vey0[] vey0VarArr = this.f9884a;
                    int length3 = vey0VarArr.length;
                    if (i4 >= 2) {
                        break;
                    }
                    vey0 vey0Var = vey0VarArr[i4];
                    boolean zM12601J = m12601J(vey0Var);
                    zArr2[i4] = zM12601J;
                    f2z0 f2z0Var = oay0VarM108673h2.f145767c[i4];
                    if (zM12601J) {
                        if (f2z0Var != vey0Var.zzo()) {
                            m12637e(vey0Var);
                        } else if (zArr[i4]) {
                            vey0Var.mo178560q(this.f9877H);
                        }
                    }
                    i4++;
                }
                m12641g(zArr2, this.f9877H);
            } else {
                i = 4;
                i2 = 2;
                cby0Var2.m108682q(oay0VarM108673h);
                if (oay0VarM108673h.f145768d) {
                    oay0VarM108673h.m166858a(u5z0VarM166867j, Math.max(oay0VarM108673h.f145770f.f172815b, this.f9877H - oay0VarM108673h.m166862e()), false);
                }
            }
            m12645i(true);
            if (this.f9904u.f93594e != i) {
                m12652m();
                m12617E();
                this.f9891h.mo121305n(i2);
                return;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a4 A[PHI: r2 r6 r8
      0x00a4: PHI (r2v2 l.kzy0) = (r2v1 l.kzy0), (r2v12 l.kzy0) binds: [B:30:0x007a, B:32:0x009f] A[DONT_GENERATE, DONT_INLINE]
      0x00a4: PHI (r6v3 long) = (r6v2 long), (r6v10 long) binds: [B:30:0x007a, B:32:0x009f] A[DONT_GENERATE, DONT_INLINE]
      0x00a4: PHI (r8v3 long) = (r8v2 long), (r8v8 long) binds: [B:30:0x007a, B:32:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x00ec A[PHI: r0
      0x00ec: PHI (r0v11 l.d0u0) = (r0v10 l.d0u0), (r0v10 l.d0u0), (r0v20 l.d0u0), (r0v20 l.d0u0) binds: [B:36:0x00b1, B:38:0x00b5, B:40:0x00c6, B:42:0x00de] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: q */
    public final void m12655q(boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        d0u0 d0u0Var;
        kzy0 kzy0Var;
        this.f9891h.zzf(2);
        this.f9880K = null;
        m12619G(false, true);
        this.f9897n.m208459f();
        this.f9877H = 1000000000000L;
        vey0[] vey0VarArr = this.f9884a;
        int length = vey0VarArr.length;
        for (int i = 0; i < 2; i++) {
            try {
                m12637e(vey0VarArr[i]);
            } catch (zziz | RuntimeException e) {
                y4w0.m214276d("ExoPlayerImplInternal", "Disable failed.", e);
            }
        }
        if (z) {
            vey0[] vey0VarArr2 = this.f9884a;
            int length2 = vey0VarArr2.length;
            for (int i2 = 0; i2 < 2; i2++) {
                vey0 vey0Var = vey0VarArr2[i2];
                if (this.f9885b.remove(vey0Var)) {
                    try {
                        vey0Var.mo178559o();
                    } catch (RuntimeException e2) {
                        y4w0.m214276d("ExoPlayerImplInternal", "Reset failed.", e2);
                    }
                }
            }
        }
        this.f9875F = 0;
        edy0 edy0Var = this.f9904u;
        kzy0 kzy0Var2 = edy0Var.f93591b;
        long jLongValue = edy0Var.f93607r;
        long j = (this.f9904u.f93591b.m152240b() || m12602L(this.f9904u, this.f9895l)) ? this.f9904u.f93592c : this.f9904u.f93607r;
        if (z2) {
            this.f9876G = null;
            Pair pairM12648j0 = m12648j0(this.f9904u.f93590a);
            kzy0Var2 = (kzy0) pairM12648j0.first;
            jLongValue = ((Long) pairM12648j0.second).longValue();
            j = -9223372036854775807L;
            z5 = kzy0Var2.equals(this.f9904u.f93591b) ? false : true;
        }
        long j2 = jLongValue;
        long j3 = j;
        this.f9900q.m108678m();
        this.f9871B = false;
        d0u0 d0u0VarM172066z = this.f9904u.f93590a;
        if (z3 && (d0u0VarM172066z instanceof pey0)) {
            d0u0VarM172066z = ((pey0) d0u0VarM172066z).m172066z(this.f9901r.m103658q());
            if (kzy0Var2.f129477b != -1) {
                d0u0VarM172066z.mo113468n(kzy0Var2.f129476a, this.f9895l);
                hwt0 hwt0Var = this.f9895l;
                wyt0 wyt0Var = this.f9894k;
                d0u0VarM172066z.mo107663e(hwt0Var.f111930c, wyt0Var, 0L);
                if (wyt0Var.m208629b()) {
                    d0u0Var = d0u0VarM172066z;
                    kzy0Var = new kzy0(kzy0Var2.f129476a, kzy0Var2.f129479d);
                } else {
                    d0u0Var = d0u0VarM172066z;
                    kzy0Var = kzy0Var2;
                }
            } else {
                d0u0Var = d0u0VarM172066z;
                kzy0Var = kzy0Var2;
            }
        } else {
            d0u0Var = d0u0VarM172066z;
            kzy0Var = kzy0Var2;
        }
        edy0 edy0Var2 = this.f9904u;
        int i3 = edy0Var2.f93594e;
        zziz zzizVar = z4 ? null : edy0Var2.f93595f;
        q2z0 q2z0Var = z5 ? q2z0.f155398d : edy0Var2.f93597h;
        u5z0 u5z0Var = z5 ? this.f9888e : edy0Var2.f93598i;
        List listZzl = z5 ? zzgaa.zzl() : edy0Var2.f93599j;
        edy0 edy0Var3 = this.f9904u;
        this.f9904u = new edy0(d0u0Var, kzy0Var, j3, j2, i3, zzizVar, false, q2z0Var, u5z0Var, listZzl, kzy0Var, edy0Var3.f93601l, edy0Var3.f93602m, edy0Var3.f93603n, j2, 0L, j2, 0L, false);
        if (z3) {
            this.f9901r.m103649h();
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m12656s(long j) throws zziz {
        oay0 oay0VarM108673h = this.f9900q.m108673h();
        long jM166862e = j + (oay0VarM108673h == null ? 1000000000000L : oay0VarM108673h.m166862e());
        this.f9877H = jM166862e;
        this.f9897n.m208457d(jM166862e);
        vey0[] vey0VarArr = this.f9884a;
        int length = vey0VarArr.length;
        for (int i = 0; i < 2; i++) {
            vey0 vey0Var = vey0VarArr[i];
            if (m12601J(vey0Var)) {
                vey0Var.mo178560q(this.f9877H);
            }
        }
        for (oay0 oay0VarM108673h2 = this.f9900q.m108673h(); oay0VarM108673h2 != null; oay0VarM108673h2 = oay0VarM108673h2.m166864g()) {
            for (n5z0 n5z0Var : oay0VarM108673h2.m166866i().f177699c) {
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m12657t(d0u0 d0u0Var, d0u0 d0u0Var2) {
        if (d0u0Var.m113469o() && d0u0Var2.m113469o()) {
            return;
        }
        int size = this.f9898o.size() - 1;
        ArrayList arrayList = this.f9898o;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            Object obj = ((y7y0) arrayList.get(size)).f197907a;
            int i = mpw0.f137957a;
            throw null;
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m12658u(long j, long j2) {
        this.f9891h.mo121300d(2, j + j2);
    }

    /* JADX INFO: renamed from: v */
    public final void m12659v(boolean z) throws zziz {
        kzy0 kzy0Var = this.f9900q.m108673h().f145770f.f172814a;
        long jM12646i0 = m12646i0(kzy0Var, this.f9904u.f93607r, true, false);
        if (jM12646i0 != this.f9904u.f93607r) {
            edy0 edy0Var = this.f9904u;
            this.f9904u = m12651l0(kzy0Var, jM12646i0, edy0Var.f93592c, edy0Var.f93593d, z, 5);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m12660w(iet0 iet0Var) {
        this.f9891h.zzf(16);
        this.f9897n.mo148998g(iet0Var);
    }

    /* JADX INFO: renamed from: x */
    public final void m12661x(boolean z, int i, boolean z2, int i2) throws zziz {
        this.f9905v.m108392a(z2 ? 1 : 0);
        this.f9905v.m108393b(i2);
        this.f9904u = this.f9904u.m120532c(z, i);
        m12619G(false, false);
        for (oay0 oay0VarM108673h = this.f9900q.m108673h(); oay0VarM108673h != null; oay0VarM108673h = oay0VarM108673h.m166864g()) {
            for (n5z0 n5z0Var : oay0VarM108673h.m166866i().f177699c) {
            }
        }
        if (!m12623M()) {
            m12600B();
            m12617E();
            return;
        }
        int i3 = this.f9904u.f93594e;
        if (i3 == 3) {
            m12663z();
            this.f9891h.mo121305n(2);
        } else if (i3 == 2) {
            this.f9891h.mo121305n(2);
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m12662y(int i) {
        edy0 edy0Var = this.f9904u;
        if (edy0Var.f93594e != i) {
            if (i != 2) {
                this.f9881L = -9223372036854775807L;
            }
            this.f9904u = edy0Var.m120534e(i);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m12663z() throws zziz {
        m12619G(false, false);
        this.f9897n.m208458e();
        vey0[] vey0VarArr = this.f9884a;
        int length = vey0VarArr.length;
        for (int i = 0; i < 2; i++) {
            vey0 vey0Var = vey0VarArr[i];
            if (m12601J(vey0Var)) {
                vey0Var.zzN();
            }
        }
    }

    @Override // p153l.ycy0
    public final void zzh() {
        this.f9891h.mo121305n(22);
    }

    @Override // p153l.s5z0
    public final void zzj() {
        this.f9891h.mo121305n(10);
    }
}
