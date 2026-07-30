package p153l;

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
import com.google.android.gms.internal.ads.C2125a7;
import com.google.android.gms.internal.ads.C2134b7;
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
public final class n6y0 extends aey0 implements m0y0 {

    /* JADX INFO: renamed from: g0 */
    public static final /* synthetic */ int f140504g0 = 0;

    /* JADX INFO: renamed from: A */
    public final long f140505A;

    /* JADX INFO: renamed from: B */
    public int f140506B;

    /* JADX INFO: renamed from: C */
    public int f140507C;

    /* JADX INFO: renamed from: D */
    public boolean f140508D;

    /* JADX INFO: renamed from: E */
    public int f140509E;

    /* JADX INFO: renamed from: F */
    public gfy0 f140510F;

    /* JADX INFO: renamed from: G */
    public ojt0 f140511G;

    /* JADX INFO: renamed from: H */
    public rzs0 f140512H;

    /* JADX INFO: renamed from: I */
    public rzs0 f140513I;

    /* JADX INFO: renamed from: J */
    @Nullable
    public sqr0 f140514J;

    /* JADX INFO: renamed from: K */
    @Nullable
    public sqr0 f140515K;

    /* JADX INFO: renamed from: L */
    @Nullable
    public Object f140516L;

    /* JADX INFO: renamed from: M */
    @Nullable
    public Surface f140517M;

    /* JADX INFO: renamed from: N */
    public int f140518N;

    /* JADX INFO: renamed from: O */
    public chw0 f140519O;

    /* JADX INFO: renamed from: P */
    @Nullable
    public vwx0 f140520P;

    /* JADX INFO: renamed from: Q */
    @Nullable
    public vwx0 f140521Q;

    /* JADX INFO: renamed from: R */
    public int f140522R;

    /* JADX INFO: renamed from: S */
    public w3y0 f140523S;

    /* JADX INFO: renamed from: T */
    public float f140524T;

    /* JADX INFO: renamed from: U */
    public boolean f140525U;

    /* JADX INFO: renamed from: V */
    public h7v0 f140526V;

    /* JADX INFO: renamed from: W */
    public boolean f140527W;

    /* JADX INFO: renamed from: X */
    public boolean f140528X;

    /* JADX INFO: renamed from: Y */
    public var0 f140529Y;

    /* JADX INFO: renamed from: Z */
    public aou0 f140530Z;

    /* JADX INFO: renamed from: a0 */
    public rzs0 f140531a0;

    /* JADX INFO: renamed from: b */
    public final u5z0 f140532b;

    /* JADX INFO: renamed from: b0 */
    public edy0 f140533b0;

    /* JADX INFO: renamed from: c */
    public final ojt0 f140534c;

    /* JADX INFO: renamed from: c0 */
    public int f140535c0;

    /* JADX INFO: renamed from: d */
    public final bjv0 f140536d;

    /* JADX INFO: renamed from: d0 */
    public long f140537d0;

    /* JADX INFO: renamed from: e */
    public final Context f140538e;

    /* JADX INFO: renamed from: e0 */
    public final q0y0 f140539e0;

    /* JADX INFO: renamed from: f */
    public final oot0 f140540f;

    /* JADX INFO: renamed from: f0 */
    public i2z0 f140541f0;

    /* JADX INFO: renamed from: g */
    public final vey0[] f140542g;

    /* JADX INFO: renamed from: h */
    public final t5z0 f140543h;

    /* JADX INFO: renamed from: i */
    public final usv0 f140544i;

    /* JADX INFO: renamed from: j */
    public final C2134b7 f140545j;

    /* JADX INFO: renamed from: k */
    public final g1w0 f140546k;

    /* JADX INFO: renamed from: l */
    public final CopyOnWriteArraySet f140547l;

    /* JADX INFO: renamed from: m */
    public final hwt0 f140548m;

    /* JADX INFO: renamed from: n */
    public final List f140549n;

    /* JADX INFO: renamed from: o */
    public final boolean f140550o;

    /* JADX INFO: renamed from: p */
    public final jzy0 f140551p;

    /* JADX INFO: renamed from: q */
    public final wfy0 f140552q;

    /* JADX INFO: renamed from: r */
    public final Looper f140553r;

    /* JADX INFO: renamed from: s */
    public final b6z0 f140554s;

    /* JADX INFO: renamed from: t */
    public final mfv0 f140555t;

    /* JADX INFO: renamed from: u */
    public final v5y0 f140556u;

    /* JADX INFO: renamed from: v */
    public final e6y0 f140557v;

    /* JADX INFO: renamed from: w */
    public final C2125a7 f140558w;

    /* JADX INFO: renamed from: x */
    public final mwx0 f140559x;

    /* JADX INFO: renamed from: y */
    public final rfy0 f140560y;

    /* JADX INFO: renamed from: z */
    public final ufy0 f140561z;

    static {
        cts0.m112551b("media3.exoplayer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, l.a6z0, l.wfy0] */
    @SuppressLint({"HandlerLeak"})
    public n6y0(h0y0 h0y0Var, @Nullable oot0 oot0Var) {
        bjv0 bjv0Var = new bjv0(mfv0.f136676a);
        this.f140536d = bjv0Var;
        try {
            y4w0.m214277e("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.2.1] [" + mpw0.f137961e + Constants.AES_SUFFIX);
            Context applicationContext = h0y0Var.f107340a.getApplicationContext();
            this.f140538e = applicationContext;
            ?? Apply = h0y0Var.f107347h.apply(h0y0Var.f107341b);
            this.f140552q = Apply;
            this.f140523S = h0y0Var.f107349j;
            this.f140518N = h0y0Var.f107350k;
            this.f140525U = false;
            this.f140505A = h0y0Var.f107354o;
            v5y0 v5y0Var = new v5y0(this, null);
            this.f140556u = v5y0Var;
            e6y0 e6y0Var = new e6y0(null);
            this.f140557v = e6y0Var;
            Handler handler = new Handler(h0y0Var.f107348i);
            vey0[] vey0VarArrM109948a = ((ezx0) h0y0Var.f107342c).f96633a.m109948a(handler, v5y0Var, v5y0Var, v5y0Var, v5y0Var);
            this.f140542g = vey0VarArrM109948a;
            int length = vey0VarArrM109948a.length;
            t5z0 t5z0Var = (t5z0) h0y0Var.f107344e.zza();
            this.f140543h = t5z0Var;
            this.f140551p = h0y0.m133201a(((izx0) h0y0Var.f107343d).f117766a);
            r6z0 r6z0VarM180059c = r6z0.m180059c(((wzx0) h0y0Var.f107346g).f191848a);
            this.f140554s = r6z0VarM180059c;
            this.f140550o = h0y0Var.f107351l;
            this.f140510F = h0y0Var.f107352m;
            Looper looper = h0y0Var.f107348i;
            this.f140553r = looper;
            mfv0 mfv0Var = h0y0Var.f107341b;
            this.f140555t = mfv0Var;
            this.f140540f = oot0Var;
            g1w0 g1w0Var = new g1w0(looper, mfv0Var, new zyv0() { // from class: l.t4y0
                @Override // p153l.zyv0
                /* JADX INFO: renamed from: a */
                public final void mo172464a(Object obj, akr0 akr0Var) {
                }
            });
            this.f140546k = g1w0Var;
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.f140547l = copyOnWriteArraySet;
            this.f140549n = new ArrayList();
            this.f140541f0 = new i2z0(0);
            int length2 = vey0VarArrM109948a.length;
            u5z0 u5z0Var = new u5z0(new dfy0[2], new n5z0[2], uhu0.f179056b, null);
            this.f140532b = u5z0Var;
            this.f140548m = new hwt0();
            aht0 aht0Var = new aht0();
            aht0Var.m97920c(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32);
            t5z0Var.mo153040d();
            aht0Var.m97921d(29, true);
            aht0Var.m97921d(23, false);
            aht0Var.m97921d(25, false);
            aht0Var.m97921d(33, false);
            aht0Var.m97921d(26, false);
            aht0Var.m97921d(34, false);
            ojt0 ojt0VarM97922e = aht0Var.m97922e();
            this.f140534c = ojt0VarM97922e;
            aht0 aht0Var2 = new aht0();
            aht0Var2.m97919b(ojt0VarM97922e);
            aht0Var2.m97918a(4);
            aht0Var2.m97918a(10);
            this.f140511G = aht0Var2.m97922e();
            this.f140544i = mfv0Var.mo135184a(looper, null);
            q0y0 q0y0Var = new q0y0(this);
            this.f140539e0 = q0y0Var;
            this.f140533b0 = edy0.m120528g(u5z0Var);
            Apply.mo141194I(oot0Var, looper);
            this.f140545j = new C2134b7(vey0VarArrM109948a, t5z0Var, u5z0Var, (q9y0) h0y0Var.f107345f.zza(), r6z0VarM180059c, 0, false, Apply, this.f140510F, h0y0Var.f107357r, h0y0Var.f107353n, false, looper, mfv0Var, q0y0Var, mpw0.f137957a < 31 ? new voy0() : y4y0.m214280a(applicationContext, this, h0y0Var.f107355p), null);
            this.f140524T = 1.0f;
            rzs0 rzs0Var = rzs0.f165600y;
            this.f140512H = rzs0Var;
            this.f140513I = rzs0Var;
            this.f140531a0 = rzs0Var;
            int iGenerateAudioSessionId = -1;
            this.f140535c0 = -1;
            AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
            if (audioManager != null) {
                iGenerateAudioSessionId = audioManager.generateAudioSessionId();
            }
            this.f140522R = iGenerateAudioSessionId;
            this.f140526V = h7v0.f108165b;
            this.f140527W = true;
            if (Apply == 0) {
                throw null;
            }
            g1w0Var.m128565b(Apply);
            r6z0VarM180059c.mo102801b(new Handler(looper), Apply);
            copyOnWriteArraySet.add(v5y0Var);
            this.f140558w = new C2125a7(h0y0Var.f107340a, handler, v5y0Var);
            this.f140559x = new mwx0(h0y0Var.f107340a, handler, v5y0Var);
            mpw0.m159408f(null, null);
            this.f140560y = new rfy0(h0y0Var.f107340a);
            this.f140561z = new ufy0(h0y0Var.f107340a);
            this.f140529Y = new a5z0(0).m96257a();
            this.f140530Z = aou0.f72640e;
            this.f140519O = chw0.f81875c;
            t5z0Var.mo153039c(this.f140523S);
            m161842Q(1, 10, Integer.valueOf(this.f140522R));
            m161842Q(2, 10, Integer.valueOf(this.f140522R));
            m161842Q(1, 3, this.f140523S);
            m161842Q(2, 4, Integer.valueOf(this.f140518N));
            m161842Q(2, 5, 0);
            m161842Q(1, 9, Boolean.valueOf(this.f140525U));
            m161842Q(2, 7, e6y0Var);
            m161842Q(6, 8, e6y0Var);
            bjv0Var.m104777e();
        } catch (Throwable th) {
            this.f140536d.m104777e();
            throw th;
        }
    }

    /* JADX INFO: renamed from: H */
    public static int m161816H(boolean z, int i) {
        return (!z || i == 1) ? 1 : 2;
    }

    /* JADX INFO: renamed from: K */
    public static long m161817K(edy0 edy0Var) {
        wyt0 wyt0Var = new wyt0();
        hwt0 hwt0Var = new hwt0();
        edy0Var.f93590a.mo113468n(edy0Var.f93591b.f129476a, hwt0Var);
        long j = edy0Var.f93592c;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = edy0Var.f93590a.mo107663e(hwt0Var.f111930c, wyt0Var, 0L).f191702l;
        return 0L;
    }

    /* JADX INFO: renamed from: z */
    public static /* bridge */ /* synthetic */ void m161830z(n6y0 n6y0Var, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        n6y0Var.m161844S(surface);
        n6y0Var.f140517M = surface;
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m161831C(c8y0 c8y0Var) {
        int i = this.f140506B - c8y0Var.f80259c;
        this.f140506B = i;
        boolean z = true;
        if (c8y0Var.f80260d) {
            this.f140507C = c8y0Var.f80261e;
            this.f140508D = true;
        }
        if (c8y0Var.f80262f) {
            this.f140509E = c8y0Var.f80263g;
        }
        if (i == 0) {
            d0u0 d0u0Var = c8y0Var.f80258b.f93590a;
            if (!this.f140533b0.f93590a.m113469o() && d0u0Var.m113469o()) {
                this.f140535c0 = -1;
                this.f140537d0 = 0L;
            }
            if (!d0u0Var.m113469o()) {
                List listM172065y = ((pey0) d0u0Var).m172065y();
                lev0.m153958f(listM172065y.size() == this.f140549n.size());
                for (int i2 = 0; i2 < listM172065y.size(); i2++) {
                    ((i6y0) this.f140549n.get(i2)).m138886a((d0u0) listM172065y.get(i2));
                }
            }
            long j = -9223372036854775807L;
            if (this.f140508D) {
                if (c8y0Var.f80258b.f93591b.equals(this.f140533b0.f93591b) && c8y0Var.f80258b.f93593d == this.f140533b0.f93607r) {
                    z = false;
                }
                if (z) {
                    if (d0u0Var.m113469o() || c8y0Var.f80258b.f93591b.m152240b()) {
                        j = c8y0Var.f80258b.f93593d;
                    } else {
                        edy0 edy0Var = c8y0Var.f80258b;
                        kzy0 kzy0Var = edy0Var.f93591b;
                        long j2 = edy0Var.f93593d;
                        m161837L(d0u0Var, kzy0Var, j2);
                        j = j2;
                    }
                }
            } else {
                z = false;
            }
            this.f140508D = false;
            m161847V(c8y0Var.f80258b, 1, this.f140509E, z, this.f140507C, j, -1, false);
        }
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m161832D(final c8y0 c8y0Var) {
        this.f140544i.mo121303g(new Runnable() { // from class: l.p4y0
            @Override // java.lang.Runnable
            public final void run() {
                this.f150579a.m161831C(c8y0Var);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m161833E(pkt0 pkt0Var) {
        pkt0Var.mo141224i(this.f140511G);
    }

    /* JADX INFO: renamed from: G */
    public final int m161834G(edy0 edy0Var) {
        return edy0Var.f93590a.m113469o() ? this.f140535c0 : edy0Var.f93590a.mo113468n(edy0Var.f93591b.f129476a, this.f140548m).f111930c;
    }

    /* JADX INFO: renamed from: I */
    public final long m161835I(edy0 edy0Var) {
        if (!edy0Var.f93591b.m152240b()) {
            return mpw0.m159396I(m161836J(edy0Var));
        }
        edy0Var.f93590a.mo113468n(edy0Var.f93591b.f129476a, this.f140548m);
        long j = edy0Var.f93592c;
        if (j == -9223372036854775807L) {
            long j2 = edy0Var.f93590a.mo107663e(m161834G(edy0Var), this.f70834a, 0L).f191702l;
            return mpw0.m159396I(0L);
        }
        return mpw0.m159396I(0L) + mpw0.m159396I(j);
    }

    /* JADX INFO: renamed from: J */
    public final long m161836J(edy0 edy0Var) {
        if (edy0Var.f93590a.m113469o()) {
            return mpw0.m159393F(this.f140537d0);
        }
        long j = edy0Var.f93607r;
        if (edy0Var.f93591b.m152240b()) {
            return j;
        }
        m161837L(edy0Var.f93590a, edy0Var.f93591b, j);
        return j;
    }

    /* JADX INFO: renamed from: L */
    public final long m161837L(d0u0 d0u0Var, kzy0 kzy0Var, long j) {
        d0u0Var.mo113468n(kzy0Var.f129476a, this.f140548m);
        return j;
    }

    @Nullable
    /* JADX INFO: renamed from: M */
    public final Pair m161838M(d0u0 d0u0Var, int i, long j) {
        if (d0u0Var.m113469o()) {
            this.f140535c0 = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.f140537d0 = j;
            return null;
        }
        if (i == -1 || i >= d0u0Var.mo113459c()) {
            i = d0u0Var.mo113461g(false);
            long j2 = d0u0Var.mo107663e(i, this.f70834a, 0L).f191702l;
            j = mpw0.m159396I(0L);
        }
        return d0u0Var.m113466l(this.f70834a, this.f140548m, i, mpw0.m159393F(j));
    }

    /* JADX INFO: renamed from: N */
    public final edy0 m161839N(edy0 edy0Var, d0u0 d0u0Var, @Nullable Pair pair) {
        lev0.m153956d(d0u0Var.m113469o() || pair != null);
        d0u0 d0u0Var2 = edy0Var.f93590a;
        long jM161835I = m161835I(edy0Var);
        edy0 edy0VarM120535f = edy0Var.m120535f(d0u0Var);
        if (d0u0Var.m113469o()) {
            kzy0 kzy0VarM120529h = edy0.m120529h();
            long jM159393F = mpw0.m159393F(this.f140537d0);
            edy0 edy0VarM120530a = edy0VarM120535f.m120531b(kzy0VarM120529h, jM159393F, jM159393F, jM159393F, 0L, q2z0.f155398d, this.f140532b, zzgaa.zzl()).m120530a(kzy0VarM120529h);
            edy0VarM120530a.f93605p = edy0VarM120530a.f93607r;
            return edy0VarM120530a;
        }
        Object obj = edy0VarM120535f.f93591b.f129476a;
        int i = mpw0.f137957a;
        boolean zEquals = obj.equals(pair.first);
        kzy0 kzy0Var = !zEquals ? new kzy0(pair.first, -1L) : edy0VarM120535f.f93591b;
        long jLongValue = ((Long) pair.second).longValue();
        long jM159393F2 = mpw0.m159393F(jM161835I);
        if (!d0u0Var2.m113469o()) {
            d0u0Var2.mo113468n(obj, this.f140548m);
        }
        if (!zEquals || jLongValue < jM159393F2) {
            kzy0 kzy0Var2 = kzy0Var;
            lev0.m153958f(!kzy0Var2.m152240b());
            edy0 edy0VarM120530a2 = edy0VarM120535f.m120531b(kzy0Var2, jLongValue, jLongValue, jLongValue, 0L, !zEquals ? q2z0.f155398d : edy0VarM120535f.f93597h, !zEquals ? this.f140532b : edy0VarM120535f.f93598i, !zEquals ? zzgaa.zzl() : edy0VarM120535f.f93599j).m120530a(kzy0Var2);
            edy0VarM120530a2.f93605p = jLongValue;
            return edy0VarM120530a2;
        }
        if (jLongValue != jM159393F2) {
            kzy0 kzy0Var3 = kzy0Var;
            lev0.m153958f(!kzy0Var3.m152240b());
            long jMax = Math.max(0L, edy0VarM120535f.f93606q - (jLongValue - jM159393F2));
            long j = edy0VarM120535f.f93605p;
            if (edy0VarM120535f.f93600k.equals(edy0VarM120535f.f93591b)) {
                j = jLongValue + jMax;
            }
            edy0 edy0VarM120531b = edy0VarM120535f.m120531b(kzy0Var3, jLongValue, jLongValue, jLongValue, jMax, edy0VarM120535f.f93597h, edy0VarM120535f.f93598i, edy0VarM120535f.f93599j);
            edy0VarM120531b.f93605p = j;
            return edy0VarM120531b;
        }
        int iMo113457a = d0u0Var.mo113457a(edy0VarM120535f.f93600k.f129476a);
        if (iMo113457a != -1 && d0u0Var.mo107662d(iMo113457a, this.f140548m, false).f111930c == d0u0Var.mo113468n(kzy0Var.f129476a, this.f140548m).f111930c) {
            return edy0VarM120535f;
        }
        d0u0Var.mo113468n(kzy0Var.f129476a, this.f140548m);
        boolean zM152240b = kzy0Var.m152240b();
        hwt0 hwt0Var = this.f140548m;
        long jM137512h = zM152240b ? hwt0Var.m137512h(kzy0Var.f129477b, kzy0Var.f129478c) : hwt0Var.f111931d;
        kzy0 kzy0Var4 = kzy0Var;
        edy0 edy0VarM120530a3 = edy0VarM120535f.m120531b(kzy0Var4, edy0VarM120535f.f93607r, edy0VarM120535f.f93607r, edy0VarM120535f.f93593d, jM137512h - edy0VarM120535f.f93607r, edy0VarM120535f.f93597h, edy0VarM120535f.f93598i, edy0VarM120535f.f93599j).m120530a(kzy0Var4);
        edy0VarM120530a3.f93605p = jM137512h;
        return edy0VarM120530a3;
    }

    /* JADX INFO: renamed from: O */
    public final jey0 m161840O(gey0 gey0Var) {
        int iM161834G = m161834G(this.f140533b0);
        d0u0 d0u0Var = this.f140533b0.f93590a;
        if (iM161834G == -1) {
            iM161834G = 0;
        }
        mfv0 mfv0Var = this.f140555t;
        C2134b7 c2134b7 = this.f140545j;
        return new jey0(c2134b7, gey0Var, d0u0Var, iM161834G, mfv0Var, c2134b7.m12625S());
    }

    /* JADX INFO: renamed from: P */
    public final void m161841P(final int i, final int i2) {
        if (i == this.f140519O.m109848b() && i2 == this.f140519O.m109847a()) {
            return;
        }
        this.f140519O = new chw0(i, i2);
        g1w0 g1w0Var = this.f140546k;
        g1w0Var.m128567d(24, new mwv0() { // from class: l.h4y0
            @Override // p153l.mwv0
            public final void zza(Object obj) {
                int i3 = n6y0.f140504g0;
                ((pkt0) obj).mo141232r(i, i2);
            }
        });
        g1w0Var.m128566c();
        m161842Q(2, 14, new chw0(i, i2));
    }

    /* JADX INFO: renamed from: Q */
    public final void m161842Q(int i, int i2, @Nullable Object obj) {
        vey0[] vey0VarArr = this.f140542g;
        int length = vey0VarArr.length;
        for (int i3 = 0; i3 < 2; i3++) {
            vey0 vey0Var = vey0VarArr[i3];
            if (vey0Var.mo97570c() == i) {
                jey0 jey0VarM161840O = m161840O(vey0Var);
                jey0VarM161840O.m144634f(i2);
                jey0VarM161840O.m144633e(obj);
                jey0VarM161840O.m144632d();
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m161843R() {
        m161842Q(1, 2, Float.valueOf(this.f140524T * this.f140559x.m160604a()));
    }

    /* JADX INFO: renamed from: S */
    public final void m161844S(@Nullable Object obj) {
        ArrayList arrayList = new ArrayList();
        vey0[] vey0VarArr = this.f140542g;
        int length = vey0VarArr.length;
        boolean z = false;
        for (int i = 0; i < 2; i++) {
            vey0 vey0Var = vey0VarArr[i];
            if (vey0Var.mo97570c() == 2) {
                jey0 jey0VarM161840O = m161840O(vey0Var);
                jey0VarM161840O.m144634f(1);
                jey0VarM161840O.m144633e(obj);
                jey0VarM161840O.m144632d();
                arrayList.add(jey0VarM161840O);
            }
        }
        Object obj2 = this.f140516L;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((jey0) it.next()).m144637i(this.f140505A);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z = true;
            }
            Object obj3 = this.f140516L;
            Surface surface = this.f140517M;
            if (obj3 == surface) {
                surface.release();
                this.f140517M = null;
            }
        }
        this.f140516L = obj;
        if (z) {
            m161845T(zziz.zzd(new zzla(3), 1003));
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m161845T(@Nullable zziz zzizVar) {
        edy0 edy0Var = this.f140533b0;
        edy0 edy0VarM120530a = edy0Var.m120530a(edy0Var.f93591b);
        edy0VarM120530a.f93605p = edy0VarM120530a.f93607r;
        edy0VarM120530a.f93606q = 0L;
        edy0 edy0VarM120534e = edy0VarM120530a.m120534e(1);
        if (zzizVar != null) {
            edy0VarM120534e = edy0VarM120534e.m120533d(zzizVar);
        }
        this.f140506B++;
        this.f140545j.m12631a0();
        m161847V(edy0VarM120534e, 0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX INFO: renamed from: U */
    public final void m161846U(boolean z, int i, int i2) {
        int i3 = 0;
        boolean z2 = z && i != -1;
        if (z2 && i != 1) {
            i3 = 1;
        }
        edy0 edy0Var = this.f140533b0;
        if (edy0Var.f93601l == z2 && edy0Var.f93602m == i3) {
            return;
        }
        this.f140506B++;
        edy0 edy0VarM120532c = edy0Var.m120532c(z2, i3);
        this.f140545j.m12629Z(z2, i3);
        m161847V(edy0VarM120532c, 0, i2, false, 5, -9223372036854775807L, -1, false);
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
    /* JADX WARN: Type inference failed for: r5v6, types: [l.d0u0] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX INFO: renamed from: V */
    public final void m161847V(final edy0 edy0Var, final int i, final int i2, boolean z, int i3, long j, int i4, boolean z2) {
        int i5;
        int i6;
        boolean z3;
        Pair pair;
        boolean z4;
        boolean z5;
        int i7;
        boolean zBooleanValue;
        final int iIntValue;
        final trs0 trs0Var;
        d0u0 d0u0VarZzn;
        rzs0 rzs0VarM100823M;
        boolean zEquals;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        u5z0 u5z0Var;
        u5z0 u5z0Var2;
        ojt0 ojt0Var;
        oot0 oot0Var;
        boolean zMo158180g;
        aey0 aey0Var;
        d0u0 d0u0VarZzn2;
        oot0 oot0Var2;
        boolean z10;
        d0u0 d0u0VarZzn3;
        ?? r13;
        int iMo113465k;
        int i8;
        boolean z11;
        ?? Zzn;
        int iZzd;
        ?? r5;
        d0u0 d0u0VarZzn4;
        boolean z12;
        long j2;
        d0u0 d0u0VarZzn5;
        boolean z13;
        boolean zM113469o;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        ojt0 ojt0VarM97922e;
        hwt0 hwt0Var;
        int i9;
        Object obj;
        trs0 trs0Var2;
        Object obj2;
        int i10;
        kzy0 kzy0Var;
        boolean zM152240b;
        long jM161817K;
        long jM161817K2;
        int iZzd2;
        Object obj3;
        trs0 trs0Var3;
        Object obj4;
        int iMo113457a;
        long jM159396I;
        long jM159396I2;
        boolean zM152240b2;
        kzy0 kzy0Var2;
        axs0 axs0VarM183838a;
        List list;
        int i11;
        zzby zzbyVar;
        final int i12 = i3;
        edy0 edy0Var2 = this.f140533b0;
        this.f140533b0 = edy0Var;
        boolean zEquals2 = edy0Var2.f93590a.equals(edy0Var.f93590a);
        d0u0 d0u0Var = edy0Var2.f93590a;
        d0u0 d0u0Var2 = edy0Var.f93590a;
        int i13 = 0;
        if (!d0u0Var2.m113469o() || !d0u0Var.m113469o()) {
            i5 = 3;
            if (d0u0Var2.m113469o() != d0u0Var.m113469o()) {
                pair = new Pair(Boolean.TRUE, 3);
            } else if (d0u0Var.mo107663e(d0u0Var.mo113468n(edy0Var2.f93591b.f129476a, this.f140548m).f111930c, this.f70834a, 0L).f191691a.equals(d0u0Var2.mo107663e(d0u0Var2.mo113468n(edy0Var.f93591b.f129476a, this.f140548m).f111930c, this.f70834a, 0L).f191691a)) {
                if (!z) {
                    i6 = i12;
                    z3 = false;
                } else if (i12 != 0) {
                    i6 = i12;
                    z3 = true;
                } else if (edy0Var2.f93591b.f129479d < edy0Var.f93591b.f129479d) {
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
                    wpg0.m207458a();
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
                if (edy0Var.f93590a.m113469o()) {
                    trs0Var = null;
                } else {
                    trs0Var = edy0Var.f93590a.mo107663e(edy0Var.f93590a.mo113468n(edy0Var.f93591b.f129476a, this.f140548m).f111930c, this.f70834a, 0L).f191693c;
                }
                this.f140531a0 = rzs0.f165600y;
            } else {
                trs0Var = null;
            }
            if (!edy0Var2.f93599j.equals(edy0Var.f93599j)) {
                axs0VarM183838a = this.f140531a0.m183838a();
                list = edy0Var.f93599j;
                i11 = 0;
                while (i11 < list.size()) {
                    zzbyVar = (zzby) list.get(i11);
                    while (i13 < zzbyVar.m13605a()) {
                        zzbyVar.m13606b(i13).mo13592a0(axs0VarM183838a);
                        i13++;
                    }
                    i11++;
                    i13 = 0;
                }
                this.f140531a0 = axs0VarM183838a.m100823M();
            }
            d0u0VarZzn = zzn();
            if (d0u0VarZzn.m113469o()) {
                rzs0VarM100823M = this.f140531a0;
            } else {
                trs0 trs0Var4 = d0u0VarZzn.mo107663e(zzd(), this.f70834a, 0L).f191693c;
                axs0 axs0VarM183838a2 = this.f140531a0.m183838a();
                axs0VarM183838a2.m100825t(trs0Var4.f175942e);
                rzs0VarM100823M = axs0VarM183838a2.m100823M();
            }
            zEquals = rzs0VarM100823M.equals(this.f140512H);
            this.f140512H = rzs0VarM100823M;
            if (edy0Var2.f93601l != edy0Var.f93601l) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (edy0Var2.f93594e != edy0Var.f93594e) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (z7 || z6) {
                m161848W();
            }
            if (edy0Var2.f93596g != edy0Var.f93596g) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (!zEquals2) {
                this.f140546k.m128567d(0, new mwv0() { // from class: l.z0y0
                    @Override // p153l.mwv0
                    public final void zza(Object obj5) {
                        int i15 = n6y0.f140504g0;
                        ((pkt0) obj5).mo141196K(edy0Var.f93590a, i);
                    }
                });
            }
            if (z4) {
                hwt0Var = new hwt0();
                if (edy0Var2.f93590a.m113469o()) {
                    i9 = i4;
                    obj = null;
                    trs0Var2 = null;
                    obj2 = null;
                    i10 = -1;
                } else {
                    Object obj5 = edy0Var2.f93591b.f129476a;
                    edy0Var2.f93590a.mo113468n(obj5, hwt0Var);
                    int i15 = hwt0Var.f111930c;
                    int iMo113457a2 = edy0Var2.f93590a.mo113457a(obj5);
                    obj = edy0Var2.f93590a.mo107663e(i15, this.f70834a, 0L).f191691a;
                    trs0Var2 = this.f70834a.f191693c;
                    obj2 = obj5;
                    i9 = i15;
                    i10 = iMo113457a2;
                }
                kzy0Var = edy0Var2.f93591b;
                if (i12 == 0) {
                    zM152240b2 = kzy0Var.m152240b();
                    kzy0Var2 = edy0Var2.f93591b;
                    if (zM152240b2) {
                        jM161817K = hwt0Var.m137512h(kzy0Var2.f129477b, kzy0Var2.f129478c);
                        jM161817K2 = m161817K(edy0Var2);
                    } else {
                        if (kzy0Var2.f129480e != -1) {
                            jM161817K = m161817K(this.f140533b0);
                        } else {
                            jM161817K = hwt0Var.f111931d;
                        }
                        jM161817K2 = jM161817K;
                    }
                } else {
                    zM152240b = kzy0Var.m152240b();
                    jM161817K = edy0Var2.f93607r;
                    if (zM152240b) {
                        jM161817K2 = m161817K(edy0Var2);
                    } else {
                        jM161817K2 = jM161817K;
                    }
                }
                int i16 = mpw0.f137957a;
                kzy0 kzy0Var3 = edy0Var2.f93591b;
                final gnt0 gnt0Var = new gnt0(obj, i9, trs0Var2, obj2, i10, mpw0.m159396I(jM161817K), mpw0.m159396I(jM161817K2), kzy0Var3.f129477b, kzy0Var3.f129478c);
                iZzd2 = zzd();
                if (this.f140533b0.f93590a.m113469o()) {
                    obj3 = null;
                    trs0Var3 = null;
                    obj4 = null;
                    iMo113457a = -1;
                } else {
                    edy0 edy0Var3 = this.f140533b0;
                    Object obj6 = edy0Var3.f93591b.f129476a;
                    edy0Var3.f93590a.mo113468n(obj6, this.f140548m);
                    iMo113457a = this.f140533b0.f93590a.mo113457a(obj6);
                    obj4 = obj6;
                    obj3 = this.f140533b0.f93590a.mo107663e(iZzd2, this.f70834a, 0L).f191691a;
                    trs0Var3 = this.f70834a.f191693c;
                }
                jM159396I = mpw0.m159396I(j);
                if (this.f140533b0.f93591b.m152240b()) {
                    jM159396I2 = mpw0.m159396I(m161817K(this.f140533b0));
                } else {
                    jM159396I2 = jM159396I;
                }
                kzy0 kzy0Var4 = this.f140533b0.f93591b;
                final gnt0 gnt0Var2 = new gnt0(obj3, iZzd2, trs0Var3, obj4, iMo113457a, jM159396I, jM159396I2, kzy0Var4.f129477b, kzy0Var4.f129478c);
                this.f140546k.m128567d(11, new mwv0() { // from class: l.w1y0
                    @Override // p153l.mwv0
                    public final void zza(Object obj7) {
                        int i17 = n6y0.f140504g0;
                        ((pkt0) obj7).mo141187B(gnt0Var, gnt0Var2, i12);
                    }
                });
            } else {
                z6 = z6;
                zEquals = zEquals;
                z7 = z7;
            }
            if (zBooleanValue) {
                z9 = true;
                this.f140546k.m128567d(1, new mwv0() { // from class: l.d2y0
                    @Override // p153l.mwv0
                    public final void zza(Object obj7) {
                        int i17 = n6y0.f140504g0;
                        ((pkt0) obj7).mo141226k(trs0Var, iIntValue);
                    }
                });
            } else {
                z9 = true;
            }
            if (edy0Var2.f93595f != edy0Var.f93595f) {
                this.f140546k.m128567d(10, new mwv0() { // from class: l.h2y0
                    @Override // p153l.mwv0
                    public final void zza(Object obj7) {
                        int i17 = n6y0.f140504g0;
                        ((pkt0) obj7).mo141235u(edy0Var.f93595f);
                    }
                });
                if (edy0Var.f93595f != null) {
                    this.f140546k.m128567d(10, new mwv0() { // from class: l.l2y0
                        @Override // p153l.mwv0
                        public final void zza(Object obj7) {
                            int i17 = n6y0.f140504g0;
                            ((pkt0) obj7).mo141228m(edy0Var.f93595f);
                        }
                    });
                }
            }
            u5z0Var = edy0Var2.f93598i;
            u5z0Var2 = edy0Var.f93598i;
            if (u5z0Var != u5z0Var2) {
                this.f140543h.mo175538f(u5z0Var2.f177701e);
                this.f140546k.m128567d(2, new mwv0() { // from class: l.q2y0
                    @Override // p153l.mwv0
                    public final void zza(Object obj7) {
                        int i17 = n6y0.f140504g0;
                        ((pkt0) obj7).mo141239y(edy0Var.f93598i.f177700d);
                    }
                });
            }
            if (!zEquals) {
                final rzs0 rzs0Var = this.f140512H;
                this.f140546k.m128567d(14, new mwv0() { // from class: l.v2y0
                    @Override // p153l.mwv0
                    public final void zza(Object obj7) {
                        int i17 = n6y0.f140504g0;
                        ((pkt0) obj7).mo141200O(rzs0Var);
                    }
                });
            }
            if (z8) {
                this.f140546k.m128567d(i5, new mwv0() { // from class: l.a3y0
                    @Override // p153l.mwv0
                    public final void zza(Object obj7) {
                        int i17 = n6y0.f140504g0;
                        ((pkt0) obj7).zzb(edy0Var.f93596g);
                    }
                });
            }
            if (z7 || z6) {
                this.f140546k.m128567d(-1, new mwv0() { // from class: l.e3y0
                    @Override // p153l.mwv0
                    public final void zza(Object obj7) {
                        int i17 = n6y0.f140504g0;
                        edy0 edy0Var4 = edy0Var;
                        ((pkt0) obj7).mo141202Q(edy0Var4.f93601l, edy0Var4.f93594e);
                    }
                });
            }
            if (z7) {
                this.f140546k.m128567d(4, new mwv0() { // from class: l.d4y0
                    @Override // p153l.mwv0
                    public final void zza(Object obj7) {
                        int i17 = n6y0.f140504g0;
                        ((pkt0) obj7).zzh(edy0Var.f93594e);
                    }
                });
            }
            if (z6) {
                this.f140546k.m128567d(5, new mwv0() { // from class: l.d1y0
                    @Override // p153l.mwv0
                    public final void zza(Object obj7) {
                        int i17 = n6y0.f140504g0;
                        ((pkt0) obj7).mo141191F(edy0Var.f93601l, i2);
                    }
                });
            }
            if (edy0Var2.f93602m != edy0Var.f93602m) {
                this.f140546k.m128567d(6, new mwv0() { // from class: l.i1y0
                    @Override // p153l.mwv0
                    public final void zza(Object obj7) {
                        int i17 = n6y0.f140504g0;
                        ((pkt0) obj7).mo141229n(edy0Var.f93602m);
                    }
                });
            }
            if (edy0Var2.m120536i() != edy0Var.m120536i()) {
                this.f140546k.m128567d(7, new mwv0() { // from class: l.m1y0
                    @Override // p153l.mwv0
                    public final void zza(Object obj7) {
                        int i17 = n6y0.f140504g0;
                        ((pkt0) obj7).mo141211a(edy0Var.m120536i());
                    }
                });
            }
            if (!edy0Var2.f93603n.equals(edy0Var.f93603n)) {
                this.f140546k.m128567d(12, new mwv0() { // from class: l.r1y0
                    @Override // p153l.mwv0
                    public final void zza(Object obj7) {
                        int i17 = n6y0.f140504g0;
                        ((pkt0) obj7).mo141222g(edy0Var.f93603n);
                    }
                });
            }
            ojt0Var = this.f140511G;
            oot0Var = this.f140540f;
            ojt0 ojt0Var2 = this.f140534c;
            int i17 = mpw0.f137957a;
            zMo158180g = oot0Var.mo158180g();
            aey0Var = (aey0) oot0Var;
            d0u0VarZzn2 = aey0Var.zzn();
            if (!d0u0VarZzn2.m113469o()) {
                oot0Var2 = oot0Var;
                z10 = d0u0VarZzn2.mo107663e(aey0Var.zzd(), aey0Var.f70834a, 0L).f191697g ? z9 : false;
                d0u0VarZzn3 = aey0Var.zzn();
                if (d0u0VarZzn3.m113469o()) {
                    i8 = -1;
                    r13 = 0;
                    z11 = false;
                } else {
                    int iZzd3 = aey0Var.zzd();
                    aey0Var.zzh();
                    aey0Var.mo158181k();
                    r13 = 0;
                    r13 = 0;
                    iMo113465k = d0u0VarZzn3.mo113465k(iZzd3, 0, false);
                    i8 = -1;
                    if (iMo113465k != -1) {
                        z11 = z9;
                    } else {
                        z11 = false;
                    }
                }
                Zzn = aey0Var.zzn();
                if (Zzn.m113469o()) {
                    r5 = r13;
                } else {
                    iZzd = aey0Var.zzd();
                    aey0Var.zzh();
                    aey0Var.mo158181k();
                    if (Zzn.mo113464j(iZzd, r13, r13) != i8) {
                        r5 = z9;
                    } else {
                        r5 = r13;
                    }
                }
                d0u0VarZzn4 = aey0Var.zzn();
                if (!d0u0VarZzn4.m113469o()) {
                    z12 = zMo158180g;
                    j2 = 0;
                    boolean z20 = d0u0VarZzn4.mo107663e(aey0Var.zzd(), aey0Var.f70834a, 0L).m208629b() ? z9 : false;
                    d0u0VarZzn5 = aey0Var.zzn();
                    if (d0u0VarZzn5.m113469o() && d0u0VarZzn5.mo107663e(aey0Var.zzd(), aey0Var.f70834a, j2).f191698h) {
                        z13 = z9;
                    } else {
                        z13 = false;
                    }
                    zM113469o = oot0Var2.zzn().m113469o();
                    aht0 aht0Var = new aht0();
                    aht0Var.m97919b(ojt0Var2);
                    boolean z21 = !z12;
                    aht0Var.m97921d(4, z21);
                    if (z10 || z12) {
                        z14 = false;
                    } else {
                        z14 = z9;
                    }
                    aht0Var.m97921d(5, z14);
                    if (z11 || z12) {
                        z15 = false;
                    } else {
                        z15 = z9;
                    }
                    aht0Var.m97921d(6, z15);
                    if (!zM113469o || (!(z11 || !z20 || z10) || z12)) {
                        z16 = false;
                    } else {
                        z16 = z9;
                    }
                    aht0Var.m97921d(7, z16);
                    if (r5 != 0 || z12) {
                        z17 = false;
                    } else {
                        z17 = z9;
                    }
                    aht0Var.m97921d(8, z17);
                    if (!zM113469o || ((r5 == 0 && !(z20 && z13)) || z12)) {
                        z18 = false;
                    } else {
                        z18 = z9;
                    }
                    aht0Var.m97921d(9, z18);
                    aht0Var.m97921d(10, z21);
                    if (z10 || z12) {
                        z19 = false;
                    } else {
                        z19 = z9;
                    }
                    aht0Var.m97921d(11, z19);
                    if (z10 || z12) {
                        z9 = false;
                    }
                    aht0Var.m97921d(12, z9);
                    ojt0VarM97922e = aht0Var.m97922e();
                    this.f140511G = ojt0VarM97922e;
                    if (!ojt0VarM97922e.equals(ojt0Var)) {
                        this.f140546k.m128567d(13, new mwv0() { // from class: l.u0y0
                            @Override // p153l.mwv0
                            public final void zza(Object obj7) {
                                this.f176954a.m161833E((pkt0) obj7);
                            }
                        });
                    }
                    this.f140546k.m128566c();
                }
                z12 = zMo158180g;
                j2 = 0;
                d0u0VarZzn5 = aey0Var.zzn();
                if (d0u0VarZzn5.m113469o()) {
                    z13 = false;
                } else {
                    z13 = false;
                }
                zM113469o = oot0Var2.zzn().m113469o();
                aht0 aht0Var2 = new aht0();
                aht0Var2.m97919b(ojt0Var2);
                boolean z22 = !z12;
                aht0Var2.m97921d(4, z22);
                if (z10) {
                    z14 = false;
                } else {
                    z14 = false;
                }
                aht0Var2.m97921d(5, z14);
                if (z11) {
                    z15 = false;
                } else {
                    z15 = false;
                }
                aht0Var2.m97921d(6, z15);
                if (zM113469o) {
                    z16 = false;
                } else {
                    z16 = false;
                }
                aht0Var2.m97921d(7, z16);
                if (r5 != 0) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                aht0Var2.m97921d(8, z17);
                if (zM113469o) {
                    z18 = false;
                } else {
                    z18 = false;
                }
                aht0Var2.m97921d(9, z18);
                aht0Var2.m97921d(10, z22);
                if (z10) {
                    z19 = false;
                } else {
                    z19 = false;
                }
                aht0Var2.m97921d(11, z19);
                if (z10) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                aht0Var2.m97921d(12, z9);
                ojt0VarM97922e = aht0Var2.m97922e();
                this.f140511G = ojt0VarM97922e;
                if (!ojt0VarM97922e.equals(ojt0Var)) {
                    this.f140546k.m128567d(13, new mwv0() { // from class: l.u0y0
                        @Override // p153l.mwv0
                        public final void zza(Object obj7) {
                            this.f176954a.m161833E((pkt0) obj7);
                        }
                    });
                }
                this.f140546k.m128566c();
            }
            oot0Var2 = oot0Var;
            d0u0VarZzn3 = aey0Var.zzn();
            if (d0u0VarZzn3.m113469o()) {
                i8 = -1;
                r13 = 0;
                z11 = false;
            } else {
                int iZzd4 = aey0Var.zzd();
                aey0Var.zzh();
                aey0Var.mo158181k();
                r13 = 0;
                r13 = 0;
                iMo113465k = d0u0VarZzn3.mo113465k(iZzd4, 0, false);
                i8 = -1;
                if (iMo113465k != -1) {
                    z11 = z9;
                } else {
                    z11 = false;
                }
            }
            Zzn = aey0Var.zzn();
            if (Zzn.m113469o()) {
                r5 = r13;
            } else {
                iZzd = aey0Var.zzd();
                aey0Var.zzh();
                aey0Var.mo158181k();
                if (Zzn.mo113464j(iZzd, r13, r13) != i8) {
                    r5 = z9;
                } else {
                    r5 = r13;
                }
            }
            d0u0VarZzn4 = aey0Var.zzn();
            if (!d0u0VarZzn4.m113469o()) {
                z12 = zMo158180g;
                j2 = 0;
                if (d0u0VarZzn4.mo107663e(aey0Var.zzd(), aey0Var.f70834a, 0L).m208629b()) {
                }
                d0u0VarZzn5 = aey0Var.zzn();
                if (d0u0VarZzn5.m113469o()) {
                    z13 = false;
                } else {
                    z13 = false;
                }
                zM113469o = oot0Var2.zzn().m113469o();
                aht0 aht0Var3 = new aht0();
                aht0Var3.m97919b(ojt0Var2);
                boolean z23 = !z12;
                aht0Var3.m97921d(4, z23);
                if (z10) {
                    z14 = false;
                } else {
                    z14 = false;
                }
                aht0Var3.m97921d(5, z14);
                if (z11) {
                    z15 = false;
                } else {
                    z15 = false;
                }
                aht0Var3.m97921d(6, z15);
                if (zM113469o) {
                    z16 = false;
                } else {
                    z16 = false;
                }
                aht0Var3.m97921d(7, z16);
                if (r5 != 0) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                aht0Var3.m97921d(8, z17);
                if (zM113469o) {
                    z18 = false;
                } else {
                    z18 = false;
                }
                aht0Var3.m97921d(9, z18);
                aht0Var3.m97921d(10, z23);
                if (z10) {
                    z19 = false;
                } else {
                    z19 = false;
                }
                aht0Var3.m97921d(11, z19);
                if (z10) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                aht0Var3.m97921d(12, z9);
                ojt0VarM97922e = aht0Var3.m97922e();
                this.f140511G = ojt0VarM97922e;
                if (!ojt0VarM97922e.equals(ojt0Var)) {
                    this.f140546k.m128567d(13, new mwv0() { // from class: l.u0y0
                        @Override // p153l.mwv0
                        public final void zza(Object obj7) {
                            this.f176954a.m161833E((pkt0) obj7);
                        }
                    });
                }
                this.f140546k.m128566c();
            }
            z12 = zMo158180g;
            j2 = 0;
            d0u0VarZzn5 = aey0Var.zzn();
            if (d0u0VarZzn5.m113469o()) {
                z13 = false;
            } else {
                z13 = false;
            }
            zM113469o = oot0Var2.zzn().m113469o();
            aht0 aht0Var4 = new aht0();
            aht0Var4.m97919b(ojt0Var2);
            boolean z24 = !z12;
            aht0Var4.m97921d(4, z24);
            if (z10) {
                z14 = false;
            } else {
                z14 = false;
            }
            aht0Var4.m97921d(5, z14);
            if (z11) {
                z15 = false;
            } else {
                z15 = false;
            }
            aht0Var4.m97921d(6, z15);
            if (zM113469o) {
                z16 = false;
            } else {
                z16 = false;
            }
            aht0Var4.m97921d(7, z16);
            if (r5 != 0) {
                z17 = false;
            } else {
                z17 = false;
            }
            aht0Var4.m97921d(8, z17);
            if (zM113469o) {
                z18 = false;
            } else {
                z18 = false;
            }
            aht0Var4.m97921d(9, z18);
            aht0Var4.m97921d(10, z24);
            if (z10) {
                z19 = false;
            } else {
                z19 = false;
            }
            aht0Var4.m97921d(11, z19);
            if (z10) {
                z9 = false;
            } else {
                z9 = false;
            }
            aht0Var4.m97921d(12, z9);
            ojt0VarM97922e = aht0Var4.m97922e();
            this.f140511G = ojt0VarM97922e;
            if (!ojt0VarM97922e.equals(ojt0Var)) {
                this.f140546k.m128567d(13, new mwv0() { // from class: l.u0y0
                    @Override // p153l.mwv0
                    public final void zza(Object obj7) {
                        this.f176954a.m161833E((pkt0) obj7);
                    }
                });
            }
            this.f140546k.m128566c();
        }
        pair = new Pair(Boolean.FALSE, -1);
        i5 = 3;
        z4 = z;
        zBooleanValue = ((Boolean) pair.first).booleanValue();
        iIntValue = ((Integer) pair.second).intValue();
        if (zBooleanValue) {
            if (edy0Var.f93590a.m113469o()) {
                trs0Var = edy0Var.f93590a.mo107663e(edy0Var.f93590a.mo113468n(edy0Var.f93591b.f129476a, this.f140548m).f111930c, this.f70834a, 0L).f191693c;
            } else {
                trs0Var = null;
            }
            this.f140531a0 = rzs0.f165600y;
        } else {
            trs0Var = null;
        }
        if (!edy0Var2.f93599j.equals(edy0Var.f93599j)) {
            axs0VarM183838a = this.f140531a0.m183838a();
            list = edy0Var.f93599j;
            i11 = 0;
            while (i11 < list.size()) {
                zzbyVar = (zzby) list.get(i11);
                while (i13 < zzbyVar.m13605a()) {
                    zzbyVar.m13606b(i13).mo13592a0(axs0VarM183838a);
                    i13++;
                }
                i11++;
                i13 = 0;
            }
            this.f140531a0 = axs0VarM183838a.m100823M();
        }
        d0u0VarZzn = zzn();
        if (d0u0VarZzn.m113469o()) {
            rzs0VarM100823M = this.f140531a0;
        } else {
            trs0 trs0Var5 = d0u0VarZzn.mo107663e(zzd(), this.f70834a, 0L).f191693c;
            axs0 axs0VarM183838a3 = this.f140531a0.m183838a();
            axs0VarM183838a3.m100825t(trs0Var5.f175942e);
            rzs0VarM100823M = axs0VarM183838a3.m100823M();
        }
        zEquals = rzs0VarM100823M.equals(this.f140512H);
        this.f140512H = rzs0VarM100823M;
        if (edy0Var2.f93601l != edy0Var.f93601l) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (edy0Var2.f93594e != edy0Var.f93594e) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7) {
            m161848W();
        } else {
            m161848W();
        }
        if (edy0Var2.f93596g != edy0Var.f93596g) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (!zEquals2) {
            this.f140546k.m128567d(0, new mwv0() { // from class: l.z0y0
                @Override // p153l.mwv0
                public final void zza(Object obj7) {
                    int i18 = n6y0.f140504g0;
                    ((pkt0) obj7).mo141196K(edy0Var.f93590a, i);
                }
            });
        }
        if (z4) {
            hwt0Var = new hwt0();
            if (edy0Var2.f93590a.m113469o()) {
                Object obj7 = edy0Var2.f93591b.f129476a;
                edy0Var2.f93590a.mo113468n(obj7, hwt0Var);
                int i18 = hwt0Var.f111930c;
                int iMo113457a3 = edy0Var2.f93590a.mo113457a(obj7);
                obj = edy0Var2.f93590a.mo107663e(i18, this.f70834a, 0L).f191691a;
                trs0Var2 = this.f70834a.f191693c;
                obj2 = obj7;
                i9 = i18;
                i10 = iMo113457a3;
            } else {
                i9 = i4;
                obj = null;
                trs0Var2 = null;
                obj2 = null;
                i10 = -1;
            }
            kzy0Var = edy0Var2.f93591b;
            if (i12 == 0) {
                zM152240b2 = kzy0Var.m152240b();
                kzy0Var2 = edy0Var2.f93591b;
                if (zM152240b2) {
                    jM161817K = hwt0Var.m137512h(kzy0Var2.f129477b, kzy0Var2.f129478c);
                    jM161817K2 = m161817K(edy0Var2);
                } else {
                    if (kzy0Var2.f129480e != -1) {
                        jM161817K = m161817K(this.f140533b0);
                    } else {
                        jM161817K = hwt0Var.f111931d;
                    }
                    jM161817K2 = jM161817K;
                }
            } else {
                zM152240b = kzy0Var.m152240b();
                jM161817K = edy0Var2.f93607r;
                if (zM152240b) {
                    jM161817K2 = m161817K(edy0Var2);
                } else {
                    jM161817K2 = jM161817K;
                }
            }
            int i19 = mpw0.f137957a;
            kzy0 kzy0Var5 = edy0Var2.f93591b;
            final gnt0 gnt0Var3 = new gnt0(obj, i9, trs0Var2, obj2, i10, mpw0.m159396I(jM161817K), mpw0.m159396I(jM161817K2), kzy0Var5.f129477b, kzy0Var5.f129478c);
            iZzd2 = zzd();
            if (this.f140533b0.f93590a.m113469o()) {
                edy0 edy0Var4 = this.f140533b0;
                Object obj8 = edy0Var4.f93591b.f129476a;
                edy0Var4.f93590a.mo113468n(obj8, this.f140548m);
                iMo113457a = this.f140533b0.f93590a.mo113457a(obj8);
                obj4 = obj8;
                obj3 = this.f140533b0.f93590a.mo107663e(iZzd2, this.f70834a, 0L).f191691a;
                trs0Var3 = this.f70834a.f191693c;
            } else {
                obj3 = null;
                trs0Var3 = null;
                obj4 = null;
                iMo113457a = -1;
            }
            jM159396I = mpw0.m159396I(j);
            if (this.f140533b0.f93591b.m152240b()) {
                jM159396I2 = mpw0.m159396I(m161817K(this.f140533b0));
            } else {
                jM159396I2 = jM159396I;
            }
            kzy0 kzy0Var6 = this.f140533b0.f93591b;
            final gnt0 gnt0Var4 = new gnt0(obj3, iZzd2, trs0Var3, obj4, iMo113457a, jM159396I, jM159396I2, kzy0Var6.f129477b, kzy0Var6.f129478c);
            this.f140546k.m128567d(11, new mwv0() { // from class: l.w1y0
                @Override // p153l.mwv0
                public final void zza(Object obj9) {
                    int i110 = n6y0.f140504g0;
                    ((pkt0) obj9).mo141187B(gnt0Var3, gnt0Var4, i12);
                }
            });
        } else {
            z6 = z6;
            zEquals = zEquals;
            z7 = z7;
        }
        if (zBooleanValue) {
            z9 = true;
            this.f140546k.m128567d(1, new mwv0() { // from class: l.d2y0
                @Override // p153l.mwv0
                public final void zza(Object obj9) {
                    int i110 = n6y0.f140504g0;
                    ((pkt0) obj9).mo141226k(trs0Var, iIntValue);
                }
            });
        } else {
            z9 = true;
        }
        if (edy0Var2.f93595f != edy0Var.f93595f) {
            this.f140546k.m128567d(10, new mwv0() { // from class: l.h2y0
                @Override // p153l.mwv0
                public final void zza(Object obj9) {
                    int i110 = n6y0.f140504g0;
                    ((pkt0) obj9).mo141235u(edy0Var.f93595f);
                }
            });
            if (edy0Var.f93595f != null) {
                this.f140546k.m128567d(10, new mwv0() { // from class: l.l2y0
                    @Override // p153l.mwv0
                    public final void zza(Object obj9) {
                        int i110 = n6y0.f140504g0;
                        ((pkt0) obj9).mo141228m(edy0Var.f93595f);
                    }
                });
            }
        }
        u5z0Var = edy0Var2.f93598i;
        u5z0Var2 = edy0Var.f93598i;
        if (u5z0Var != u5z0Var2) {
            this.f140543h.mo175538f(u5z0Var2.f177701e);
            this.f140546k.m128567d(2, new mwv0() { // from class: l.q2y0
                @Override // p153l.mwv0
                public final void zza(Object obj9) {
                    int i110 = n6y0.f140504g0;
                    ((pkt0) obj9).mo141239y(edy0Var.f93598i.f177700d);
                }
            });
        }
        if (!zEquals) {
            final rzs0 rzs0Var2 = this.f140512H;
            this.f140546k.m128567d(14, new mwv0() { // from class: l.v2y0
                @Override // p153l.mwv0
                public final void zza(Object obj9) {
                    int i110 = n6y0.f140504g0;
                    ((pkt0) obj9).mo141200O(rzs0Var2);
                }
            });
        }
        if (z8) {
            this.f140546k.m128567d(i5, new mwv0() { // from class: l.a3y0
                @Override // p153l.mwv0
                public final void zza(Object obj9) {
                    int i110 = n6y0.f140504g0;
                    ((pkt0) obj9).zzb(edy0Var.f93596g);
                }
            });
        }
        if (z7) {
            this.f140546k.m128567d(-1, new mwv0() { // from class: l.e3y0
                @Override // p153l.mwv0
                public final void zza(Object obj9) {
                    int i110 = n6y0.f140504g0;
                    edy0 edy0Var5 = edy0Var;
                    ((pkt0) obj9).mo141202Q(edy0Var5.f93601l, edy0Var5.f93594e);
                }
            });
        } else {
            this.f140546k.m128567d(-1, new mwv0() { // from class: l.e3y0
                @Override // p153l.mwv0
                public final void zza(Object obj9) {
                    int i110 = n6y0.f140504g0;
                    edy0 edy0Var5 = edy0Var;
                    ((pkt0) obj9).mo141202Q(edy0Var5.f93601l, edy0Var5.f93594e);
                }
            });
        }
        if (z7) {
            this.f140546k.m128567d(4, new mwv0() { // from class: l.d4y0
                @Override // p153l.mwv0
                public final void zza(Object obj9) {
                    int i110 = n6y0.f140504g0;
                    ((pkt0) obj9).zzh(edy0Var.f93594e);
                }
            });
        }
        if (z6) {
            this.f140546k.m128567d(5, new mwv0() { // from class: l.d1y0
                @Override // p153l.mwv0
                public final void zza(Object obj9) {
                    int i110 = n6y0.f140504g0;
                    ((pkt0) obj9).mo141191F(edy0Var.f93601l, i2);
                }
            });
        }
        if (edy0Var2.f93602m != edy0Var.f93602m) {
            this.f140546k.m128567d(6, new mwv0() { // from class: l.i1y0
                @Override // p153l.mwv0
                public final void zza(Object obj9) {
                    int i110 = n6y0.f140504g0;
                    ((pkt0) obj9).mo141229n(edy0Var.f93602m);
                }
            });
        }
        if (edy0Var2.m120536i() != edy0Var.m120536i()) {
            this.f140546k.m128567d(7, new mwv0() { // from class: l.m1y0
                @Override // p153l.mwv0
                public final void zza(Object obj9) {
                    int i110 = n6y0.f140504g0;
                    ((pkt0) obj9).mo141211a(edy0Var.m120536i());
                }
            });
        }
        if (!edy0Var2.f93603n.equals(edy0Var.f93603n)) {
            this.f140546k.m128567d(12, new mwv0() { // from class: l.r1y0
                @Override // p153l.mwv0
                public final void zza(Object obj9) {
                    int i110 = n6y0.f140504g0;
                    ((pkt0) obj9).mo141222g(edy0Var.f93603n);
                }
            });
        }
        ojt0Var = this.f140511G;
        oot0Var = this.f140540f;
        ojt0 ojt0Var3 = this.f140534c;
        int i110 = mpw0.f137957a;
        zMo158180g = oot0Var.mo158180g();
        aey0Var = (aey0) oot0Var;
        d0u0VarZzn2 = aey0Var.zzn();
        if (!d0u0VarZzn2.m113469o()) {
            oot0Var2 = oot0Var;
            if (d0u0VarZzn2.mo107663e(aey0Var.zzd(), aey0Var.f70834a, 0L).f191697g) {
            }
            d0u0VarZzn3 = aey0Var.zzn();
            if (d0u0VarZzn3.m113469o()) {
                i8 = -1;
                r13 = 0;
                z11 = false;
            } else {
                int iZzd5 = aey0Var.zzd();
                aey0Var.zzh();
                aey0Var.mo158181k();
                r13 = 0;
                r13 = 0;
                iMo113465k = d0u0VarZzn3.mo113465k(iZzd5, 0, false);
                i8 = -1;
                if (iMo113465k != -1) {
                    z11 = z9;
                } else {
                    z11 = false;
                }
            }
            Zzn = aey0Var.zzn();
            if (Zzn.m113469o()) {
                r5 = r13;
            } else {
                iZzd = aey0Var.zzd();
                aey0Var.zzh();
                aey0Var.mo158181k();
                if (Zzn.mo113464j(iZzd, r13, r13) != i8) {
                    r5 = z9;
                } else {
                    r5 = r13;
                }
            }
            d0u0VarZzn4 = aey0Var.zzn();
            if (!d0u0VarZzn4.m113469o()) {
                z12 = zMo158180g;
                j2 = 0;
                if (d0u0VarZzn4.mo107663e(aey0Var.zzd(), aey0Var.f70834a, 0L).m208629b()) {
                }
                d0u0VarZzn5 = aey0Var.zzn();
                if (d0u0VarZzn5.m113469o()) {
                    z13 = false;
                } else {
                    z13 = false;
                }
                zM113469o = oot0Var2.zzn().m113469o();
                aht0 aht0Var5 = new aht0();
                aht0Var5.m97919b(ojt0Var3);
                boolean z25 = !z12;
                aht0Var5.m97921d(4, z25);
                if (z10) {
                    z14 = false;
                } else {
                    z14 = false;
                }
                aht0Var5.m97921d(5, z14);
                if (z11) {
                    z15 = false;
                } else {
                    z15 = false;
                }
                aht0Var5.m97921d(6, z15);
                if (zM113469o) {
                    z16 = false;
                } else {
                    z16 = false;
                }
                aht0Var5.m97921d(7, z16);
                if (r5 != 0) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                aht0Var5.m97921d(8, z17);
                if (zM113469o) {
                    z18 = false;
                } else {
                    z18 = false;
                }
                aht0Var5.m97921d(9, z18);
                aht0Var5.m97921d(10, z25);
                if (z10) {
                    z19 = false;
                } else {
                    z19 = false;
                }
                aht0Var5.m97921d(11, z19);
                if (z10) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                aht0Var5.m97921d(12, z9);
                ojt0VarM97922e = aht0Var5.m97922e();
                this.f140511G = ojt0VarM97922e;
                if (!ojt0VarM97922e.equals(ojt0Var)) {
                    this.f140546k.m128567d(13, new mwv0() { // from class: l.u0y0
                        @Override // p153l.mwv0
                        public final void zza(Object obj9) {
                            this.f176954a.m161833E((pkt0) obj9);
                        }
                    });
                }
                this.f140546k.m128566c();
            }
            z12 = zMo158180g;
            j2 = 0;
            d0u0VarZzn5 = aey0Var.zzn();
            if (d0u0VarZzn5.m113469o()) {
                z13 = false;
            } else {
                z13 = false;
            }
            zM113469o = oot0Var2.zzn().m113469o();
            aht0 aht0Var6 = new aht0();
            aht0Var6.m97919b(ojt0Var3);
            boolean z26 = !z12;
            aht0Var6.m97921d(4, z26);
            if (z10) {
                z14 = false;
            } else {
                z14 = false;
            }
            aht0Var6.m97921d(5, z14);
            if (z11) {
                z15 = false;
            } else {
                z15 = false;
            }
            aht0Var6.m97921d(6, z15);
            if (zM113469o) {
                z16 = false;
            } else {
                z16 = false;
            }
            aht0Var6.m97921d(7, z16);
            if (r5 != 0) {
                z17 = false;
            } else {
                z17 = false;
            }
            aht0Var6.m97921d(8, z17);
            if (zM113469o) {
                z18 = false;
            } else {
                z18 = false;
            }
            aht0Var6.m97921d(9, z18);
            aht0Var6.m97921d(10, z26);
            if (z10) {
                z19 = false;
            } else {
                z19 = false;
            }
            aht0Var6.m97921d(11, z19);
            if (z10) {
                z9 = false;
            } else {
                z9 = false;
            }
            aht0Var6.m97921d(12, z9);
            ojt0VarM97922e = aht0Var6.m97922e();
            this.f140511G = ojt0VarM97922e;
            if (!ojt0VarM97922e.equals(ojt0Var)) {
                this.f140546k.m128567d(13, new mwv0() { // from class: l.u0y0
                    @Override // p153l.mwv0
                    public final void zza(Object obj9) {
                        this.f176954a.m161833E((pkt0) obj9);
                    }
                });
            }
            this.f140546k.m128566c();
        }
        oot0Var2 = oot0Var;
        d0u0VarZzn3 = aey0Var.zzn();
        if (d0u0VarZzn3.m113469o()) {
            i8 = -1;
            r13 = 0;
            z11 = false;
        } else {
            int iZzd6 = aey0Var.zzd();
            aey0Var.zzh();
            aey0Var.mo158181k();
            r13 = 0;
            r13 = 0;
            iMo113465k = d0u0VarZzn3.mo113465k(iZzd6, 0, false);
            i8 = -1;
            if (iMo113465k != -1) {
                z11 = z9;
            } else {
                z11 = false;
            }
        }
        Zzn = aey0Var.zzn();
        if (Zzn.m113469o()) {
            r5 = r13;
        } else {
            iZzd = aey0Var.zzd();
            aey0Var.zzh();
            aey0Var.mo158181k();
            if (Zzn.mo113464j(iZzd, r13, r13) != i8) {
                r5 = z9;
            } else {
                r5 = r13;
            }
        }
        d0u0VarZzn4 = aey0Var.zzn();
        if (!d0u0VarZzn4.m113469o()) {
            z12 = zMo158180g;
            j2 = 0;
            if (d0u0VarZzn4.mo107663e(aey0Var.zzd(), aey0Var.f70834a, 0L).m208629b()) {
            }
            d0u0VarZzn5 = aey0Var.zzn();
            if (d0u0VarZzn5.m113469o()) {
                z13 = false;
            } else {
                z13 = false;
            }
            zM113469o = oot0Var2.zzn().m113469o();
            aht0 aht0Var7 = new aht0();
            aht0Var7.m97919b(ojt0Var3);
            boolean z27 = !z12;
            aht0Var7.m97921d(4, z27);
            if (z10) {
                z14 = false;
            } else {
                z14 = false;
            }
            aht0Var7.m97921d(5, z14);
            if (z11) {
                z15 = false;
            } else {
                z15 = false;
            }
            aht0Var7.m97921d(6, z15);
            if (zM113469o) {
                z16 = false;
            } else {
                z16 = false;
            }
            aht0Var7.m97921d(7, z16);
            if (r5 != 0) {
                z17 = false;
            } else {
                z17 = false;
            }
            aht0Var7.m97921d(8, z17);
            if (zM113469o) {
                z18 = false;
            } else {
                z18 = false;
            }
            aht0Var7.m97921d(9, z18);
            aht0Var7.m97921d(10, z27);
            if (z10) {
                z19 = false;
            } else {
                z19 = false;
            }
            aht0Var7.m97921d(11, z19);
            if (z10) {
                z9 = false;
            } else {
                z9 = false;
            }
            aht0Var7.m97921d(12, z9);
            ojt0VarM97922e = aht0Var7.m97922e();
            this.f140511G = ojt0VarM97922e;
            if (!ojt0VarM97922e.equals(ojt0Var)) {
                this.f140546k.m128567d(13, new mwv0() { // from class: l.u0y0
                    @Override // p153l.mwv0
                    public final void zza(Object obj9) {
                        this.f176954a.m161833E((pkt0) obj9);
                    }
                });
            }
            this.f140546k.m128566c();
        }
        z12 = zMo158180g;
        j2 = 0;
        d0u0VarZzn5 = aey0Var.zzn();
        if (d0u0VarZzn5.m113469o()) {
            z13 = false;
        } else {
            z13 = false;
        }
        zM113469o = oot0Var2.zzn().m113469o();
        aht0 aht0Var8 = new aht0();
        aht0Var8.m97919b(ojt0Var3);
        boolean z28 = !z12;
        aht0Var8.m97921d(4, z28);
        if (z10) {
            z14 = false;
        } else {
            z14 = false;
        }
        aht0Var8.m97921d(5, z14);
        if (z11) {
            z15 = false;
        } else {
            z15 = false;
        }
        aht0Var8.m97921d(6, z15);
        if (zM113469o) {
            z16 = false;
        } else {
            z16 = false;
        }
        aht0Var8.m97921d(7, z16);
        if (r5 != 0) {
            z17 = false;
        } else {
            z17 = false;
        }
        aht0Var8.m97921d(8, z17);
        if (zM113469o) {
            z18 = false;
        } else {
            z18 = false;
        }
        aht0Var8.m97921d(9, z18);
        aht0Var8.m97921d(10, z28);
        if (z10) {
            z19 = false;
        } else {
            z19 = false;
        }
        aht0Var8.m97921d(11, z19);
        if (z10) {
            z9 = false;
        } else {
            z9 = false;
        }
        aht0Var8.m97921d(12, z9);
        ojt0VarM97922e = aht0Var8.m97922e();
        this.f140511G = ojt0VarM97922e;
        if (!ojt0VarM97922e.equals(ojt0Var)) {
            this.f140546k.m128567d(13, new mwv0() { // from class: l.u0y0
                @Override // p153l.mwv0
                public final void zza(Object obj9) {
                    this.f176954a.m161833E((pkt0) obj9);
                }
            });
        }
        this.f140546k.m128566c();
    }

    /* JADX INFO: renamed from: W */
    public final void m161848W() {
        int iZzf = zzf();
        if (iZzf == 2 || iZzf == 3) {
            m161849X();
            boolean z = this.f140533b0.f93604o;
            mo158176b();
            mo158176b();
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m161849X() {
        this.f140536d.m104774b();
        if (Thread.currentThread() != this.f140553r.getThread()) {
            String str = String.format(Locale.US, "Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.f140553r.getThread().getName());
            if (this.f140527W) {
                wtq0.m207906a(str);
            } else {
                y4w0.m214279g("ExoPlayerImpl", str, this.f140528X ? null : new IllegalStateException());
                this.f140528X = true;
            }
        }
    }

    @Override // p153l.oot0
    /* JADX INFO: renamed from: a */
    public final void mo158175a() {
        y4w0.m214277e("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.2.1] [" + mpw0.f137961e + "] [" + cts0.m112550a() + Constants.AES_SUFFIX);
        m161849X();
        this.f140559x.m160606d();
        if (!this.f140545j.m12633b0()) {
            g1w0 g1w0Var = this.f140546k;
            g1w0Var.m128567d(10, new mwv0() { // from class: l.m4y0
                @Override // p153l.mwv0
                public final void zza(Object obj) {
                    ((pkt0) obj).mo141228m(zziz.zzd(new zzla(1), 1003));
                }
            });
            g1w0Var.m128566c();
        }
        this.f140546k.m128568e();
        this.f140544i.mo121298b(null);
        this.f140554s.mo102800a(this.f140552q);
        edy0 edy0Var = this.f140533b0;
        boolean z = edy0Var.f93604o;
        edy0 edy0VarM120534e = edy0Var.m120534e(1);
        this.f140533b0 = edy0VarM120534e;
        edy0 edy0VarM120530a = edy0VarM120534e.m120530a(edy0VarM120534e.f93591b);
        this.f140533b0 = edy0VarM120530a;
        edy0VarM120530a.f93605p = edy0VarM120530a.f93607r;
        this.f140533b0.f93606q = 0L;
        this.f140552q.mo141223h();
        this.f140543h.mo153038b();
        Surface surface = this.f140517M;
        if (surface != null) {
            surface.release();
            this.f140517M = null;
        }
        this.f140526V = h7v0.f108165b;
    }

    @Override // p153l.oot0
    /* JADX INFO: renamed from: b */
    public final boolean mo158176b() {
        m161849X();
        return this.f140533b0.f93601l;
    }

    @Override // p153l.oot0
    /* JADX INFO: renamed from: c */
    public final void mo158177c(@Nullable Surface surface) {
        m161849X();
        m161844S(surface);
        int i = surface == null ? 0 : -1;
        m161841P(i, i);
    }

    @Override // p153l.oot0
    /* JADX INFO: renamed from: d */
    public final void mo158178d(boolean z) {
        m161849X();
        int iM160605b = this.f140559x.m160605b(z, zzf());
        m161846U(z, iM160605b, m161816H(z, iM160605b));
    }

    @Override // p153l.m0y0
    /* JADX INFO: renamed from: e */
    public final void mo156546e(dgy0 dgy0Var) {
        m161849X();
        this.f140552q.mo141203R(dgy0Var);
    }

    @Override // p153l.oot0
    /* JADX INFO: renamed from: f */
    public final void mo158179f(float f) {
        m161849X();
        final float fMax = Math.max(0.0f, Math.min(f, 1.0f));
        if (this.f140524T == fMax) {
            return;
        }
        this.f140524T = fMax;
        m161843R();
        g1w0 g1w0Var = this.f140546k;
        g1w0Var.m128567d(22, new mwv0() { // from class: l.a2y0
            @Override // p153l.mwv0
            public final void zza(Object obj) {
                int i = n6y0.f140504g0;
                ((pkt0) obj).mo141234t(fMax);
            }
        });
        g1w0Var.m128566c();
    }

    @Override // p153l.oot0
    /* JADX INFO: renamed from: g */
    public final boolean mo158180g() {
        m161849X();
        return this.f140533b0.f93591b.m152240b();
    }

    @Override // p153l.m0y0
    /* JADX INFO: renamed from: h */
    public final void mo156547h(dgy0 dgy0Var) {
        this.f140552q.mo141204S(dgy0Var);
    }

    @Override // p153l.m0y0
    /* JADX INFO: renamed from: i */
    public final void mo156548i(mzy0 mzy0Var) {
        m161849X();
        List listSingletonList = Collections.singletonList(mzy0Var);
        m161849X();
        m161849X();
        m161834G(this.f140533b0);
        zzk();
        this.f140506B++;
        boolean z = false;
        if (!this.f140549n.isEmpty()) {
            int size = this.f140549n.size();
            for (int i = size - 1; i >= 0; i--) {
                this.f140549n.remove(i);
            }
            this.f140541f0 = this.f140541f0.m138263h(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < listSingletonList.size(); i2++) {
            ucy0 ucy0Var = new ucy0((mzy0) listSingletonList.get(i2), this.f140550o);
            arrayList.add(ucy0Var);
            this.f140549n.add(i2, new i6y0(ucy0Var.f178473b, ucy0Var.f178472a));
        }
        this.f140541f0 = this.f140541f0.m138262g(0, arrayList.size());
        pey0 pey0Var = new pey0(this.f140549n, this.f140541f0);
        if (!pey0Var.m113469o() && pey0Var.mo113459c() < 0) {
            throw new zzan(pey0Var, -1, -9223372036854775807L);
        }
        int iMo113461g = pey0Var.mo113461g(false);
        edy0 edy0VarM161839N = m161839N(this.f140533b0, pey0Var, m161838M(pey0Var, iMo113461g, -9223372036854775807L));
        int i3 = edy0VarM161839N.f93594e;
        if (iMo113461g != -1 && i3 != 1) {
            i3 = 4;
            if (!pey0Var.m113469o() && iMo113461g < pey0Var.mo113459c()) {
                i3 = 2;
            }
        }
        edy0 edy0VarM120534e = edy0VarM161839N.m120534e(i3);
        this.f140545j.m12635c0(arrayList, iMo113461g, mpw0.m159393F(-9223372036854775807L), this.f140541f0);
        if (!this.f140533b0.f93591b.f129476a.equals(edy0VarM120534e.f93591b.f129476a) && !this.f140533b0.f93590a.m113469o()) {
            z = true;
        }
        m161847V(edy0VarM120534e, 0, 1, z, 4, m161836J(edy0VarM120534e), -1, false);
    }

    @Override // p153l.aey0
    /* JADX INFO: renamed from: j */
    public final void mo97263j(int i, long j, int i2, boolean z) {
        m161849X();
        lev0.m153956d(i >= 0);
        this.f140552q.zzu();
        d0u0 d0u0Var = this.f140533b0.f93590a;
        if (d0u0Var.m113469o() || i < d0u0Var.mo113459c()) {
            this.f140506B++;
            if (mo158180g()) {
                y4w0.m214278f("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                c8y0 c8y0Var = new c8y0(this.f140533b0);
                c8y0Var.m108392a(1);
                this.f140539e0.f155124a.m161832D(c8y0Var);
                return;
            }
            edy0 edy0VarM120534e = this.f140533b0;
            int i3 = edy0VarM120534e.f93594e;
            if (i3 == 3 || (i3 == 4 && !d0u0Var.m113469o())) {
                edy0VarM120534e = this.f140533b0.m120534e(2);
            }
            int iZzd = zzd();
            edy0 edy0VarM161839N = m161839N(edy0VarM120534e, d0u0Var, m161838M(d0u0Var, i, j));
            this.f140545j.m12628Y(d0u0Var, i, mpw0.m159393F(j));
            m161847V(edy0VarM161839N, 0, 1, true, 1, m161836J(edy0VarM161839N), iZzd, false);
        }
    }

    @Override // p153l.oot0
    /* JADX INFO: renamed from: k */
    public final boolean mo158181k() {
        m161849X();
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public final zziz m161850n() {
        m161849X();
        return this.f140533b0.f93595f;
    }

    @Override // p153l.m0y0
    /* JADX INFO: renamed from: r */
    public final int mo156549r() {
        m161849X();
        int length = this.f140542g.length;
        return 2;
    }

    @Override // p153l.oot0
    public final int zzb() {
        m161849X();
        if (mo158180g()) {
            return this.f140533b0.f93591b.f129477b;
        }
        return -1;
    }

    @Override // p153l.oot0
    public final int zzc() {
        m161849X();
        if (mo158180g()) {
            return this.f140533b0.f93591b.f129478c;
        }
        return -1;
    }

    @Override // p153l.oot0
    public final int zzd() {
        m161849X();
        int iM161834G = m161834G(this.f140533b0);
        if (iM161834G == -1) {
            return 0;
        }
        return iM161834G;
    }

    @Override // p153l.oot0
    public final int zze() {
        m161849X();
        if (this.f140533b0.f93590a.m113469o()) {
            return 0;
        }
        edy0 edy0Var = this.f140533b0;
        return edy0Var.f93590a.mo113457a(edy0Var.f93591b.f129476a);
    }

    @Override // p153l.oot0
    public final int zzf() {
        m161849X();
        return this.f140533b0.f93594e;
    }

    @Override // p153l.oot0
    public final int zzg() {
        m161849X();
        return this.f140533b0.f93602m;
    }

    @Override // p153l.oot0
    public final int zzh() {
        m161849X();
        return 0;
    }

    @Override // p153l.oot0
    public final long zzi() {
        m161849X();
        if (mo158180g()) {
            edy0 edy0Var = this.f140533b0;
            return edy0Var.f93600k.equals(edy0Var.f93591b) ? mpw0.m159396I(this.f140533b0.f93605p) : zzl();
        }
        m161849X();
        if (this.f140533b0.f93590a.m113469o()) {
            return this.f140537d0;
        }
        edy0 edy0Var2 = this.f140533b0;
        long j = 0;
        if (edy0Var2.f93600k.f129479d != edy0Var2.f93591b.f129479d) {
            return mpw0.m159396I(edy0Var2.f93590a.mo107663e(zzd(), this.f70834a, 0L).f191703m);
        }
        long j2 = edy0Var2.f93605p;
        if (this.f140533b0.f93600k.m152240b()) {
            edy0 edy0Var3 = this.f140533b0;
            edy0Var3.f93590a.mo113468n(edy0Var3.f93600k.f129476a, this.f140548m).m137513i(this.f140533b0.f93600k.f129477b);
        } else {
            j = j2;
        }
        edy0 edy0Var4 = this.f140533b0;
        m161837L(edy0Var4.f93590a, edy0Var4.f93600k, j);
        return mpw0.m159396I(j);
    }

    @Override // p153l.oot0
    public final long zzj() {
        m161849X();
        return m161835I(this.f140533b0);
    }

    @Override // p153l.oot0
    public final long zzk() {
        m161849X();
        return mpw0.m159396I(m161836J(this.f140533b0));
    }

    @Override // p153l.oot0
    public final long zzl() {
        m161849X();
        if (mo158180g()) {
            edy0 edy0Var = this.f140533b0;
            kzy0 kzy0Var = edy0Var.f93591b;
            edy0Var.f93590a.mo113468n(kzy0Var.f129476a, this.f140548m);
            return mpw0.m159396I(this.f140548m.m137512h(kzy0Var.f129477b, kzy0Var.f129478c));
        }
        d0u0 d0u0VarZzn = zzn();
        if (d0u0VarZzn.m113469o()) {
            return -9223372036854775807L;
        }
        return mpw0.m159396I(d0u0VarZzn.mo107663e(zzd(), this.f70834a, 0L).f191703m);
    }

    @Override // p153l.oot0
    public final long zzm() {
        m161849X();
        return mpw0.m159396I(this.f140533b0.f93606q);
    }

    @Override // p153l.oot0
    public final d0u0 zzn() {
        m161849X();
        return this.f140533b0.f93590a;
    }

    @Override // p153l.oot0
    public final uhu0 zzo() {
        m161849X();
        return this.f140533b0.f93598i.f177700d;
    }

    @Override // p153l.oot0
    public final void zzp() {
        m161849X();
        mwx0 mwx0Var = this.f140559x;
        boolean zMo158176b = mo158176b();
        int iM160605b = mwx0Var.m160605b(zMo158176b, 2);
        m161846U(zMo158176b, iM160605b, m161816H(zMo158176b, iM160605b));
        edy0 edy0Var = this.f140533b0;
        if (edy0Var.f93594e != 1) {
            return;
        }
        edy0 edy0VarM120533d = edy0Var.m120533d(null);
        edy0 edy0VarM120534e = edy0VarM120533d.m120534e(true == edy0VarM120533d.f93590a.m113469o() ? 4 : 2);
        this.f140506B++;
        this.f140545j.m12627X();
        m161847V(edy0VarM120534e, 1, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // p153l.oot0
    public final void zzu() {
        m161849X();
        this.f140559x.m160605b(mo158176b(), 1);
        m161845T(null);
        this.f140526V = new h7v0(zzgaa.zzl(), this.f140533b0.f93607r);
    }
}
