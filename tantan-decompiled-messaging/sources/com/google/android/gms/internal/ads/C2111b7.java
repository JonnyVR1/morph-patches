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
import com.google.android.gms.internal.ads.C2111b7;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p149l.a6y0;
import p149l.aag0;
import p149l.ayx0;
import p149l.b4y0;
import p149l.bnt0;
import p149l.bqy0;
import p149l.bty0;
import p149l.bzx0;
import p149l.c5t0;
import p149l.cox0;
import p149l.cqy0;
import p149l.cty0;
import p149l.d5y0;
import p149l.d6s0;
import p149l.eqy0;
import p149l.g6v0;
import p149l.ggw0;
import p149l.ghw0;
import p149l.hwy0;
import p149l.i1y0;
import p149l.j5y0;
import p149l.jyx0;
import p149l.k0y0;
import p149l.krx0;
import p149l.kty0;
import p149l.lox0;
import p149l.mhr0;
import p149l.mwy0;
import p149l.mxx0;
import p149l.n1y0;
import p149l.nty0;
import p149l.nwy0;
import p149l.ojv0;
import p149l.owy0;
import p149l.oyx0;
import p149l.p5y0;
import p149l.pfy0;
import p149l.q6y0;
import p149l.qox0;
import p149l.qpt0;
import p149l.s3y0;
import p149l.s5y0;
import p149l.svv0;
import p149l.syx0;
import p149l.u5y0;
import p149l.v3y0;
import p149l.vwy0;
import p149l.vxx0;
import p149l.w1y0;
import p149l.wwy0;
import p149l.wyx0;
import p149l.x5y0;
import p149l.xqt0;
import p149l.y3y0;
import p149l.zfw0;
import p149l.zsy0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.b7 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2111b7 implements Handler.Callback, bqy0, mwy0, s3y0, lox0, b4y0 {

    /* JADX INFO: renamed from: B */
    public boolean f9834B;

    /* JADX INFO: renamed from: E */
    public boolean f9837E;

    /* JADX INFO: renamed from: F */
    public int f9838F;

    /* JADX INFO: renamed from: G */
    @Nullable
    public bzx0 f9839G;

    /* JADX INFO: renamed from: H */
    public long f9840H;

    /* JADX INFO: renamed from: I */
    public int f9841I;

    /* JADX INFO: renamed from: J */
    public boolean f9842J;

    /* JADX INFO: renamed from: K */
    @Nullable
    public zziz f9843K;

    /* JADX INFO: renamed from: M */
    public final krx0 f9845M;

    /* JADX INFO: renamed from: N */
    public final cox0 f9846N;

    /* JADX INFO: renamed from: a */
    public final p5y0[] f9847a;

    /* JADX INFO: renamed from: b */
    public final Set f9848b;

    /* JADX INFO: renamed from: c */
    public final u5y0[] f9849c;

    /* JADX INFO: renamed from: d */
    public final nwy0 f9850d;

    /* JADX INFO: renamed from: e */
    public final owy0 f9851e;

    /* JADX INFO: renamed from: f */
    public final k0y0 f9852f;

    /* JADX INFO: renamed from: g */
    public final vwy0 f9853g;

    /* JADX INFO: renamed from: h */
    public final ojv0 f9854h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public final HandlerThread f9855i;

    /* JADX INFO: renamed from: j */
    public final Looper f9856j;

    /* JADX INFO: renamed from: k */
    public final qpt0 f9857k;

    /* JADX INFO: renamed from: l */
    public final bnt0 f9858l;

    /* JADX INFO: renamed from: m */
    public final long f9859m;

    /* JADX INFO: renamed from: n */
    public final qox0 f9860n;

    /* JADX INFO: renamed from: o */
    public final ArrayList f9861o;

    /* JADX INFO: renamed from: p */
    public final g6v0 f9862p;

    /* JADX INFO: renamed from: q */
    public final w1y0 f9863q;

    /* JADX INFO: renamed from: r */
    public final v3y0 f9864r;

    /* JADX INFO: renamed from: s */
    public final long f9865s;

    /* JADX INFO: renamed from: t */
    public a6y0 f9866t;

    /* JADX INFO: renamed from: u */
    public y3y0 f9867u;

    /* JADX INFO: renamed from: v */
    public wyx0 f9868v;

    /* JADX INFO: renamed from: w */
    public boolean f9869w;

    /* JADX INFO: renamed from: y */
    public boolean f9871y;

    /* JADX INFO: renamed from: z */
    public boolean f9872z;

    /* JADX INFO: renamed from: C */
    public int f9835C = 0;

    /* JADX INFO: renamed from: D */
    public boolean f9836D = false;

    /* JADX INFO: renamed from: x */
    public boolean f9870x = false;

    /* JADX INFO: renamed from: L */
    public long f9844L = -9223372036854775807L;

    /* JADX INFO: renamed from: A */
    public long f9833A = -9223372036854775807L;

    public C2111b7(p5y0[] p5y0VarArr, nwy0 nwy0Var, owy0 owy0Var, k0y0 k0y0Var, vwy0 vwy0Var, int i, boolean z, q6y0 q6y0Var, a6y0 a6y0Var, cox0 cox0Var, long j, boolean z2, Looper looper, g6v0 g6v0Var, krx0 krx0Var, pfy0 pfy0Var, Looper looper2) {
        this.f9845M = krx0Var;
        this.f9847a = p5y0VarArr;
        this.f9850d = nwy0Var;
        this.f9851e = owy0Var;
        this.f9852f = k0y0Var;
        this.f9853g = vwy0Var;
        this.f9866t = a6y0Var;
        this.f9846N = cox0Var;
        this.f9865s = j;
        this.f9862p = g6v0Var;
        this.f9859m = k0y0Var.zza();
        k0y0Var.zzf();
        y3y0 y3y0VarM212864g = y3y0.m212864g(owy0Var);
        this.f9867u = y3y0VarM212864g;
        this.f9868v = new wyx0(y3y0VarM212864g);
        int length = p5y0VarArr.length;
        this.f9849c = new u5y0[2];
        s5y0 s5y0VarMo123588a = nwy0Var.mo123588a();
        for (int i2 = 0; i2 < 2; i2++) {
            p5y0VarArr[i2].mo146612n(i2, pfy0Var, g6v0Var);
            this.f9849c[i2] = p5y0VarArr[i2].zzl();
            this.f9849c[i2].mo146616t(s5y0VarMo123588a);
        }
        this.f9860n = new qox0(this, g6v0Var);
        this.f9861o = new ArrayList();
        this.f9848b = Collections.newSetFromMap(new IdentityHashMap());
        this.f9857k = new qpt0();
        this.f9858l = new bnt0();
        nwy0Var.m161923h(this, vwy0Var);
        this.f9842J = true;
        ojv0 ojv0VarMo100826a = g6v0Var.mo100826a(looper, null);
        this.f9863q = new w1y0(q6y0Var, ojv0VarMo100826a, new vxx0(this));
        this.f9864r = new v3y0(this, q6y0Var, ojv0VarMo100826a, pfy0Var);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f9855i = handlerThread;
        handlerThread.start();
        Looper looper3 = handlerThread.getLooper();
        this.f9856j = looper3;
        this.f9854h = g6v0Var.mo100826a(looper3, this);
    }

    /* JADX INFO: renamed from: B */
    private final void m12546B() throws zziz {
        this.f9860n.m175786f();
        p5y0[] p5y0VarArr = this.f9847a;
        int length = p5y0VarArr.length;
        for (int i = 0; i < 2; i++) {
            p5y0 p5y0Var = p5y0VarArr[i];
            if (m12547J(p5y0Var)) {
                m12551Q(p5y0Var);
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public static boolean m12547J(p5y0 p5y0Var) {
        return p5y0Var.mo146615s() != 0;
    }

    /* JADX INFO: renamed from: L */
    public static boolean m12548L(y3y0 y3y0Var, bnt0 bnt0Var) {
        eqy0 eqy0Var = y3y0Var.f195864b;
        xqt0 xqt0Var = y3y0Var.f195863a;
        return xqt0Var.m210615o() || xqt0Var.mo112558n(eqy0Var.f92867a, bnt0Var).f76448f;
    }

    /* JADX INFO: renamed from: O */
    public static mhr0[] m12549O(hwy0 hwy0Var) {
        int iZzc = hwy0Var != null ? hwy0Var.zzc() : 0;
        mhr0[] mhr0VarArr = new mhr0[iZzc];
        for (int i = 0; i < iZzc; i++) {
            mhr0VarArr[i] = hwy0Var.zzd(i);
        }
        return mhr0VarArr;
    }

    /* JADX INFO: renamed from: P */
    public static final void m12550P(d5y0 d5y0Var) throws zziz {
        d5y0Var.m110104j();
        try {
            d5y0Var.m110097c().mo95065u(d5y0Var.m110095a(), d5y0Var.m110101g());
        } finally {
            d5y0Var.m110102h(true);
        }
    }

    /* JADX INFO: renamed from: Q */
    public static final void m12551Q(p5y0 p5y0Var) {
        if (p5y0Var.mo146615s() == 2) {
            p5y0Var.zzO();
        }
    }

    /* JADX INFO: renamed from: R */
    public static final void m12552R(p5y0 p5y0Var, long j) {
        p5y0Var.mo146607d();
        if (p5y0Var instanceof nty0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ i1y0 m12554U(C2111b7 c2111b7, n1y0 n1y0Var, long j) {
        k0y0 k0y0Var = c2111b7.f9852f;
        nwy0 nwy0Var = c2111b7.f9850d;
        wwy0 wwy0VarZzi = k0y0Var.zzi();
        owy0 owy0Var = c2111b7.f9851e;
        return new i1y0(c2111b7.f9849c, j, nwy0Var, wwy0VarZzi, c2111b7.f9864r, n1y0Var, owy0Var);
    }

    @Nullable
    /* JADX INFO: renamed from: W */
    public static Object m12555W(qpt0 qpt0Var, bnt0 bnt0Var, int i, boolean z, Object obj, xqt0 xqt0Var, xqt0 xqt0Var2) {
        int iMo112550a = xqt0Var.mo112550a(obj);
        int iMo113617b = xqt0Var.mo113617b();
        int i2 = 0;
        int iM210612i = iMo112550a;
        int iMo112550a2 = -1;
        while (i2 < iMo113617b && iMo112550a2 == -1) {
            qpt0 qpt0Var2 = qpt0Var;
            bnt0 bnt0Var2 = bnt0Var;
            int i3 = i;
            boolean z2 = z;
            xqt0 xqt0Var3 = xqt0Var;
            iM210612i = xqt0Var3.m210612i(iM210612i, bnt0Var2, qpt0Var2, i3, z2);
            if (iM210612i == -1) {
                iMo112550a2 = -1;
                break;
            }
            iMo112550a2 = xqt0Var2.mo112550a(xqt0Var3.mo112553f(iM210612i));
            i2++;
            xqt0Var = xqt0Var3;
            bnt0Var = bnt0Var2;
            qpt0Var = qpt0Var2;
            i = i3;
            z = z2;
        }
        if (iMo112550a2 == -1) {
            return null;
        }
        return xqt0Var2.mo112553f(iMo112550a2);
    }

    /* JADX INFO: renamed from: d0 */
    public static final /* synthetic */ void m12556d0(d5y0 d5y0Var) {
        try {
            m12550P(d5y0Var);
        } catch (zziz e) {
            svv0.m186109d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
            aag0.m95543a(e);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: k0 */
    public static Pair m12557k0(xqt0 xqt0Var, bzx0 bzx0Var, boolean z, int i, boolean z2, qpt0 qpt0Var, bnt0 bnt0Var) {
        xqt0 xqt0Var2;
        xqt0 xqt0Var3 = bzx0Var.f78091a;
        if (xqt0Var.m210615o()) {
            return null;
        }
        if (true == xqt0Var3.m210615o()) {
            xqt0Var2 = xqt0Var3;
            xqt0Var2 = xqt0Var;
        }
        try {
            xqt0Var2 = xqt0Var3;
            Pair pairM210613l = xqt0Var2.m210613l(qpt0Var, bnt0Var, bzx0Var.f78092b, bzx0Var.f78093c);
            xqt0 xqt0Var4 = xqt0Var2;
            if (xqt0Var.equals(xqt0Var4)) {
                return pairM210613l;
            }
            int iMo112550a = xqt0Var.mo112550a(pairM210613l.first);
            Object obj = pairM210613l.first;
            if (iMo112550a != -1) {
                return (xqt0Var4.mo112558n(obj, bnt0Var).f76448f && xqt0Var4.mo112552e(bnt0Var.f76445c, qpt0Var, 0L).f155827n == xqt0Var4.mo112550a(pairM210613l.first)) ? xqt0Var.m210613l(qpt0Var, bnt0Var, xqt0Var.mo112558n(pairM210613l.first, bnt0Var).f76445c, bzx0Var.f78093c) : pairM210613l;
            }
            Object objM12555W = m12555W(qpt0Var, bnt0Var, i, z2, obj, xqt0Var4, xqt0Var);
            if (objM12555W != null) {
                return xqt0Var.m210613l(qpt0Var, bnt0Var, xqt0Var.mo112558n(objM12555W, bnt0Var).f76445c, -9223372036854775807L);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    /* JADX INFO: renamed from: p */
    private final void m12558p() throws zziz {
        m12600o();
        m12605v(true);
    }

    /* JADX INFO: renamed from: r */
    private final void m12559r() {
        i1y0 i1y0VarM200994h = this.f9863q.m200994h();
        boolean z = false;
        if (i1y0VarM200994h != null && i1y0VarM200994h.f110514f.f136743h && this.f9870x) {
            z = true;
        }
        this.f9871y = z;
    }

    /* JADX INFO: renamed from: A */
    public final void m12560A(boolean z, boolean z2) {
        m12601q(z || !this.f9837E, false, true, false);
        this.f9868v.m206238a(z2 ? 1 : 0);
        this.f9852f.zzd();
        m12608y(1);
    }

    /* JADX INFO: renamed from: C */
    public final void m12561C() {
        i1y0 i1y0VarM200993g = this.f9863q.m200993g();
        boolean z = this.f9834B || (i1y0VarM200993g != null && i1y0VarM200993g.f110509a.zzp());
        y3y0 y3y0Var = this.f9867u;
        if (z != y3y0Var.f195869g) {
            this.f9867u = new y3y0(y3y0Var.f195863a, y3y0Var.f195864b, y3y0Var.f195865c, y3y0Var.f195866d, y3y0Var.f195867e, y3y0Var.f195868f, z, y3y0Var.f195870h, y3y0Var.f195871i, y3y0Var.f195872j, y3y0Var.f195873k, y3y0Var.f195874l, y3y0Var.f195875m, y3y0Var.f195876n, y3y0Var.f195878p, y3y0Var.f195879q, y3y0Var.f195880r, y3y0Var.f195881s, false);
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m12562D(eqy0 eqy0Var, kty0 kty0Var, owy0 owy0Var) {
        xqt0 xqt0Var = this.f9867u.f195863a;
        hwy0[] hwy0VarArr = owy0Var.f146095c;
        this.f9852f.mo127307a(xqt0Var, eqy0Var, this.f9847a, kty0Var, hwy0VarArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00af, code lost:
    
        r8 = null;
     */
    /* JADX INFO: renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m12563E() throws com.google.android.gms.internal.ads.zziz {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2111b7.m12563E():void");
    }

    /* JADX INFO: renamed from: F */
    public final void m12564F(xqt0 xqt0Var, eqy0 eqy0Var, xqt0 xqt0Var2, eqy0 eqy0Var2, long j, boolean z) throws zziz {
        if (!m12570N(xqt0Var, eqy0Var)) {
            c5t0 c5t0Var = eqy0Var.m117807b() ? c5t0.f79412d : this.f9867u.f195876n;
            if (this.f9860n.zzc().equals(c5t0Var)) {
                return;
            }
            m12606w(c5t0Var);
            m12596l(this.f9867u.f195876n, c5t0Var.f79416a, false, false);
            return;
        }
        xqt0Var.mo112552e(xqt0Var.mo112558n(eqy0Var.f92867a, this.f9858l).f76445c, this.f9857k, 0L);
        cox0 cox0Var = this.f9846N;
        d6s0 d6s0Var = this.f9857k.f155823j;
        int i = ggw0.f102568a;
        cox0Var.m108044d(d6s0Var);
        if (j != -9223372036854775807L) {
            this.f9846N.m108045e(m12584e0(xqt0Var, eqy0Var.f92867a, j));
            return;
        }
        if (!ggw0.m126064f(!xqt0Var2.m210615o() ? xqt0Var2.mo112552e(xqt0Var2.mo112558n(eqy0Var2.f92867a, this.f9858l).f76445c, this.f9857k, 0L).f155814a : null, this.f9857k.f155814a) || z) {
            this.f9846N.m108045e(-9223372036854775807L);
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m12565G(boolean z, boolean z2) {
        this.f9872z = z;
        this.f9833A = z2 ? -9223372036854775807L : SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: H */
    public final synchronized void m12566H(zfw0 zfw0Var, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j;
        boolean z = false;
        while (!((mxx0) zfw0Var).f136234a.f9869w && j > 0) {
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
    public final boolean m12567I() {
        i1y0 i1y0VarM200993g = this.f9863q.m200993g();
        return (i1y0VarM200993g == null || i1y0VarM200993g.m134022d() == Long.MIN_VALUE) ? false : true;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m12568K() {
        i1y0 i1y0VarM200994h = this.f9863q.m200994h();
        long j = i1y0VarM200994h.f110514f.f136740e;
        if (i1y0VarM200994h.f110512d) {
            return j == -9223372036854775807L || this.f9867u.f195880r < j || !m12569M();
        }
        return false;
    }

    /* JADX INFO: renamed from: M */
    public final boolean m12569M() {
        y3y0 y3y0Var = this.f9867u;
        return y3y0Var.f195874l && y3y0Var.f195875m == 0;
    }

    /* JADX INFO: renamed from: N */
    public final boolean m12570N(xqt0 xqt0Var, eqy0 eqy0Var) {
        if (!eqy0Var.m117807b() && !xqt0Var.m210615o()) {
            xqt0Var.mo112552e(xqt0Var.mo112558n(eqy0Var.f92867a, this.f9858l).f76445c, this.f9857k, 0L);
            if (this.f9857k.m175866b()) {
                qpt0 qpt0Var = this.f9857k;
                if (qpt0Var.f155821h && qpt0Var.f155818e != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: S */
    public final Looper m12571S() {
        return this.f9856j;
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ Boolean m12572V() {
        return Boolean.valueOf(this.f9869w);
    }

    /* JADX INFO: renamed from: X */
    public final void m12573X() {
        this.f9854h.mo164790e(0).zza();
    }

    /* JADX INFO: renamed from: Y */
    public final void m12574Y(xqt0 xqt0Var, int i, long j) {
        this.f9854h.mo164788c(3, new bzx0(xqt0Var, i, j)).zza();
    }

    /* JADX INFO: renamed from: Z */
    public final void m12575Z(boolean z, int i) {
        this.f9854h.mo164793h(1, z ? 1 : 0, i).zza();
    }

    @Override // p149l.lox0
    /* JADX INFO: renamed from: a */
    public final void mo12576a(c5t0 c5t0Var) {
        this.f9854h.mo164788c(16, c5t0Var).zza();
    }

    /* JADX INFO: renamed from: a0 */
    public final void m12577a0() {
        this.f9854h.mo164790e(6).zza();
    }

    @Override // p149l.b4y0
    /* JADX INFO: renamed from: b */
    public final synchronized void mo12578b(d5y0 d5y0Var) {
        if (!this.f9869w && this.f9856j.getThread().isAlive()) {
            this.f9854h.mo164788c(14, d5y0Var).zza();
            return;
        }
        svv0.m186111f("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        d5y0Var.m110102h(false);
    }

    /* JADX INFO: renamed from: b0 */
    public final synchronized boolean m12579b0() {
        if (!this.f9869w && this.f9856j.getThread().isAlive()) {
            this.f9854h.mo164794n(7);
            m12566H(new mxx0(this), this.f9865s);
            return this.f9869w;
        }
        return true;
    }

    @Override // p149l.aty0
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ void mo12580c(bty0 bty0Var) {
        this.f9854h.mo164788c(9, (cqy0) bty0Var).zza();
    }

    /* JADX INFO: renamed from: c0 */
    public final void m12581c0(List list, int i, long j, cty0 cty0Var) {
        this.f9854h.mo164788c(17, new jyx0(list, cty0Var, i, j, null)).zza();
    }

    @Override // p149l.bqy0
    /* JADX INFO: renamed from: d */
    public final void mo12582d(cqy0 cqy0Var) {
        this.f9854h.mo164788c(8, cqy0Var).zza();
    }

    /* JADX INFO: renamed from: e */
    public final void m12583e(p5y0 p5y0Var) throws zziz {
        if (m12547J(p5y0Var)) {
            this.f9860n.m175782b(p5y0Var);
            m12551Q(p5y0Var);
            p5y0Var.mo146604a();
            this.f9838F--;
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final long m12584e0(xqt0 xqt0Var, Object obj, long j) {
        xqt0Var.mo112552e(xqt0Var.mo112558n(obj, this.f9858l).f76445c, this.f9857k, 0L);
        qpt0 qpt0Var = this.f9857k;
        if (qpt0Var.f155818e != -9223372036854775807L && qpt0Var.m175866b()) {
            qpt0 qpt0Var2 = this.f9857k;
            if (qpt0Var2.f155821h) {
                long j2 = qpt0Var2.f155819f;
                return ggw0.m126049F((j2 == -9223372036854775807L ? System.currentTimeMillis() : j2 + SystemClock.elapsedRealtime()) - this.f9857k.f155818e) - j;
            }
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: f */
    public final void m12585f() throws zziz {
        int length = this.f9847a.length;
        m12587g(new boolean[2], this.f9863q.m200995i().m134024f());
    }

    /* JADX INFO: renamed from: f0 */
    public final long m12586f0() {
        return m12588g0(this.f9867u.f195878p);
    }

    /* JADX INFO: renamed from: g */
    public final void m12587g(boolean[] zArr, long j) throws zziz {
        i1y0 i1y0VarM200995i = this.f9863q.m200995i();
        owy0 owy0VarM134027i = i1y0VarM200995i.m134027i();
        int i = 0;
        while (true) {
            int length = this.f9847a.length;
            if (i >= 2) {
                break;
            }
            if (!owy0VarM134027i.m166453b(i) && this.f9848b.remove(this.f9847a[i])) {
                this.f9847a[i].mo146613o();
            }
            i++;
        }
        int i2 = 0;
        while (true) {
            int length2 = this.f9847a.length;
            if (i2 >= 2) {
                i1y0VarM200995i.f110515g = true;
                return;
            }
            if (owy0VarM134027i.m166453b(i2)) {
                boolean z = zArr[i2];
                p5y0 p5y0Var = this.f9847a[i2];
                if (!m12547J(p5y0Var)) {
                    w1y0 w1y0Var = this.f9863q;
                    i1y0 i1y0VarM200995i2 = w1y0Var.m200995i();
                    boolean z2 = i1y0VarM200995i2 == w1y0Var.m200994h();
                    owy0 owy0VarM134027i2 = i1y0VarM200995i2.m134027i();
                    x5y0 x5y0Var = owy0VarM134027i2.f146094b[i2];
                    mhr0[] mhr0VarArrM12549O = m12549O(owy0VarM134027i2.f146095c[i2]);
                    boolean z3 = m12569M() && this.f9867u.f195867e == 3;
                    boolean z4 = !z && z3;
                    this.f9838F++;
                    this.f9848b.add(p5y0Var);
                    p5y0Var.mo146618y(x5y0Var, mhr0VarArrM12549O, i1y0VarM200995i2.f110511c[i2], this.f9840H, z4, z2, j, i1y0VarM200995i2.m134023e(), i1y0VarM200995i2.f110514f.f136736a);
                    p5y0Var.mo95065u(11, new ayx0(this));
                    this.f9860n.m175783c(p5y0Var);
                    if (z3) {
                        p5y0Var.zzN();
                    }
                }
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final long m12588g0(long j) {
        i1y0 i1y0VarM200993g = this.f9863q.m200993g();
        if (i1y0VarM200993g == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.f9840H - i1y0VarM200993g.m134023e()));
    }

    /* JADX INFO: renamed from: h */
    public final void m12589h(IOException iOException, int i) {
        w1y0 w1y0Var = this.f9863q;
        zziz zzizVarZzc = zziz.zzc(iOException, i);
        i1y0 i1y0VarM200994h = w1y0Var.m200994h();
        if (i1y0VarM200994h != null) {
            zzizVarZzc = zzizVarZzc.zza(i1y0VarM200994h.f110514f.f136736a);
        }
        svv0.m186109d("ExoPlayerImplInternal", "Playback error", zzizVarZzc);
        m12560A(false, false);
        this.f9867u = this.f9867u.m212869d(zzizVarZzc);
    }

    /* JADX INFO: renamed from: h0 */
    public final long m12590h0(eqy0 eqy0Var, long j, boolean z) throws zziz {
        w1y0 w1y0Var = this.f9863q;
        return m12592i0(eqy0Var, j, w1y0Var.m200994h() != w1y0Var.m200995i(), z);
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
    /* JADX WARN: Type inference failed for: r2v70, types: [l.vjx0, l.vwy0] */
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
        i1y0 i1y0VarM200995i;
        long j;
        long j2;
        boolean z2;
        long j3;
        eqy0 eqy0Var;
        boolean z3;
        boolean z4;
        long j4;
        long j5;
        long j6;
        y3y0 y3y0Var;
        int i;
        y3y0 y3y0VarM12597l0;
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
        p5y0[] p5y0VarArr;
        y3y0 y3y0Var2;
        i1y0 i1y0VarM200994h;
        int i6;
        long j9;
        i1y0 i1y0VarM200994h2;
        i1y0 i1y0VarM134025g;
        boolean z8;
        n1y0 n1y0VarM200996j;
        final C2111b7 c2111b7 = this;
        try {
            int i7 = -1;
            zziz zzizVar2 = null;
            switch (message.what) {
                case 0:
                    c2111b7.f9868v.m206238a(1);
                    c2111b7.m12601q(false, false, false, true);
                    c2111b7.f9852f.zzb();
                    c2111b7.m12608y(true != c2111b7.f9867u.f195863a.m210615o() ? 2 : 4);
                    c2111b7.f9864r.m196881g(c2111b7.f9853g);
                    c2111b7.f9854h.mo164794n(2);
                    z = true;
                    c2111b7.m12599n();
                    return z;
                case 1:
                    c2111b7.m12607x(message.arg1 != 0, message.arg2, true, 1);
                    z = true;
                    c2111b7.m12599n();
                    return z;
                case 2:
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    c2111b7.f9854h.zzf(2);
                    if (c2111b7.f9867u.f195863a.m210615o() || !c2111b7.f9864r.m196884j()) {
                        i2 = 4;
                        zzizVar = null;
                        j7 = jUptimeMillis;
                        i3 = 2;
                    } else {
                        c2111b7.f9863q.m201001o(c2111b7.f9840H);
                        if (c2111b7.f9863q.m201004r() && (n1y0VarM200996j = c2111b7.f9863q.m200996j(c2111b7.f9840H, c2111b7.f9867u)) != null) {
                            i1y0 i1y0VarM200992f = c2111b7.f9863q.m200992f(n1y0VarM200996j);
                            i1y0VarM200992f.f110509a.mo108307k(c2111b7, n1y0VarM200996j.f136737b);
                            if (c2111b7.f9863q.m200994h() == i1y0VarM200992f) {
                                c2111b7.m12602s(n1y0VarM200996j.f136737b);
                            }
                            c2111b7.m12591i(false);
                        }
                        if (c2111b7.f9834B) {
                            c2111b7.f9834B = c2111b7.m12567I();
                            c2111b7.m12561C();
                        } else {
                            c2111b7.m12598m();
                        }
                        i1y0 i1y0VarM200995i2 = c2111b7.f9863q.m200995i();
                        if (i1y0VarM200995i2 == null) {
                            j9 = jUptimeMillis;
                            i3 = 2;
                        } else if (i1y0VarM200995i2.m134025g() == null || c2111b7.f9871y) {
                            j9 = jUptimeMillis;
                            i3 = 2;
                            if (i1y0VarM200995i2.f110514f.f136744i || c2111b7.f9871y) {
                                int i8 = 0;
                                while (true) {
                                    p5y0[] p5y0VarArr2 = c2111b7.f9847a;
                                    int length = p5y0VarArr2.length;
                                    if (i8 < 2) {
                                        p5y0 p5y0Var = p5y0VarArr2[i8];
                                        zsy0 zsy0Var = i1y0VarM200995i2.f110511c[i8];
                                        if (zsy0Var != null && p5y0Var.zzo() == zsy0Var && p5y0Var.mo146609h()) {
                                            long j10 = i1y0VarM200995i2.f110514f.f136740e;
                                            m12552R(p5y0Var, (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? -9223372036854775807L : j10 + i1y0VarM200995i2.m134023e());
                                        }
                                        i8++;
                                    }
                                }
                            }
                        } else {
                            i1y0 i1y0VarM200995i3 = c2111b7.f9863q.m200995i();
                            if (i1y0VarM200995i3.f110512d) {
                                int i9 = 0;
                                while (true) {
                                    p5y0[] p5y0VarArr3 = c2111b7.f9847a;
                                    int length2 = p5y0VarArr3.length;
                                    if (i9 < 2) {
                                        p5y0 p5y0Var2 = p5y0VarArr3[i9];
                                        zsy0 zsy0Var2 = i1y0VarM200995i3.f110511c[i9];
                                        if (p5y0Var2.zzo() == zsy0Var2) {
                                            if (zsy0Var2 == null || p5y0Var2.mo146609h()) {
                                                i9++;
                                            } else {
                                                i1y0VarM200995i3.m134025g();
                                                boolean z9 = i1y0VarM200995i3.f110514f.f136741f;
                                            }
                                        }
                                    } else if (i1y0VarM200995i2.m134025g().f110512d || c2111b7.f9840H >= i1y0VarM200995i2.m134025g().m134024f()) {
                                        owy0 owy0VarM134027i = i1y0VarM200995i2.m134027i();
                                        i1y0 i1y0VarM200991e = c2111b7.f9863q.m200991e();
                                        owy0 owy0VarM134027i2 = i1y0VarM200991e.m134027i();
                                        xqt0 xqt0Var = c2111b7.f9867u.f195863a;
                                        j9 = jUptimeMillis;
                                        i3 = 2;
                                        c2111b7.m12564F(xqt0Var, i1y0VarM200991e.f110514f.f136736a, xqt0Var, i1y0VarM200995i2.f110514f.f136736a, -9223372036854775807L, false);
                                        if (!i1y0VarM200991e.f110512d || i1y0VarM200991e.f110509a.zzd() == -9223372036854775807L) {
                                            int i10 = 0;
                                            while (true) {
                                                int length3 = c2111b7.f9847a.length;
                                                if (i10 < 2) {
                                                    boolean zM166453b = owy0VarM134027i.m166453b(i10);
                                                    boolean zM166453b2 = owy0VarM134027i2.m166453b(i10);
                                                    if (zM166453b && !c2111b7.f9847a[i10].mo146608f()) {
                                                        c2111b7.f9849c[i10].mo146606c();
                                                        x5y0 x5y0Var = owy0VarM134027i.f146094b[i10];
                                                        x5y0 x5y0Var2 = owy0VarM134027i2.f146094b[i10];
                                                        if (!zM166453b2 || !x5y0Var2.equals(x5y0Var)) {
                                                            m12552R(c2111b7.f9847a[i10], i1y0VarM200991e.m134024f());
                                                        }
                                                    }
                                                    i10++;
                                                }
                                            }
                                        } else {
                                            long jM134024f = i1y0VarM200991e.m134024f();
                                            p5y0[] p5y0VarArr4 = c2111b7.f9847a;
                                            int length4 = p5y0VarArr4.length;
                                            for (int i11 = 0; i11 < 2; i11++) {
                                                p5y0 p5y0Var3 = p5y0VarArr4[i11];
                                                if (p5y0Var3.zzo() != null) {
                                                    m12552R(p5y0Var3, jM134024f);
                                                }
                                            }
                                            if (!i1y0VarM200991e.m134036r()) {
                                                c2111b7.f9863q.m201003q(i1y0VarM200991e);
                                                c2111b7.m12591i(false);
                                                c2111b7.m12598m();
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
                        i1y0 i1y0VarM200995i4 = c2111b7.f9863q.m200995i();
                        if (i1y0VarM200995i4 != null && c2111b7.f9863q.m200994h() != i1y0VarM200995i4 && !i1y0VarM200995i4.f110515g) {
                            i1y0 i1y0VarM200995i5 = c2111b7.f9863q.m200995i();
                            owy0 owy0VarM134027i3 = i1y0VarM200995i5.m134027i();
                            boolean z10 = false;
                            int i12 = 0;
                            while (true) {
                                p5y0[] p5y0VarArr5 = c2111b7.f9847a;
                                int length5 = p5y0VarArr5.length;
                                if (i12 < i3) {
                                    p5y0 p5y0Var4 = p5y0VarArr5[i12];
                                    if (m12547J(p5y0Var4)) {
                                        zsy0 zsy0VarZzo = p5y0Var4.zzo();
                                        zsy0 zsy0Var3 = i1y0VarM200995i5.f110511c[i12];
                                        if (!owy0VarM134027i3.m166453b(i12) || zsy0VarZzo != zsy0Var3) {
                                            if (!p5y0Var4.mo146608f()) {
                                                p5y0Var4.mo146610k(m12549O(owy0VarM134027i3.f146095c[i12]), i1y0VarM200995i5.f110511c[i12], i1y0VarM200995i5.m134024f(), i1y0VarM200995i5.m134023e(), i1y0VarM200995i5.f110514f.f136736a);
                                            } else if (p5y0Var4.zzV()) {
                                                c2111b7.m12583e(p5y0Var4);
                                            } else {
                                                z10 = true;
                                            }
                                        }
                                    }
                                    i12++;
                                } else if (!z10) {
                                    c2111b7.m12585f();
                                }
                            }
                        }
                        boolean z11 = false;
                        while (c2111b7.m12569M() && !c2111b7.f9871y && (i1y0VarM200994h2 = c2111b7.f9863q.m200994h()) != null && (i1y0VarM134025g = i1y0VarM200994h2.m134025g()) != null && c2111b7.f9840H >= i1y0VarM134025g.m134024f() && i1y0VarM134025g.f110515g) {
                            if (z11) {
                                c2111b7.m12599n();
                            }
                            i1y0 i1y0VarM200990d = c2111b7.f9863q.m200990d();
                            if (i1y0VarM200990d == null) {
                                throw zzizVar2;
                            }
                            if (c2111b7.f9867u.f195864b.f92867a.equals(i1y0VarM200990d.f110514f.f136736a.f92867a)) {
                                eqy0 eqy0Var2 = c2111b7.f9867u.f195864b;
                                if (eqy0Var2.f92868b == i7) {
                                    eqy0 eqy0Var3 = i1y0VarM200990d.f110514f.f136736a;
                                    if (eqy0Var3.f92868b != i7 || eqy0Var2.f92871e == eqy0Var3.f92871e) {
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
                            n1y0 n1y0Var = i1y0VarM200990d.f110514f;
                            boolean z12 = z8;
                            eqy0 eqy0Var4 = n1y0Var.f136736a;
                            long j11 = n1y0Var.f136737b;
                            zziz zzizVar3 = zzizVar2;
                            long j12 = j9;
                            c2111b7.f9867u = c2111b7.m12597l0(eqy0Var4, j11, n1y0Var.f136738c, j11, !z12, 0);
                            c2111b7.m12559r();
                            c2111b7.m12563E();
                            owy0 owy0VarM134027i4 = c2111b7.f9863q.m200994h().m134027i();
                            int i13 = 0;
                            while (true) {
                                int length6 = c2111b7.f9847a.length;
                                if (i13 < i3) {
                                    if (owy0VarM134027i4.m166453b(i13)) {
                                        c2111b7.f9847a[i13].zzs();
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
                    int i14 = c2111b7.f9867u.f195867e;
                    z = true;
                    if (i14 != 1) {
                        if (i14 != i2) {
                            i1y0 i1y0VarM200994h3 = c2111b7.f9863q.m200994h();
                            if (i1y0VarM200994h3 == null) {
                                c2111b7.m12604u(j7, 10L);
                            } else {
                                int i15 = ggw0.f102568a;
                                Trace.beginSection("doSomeWork");
                                c2111b7.m12563E();
                                if (i1y0VarM200994h3.f110512d) {
                                    long jM126049F = ggw0.m126049F(SystemClock.elapsedRealtime());
                                    i1y0VarM200994h3.f110509a.mo108306g(c2111b7.f9867u.f195880r - c2111b7.f9859m, false);
                                    int i16 = 0;
                                    z5 = true;
                                    z6 = true;
                                    while (true) {
                                        p5y0[] p5y0VarArr6 = c2111b7.f9847a;
                                        int length7 = p5y0VarArr6.length;
                                        if (i16 < i3) {
                                            p5y0 p5y0Var5 = p5y0VarArr6[i16];
                                            if (m12547J(p5y0Var5)) {
                                                p5y0Var5.mo100014w(c2111b7.f9840H, jM126049F);
                                                z5 = z5 && p5y0Var5.zzV();
                                                boolean z13 = i1y0VarM200994h3.f110511c[i16] != p5y0Var5.zzo();
                                                boolean z14 = z13 || (!z13 && p5y0Var5.mo146609h()) || p5y0Var5.mo100010r() || p5y0Var5.zzV();
                                                z6 = z6 && z14;
                                                if (!z14) {
                                                    p5y0Var5.mo146605b();
                                                }
                                            }
                                            i16++;
                                        }
                                    }
                                } else {
                                    i1y0VarM200994h3.f110509a.zzk();
                                    z5 = true;
                                    z6 = true;
                                }
                                long j13 = i1y0VarM200994h3.f110514f.f136740e;
                                if (z5 && i1y0VarM200994h3.f110512d) {
                                    j8 = -9223372036854775807L;
                                    if (j13 == -9223372036854775807L || j13 <= c2111b7.f9867u.f195880r) {
                                        if (c2111b7.f9871y) {
                                            c2111b7.f9871y = false;
                                            c2111b7.m12607x(false, c2111b7.f9867u.f195875m, false, 5);
                                        }
                                        if (i1y0VarM200994h3.f110514f.f136744i) {
                                            c2111b7.m12608y(i2);
                                            c2111b7.m12546B();
                                        }
                                    }
                                    if (c2111b7.f9867u.f195867e == i3) {
                                        i5 = 0;
                                        while (true) {
                                            p5y0VarArr = c2111b7.f9847a;
                                            int length8 = p5y0VarArr.length;
                                            if (i5 < i3) {
                                                if (!m12547J(p5y0VarArr[i5]) && c2111b7.f9847a[i5].zzo() == i1y0VarM200994h3.f110511c[i5]) {
                                                    c2111b7.f9847a[i5].mo146605b();
                                                }
                                                i5++;
                                            } else {
                                                y3y0Var2 = c2111b7.f9867u;
                                                if (!y3y0Var2.f195869g || y3y0Var2.f195879q >= 500000 || !c2111b7.m12567I()) {
                                                    c2111b7.f9844L = j8;
                                                } else if (c2111b7.f9844L == j8) {
                                                    c2111b7.f9844L = SystemClock.elapsedRealtime();
                                                } else if (SystemClock.elapsedRealtime() - c2111b7.f9844L >= 4000) {
                                                    throw new IllegalStateException("Playback stuck buffering and not loading");
                                                }
                                            }
                                        }
                                    } else {
                                        c2111b7.f9844L = j8;
                                    }
                                    if (c2111b7.m12569M() || c2111b7.f9867u.f195867e != 3) {
                                        z7 = false;
                                    } else {
                                        z7 = true;
                                    }
                                    y3y0 y3y0Var3 = c2111b7.f9867u;
                                    boolean z15 = y3y0Var3.f195877o;
                                    i4 = y3y0Var3.f195867e;
                                    if (i4 != i2) {
                                        if (!z7 || i4 == i3) {
                                            c2111b7.m12604u(j7, 10L);
                                        } else if (i4 == 3 && c2111b7.f9838F != 0) {
                                            c2111b7.m12604u(j7, 1000L);
                                        }
                                    }
                                    Trace.endSection();
                                } else {
                                    j8 = -9223372036854775807L;
                                }
                                y3y0 y3y0Var4 = c2111b7.f9867u;
                                if (y3y0Var4.f195867e != i3) {
                                    if (c2111b7.f9867u.f195867e == 3) {
                                        if (c2111b7.f9838F == 0) {
                                            if (!c2111b7.m12568K()) {
                                                c2111b7.m12565G(c2111b7.m12569M(), false);
                                                c2111b7.m12608y(i3);
                                                if (c2111b7.f9872z) {
                                                    for (i1y0VarM200994h = c2111b7.f9863q.m200994h(); i1y0VarM200994h != null; i1y0VarM200994h = i1y0VarM200994h.m134025g()) {
                                                        for (hwy0 hwy0Var : i1y0VarM200994h.m134027i().f146095c) {
                                                        }
                                                    }
                                                    c2111b7.f9846N.m108043c();
                                                }
                                                c2111b7.m12546B();
                                            }
                                        } else if (!z6) {
                                            c2111b7.m12565G(c2111b7.m12569M(), false);
                                            c2111b7.m12608y(i3);
                                            if (c2111b7.f9872z) {
                                                while (i1y0VarM200994h != null) {
                                                    while (i6 < r5) {
                                                    }
                                                }
                                                c2111b7.f9846N.m108043c();
                                            }
                                            c2111b7.m12546B();
                                        }
                                    }
                                } else if (c2111b7.f9838F != 0) {
                                    if (z6) {
                                        if (y3y0Var4.f195869g) {
                                            i1y0 i1y0VarM200994h4 = c2111b7.f9863q.m200994h();
                                            long jM108042b = c2111b7.m12570N(c2111b7.f9867u.f195863a, i1y0VarM200994h4.f110514f.f136736a) ? c2111b7.f9846N.m108042b() : j8;
                                            i1y0 i1y0VarM200993g = c2111b7.f9863q.m200993g();
                                            boolean z16 = i1y0VarM200993g.m134036r() && i1y0VarM200993g.f110514f.f136744i;
                                            boolean z17 = i1y0VarM200993g.f110514f.f136736a.m117807b() && !i1y0VarM200993g.f110512d;
                                            if (z16 || z17 || c2111b7.f9852f.mo127308b(c2111b7.f9867u.f195863a, i1y0VarM200994h4.f110514f.f136736a, c2111b7.m12586f0(), c2111b7.f9860n.zzc().f79416a, c2111b7.f9872z, jM108042b)) {
                                            }
                                        }
                                        c2111b7.m12608y(3);
                                        c2111b7.f9843K = zzizVar;
                                        if (c2111b7.m12569M()) {
                                            c2111b7.m12609z();
                                        }
                                    }
                                    if (c2111b7.f9867u.f195867e == 3) {
                                        if (c2111b7.f9838F == 0) {
                                            if (!c2111b7.m12568K()) {
                                                c2111b7.m12565G(c2111b7.m12569M(), false);
                                                c2111b7.m12608y(i3);
                                                if (c2111b7.f9872z) {
                                                    while (i1y0VarM200994h != null) {
                                                        while (i6 < r5) {
                                                        }
                                                    }
                                                    c2111b7.f9846N.m108043c();
                                                }
                                                c2111b7.m12546B();
                                            }
                                        } else if (!z6) {
                                            c2111b7.m12565G(c2111b7.m12569M(), false);
                                            c2111b7.m12608y(i3);
                                            if (c2111b7.f9872z) {
                                                while (i1y0VarM200994h != null) {
                                                    while (i6 < r5) {
                                                    }
                                                }
                                                c2111b7.f9846N.m108043c();
                                            }
                                            c2111b7.m12546B();
                                        }
                                    }
                                } else if (c2111b7.m12568K()) {
                                    c2111b7.m12608y(3);
                                    c2111b7.f9843K = zzizVar;
                                    if (c2111b7.m12569M()) {
                                        c2111b7.m12609z();
                                    }
                                } else if (c2111b7.f9867u.f195867e == 3) {
                                    if (c2111b7.f9838F == 0) {
                                        if (!c2111b7.m12568K()) {
                                            c2111b7.m12565G(c2111b7.m12569M(), false);
                                            c2111b7.m12608y(i3);
                                            if (c2111b7.f9872z) {
                                                while (i1y0VarM200994h != null) {
                                                    while (i6 < r5) {
                                                    }
                                                }
                                                c2111b7.f9846N.m108043c();
                                            }
                                            c2111b7.m12546B();
                                        }
                                    } else if (!z6) {
                                        c2111b7.m12565G(c2111b7.m12569M(), false);
                                        c2111b7.m12608y(i3);
                                        if (c2111b7.f9872z) {
                                            while (i1y0VarM200994h != null) {
                                                while (i6 < r5) {
                                                }
                                            }
                                            c2111b7.f9846N.m108043c();
                                        }
                                        c2111b7.m12546B();
                                    }
                                }
                                if (c2111b7.f9867u.f195867e == i3) {
                                    i5 = 0;
                                    while (true) {
                                        p5y0VarArr = c2111b7.f9847a;
                                        int length9 = p5y0VarArr.length;
                                        if (i5 < i3) {
                                            if (!m12547J(p5y0VarArr[i5])) {
                                            }
                                            i5++;
                                        } else {
                                            y3y0Var2 = c2111b7.f9867u;
                                            if (!y3y0Var2.f195869g) {
                                                c2111b7.f9844L = j8;
                                            } else {
                                                c2111b7.f9844L = j8;
                                            }
                                        }
                                    }
                                } else {
                                    c2111b7.f9844L = j8;
                                }
                                if (c2111b7.m12569M()) {
                                    z7 = false;
                                } else {
                                    z7 = false;
                                }
                                y3y0 y3y0Var5 = c2111b7.f9867u;
                                boolean z18 = y3y0Var5.f195877o;
                                i4 = y3y0Var5.f195867e;
                                if (i4 != i2) {
                                    if (z7) {
                                        c2111b7.m12604u(j7, 10L);
                                    } else {
                                        c2111b7.m12604u(j7, 10L);
                                    }
                                }
                                Trace.endSection();
                            }
                        }
                        z = true;
                    }
                    c2111b7.m12599n();
                    return z;
                case 3:
                    try {
                        bzx0 bzx0Var = (bzx0) message.obj;
                        c2111b7.f9868v.m206238a(1);
                        Pair pairM12557k0 = m12557k0(c2111b7.f9867u.f195863a, bzx0Var, true, c2111b7.f9835C, c2111b7.f9836D, c2111b7.f9857k, c2111b7.f9858l);
                        if (pairM12557k0 == null) {
                            Pair pairM12594j0 = c2111b7.m12594j0(c2111b7.f9867u.f195863a);
                            eqy0 eqy0Var5 = (eqy0) pairM12594j0.first;
                            long jLongValue = ((Long) pairM12594j0.second).longValue();
                            z2 = !c2111b7.f9867u.f195863a.m210615o();
                            eqy0Var = eqy0Var5;
                            j3 = jLongValue;
                            j2 = -9223372036854775807L;
                            j = 0;
                        } else {
                            Object obj = pairM12557k0.first;
                            long jLongValue2 = ((Long) pairM12557k0.second).longValue();
                            j = 0;
                            j2 = bzx0Var.f78093c == -9223372036854775807L ? -9223372036854775807L : jLongValue2;
                            eqy0 eqy0VarM200998l = c2111b7.f9863q.m200998l(c2111b7.f9867u.f195863a, obj, jLongValue2);
                            if (eqy0VarM200998l.m117807b()) {
                                c2111b7.f9867u.f195863a.mo112558n(eqy0VarM200998l.f92867a, c2111b7.f9858l);
                                if (c2111b7.f9858l.m102864e(eqy0VarM200998l.f92868b) == eqy0VarM200998l.f92869c) {
                                    c2111b7.f9858l.m102869j();
                                }
                                eqy0Var = eqy0VarM200998l;
                                z2 = true;
                                j3 = 0;
                            } else {
                                z2 = bzx0Var.f78093c == -9223372036854775807L;
                                j3 = jLongValue2;
                                eqy0Var = eqy0VarM200998l;
                            }
                        }
                        try {
                            if (!c2111b7.f9867u.f195863a.m210615o()) {
                                y3y0 y3y0Var6 = c2111b7.f9867u;
                                if (pairM12557k0 == null) {
                                    if (y3y0Var6.f195867e != 1) {
                                        c2111b7.m12608y(4);
                                    }
                                    c2111b7.m12601q(false, true, false, true);
                                } else {
                                    if (eqy0Var.equals(y3y0Var6.f195864b)) {
                                        i1y0 i1y0VarM200994h5 = c2111b7.f9863q.m200994h();
                                        long jMo108305f = (i1y0VarM200994h5 == null || !i1y0VarM200994h5.f110512d || j3 == j) ? j3 : i1y0VarM200994h5.f110509a.mo108305f(j3, c2111b7.f9866t);
                                        z4 = true;
                                        long j14 = jMo108305f;
                                        try {
                                            if (ggw0.m126052I(jMo108305f) == ggw0.m126052I(c2111b7.f9867u.f195880r) && ((i = (y3y0Var = c2111b7.f9867u).f195867e) == 2 || i == 3)) {
                                                long j15 = y3y0Var.f195880r;
                                                y3y0VarM12597l0 = c2111b7.m12597l0(eqy0Var, j15, j2, j15, z2, 2);
                                            } else {
                                                j4 = j14;
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            j2 = j2;
                                            z3 = z2;
                                            c2111b7.f9867u = c2111b7.m12597l0(eqy0Var, j3, j2, j3, z3, 2);
                                            throw th;
                                        }
                                    } else {
                                        z4 = true;
                                        j4 = j3;
                                    }
                                    try {
                                        long jM12590h0 = c2111b7.m12590h0(eqy0Var, j4, c2111b7.f9867u.f195867e == 4 ? z4 : false);
                                        z3 = z2 | (j3 != jM12590h0 ? z4 : false);
                                        try {
                                            y3y0 y3y0Var7 = c2111b7.f9867u;
                                            xqt0 xqt0Var2 = y3y0Var7.f195863a;
                                            long j16 = j2;
                                            try {
                                                c2111b7.m12564F(xqt0Var2, eqy0Var, xqt0Var2, y3y0Var7.f195864b, j16, true);
                                                j5 = j16;
                                                j6 = jM12590h0;
                                                c2111b7 = this;
                                                y3y0VarM12597l0 = c2111b7.m12597l0(eqy0Var, j6, j5, j6, z3, 2);
                                            } catch (Throwable th2) {
                                                th = th2;
                                                j2 = j16;
                                                j3 = jM12590h0;
                                                c2111b7.f9867u = c2111b7.m12597l0(eqy0Var, j3, j2, j3, z3, 2);
                                                throw th;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        z3 = z2;
                                        c2111b7.f9867u = c2111b7.m12597l0(eqy0Var, j3, j2, j3, z3, 2);
                                        throw th;
                                    }
                                }
                                c2111b7.f9867u = y3y0VarM12597l0;
                                z = z4;
                                c2111b7.m12599n();
                                return z;
                            }
                            c2111b7.f9839G = bzx0Var;
                            z3 = z2;
                            j5 = j2;
                            j6 = j3;
                            z4 = true;
                            c2111b7 = this;
                            y3y0VarM12597l0 = c2111b7.m12597l0(eqy0Var, j6, j5, j6, z3, 2);
                            c2111b7.f9867u = y3y0VarM12597l0;
                            z = z4;
                        } catch (Throwable th5) {
                            th = th5;
                            j2 = j2;
                        }
                    } catch (zzcc e) {
                        e = e;
                        c2111b7.m12589h(e, e.zzb == 1 ? true != e.zza ? 3003 : 3001 : 1000);
                        z = true;
                    } catch (zzgx e2) {
                        e = e2;
                        c2111b7.m12589h(e, e.zza);
                        z = true;
                    } catch (zziz e3) {
                        e = e3;
                        if (e.zze == 1 && (i1y0VarM200995i = c2111b7.f9863q.m200995i()) != null) {
                            e = e.zza(i1y0VarM200995i.f110514f.f136736a);
                        }
                        if (e.zzk && (c2111b7.f9843K == null || e.zzb == 5003)) {
                            svv0.m186112g("ExoPlayerImplInternal", "Recoverable renderer error", e);
                            zziz zzizVar4 = c2111b7.f9843K;
                            if (zzizVar4 != null) {
                                zzizVar4.addSuppressed(e);
                                e = c2111b7.f9843K;
                            } else {
                                c2111b7.f9843K = e;
                            }
                            ojv0 ojv0Var = c2111b7.f9854h;
                            ojv0Var.mo164791f(ojv0Var.mo164788c(25, e));
                            z = true;
                        } else {
                            zziz zzizVar5 = c2111b7.f9843K;
                            if (zzizVar5 != null) {
                                zzizVar5.addSuppressed(e);
                                e = c2111b7.f9843K;
                            }
                            svv0.m186109d("ExoPlayerImplInternal", "Playback error", e);
                            z = true;
                            if (e.zze == 1) {
                                w1y0 w1y0Var = c2111b7.f9863q;
                                if (w1y0Var.m200994h() != w1y0Var.m200995i()) {
                                    while (true) {
                                        w1y0 w1y0Var2 = c2111b7.f9863q;
                                        i1y0 i1y0VarM200994h6 = w1y0Var2.m200994h();
                                        i1y0 i1y0VarM200995i6 = w1y0Var2.m200995i();
                                        w1y0 w1y0Var3 = c2111b7.f9863q;
                                        if (i1y0VarM200994h6 != i1y0VarM200995i6) {
                                            w1y0Var3.m200990d();
                                        } else {
                                            i1y0 i1y0VarM200994h7 = w1y0Var3.m200994h();
                                            i1y0VarM200994h7.getClass();
                                            n1y0 n1y0Var2 = i1y0VarM200994h7.f110514f;
                                            eqy0 eqy0Var6 = n1y0Var2.f136736a;
                                            long j17 = n1y0Var2.f136737b;
                                            c2111b7.f9867u = c2111b7.m12597l0(eqy0Var6, j17, n1y0Var2.f136738c, j17, true, 0);
                                        }
                                    }
                                }
                                z = true;
                            }
                            c2111b7.m12560A(z, false);
                            c2111b7.f9867u = c2111b7.f9867u.m212869d(e);
                        }
                    } catch (zzrq e4) {
                        e = e4;
                        c2111b7.m12589h(e, e.zza);
                        z = true;
                    } catch (zztt e5) {
                        e = e5;
                        c2111b7.m12589h(e, 1002);
                        z = true;
                    } catch (IOException e6) {
                        e = e6;
                        c2111b7.m12589h(e, 2000);
                        z = true;
                    } catch (RuntimeException e7) {
                        e = e7;
                        zziz zzizVarZzd = zziz.zzd(e, ((e instanceof IllegalStateException) || (e instanceof IllegalArgumentException)) ? 1004 : 1000);
                        svv0.m186109d("ExoPlayerImplInternal", "Playback error", zzizVarZzd);
                        c2111b7.m12560A(true, false);
                        c2111b7.f9867u = c2111b7.f9867u.m212869d(zzizVarZzd);
                        z = true;
                    }
                    c2111b7.m12599n();
                    return z;
                case 4:
                    c2111b7.m12606w((c5t0) message.obj);
                    c2111b7.m12595k(c2111b7.f9860n.zzc(), true);
                    z = true;
                    c2111b7.m12599n();
                    return z;
                case 5:
                    c2111b7.f9866t = (a6y0) message.obj;
                    z = true;
                    c2111b7.m12599n();
                    return z;
                case 6:
                    c2111b7.m12560A(false, true);
                    z = true;
                    c2111b7.m12599n();
                    return z;
                case 7:
                    c2111b7.m12601q(true, false, true, false);
                    int i17 = 0;
                    while (true) {
                        int length10 = c2111b7.f9847a.length;
                        if (i17 >= 2) {
                            c2111b7.f9852f.zzc();
                            c2111b7.m12608y(1);
                            HandlerThread handlerThread = c2111b7.f9855i;
                            if (handlerThread != null) {
                                handlerThread.quit();
                            }
                            synchronized (this) {
                                c2111b7.f9869w = true;
                                c2111b7.notifyAll();
                                break;
                            }
                            return true;
                        }
                        c2111b7.f9849c[i17].zzp();
                        c2111b7.f9847a[i17].zzF();
                        i17++;
                    }
                    break;
                case 8:
                    if (c2111b7.f9863q.m201002p((cqy0) message.obj)) {
                        i1y0 i1y0VarM200993g2 = c2111b7.f9863q.m200993g();
                        i1y0VarM200993g2.m134030l(c2111b7.f9860n.zzc().f79416a, c2111b7.f9867u.f195863a);
                        c2111b7.m12562D(i1y0VarM200993g2.f110514f.f136736a, i1y0VarM200993g2.m134026h(), i1y0VarM200993g2.m134027i());
                        if (i1y0VarM200993g2 == c2111b7.f9863q.m200994h()) {
                            c2111b7.m12602s(i1y0VarM200993g2.f110514f.f136737b);
                            c2111b7.m12585f();
                            y3y0 y3y0Var8 = c2111b7.f9867u;
                            eqy0 eqy0Var7 = y3y0Var8.f195864b;
                            long j18 = i1y0VarM200993g2.f110514f.f136737b;
                            c2111b7.f9867u = c2111b7.m12597l0(eqy0Var7, j18, y3y0Var8.f195865c, j18, false, 5);
                        }
                        c2111b7.m12598m();
                    }
                    z = true;
                    c2111b7.m12599n();
                    return z;
                case 9:
                    if (c2111b7.f9863q.m201002p((cqy0) message.obj)) {
                        c2111b7.f9863q.m201001o(c2111b7.f9840H);
                        c2111b7.m12598m();
                    }
                    z = true;
                    c2111b7.m12599n();
                    return z;
                case 10:
                    c2111b7.m12600o();
                    z = true;
                    c2111b7.m12599n();
                    return z;
                case 11:
                    int i18 = message.arg1;
                    c2111b7.f9835C = i18;
                    if (!c2111b7.f9863q.m201006t(c2111b7.f9867u.f195863a, i18)) {
                        c2111b7.m12605v(true);
                    }
                    c2111b7.m12591i(false);
                    z = true;
                    c2111b7.m12599n();
                    return z;
                case 12:
                    boolean z19 = message.arg1 != 0;
                    c2111b7.f9836D = z19;
                    if (!c2111b7.f9863q.m201007u(c2111b7.f9867u.f195863a, z19)) {
                        c2111b7.m12605v(true);
                    }
                    c2111b7.m12591i(false);
                    z = true;
                    c2111b7.m12599n();
                    return z;
                case 13:
                    boolean z20 = message.arg1 != 0;
                    AtomicBoolean atomicBoolean = (AtomicBoolean) message.obj;
                    if (c2111b7.f9837E != z20) {
                        c2111b7.f9837E = z20;
                        if (!z20) {
                            p5y0[] p5y0VarArr7 = c2111b7.f9847a;
                            int length11 = p5y0VarArr7.length;
                            for (int i19 = 0; i19 < 2; i19++) {
                                p5y0 p5y0Var6 = p5y0VarArr7[i19];
                                if (!m12547J(p5y0Var6) && c2111b7.f9848b.remove(p5y0Var6)) {
                                    p5y0Var6.mo146613o();
                                }
                            }
                        }
                    }
                    if (atomicBoolean != null) {
                        synchronized (this) {
                            atomicBoolean.set(true);
                            c2111b7.notifyAll();
                            break;
                        }
                    }
                    z = true;
                    c2111b7.m12599n();
                    return z;
                case 14:
                    d5y0 d5y0Var = (d5y0) message.obj;
                    if (d5y0Var.m110096b() == c2111b7.f9856j) {
                        m12550P(d5y0Var);
                        int i20 = c2111b7.f9867u.f195867e;
                        if (i20 == 3 || i20 == 2) {
                            c2111b7.f9854h.mo164794n(2);
                        }
                    } else {
                        c2111b7.f9854h.mo164788c(15, d5y0Var).zza();
                    }
                    z = true;
                    c2111b7.m12599n();
                    return z;
                case 15:
                    final d5y0 d5y0Var2 = (d5y0) message.obj;
                    Looper looperM110096b = d5y0Var2.m110096b();
                    if (looperM110096b.getThread().isAlive()) {
                        c2111b7.f9862p.mo100826a(looperM110096b, null).mo164792g(new Runnable() { // from class: l.rxx0
                            @Override // java.lang.Runnable
                            public final void run() {
                                C2111b7.m12556d0(d5y0Var2);
                            }
                        });
                    } else {
                        svv0.m186111f("TAG", "Trying to send message on a dead thread.");
                        d5y0Var2.m110102h(false);
                    }
                    z = true;
                    c2111b7.m12599n();
                    return z;
                case 16:
                    c2111b7.m12595k((c5t0) message.obj, false);
                    z = true;
                    c2111b7.m12599n();
                    return z;
                case 17:
                    jyx0 jyx0Var = (jyx0) message.obj;
                    c2111b7.f9868v.m206238a(1);
                    if (jyx0Var.f120333b != -1) {
                        c2111b7.f9839G = new bzx0(new j5y0(jyx0Var.f120332a, jyx0Var.f120335d), jyx0Var.f120333b, jyx0Var.f120334c);
                    }
                    c2111b7.m12593j(c2111b7.f9864r.m196888n(jyx0Var.f120332a, jyx0Var.f120335d), false);
                    z = true;
                    c2111b7.m12599n();
                    return z;
                case 18:
                    jyx0 jyx0Var2 = (jyx0) message.obj;
                    int iM196877a = message.arg1;
                    c2111b7.f9868v.m206238a(1);
                    v3y0 v3y0Var = c2111b7.f9864r;
                    if (iM196877a == -1) {
                        iM196877a = v3y0Var.m196877a();
                    }
                    c2111b7.m12593j(v3y0Var.m196885k(iM196877a, jyx0Var2.f120332a, jyx0Var2.f120335d), false);
                    z = true;
                    c2111b7.m12599n();
                    return z;
                case 19:
                    oyx0 oyx0Var = (oyx0) message.obj;
                    c2111b7.f9868v.m206238a(1);
                    v3y0 v3y0Var2 = c2111b7.f9864r;
                    int i21 = oyx0Var.f146370a;
                    c2111b7.m12593j(v3y0Var2.m196886l(0, 0, 0, null), false);
                    z = true;
                    c2111b7.m12599n();
                    return z;
                case 20:
                    int i22 = message.arg1;
                    int i23 = message.arg2;
                    cty0 cty0Var = (cty0) message.obj;
                    c2111b7.f9868v.m206238a(1);
                    c2111b7.m12593j(c2111b7.f9864r.m196887m(i22, i23, cty0Var), false);
                    z = true;
                    c2111b7.m12599n();
                    return z;
                case 21:
                    cty0 cty0Var2 = (cty0) message.obj;
                    c2111b7.f9868v.m206238a(1);
                    c2111b7.m12593j(c2111b7.f9864r.m196889o(cty0Var2), false);
                    z = true;
                    c2111b7.m12599n();
                    return z;
                case 22:
                    c2111b7.m12593j(c2111b7.f9864r.m196878b(), true);
                    z = true;
                    c2111b7.m12599n();
                    return z;
                case 23:
                    c2111b7.f9870x = message.arg1 != 0;
                    c2111b7.m12559r();
                    if (c2111b7.f9871y && c2111b7.f9863q.m200995i() != c2111b7.f9863q.m200994h()) {
                        c2111b7.m12605v(true);
                        c2111b7.m12591i(false);
                    }
                    z = true;
                    c2111b7.m12599n();
                    return z;
                case 24:
                default:
                    return false;
                case 25:
                    c2111b7.m12558p();
                    z = true;
                    c2111b7.m12599n();
                    return z;
                case 26:
                    c2111b7.m12558p();
                    z = true;
                    c2111b7.m12599n();
                    return z;
                case 27:
                    int i24 = message.arg1;
                    int i25 = message.arg2;
                    List list = (List) message.obj;
                    c2111b7.f9868v.m206238a(1);
                    c2111b7.m12593j(c2111b7.f9864r.m196879c(i24, i25, list), false);
                    z = true;
                    c2111b7.m12599n();
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
    public final void m12591i(boolean z) {
        i1y0 i1y0VarM200993g = this.f9863q.m200993g();
        eqy0 eqy0Var = i1y0VarM200993g == null ? this.f9867u.f195864b : i1y0VarM200993g.f110514f.f136736a;
        boolean zEquals = this.f9867u.f195873k.equals(eqy0Var);
        if (!zEquals) {
            this.f9867u = this.f9867u.m212866a(eqy0Var);
        }
        y3y0 y3y0Var = this.f9867u;
        y3y0Var.f195878p = i1y0VarM200993g == null ? y3y0Var.f195880r : i1y0VarM200993g.m134021c();
        this.f9867u.f195879q = m12586f0();
        if ((!zEquals || z) && i1y0VarM200993g != null && i1y0VarM200993g.f110512d) {
            m12562D(i1y0VarM200993g.f110514f.f136736a, i1y0VarM200993g.m134026h(), i1y0VarM200993g.m134027i());
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final long m12592i0(eqy0 eqy0Var, long j, boolean z, boolean z2) throws zziz {
        w1y0 w1y0Var;
        m12546B();
        m12565G(false, true);
        if (z2 || this.f9867u.f195867e == 3) {
            m12608y(2);
        }
        i1y0 i1y0VarM200994h = this.f9863q.m200994h();
        i1y0 i1y0VarM134025g = i1y0VarM200994h;
        while (i1y0VarM134025g != null && !eqy0Var.equals(i1y0VarM134025g.f110514f.f136736a)) {
            i1y0VarM134025g = i1y0VarM134025g.m134025g();
        }
        if (z || i1y0VarM200994h != i1y0VarM134025g || (i1y0VarM134025g != null && i1y0VarM134025g.m134023e() + j < 0)) {
            p5y0[] p5y0VarArr = this.f9847a;
            int length = p5y0VarArr.length;
            for (int i = 0; i < 2; i++) {
                m12583e(p5y0VarArr[i]);
            }
            if (i1y0VarM134025g != null) {
                while (true) {
                    i1y0 i1y0VarM200994h2 = this.f9863q.m200994h();
                    w1y0Var = this.f9863q;
                    if (i1y0VarM200994h2 == i1y0VarM134025g) {
                        break;
                    }
                    w1y0Var.m200990d();
                }
                w1y0Var.m201003q(i1y0VarM134025g);
                i1y0VarM134025g.m134034p(1000000000000L);
                m12585f();
            }
        }
        w1y0 w1y0Var2 = this.f9863q;
        if (i1y0VarM134025g != null) {
            w1y0Var2.m201003q(i1y0VarM134025g);
            if (!i1y0VarM134025g.f110512d) {
                i1y0VarM134025g.f110514f = i1y0VarM134025g.f110514f.m157518b(j);
            } else if (i1y0VarM134025g.f110513e) {
                j = i1y0VarM134025g.f110509a.mo108308l(j);
                i1y0VarM134025g.f110509a.mo108306g(j - this.f9859m, false);
            }
            m12602s(j);
            m12598m();
        } else {
            w1y0Var2.m200999m();
            m12602s(j);
        }
        m12591i(false);
        this.f9854h.mo164794n(2);
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
    public final void m12593j(xqt0 xqt0Var, boolean z) throws Throwable {
        long j;
        long j2;
        eqy0 eqy0Var;
        qpt0 qpt0Var;
        Object obj;
        int iMo112554g;
        long jLongValue;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        xqt0 xqt0Var2;
        long jLongValue2;
        ?? r11;
        long jM12590h0;
        eqy0 eqy0VarM212865h;
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
        bzx0 bzx0Var;
        y3y0 y3y0Var = this.f9867u;
        bzx0 bzx0Var2 = this.f9839G;
        int i3 = this.f9835C;
        boolean z15 = this.f9836D;
        int i4 = -1;
        if (xqt0Var.m210615o()) {
            xqt0Var2 = xqt0Var;
            eqy0VarM212865h = y3y0.m212865h();
            z6 = false;
            z8 = false;
            jM12590h0 = 0;
            z7 = true;
            j = -9223372036854775807L;
            j2 = -9223372036854775807L;
        } else {
            bnt0 bnt0Var = this.f9858l;
            eqy0 eqy0Var2 = y3y0Var.f195864b;
            Object obj4 = eqy0Var2.f92867a;
            boolean zM12548L = m12548L(y3y0Var, bnt0Var);
            if (y3y0Var.f195864b.m117807b() || zM12548L) {
                j = -9223372036854775807L;
                j2 = y3y0Var.f195865c;
            } else {
                j = -9223372036854775807L;
                j2 = y3y0Var.f195880r;
            }
            qpt0 qpt0Var2 = this.f9857k;
            if (bzx0Var2 != null) {
                eqy0Var = eqy0Var2;
                Object obj5 = obj4;
                Pair pairM12557k0 = m12557k0(xqt0Var, bzx0Var2, true, i3, z15, qpt0Var2, bnt0Var);
                if (pairM12557k0 == null) {
                    iMo112554g = xqt0Var.mo112554g(z15);
                    jLongValue3 = j2;
                    obj2 = obj5;
                    z11 = false;
                    z12 = true;
                    z10 = false;
                } else {
                    long j7 = bzx0Var2.f78093c;
                    Object obj6 = pairM12557k0.first;
                    if (j7 == j) {
                        iMo112554g = xqt0Var.mo112558n(obj6, bnt0Var).f76445c;
                        jLongValue3 = j2;
                        z9 = false;
                    } else {
                        jLongValue3 = ((Long) pairM12557k0.second).longValue();
                        obj5 = obj6;
                        iMo112554g = -1;
                        z9 = true;
                    }
                    obj2 = obj5;
                    z10 = z9;
                    z11 = y3y0Var.f195867e == 4;
                    z12 = false;
                }
                j2 = jLongValue3;
                qpt0Var = qpt0Var2;
                z3 = z12;
                i4 = -1;
                z4 = z10;
                obj = obj2;
                z2 = z11;
            } else {
                eqy0Var = eqy0Var2;
                if (y3y0Var.f195863a.m210615o()) {
                    iMo112554g = xqt0Var.mo112554g(z15);
                    qpt0Var = qpt0Var2;
                    obj = obj4;
                } else if (xqt0Var.mo112550a(obj4) == -1) {
                    Object objM12555W = m12555W(qpt0Var2, bnt0Var, i3, z15, obj4, y3y0Var.f195863a, xqt0Var);
                    qpt0Var = qpt0Var2;
                    if (objM12555W == null) {
                        bnt0Var = bnt0Var;
                        iMo112554g = xqt0Var.mo112554g(z15);
                        z5 = true;
                    } else {
                        bnt0Var = bnt0Var;
                        iMo112554g = xqt0Var.mo112558n(objM12555W, bnt0Var).f76445c;
                        z5 = false;
                    }
                    z3 = z5;
                    obj = obj4;
                    j2 = j2;
                    i4 = -1;
                    z2 = false;
                    z4 = false;
                } else {
                    qpt0Var = qpt0Var2;
                    if (j2 == j) {
                        iMo112554g = xqt0Var.mo112558n(obj4, bnt0Var).f76445c;
                        obj = obj4;
                    } else if (zM12548L) {
                        y3y0Var.f195863a.mo112558n(eqy0Var.f92867a, bnt0Var);
                        if (y3y0Var.f195863a.mo112552e(bnt0Var.f76445c, qpt0Var, 0L).f155827n == y3y0Var.f195863a.mo112550a(eqy0Var.f92867a)) {
                            Pair pairM210613l = xqt0Var.m210613l(qpt0Var, bnt0Var, xqt0Var.mo112558n(obj4, bnt0Var).f76445c, j2);
                            obj = pairM210613l.first;
                            jLongValue = ((Long) pairM210613l.second).longValue();
                        } else {
                            obj = obj4;
                            jLongValue = j2;
                        }
                        j2 = jLongValue;
                        iMo112554g = -1;
                        i4 = -1;
                        z2 = false;
                        z3 = false;
                        z4 = true;
                    } else {
                        obj = obj4;
                        j2 = j2;
                        iMo112554g = -1;
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
            if (iMo112554g != i4) {
                xqt0Var2 = xqt0Var;
                Pair pairM210613l2 = xqt0Var2.m210613l(qpt0Var, bnt0Var, iMo112554g, -9223372036854775807L);
                obj = pairM210613l2.first;
                jLongValue2 = ((Long) pairM210613l2.second).longValue();
                j2 = j;
            } else {
                xqt0Var2 = xqt0Var;
                jLongValue2 = j2;
            }
            eqy0 eqy0VarM200998l = this.f9863q.m200998l(xqt0Var2, obj, jLongValue2);
            int i5 = eqy0VarM200998l.f92871e;
            r11 = -1;
            boolean z16 = eqy0Var.f92867a.equals(obj) && !eqy0Var.m117807b() && !eqy0VarM200998l.m117807b() && (i5 == -1 || ((i = eqy0Var.f92871e) != -1 && i5 >= i));
            bnt0 bnt0VarMo112558n = xqt0Var2.mo112558n(obj, bnt0Var);
            if (!zM12548L && j2 == j2 && eqy0Var.f92867a.equals(eqy0VarM200998l.f92867a)) {
                if (eqy0Var.m117807b()) {
                    bnt0VarMo112558n.m102873n(eqy0Var.f92868b);
                }
                if (eqy0VarM200998l.m117807b()) {
                    bnt0VarMo112558n.m102873n(eqy0VarM200998l.f92868b);
                }
            }
            if (true == z16) {
                eqy0VarM200998l = eqy0Var;
            }
            if (eqy0VarM200998l.m117807b()) {
                if (eqy0VarM200998l.equals(eqy0Var)) {
                    jLongValue2 = y3y0Var.f195880r;
                } else {
                    xqt0Var2.mo112558n(eqy0VarM200998l.f92867a, bnt0Var);
                    if (eqy0VarM200998l.f92869c == bnt0Var.m102864e(eqy0VarM200998l.f92868b)) {
                        bnt0Var.m102869j();
                    }
                    jLongValue2 = 0;
                }
            }
            jM12590h0 = jLongValue2;
            eqy0VarM212865h = eqy0VarM200998l;
            z6 = z2;
            z7 = z3;
            z8 = z4;
        }
        boolean z17 = (this.f9867u.f195864b.equals(eqy0VarM212865h) && jM12590h0 == this.f9867u.f195880r) ? false : true;
        if (z7) {
            try {
                if (this.f9867u.f195867e != 1) {
                    try {
                        m12608y(4);
                    } catch (Throwable th) {
                        th = th;
                        z14 = z8;
                        z13 = false;
                        r25 = 0;
                        y3y0 y3y0Var2 = this.f9867u;
                        xqt0 xqt0Var3 = y3y0Var2.f195863a;
                        eqy0 eqy0Var3 = y3y0Var2.f195864b;
                        if (true != z14) {
                            j3 = j;
                        } else {
                            j3 = jM12590h0;
                        }
                        m12564F(xqt0Var, eqy0VarM212865h, xqt0Var3, eqy0Var3, j3, false);
                        if (z17) {
                            y3y0 y3y0Var3 = this.f9867u;
                            obj3 = y3y0Var3.f195864b.f92867a;
                            xqt0 xqt0Var4 = y3y0Var3.f195863a;
                            if (z17) {
                            }
                            long j8 = this.f9867u.f195866d;
                            if (xqt0Var.mo112550a(obj3) == -1) {
                                i2 = 4;
                            } else {
                                i2 = 3;
                            }
                            this.f9867u = m12597l0(eqy0VarM212865h, jM12590h0, j2, j8, z, i2);
                        } else {
                            y3y0 y3y0Var4 = this.f9867u;
                            obj3 = y3y0Var4.f195864b.f92867a;
                            xqt0 xqt0Var5 = y3y0Var4.f195863a;
                            if (z17) {
                            }
                            long j9 = this.f9867u.f195866d;
                            if (xqt0Var.mo112550a(obj3) == -1) {
                                i2 = 4;
                            } else {
                                i2 = 3;
                            }
                            this.f9867u = m12597l0(eqy0VarM212865h, jM12590h0, j2, j9, z, i2);
                        }
                        m12559r();
                        m12603t(r2, this.f9867u.f195863a);
                        this.f9867u = this.f9867u.m212871f(r2);
                        if (!xqt0Var.m210615o()) {
                            this.f9839G = r25;
                        }
                        m12591i(z13);
                        throw th;
                    }
                }
                z13 = false;
                try {
                    m12601q(false, false, false, true);
                } catch (Throwable th2) {
                    th = th2;
                    z14 = z8;
                    r25 = 0;
                    y3y0 y3y0Var5 = this.f9867u;
                    xqt0 xqt0Var6 = y3y0Var5.f195863a;
                    eqy0 eqy0Var4 = y3y0Var5.f195864b;
                    if (true != z14) {
                        j3 = j;
                    } else {
                        j3 = jM12590h0;
                    }
                    m12564F(xqt0Var, eqy0VarM212865h, xqt0Var6, eqy0Var4, j3, false);
                    if (z17) {
                        y3y0 y3y0Var6 = this.f9867u;
                        obj3 = y3y0Var6.f195864b.f92867a;
                        xqt0 xqt0Var7 = y3y0Var6.f195863a;
                        if (z17) {
                        }
                        long j10 = this.f9867u.f195866d;
                        if (xqt0Var.mo112550a(obj3) == -1) {
                            i2 = 4;
                        } else {
                            i2 = 3;
                        }
                        this.f9867u = m12597l0(eqy0VarM212865h, jM12590h0, j2, j10, z, i2);
                    } else {
                        y3y0 y3y0Var7 = this.f9867u;
                        obj3 = y3y0Var7.f195864b.f92867a;
                        xqt0 xqt0Var8 = y3y0Var7.f195863a;
                        if (z17) {
                        }
                        long j11 = this.f9867u.f195866d;
                        if (xqt0Var.mo112550a(obj3) == -1) {
                            i2 = 4;
                        } else {
                            i2 = 3;
                        }
                        this.f9867u = m12597l0(eqy0VarM212865h, jM12590h0, j2, j11, z, i2);
                    }
                    m12559r();
                    m12603t(r2, this.f9867u.f195863a);
                    this.f9867u = this.f9867u.m212871f(r2);
                    if (!xqt0Var.m210615o()) {
                        this.f9839G = r25;
                    }
                    m12591i(z13);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                z13 = false;
                z14 = z8;
                r25 = 0;
                y3y0 y3y0Var8 = this.f9867u;
                xqt0 xqt0Var9 = y3y0Var8.f195863a;
                eqy0 eqy0Var5 = y3y0Var8.f195864b;
                if (true != z14) {
                    j3 = j;
                } else {
                    j3 = jM12590h0;
                }
                m12564F(xqt0Var, eqy0VarM212865h, xqt0Var9, eqy0Var5, j3, false);
                if (z17) {
                    y3y0 y3y0Var9 = this.f9867u;
                    obj3 = y3y0Var9.f195864b.f92867a;
                    xqt0 xqt0Var10 = y3y0Var9.f195863a;
                    if (z17) {
                    }
                    long j12 = this.f9867u.f195866d;
                    if (xqt0Var.mo112550a(obj3) == -1) {
                        i2 = 4;
                    } else {
                        i2 = 3;
                    }
                    this.f9867u = m12597l0(eqy0VarM212865h, jM12590h0, j2, j12, z, i2);
                } else {
                    y3y0 y3y0Var10 = this.f9867u;
                    obj3 = y3y0Var10.f195864b.f92867a;
                    xqt0 xqt0Var11 = y3y0Var10.f195863a;
                    if (z17) {
                    }
                    long j13 = this.f9867u.f195866d;
                    if (xqt0Var.mo112550a(obj3) == -1) {
                        i2 = 4;
                    } else {
                        i2 = 3;
                    }
                    this.f9867u = m12597l0(eqy0VarM212865h, jM12590h0, j2, j13, z, i2);
                }
                m12559r();
                m12603t(r2, this.f9867u.f195863a);
                this.f9867u = this.f9867u.m212871f(r2);
                if (!xqt0Var.m210615o()) {
                    this.f9839G = r25;
                }
                m12591i(z13);
                throw th;
            }
        } else {
            z13 = false;
        }
        p5y0[] p5y0VarArr = this.f9847a;
        int length = p5y0VarArr.length;
        ?? r4 = z13;
        while (true) {
            c = 2;
            if (r4 < 2) {
                p5y0VarArr[r4].mo146611m(xqt0Var2);
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
            bzx0Var = null;
            bzx0Var = null;
            if (!xqt0Var2.m210615o()) {
                for (i1y0 i1y0VarM200994h = this.f9863q.m200994h(); i1y0VarM200994h != null; i1y0VarM200994h = i1y0VarM200994h.m134025g()) {
                    if (i1y0VarM200994h.f110514f.f136736a.equals(eqy0VarM212865h)) {
                        i1y0VarM200994h.f110514f = this.f9863q.m200997k(xqt0Var2, i1y0VarM200994h.f110514f);
                        i1y0VarM200994h.m134035q();
                    }
                }
                jM12590h0 = m12590h0(eqy0VarM212865h, jM12590h0, z6);
            }
        } else {
            try {
                w1y0 w1y0Var = this.f9863q;
                long j14 = this.f9840H;
                i1y0 i1y0VarM200995i = w1y0Var.m200995i();
                if (i1y0VarM200995i == null) {
                    j4 = j14;
                    z4 = z8;
                    j5 = 0;
                } else {
                    long jM134023e = i1y0VarM200995i.m134023e();
                    z4 = z8;
                    if (i1y0VarM200995i.f110512d) {
                        ?? r5 = z13;
                        long jMax = jM134023e;
                        while (true) {
                            try {
                                p5y0[] p5y0VarArr2 = this.f9847a;
                                int length2 = p5y0VarArr2.length;
                                if (r5 >= c) {
                                    j4 = j14;
                                    j5 = jMax;
                                    break;
                                }
                                if (m12547J(p5y0VarArr2[r5]) && this.f9847a[r5].zzo() == i1y0VarM200995i.f110511c[r5]) {
                                    j6 = j14;
                                    long jMo146617v = this.f9847a[r5].mo146617v();
                                    if (jMo146617v == Long.MIN_VALUE) {
                                        j5 = Long.MIN_VALUE;
                                        j4 = j6;
                                        break;
                                    }
                                    jMax = Math.max(jMo146617v, jMax);
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
                                y3y0 y3y0Var11 = this.f9867u;
                                xqt0 xqt0Var12 = y3y0Var11.f195863a;
                                eqy0 eqy0Var6 = y3y0Var11.f195864b;
                                if (true != z14) {
                                    j3 = j;
                                } else {
                                    j3 = jM12590h0;
                                }
                                m12564F(xqt0Var, eqy0VarM212865h, xqt0Var12, eqy0Var6, j3, false);
                                if (z17) {
                                    y3y0 y3y0Var12 = this.f9867u;
                                    obj3 = y3y0Var12.f195864b.f92867a;
                                    xqt0 xqt0Var13 = y3y0Var12.f195863a;
                                    if (z17) {
                                    }
                                    long j15 = this.f9867u.f195866d;
                                    if (xqt0Var.mo112550a(obj3) == -1) {
                                        i2 = 4;
                                    } else {
                                        i2 = 3;
                                    }
                                    this.f9867u = m12597l0(eqy0VarM212865h, jM12590h0, j2, j15, z, i2);
                                } else {
                                    y3y0 y3y0Var13 = this.f9867u;
                                    obj3 = y3y0Var13.f195864b.f92867a;
                                    xqt0 xqt0Var14 = y3y0Var13.f195863a;
                                    if (z17) {
                                    }
                                    long j16 = this.f9867u.f195866d;
                                    if (xqt0Var.mo112550a(obj3) == -1) {
                                        i2 = 4;
                                    } else {
                                        i2 = 3;
                                    }
                                    this.f9867u = m12597l0(eqy0VarM212865h, jM12590h0, j2, j16, z, i2);
                                }
                                m12559r();
                                m12603t(r2, this.f9867u.f195863a);
                                this.f9867u = this.f9867u.m212871f(r2);
                                if (!xqt0Var.m210615o()) {
                                    this.f9839G = r25;
                                }
                                m12591i(z13);
                                throw th;
                            }
                        }
                    } else {
                        j4 = j14;
                        j5 = jM134023e;
                    }
                }
                r11 = 0;
                bzx0Var = null;
                bzx0Var = null;
                try {
                    boolean zM201005s = w1y0Var.m201005s(xqt0Var, j4, j5);
                    xqt0Var2 = xqt0Var;
                    if (!zM201005s) {
                        m12605v(z13);
                    }
                } catch (Throwable th6) {
                    th = th6;
                    eqy0VarM212865h = eqy0VarM212865h;
                    r25 = r11;
                    z14 = z4;
                    y3y0 y3y0Var14 = this.f9867u;
                    xqt0 xqt0Var15 = y3y0Var14.f195863a;
                    eqy0 eqy0Var7 = y3y0Var14.f195864b;
                    if (true != z14) {
                        j3 = j;
                    } else {
                        j3 = jM12590h0;
                    }
                    m12564F(xqt0Var, eqy0VarM212865h, xqt0Var15, eqy0Var7, j3, false);
                    if (z17 || j2 != this.f9867u.f195865c) {
                        y3y0 y3y0Var15 = this.f9867u;
                        obj3 = y3y0Var15.f195864b.f92867a;
                        xqt0 xqt0Var16 = y3y0Var15.f195863a;
                        boolean z18 = (z17 || !z || xqt0Var16.m210615o() || xqt0Var16.mo112558n(obj3, this.f9858l).f76448f) ? z13 : true;
                        long j17 = this.f9867u.f195866d;
                        if (xqt0Var.mo112550a(obj3) == -1) {
                            i2 = 4;
                        } else {
                            i2 = 3;
                        }
                        this.f9867u = m12597l0(eqy0VarM212865h, jM12590h0, j2, j17, z18, i2);
                    }
                    m12559r();
                    m12603t(r2, this.f9867u.f195863a);
                    this.f9867u = this.f9867u.m212871f(r2);
                    if (!xqt0Var.m210615o()) {
                        this.f9839G = r25;
                    }
                    m12591i(z13);
                    throw th;
                }
            } catch (Throwable th7) {
                th = th7;
                z4 = z8;
                r11 = 0;
            }
        }
        y3y0 y3y0Var16 = this.f9867u;
        eqy0 eqy0Var8 = eqy0VarM212865h;
        m12564F(xqt0Var2, eqy0Var8, y3y0Var16.f195863a, y3y0Var16.f195864b, true != z4 ? j : jM12590h0, false);
        if (z17 || j2 != this.f9867u.f195865c) {
            y3y0 y3y0Var17 = this.f9867u;
            Object obj7 = y3y0Var17.f195864b.f92867a;
            xqt0 xqt0Var17 = y3y0Var17.f195863a;
            this.f9867u = m12597l0(eqy0Var8, jM12590h0, j2, this.f9867u.f195866d, (!z17 || !z || xqt0Var17.m210615o() || xqt0Var17.mo112558n(obj7, this.f9858l).f76448f) ? z13 : true, xqt0Var2.mo112550a(obj7) == -1 ? 4 : 3);
        }
        m12559r();
        m12603t(xqt0Var2, this.f9867u.f195863a);
        this.f9867u = this.f9867u.m212871f(xqt0Var2);
        if (!xqt0Var2.m210615o()) {
            this.f9839G = bzx0Var;
        }
        m12591i(z13);
    }

    /* JADX INFO: renamed from: j0 */
    public final Pair m12594j0(xqt0 xqt0Var) {
        long j = 0;
        if (xqt0Var.m210615o()) {
            return Pair.create(y3y0.m212865h(), 0L);
        }
        Pair pairM210613l = xqt0Var.m210613l(this.f9857k, this.f9858l, xqt0Var.mo112554g(this.f9836D), -9223372036854775807L);
        eqy0 eqy0VarM200998l = this.f9863q.m200998l(xqt0Var, pairM210613l.first, 0L);
        long jLongValue = ((Long) pairM210613l.second).longValue();
        if (eqy0VarM200998l.m117807b()) {
            xqt0Var.mo112558n(eqy0VarM200998l.f92867a, this.f9858l);
            if (eqy0VarM200998l.f92869c == this.f9858l.m102864e(eqy0VarM200998l.f92868b)) {
                this.f9858l.m102869j();
            }
        } else {
            j = jLongValue;
        }
        return Pair.create(eqy0VarM200998l, Long.valueOf(j));
    }

    /* JADX INFO: renamed from: k */
    public final void m12595k(c5t0 c5t0Var, boolean z) throws zziz {
        m12596l(c5t0Var, c5t0Var.f79416a, true, z);
    }

    /* JADX INFO: renamed from: l */
    public final void m12596l(c5t0 c5t0Var, float f, boolean z, boolean z2) throws zziz {
        c5t0 c5t0Var2;
        int i;
        if (z) {
            if (z2) {
                this.f9868v.m206238a(1);
            }
            y3y0 y3y0Var = this.f9867u;
            y3y0 y3y0Var2 = new y3y0(y3y0Var.f195863a, y3y0Var.f195864b, y3y0Var.f195865c, y3y0Var.f195866d, y3y0Var.f195867e, y3y0Var.f195868f, y3y0Var.f195869g, y3y0Var.f195870h, y3y0Var.f195871i, y3y0Var.f195872j, y3y0Var.f195873k, y3y0Var.f195874l, y3y0Var.f195875m, c5t0Var, y3y0Var.f195878p, y3y0Var.f195879q, y3y0Var.f195880r, y3y0Var.f195881s, false);
            c5t0Var2 = c5t0Var;
            this.f9867u = y3y0Var2;
        } else {
            c5t0Var2 = c5t0Var;
        }
        float f2 = c5t0Var2.f79416a;
        i1y0 i1y0VarM200994h = this.f9863q.m200994h();
        while (true) {
            i = 0;
            if (i1y0VarM200994h == null) {
                break;
            }
            hwy0[] hwy0VarArr = i1y0VarM200994h.m134027i().f146095c;
            int length = hwy0VarArr.length;
            while (i < length) {
                hwy0 hwy0Var = hwy0VarArr[i];
                i++;
            }
            i1y0VarM200994h = i1y0VarM200994h.m134025g();
        }
        p5y0[] p5y0VarArr = this.f9847a;
        int length2 = p5y0VarArr.length;
        while (i < 2) {
            p5y0 p5y0Var = p5y0VarArr[i];
            if (p5y0Var != null) {
                p5y0Var.mo100009p(f, c5t0Var2.f79416a);
            }
            i++;
        }
    }

    @CheckResult
    /* JADX INFO: renamed from: l0 */
    public final y3y0 m12597l0(eqy0 eqy0Var, long j, long j2, long j3, boolean z, int i) {
        List list;
        kty0 kty0Var;
        owy0 owy0Var;
        int i2 = 0;
        this.f9842J = (!this.f9842J && j == this.f9867u.f195880r && eqy0Var.equals(this.f9867u.f195864b)) ? false : true;
        m12559r();
        y3y0 y3y0Var = this.f9867u;
        kty0 kty0Var2 = y3y0Var.f195870h;
        owy0 owy0Var2 = y3y0Var.f195871i;
        List listZzl = y3y0Var.f195872j;
        if (this.f9864r.m196884j()) {
            i1y0 i1y0VarM200994h = this.f9863q.m200994h();
            kty0 kty0VarM134026h = i1y0VarM200994h == null ? kty0.f124626d : i1y0VarM200994h.m134026h();
            owy0 owy0VarM134027i = i1y0VarM200994h == null ? this.f9851e : i1y0VarM200994h.m134027i();
            hwy0[] hwy0VarArr = owy0VarM134027i.f146095c;
            ghw0 ghw0Var = new ghw0();
            int length = hwy0VarArr.length;
            int i3 = 0;
            boolean z2 = false;
            while (i3 < length) {
                hwy0 hwy0Var = hwy0VarArr[i3];
                if (hwy0Var != null) {
                    zzby zzbyVar = hwy0Var.zzd(0).f133890j;
                    if (zzbyVar == null) {
                        ghw0Var.m126240g(new zzby(-9223372036854775807L, new zzbx[0]));
                    } else {
                        ghw0Var.m126240g(zzbyVar);
                        z2 = true;
                    }
                }
                i3++;
                kty0VarM134026h = kty0VarM134026h;
            }
            kty0 kty0Var3 = kty0VarM134026h;
            zzgaa zzgaaVarM126243j = z2 ? ghw0Var.m126243j() : zzgaa.zzl();
            if (i1y0VarM200994h != null) {
                n1y0 n1y0Var = i1y0VarM200994h.f110514f;
                if (n1y0Var.f136738c != j2) {
                    i1y0VarM200994h.f110514f = n1y0Var.m157517a(j2);
                }
            }
            i1y0 i1y0VarM200994h2 = this.f9863q.m200994h();
            if (i1y0VarM200994h2 != null) {
                owy0 owy0VarM134027i2 = i1y0VarM200994h2.m134027i();
                while (true) {
                    int length2 = this.f9847a.length;
                    if (i2 >= 2) {
                        break;
                    }
                    if (owy0VarM134027i2.m166453b(i2)) {
                        if (this.f9847a[i2].mo146606c() != 1) {
                            break;
                        }
                        int i4 = owy0VarM134027i2.f146094b[i2].f191205a;
                    }
                    i2++;
                }
            }
            list = zzgaaVarM126243j;
            owy0Var = owy0VarM134027i;
            kty0Var = kty0Var3;
        } else {
            if (!eqy0Var.equals(this.f9867u.f195864b)) {
                owy0Var2 = this.f9851e;
                kty0Var2 = kty0.f124626d;
                listZzl = zzgaa.zzl();
            }
            list = listZzl;
            kty0Var = kty0Var2;
            owy0Var = owy0Var2;
        }
        if (z) {
            this.f9868v.m206241d(i);
        }
        return this.f9867u.m212867b(eqy0Var, j, j2, j3, m12586f0(), kty0Var, owy0Var, list);
    }

    /* JADX INFO: renamed from: m */
    public final void m12598m() {
        long jM134023e;
        boolean zMo127309c = false;
        if (m12567I()) {
            i1y0 i1y0VarM200993g = this.f9863q.m200993g();
            long jM12588g0 = m12588g0(i1y0VarM200993g.m134022d());
            i1y0 i1y0VarM200994h = this.f9863q.m200994h();
            long jM134023e2 = this.f9840H;
            if (i1y0VarM200993g == i1y0VarM200994h) {
                jM134023e = i1y0VarM200993g.m134023e();
            } else {
                jM134023e2 -= i1y0VarM200993g.m134023e();
                jM134023e = i1y0VarM200993g.f110514f.f136737b;
            }
            long j = jM134023e2 - jM134023e;
            boolean zMo127309c2 = this.f9852f.mo127309c(j, jM12588g0, this.f9860n.zzc().f79416a);
            if (zMo127309c2 || jM12588g0 >= 500000 || this.f9859m <= 0) {
                zMo127309c = zMo127309c2;
            } else {
                this.f9863q.m200994h().f110509a.mo108306g(this.f9867u.f195880r, false);
                zMo127309c = this.f9852f.mo127309c(j, jM12588g0, this.f9860n.zzc().f79416a);
            }
        }
        this.f9834B = zMo127309c;
        if (zMo127309c) {
            this.f9863q.m200993g().m134029k(this.f9840H, this.f9860n.zzc().f79416a, this.f9833A);
        }
        m12561C();
    }

    /* JADX INFO: renamed from: n */
    public final void m12599n() {
        this.f9868v.m206240c(this.f9867u);
        if (this.f9868v.f188688a) {
            krx0 krx0Var = this.f9845M;
            krx0Var.f124404a.m133452D(this.f9868v);
            this.f9868v = new wyx0(this.f9867u);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m12600o() throws zziz {
        int i;
        int i2;
        float f = this.f9860n.zzc().f79416a;
        w1y0 w1y0Var = this.f9863q;
        i1y0 i1y0VarM200995i = w1y0Var.m200995i();
        boolean z = true;
        for (i1y0 i1y0VarM200994h = w1y0Var.m200994h(); i1y0VarM200994h != null && i1y0VarM200994h.f110512d; i1y0VarM200994h = i1y0VarM200994h.m134025g()) {
            owy0 owy0VarM134028j = i1y0VarM200994h.m134028j(f, this.f9867u.f195863a);
            owy0 owy0VarM134027i = i1y0VarM200994h.m134027i();
            boolean z2 = false;
            if (owy0VarM134027i != null) {
                if (owy0VarM134027i.f146095c.length == owy0VarM134028j.f146095c.length) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= owy0VarM134028j.f146095c.length) {
                            if (i1y0VarM200994h != i1y0VarM200995i) {
                                z2 = true;
                            }
                            z &= z2;
                        } else if (owy0VarM134028j.m166452a(owy0VarM134027i, i3)) {
                            i3++;
                        }
                    }
                }
            }
            w1y0 w1y0Var2 = this.f9863q;
            if (z) {
                i1y0 i1y0VarM200994h2 = w1y0Var2.m200994h();
                boolean zM201003q = w1y0Var2.m201003q(i1y0VarM200994h2);
                int length = this.f9847a.length;
                boolean[] zArr = new boolean[2];
                long jM134020b = i1y0VarM200994h2.m134020b(owy0VarM134028j, this.f9867u.f195880r, zM201003q, zArr);
                y3y0 y3y0Var = this.f9867u;
                boolean z3 = (y3y0Var.f195867e == 4 || jM134020b == y3y0Var.f195880r) ? false : true;
                y3y0 y3y0Var2 = this.f9867u;
                i = 4;
                i2 = 2;
                this.f9867u = m12597l0(y3y0Var2.f195864b, jM134020b, y3y0Var2.f195865c, y3y0Var2.f195866d, z3, 5);
                if (z3) {
                    m12602s(jM134020b);
                }
                int length2 = this.f9847a.length;
                boolean[] zArr2 = new boolean[2];
                int i4 = 0;
                while (true) {
                    p5y0[] p5y0VarArr = this.f9847a;
                    int length3 = p5y0VarArr.length;
                    if (i4 >= 2) {
                        break;
                    }
                    p5y0 p5y0Var = p5y0VarArr[i4];
                    boolean zM12547J = m12547J(p5y0Var);
                    zArr2[i4] = zM12547J;
                    zsy0 zsy0Var = i1y0VarM200994h2.f110511c[i4];
                    if (zM12547J) {
                        if (zsy0Var != p5y0Var.zzo()) {
                            m12583e(p5y0Var);
                        } else if (zArr[i4]) {
                            p5y0Var.mo146614q(this.f9840H);
                        }
                    }
                    i4++;
                }
                m12587g(zArr2, this.f9840H);
            } else {
                i = 4;
                i2 = 2;
                w1y0Var2.m201003q(i1y0VarM200994h);
                if (i1y0VarM200994h.f110512d) {
                    i1y0VarM200994h.m134019a(owy0VarM134028j, Math.max(i1y0VarM200994h.f110514f.f136737b, this.f9840H - i1y0VarM200994h.m134023e()), false);
                }
            }
            m12591i(true);
            if (this.f9867u.f195867e != i) {
                m12598m();
                m12563E();
                this.f9854h.mo164794n(i2);
                return;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a4 A[PHI: r2 r6 r8
      0x00a4: PHI (r2v2 l.eqy0) = (r2v1 l.eqy0), (r2v12 l.eqy0) binds: [B:30:0x007a, B:32:0x009f] A[DONT_GENERATE, DONT_INLINE]
      0x00a4: PHI (r6v3 long) = (r6v2 long), (r6v10 long) binds: [B:30:0x007a, B:32:0x009f] A[DONT_GENERATE, DONT_INLINE]
      0x00a4: PHI (r8v3 long) = (r8v2 long), (r8v8 long) binds: [B:30:0x007a, B:32:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x00ec A[PHI: r0
      0x00ec: PHI (r0v11 l.xqt0) = (r0v10 l.xqt0), (r0v10 l.xqt0), (r0v20 l.xqt0), (r0v20 l.xqt0) binds: [B:36:0x00b1, B:38:0x00b5, B:40:0x00c6, B:42:0x00de] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: q */
    public final void m12601q(boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        xqt0 xqt0Var;
        eqy0 eqy0Var;
        this.f9854h.zzf(2);
        this.f9843K = null;
        m12565G(false, true);
        this.f9860n.m175786f();
        this.f9840H = 1000000000000L;
        p5y0[] p5y0VarArr = this.f9847a;
        int length = p5y0VarArr.length;
        for (int i = 0; i < 2; i++) {
            try {
                m12583e(p5y0VarArr[i]);
            } catch (zziz | RuntimeException e) {
                svv0.m186109d("ExoPlayerImplInternal", "Disable failed.", e);
            }
        }
        if (z) {
            p5y0[] p5y0VarArr2 = this.f9847a;
            int length2 = p5y0VarArr2.length;
            for (int i2 = 0; i2 < 2; i2++) {
                p5y0 p5y0Var = p5y0VarArr2[i2];
                if (this.f9848b.remove(p5y0Var)) {
                    try {
                        p5y0Var.mo146613o();
                    } catch (RuntimeException e2) {
                        svv0.m186109d("ExoPlayerImplInternal", "Reset failed.", e2);
                    }
                }
            }
        }
        this.f9838F = 0;
        y3y0 y3y0Var = this.f9867u;
        eqy0 eqy0Var2 = y3y0Var.f195864b;
        long jLongValue = y3y0Var.f195880r;
        long j = (this.f9867u.f195864b.m117807b() || m12548L(this.f9867u, this.f9858l)) ? this.f9867u.f195865c : this.f9867u.f195880r;
        if (z2) {
            this.f9839G = null;
            Pair pairM12594j0 = m12594j0(this.f9867u.f195863a);
            eqy0Var2 = (eqy0) pairM12594j0.first;
            jLongValue = ((Long) pairM12594j0.second).longValue();
            j = -9223372036854775807L;
            z5 = eqy0Var2.equals(this.f9867u.f195864b) ? false : true;
        }
        long j2 = jLongValue;
        long j3 = j;
        this.f9863q.m200999m();
        this.f9834B = false;
        xqt0 xqt0VarM139875z = this.f9867u.f195863a;
        if (z3 && (xqt0VarM139875z instanceof j5y0)) {
            xqt0VarM139875z = ((j5y0) xqt0VarM139875z).m139875z(this.f9864r.m196891q());
            if (eqy0Var2.f92868b != -1) {
                xqt0VarM139875z.mo112558n(eqy0Var2.f92867a, this.f9858l);
                bnt0 bnt0Var = this.f9858l;
                qpt0 qpt0Var = this.f9857k;
                xqt0VarM139875z.mo112552e(bnt0Var.f76445c, qpt0Var, 0L);
                if (qpt0Var.m175866b()) {
                    xqt0Var = xqt0VarM139875z;
                    eqy0Var = new eqy0(eqy0Var2.f92867a, eqy0Var2.f92870d);
                } else {
                    xqt0Var = xqt0VarM139875z;
                    eqy0Var = eqy0Var2;
                }
            } else {
                xqt0Var = xqt0VarM139875z;
                eqy0Var = eqy0Var2;
            }
        } else {
            xqt0Var = xqt0VarM139875z;
            eqy0Var = eqy0Var2;
        }
        y3y0 y3y0Var2 = this.f9867u;
        int i3 = y3y0Var2.f195867e;
        zziz zzizVar = z4 ? null : y3y0Var2.f195868f;
        kty0 kty0Var = z5 ? kty0.f124626d : y3y0Var2.f195870h;
        owy0 owy0Var = z5 ? this.f9851e : y3y0Var2.f195871i;
        List listZzl = z5 ? zzgaa.zzl() : y3y0Var2.f195872j;
        y3y0 y3y0Var3 = this.f9867u;
        this.f9867u = new y3y0(xqt0Var, eqy0Var, j3, j2, i3, zzizVar, false, kty0Var, owy0Var, listZzl, eqy0Var, y3y0Var3.f195874l, y3y0Var3.f195875m, y3y0Var3.f195876n, j2, 0L, j2, 0L, false);
        if (z3) {
            this.f9864r.m196882h();
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m12602s(long j) throws zziz {
        i1y0 i1y0VarM200994h = this.f9863q.m200994h();
        long jM134023e = j + (i1y0VarM200994h == null ? 1000000000000L : i1y0VarM200994h.m134023e());
        this.f9840H = jM134023e;
        this.f9860n.m175784d(jM134023e);
        p5y0[] p5y0VarArr = this.f9847a;
        int length = p5y0VarArr.length;
        for (int i = 0; i < 2; i++) {
            p5y0 p5y0Var = p5y0VarArr[i];
            if (m12547J(p5y0Var)) {
                p5y0Var.mo146614q(this.f9840H);
            }
        }
        for (i1y0 i1y0VarM200994h2 = this.f9863q.m200994h(); i1y0VarM200994h2 != null; i1y0VarM200994h2 = i1y0VarM200994h2.m134025g()) {
            for (hwy0 hwy0Var : i1y0VarM200994h2.m134027i().f146095c) {
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m12603t(xqt0 xqt0Var, xqt0 xqt0Var2) {
        if (xqt0Var.m210615o() && xqt0Var2.m210615o()) {
            return;
        }
        int size = this.f9861o.size() - 1;
        ArrayList arrayList = this.f9861o;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            Object obj = ((syx0) arrayList.get(size)).f167005a;
            int i = ggw0.f102568a;
            throw null;
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m12604u(long j, long j2) {
        this.f9854h.mo164789d(2, j + j2);
    }

    /* JADX INFO: renamed from: v */
    public final void m12605v(boolean z) throws zziz {
        eqy0 eqy0Var = this.f9863q.m200994h().f110514f.f136736a;
        long jM12592i0 = m12592i0(eqy0Var, this.f9867u.f195880r, true, false);
        if (jM12592i0 != this.f9867u.f195880r) {
            y3y0 y3y0Var = this.f9867u;
            this.f9867u = m12597l0(eqy0Var, jM12592i0, y3y0Var.f195865c, y3y0Var.f195866d, z, 5);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m12606w(c5t0 c5t0Var) {
        this.f9854h.zzf(16);
        this.f9860n.mo114455g(c5t0Var);
    }

    /* JADX INFO: renamed from: x */
    public final void m12607x(boolean z, int i, boolean z2, int i2) throws zziz {
        this.f9868v.m206238a(z2 ? 1 : 0);
        this.f9868v.m206239b(i2);
        this.f9867u = this.f9867u.m212868c(z, i);
        m12565G(false, false);
        for (i1y0 i1y0VarM200994h = this.f9863q.m200994h(); i1y0VarM200994h != null; i1y0VarM200994h = i1y0VarM200994h.m134025g()) {
            for (hwy0 hwy0Var : i1y0VarM200994h.m134027i().f146095c) {
            }
        }
        if (!m12569M()) {
            m12546B();
            m12563E();
            return;
        }
        int i3 = this.f9867u.f195867e;
        if (i3 == 3) {
            m12609z();
            this.f9854h.mo164794n(2);
        } else if (i3 == 2) {
            this.f9854h.mo164794n(2);
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m12608y(int i) {
        y3y0 y3y0Var = this.f9867u;
        if (y3y0Var.f195867e != i) {
            if (i != 2) {
                this.f9844L = -9223372036854775807L;
            }
            this.f9867u = y3y0Var.m212870e(i);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m12609z() throws zziz {
        m12565G(false, false);
        this.f9860n.m175785e();
        p5y0[] p5y0VarArr = this.f9847a;
        int length = p5y0VarArr.length;
        for (int i = 0; i < 2; i++) {
            p5y0 p5y0Var = p5y0VarArr[i];
            if (m12547J(p5y0Var)) {
                p5y0Var.zzN();
            }
        }
    }

    @Override // p149l.s3y0
    public final void zzh() {
        this.f9854h.mo164794n(22);
    }

    @Override // p149l.mwy0
    public final void zzj() {
        this.f9854h.mo164794n(10);
    }
}
