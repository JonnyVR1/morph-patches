package p153l;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zziz;
import java.io.IOException;
import org.aspectj.lang.JoinPoint;

/* JADX INFO: loaded from: classes6.dex */
public abstract class qwx0 implements vey0, afy0 {

    /* JADX INFO: renamed from: b */
    public final int f159973b;

    /* JADX INFO: renamed from: d */
    @Nullable
    public dfy0 f159975d;

    /* JADX INFO: renamed from: e */
    public int f159976e;

    /* JADX INFO: renamed from: f */
    public voy0 f159977f;

    /* JADX INFO: renamed from: g */
    public mfv0 f159978g;

    /* JADX INFO: renamed from: h */
    public int f159979h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public f2z0 f159980i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public sqr0[] f159981j;

    /* JADX INFO: renamed from: k */
    public long f159982k;

    /* JADX INFO: renamed from: l */
    public long f159983l;

    /* JADX INFO: renamed from: n */
    public boolean f159985n;

    /* JADX INFO: renamed from: o */
    public boolean f159986o;

    /* JADX INFO: renamed from: q */
    @Nullable
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public yey0 f159988q;

    /* JADX INFO: renamed from: a */
    public final Object f159972a = new Object();

    /* JADX INFO: renamed from: c */
    public final l9y0 f159974c = new l9y0();

    /* JADX INFO: renamed from: m */
    public long f159984m = Long.MIN_VALUE;

    /* JADX INFO: renamed from: p */
    public d0u0 f159987p = d0u0.f84608a;

    public qwx0(int i) {
        this.f159973b = i;
    }

    /* JADX INFO: renamed from: D */
    public abstract void mo151749D(sqr0[] sqr0VarArr, long j, long j2, kzy0 kzy0Var) throws zziz;

    /* JADX INFO: renamed from: E */
    public final boolean m178540E() {
        if (mo178555h()) {
            return this.f159985n;
        }
        f2z0 f2z0Var = this.f159980i;
        f2z0Var.getClass();
        return f2z0Var.zze();
    }

    /* JADX INFO: renamed from: F */
    public final sqr0[] m178541F() {
        sqr0[] sqr0VarArr = this.f159981j;
        sqr0VarArr.getClass();
        return sqr0VarArr;
    }

    /* JADX INFO: renamed from: G */
    public final void m178542G(long j, boolean z) throws zziz {
        this.f159985n = false;
        this.f159983l = j;
        this.f159984m = j;
        mo134384S(j, z);
    }

    /* JADX INFO: renamed from: H */
    public final int m178543H(l9y0 l9y0Var, evx0 evx0Var, int i) {
        f2z0 f2z0Var = this.f159980i;
        f2z0Var.getClass();
        int iMo123688b = f2z0Var.mo123688b(l9y0Var, evx0Var, i);
        if (iMo123688b == -4) {
            if (evx0Var.m127554f()) {
                this.f159984m = Long.MIN_VALUE;
                return this.f159985n ? -4 : -3;
            }
            long j = evx0Var.f96059f + this.f159982k;
            evx0Var.f96059f = j;
            this.f159984m = Math.max(this.f159984m, j);
            return iMo123688b;
        }
        if (iMo123688b == -5) {
            sqr0 sqr0Var = l9y0Var.f130645a;
            sqr0Var.getClass();
            long j2 = sqr0Var.f170255p;
            if (j2 != Long.MAX_VALUE) {
                znr0 znr0VarM187559b = sqr0Var.m187559b();
                znr0VarM187559b.m220643B(j2 + this.f159982k);
                l9y0Var.f130645a = znr0VarM187559b.m220645D();
                return -5;
            }
        }
        return iMo123688b;
    }

    /* JADX INFO: renamed from: I */
    public final l9y0 m178544I() {
        l9y0 l9y0Var = this.f159974c;
        l9y0Var.f130646b = null;
        l9y0Var.f130645a = null;
        return l9y0Var;
    }

    /* JADX INFO: renamed from: J */
    public final int m178545J(long j) {
        f2z0 f2z0Var = this.f159980i;
        f2z0Var.getClass();
        return f2z0Var.mo123687a(j - this.f159982k);
    }

    /* JADX INFO: renamed from: K */
    public final long m178546K() {
        return this.f159983l;
    }

    /* JADX INFO: renamed from: L */
    public final mfv0 m178547L() {
        mfv0 mfv0Var = this.f159978g;
        mfv0Var.getClass();
        return mfv0Var;
    }

    /* JADX INFO: renamed from: M */
    public final zziz m178548M(Throwable th, @Nullable sqr0 sqr0Var, boolean z, int i) {
        int iMo97572l = 4;
        if (sqr0Var != null && !this.f159986o) {
            this.f159986o = true;
            try {
                iMo97572l = mo97572l(sqr0Var) & 7;
            } catch (zziz unused) {
            } finally {
                this.f159986o = false;
            }
        }
        return zziz.zzb(th, mo97571e(), this.f159976e, sqr0Var, iMo97572l, z, i);
    }

    /* JADX INFO: renamed from: N */
    public final dfy0 m178549N() {
        dfy0 dfy0Var = this.f159975d;
        dfy0Var.getClass();
        return dfy0Var;
    }

    /* JADX INFO: renamed from: O */
    public final voy0 m178550O() {
        voy0 voy0Var = this.f159977f;
        voy0Var.getClass();
        return voy0Var;
    }

    /* JADX INFO: renamed from: P */
    public abstract void mo134378P();

    /* JADX INFO: renamed from: S */
    public abstract void mo134384S(long j, boolean z) throws zziz;

    @Override // p153l.vey0
    /* JADX INFO: renamed from: a */
    public final void mo178551a() {
        lev0.m153958f(this.f159979h == 1);
        l9y0 l9y0Var = this.f159974c;
        l9y0Var.f130646b = null;
        l9y0Var.f130645a = null;
        this.f159979h = 0;
        this.f159980i = null;
        this.f159981j = null;
        this.f159985n = false;
        mo134378P();
    }

    @Override // p153l.vey0
    /* JADX INFO: renamed from: b */
    public final void mo178552b() throws IOException {
        f2z0 f2z0Var = this.f159980i;
        f2z0Var.getClass();
        f2z0Var.zzd();
    }

    @Override // p153l.vey0, p153l.afy0
    /* JADX INFO: renamed from: c */
    public final int mo97570c() {
        return this.f159973b;
    }

    @Override // p153l.vey0
    /* JADX INFO: renamed from: d */
    public final void mo178553d() {
        this.f159985n = true;
    }

    @Override // p153l.vey0
    /* JADX INFO: renamed from: f */
    public final boolean mo178554f() {
        return this.f159985n;
    }

    @Override // p153l.vey0
    /* JADX INFO: renamed from: h */
    public final boolean mo178555h() {
        return this.f159984m == Long.MIN_VALUE;
    }

    @Override // p153l.vey0
    /* JADX INFO: renamed from: k */
    public final void mo178556k(sqr0[] sqr0VarArr, f2z0 f2z0Var, long j, long j2, kzy0 kzy0Var) throws zziz {
        lev0.m153958f(!this.f159985n);
        this.f159980i = f2z0Var;
        if (this.f159984m == Long.MIN_VALUE) {
            this.f159984m = j;
        }
        this.f159981j = sqr0VarArr;
        this.f159982k = j2;
        mo151749D(sqr0VarArr, j, j2, kzy0Var);
    }

    @Override // p153l.vey0
    /* JADX INFO: renamed from: m */
    public final void mo178557m(d0u0 d0u0Var) {
        if (mpw0.m159408f(this.f159987p, d0u0Var)) {
            return;
        }
        this.f159987p = d0u0Var;
    }

    @Override // p153l.vey0
    /* JADX INFO: renamed from: n */
    public final void mo178558n(int i, voy0 voy0Var, mfv0 mfv0Var) {
        this.f159976e = i;
        this.f159977f = voy0Var;
        this.f159978g = mfv0Var;
        mo134382R();
    }

    @Override // p153l.vey0
    /* JADX INFO: renamed from: o */
    public final void mo178559o() {
        lev0.m153958f(this.f159979h == 0);
        l9y0 l9y0Var = this.f159974c;
        l9y0Var.f130646b = null;
        l9y0Var.f130645a = null;
        mo134368A();
    }

    @Override // p153l.vey0
    /* JADX INFO: renamed from: q */
    public final void mo178560q(long j) throws zziz {
        m178542G(j, false);
    }

    @Override // p153l.vey0
    /* JADX INFO: renamed from: s */
    public final int mo178561s() {
        return this.f159979h;
    }

    @Override // p153l.afy0
    /* JADX INFO: renamed from: t */
    public final void mo97573t(yey0 yey0Var) {
        synchronized (this.f159972a) {
            this.f159988q = yey0Var;
        }
    }

    @Override // p153l.vey0
    /* JADX INFO: renamed from: v */
    public final long mo178562v() {
        return this.f159984m;
    }

    @Override // p153l.vey0
    /* JADX INFO: renamed from: y */
    public final void mo178563y(dfy0 dfy0Var, sqr0[] sqr0VarArr, f2z0 f2z0Var, long j, boolean z, boolean z2, long j2, long j3, kzy0 kzy0Var) throws zziz {
        lev0.m153958f(this.f159979h == 0);
        this.f159975d = dfy0Var;
        this.f159979h = 1;
        mo134380Q(z, z2);
        mo178556k(sqr0VarArr, f2z0Var, j2, j3, kzy0Var);
        m178542G(j2, z);
    }

    @Override // p153l.vey0
    public final void zzF() {
        lev0.m153958f(this.f159979h == 0);
        mo134407z();
    }

    @Override // p153l.vey0
    public final void zzN() throws zziz {
        lev0.m153958f(this.f159979h == 1);
        this.f159979h = 2;
        mo134370B();
    }

    @Override // p153l.vey0
    public final void zzO() {
        lev0.m153958f(this.f159979h == 2);
        this.f159979h = 1;
        mo134372C();
    }

    public int zze() throws zziz {
        return 0;
    }

    @Override // p153l.vey0
    @Nullable
    public kay0 zzk() {
        return null;
    }

    @Override // p153l.vey0
    @Nullable
    public final f2z0 zzo() {
        return this.f159980i;
    }

    @Override // p153l.afy0
    public final void zzp() {
        synchronized (this.f159972a) {
            this.f159988q = null;
        }
    }

    /* JADX INFO: renamed from: A */
    public void mo134368A() {
    }

    /* JADX INFO: renamed from: B */
    public void mo134370B() throws zziz {
    }

    /* JADX INFO: renamed from: C */
    public void mo134372C() {
    }

    /* JADX INFO: renamed from: R */
    public void mo134382R() {
    }

    /* JADX INFO: renamed from: z */
    public void mo134407z() {
    }

    @Override // p153l.vey0
    public final afy0 zzl() {
        return this;
    }

    @Override // p153l.vey0
    public /* synthetic */ void zzs() {
    }

    /* JADX INFO: renamed from: Q */
    public void mo134380Q(boolean z, boolean z2) throws zziz {
    }

    @Override // p153l.vey0
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void mo134398p(float f, float f2) {
    }

    @Override // p153l.gey0
    /* JADX INFO: renamed from: u */
    public void mo119682u(int i, @Nullable Object obj) throws zziz {
    }
}
