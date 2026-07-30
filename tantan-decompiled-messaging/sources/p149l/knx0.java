package p149l;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zziz;
import java.io.IOException;
import org.aspectj.lang.JoinPoint;

/* JADX INFO: loaded from: classes6.dex */
public abstract class knx0 implements p5y0, u5y0 {

    /* JADX INFO: renamed from: b */
    public final int f123915b;

    /* JADX INFO: renamed from: d */
    @Nullable
    public x5y0 f123917d;

    /* JADX INFO: renamed from: e */
    public int f123918e;

    /* JADX INFO: renamed from: f */
    public pfy0 f123919f;

    /* JADX INFO: renamed from: g */
    public g6v0 f123920g;

    /* JADX INFO: renamed from: h */
    public int f123921h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public zsy0 f123922i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public mhr0[] f123923j;

    /* JADX INFO: renamed from: k */
    public long f123924k;

    /* JADX INFO: renamed from: l */
    public long f123925l;

    /* JADX INFO: renamed from: n */
    public boolean f123927n;

    /* JADX INFO: renamed from: o */
    public boolean f123928o;

    /* JADX INFO: renamed from: q */
    @Nullable
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public s5y0 f123930q;

    /* JADX INFO: renamed from: a */
    public final Object f123914a = new Object();

    /* JADX INFO: renamed from: c */
    public final f0y0 f123916c = new f0y0();

    /* JADX INFO: renamed from: m */
    public long f123926m = Long.MIN_VALUE;

    /* JADX INFO: renamed from: p */
    public xqt0 f123929p = xqt0.f194042a;

    public knx0(int i) {
        this.f123915b = i;
    }

    /* JADX INFO: renamed from: D */
    public abstract void mo117303D(mhr0[] mhr0VarArr, long j, long j2, eqy0 eqy0Var) throws zziz;

    /* JADX INFO: renamed from: E */
    public final boolean m146593E() {
        if (mo146609h()) {
            return this.f123927n;
        }
        zsy0 zsy0Var = this.f123922i;
        zsy0Var.getClass();
        return zsy0Var.zze();
    }

    /* JADX INFO: renamed from: F */
    public final mhr0[] m146594F() {
        mhr0[] mhr0VarArr = this.f123923j;
        mhr0VarArr.getClass();
        return mhr0VarArr;
    }

    /* JADX INFO: renamed from: G */
    public final void m146595G(long j, boolean z) throws zziz {
        this.f123927n = false;
        this.f123925l = j;
        this.f123926m = j;
        mo99994S(j, z);
    }

    /* JADX INFO: renamed from: H */
    public final int m146596H(f0y0 f0y0Var, ylx0 ylx0Var, int i) {
        zsy0 zsy0Var = this.f123922i;
        zsy0Var.getClass();
        int iMo128012b = zsy0Var.mo128012b(f0y0Var, ylx0Var, i);
        if (iMo128012b == -4) {
            if (ylx0Var.m219213f()) {
                this.f123926m = Long.MIN_VALUE;
                return this.f123927n ? -4 : -3;
            }
            long j = ylx0Var.f198947f + this.f123924k;
            ylx0Var.f198947f = j;
            this.f123926m = Math.max(this.f123926m, j);
            return iMo128012b;
        }
        if (iMo128012b == -5) {
            mhr0 mhr0Var = f0y0Var.f94022a;
            mhr0Var.getClass();
            long j2 = mhr0Var.f133896p;
            if (j2 != Long.MAX_VALUE) {
                ter0 ter0VarM154634b = mhr0Var.m154634b();
                ter0VarM154634b.m188589B(j2 + this.f123924k);
                f0y0Var.f94022a = ter0VarM154634b.m188591D();
                return -5;
            }
        }
        return iMo128012b;
    }

    /* JADX INFO: renamed from: I */
    public final f0y0 m146597I() {
        f0y0 f0y0Var = this.f123916c;
        f0y0Var.f94023b = null;
        f0y0Var.f94022a = null;
        return f0y0Var;
    }

    /* JADX INFO: renamed from: J */
    public final int m146598J(long j) {
        zsy0 zsy0Var = this.f123922i;
        zsy0Var.getClass();
        return zsy0Var.mo128011a(j - this.f123924k);
    }

    /* JADX INFO: renamed from: K */
    public final long m146599K() {
        return this.f123925l;
    }

    /* JADX INFO: renamed from: L */
    public final g6v0 m146600L() {
        g6v0 g6v0Var = this.f123920g;
        g6v0Var.getClass();
        return g6v0Var;
    }

    /* JADX INFO: renamed from: M */
    public final zziz m146601M(Throwable th, @Nullable mhr0 mhr0Var, boolean z, int i) {
        int iMo117322l = 4;
        if (mhr0Var != null && !this.f123928o) {
            this.f123928o = true;
            try {
                iMo117322l = mo117322l(mhr0Var) & 7;
            } catch (zziz unused) {
            } finally {
                this.f123928o = false;
            }
        }
        return zziz.zzb(th, mo100005e(), this.f123918e, mhr0Var, iMo117322l, z, i);
    }

    /* JADX INFO: renamed from: N */
    public final x5y0 m146602N() {
        x5y0 x5y0Var = this.f123917d;
        x5y0Var.getClass();
        return x5y0Var;
    }

    /* JADX INFO: renamed from: O */
    public final pfy0 m146603O() {
        pfy0 pfy0Var = this.f123919f;
        pfy0Var.getClass();
        return pfy0Var;
    }

    /* JADX INFO: renamed from: P */
    public abstract void mo99988P();

    /* JADX INFO: renamed from: S */
    public abstract void mo99994S(long j, boolean z) throws zziz;

    @Override // p149l.p5y0
    /* JADX INFO: renamed from: a */
    public final void mo146604a() {
        f5v0.m119535f(this.f123921h == 1);
        f0y0 f0y0Var = this.f123916c;
        f0y0Var.f94023b = null;
        f0y0Var.f94022a = null;
        this.f123921h = 0;
        this.f123922i = null;
        this.f123923j = null;
        this.f123927n = false;
        mo99988P();
    }

    @Override // p149l.p5y0
    /* JADX INFO: renamed from: b */
    public final void mo146605b() throws IOException {
        zsy0 zsy0Var = this.f123922i;
        zsy0Var.getClass();
        zsy0Var.zzd();
    }

    @Override // p149l.p5y0, p149l.u5y0
    /* JADX INFO: renamed from: c */
    public final int mo146606c() {
        return this.f123915b;
    }

    @Override // p149l.p5y0
    /* JADX INFO: renamed from: d */
    public final void mo146607d() {
        this.f123927n = true;
    }

    @Override // p149l.p5y0
    /* JADX INFO: renamed from: f */
    public final boolean mo146608f() {
        return this.f123927n;
    }

    @Override // p149l.p5y0
    /* JADX INFO: renamed from: h */
    public final boolean mo146609h() {
        return this.f123926m == Long.MIN_VALUE;
    }

    @Override // p149l.p5y0
    /* JADX INFO: renamed from: k */
    public final void mo146610k(mhr0[] mhr0VarArr, zsy0 zsy0Var, long j, long j2, eqy0 eqy0Var) throws zziz {
        f5v0.m119535f(!this.f123927n);
        this.f123922i = zsy0Var;
        if (this.f123926m == Long.MIN_VALUE) {
            this.f123926m = j;
        }
        this.f123923j = mhr0VarArr;
        this.f123924k = j2;
        mo117303D(mhr0VarArr, j, j2, eqy0Var);
    }

    @Override // p149l.p5y0
    /* JADX INFO: renamed from: m */
    public final void mo146611m(xqt0 xqt0Var) {
        if (ggw0.m126064f(this.f123929p, xqt0Var)) {
            return;
        }
        this.f123929p = xqt0Var;
    }

    @Override // p149l.p5y0
    /* JADX INFO: renamed from: n */
    public final void mo146612n(int i, pfy0 pfy0Var, g6v0 g6v0Var) {
        this.f123918e = i;
        this.f123919f = pfy0Var;
        this.f123920g = g6v0Var;
        mo99992R();
    }

    @Override // p149l.p5y0
    /* JADX INFO: renamed from: o */
    public final void mo146613o() {
        f5v0.m119535f(this.f123921h == 0);
        f0y0 f0y0Var = this.f123916c;
        f0y0Var.f94023b = null;
        f0y0Var.f94022a = null;
        mo99978A();
    }

    @Override // p149l.p5y0
    /* JADX INFO: renamed from: q */
    public final void mo146614q(long j) throws zziz {
        m146595G(j, false);
    }

    @Override // p149l.p5y0
    /* JADX INFO: renamed from: s */
    public final int mo146615s() {
        return this.f123921h;
    }

    @Override // p149l.u5y0
    /* JADX INFO: renamed from: t */
    public final void mo146616t(s5y0 s5y0Var) {
        synchronized (this.f123914a) {
            this.f123930q = s5y0Var;
        }
    }

    @Override // p149l.p5y0
    /* JADX INFO: renamed from: v */
    public final long mo146617v() {
        return this.f123926m;
    }

    @Override // p149l.p5y0
    /* JADX INFO: renamed from: y */
    public final void mo146618y(x5y0 x5y0Var, mhr0[] mhr0VarArr, zsy0 zsy0Var, long j, boolean z, boolean z2, long j2, long j3, eqy0 eqy0Var) throws zziz {
        f5v0.m119535f(this.f123921h == 0);
        this.f123917d = x5y0Var;
        this.f123921h = 1;
        mo99990Q(z, z2);
        mo146610k(mhr0VarArr, zsy0Var, j2, j3, eqy0Var);
        m146595G(j2, z);
    }

    @Override // p149l.p5y0
    public final void zzF() {
        f5v0.m119535f(this.f123921h == 0);
        mo100018z();
    }

    @Override // p149l.p5y0
    public final void zzN() throws zziz {
        f5v0.m119535f(this.f123921h == 1);
        this.f123921h = 2;
        mo99980B();
    }

    @Override // p149l.p5y0
    public final void zzO() {
        f5v0.m119535f(this.f123921h == 2);
        this.f123921h = 1;
        mo99982C();
    }

    public int zze() throws zziz {
        return 0;
    }

    @Override // p149l.p5y0
    @Nullable
    public e1y0 zzk() {
        return null;
    }

    @Override // p149l.p5y0
    @Nullable
    public final zsy0 zzo() {
        return this.f123922i;
    }

    @Override // p149l.u5y0
    public final void zzp() {
        synchronized (this.f123914a) {
            this.f123930q = null;
        }
    }

    /* JADX INFO: renamed from: A */
    public void mo99978A() {
    }

    /* JADX INFO: renamed from: B */
    public void mo99980B() throws zziz {
    }

    /* JADX INFO: renamed from: C */
    public void mo99982C() {
    }

    /* JADX INFO: renamed from: R */
    public void mo99992R() {
    }

    /* JADX INFO: renamed from: z */
    public void mo100018z() {
    }

    @Override // p149l.p5y0
    public final u5y0 zzl() {
        return this;
    }

    @Override // p149l.p5y0
    public /* synthetic */ void zzs() {
    }

    /* JADX INFO: renamed from: Q */
    public void mo99990Q(boolean z, boolean z2) throws zziz {
    }

    @Override // p149l.p5y0
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void mo100009p(float f, float f2) {
    }

    @Override // p149l.a5y0
    /* JADX INFO: renamed from: u */
    public void mo95065u(int i, @Nullable Object obj) throws zziz {
    }
}
