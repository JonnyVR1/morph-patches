package p149l;

import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.internal.ads.zzaga;
import com.google.android.gms.internal.ads.zzby;
import com.google.android.gms.internal.ads.zzcc;
import com.google.android.gms.internal.ads.zzgx;
import com.google.android.gms.internal.ads.zzho;
import com.google.android.gms.internal.ads.zzzj;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes6.dex */
public final class vry0 implements cqy0, m5r0, nxy0, sxy0, xsy0 {

    /* JADX INFO: renamed from: M */
    public static final Map f182753M;

    /* JADX INFO: renamed from: N */
    public static final mhr0 f182754N;

    /* JADX INFO: renamed from: A */
    public boolean f182755A;

    /* JADX INFO: renamed from: B */
    public boolean f182756B;

    /* JADX INFO: renamed from: C */
    public int f182757C;

    /* JADX INFO: renamed from: D */
    public boolean f182758D;

    /* JADX INFO: renamed from: E */
    public long f182759E;

    /* JADX INFO: renamed from: F */
    public long f182760F;

    /* JADX INFO: renamed from: G */
    public boolean f182761G;

    /* JADX INFO: renamed from: H */
    public int f182762H;

    /* JADX INFO: renamed from: I */
    public boolean f182763I;

    /* JADX INFO: renamed from: J */
    public boolean f182764J;

    /* JADX INFO: renamed from: K */
    public final mxy0 f182765K;

    /* JADX INFO: renamed from: L */
    public final wwy0 f182766L;

    /* JADX INFO: renamed from: a */
    public final Uri f182767a;

    /* JADX INFO: renamed from: b */
    public final z4x0 f182768b;

    /* JADX INFO: renamed from: c */
    public final bly0 f182769c;

    /* JADX INFO: renamed from: d */
    public final fry0 f182770d;

    /* JADX INFO: renamed from: e */
    public final tky0 f182771e;

    /* JADX INFO: renamed from: f */
    public final rry0 f182772f;

    /* JADX INFO: renamed from: g */
    public final long f182773g;

    /* JADX INFO: renamed from: h */
    public final uxy0 f182774h = new uxy0("ProgressiveMediaPeriod");

    /* JADX INFO: renamed from: i */
    public final kry0 f182775i;

    /* JADX INFO: renamed from: j */
    public final v9v0 f182776j;

    /* JADX INFO: renamed from: k */
    public final Runnable f182777k;

    /* JADX INFO: renamed from: l */
    public final Runnable f182778l;

    /* JADX INFO: renamed from: m */
    public final Handler f182779m;

    /* JADX INFO: renamed from: n */
    public final boolean f182780n;

    /* JADX INFO: renamed from: o */
    @Nullable
    public bqy0 f182781o;

    /* JADX INFO: renamed from: p */
    @Nullable
    public zzaga f182782p;

    /* JADX INFO: renamed from: q */
    public ysy0[] f182783q;

    /* JADX INFO: renamed from: r */
    public try0[] f182784r;

    /* JADX INFO: renamed from: s */
    public boolean f182785s;

    /* JADX INFO: renamed from: t */
    public boolean f182786t;

    /* JADX INFO: renamed from: u */
    public boolean f182787u;

    /* JADX INFO: renamed from: v */
    public ury0 f182788v;

    /* JADX INFO: renamed from: w */
    public v6r0 f182789w;

    /* JADX INFO: renamed from: x */
    public long f182790x;

    /* JADX INFO: renamed from: y */
    public boolean f182791y;

    /* JADX INFO: renamed from: z */
    public int f182792z;

    static {
        HashMap map = new HashMap();
        map.put(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_NAME, "1");
        f182753M = Collections.unmodifiableMap(map);
        ter0 ter0Var = new ter0();
        ter0Var.m188604k("icy");
        ter0Var.m188618w("application/x-icy");
        f182754N = ter0Var.m188591D();
    }

    public vry0(Uri uri, z4x0 z4x0Var, kry0 kry0Var, bly0 bly0Var, tky0 tky0Var, mxy0 mxy0Var, fry0 fry0Var, rry0 rry0Var, wwy0 wwy0Var, @Nullable String str, int i, long j) {
        this.f182767a = uri;
        this.f182768b = z4x0Var;
        this.f182769c = bly0Var;
        this.f182771e = tky0Var;
        this.f182765K = mxy0Var;
        this.f182770d = fry0Var;
        this.f182772f = rry0Var;
        this.f182766L = wwy0Var;
        this.f182773g = i;
        this.f182775i = kry0Var;
        this.f182790x = j;
        this.f182780n = j != -9223372036854775807L;
        this.f182776j = new v9v0(g6v0.f101315a);
        this.f182777k = new Runnable() { // from class: l.mry0
            @Override // java.lang.Runnable
            public final void run() {
                this.f135431a.m199771C();
            }
        };
        this.f182778l = new Runnable() { // from class: l.nry0
            @Override // java.lang.Runnable
            public final void run() {
                this.f140230a.m199781r();
            }
        };
        this.f182779m = ggw0.m126055L(null);
        this.f182784r = new try0[0];
        this.f182783q = new ysy0[0];
        this.f182760F = -9223372036854775807L;
        this.f182792z = 1;
    }

    /* JADX INFO: renamed from: M */
    public static /* bridge */ /* synthetic */ long m199760M(vry0 vry0Var, boolean z) {
        return vry0Var.m199789z(true);
    }

    /* JADX INFO: renamed from: q */
    public static /* bridge */ /* synthetic */ void m199768q(final vry0 vry0Var) {
        vry0Var.f182779m.post(new Runnable() { // from class: l.lry0
            @Override // java.lang.Runnable
            public final void run() {
                this.f129795a.m199782s();
            }
        });
    }

    /* JADX INFO: renamed from: A */
    public final m7r0 m199769A(try0 try0Var) {
        int length = this.f182783q.length;
        for (int i = 0; i < length; i++) {
            if (try0Var.equals(this.f182784r[i])) {
                return this.f182783q[i];
            }
        }
        ysy0 ysy0Var = new ysy0(this.f182766L, this.f182769c, this.f182771e);
        ysy0Var.m215966J(this);
        int i2 = length + 1;
        try0[] try0VarArr = (try0[]) Arrays.copyOf(this.f182784r, i2);
        try0VarArr[length] = try0Var;
        int i3 = ggw0.f102568a;
        this.f182784r = try0VarArr;
        ysy0[] ysy0VarArr = (ysy0[]) Arrays.copyOf(this.f182783q, i2);
        ysy0VarArr[length] = ysy0Var;
        this.f182783q = ysy0VarArr;
        return ysy0Var;
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    /* JADX INFO: renamed from: B */
    public final void m199770B() {
        f5v0.m119535f(this.f182786t);
        this.f182788v.getClass();
        this.f182789w.getClass();
    }

    /* JADX INFO: renamed from: C */
    public final void m199771C() {
        int i;
        if (this.f182764J || this.f182786t || !this.f182785s || this.f182789w == null) {
            return;
        }
        for (ysy0 ysy0Var : this.f182783q) {
            if (ysy0Var.m215958A() == null) {
                return;
            }
        }
        this.f182776j.m197603c();
        int length = this.f182783q.length;
        ntt0[] ntt0VarArr = new ntt0[length];
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            mhr0 mhr0VarM215958A = this.f182783q[i2].m215958A();
            mhr0VarM215958A.getClass();
            String str = mhr0VarM215958A.f133892l;
            boolean zM196370g = uys0.m196370g(str);
            boolean z = zM196370g || uys0.m196371h(str);
            zArr[i2] = z;
            this.f182787u = z | this.f182787u;
            zzaga zzagaVar = this.f182782p;
            if (zzagaVar != null) {
                if (zM196370g || this.f182784r[i2].f171884b) {
                    zzby zzbyVar = mhr0VarM215958A.f133890j;
                    zzby zzbyVar2 = zzbyVar == null ? new zzby(-9223372036854775807L, zzagaVar) : zzbyVar.m13553c(zzagaVar);
                    ter0 ter0VarM154634b = mhr0VarM215958A.m154634b();
                    ter0VarM154634b.m188611p(zzbyVar2);
                    mhr0VarM215958A = ter0VarM154634b.m188591D();
                }
                if (zM196370g && mhr0VarM215958A.f133886f == -1 && mhr0VarM215958A.f133887g == -1 && (i = zzagaVar.zza) != -1) {
                    ter0 ter0VarM154634b2 = mhr0VarM215958A.m154634b();
                    ter0VarM154634b2.m188603j0(i);
                    mhr0VarM215958A = ter0VarM154634b2.m188591D();
                }
            }
            ntt0VarArr[i2] = new ntt0(Integer.toString(i2), mhr0VarM215958A.m154635c(this.f182769c.mo102566a(mhr0VarM215958A)));
        }
        this.f182788v = new ury0(new kty0(ntt0VarArr), zArr);
        this.f182786t = true;
        bqy0 bqy0Var = this.f182781o;
        bqy0Var.getClass();
        bqy0Var.mo12582d(this);
    }

    /* JADX INFO: renamed from: D */
    public final void m199772D(int i) {
        m199770B();
        ury0 ury0Var = this.f182788v;
        boolean[] zArr = ury0Var.f177933d;
        if (zArr[i]) {
            return;
        }
        mhr0 mhr0VarM161414b = ury0Var.f177930a.m147224b(i).m161414b(0);
        this.f182770d.m122909c(new aqy0(1, uys0.m196365b(mhr0VarM161414b.f133892l), mhr0VarM161414b, 0, null, ggw0.m126052I(this.f182759E), -9223372036854775807L));
        zArr[i] = true;
    }

    /* JADX INFO: renamed from: E */
    public final void m199773E(int i) {
        m199770B();
        boolean[] zArr = this.f182788v.f177931b;
        if (this.f182761G && zArr[i] && !this.f182783q[i].m215969M(false)) {
            this.f182760F = 0L;
            this.f182761G = false;
            this.f182756B = true;
            this.f182759E = 0L;
            this.f182762H = 0;
            for (ysy0 ysy0Var : this.f182783q) {
                ysy0Var.m215964H(false);
            }
            bqy0 bqy0Var = this.f182781o;
            bqy0Var.getClass();
            bqy0Var.mo12580c(this);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m199774F() {
        qry0 qry0Var = new qry0(this, this.f182767a, this.f182768b, this.f182775i, this, this.f182776j);
        if (this.f182786t) {
            f5v0.m119535f(m199775G());
            long j = this.f182790x;
            if (j != -9223372036854775807L && this.f182760F > j) {
                this.f182763I = true;
                this.f182760F = -9223372036854775807L;
                return;
            }
            v6r0 v6r0Var = this.f182789w;
            v6r0Var.getClass();
            qry0.m176138f(qry0Var, v6r0Var.mo124628a(this.f182760F).f168638a.f184991b, this.f182760F);
            for (ysy0 ysy0Var : this.f182783q) {
                ysy0Var.m215965I(this.f182760F);
            }
            this.f182760F = -9223372036854775807L;
        }
        this.f182762H = m199788y();
        long jM196218a = this.f182774h.m196218a(qry0Var, this, mxy0.m156944a(this.f182792z));
        uax0 uax0Var = qry0Var.f156070k;
        this.f182770d.m122913g(new vpy0(qry0Var.f156060a, uax0Var, uax0Var.f175648a, Collections.EMPTY_MAP, jM196218a, 0L, 0L), new aqy0(1, -1, null, 0, null, ggw0.m126052I(qry0Var.f156069j), ggw0.m126052I(this.f182790x)));
    }

    /* JADX INFO: renamed from: G */
    public final boolean m199775G() {
        return this.f182760F != -9223372036854775807L;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m199776H() {
        return this.f182756B || m199775G();
    }

    /* JADX INFO: renamed from: I */
    public final int m199777I(int i, f0y0 f0y0Var, ylx0 ylx0Var, int i2) {
        if (m199776H()) {
            return -3;
        }
        m199772D(i);
        int iM215989y = this.f182783q[i].m215989y(f0y0Var, ylx0Var, i2, this.f182763I);
        if (iM215989y == -3) {
            m199773E(i);
        }
        return iM215989y;
    }

    /* JADX INFO: renamed from: J */
    public final int m199778J(int i, long j) throws Throwable {
        if (m199776H()) {
            return 0;
        }
        m199772D(i);
        ysy0 ysy0Var = this.f182783q[i];
        int iM215987w = ysy0Var.m215987w(j, this.f182763I);
        ysy0Var.m215967K(iM215987w);
        if (iM215987w != 0) {
            return iM215987w;
        }
        m199773E(i);
        return 0;
    }

    /* JADX INFO: renamed from: P */
    public final m7r0 m199779P() {
        return m199769A(new try0(0, true));
    }

    @Override // p149l.cqy0, p149l.bty0
    /* JADX INFO: renamed from: a */
    public final boolean mo103896a(a1y0 a1y0Var) {
        if (this.f182763I) {
            return false;
        }
        uxy0 uxy0Var = this.f182774h;
        if (uxy0Var.m196223k() || this.f182761G) {
            return false;
        }
        if (this.f182786t && this.f182757C == 0) {
            return false;
        }
        boolean zM197605e = this.f182776j.m197605e();
        if (uxy0Var.m196224l()) {
            return zM197605e;
        }
        m199774F();
        return true;
    }

    @Override // p149l.m5r0
    /* JADX INFO: renamed from: c */
    public final void mo129453c() {
        this.f182785s = true;
        this.f182779m.post(this.f182777k);
    }

    @Override // p149l.nxy0
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ void mo161957d(rxy0 rxy0Var, long j, long j2, boolean z) {
        qry0 qry0Var = (qry0) rxy0Var;
        rjx0 rjx0Var = qry0Var.f156062c;
        vpy0 vpy0Var = new vpy0(qry0Var.f156060a, qry0Var.f156070k, rjx0Var.m179666k(), rjx0Var.m179667l(), j, j2, rjx0Var.m179665j());
        long unused = qry0Var.f156060a;
        this.f182770d.m122910d(vpy0Var, new aqy0(1, -1, null, 0, null, ggw0.m126052I(qry0Var.f156069j), ggw0.m126052I(this.f182790x)));
        if (z) {
            return;
        }
        for (ysy0 ysy0Var : this.f182783q) {
            ysy0Var.m215964H(false);
        }
        if (this.f182757C > 0) {
            bqy0 bqy0Var = this.f182781o;
            bqy0Var.getClass();
            bqy0Var.mo12580c(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0042  */
    @Override // p149l.cqy0
    /* JADX INFO: renamed from: e */
    public final long mo108304e(hwy0[] hwy0VarArr, boolean[] zArr, zsy0[] zsy0VarArr, boolean[] zArr2, long j) {
        boolean z;
        hwy0 hwy0Var;
        m199770B();
        ury0 ury0Var = this.f182788v;
        kty0 kty0Var = ury0Var.f177930a;
        boolean[] zArr3 = ury0Var.f177932c;
        int i = this.f182757C;
        int i2 = 0;
        for (int i3 = 0; i3 < hwy0VarArr.length; i3++) {
            zsy0 zsy0Var = zsy0VarArr[i3];
            if (zsy0Var != null && (hwy0VarArr[i3] == null || !zArr[i3])) {
                int i4 = ((sry0) zsy0Var).f166150a;
                f5v0.m119535f(zArr3[i4]);
                this.f182757C--;
                zArr3[i4] = false;
                zsy0VarArr[i3] = null;
            }
        }
        if (this.f182780n) {
            z = false;
        } else {
            if (this.f182755A) {
                if (i != 0) {
                    z = false;
                }
            } else if (j == 0) {
                z = false;
                j = 0;
            }
            z = true;
        }
        for (int i5 = 0; i5 < hwy0VarArr.length; i5++) {
            if (zsy0VarArr[i5] == null && (hwy0Var = hwy0VarArr[i5]) != null) {
                f5v0.m119535f(hwy0Var.zzc() == 1);
                f5v0.m119535f(hwy0Var.zza(0) == 0);
                int iM147223a = kty0Var.m147223a(hwy0Var.zze());
                f5v0.m119535f(!zArr3[iM147223a]);
                this.f182757C++;
                zArr3[iM147223a] = true;
                zsy0VarArr[i5] = new sry0(this, iM147223a);
                zArr2[i5] = true;
                if (!z) {
                    ysy0 ysy0Var = this.f182783q[iM147223a];
                    z = (ysy0Var.m215986v() == 0 || ysy0Var.m215971g(j, true)) ? false : true;
                }
            }
        }
        if (this.f182757C == 0) {
            this.f182761G = false;
            this.f182756B = false;
            boolean zM196224l = this.f182774h.m196224l();
            ysy0[] ysy0VarArr = this.f182783q;
            if (zM196224l) {
                int length = ysy0VarArr.length;
                while (i2 < length) {
                    ysy0VarArr[i2].m215960C();
                    i2++;
                }
                this.f182774h.m196219g();
            } else {
                for (ysy0 ysy0Var2 : ysy0VarArr) {
                    ysy0Var2.m215964H(false);
                }
            }
        } else if (z) {
            j = mo108308l(j);
            while (i2 < zsy0VarArr.length) {
                if (zsy0VarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.f182755A = true;
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0081 A[RETURN] */
    @Override // p149l.cqy0
    /* JADX INFO: renamed from: f */
    public final long mo108305f(long j, a6y0 a6y0Var) {
        m199770B();
        if (!this.f182789w.zzh()) {
            return 0L;
        }
        t6r0 t6r0VarMo124628a = this.f182789w.mo124628a(j);
        w6r0 w6r0Var = t6r0VarMo124628a.f168638a;
        w6r0 w6r0Var2 = t6r0VarMo124628a.f168639b;
        long j2 = a6y0Var.f67817a;
        if (j2 == 0) {
            if (a6y0Var.f67818b == 0) {
                return j;
            }
            j2 = 0;
        }
        long j3 = w6r0Var.f184990a;
        int i = ggw0.f102568a;
        long j4 = j - j2;
        long j5 = a6y0Var.f67818b;
        long j6 = j + j5;
        long j7 = j ^ j6;
        long j8 = j5 ^ j6;
        if (((j2 ^ j) & (j ^ j4)) < 0) {
            j4 = Long.MIN_VALUE;
        }
        if ((j7 & j8) < 0) {
            j6 = Long.MAX_VALUE;
        }
        boolean z = j4 <= j3 && j3 <= j6;
        long j9 = w6r0Var2.f184990a;
        boolean z2 = j4 <= j9 && j9 <= j6;
        if (z && z2) {
            if (Math.abs(j3 - j) <= Math.abs(j9 - j)) {
                return j3;
            }
            return j9;
        }
        if (!z) {
            if (z2) {
                return j9;
            }
            return j4;
        }
        return j3;
    }

    @Override // p149l.cqy0
    /* JADX INFO: renamed from: g */
    public final void mo108306g(long j, boolean z) {
        if (this.f182780n) {
            return;
        }
        m199770B();
        if (m199775G()) {
            return;
        }
        boolean[] zArr = this.f182788v.f177932c;
        int length = this.f182783q.length;
        for (int i = 0; i < length; i++) {
            this.f182783q[i].m215959B(j, false, zArr[i]);
        }
    }

    @Override // p149l.nxy0
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ pxy0 mo161958h(rxy0 rxy0Var, long j, long j2, IOException iOException, int i) {
        long jMin;
        pxy0 pxy0VarM196213b;
        v6r0 v6r0Var;
        qry0 qry0Var = (qry0) rxy0Var;
        rjx0 rjx0Var = qry0Var.f156062c;
        vpy0 vpy0Var = new vpy0(qry0Var.f156060a, qry0Var.f156070k, rjx0Var.m179666k(), rjx0Var.m179667l(), j, j2, rjx0Var.m179665j());
        long unused = qry0Var.f156069j;
        int i2 = ggw0.f102568a;
        if ((iOException instanceof zzcc) || (iOException instanceof FileNotFoundException) || (iOException instanceof zzho) || (iOException instanceof zzzj)) {
            jMin = -9223372036854775807L;
            break;
        }
        Throwable cause = iOException;
        while (true) {
            if (cause == null) {
                jMin = Math.min((i - 1) * 1000, 5000);
                break;
            }
            if ((cause instanceof zzgx) && ((zzgx) cause).zza == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
            cause = cause.getCause();
        }
        if (jMin == -9223372036854775807L) {
            pxy0VarM196213b = uxy0.f178786g;
        } else {
            int iM199788y = m199788y();
            boolean z = iM199788y > this.f182762H;
            if (this.f182758D || !((v6r0Var = this.f182789w) == null || v6r0Var.zza() == -9223372036854775807L)) {
                this.f182762H = iM199788y;
            } else {
                boolean z2 = this.f182786t;
                if (!z2 || m199776H()) {
                    this.f182756B = z2;
                    this.f182759E = 0L;
                    this.f182762H = 0;
                    for (ysy0 ysy0Var : this.f182783q) {
                        ysy0Var.m215964H(false);
                    }
                    qry0.m176138f(qry0Var, 0L, 0L);
                } else {
                    this.f182761G = true;
                    pxy0VarM196213b = uxy0.f178785f;
                }
            }
            pxy0VarM196213b = uxy0.m196213b(z, jMin);
        }
        boolean zM171963c = pxy0VarM196213b.m171963c();
        this.f182770d.m122912f(vpy0Var, new aqy0(1, -1, null, 0, null, ggw0.m126052I(qry0Var.f156069j), ggw0.m126052I(this.f182790x)), iOException, !zM171963c);
        if (!zM171963c) {
            long unused2 = qry0Var.f156060a;
        }
        return pxy0VarM196213b;
    }

    @Override // p149l.m5r0
    /* JADX INFO: renamed from: i */
    public final m7r0 mo129454i(int i, int i2) {
        return m199769A(new try0(i, false));
    }

    @Override // p149l.m5r0
    /* JADX INFO: renamed from: j */
    public final void mo129455j(final v6r0 v6r0Var) {
        this.f182779m.post(new Runnable() { // from class: l.ory0
            @Override // java.lang.Runnable
            public final void run() {
                this.f145365a.m199783t(v6r0Var);
            }
        });
    }

    @Override // p149l.cqy0
    /* JADX INFO: renamed from: k */
    public final void mo108307k(bqy0 bqy0Var, long j) {
        this.f182781o = bqy0Var;
        this.f182776j.m197605e();
        m199774F();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0061 A[LOOP:1: B:27:0x005f->B:28:0x0061, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x006f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0078 A[LOOP:2: B:32:0x0076->B:33:0x0078, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:26:0x005c, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:31:0x006f, please report this as an issue */
    @Override // p149l.cqy0
    /* JADX INFO: renamed from: l */
    public final long mo108308l(long j) {
        uxy0 uxy0Var;
        int i;
        m199770B();
        boolean[] zArr = this.f182788v.f177931b;
        if (true != this.f182789w.zzh()) {
            j = 0;
        }
        this.f182756B = false;
        this.f182759E = j;
        if (m199775G()) {
            this.f182760F = j;
            return j;
        }
        if (this.f182792z == 7) {
            this.f182761G = false;
            this.f182760F = j;
            this.f182763I = false;
            uxy0Var = this.f182774h;
            if (uxy0Var.m196224l()) {
                uxy0Var.m196220h();
                for (ysy0 ysy0Var : this.f182783q) {
                    ysy0Var.m215964H(false);
                }
                break;
                break;
            }
            for (ysy0 ysy0Var2 : this.f182783q) {
                ysy0Var2.m215960C();
            }
            this.f182774h.m196219g();
            return j;
        }
        int length = this.f182783q.length;
        for (int i2 = 0; i2 < length; i2++) {
            ysy0 ysy0Var3 = this.f182783q[i2];
            if (!(this.f182780n ? ysy0Var3.m215970N(ysy0Var3.m215985u()) : ysy0Var3.m215971g(j, false)) && (zArr[i2] || !this.f182787u)) {
                this.f182761G = false;
                this.f182760F = j;
                this.f182763I = false;
                uxy0Var = this.f182774h;
                if (uxy0Var.m196224l()) {
                    uxy0Var.m196220h();
                    while (i < r0) {
                        ysy0Var.m215964H(false);
                    }
                    break;
                }
                while (i < r2) {
                    ysy0Var2.m215960C();
                }
                this.f182774h.m196219g();
                return j;
            }
        }
        return j;
    }

    @Override // p149l.nxy0
    /* JADX INFO: renamed from: m */
    public final /* bridge */ /* synthetic */ void mo161959m(rxy0 rxy0Var, long j, long j2) {
        v6r0 v6r0Var;
        if (this.f182790x == -9223372036854775807L && (v6r0Var = this.f182789w) != null) {
            boolean zZzh = v6r0Var.zzh();
            long jM199789z = m199789z(true);
            long j3 = jM199789z == Long.MIN_VALUE ? 0L : jM199789z + 10000;
            this.f182790x = j3;
            this.f182772f.mo98641c(j3, zZzh, this.f182791y);
        }
        qry0 qry0Var = (qry0) rxy0Var;
        rjx0 rjx0Var = qry0Var.f156062c;
        vpy0 vpy0Var = new vpy0(qry0Var.f156060a, qry0Var.f156070k, rjx0Var.m179666k(), rjx0Var.m179667l(), j, j2, rjx0Var.m179665j());
        long unused = qry0Var.f156060a;
        this.f182770d.m122911e(vpy0Var, new aqy0(1, -1, null, 0, null, ggw0.m126052I(qry0Var.f156069j), ggw0.m126052I(this.f182790x)));
        this.f182763I = true;
        bqy0 bqy0Var = this.f182781o;
        bqy0Var.getClass();
        bqy0Var.mo12580c(this);
    }

    @Override // p149l.xsy0
    /* JADX INFO: renamed from: n */
    public final void mo199780n(mhr0 mhr0Var) {
        this.f182779m.post(this.f182777k);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m199781r() {
        if (this.f182764J) {
            return;
        }
        bqy0 bqy0Var = this.f182781o;
        bqy0Var.getClass();
        bqy0Var.mo12580c(this);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m199782s() {
        this.f182758D = true;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m199783t(v6r0 v6r0Var) {
        this.f182789w = this.f182782p == null ? v6r0Var : new u6r0(-9223372036854775807L, 0L);
        if (v6r0Var.zza() == -9223372036854775807L && this.f182790x != -9223372036854775807L) {
            this.f182789w = new pry0(this, this.f182789w);
        }
        this.f182790x = this.f182789w.zza();
        boolean z = false;
        if (!this.f182758D && v6r0Var.zza() == -9223372036854775807L) {
            z = true;
        }
        this.f182791y = z;
        this.f182792z = true == z ? 7 : 1;
        this.f182772f.mo98641c(this.f182790x, v6r0Var.zzh(), this.f182791y);
        if (this.f182786t) {
            return;
        }
        m199771C();
    }

    /* JADX INFO: renamed from: u */
    public final void m199784u() throws IOException {
        this.f182774h.m196221i(mxy0.m156944a(this.f182792z));
    }

    /* JADX INFO: renamed from: v */
    public final void m199785v(int i) throws IOException {
        this.f182783q[i].m215961E();
        m199784u();
    }

    /* JADX INFO: renamed from: w */
    public final void m199786w() {
        if (this.f182786t) {
            for (ysy0 ysy0Var : this.f182783q) {
                ysy0Var.m215962F();
            }
        }
        this.f182774h.m196222j(this);
        this.f182779m.removeCallbacksAndMessages(null);
        this.f182781o = null;
        this.f182764J = true;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m199787x(int i) {
        return !m199776H() && this.f182783q[i].m215969M(this.f182763I);
    }

    /* JADX INFO: renamed from: y */
    public final int m199788y() {
        int iM215988x = 0;
        for (ysy0 ysy0Var : this.f182783q) {
            iM215988x += ysy0Var.m215988x();
        }
        return iM215988x;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    /* JADX INFO: renamed from: z */
    public final long m199789z(boolean z) {
        int i = 0;
        long jMax = Long.MIN_VALUE;
        while (true) {
            ysy0[] ysy0VarArr = this.f182783q;
            if (i >= ysy0VarArr.length) {
                return jMax;
            }
            if (z) {
                jMax = Math.max(jMax, ysy0VarArr[i].m215990z());
            } else {
                ury0 ury0Var = this.f182788v;
                ury0Var.getClass();
                if (ury0Var.f177932c[i]) {
                    jMax = Math.max(jMax, ysy0VarArr[i].m215990z());
                }
            }
            i++;
        }
    }

    @Override // p149l.sxy0
    public final void zzL() {
        for (ysy0 ysy0Var : this.f182783q) {
            ysy0Var.m215963G();
        }
        this.f182775i.zze();
    }

    @Override // p149l.cqy0, p149l.bty0
    public final long zzb() {
        long jM199789z;
        m199770B();
        if (this.f182763I || this.f182757C == 0) {
            return Long.MIN_VALUE;
        }
        if (m199775G()) {
            return this.f182760F;
        }
        if (this.f182787u) {
            int length = this.f182783q.length;
            jM199789z = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                ury0 ury0Var = this.f182788v;
                if (ury0Var.f177931b[i] && ury0Var.f177932c[i] && !this.f182783q[i].m215968L()) {
                    jM199789z = Math.min(jM199789z, this.f182783q[i].m215990z());
                }
            }
        } else {
            jM199789z = Long.MAX_VALUE;
        }
        if (jM199789z == Long.MAX_VALUE) {
            jM199789z = m199789z(false);
        }
        return jM199789z == Long.MIN_VALUE ? this.f182759E : jM199789z;
    }

    @Override // p149l.cqy0, p149l.bty0
    public final long zzc() {
        return zzb();
    }

    @Override // p149l.cqy0
    public final long zzd() {
        if (!this.f182756B) {
            return -9223372036854775807L;
        }
        if (!this.f182763I && m199788y() <= this.f182762H) {
            return -9223372036854775807L;
        }
        this.f182756B = false;
        return this.f182759E;
    }

    @Override // p149l.cqy0
    public final kty0 zzh() {
        m199770B();
        return this.f182788v.f177930a;
    }

    @Override // p149l.cqy0
    public final void zzk() throws IOException {
        m199784u();
        if (this.f182763I && !this.f182786t) {
            throw zzcc.zza("Loading finished before preparation is complete.", null);
        }
    }

    @Override // p149l.cqy0, p149l.bty0
    public final boolean zzp() {
        return this.f182774h.m196224l() && this.f182776j.m197604d();
    }

    @Override // p149l.cqy0, p149l.bty0
    /* JADX INFO: renamed from: b */
    public final void mo103897b(long j) {
    }
}
