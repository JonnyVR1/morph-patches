package p153l;

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
public final class b1z0 implements izy0, ser0, t6z0, y6z0, d2z0 {

    /* JADX INFO: renamed from: M */
    public static final Map f74407M;

    /* JADX INFO: renamed from: N */
    public static final sqr0 f74408N;

    /* JADX INFO: renamed from: A */
    public boolean f74409A;

    /* JADX INFO: renamed from: B */
    public boolean f74410B;

    /* JADX INFO: renamed from: C */
    public int f74411C;

    /* JADX INFO: renamed from: D */
    public boolean f74412D;

    /* JADX INFO: renamed from: E */
    public long f74413E;

    /* JADX INFO: renamed from: F */
    public long f74414F;

    /* JADX INFO: renamed from: G */
    public boolean f74415G;

    /* JADX INFO: renamed from: H */
    public int f74416H;

    /* JADX INFO: renamed from: I */
    public boolean f74417I;

    /* JADX INFO: renamed from: J */
    public boolean f74418J;

    /* JADX INFO: renamed from: K */
    public final s6z0 f74419K;

    /* JADX INFO: renamed from: L */
    public final c6z0 f74420L;

    /* JADX INFO: renamed from: a */
    public final Uri f74421a;

    /* JADX INFO: renamed from: b */
    public final fex0 f74422b;

    /* JADX INFO: renamed from: c */
    public final huy0 f74423c;

    /* JADX INFO: renamed from: d */
    public final l0z0 f74424d;

    /* JADX INFO: renamed from: e */
    public final zty0 f74425e;

    /* JADX INFO: renamed from: f */
    public final x0z0 f74426f;

    /* JADX INFO: renamed from: g */
    public final long f74427g;

    /* JADX INFO: renamed from: h */
    public final a7z0 f74428h = new a7z0("ProgressiveMediaPeriod");

    /* JADX INFO: renamed from: i */
    public final q0z0 f74429i;

    /* JADX INFO: renamed from: j */
    public final bjv0 f74430j;

    /* JADX INFO: renamed from: k */
    public final Runnable f74431k;

    /* JADX INFO: renamed from: l */
    public final Runnable f74432l;

    /* JADX INFO: renamed from: m */
    public final Handler f74433m;

    /* JADX INFO: renamed from: n */
    public final boolean f74434n;

    /* JADX INFO: renamed from: o */
    @Nullable
    public hzy0 f74435o;

    /* JADX INFO: renamed from: p */
    @Nullable
    public zzaga f74436p;

    /* JADX INFO: renamed from: q */
    public e2z0[] f74437q;

    /* JADX INFO: renamed from: r */
    public z0z0[] f74438r;

    /* JADX INFO: renamed from: s */
    public boolean f74439s;

    /* JADX INFO: renamed from: t */
    public boolean f74440t;

    /* JADX INFO: renamed from: u */
    public boolean f74441u;

    /* JADX INFO: renamed from: v */
    public a1z0 f74442v;

    /* JADX INFO: renamed from: w */
    public bgr0 f74443w;

    /* JADX INFO: renamed from: x */
    public long f74444x;

    /* JADX INFO: renamed from: y */
    public boolean f74445y;

    /* JADX INFO: renamed from: z */
    public int f74446z;

    static {
        HashMap map = new HashMap();
        map.put(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_NAME, "1");
        f74407M = Collections.unmodifiableMap(map);
        znr0 znr0Var = new znr0();
        znr0Var.m220658k("icy");
        znr0Var.m220672w("application/x-icy");
        f74408N = znr0Var.m220645D();
    }

    public b1z0(Uri uri, fex0 fex0Var, q0z0 q0z0Var, huy0 huy0Var, zty0 zty0Var, s6z0 s6z0Var, l0z0 l0z0Var, x0z0 x0z0Var, c6z0 c6z0Var, @Nullable String str, int i, long j) {
        this.f74421a = uri;
        this.f74422b = fex0Var;
        this.f74423c = huy0Var;
        this.f74425e = zty0Var;
        this.f74419K = s6z0Var;
        this.f74424d = l0z0Var;
        this.f74426f = x0z0Var;
        this.f74420L = c6z0Var;
        this.f74427g = i;
        this.f74429i = q0z0Var;
        this.f74444x = j;
        this.f74434n = j != -9223372036854775807L;
        this.f74430j = new bjv0(mfv0.f136676a);
        this.f74431k = new Runnable() { // from class: l.s0z0
            @Override // java.lang.Runnable
            public final void run() {
                this.f165744a.m101533C();
            }
        };
        this.f74432l = new Runnable() { // from class: l.t0z0
            @Override // java.lang.Runnable
            public final void run() {
                this.f171575a.m101556r();
            }
        };
        this.f74433m = mpw0.m159399L(null);
        this.f74438r = new z0z0[0];
        this.f74437q = new e2z0[0];
        this.f74414F = -9223372036854775807L;
        this.f74446z = 1;
    }

    /* JADX INFO: renamed from: M */
    public static /* bridge */ /* synthetic */ long m101522M(b1z0 b1z0Var, boolean z) {
        return b1z0Var.m101564z(true);
    }

    /* JADX INFO: renamed from: q */
    public static /* bridge */ /* synthetic */ void m101530q(final b1z0 b1z0Var) {
        b1z0Var.f74433m.post(new Runnable() { // from class: l.r0z0
            @Override // java.lang.Runnable
            public final void run() {
                this.f160736a.m101557s();
            }
        });
    }

    /* JADX INFO: renamed from: A */
    public final sgr0 m101531A(z0z0 z0z0Var) {
        int length = this.f74437q.length;
        for (int i = 0; i < length; i++) {
            if (z0z0Var.equals(this.f74438r[i])) {
                return this.f74437q[i];
            }
        }
        e2z0 e2z0Var = new e2z0(this.f74420L, this.f74423c, this.f74425e);
        e2z0Var.m119211J(this);
        int i2 = length + 1;
        z0z0[] z0z0VarArr = (z0z0[]) Arrays.copyOf(this.f74438r, i2);
        z0z0VarArr[length] = z0z0Var;
        int i3 = mpw0.f137957a;
        this.f74438r = z0z0VarArr;
        e2z0[] e2z0VarArr = (e2z0[]) Arrays.copyOf(this.f74437q, i2);
        e2z0VarArr[length] = e2z0Var;
        this.f74437q = e2z0VarArr;
        return e2z0Var;
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    /* JADX INFO: renamed from: B */
    public final void m101532B() {
        lev0.m153958f(this.f74440t);
        this.f74442v.getClass();
        this.f74443w.getClass();
    }

    /* JADX INFO: renamed from: C */
    public final void m101533C() {
        int i;
        if (this.f74418J || this.f74440t || !this.f74439s || this.f74443w == null) {
            return;
        }
        for (e2z0 e2z0Var : this.f74437q) {
            if (e2z0Var.m119203A() == null) {
                return;
            }
        }
        this.f74430j.m104775c();
        int length = this.f74437q.length;
        t2u0[] t2u0VarArr = new t2u0[length];
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            sqr0 sqr0VarM119203A = this.f74437q[i2].m119203A();
            sqr0VarM119203A.getClass();
            String str = sqr0VarM119203A.f170251l;
            boolean zM96495g = a8t0.m96495g(str);
            boolean z = zM96495g || a8t0.m96496h(str);
            zArr[i2] = z;
            this.f74441u = z | this.f74441u;
            zzaga zzagaVar = this.f74436p;
            if (zzagaVar != null) {
                if (zM96495g || this.f74438r[i2].f202470b) {
                    zzby zzbyVar = sqr0VarM119203A.f170249j;
                    zzby zzbyVar2 = zzbyVar == null ? new zzby(-9223372036854775807L, zzagaVar) : zzbyVar.m13607c(zzagaVar);
                    znr0 znr0VarM187559b = sqr0VarM119203A.m187559b();
                    znr0VarM187559b.m220665p(zzbyVar2);
                    sqr0VarM119203A = znr0VarM187559b.m220645D();
                }
                if (zM96495g && sqr0VarM119203A.f170245f == -1 && sqr0VarM119203A.f170246g == -1 && (i = zzagaVar.zza) != -1) {
                    znr0 znr0VarM187559b2 = sqr0VarM119203A.m187559b();
                    znr0VarM187559b2.m220657j0(i);
                    sqr0VarM119203A = znr0VarM187559b2.m220645D();
                }
            }
            t2u0VarArr[i2] = new t2u0(Integer.toString(i2), sqr0VarM119203A.m187560c(this.f74423c.mo118230a(sqr0VarM119203A)));
        }
        this.f74442v = new a1z0(new q2z0(t2u0VarArr), zArr);
        this.f74440t = true;
        hzy0 hzy0Var = this.f74435o;
        hzy0Var.getClass();
        hzy0Var.mo12636d(this);
    }

    /* JADX INFO: renamed from: D */
    public final void m101534D(int i) {
        m101532B();
        a1z0 a1z0Var = this.f74442v;
        boolean[] zArr = a1z0Var.f67909d;
        if (zArr[i]) {
            return;
        }
        sqr0 sqr0VarM189003b = a1z0Var.f67906a.m175102b(i).m189003b(0);
        this.f74424d.m152409c(new gzy0(1, a8t0.m96490b(sqr0VarM189003b.f170251l), sqr0VarM189003b, 0, null, mpw0.m159396I(this.f74413E), -9223372036854775807L));
        zArr[i] = true;
    }

    /* JADX INFO: renamed from: E */
    public final void m101535E(int i) {
        m101532B();
        boolean[] zArr = this.f74442v.f67907b;
        if (this.f74415G && zArr[i] && !this.f74437q[i].m119214M(false)) {
            this.f74414F = 0L;
            this.f74415G = false;
            this.f74410B = true;
            this.f74413E = 0L;
            this.f74416H = 0;
            for (e2z0 e2z0Var : this.f74437q) {
                e2z0Var.m119209H(false);
            }
            hzy0 hzy0Var = this.f74435o;
            hzy0Var.getClass();
            hzy0Var.mo12634c(this);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m101536F() {
        w0z0 w0z0Var = new w0z0(this, this.f74421a, this.f74422b, this.f74429i, this, this.f74430j);
        if (this.f74440t) {
            lev0.m153958f(m101537G());
            long j = this.f74444x;
            if (j != -9223372036854775807L && this.f74414F > j) {
                this.f74417I = true;
                this.f74414F = -9223372036854775807L;
                return;
            }
            bgr0 bgr0Var = this.f74443w;
            bgr0Var.getClass();
            w0z0.m204361f(w0z0Var, bgr0Var.mo97719a(this.f74414F).f204191a.f81727b, this.f74414F);
            for (e2z0 e2z0Var : this.f74437q) {
                e2z0Var.m119210I(this.f74414F);
            }
            this.f74414F = -9223372036854775807L;
        }
        this.f74416H = m101563y();
        long jM96400a = this.f74428h.m96400a(w0z0Var, this, s6z0.m184929a(this.f74446z));
        akx0 akx0Var = w0z0Var.f186750k;
        this.f74424d.m152413g(new bzy0(w0z0Var.f186740a, akx0Var, akx0Var.f72047a, Collections.EMPTY_MAP, jM96400a, 0L, 0L), new gzy0(1, -1, null, 0, null, mpw0.m159396I(w0z0Var.f186749j), mpw0.m159396I(this.f74444x)));
    }

    /* JADX INFO: renamed from: G */
    public final boolean m101537G() {
        return this.f74414F != -9223372036854775807L;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m101538H() {
        return this.f74410B || m101537G();
    }

    /* JADX INFO: renamed from: I */
    public final int m101539I(int i, l9y0 l9y0Var, evx0 evx0Var, int i2) {
        if (m101538H()) {
            return -3;
        }
        m101534D(i);
        int iM119234y = this.f74437q[i].m119234y(l9y0Var, evx0Var, i2, this.f74417I);
        if (iM119234y == -3) {
            m101535E(i);
        }
        return iM119234y;
    }

    /* JADX INFO: renamed from: J */
    public final int m101540J(int i, long j) throws Throwable {
        if (m101538H()) {
            return 0;
        }
        m101534D(i);
        e2z0 e2z0Var = this.f74437q[i];
        int iM119232w = e2z0Var.m119232w(j, this.f74417I);
        e2z0Var.m119212K(iM119232w);
        if (iM119232w != 0) {
            return iM119232w;
        }
        m101535E(i);
        return 0;
    }

    /* JADX INFO: renamed from: P */
    public final sgr0 m101541P() {
        return m101531A(new z0z0(0, true));
    }

    @Override // p153l.izy0, p153l.h2z0
    /* JADX INFO: renamed from: a */
    public final boolean mo101542a(gay0 gay0Var) {
        if (this.f74417I) {
            return false;
        }
        a7z0 a7z0Var = this.f74428h;
        if (a7z0Var.m96405k() || this.f74415G) {
            return false;
        }
        if (this.f74440t && this.f74411C == 0) {
            return false;
        }
        boolean zM104777e = this.f74430j.m104777e();
        if (a7z0Var.m96406l()) {
            return zM104777e;
        }
        m101536F();
        return true;
    }

    @Override // p153l.ser0
    /* JADX INFO: renamed from: c */
    public final void mo101544c() {
        this.f74439s = true;
        this.f74433m.post(this.f74431k);
    }

    @Override // p153l.t6z0
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ void mo101545d(x6z0 x6z0Var, long j, long j2, boolean z) {
        w0z0 w0z0Var = (w0z0) x6z0Var;
        xsx0 xsx0Var = w0z0Var.f186742c;
        bzy0 bzy0Var = new bzy0(w0z0Var.f186740a, w0z0Var.f186750k, xsx0Var.m212998k(), xsx0Var.m212999l(), j, j2, xsx0Var.m212997j());
        long unused = w0z0Var.f186740a;
        this.f74424d.m152410d(bzy0Var, new gzy0(1, -1, null, 0, null, mpw0.m159396I(w0z0Var.f186749j), mpw0.m159396I(this.f74444x)));
        if (z) {
            return;
        }
        for (e2z0 e2z0Var : this.f74437q) {
            e2z0Var.m119209H(false);
        }
        if (this.f74411C > 0) {
            hzy0 hzy0Var = this.f74435o;
            hzy0Var.getClass();
            hzy0Var.mo12634c(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0042  */
    @Override // p153l.izy0
    /* JADX INFO: renamed from: e */
    public final long mo101546e(n5z0[] n5z0VarArr, boolean[] zArr, f2z0[] f2z0VarArr, boolean[] zArr2, long j) {
        boolean z;
        n5z0 n5z0Var;
        m101532B();
        a1z0 a1z0Var = this.f74442v;
        q2z0 q2z0Var = a1z0Var.f67906a;
        boolean[] zArr3 = a1z0Var.f67908c;
        int i = this.f74411C;
        int i2 = 0;
        for (int i3 = 0; i3 < n5z0VarArr.length; i3++) {
            f2z0 f2z0Var = f2z0VarArr[i3];
            if (f2z0Var != null && (n5z0VarArr[i3] == null || !zArr[i3])) {
                int i4 = ((y0z0) f2z0Var).f197066a;
                lev0.m153958f(zArr3[i4]);
                this.f74411C--;
                zArr3[i4] = false;
                f2z0VarArr[i3] = null;
            }
        }
        if (this.f74434n) {
            z = false;
        } else {
            if (this.f74409A) {
                if (i != 0) {
                    z = false;
                }
            } else if (j == 0) {
                z = false;
                j = 0;
            }
            z = true;
        }
        for (int i5 = 0; i5 < n5z0VarArr.length; i5++) {
            if (f2z0VarArr[i5] == null && (n5z0Var = n5z0VarArr[i5]) != null) {
                lev0.m153958f(n5z0Var.zzc() == 1);
                lev0.m153958f(n5z0Var.zza(0) == 0);
                int iM175101a = q2z0Var.m175101a(n5z0Var.zze());
                lev0.m153958f(!zArr3[iM175101a]);
                this.f74411C++;
                zArr3[iM175101a] = true;
                f2z0VarArr[i5] = new y0z0(this, iM175101a);
                zArr2[i5] = true;
                if (!z) {
                    e2z0 e2z0Var = this.f74437q[iM175101a];
                    z = (e2z0Var.m119231v() == 0 || e2z0Var.m119216g(j, true)) ? false : true;
                }
            }
        }
        if (this.f74411C == 0) {
            this.f74415G = false;
            this.f74410B = false;
            boolean zM96406l = this.f74428h.m96406l();
            e2z0[] e2z0VarArr = this.f74437q;
            if (zM96406l) {
                int length = e2z0VarArr.length;
                while (i2 < length) {
                    e2z0VarArr[i2].m119205C();
                    i2++;
                }
                this.f74428h.m96401g();
            } else {
                for (e2z0 e2z0Var2 : e2z0VarArr) {
                    e2z0Var2.m119209H(false);
                }
            }
        } else if (z) {
            j = mo101553l(j);
            while (i2 < f2z0VarArr.length) {
                if (f2z0VarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.f74409A = true;
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0081 A[RETURN] */
    @Override // p153l.izy0
    /* JADX INFO: renamed from: f */
    public final long mo101547f(long j, gfy0 gfy0Var) {
        m101532B();
        if (!this.f74443w.zzh()) {
            return 0L;
        }
        zfr0 zfr0VarMo97719a = this.f74443w.mo97719a(j);
        cgr0 cgr0Var = zfr0VarMo97719a.f204191a;
        cgr0 cgr0Var2 = zfr0VarMo97719a.f204192b;
        long j2 = gfy0Var.f103971a;
        if (j2 == 0) {
            if (gfy0Var.f103972b == 0) {
                return j;
            }
            j2 = 0;
        }
        long j3 = cgr0Var.f81726a;
        int i = mpw0.f137957a;
        long j4 = j - j2;
        long j5 = gfy0Var.f103972b;
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
        long j9 = cgr0Var2.f81726a;
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

    @Override // p153l.izy0
    /* JADX INFO: renamed from: g */
    public final void mo101548g(long j, boolean z) {
        if (this.f74434n) {
            return;
        }
        m101532B();
        if (m101537G()) {
            return;
        }
        boolean[] zArr = this.f74442v.f67908c;
        int length = this.f74437q.length;
        for (int i = 0; i < length; i++) {
            this.f74437q[i].m119204B(j, false, zArr[i]);
        }
    }

    @Override // p153l.t6z0
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ v6z0 mo101549h(x6z0 x6z0Var, long j, long j2, IOException iOException, int i) {
        long jMin;
        v6z0 v6z0VarM96395b;
        bgr0 bgr0Var;
        w0z0 w0z0Var = (w0z0) x6z0Var;
        xsx0 xsx0Var = w0z0Var.f186742c;
        bzy0 bzy0Var = new bzy0(w0z0Var.f186740a, w0z0Var.f186750k, xsx0Var.m212998k(), xsx0Var.m212999l(), j, j2, xsx0Var.m212997j());
        long unused = w0z0Var.f186749j;
        int i2 = mpw0.f137957a;
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
            v6z0VarM96395b = a7z0.f68867g;
        } else {
            int iM101563y = m101563y();
            boolean z = iM101563y > this.f74416H;
            if (this.f74412D || !((bgr0Var = this.f74443w) == null || bgr0Var.zza() == -9223372036854775807L)) {
                this.f74416H = iM101563y;
            } else {
                boolean z2 = this.f74440t;
                if (!z2 || m101538H()) {
                    this.f74410B = z2;
                    this.f74413E = 0L;
                    this.f74416H = 0;
                    for (e2z0 e2z0Var : this.f74437q) {
                        e2z0Var.m119209H(false);
                    }
                    w0z0.m204361f(w0z0Var, 0L, 0L);
                } else {
                    this.f74415G = true;
                    v6z0VarM96395b = a7z0.f68866f;
                }
            }
            v6z0VarM96395b = a7z0.m96395b(z, jMin);
        }
        boolean zM200162c = v6z0VarM96395b.m200162c();
        this.f74424d.m152412f(bzy0Var, new gzy0(1, -1, null, 0, null, mpw0.m159396I(w0z0Var.f186749j), mpw0.m159396I(this.f74444x)), iOException, !zM200162c);
        if (!zM200162c) {
            long unused2 = w0z0Var.f186740a;
        }
        return v6z0VarM96395b;
    }

    @Override // p153l.ser0
    /* JADX INFO: renamed from: i */
    public final sgr0 mo101550i(int i, int i2) {
        return m101531A(new z0z0(i, false));
    }

    @Override // p153l.ser0
    /* JADX INFO: renamed from: j */
    public final void mo101551j(final bgr0 bgr0Var) {
        this.f74433m.post(new Runnable() { // from class: l.u0z0
            @Override // java.lang.Runnable
            public final void run() {
                this.f176957a.m101558t(bgr0Var);
            }
        });
    }

    @Override // p153l.izy0
    /* JADX INFO: renamed from: k */
    public final void mo101552k(hzy0 hzy0Var, long j) {
        this.f74435o = hzy0Var;
        this.f74430j.m104777e();
        m101536F();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0061 A[LOOP:1: B:27:0x005f->B:28:0x0061, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x006f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0078 A[LOOP:2: B:32:0x0076->B:33:0x0078, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:26:0x005c, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:31:0x006f, please report this as an issue */
    @Override // p153l.izy0
    /* JADX INFO: renamed from: l */
    public final long mo101553l(long j) {
        a7z0 a7z0Var;
        int i;
        m101532B();
        boolean[] zArr = this.f74442v.f67907b;
        if (true != this.f74443w.zzh()) {
            j = 0;
        }
        this.f74410B = false;
        this.f74413E = j;
        if (m101537G()) {
            this.f74414F = j;
            return j;
        }
        if (this.f74446z == 7) {
            this.f74415G = false;
            this.f74414F = j;
            this.f74417I = false;
            a7z0Var = this.f74428h;
            if (a7z0Var.m96406l()) {
                a7z0Var.m96402h();
                for (e2z0 e2z0Var : this.f74437q) {
                    e2z0Var.m119209H(false);
                }
                break;
                break;
            }
            for (e2z0 e2z0Var2 : this.f74437q) {
                e2z0Var2.m119205C();
            }
            this.f74428h.m96401g();
            return j;
        }
        int length = this.f74437q.length;
        for (int i2 = 0; i2 < length; i2++) {
            e2z0 e2z0Var3 = this.f74437q[i2];
            if (!(this.f74434n ? e2z0Var3.m119215N(e2z0Var3.m119230u()) : e2z0Var3.m119216g(j, false)) && (zArr[i2] || !this.f74441u)) {
                this.f74415G = false;
                this.f74414F = j;
                this.f74417I = false;
                a7z0Var = this.f74428h;
                if (a7z0Var.m96406l()) {
                    a7z0Var.m96402h();
                    while (i < r0) {
                        e2z0Var.m119209H(false);
                    }
                    break;
                }
                while (i < r2) {
                    e2z0Var2.m119205C();
                }
                this.f74428h.m96401g();
                return j;
            }
        }
        return j;
    }

    @Override // p153l.t6z0
    /* JADX INFO: renamed from: m */
    public final /* bridge */ /* synthetic */ void mo101554m(x6z0 x6z0Var, long j, long j2) {
        bgr0 bgr0Var;
        if (this.f74444x == -9223372036854775807L && (bgr0Var = this.f74443w) != null) {
            boolean zZzh = bgr0Var.zzh();
            long jM101564z = m101564z(true);
            long j3 = jM101564z == Long.MIN_VALUE ? 0L : jM101564z + 10000;
            this.f74444x = j3;
            this.f74426f.mo128581c(j3, zZzh, this.f74445y);
        }
        w0z0 w0z0Var = (w0z0) x6z0Var;
        xsx0 xsx0Var = w0z0Var.f186742c;
        bzy0 bzy0Var = new bzy0(w0z0Var.f186740a, w0z0Var.f186750k, xsx0Var.m212998k(), xsx0Var.m212999l(), j, j2, xsx0Var.m212997j());
        long unused = w0z0Var.f186740a;
        this.f74424d.m152411e(bzy0Var, new gzy0(1, -1, null, 0, null, mpw0.m159396I(w0z0Var.f186749j), mpw0.m159396I(this.f74444x)));
        this.f74417I = true;
        hzy0 hzy0Var = this.f74435o;
        hzy0Var.getClass();
        hzy0Var.mo12634c(this);
    }

    @Override // p153l.d2z0
    /* JADX INFO: renamed from: n */
    public final void mo101555n(sqr0 sqr0Var) {
        this.f74433m.post(this.f74431k);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m101556r() {
        if (this.f74418J) {
            return;
        }
        hzy0 hzy0Var = this.f74435o;
        hzy0Var.getClass();
        hzy0Var.mo12634c(this);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m101557s() {
        this.f74412D = true;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m101558t(bgr0 bgr0Var) {
        this.f74443w = this.f74436p == null ? bgr0Var : new agr0(-9223372036854775807L, 0L);
        if (bgr0Var.zza() == -9223372036854775807L && this.f74444x != -9223372036854775807L) {
            this.f74443w = new v0z0(this, this.f74443w);
        }
        this.f74444x = this.f74443w.zza();
        boolean z = false;
        if (!this.f74412D && bgr0Var.zza() == -9223372036854775807L) {
            z = true;
        }
        this.f74445y = z;
        this.f74446z = true == z ? 7 : 1;
        this.f74426f.mo128581c(this.f74444x, bgr0Var.zzh(), this.f74445y);
        if (this.f74440t) {
            return;
        }
        m101533C();
    }

    /* JADX INFO: renamed from: u */
    public final void m101559u() throws IOException {
        this.f74428h.m96403i(s6z0.m184929a(this.f74446z));
    }

    /* JADX INFO: renamed from: v */
    public final void m101560v(int i) throws IOException {
        this.f74437q[i].m119206E();
        m101559u();
    }

    /* JADX INFO: renamed from: w */
    public final void m101561w() {
        if (this.f74440t) {
            for (e2z0 e2z0Var : this.f74437q) {
                e2z0Var.m119207F();
            }
        }
        this.f74428h.m96404j(this);
        this.f74433m.removeCallbacksAndMessages(null);
        this.f74435o = null;
        this.f74418J = true;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m101562x(int i) {
        return !m101538H() && this.f74437q[i].m119214M(this.f74417I);
    }

    /* JADX INFO: renamed from: y */
    public final int m101563y() {
        int iM119233x = 0;
        for (e2z0 e2z0Var : this.f74437q) {
            iM119233x += e2z0Var.m119233x();
        }
        return iM119233x;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    /* JADX INFO: renamed from: z */
    public final long m101564z(boolean z) {
        int i = 0;
        long jMax = Long.MIN_VALUE;
        while (true) {
            e2z0[] e2z0VarArr = this.f74437q;
            if (i >= e2z0VarArr.length) {
                return jMax;
            }
            if (z) {
                jMax = Math.max(jMax, e2z0VarArr[i].m119235z());
            } else {
                a1z0 a1z0Var = this.f74442v;
                a1z0Var.getClass();
                if (a1z0Var.f67908c[i]) {
                    jMax = Math.max(jMax, e2z0VarArr[i].m119235z());
                }
            }
            i++;
        }
    }

    @Override // p153l.y6z0
    public final void zzL() {
        for (e2z0 e2z0Var : this.f74437q) {
            e2z0Var.m119208G();
        }
        this.f74429i.zze();
    }

    @Override // p153l.izy0, p153l.h2z0
    public final long zzb() {
        long jM101564z;
        m101532B();
        if (this.f74417I || this.f74411C == 0) {
            return Long.MIN_VALUE;
        }
        if (m101537G()) {
            return this.f74414F;
        }
        if (this.f74441u) {
            int length = this.f74437q.length;
            jM101564z = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                a1z0 a1z0Var = this.f74442v;
                if (a1z0Var.f67907b[i] && a1z0Var.f67908c[i] && !this.f74437q[i].m119213L()) {
                    jM101564z = Math.min(jM101564z, this.f74437q[i].m119235z());
                }
            }
        } else {
            jM101564z = Long.MAX_VALUE;
        }
        if (jM101564z == Long.MAX_VALUE) {
            jM101564z = m101564z(false);
        }
        return jM101564z == Long.MIN_VALUE ? this.f74413E : jM101564z;
    }

    @Override // p153l.izy0, p153l.h2z0
    public final long zzc() {
        return zzb();
    }

    @Override // p153l.izy0
    public final long zzd() {
        if (!this.f74410B) {
            return -9223372036854775807L;
        }
        if (!this.f74417I && m101563y() <= this.f74416H) {
            return -9223372036854775807L;
        }
        this.f74410B = false;
        return this.f74413E;
    }

    @Override // p153l.izy0
    public final q2z0 zzh() {
        m101532B();
        return this.f74442v.f67906a;
    }

    @Override // p153l.izy0
    public final void zzk() throws IOException {
        m101559u();
        if (this.f74417I && !this.f74440t) {
            throw zzcc.zza("Loading finished before preparation is complete.", null);
        }
    }

    @Override // p153l.izy0, p153l.h2z0
    public final boolean zzp() {
        return this.f74428h.m96406l() && this.f74430j.m104776d();
    }

    @Override // p153l.izy0, p153l.h2z0
    /* JADX INFO: renamed from: b */
    public final void mo101543b(long j) {
    }
}
