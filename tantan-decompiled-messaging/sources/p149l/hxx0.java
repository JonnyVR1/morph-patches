package p149l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.internal.ads.C2102a7;
import com.google.android.gms.internal.ads.C2111b7;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzby;
import com.google.android.gms.internal.ads.zzgaa;
import com.google.android.gms.internal.ads.zziz;
import com.google.android.gms.internal.ads.zzla;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes6.dex */
public final class hxx0 extends u4y0 implements grx0 {

    /* JADX INFO: renamed from: g0 */
    public static final /* synthetic */ int f109942g0 = 0;

    /* JADX INFO: renamed from: A */
    public final long f109943A;

    /* JADX INFO: renamed from: B */
    public int f109944B;

    /* JADX INFO: renamed from: C */
    public int f109945C;

    /* JADX INFO: renamed from: D */
    public boolean f109946D;

    /* JADX INFO: renamed from: E */
    public int f109947E;

    /* JADX INFO: renamed from: F */
    public a6y0 f109948F;

    /* JADX INFO: renamed from: G */
    public iat0 f109949G;

    /* JADX INFO: renamed from: H */
    public lqs0 f109950H;

    /* JADX INFO: renamed from: I */
    public lqs0 f109951I;

    /* JADX INFO: renamed from: J */
    @Nullable
    public mhr0 f109952J;

    /* JADX INFO: renamed from: K */
    @Nullable
    public mhr0 f109953K;

    /* JADX INFO: renamed from: L */
    @Nullable
    public Object f109954L;

    /* JADX INFO: renamed from: M */
    @Nullable
    public Surface f109955M;

    /* JADX INFO: renamed from: N */
    public int f109956N;

    /* JADX INFO: renamed from: O */
    public w7w0 f109957O;

    /* JADX INFO: renamed from: P */
    @Nullable
    public pnx0 f109958P;

    /* JADX INFO: renamed from: Q */
    @Nullable
    public pnx0 f109959Q;

    /* JADX INFO: renamed from: R */
    public int f109960R;

    /* JADX INFO: renamed from: S */
    public qux0 f109961S;

    /* JADX INFO: renamed from: T */
    public float f109962T;

    /* JADX INFO: renamed from: U */
    public boolean f109963U;

    /* JADX INFO: renamed from: V */
    public byu0 f109964V;

    /* JADX INFO: renamed from: W */
    public boolean f109965W;

    /* JADX INFO: renamed from: X */
    public boolean f109966X;

    /* JADX INFO: renamed from: Y */
    public p1r0 f109967Y;

    /* JADX INFO: renamed from: Z */
    public ueu0 f109968Z;

    /* JADX INFO: renamed from: a0 */
    public lqs0 f109969a0;

    /* JADX INFO: renamed from: b */
    public final owy0 f109970b;

    /* JADX INFO: renamed from: b0 */
    public y3y0 f109971b0;

    /* JADX INFO: renamed from: c */
    public final iat0 f109972c;

    /* JADX INFO: renamed from: c0 */
    public int f109973c0;

    /* JADX INFO: renamed from: d */
    public final v9v0 f109974d;

    /* JADX INFO: renamed from: d0 */
    public long f109975d0;

    /* JADX INFO: renamed from: e */
    public final Context f109976e;

    /* JADX INFO: renamed from: e0 */
    public final krx0 f109977e0;

    /* JADX INFO: renamed from: f */
    public final ift0 f109978f;

    /* JADX INFO: renamed from: f0 */
    public cty0 f109979f0;

    /* JADX INFO: renamed from: g */
    public final p5y0[] f109980g;

    /* JADX INFO: renamed from: h */
    public final nwy0 f109981h;

    /* JADX INFO: renamed from: i */
    public final ojv0 f109982i;

    /* JADX INFO: renamed from: j */
    public final C2111b7 f109983j;

    /* JADX INFO: renamed from: k */
    public final asv0 f109984k;

    /* JADX INFO: renamed from: l */
    public final CopyOnWriteArraySet f109985l;

    /* JADX INFO: renamed from: m */
    public final bnt0 f109986m;

    /* JADX INFO: renamed from: n */
    public final List f109987n;

    /* JADX INFO: renamed from: o */
    public final boolean f109988o;

    /* JADX INFO: renamed from: p */
    public final dqy0 f109989p;

    /* JADX INFO: renamed from: q */
    public final q6y0 f109990q;

    /* JADX INFO: renamed from: r */
    public final Looper f109991r;

    /* JADX INFO: renamed from: s */
    public final vwy0 f109992s;

    /* JADX INFO: renamed from: t */
    public final g6v0 f109993t;

    /* JADX INFO: renamed from: u */
    public final pwx0 f109994u;

    /* JADX INFO: renamed from: v */
    public final ywx0 f109995v;

    /* JADX INFO: renamed from: w */
    public final C2102a7 f109996w;

    /* JADX INFO: renamed from: x */
    public final gnx0 f109997x;

    /* JADX INFO: renamed from: y */
    public final l6y0 f109998y;

    /* JADX INFO: renamed from: z */
    public final o6y0 f109999z;

    static {
        wjs0.m203497b("media3.exoplayer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, l.q6y0, l.uwy0] */
    @SuppressLint({"HandlerLeak"})
    public hxx0(brx0 brx0Var, @Nullable ift0 ift0Var) {
        v9v0 v9v0Var = new v9v0(g6v0.f101315a);
        this.f109974d = v9v0Var;
        try {
            svv0.m186110e("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.2.1] [" + ggw0.f102572e + Constants.AES_SUFFIX);
            Context applicationContext = brx0Var.f76946a.getApplicationContext();
            this.f109976e = applicationContext;
            ?? Apply = brx0Var.f76953h.apply(brx0Var.f76947b);
            this.f109990q = Apply;
            this.f109961S = brx0Var.f76955j;
            this.f109956N = brx0Var.f76956k;
            this.f109963U = false;
            this.f109943A = brx0Var.f76960o;
            pwx0 pwx0Var = new pwx0(this, null);
            this.f109994u = pwx0Var;
            ywx0 ywx0Var = new ywx0(null);
            this.f109995v = ywx0Var;
            Handler handler = new Handler(brx0Var.f76954i);
            p5y0[] p5y0VarArrM202202a = ((ypx0) brx0Var.f76948c).f199508a.m202202a(handler, pwx0Var, pwx0Var, pwx0Var, pwx0Var);
            this.f109980g = p5y0VarArrM202202a;
            int length = p5y0VarArrM202202a.length;
            nwy0 nwy0Var = (nwy0) brx0Var.f76950e.zza();
            this.f109981h = nwy0Var;
            this.f109989p = brx0.m103603a(((cqx0) brx0Var.f76949d).f82125a);
            lxy0 lxy0VarM152107c = lxy0.m152107c(((qqx0) brx0Var.f76952g).f155947a);
            this.f109992s = lxy0VarM152107c;
            this.f109988o = brx0Var.f76957l;
            this.f109948F = brx0Var.f76958m;
            Looper looper = brx0Var.f76954i;
            this.f109991r = looper;
            g6v0 g6v0Var = brx0Var.f76947b;
            this.f109993t = g6v0Var;
            this.f109978f = ift0Var;
            asv0 asv0Var = new asv0(looper, g6v0Var, new tpv0() { // from class: l.nvx0
                @Override // p149l.tpv0
                /* JADX INFO: renamed from: a */
                public final void mo140602a(Object obj, uar0 uar0Var) {
                }
            });
            this.f109984k = asv0Var;
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.f109985l = copyOnWriteArraySet;
            this.f109987n = new ArrayList();
            this.f109979f0 = new cty0(0);
            int length2 = p5y0VarArrM202202a.length;
            owy0 owy0Var = new owy0(new x5y0[2], new hwy0[2], o8u0.f142672b, null);
            this.f109970b = owy0Var;
            this.f109986m = new bnt0();
            u7t0 u7t0Var = new u7t0();
            u7t0Var.m192166c(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32);
            nwy0Var.mo123591d();
            u7t0Var.m192167d(29, true);
            u7t0Var.m192167d(23, false);
            u7t0Var.m192167d(25, false);
            u7t0Var.m192167d(33, false);
            u7t0Var.m192167d(26, false);
            u7t0Var.m192167d(34, false);
            iat0 iat0VarM192168e = u7t0Var.m192168e();
            this.f109972c = iat0VarM192168e;
            u7t0 u7t0Var2 = new u7t0();
            u7t0Var2.m192165b(iat0VarM192168e);
            u7t0Var2.m192164a(4);
            u7t0Var2.m192164a(10);
            this.f109949G = u7t0Var2.m192168e();
            this.f109982i = g6v0Var.mo100826a(looper, null);
            krx0 krx0Var = new krx0(this);
            this.f109977e0 = krx0Var;
            this.f109971b0 = y3y0.m212864g(owy0Var);
            Apply.mo106366I(ift0Var, looper);
            this.f109983j = new C2111b7(p5y0VarArrM202202a, nwy0Var, owy0Var, (k0y0) brx0Var.f76951f.zza(), lxy0VarM152107c, 0, false, Apply, this.f109948F, brx0Var.f76963r, brx0Var.f76959n, false, looper, g6v0Var, krx0Var, ggw0.f102568a < 31 ? new pfy0() : svx0.m186113a(applicationContext, this, brx0Var.f76961p), null);
            this.f109962T = 1.0f;
            lqs0 lqs0Var = lqs0.f129410y;
            this.f109950H = lqs0Var;
            this.f109951I = lqs0Var;
            this.f109969a0 = lqs0Var;
            int iGenerateAudioSessionId = -1;
            this.f109973c0 = -1;
            AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
            if (audioManager != null) {
                iGenerateAudioSessionId = audioManager.generateAudioSessionId();
            }
            this.f109960R = iGenerateAudioSessionId;
            this.f109964V = byu0.f77967b;
            this.f109965W = true;
            if (Apply == 0) {
                throw null;
            }
            asv0Var.m98625b(Apply);
            lxy0VarM152107c.mo152112b(new Handler(looper), Apply);
            copyOnWriteArraySet.add(pwx0Var);
            this.f109996w = new C2102a7(brx0Var.f76946a, handler, pwx0Var);
            this.f109997x = new gnx0(brx0Var.f76946a, handler, pwx0Var);
            ggw0.m126064f(null, null);
            this.f109998y = new l6y0(brx0Var.f76946a);
            this.f109999z = new o6y0(brx0Var.f76946a);
            this.f109967Y = new uvy0(0).m196098a();
            this.f109968Z = ueu0.f176200e;
            this.f109957O = w7w0.f185113c;
            nwy0Var.mo123590c(this.f109961S);
            m133462Q(1, 10, Integer.valueOf(this.f109960R));
            m133462Q(2, 10, Integer.valueOf(this.f109960R));
            m133462Q(1, 3, this.f109961S);
            m133462Q(2, 4, Integer.valueOf(this.f109956N));
            m133462Q(2, 5, 0);
            m133462Q(1, 9, Boolean.valueOf(this.f109963U));
            m133462Q(2, 7, ywx0Var);
            m133462Q(6, 8, ywx0Var);
            v9v0Var.m197605e();
        } catch (Throwable th) {
            this.f109974d.m197605e();
            throw th;
        }
    }

    /* JADX INFO: renamed from: H */
    public static int m133436H(boolean z, int i) {
        return (!z || i == 1) ? 1 : 2;
    }

    /* JADX INFO: renamed from: K */
    public static long m133437K(y3y0 y3y0Var) {
        qpt0 qpt0Var = new qpt0();
        bnt0 bnt0Var = new bnt0();
        y3y0Var.f195863a.mo112558n(y3y0Var.f195864b.f92867a, bnt0Var);
        long j = y3y0Var.f195865c;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = y3y0Var.f195863a.mo112552e(bnt0Var.f76445c, qpt0Var, 0L).f155825l;
        return 0L;
    }

    /* JADX INFO: renamed from: z */
    public static /* bridge */ /* synthetic */ void m133450z(hxx0 hxx0Var, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        hxx0Var.m133464S(surface);
        hxx0Var.f109955M = surface;
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m133451C(wyx0 wyx0Var) {
        int i = this.f109944B - wyx0Var.f188690c;
        this.f109944B = i;
        boolean z = true;
        if (wyx0Var.f188691d) {
            this.f109945C = wyx0Var.f188692e;
            this.f109946D = true;
        }
        if (wyx0Var.f188693f) {
            this.f109947E = wyx0Var.f188694g;
        }
        if (i == 0) {
            xqt0 xqt0Var = wyx0Var.f188689b.f195863a;
            if (!this.f109971b0.f195863a.m210615o() && xqt0Var.m210615o()) {
                this.f109973c0 = -1;
                this.f109975d0 = 0L;
            }
            if (!xqt0Var.m210615o()) {
                List listM139874y = ((j5y0) xqt0Var).m139874y();
                f5v0.m119535f(listM139874y.size() == this.f109987n.size());
                for (int i2 = 0; i2 < listM139874y.size(); i2++) {
                    ((cxx0) this.f109987n.get(i2)).m109119a((xqt0) listM139874y.get(i2));
                }
            }
            long j = -9223372036854775807L;
            if (this.f109946D) {
                if (wyx0Var.f188689b.f195864b.equals(this.f109971b0.f195864b) && wyx0Var.f188689b.f195866d == this.f109971b0.f195880r) {
                    z = false;
                }
                if (z) {
                    if (xqt0Var.m210615o() || wyx0Var.f188689b.f195864b.m117807b()) {
                        j = wyx0Var.f188689b.f195866d;
                    } else {
                        y3y0 y3y0Var = wyx0Var.f188689b;
                        eqy0 eqy0Var = y3y0Var.f195864b;
                        long j2 = y3y0Var.f195866d;
                        m133457L(xqt0Var, eqy0Var, j2);
                        j = j2;
                    }
                }
            } else {
                z = false;
            }
            this.f109946D = false;
            m133467V(wyx0Var.f188689b, 1, this.f109947E, z, this.f109945C, j, -1, false);
        }
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m133452D(final wyx0 wyx0Var) {
        this.f109982i.mo164792g(new Runnable() { // from class: l.jvx0
            @Override // java.lang.Runnable
            public final void run() {
                this.f120001a.m133451C(wyx0Var);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m133453E(jbt0 jbt0Var) {
        jbt0Var.mo106396i(this.f109949G);
    }

    /* JADX INFO: renamed from: G */
    public final int m133454G(y3y0 y3y0Var) {
        return y3y0Var.f195863a.m210615o() ? this.f109973c0 : y3y0Var.f195863a.mo112558n(y3y0Var.f195864b.f92867a, this.f109986m).f76445c;
    }

    /* JADX INFO: renamed from: I */
    public final long m133455I(y3y0 y3y0Var) {
        if (!y3y0Var.f195864b.m117807b()) {
            return ggw0.m126052I(m133456J(y3y0Var));
        }
        y3y0Var.f195863a.mo112558n(y3y0Var.f195864b.f92867a, this.f109986m);
        long j = y3y0Var.f195865c;
        if (j == -9223372036854775807L) {
            long j2 = y3y0Var.f195863a.mo112552e(m133454G(y3y0Var), this.f174642a, 0L).f155825l;
            return ggw0.m126052I(0L);
        }
        return ggw0.m126052I(0L) + ggw0.m126052I(j);
    }

    /* JADX INFO: renamed from: J */
    public final long m133456J(y3y0 y3y0Var) {
        if (y3y0Var.f195863a.m210615o()) {
            return ggw0.m126049F(this.f109975d0);
        }
        long j = y3y0Var.f195880r;
        if (y3y0Var.f195864b.m117807b()) {
            return j;
        }
        m133457L(y3y0Var.f195863a, y3y0Var.f195864b, j);
        return j;
    }

    /* JADX INFO: renamed from: L */
    public final long m133457L(xqt0 xqt0Var, eqy0 eqy0Var, long j) {
        xqt0Var.mo112558n(eqy0Var.f92867a, this.f109986m);
        return j;
    }

    @Nullable
    /* JADX INFO: renamed from: M */
    public final Pair m133458M(xqt0 xqt0Var, int i, long j) {
        if (xqt0Var.m210615o()) {
            this.f109973c0 = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.f109975d0 = j;
            return null;
        }
        if (i == -1 || i >= xqt0Var.mo113618c()) {
            i = xqt0Var.mo112554g(false);
            long j2 = xqt0Var.mo112552e(i, this.f174642a, 0L).f155825l;
            j = ggw0.m126052I(0L);
        }
        return xqt0Var.m210613l(this.f174642a, this.f109986m, i, ggw0.m126049F(j));
    }

    /* JADX INFO: renamed from: N */
    public final y3y0 m133459N(y3y0 y3y0Var, xqt0 xqt0Var, @Nullable Pair pair) {
        f5v0.m119533d(xqt0Var.m210615o() || pair != null);
        xqt0 xqt0Var2 = y3y0Var.f195863a;
        long jM133455I = m133455I(y3y0Var);
        y3y0 y3y0VarM212871f = y3y0Var.m212871f(xqt0Var);
        if (xqt0Var.m210615o()) {
            eqy0 eqy0VarM212865h = y3y0.m212865h();
            long jM126049F = ggw0.m126049F(this.f109975d0);
            y3y0 y3y0VarM212866a = y3y0VarM212871f.m212867b(eqy0VarM212865h, jM126049F, jM126049F, jM126049F, 0L, kty0.f124626d, this.f109970b, zzgaa.zzl()).m212866a(eqy0VarM212865h);
            y3y0VarM212866a.f195878p = y3y0VarM212866a.f195880r;
            return y3y0VarM212866a;
        }
        Object obj = y3y0VarM212871f.f195864b.f92867a;
        int i = ggw0.f102568a;
        boolean zEquals = obj.equals(pair.first);
        eqy0 eqy0Var = !zEquals ? new eqy0(pair.first, -1L) : y3y0VarM212871f.f195864b;
        long jLongValue = ((Long) pair.second).longValue();
        long jM126049F2 = ggw0.m126049F(jM133455I);
        if (!xqt0Var2.m210615o()) {
            xqt0Var2.mo112558n(obj, this.f109986m);
        }
        if (!zEquals || jLongValue < jM126049F2) {
            eqy0 eqy0Var2 = eqy0Var;
            f5v0.m119535f(!eqy0Var2.m117807b());
            y3y0 y3y0VarM212866a2 = y3y0VarM212871f.m212867b(eqy0Var2, jLongValue, jLongValue, jLongValue, 0L, !zEquals ? kty0.f124626d : y3y0VarM212871f.f195870h, !zEquals ? this.f109970b : y3y0VarM212871f.f195871i, !zEquals ? zzgaa.zzl() : y3y0VarM212871f.f195872j).m212866a(eqy0Var2);
            y3y0VarM212866a2.f195878p = jLongValue;
            return y3y0VarM212866a2;
        }
        if (jLongValue != jM126049F2) {
            eqy0 eqy0Var3 = eqy0Var;
            f5v0.m119535f(!eqy0Var3.m117807b());
            long jMax = Math.max(0L, y3y0VarM212871f.f195879q - (jLongValue - jM126049F2));
            long j = y3y0VarM212871f.f195878p;
            if (y3y0VarM212871f.f195873k.equals(y3y0VarM212871f.f195864b)) {
                j = jLongValue + jMax;
            }
            y3y0 y3y0VarM212867b = y3y0VarM212871f.m212867b(eqy0Var3, jLongValue, jLongValue, jLongValue, jMax, y3y0VarM212871f.f195870h, y3y0VarM212871f.f195871i, y3y0VarM212871f.f195872j);
            y3y0VarM212867b.f195878p = j;
            return y3y0VarM212867b;
        }
        int iMo112550a = xqt0Var.mo112550a(y3y0VarM212871f.f195873k.f92867a);
        if (iMo112550a != -1 && xqt0Var.mo112551d(iMo112550a, this.f109986m, false).f76445c == xqt0Var.mo112558n(eqy0Var.f92867a, this.f109986m).f76445c) {
            return y3y0VarM212871f;
        }
        xqt0Var.mo112558n(eqy0Var.f92867a, this.f109986m);
        boolean zM117807b = eqy0Var.m117807b();
        bnt0 bnt0Var = this.f109986m;
        long jM102867h = zM117807b ? bnt0Var.m102867h(eqy0Var.f92868b, eqy0Var.f92869c) : bnt0Var.f76446d;
        eqy0 eqy0Var4 = eqy0Var;
        y3y0 y3y0VarM212866a3 = y3y0VarM212871f.m212867b(eqy0Var4, y3y0VarM212871f.f195880r, y3y0VarM212871f.f195880r, y3y0VarM212871f.f195866d, jM102867h - y3y0VarM212871f.f195880r, y3y0VarM212871f.f195870h, y3y0VarM212871f.f195871i, y3y0VarM212871f.f195872j).m212866a(eqy0Var4);
        y3y0VarM212866a3.f195878p = jM102867h;
        return y3y0VarM212866a3;
    }

    /* JADX INFO: renamed from: O */
    public final d5y0 m133460O(a5y0 a5y0Var) {
        int iM133454G = m133454G(this.f109971b0);
        xqt0 xqt0Var = this.f109971b0.f195863a;
        if (iM133454G == -1) {
            iM133454G = 0;
        }
        g6v0 g6v0Var = this.f109993t;
        C2111b7 c2111b7 = this.f109983j;
        return new d5y0(c2111b7, a5y0Var, xqt0Var, iM133454G, g6v0Var, c2111b7.m12571S());
    }

    /* JADX INFO: renamed from: P */
    public final void m133461P(final int i, final int i2) {
        if (i == this.f109957O.m202083b() && i2 == this.f109957O.m202082a()) {
            return;
        }
        this.f109957O = new w7w0(i, i2);
        asv0 asv0Var = this.f109984k;
        asv0Var.m98627d(24, new gnv0() { // from class: l.bvx0
            @Override // p149l.gnv0
            public final void zza(Object obj) {
                int i3 = hxx0.f109942g0;
                ((jbt0) obj).mo106405r(i, i2);
            }
        });
        asv0Var.m98626c();
        m133462Q(2, 14, new w7w0(i, i2));
    }

    /* JADX INFO: renamed from: Q */
    public final void m133462Q(int i, int i2, @Nullable Object obj) {
        p5y0[] p5y0VarArr = this.f109980g;
        int length = p5y0VarArr.length;
        for (int i3 = 0; i3 < 2; i3++) {
            p5y0 p5y0Var = p5y0VarArr[i3];
            if (p5y0Var.mo146606c() == i) {
                d5y0 d5y0VarM133460O = m133460O(p5y0Var);
                d5y0VarM133460O.m110100f(i2);
                d5y0VarM133460O.m110099e(obj);
                d5y0VarM133460O.m110098d();
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m133463R() {
        m133462Q(1, 2, Float.valueOf(this.f109962T * this.f109997x.m127197a()));
    }

    /* JADX INFO: renamed from: S */
    public final void m133464S(@Nullable Object obj) {
        ArrayList arrayList = new ArrayList();
        p5y0[] p5y0VarArr = this.f109980g;
        int length = p5y0VarArr.length;
        boolean z = false;
        for (int i = 0; i < 2; i++) {
            p5y0 p5y0Var = p5y0VarArr[i];
            if (p5y0Var.mo146606c() == 2) {
                d5y0 d5y0VarM133460O = m133460O(p5y0Var);
                d5y0VarM133460O.m110100f(1);
                d5y0VarM133460O.m110099e(obj);
                d5y0VarM133460O.m110098d();
                arrayList.add(d5y0VarM133460O);
            }
        }
        Object obj2 = this.f109954L;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((d5y0) it.next()).m110103i(this.f109943A);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z = true;
            }
            Object obj3 = this.f109954L;
            Surface surface = this.f109955M;
            if (obj3 == surface) {
                surface.release();
                this.f109955M = null;
            }
        }
        this.f109954L = obj;
        if (z) {
            m133465T(zziz.zzd(new zzla(3), 1003));
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m133465T(@Nullable zziz zzizVar) {
        y3y0 y3y0Var = this.f109971b0;
        y3y0 y3y0VarM212866a = y3y0Var.m212866a(y3y0Var.f195864b);
        y3y0VarM212866a.f195878p = y3y0VarM212866a.f195880r;
        y3y0VarM212866a.f195879q = 0L;
        y3y0 y3y0VarM212870e = y3y0VarM212866a.m212870e(1);
        if (zzizVar != null) {
            y3y0VarM212870e = y3y0VarM212870e.m212869d(zzizVar);
        }
        this.f109944B++;
        this.f109983j.m12577a0();
        m133467V(y3y0VarM212870e, 0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX INFO: renamed from: U */
    public final void m133466U(boolean z, int i, int i2) {
        int i3 = 0;
        boolean z2 = z && i != -1;
        if (z2 && i != 1) {
            i3 = 1;
        }
        y3y0 y3y0Var = this.f109971b0;
        if (y3y0Var.f195874l == z2 && y3y0Var.f195875m == i3) {
            return;
        }
        this.f109944B++;
        y3y0 y3y0VarM212868c = y3y0Var.m212868c(z2, i3);
        this.f109983j.m12575Z(z2, i3);
        m133467V(y3y0VarM212868c, 0, i2, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:101:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:103:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:105:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:106:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:109:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:111:0x0304  */
    /* JADX WARN: Code duplicated, block: B:114:0x0314  */
    /* JADX WARN: Code duplicated, block: B:116:0x0328  */
    /* JADX WARN: Code duplicated, block: B:118:0x0338  */
    /* JADX WARN: Code duplicated, block: B:121:0x0348  */
    /* JADX WARN: Code duplicated, block: B:124:0x0356  */
    /* JADX WARN: Code duplicated, block: B:127:0x0363  */
    /* JADX WARN: Code duplicated, block: B:130:0x0376  */
    /* JADX WARN: Code duplicated, block: B:133:0x038b  */
    /* JADX WARN: Code duplicated, block: B:136:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:139:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:141:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:143:0x03da  */
    /* JADX WARN: Code duplicated, block: B:146:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:147:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:149:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:150:0x0401  */
    /* JADX WARN: Code duplicated, block: B:153:0x040d  */
    /* JADX WARN: Code duplicated, block: B:154:0x040f  */
    /* JADX WARN: Code duplicated, block: B:156:0x041f  */
    /* JADX WARN: Code duplicated, block: B:159:0x042a  */
    /* JADX WARN: Code duplicated, block: B:161:0x043e  */
    /* JADX WARN: Code duplicated, block: B:163:0x0442  */
    /* JADX WARN: Code duplicated, block: B:166:0x0451  */
    /* JADX WARN: Code duplicated, block: B:169:0x0461  */
    /* JADX WARN: Code duplicated, block: B:172:0x0479 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:174:0x047d  */
    /* JADX WARN: Code duplicated, block: B:177:0x0483 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:179:0x0487  */
    /* JADX WARN: Code duplicated, block: B:182:0x048d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:186:0x0494  */
    /* JADX WARN: Code duplicated, block: B:192:0x04a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:194:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:197:0x04ac A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:201:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:206:0x04c4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:209:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:212:0x04d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:214:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:217:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:41:0x010e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0114  */
    /* JADX WARN: Code duplicated, block: B:46:0x011f  */
    /* JADX WARN: Code duplicated, block: B:49:0x012e  */
    /* JADX WARN: Code duplicated, block: B:52:0x013a A[LOOP:1: B:50:0x0134->B:52:0x013a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x015a  */
    /* JADX WARN: Code duplicated, block: B:58:0x015d  */
    /* JADX WARN: Code duplicated, block: B:61:0x0188  */
    /* JADX WARN: Code duplicated, block: B:62:0x018a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0191  */
    /* JADX WARN: Code duplicated, block: B:66:0x0193  */
    /* JADX WARN: Code duplicated, block: B:69:0x0198  */
    /* JADX WARN: Code duplicated, block: B:72:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:73:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:79:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:80:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:83:0x0208  */
    /* JADX WARN: Code duplicated, block: B:85:0x0210  */
    /* JADX WARN: Code duplicated, block: B:86:0x021d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0222  */
    /* JADX WARN: Code duplicated, block: B:89:0x0228 A[PHI: r6
      0x0228: PHI (r6v14 long) = (r6v13 long), (r6v20 long), (r6v21 long) binds: [B:92:0x0233, B:90:0x022a, B:88:0x0222] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x022a  */
    /* JADX WARN: Code duplicated, block: B:91:0x022d  */
    /* JADX WARN: Code duplicated, block: B:93:0x0235  */
    /* JADX WARN: Code duplicated, block: B:96:0x0262  */
    /* JADX WARN: Code duplicated, block: B:97:0x0292  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v6, types: [l.xqt0] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX INFO: renamed from: V */
    public final void m133467V(final y3y0 y3y0Var, final int i, final int i2, boolean z, int i3, long j, int i4, boolean z2) {
        int i5;
        int i6;
        boolean z3;
        Pair pair;
        boolean z4;
        boolean z5;
        int i7;
        boolean zBooleanValue;
        final int iIntValue;
        final nis0 nis0Var;
        xqt0 xqt0VarZzn;
        lqs0 lqs0VarM194516M;
        boolean zEquals;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        owy0 owy0Var;
        owy0 owy0Var2;
        iat0 iat0Var;
        ift0 ift0Var;
        boolean zMo124675g;
        u4y0 u4y0Var;
        xqt0 xqt0VarZzn2;
        ift0 ift0Var2;
        boolean z10;
        xqt0 xqt0VarZzn3;
        ?? r13;
        int iMo112557k;
        int i8;
        boolean z11;
        ?? Zzn;
        int iZzd;
        ?? r5;
        xqt0 xqt0VarZzn4;
        boolean z12;
        long j2;
        xqt0 xqt0VarZzn5;
        boolean z13;
        boolean zM210615o;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        iat0 iat0VarM192168e;
        bnt0 bnt0Var;
        int i9;
        Object obj;
        nis0 nis0Var2;
        Object obj2;
        int i10;
        eqy0 eqy0Var;
        boolean zM117807b;
        long jM133437K;
        long jM133437K2;
        int iZzd2;
        Object obj3;
        nis0 nis0Var3;
        Object obj4;
        int iMo112550a;
        long jM126052I;
        long jM126052I2;
        boolean zM117807b2;
        eqy0 eqy0Var2;
        uns0 uns0VarM151091a;
        List list;
        int i11;
        zzby zzbyVar;
        final int i12 = i3;
        y3y0 y3y0Var2 = this.f109971b0;
        this.f109971b0 = y3y0Var;
        boolean zEquals2 = y3y0Var2.f195863a.equals(y3y0Var.f195863a);
        xqt0 xqt0Var = y3y0Var2.f195863a;
        xqt0 xqt0Var2 = y3y0Var.f195863a;
        int i13 = 0;
        if (!xqt0Var2.m210615o() || !xqt0Var.m210615o()) {
            i5 = 3;
            if (xqt0Var2.m210615o() != xqt0Var.m210615o()) {
                pair = new Pair(Boolean.TRUE, 3);
            } else if (xqt0Var.mo112552e(xqt0Var.mo112558n(y3y0Var2.f195864b.f92867a, this.f109986m).f76445c, this.f174642a, 0L).f155814a.equals(xqt0Var2.mo112552e(xqt0Var2.mo112558n(y3y0Var.f195864b.f92867a, this.f109986m).f76445c, this.f174642a, 0L).f155814a)) {
                if (!z) {
                    i6 = i12;
                    z3 = false;
                } else if (i12 != 0) {
                    i6 = i12;
                    z3 = true;
                } else if (y3y0Var2.f195864b.f92870d < y3y0Var.f195864b.f92870d) {
                    pair = new Pair(Boolean.TRUE, 0);
                    z4 = true;
                    i12 = 0;
                } else {
                    z3 = true;
                    i6 = 0;
                }
                pair = new Pair(Boolean.FALSE, -1);
                int i14 = i6;
                z4 = z3;
                i12 = i14;
            } else {
                if (z) {
                    if (i12 == 0) {
                        i7 = 1;
                        z4 = true;
                        i12 = 0;
                    } else {
                        z5 = true;
                    }
                    pair = new Pair(Boolean.TRUE, Integer.valueOf(i7));
                } else {
                    z5 = false;
                }
                z4 = z5;
                if (z5 && i12 == 1) {
                    i7 = 2;
                } else if (zEquals2) {
                    ohg0.m164364a();
                    return;
                } else {
                    z4 = z5;
                    i7 = 3;
                }
                pair = new Pair(Boolean.TRUE, Integer.valueOf(i7));
            }
            zBooleanValue = ((Boolean) pair.first).booleanValue();
            iIntValue = ((Integer) pair.second).intValue();
            if (zBooleanValue) {
                if (y3y0Var.f195863a.m210615o()) {
                    nis0Var = null;
                } else {
                    nis0Var = y3y0Var.f195863a.mo112552e(y3y0Var.f195863a.mo112558n(y3y0Var.f195864b.f92867a, this.f109986m).f76445c, this.f174642a, 0L).f155816c;
                }
                this.f109969a0 = lqs0.f129410y;
            } else {
                nis0Var = null;
            }
            if (!y3y0Var2.f195872j.equals(y3y0Var.f195872j)) {
                uns0VarM151091a = this.f109969a0.m151091a();
                list = y3y0Var.f195872j;
                i11 = 0;
                while (i11 < list.size()) {
                    zzbyVar = (zzby) list.get(i11);
                    while (i13 < zzbyVar.m13551a()) {
                        zzbyVar.m13552b(i13).mo13538Z(uns0VarM151091a);
                        i13++;
                    }
                    i11++;
                    i13 = 0;
                }
                this.f109969a0 = uns0VarM151091a.m194516M();
            }
            xqt0VarZzn = zzn();
            if (xqt0VarZzn.m210615o()) {
                lqs0VarM194516M = this.f109969a0;
            } else {
                nis0 nis0Var4 = xqt0VarZzn.mo112552e(zzd(), this.f174642a, 0L).f155816c;
                uns0 uns0VarM151091a2 = this.f109969a0.m151091a();
                uns0VarM151091a2.m194518t(nis0Var4.f139155e);
                lqs0VarM194516M = uns0VarM151091a2.m194516M();
            }
            zEquals = lqs0VarM194516M.equals(this.f109950H);
            this.f109950H = lqs0VarM194516M;
            if (y3y0Var2.f195874l != y3y0Var.f195874l) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (y3y0Var2.f195867e != y3y0Var.f195867e) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (z7 || z6) {
                m133468W();
            }
            if (y3y0Var2.f195869g != y3y0Var.f195869g) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (!zEquals2) {
                this.f109984k.m98627d(0, new gnv0() { // from class: l.trx0
                    @Override // p149l.gnv0
                    public final void zza(Object obj5) {
                        int i15 = hxx0.f109942g0;
                        ((jbt0) obj5).mo106368K(y3y0Var.f195863a, i);
                    }
                });
            }
            if (z4) {
                bnt0Var = new bnt0();
                if (y3y0Var2.f195863a.m210615o()) {
                    i9 = i4;
                    obj = null;
                    nis0Var2 = null;
                    obj2 = null;
                    i10 = -1;
                } else {
                    Object obj5 = y3y0Var2.f195864b.f92867a;
                    y3y0Var2.f195863a.mo112558n(obj5, bnt0Var);
                    int i15 = bnt0Var.f76445c;
                    int iMo112550a2 = y3y0Var2.f195863a.mo112550a(obj5);
                    obj = y3y0Var2.f195863a.mo112552e(i15, this.f174642a, 0L).f155814a;
                    nis0Var2 = this.f174642a.f155816c;
                    obj2 = obj5;
                    i9 = i15;
                    i10 = iMo112550a2;
                }
                eqy0Var = y3y0Var2.f195864b;
                if (i12 == 0) {
                    zM117807b2 = eqy0Var.m117807b();
                    eqy0Var2 = y3y0Var2.f195864b;
                    if (zM117807b2) {
                        jM133437K = bnt0Var.m102867h(eqy0Var2.f92868b, eqy0Var2.f92869c);
                        jM133437K2 = m133437K(y3y0Var2);
                    } else {
                        if (eqy0Var2.f92871e != -1) {
                            jM133437K = m133437K(this.f109971b0);
                        } else {
                            jM133437K = bnt0Var.f76446d;
                        }
                        jM133437K2 = jM133437K;
                    }
                } else {
                    zM117807b = eqy0Var.m117807b();
                    jM133437K = y3y0Var2.f195880r;
                    if (zM117807b) {
                        jM133437K2 = m133437K(y3y0Var2);
                    } else {
                        jM133437K2 = jM133437K;
                    }
                }
                int i16 = ggw0.f102568a;
                eqy0 eqy0Var3 = y3y0Var2.f195864b;
                final aet0 aet0Var = new aet0(obj, i9, nis0Var2, obj2, i10, ggw0.m126052I(jM133437K), ggw0.m126052I(jM133437K2), eqy0Var3.f92868b, eqy0Var3.f92869c);
                iZzd2 = zzd();
                if (this.f109971b0.f195863a.m210615o()) {
                    obj3 = null;
                    nis0Var3 = null;
                    obj4 = null;
                    iMo112550a = -1;
                } else {
                    y3y0 y3y0Var3 = this.f109971b0;
                    Object obj6 = y3y0Var3.f195864b.f92867a;
                    y3y0Var3.f195863a.mo112558n(obj6, this.f109986m);
                    iMo112550a = this.f109971b0.f195863a.mo112550a(obj6);
                    obj4 = obj6;
                    obj3 = this.f109971b0.f195863a.mo112552e(iZzd2, this.f174642a, 0L).f155814a;
                    nis0Var3 = this.f174642a.f155816c;
                }
                jM126052I = ggw0.m126052I(j);
                if (this.f109971b0.f195864b.m117807b()) {
                    jM126052I2 = ggw0.m126052I(m133437K(this.f109971b0));
                } else {
                    jM126052I2 = jM126052I;
                }
                eqy0 eqy0Var4 = this.f109971b0.f195864b;
                final aet0 aet0Var2 = new aet0(obj3, iZzd2, nis0Var3, obj4, iMo112550a, jM126052I, jM126052I2, eqy0Var4.f92868b, eqy0Var4.f92869c);
                this.f109984k.m98627d(11, new gnv0() { // from class: l.qsx0
                    @Override // p149l.gnv0
                    public final void zza(Object obj7) {
                        int i17 = hxx0.f109942g0;
                        ((jbt0) obj7).mo106359B(aet0Var, aet0Var2, i12);
                    }
                });
            } else {
                z6 = z6;
                zEquals = zEquals;
                z7 = z7;
            }
            if (zBooleanValue) {
                z9 = true;
                this.f109984k.m98627d(1, new gnv0() { // from class: l.xsx0
                    @Override // p149l.gnv0
                    public final void zza(Object obj7) {
                        int i17 = hxx0.f109942g0;
                        ((jbt0) obj7).mo106398k(nis0Var, iIntValue);
                    }
                });
            } else {
                z9 = true;
            }
            if (y3y0Var2.f195868f != y3y0Var.f195868f) {
                this.f109984k.m98627d(10, new gnv0() { // from class: l.btx0
                    @Override // p149l.gnv0
                    public final void zza(Object obj7) {
                        int i17 = hxx0.f109942g0;
                        ((jbt0) obj7).mo106408u(y3y0Var.f195868f);
                    }
                });
                if (y3y0Var.f195868f != null) {
                    this.f109984k.m98627d(10, new gnv0() { // from class: l.ftx0
                        @Override // p149l.gnv0
                        public final void zza(Object obj7) {
                            int i17 = hxx0.f109942g0;
                            ((jbt0) obj7).mo106400m(y3y0Var.f195868f);
                        }
                    });
                }
            }
            owy0Var = y3y0Var2.f195871i;
            owy0Var2 = y3y0Var.f195871i;
            if (owy0Var != owy0Var2) {
                this.f109981h.mo147669f(owy0Var2.f146097e);
                this.f109984k.m98627d(2, new gnv0() { // from class: l.ktx0
                    @Override // p149l.gnv0
                    public final void zza(Object obj7) {
                        int i17 = hxx0.f109942g0;
                        ((jbt0) obj7).mo106412y(y3y0Var.f195871i.f146096d);
                    }
                });
            }
            if (!zEquals) {
                final lqs0 lqs0Var = this.f109950H;
                this.f109984k.m98627d(14, new gnv0() { // from class: l.ptx0
                    @Override // p149l.gnv0
                    public final void zza(Object obj7) {
                        int i17 = hxx0.f109942g0;
                        ((jbt0) obj7).mo106372O(lqs0Var);
                    }
                });
            }
            if (z8) {
                this.f109984k.m98627d(i5, new gnv0() { // from class: l.utx0
                    @Override // p149l.gnv0
                    public final void zza(Object obj7) {
                        int i17 = hxx0.f109942g0;
                        ((jbt0) obj7).zzb(y3y0Var.f195869g);
                    }
                });
            }
            if (z7 || z6) {
                this.f109984k.m98627d(-1, new gnv0() { // from class: l.ytx0
                    @Override // p149l.gnv0
                    public final void zza(Object obj7) {
                        int i17 = hxx0.f109942g0;
                        y3y0 y3y0Var4 = y3y0Var;
                        ((jbt0) obj7).mo106374Q(y3y0Var4.f195874l, y3y0Var4.f195867e);
                    }
                });
            }
            if (z7) {
                this.f109984k.m98627d(4, new gnv0() { // from class: l.xux0
                    @Override // p149l.gnv0
                    public final void zza(Object obj7) {
                        int i17 = hxx0.f109942g0;
                        ((jbt0) obj7).zzh(y3y0Var.f195867e);
                    }
                });
            }
            if (z6) {
                this.f109984k.m98627d(5, new gnv0() { // from class: l.xrx0
                    @Override // p149l.gnv0
                    public final void zza(Object obj7) {
                        int i17 = hxx0.f109942g0;
                        ((jbt0) obj7).mo106363F(y3y0Var.f195874l, i2);
                    }
                });
            }
            if (y3y0Var2.f195875m != y3y0Var.f195875m) {
                this.f109984k.m98627d(6, new gnv0() { // from class: l.csx0
                    @Override // p149l.gnv0
                    public final void zza(Object obj7) {
                        int i17 = hxx0.f109942g0;
                        ((jbt0) obj7).mo106401n(y3y0Var.f195875m);
                    }
                });
            }
            if (y3y0Var2.m212872i() != y3y0Var.m212872i()) {
                this.f109984k.m98627d(7, new gnv0() { // from class: l.gsx0
                    @Override // p149l.gnv0
                    public final void zza(Object obj7) {
                        int i17 = hxx0.f109942g0;
                        ((jbt0) obj7).mo106383a(y3y0Var.m212872i());
                    }
                });
            }
            if (!y3y0Var2.f195876n.equals(y3y0Var.f195876n)) {
                this.f109984k.m98627d(12, new gnv0() { // from class: l.lsx0
                    @Override // p149l.gnv0
                    public final void zza(Object obj7) {
                        int i17 = hxx0.f109942g0;
                        ((jbt0) obj7).mo106394g(y3y0Var.f195876n);
                    }
                });
            }
            iat0Var = this.f109949G;
            ift0Var = this.f109978f;
            iat0 iat0Var2 = this.f109972c;
            int i17 = ggw0.f102568a;
            zMo124675g = ift0Var.mo124675g();
            u4y0Var = (u4y0) ift0Var;
            xqt0VarZzn2 = u4y0Var.zzn();
            if (!xqt0VarZzn2.m210615o()) {
                ift0Var2 = ift0Var;
                z10 = xqt0VarZzn2.mo112552e(u4y0Var.zzd(), u4y0Var.f174642a, 0L).f155820g ? z9 : false;
                xqt0VarZzn3 = u4y0Var.zzn();
                if (xqt0VarZzn3.m210615o()) {
                    i8 = -1;
                    r13 = 0;
                    z11 = false;
                } else {
                    int iZzd3 = u4y0Var.zzd();
                    u4y0Var.zzh();
                    u4y0Var.mo124679k();
                    r13 = 0;
                    r13 = 0;
                    iMo112557k = xqt0VarZzn3.mo112557k(iZzd3, 0, false);
                    i8 = -1;
                    if (iMo112557k != -1) {
                        z11 = z9;
                    } else {
                        z11 = false;
                    }
                }
                Zzn = u4y0Var.zzn();
                if (Zzn.m210615o()) {
                    r5 = r13;
                } else {
                    iZzd = u4y0Var.zzd();
                    u4y0Var.zzh();
                    u4y0Var.mo124679k();
                    if (Zzn.mo112556j(iZzd, r13, r13) != i8) {
                        r5 = z9;
                    } else {
                        r5 = r13;
                    }
                }
                xqt0VarZzn4 = u4y0Var.zzn();
                if (!xqt0VarZzn4.m210615o()) {
                    z12 = zMo124675g;
                    j2 = 0;
                    boolean z20 = xqt0VarZzn4.mo112552e(u4y0Var.zzd(), u4y0Var.f174642a, 0L).m175866b() ? z9 : false;
                    xqt0VarZzn5 = u4y0Var.zzn();
                    if (xqt0VarZzn5.m210615o() && xqt0VarZzn5.mo112552e(u4y0Var.zzd(), u4y0Var.f174642a, j2).f155821h) {
                        z13 = z9;
                    } else {
                        z13 = false;
                    }
                    zM210615o = ift0Var2.zzn().m210615o();
                    u7t0 u7t0Var = new u7t0();
                    u7t0Var.m192165b(iat0Var2);
                    boolean z21 = !z12;
                    u7t0Var.m192167d(4, z21);
                    if (z10 || z12) {
                        z14 = false;
                    } else {
                        z14 = z9;
                    }
                    u7t0Var.m192167d(5, z14);
                    if (z11 || z12) {
                        z15 = false;
                    } else {
                        z15 = z9;
                    }
                    u7t0Var.m192167d(6, z15);
                    if (!zM210615o || (!(z11 || !z20 || z10) || z12)) {
                        z16 = false;
                    } else {
                        z16 = z9;
                    }
                    u7t0Var.m192167d(7, z16);
                    if (r5 != 0 || z12) {
                        z17 = false;
                    } else {
                        z17 = z9;
                    }
                    u7t0Var.m192167d(8, z17);
                    if (!zM210615o || ((r5 == 0 && !(z20 && z13)) || z12)) {
                        z18 = false;
                    } else {
                        z18 = z9;
                    }
                    u7t0Var.m192167d(9, z18);
                    u7t0Var.m192167d(10, z21);
                    if (z10 || z12) {
                        z19 = false;
                    } else {
                        z19 = z9;
                    }
                    u7t0Var.m192167d(11, z19);
                    if (z10 || z12) {
                        z9 = false;
                    }
                    u7t0Var.m192167d(12, z9);
                    iat0VarM192168e = u7t0Var.m192168e();
                    this.f109949G = iat0VarM192168e;
                    if (!iat0VarM192168e.equals(iat0Var)) {
                        this.f109984k.m98627d(13, new gnv0() { // from class: l.orx0
                            @Override // p149l.gnv0
                            public final void zza(Object obj7) {
                                this.f145363a.m133453E((jbt0) obj7);
                            }
                        });
                    }
                    this.f109984k.m98626c();
                }
                z12 = zMo124675g;
                j2 = 0;
                xqt0VarZzn5 = u4y0Var.zzn();
                if (xqt0VarZzn5.m210615o()) {
                    z13 = false;
                } else {
                    z13 = false;
                }
                zM210615o = ift0Var2.zzn().m210615o();
                u7t0 u7t0Var2 = new u7t0();
                u7t0Var2.m192165b(iat0Var2);
                boolean z22 = !z12;
                u7t0Var2.m192167d(4, z22);
                if (z10) {
                    z14 = false;
                } else {
                    z14 = false;
                }
                u7t0Var2.m192167d(5, z14);
                if (z11) {
                    z15 = false;
                } else {
                    z15 = false;
                }
                u7t0Var2.m192167d(6, z15);
                if (zM210615o) {
                    z16 = false;
                } else {
                    z16 = false;
                }
                u7t0Var2.m192167d(7, z16);
                if (r5 != 0) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                u7t0Var2.m192167d(8, z17);
                if (zM210615o) {
                    z18 = false;
                } else {
                    z18 = false;
                }
                u7t0Var2.m192167d(9, z18);
                u7t0Var2.m192167d(10, z22);
                if (z10) {
                    z19 = false;
                } else {
                    z19 = false;
                }
                u7t0Var2.m192167d(11, z19);
                if (z10) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                u7t0Var2.m192167d(12, z9);
                iat0VarM192168e = u7t0Var2.m192168e();
                this.f109949G = iat0VarM192168e;
                if (!iat0VarM192168e.equals(iat0Var)) {
                    this.f109984k.m98627d(13, new gnv0() { // from class: l.orx0
                        @Override // p149l.gnv0
                        public final void zza(Object obj7) {
                            this.f145363a.m133453E((jbt0) obj7);
                        }
                    });
                }
                this.f109984k.m98626c();
            }
            ift0Var2 = ift0Var;
            xqt0VarZzn3 = u4y0Var.zzn();
            if (xqt0VarZzn3.m210615o()) {
                i8 = -1;
                r13 = 0;
                z11 = false;
            } else {
                int iZzd4 = u4y0Var.zzd();
                u4y0Var.zzh();
                u4y0Var.mo124679k();
                r13 = 0;
                r13 = 0;
                iMo112557k = xqt0VarZzn3.mo112557k(iZzd4, 0, false);
                i8 = -1;
                if (iMo112557k != -1) {
                    z11 = z9;
                } else {
                    z11 = false;
                }
            }
            Zzn = u4y0Var.zzn();
            if (Zzn.m210615o()) {
                r5 = r13;
            } else {
                iZzd = u4y0Var.zzd();
                u4y0Var.zzh();
                u4y0Var.mo124679k();
                if (Zzn.mo112556j(iZzd, r13, r13) != i8) {
                    r5 = z9;
                } else {
                    r5 = r13;
                }
            }
            xqt0VarZzn4 = u4y0Var.zzn();
            if (!xqt0VarZzn4.m210615o()) {
                z12 = zMo124675g;
                j2 = 0;
                if (xqt0VarZzn4.mo112552e(u4y0Var.zzd(), u4y0Var.f174642a, 0L).m175866b()) {
                }
                xqt0VarZzn5 = u4y0Var.zzn();
                if (xqt0VarZzn5.m210615o()) {
                    z13 = false;
                } else {
                    z13 = false;
                }
                zM210615o = ift0Var2.zzn().m210615o();
                u7t0 u7t0Var3 = new u7t0();
                u7t0Var3.m192165b(iat0Var2);
                boolean z23 = !z12;
                u7t0Var3.m192167d(4, z23);
                if (z10) {
                    z14 = false;
                } else {
                    z14 = false;
                }
                u7t0Var3.m192167d(5, z14);
                if (z11) {
                    z15 = false;
                } else {
                    z15 = false;
                }
                u7t0Var3.m192167d(6, z15);
                if (zM210615o) {
                    z16 = false;
                } else {
                    z16 = false;
                }
                u7t0Var3.m192167d(7, z16);
                if (r5 != 0) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                u7t0Var3.m192167d(8, z17);
                if (zM210615o) {
                    z18 = false;
                } else {
                    z18 = false;
                }
                u7t0Var3.m192167d(9, z18);
                u7t0Var3.m192167d(10, z23);
                if (z10) {
                    z19 = false;
                } else {
                    z19 = false;
                }
                u7t0Var3.m192167d(11, z19);
                if (z10) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                u7t0Var3.m192167d(12, z9);
                iat0VarM192168e = u7t0Var3.m192168e();
                this.f109949G = iat0VarM192168e;
                if (!iat0VarM192168e.equals(iat0Var)) {
                    this.f109984k.m98627d(13, new gnv0() { // from class: l.orx0
                        @Override // p149l.gnv0
                        public final void zza(Object obj7) {
                            this.f145363a.m133453E((jbt0) obj7);
                        }
                    });
                }
                this.f109984k.m98626c();
            }
            z12 = zMo124675g;
            j2 = 0;
            xqt0VarZzn5 = u4y0Var.zzn();
            if (xqt0VarZzn5.m210615o()) {
                z13 = false;
            } else {
                z13 = false;
            }
            zM210615o = ift0Var2.zzn().m210615o();
            u7t0 u7t0Var4 = new u7t0();
            u7t0Var4.m192165b(iat0Var2);
            boolean z24 = !z12;
            u7t0Var4.m192167d(4, z24);
            if (z10) {
                z14 = false;
            } else {
                z14 = false;
            }
            u7t0Var4.m192167d(5, z14);
            if (z11) {
                z15 = false;
            } else {
                z15 = false;
            }
            u7t0Var4.m192167d(6, z15);
            if (zM210615o) {
                z16 = false;
            } else {
                z16 = false;
            }
            u7t0Var4.m192167d(7, z16);
            if (r5 != 0) {
                z17 = false;
            } else {
                z17 = false;
            }
            u7t0Var4.m192167d(8, z17);
            if (zM210615o) {
                z18 = false;
            } else {
                z18 = false;
            }
            u7t0Var4.m192167d(9, z18);
            u7t0Var4.m192167d(10, z24);
            if (z10) {
                z19 = false;
            } else {
                z19 = false;
            }
            u7t0Var4.m192167d(11, z19);
            if (z10) {
                z9 = false;
            } else {
                z9 = false;
            }
            u7t0Var4.m192167d(12, z9);
            iat0VarM192168e = u7t0Var4.m192168e();
            this.f109949G = iat0VarM192168e;
            if (!iat0VarM192168e.equals(iat0Var)) {
                this.f109984k.m98627d(13, new gnv0() { // from class: l.orx0
                    @Override // p149l.gnv0
                    public final void zza(Object obj7) {
                        this.f145363a.m133453E((jbt0) obj7);
                    }
                });
            }
            this.f109984k.m98626c();
        }
        pair = new Pair(Boolean.FALSE, -1);
        i5 = 3;
        z4 = z;
        zBooleanValue = ((Boolean) pair.first).booleanValue();
        iIntValue = ((Integer) pair.second).intValue();
        if (zBooleanValue) {
            if (y3y0Var.f195863a.m210615o()) {
                nis0Var = y3y0Var.f195863a.mo112552e(y3y0Var.f195863a.mo112558n(y3y0Var.f195864b.f92867a, this.f109986m).f76445c, this.f174642a, 0L).f155816c;
            } else {
                nis0Var = null;
            }
            this.f109969a0 = lqs0.f129410y;
        } else {
            nis0Var = null;
        }
        if (!y3y0Var2.f195872j.equals(y3y0Var.f195872j)) {
            uns0VarM151091a = this.f109969a0.m151091a();
            list = y3y0Var.f195872j;
            i11 = 0;
            while (i11 < list.size()) {
                zzbyVar = (zzby) list.get(i11);
                while (i13 < zzbyVar.m13551a()) {
                    zzbyVar.m13552b(i13).mo13538Z(uns0VarM151091a);
                    i13++;
                }
                i11++;
                i13 = 0;
            }
            this.f109969a0 = uns0VarM151091a.m194516M();
        }
        xqt0VarZzn = zzn();
        if (xqt0VarZzn.m210615o()) {
            lqs0VarM194516M = this.f109969a0;
        } else {
            nis0 nis0Var5 = xqt0VarZzn.mo112552e(zzd(), this.f174642a, 0L).f155816c;
            uns0 uns0VarM151091a3 = this.f109969a0.m151091a();
            uns0VarM151091a3.m194518t(nis0Var5.f139155e);
            lqs0VarM194516M = uns0VarM151091a3.m194516M();
        }
        zEquals = lqs0VarM194516M.equals(this.f109950H);
        this.f109950H = lqs0VarM194516M;
        if (y3y0Var2.f195874l != y3y0Var.f195874l) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (y3y0Var2.f195867e != y3y0Var.f195867e) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7) {
            m133468W();
        } else {
            m133468W();
        }
        if (y3y0Var2.f195869g != y3y0Var.f195869g) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (!zEquals2) {
            this.f109984k.m98627d(0, new gnv0() { // from class: l.trx0
                @Override // p149l.gnv0
                public final void zza(Object obj7) {
                    int i18 = hxx0.f109942g0;
                    ((jbt0) obj7).mo106368K(y3y0Var.f195863a, i);
                }
            });
        }
        if (z4) {
            bnt0Var = new bnt0();
            if (y3y0Var2.f195863a.m210615o()) {
                Object obj7 = y3y0Var2.f195864b.f92867a;
                y3y0Var2.f195863a.mo112558n(obj7, bnt0Var);
                int i18 = bnt0Var.f76445c;
                int iMo112550a3 = y3y0Var2.f195863a.mo112550a(obj7);
                obj = y3y0Var2.f195863a.mo112552e(i18, this.f174642a, 0L).f155814a;
                nis0Var2 = this.f174642a.f155816c;
                obj2 = obj7;
                i9 = i18;
                i10 = iMo112550a3;
            } else {
                i9 = i4;
                obj = null;
                nis0Var2 = null;
                obj2 = null;
                i10 = -1;
            }
            eqy0Var = y3y0Var2.f195864b;
            if (i12 == 0) {
                zM117807b2 = eqy0Var.m117807b();
                eqy0Var2 = y3y0Var2.f195864b;
                if (zM117807b2) {
                    jM133437K = bnt0Var.m102867h(eqy0Var2.f92868b, eqy0Var2.f92869c);
                    jM133437K2 = m133437K(y3y0Var2);
                } else {
                    if (eqy0Var2.f92871e != -1) {
                        jM133437K = m133437K(this.f109971b0);
                    } else {
                        jM133437K = bnt0Var.f76446d;
                    }
                    jM133437K2 = jM133437K;
                }
            } else {
                zM117807b = eqy0Var.m117807b();
                jM133437K = y3y0Var2.f195880r;
                if (zM117807b) {
                    jM133437K2 = m133437K(y3y0Var2);
                } else {
                    jM133437K2 = jM133437K;
                }
            }
            int i19 = ggw0.f102568a;
            eqy0 eqy0Var5 = y3y0Var2.f195864b;
            final aet0 aet0Var3 = new aet0(obj, i9, nis0Var2, obj2, i10, ggw0.m126052I(jM133437K), ggw0.m126052I(jM133437K2), eqy0Var5.f92868b, eqy0Var5.f92869c);
            iZzd2 = zzd();
            if (this.f109971b0.f195863a.m210615o()) {
                y3y0 y3y0Var4 = this.f109971b0;
                Object obj8 = y3y0Var4.f195864b.f92867a;
                y3y0Var4.f195863a.mo112558n(obj8, this.f109986m);
                iMo112550a = this.f109971b0.f195863a.mo112550a(obj8);
                obj4 = obj8;
                obj3 = this.f109971b0.f195863a.mo112552e(iZzd2, this.f174642a, 0L).f155814a;
                nis0Var3 = this.f174642a.f155816c;
            } else {
                obj3 = null;
                nis0Var3 = null;
                obj4 = null;
                iMo112550a = -1;
            }
            jM126052I = ggw0.m126052I(j);
            if (this.f109971b0.f195864b.m117807b()) {
                jM126052I2 = ggw0.m126052I(m133437K(this.f109971b0));
            } else {
                jM126052I2 = jM126052I;
            }
            eqy0 eqy0Var6 = this.f109971b0.f195864b;
            final aet0 aet0Var4 = new aet0(obj3, iZzd2, nis0Var3, obj4, iMo112550a, jM126052I, jM126052I2, eqy0Var6.f92868b, eqy0Var6.f92869c);
            this.f109984k.m98627d(11, new gnv0() { // from class: l.qsx0
                @Override // p149l.gnv0
                public final void zza(Object obj9) {
                    int i110 = hxx0.f109942g0;
                    ((jbt0) obj9).mo106359B(aet0Var3, aet0Var4, i12);
                }
            });
        } else {
            z6 = z6;
            zEquals = zEquals;
            z7 = z7;
        }
        if (zBooleanValue) {
            z9 = true;
            this.f109984k.m98627d(1, new gnv0() { // from class: l.xsx0
                @Override // p149l.gnv0
                public final void zza(Object obj9) {
                    int i110 = hxx0.f109942g0;
                    ((jbt0) obj9).mo106398k(nis0Var, iIntValue);
                }
            });
        } else {
            z9 = true;
        }
        if (y3y0Var2.f195868f != y3y0Var.f195868f) {
            this.f109984k.m98627d(10, new gnv0() { // from class: l.btx0
                @Override // p149l.gnv0
                public final void zza(Object obj9) {
                    int i110 = hxx0.f109942g0;
                    ((jbt0) obj9).mo106408u(y3y0Var.f195868f);
                }
            });
            if (y3y0Var.f195868f != null) {
                this.f109984k.m98627d(10, new gnv0() { // from class: l.ftx0
                    @Override // p149l.gnv0
                    public final void zza(Object obj9) {
                        int i110 = hxx0.f109942g0;
                        ((jbt0) obj9).mo106400m(y3y0Var.f195868f);
                    }
                });
            }
        }
        owy0Var = y3y0Var2.f195871i;
        owy0Var2 = y3y0Var.f195871i;
        if (owy0Var != owy0Var2) {
            this.f109981h.mo147669f(owy0Var2.f146097e);
            this.f109984k.m98627d(2, new gnv0() { // from class: l.ktx0
                @Override // p149l.gnv0
                public final void zza(Object obj9) {
                    int i110 = hxx0.f109942g0;
                    ((jbt0) obj9).mo106412y(y3y0Var.f195871i.f146096d);
                }
            });
        }
        if (!zEquals) {
            final lqs0 lqs0Var2 = this.f109950H;
            this.f109984k.m98627d(14, new gnv0() { // from class: l.ptx0
                @Override // p149l.gnv0
                public final void zza(Object obj9) {
                    int i110 = hxx0.f109942g0;
                    ((jbt0) obj9).mo106372O(lqs0Var2);
                }
            });
        }
        if (z8) {
            this.f109984k.m98627d(i5, new gnv0() { // from class: l.utx0
                @Override // p149l.gnv0
                public final void zza(Object obj9) {
                    int i110 = hxx0.f109942g0;
                    ((jbt0) obj9).zzb(y3y0Var.f195869g);
                }
            });
        }
        if (z7) {
            this.f109984k.m98627d(-1, new gnv0() { // from class: l.ytx0
                @Override // p149l.gnv0
                public final void zza(Object obj9) {
                    int i110 = hxx0.f109942g0;
                    y3y0 y3y0Var5 = y3y0Var;
                    ((jbt0) obj9).mo106374Q(y3y0Var5.f195874l, y3y0Var5.f195867e);
                }
            });
        } else {
            this.f109984k.m98627d(-1, new gnv0() { // from class: l.ytx0
                @Override // p149l.gnv0
                public final void zza(Object obj9) {
                    int i110 = hxx0.f109942g0;
                    y3y0 y3y0Var5 = y3y0Var;
                    ((jbt0) obj9).mo106374Q(y3y0Var5.f195874l, y3y0Var5.f195867e);
                }
            });
        }
        if (z7) {
            this.f109984k.m98627d(4, new gnv0() { // from class: l.xux0
                @Override // p149l.gnv0
                public final void zza(Object obj9) {
                    int i110 = hxx0.f109942g0;
                    ((jbt0) obj9).zzh(y3y0Var.f195867e);
                }
            });
        }
        if (z6) {
            this.f109984k.m98627d(5, new gnv0() { // from class: l.xrx0
                @Override // p149l.gnv0
                public final void zza(Object obj9) {
                    int i110 = hxx0.f109942g0;
                    ((jbt0) obj9).mo106363F(y3y0Var.f195874l, i2);
                }
            });
        }
        if (y3y0Var2.f195875m != y3y0Var.f195875m) {
            this.f109984k.m98627d(6, new gnv0() { // from class: l.csx0
                @Override // p149l.gnv0
                public final void zza(Object obj9) {
                    int i110 = hxx0.f109942g0;
                    ((jbt0) obj9).mo106401n(y3y0Var.f195875m);
                }
            });
        }
        if (y3y0Var2.m212872i() != y3y0Var.m212872i()) {
            this.f109984k.m98627d(7, new gnv0() { // from class: l.gsx0
                @Override // p149l.gnv0
                public final void zza(Object obj9) {
                    int i110 = hxx0.f109942g0;
                    ((jbt0) obj9).mo106383a(y3y0Var.m212872i());
                }
            });
        }
        if (!y3y0Var2.f195876n.equals(y3y0Var.f195876n)) {
            this.f109984k.m98627d(12, new gnv0() { // from class: l.lsx0
                @Override // p149l.gnv0
                public final void zza(Object obj9) {
                    int i110 = hxx0.f109942g0;
                    ((jbt0) obj9).mo106394g(y3y0Var.f195876n);
                }
            });
        }
        iat0Var = this.f109949G;
        ift0Var = this.f109978f;
        iat0 iat0Var3 = this.f109972c;
        int i110 = ggw0.f102568a;
        zMo124675g = ift0Var.mo124675g();
        u4y0Var = (u4y0) ift0Var;
        xqt0VarZzn2 = u4y0Var.zzn();
        if (!xqt0VarZzn2.m210615o()) {
            ift0Var2 = ift0Var;
            if (xqt0VarZzn2.mo112552e(u4y0Var.zzd(), u4y0Var.f174642a, 0L).f155820g) {
            }
            xqt0VarZzn3 = u4y0Var.zzn();
            if (xqt0VarZzn3.m210615o()) {
                i8 = -1;
                r13 = 0;
                z11 = false;
            } else {
                int iZzd5 = u4y0Var.zzd();
                u4y0Var.zzh();
                u4y0Var.mo124679k();
                r13 = 0;
                r13 = 0;
                iMo112557k = xqt0VarZzn3.mo112557k(iZzd5, 0, false);
                i8 = -1;
                if (iMo112557k != -1) {
                    z11 = z9;
                } else {
                    z11 = false;
                }
            }
            Zzn = u4y0Var.zzn();
            if (Zzn.m210615o()) {
                r5 = r13;
            } else {
                iZzd = u4y0Var.zzd();
                u4y0Var.zzh();
                u4y0Var.mo124679k();
                if (Zzn.mo112556j(iZzd, r13, r13) != i8) {
                    r5 = z9;
                } else {
                    r5 = r13;
                }
            }
            xqt0VarZzn4 = u4y0Var.zzn();
            if (!xqt0VarZzn4.m210615o()) {
                z12 = zMo124675g;
                j2 = 0;
                if (xqt0VarZzn4.mo112552e(u4y0Var.zzd(), u4y0Var.f174642a, 0L).m175866b()) {
                }
                xqt0VarZzn5 = u4y0Var.zzn();
                if (xqt0VarZzn5.m210615o()) {
                    z13 = false;
                } else {
                    z13 = false;
                }
                zM210615o = ift0Var2.zzn().m210615o();
                u7t0 u7t0Var5 = new u7t0();
                u7t0Var5.m192165b(iat0Var3);
                boolean z25 = !z12;
                u7t0Var5.m192167d(4, z25);
                if (z10) {
                    z14 = false;
                } else {
                    z14 = false;
                }
                u7t0Var5.m192167d(5, z14);
                if (z11) {
                    z15 = false;
                } else {
                    z15 = false;
                }
                u7t0Var5.m192167d(6, z15);
                if (zM210615o) {
                    z16 = false;
                } else {
                    z16 = false;
                }
                u7t0Var5.m192167d(7, z16);
                if (r5 != 0) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                u7t0Var5.m192167d(8, z17);
                if (zM210615o) {
                    z18 = false;
                } else {
                    z18 = false;
                }
                u7t0Var5.m192167d(9, z18);
                u7t0Var5.m192167d(10, z25);
                if (z10) {
                    z19 = false;
                } else {
                    z19 = false;
                }
                u7t0Var5.m192167d(11, z19);
                if (z10) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                u7t0Var5.m192167d(12, z9);
                iat0VarM192168e = u7t0Var5.m192168e();
                this.f109949G = iat0VarM192168e;
                if (!iat0VarM192168e.equals(iat0Var)) {
                    this.f109984k.m98627d(13, new gnv0() { // from class: l.orx0
                        @Override // p149l.gnv0
                        public final void zza(Object obj9) {
                            this.f145363a.m133453E((jbt0) obj9);
                        }
                    });
                }
                this.f109984k.m98626c();
            }
            z12 = zMo124675g;
            j2 = 0;
            xqt0VarZzn5 = u4y0Var.zzn();
            if (xqt0VarZzn5.m210615o()) {
                z13 = false;
            } else {
                z13 = false;
            }
            zM210615o = ift0Var2.zzn().m210615o();
            u7t0 u7t0Var6 = new u7t0();
            u7t0Var6.m192165b(iat0Var3);
            boolean z26 = !z12;
            u7t0Var6.m192167d(4, z26);
            if (z10) {
                z14 = false;
            } else {
                z14 = false;
            }
            u7t0Var6.m192167d(5, z14);
            if (z11) {
                z15 = false;
            } else {
                z15 = false;
            }
            u7t0Var6.m192167d(6, z15);
            if (zM210615o) {
                z16 = false;
            } else {
                z16 = false;
            }
            u7t0Var6.m192167d(7, z16);
            if (r5 != 0) {
                z17 = false;
            } else {
                z17 = false;
            }
            u7t0Var6.m192167d(8, z17);
            if (zM210615o) {
                z18 = false;
            } else {
                z18 = false;
            }
            u7t0Var6.m192167d(9, z18);
            u7t0Var6.m192167d(10, z26);
            if (z10) {
                z19 = false;
            } else {
                z19 = false;
            }
            u7t0Var6.m192167d(11, z19);
            if (z10) {
                z9 = false;
            } else {
                z9 = false;
            }
            u7t0Var6.m192167d(12, z9);
            iat0VarM192168e = u7t0Var6.m192168e();
            this.f109949G = iat0VarM192168e;
            if (!iat0VarM192168e.equals(iat0Var)) {
                this.f109984k.m98627d(13, new gnv0() { // from class: l.orx0
                    @Override // p149l.gnv0
                    public final void zza(Object obj9) {
                        this.f145363a.m133453E((jbt0) obj9);
                    }
                });
            }
            this.f109984k.m98626c();
        }
        ift0Var2 = ift0Var;
        xqt0VarZzn3 = u4y0Var.zzn();
        if (xqt0VarZzn3.m210615o()) {
            i8 = -1;
            r13 = 0;
            z11 = false;
        } else {
            int iZzd6 = u4y0Var.zzd();
            u4y0Var.zzh();
            u4y0Var.mo124679k();
            r13 = 0;
            r13 = 0;
            iMo112557k = xqt0VarZzn3.mo112557k(iZzd6, 0, false);
            i8 = -1;
            if (iMo112557k != -1) {
                z11 = z9;
            } else {
                z11 = false;
            }
        }
        Zzn = u4y0Var.zzn();
        if (Zzn.m210615o()) {
            r5 = r13;
        } else {
            iZzd = u4y0Var.zzd();
            u4y0Var.zzh();
            u4y0Var.mo124679k();
            if (Zzn.mo112556j(iZzd, r13, r13) != i8) {
                r5 = z9;
            } else {
                r5 = r13;
            }
        }
        xqt0VarZzn4 = u4y0Var.zzn();
        if (!xqt0VarZzn4.m210615o()) {
            z12 = zMo124675g;
            j2 = 0;
            if (xqt0VarZzn4.mo112552e(u4y0Var.zzd(), u4y0Var.f174642a, 0L).m175866b()) {
            }
            xqt0VarZzn5 = u4y0Var.zzn();
            if (xqt0VarZzn5.m210615o()) {
                z13 = false;
            } else {
                z13 = false;
            }
            zM210615o = ift0Var2.zzn().m210615o();
            u7t0 u7t0Var7 = new u7t0();
            u7t0Var7.m192165b(iat0Var3);
            boolean z27 = !z12;
            u7t0Var7.m192167d(4, z27);
            if (z10) {
                z14 = false;
            } else {
                z14 = false;
            }
            u7t0Var7.m192167d(5, z14);
            if (z11) {
                z15 = false;
            } else {
                z15 = false;
            }
            u7t0Var7.m192167d(6, z15);
            if (zM210615o) {
                z16 = false;
            } else {
                z16 = false;
            }
            u7t0Var7.m192167d(7, z16);
            if (r5 != 0) {
                z17 = false;
            } else {
                z17 = false;
            }
            u7t0Var7.m192167d(8, z17);
            if (zM210615o) {
                z18 = false;
            } else {
                z18 = false;
            }
            u7t0Var7.m192167d(9, z18);
            u7t0Var7.m192167d(10, z27);
            if (z10) {
                z19 = false;
            } else {
                z19 = false;
            }
            u7t0Var7.m192167d(11, z19);
            if (z10) {
                z9 = false;
            } else {
                z9 = false;
            }
            u7t0Var7.m192167d(12, z9);
            iat0VarM192168e = u7t0Var7.m192168e();
            this.f109949G = iat0VarM192168e;
            if (!iat0VarM192168e.equals(iat0Var)) {
                this.f109984k.m98627d(13, new gnv0() { // from class: l.orx0
                    @Override // p149l.gnv0
                    public final void zza(Object obj9) {
                        this.f145363a.m133453E((jbt0) obj9);
                    }
                });
            }
            this.f109984k.m98626c();
        }
        z12 = zMo124675g;
        j2 = 0;
        xqt0VarZzn5 = u4y0Var.zzn();
        if (xqt0VarZzn5.m210615o()) {
            z13 = false;
        } else {
            z13 = false;
        }
        zM210615o = ift0Var2.zzn().m210615o();
        u7t0 u7t0Var8 = new u7t0();
        u7t0Var8.m192165b(iat0Var3);
        boolean z28 = !z12;
        u7t0Var8.m192167d(4, z28);
        if (z10) {
            z14 = false;
        } else {
            z14 = false;
        }
        u7t0Var8.m192167d(5, z14);
        if (z11) {
            z15 = false;
        } else {
            z15 = false;
        }
        u7t0Var8.m192167d(6, z15);
        if (zM210615o) {
            z16 = false;
        } else {
            z16 = false;
        }
        u7t0Var8.m192167d(7, z16);
        if (r5 != 0) {
            z17 = false;
        } else {
            z17 = false;
        }
        u7t0Var8.m192167d(8, z17);
        if (zM210615o) {
            z18 = false;
        } else {
            z18 = false;
        }
        u7t0Var8.m192167d(9, z18);
        u7t0Var8.m192167d(10, z28);
        if (z10) {
            z19 = false;
        } else {
            z19 = false;
        }
        u7t0Var8.m192167d(11, z19);
        if (z10) {
            z9 = false;
        } else {
            z9 = false;
        }
        u7t0Var8.m192167d(12, z9);
        iat0VarM192168e = u7t0Var8.m192168e();
        this.f109949G = iat0VarM192168e;
        if (!iat0VarM192168e.equals(iat0Var)) {
            this.f109984k.m98627d(13, new gnv0() { // from class: l.orx0
                @Override // p149l.gnv0
                public final void zza(Object obj9) {
                    this.f145363a.m133453E((jbt0) obj9);
                }
            });
        }
        this.f109984k.m98626c();
    }

    /* JADX INFO: renamed from: W */
    public final void m133468W() {
        int iZzf = zzf();
        if (iZzf == 2 || iZzf == 3) {
            m133469X();
            boolean z = this.f109971b0.f195877o;
            mo124670b();
            mo124670b();
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m133469X() {
        this.f109974d.m197602b();
        if (Thread.currentThread() != this.f109991r.getThread()) {
            String str = String.format(Locale.US, "Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.f109991r.getThread().getName());
            if (this.f109965W) {
                qkq0.m175383a(str);
            } else {
                svv0.m186112g("ExoPlayerImpl", str, this.f109966X ? null : new IllegalStateException());
                this.f109966X = true;
            }
        }
    }

    @Override // p149l.ift0
    /* JADX INFO: renamed from: a */
    public final void mo124669a() {
        svv0.m186110e("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.2.1] [" + ggw0.f102572e + "] [" + wjs0.m203496a() + Constants.AES_SUFFIX);
        m133469X();
        this.f109997x.m127199d();
        if (!this.f109983j.m12579b0()) {
            asv0 asv0Var = this.f109984k;
            asv0Var.m98627d(10, new gnv0() { // from class: l.gvx0
                @Override // p149l.gnv0
                public final void zza(Object obj) {
                    ((jbt0) obj).mo106400m(zziz.zzd(new zzla(1), 1003));
                }
            });
            asv0Var.m98626c();
        }
        this.f109984k.m98628e();
        this.f109982i.mo164787b(null);
        this.f109992s.mo152111a(this.f109990q);
        y3y0 y3y0Var = this.f109971b0;
        boolean z = y3y0Var.f195877o;
        y3y0 y3y0VarM212870e = y3y0Var.m212870e(1);
        this.f109971b0 = y3y0VarM212870e;
        y3y0 y3y0VarM212866a = y3y0VarM212870e.m212866a(y3y0VarM212870e.f195864b);
        this.f109971b0 = y3y0VarM212866a;
        y3y0VarM212866a.f195878p = y3y0VarM212866a.f195880r;
        this.f109971b0.f195879q = 0L;
        this.f109990q.mo106395h();
        this.f109981h.mo123589b();
        Surface surface = this.f109955M;
        if (surface != null) {
            surface.release();
            this.f109955M = null;
        }
        this.f109964V = byu0.f77967b;
    }

    @Override // p149l.ift0
    /* JADX INFO: renamed from: b */
    public final boolean mo124670b() {
        m133469X();
        return this.f109971b0.f195874l;
    }

    @Override // p149l.ift0
    /* JADX INFO: renamed from: c */
    public final void mo124671c(@Nullable Surface surface) {
        m133469X();
        m133464S(surface);
        int i = surface == null ? 0 : -1;
        m133461P(i, i);
    }

    @Override // p149l.ift0
    /* JADX INFO: renamed from: d */
    public final void mo124672d(boolean z) {
        m133469X();
        int iM127198b = this.f109997x.m127198b(z, zzf());
        m133466U(z, iM127198b, m133436H(z, iM127198b));
    }

    @Override // p149l.grx0
    /* JADX INFO: renamed from: e */
    public final void mo124673e(x6y0 x6y0Var) {
        m133469X();
        this.f109990q.mo106375R(x6y0Var);
    }

    @Override // p149l.ift0
    /* JADX INFO: renamed from: f */
    public final void mo124674f(float f) {
        m133469X();
        final float fMax = Math.max(0.0f, Math.min(f, 1.0f));
        if (this.f109962T == fMax) {
            return;
        }
        this.f109962T = fMax;
        m133463R();
        asv0 asv0Var = this.f109984k;
        asv0Var.m98627d(22, new gnv0() { // from class: l.usx0
            @Override // p149l.gnv0
            public final void zza(Object obj) {
                int i = hxx0.f109942g0;
                ((jbt0) obj).mo106407t(fMax);
            }
        });
        asv0Var.m98626c();
    }

    @Override // p149l.ift0
    /* JADX INFO: renamed from: g */
    public final boolean mo124675g() {
        m133469X();
        return this.f109971b0.f195864b.m117807b();
    }

    @Override // p149l.grx0
    /* JADX INFO: renamed from: h */
    public final void mo124676h(x6y0 x6y0Var) {
        this.f109990q.mo106376S(x6y0Var);
    }

    @Override // p149l.grx0
    /* JADX INFO: renamed from: i */
    public final void mo124677i(gqy0 gqy0Var) {
        m133469X();
        List listSingletonList = Collections.singletonList(gqy0Var);
        m133469X();
        m133469X();
        m133454G(this.f109971b0);
        zzk();
        this.f109944B++;
        boolean z = false;
        if (!this.f109987n.isEmpty()) {
            int size = this.f109987n.size();
            for (int i = size - 1; i >= 0; i--) {
                this.f109987n.remove(i);
            }
            this.f109979f0 = this.f109979f0.m108717h(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < listSingletonList.size(); i2++) {
            o3y0 o3y0Var = new o3y0((gqy0) listSingletonList.get(i2), this.f109988o);
            arrayList.add(o3y0Var);
            this.f109987n.add(i2, new cxx0(o3y0Var.f141719b, o3y0Var.f141718a));
        }
        this.f109979f0 = this.f109979f0.m108716g(0, arrayList.size());
        j5y0 j5y0Var = new j5y0(this.f109987n, this.f109979f0);
        if (!j5y0Var.m210615o() && j5y0Var.mo113618c() < 0) {
            throw new zzan(j5y0Var, -1, -9223372036854775807L);
        }
        int iMo112554g = j5y0Var.mo112554g(false);
        y3y0 y3y0VarM133459N = m133459N(this.f109971b0, j5y0Var, m133458M(j5y0Var, iMo112554g, -9223372036854775807L));
        int i3 = y3y0VarM133459N.f195867e;
        if (iMo112554g != -1 && i3 != 1) {
            i3 = 4;
            if (!j5y0Var.m210615o() && iMo112554g < j5y0Var.mo113618c()) {
                i3 = 2;
            }
        }
        y3y0 y3y0VarM212870e = y3y0VarM133459N.m212870e(i3);
        this.f109983j.m12581c0(arrayList, iMo112554g, ggw0.m126049F(-9223372036854775807L), this.f109979f0);
        if (!this.f109971b0.f195864b.f92867a.equals(y3y0VarM212870e.f195864b.f92867a) && !this.f109971b0.f195863a.m210615o()) {
            z = true;
        }
        m133467V(y3y0VarM212870e, 0, 1, z, 4, m133456J(y3y0VarM212870e), -1, false);
    }

    @Override // p149l.u4y0
    /* JADX INFO: renamed from: j */
    public final void mo124678j(int i, long j, int i2, boolean z) {
        m133469X();
        f5v0.m119533d(i >= 0);
        this.f109990q.zzu();
        xqt0 xqt0Var = this.f109971b0.f195863a;
        if (xqt0Var.m210615o() || i < xqt0Var.mo113618c()) {
            this.f109944B++;
            if (mo124675g()) {
                svv0.m186111f("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                wyx0 wyx0Var = new wyx0(this.f109971b0);
                wyx0Var.m206238a(1);
                this.f109977e0.f124404a.m133452D(wyx0Var);
                return;
            }
            y3y0 y3y0VarM212870e = this.f109971b0;
            int i3 = y3y0VarM212870e.f195867e;
            if (i3 == 3 || (i3 == 4 && !xqt0Var.m210615o())) {
                y3y0VarM212870e = this.f109971b0.m212870e(2);
            }
            int iZzd = zzd();
            y3y0 y3y0VarM133459N = m133459N(y3y0VarM212870e, xqt0Var, m133458M(xqt0Var, i, j));
            this.f109983j.m12574Y(xqt0Var, i, ggw0.m126049F(j));
            m133467V(y3y0VarM133459N, 0, 1, true, 1, m133456J(y3y0VarM133459N), iZzd, false);
        }
    }

    @Override // p149l.ift0
    /* JADX INFO: renamed from: k */
    public final boolean mo124679k() {
        m133469X();
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public final zziz m133470n() {
        m133469X();
        return this.f109971b0.f195868f;
    }

    @Override // p149l.grx0
    /* JADX INFO: renamed from: r */
    public final int mo124681r() {
        m133469X();
        int length = this.f109980g.length;
        return 2;
    }

    @Override // p149l.ift0
    public final int zzb() {
        m133469X();
        if (mo124675g()) {
            return this.f109971b0.f195864b.f92868b;
        }
        return -1;
    }

    @Override // p149l.ift0
    public final int zzc() {
        m133469X();
        if (mo124675g()) {
            return this.f109971b0.f195864b.f92869c;
        }
        return -1;
    }

    @Override // p149l.ift0
    public final int zzd() {
        m133469X();
        int iM133454G = m133454G(this.f109971b0);
        if (iM133454G == -1) {
            return 0;
        }
        return iM133454G;
    }

    @Override // p149l.ift0
    public final int zze() {
        m133469X();
        if (this.f109971b0.f195863a.m210615o()) {
            return 0;
        }
        y3y0 y3y0Var = this.f109971b0;
        return y3y0Var.f195863a.mo112550a(y3y0Var.f195864b.f92867a);
    }

    @Override // p149l.ift0
    public final int zzf() {
        m133469X();
        return this.f109971b0.f195867e;
    }

    @Override // p149l.ift0
    public final int zzg() {
        m133469X();
        return this.f109971b0.f195875m;
    }

    @Override // p149l.ift0
    public final int zzh() {
        m133469X();
        return 0;
    }

    @Override // p149l.ift0
    public final long zzi() {
        m133469X();
        if (mo124675g()) {
            y3y0 y3y0Var = this.f109971b0;
            return y3y0Var.f195873k.equals(y3y0Var.f195864b) ? ggw0.m126052I(this.f109971b0.f195878p) : zzl();
        }
        m133469X();
        if (this.f109971b0.f195863a.m210615o()) {
            return this.f109975d0;
        }
        y3y0 y3y0Var2 = this.f109971b0;
        long j = 0;
        if (y3y0Var2.f195873k.f92870d != y3y0Var2.f195864b.f92870d) {
            return ggw0.m126052I(y3y0Var2.f195863a.mo112552e(zzd(), this.f174642a, 0L).f155826m);
        }
        long j2 = y3y0Var2.f195878p;
        if (this.f109971b0.f195873k.m117807b()) {
            y3y0 y3y0Var3 = this.f109971b0;
            y3y0Var3.f195863a.mo112558n(y3y0Var3.f195873k.f92867a, this.f109986m).m102868i(this.f109971b0.f195873k.f92868b);
        } else {
            j = j2;
        }
        y3y0 y3y0Var4 = this.f109971b0;
        m133457L(y3y0Var4.f195863a, y3y0Var4.f195873k, j);
        return ggw0.m126052I(j);
    }

    @Override // p149l.ift0
    public final long zzj() {
        m133469X();
        return m133455I(this.f109971b0);
    }

    @Override // p149l.ift0
    public final long zzk() {
        m133469X();
        return ggw0.m126052I(m133456J(this.f109971b0));
    }

    @Override // p149l.ift0
    public final long zzl() {
        m133469X();
        if (mo124675g()) {
            y3y0 y3y0Var = this.f109971b0;
            eqy0 eqy0Var = y3y0Var.f195864b;
            y3y0Var.f195863a.mo112558n(eqy0Var.f92867a, this.f109986m);
            return ggw0.m126052I(this.f109986m.m102867h(eqy0Var.f92868b, eqy0Var.f92869c));
        }
        xqt0 xqt0VarZzn = zzn();
        if (xqt0VarZzn.m210615o()) {
            return -9223372036854775807L;
        }
        return ggw0.m126052I(xqt0VarZzn.mo112552e(zzd(), this.f174642a, 0L).f155826m);
    }

    @Override // p149l.ift0
    public final long zzm() {
        m133469X();
        return ggw0.m126052I(this.f109971b0.f195879q);
    }

    @Override // p149l.ift0
    public final xqt0 zzn() {
        m133469X();
        return this.f109971b0.f195863a;
    }

    @Override // p149l.ift0
    public final o8u0 zzo() {
        m133469X();
        return this.f109971b0.f195871i.f146096d;
    }

    @Override // p149l.ift0
    public final void zzp() {
        m133469X();
        gnx0 gnx0Var = this.f109997x;
        boolean zMo124670b = mo124670b();
        int iM127198b = gnx0Var.m127198b(zMo124670b, 2);
        m133466U(zMo124670b, iM127198b, m133436H(zMo124670b, iM127198b));
        y3y0 y3y0Var = this.f109971b0;
        if (y3y0Var.f195867e != 1) {
            return;
        }
        y3y0 y3y0VarM212869d = y3y0Var.m212869d(null);
        y3y0 y3y0VarM212870e = y3y0VarM212869d.m212870e(true == y3y0VarM212869d.f195863a.m210615o() ? 4 : 2);
        this.f109944B++;
        this.f109983j.m12573X();
        m133467V(y3y0VarM212870e, 1, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // p149l.ift0
    public final void zzu() {
        m133469X();
        this.f109997x.m127198b(mo124670b(), 1);
        m133465T(null);
        this.f109964V = new byu0(zzgaa.zzl(), this.f109971b0.f195880r);
    }
}
