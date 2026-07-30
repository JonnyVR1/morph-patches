package p153l;

import android.os.Looper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class g1z0 extends txy0 implements x0z0 {

    /* JADX INFO: renamed from: h */
    public final kdx0 f101795h;

    /* JADX INFO: renamed from: i */
    public final huy0 f101796i;

    /* JADX INFO: renamed from: j */
    public final int f101797j;

    /* JADX INFO: renamed from: k */
    public boolean f101798k = true;

    /* JADX INFO: renamed from: l */
    public long f101799l = -9223372036854775807L;

    /* JADX INFO: renamed from: m */
    public boolean f101800m;

    /* JADX INFO: renamed from: n */
    public boolean f101801n;

    /* JADX INFO: renamed from: o */
    @Nullable
    public btx0 f101802o;

    /* JADX INFO: renamed from: p */
    @GuardedBy("this")
    public trs0 f101803p;

    /* JADX INFO: renamed from: q */
    public final d1z0 f101804q;

    /* JADX INFO: renamed from: r */
    public final s6z0 f101805r;

    public /* synthetic */ g1z0(trs0 trs0Var, kdx0 kdx0Var, d1z0 d1z0Var, huy0 huy0Var, s6z0 s6z0Var, int i, f1z0 f1z0Var) {
        this.f101803p = trs0Var;
        this.f101795h = kdx0Var;
        this.f101804q = d1z0Var;
        this.f101796i = huy0Var;
        this.f101805r = s6z0Var;
        this.f101797j = i;
    }

    /* JADX INFO: renamed from: A */
    public final void m128580A() {
        long j = this.f101799l;
        boolean z = this.f101800m;
        boolean z2 = this.f101801n;
        trs0 trs0VarMo128582d = mo128582d();
        d0u0 j2z0Var = new j2z0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j, 0L, 0L, z, false, false, null, trs0VarMo128582d, z2 ? trs0VarMo128582d.f175941d : null);
        if (this.f101798k) {
            j2z0Var = new c1z0(this, j2z0Var);
        }
        m193550w(j2z0Var);
    }

    @Override // p153l.x0z0
    /* JADX INFO: renamed from: c */
    public final void mo128581c(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.f101799l;
        }
        if (!this.f101798k && this.f101799l == j && this.f101800m == z && this.f101801n == z2) {
            return;
        }
        this.f101799l = j;
        this.f101800m = z;
        this.f101801n = z2;
        this.f101798k = false;
        m128580A();
    }

    @Override // p153l.mzy0
    /* JADX INFO: renamed from: d */
    public final synchronized trs0 mo128582d() {
        return this.f101803p;
    }

    @Override // p153l.mzy0
    /* JADX INFO: renamed from: i */
    public final izy0 mo128359i(kzy0 kzy0Var, c6z0 c6z0Var, long j) {
        fex0 fex0VarZza = this.f101795h.zza();
        btx0 btx0Var = this.f101802o;
        if (btx0Var != null) {
            fex0VarZza.mo101236f(btx0Var);
        }
        zis0 zis0Var = mo128582d().f175939b;
        zis0Var.getClass();
        d1z0 d1z0Var = this.f101804q;
        m193543o();
        return new b1z0(zis0Var.f204611a, fex0VarZza, new uxy0(d1z0Var.f84743a), this.f101796i, m193544p(kzy0Var), this.f101805r, m193546r(kzy0Var), this, c6z0Var, null, this.f101797j, mpw0.m159393F(-9223372036854775807L));
    }

    @Override // p153l.mzy0
    /* JADX INFO: renamed from: k */
    public final void mo128360k(izy0 izy0Var) {
        ((b1z0) izy0Var).m101561w();
    }

    @Override // p153l.txy0, p153l.mzy0
    /* JADX INFO: renamed from: m */
    public final synchronized void mo128361m(trs0 trs0Var) {
        this.f101803p = trs0Var;
    }

    @Override // p153l.txy0
    /* JADX INFO: renamed from: v */
    public final void mo128583v(@Nullable btx0 btx0Var) {
        this.f101802o = btx0Var;
        Looper.myLooper().getClass();
        m193543o();
        m128580A();
    }

    @Override // p153l.mzy0
    /* JADX INFO: renamed from: G */
    public final void mo128352G() {
    }

    @Override // p153l.txy0
    /* JADX INFO: renamed from: x */
    public final void mo128362x() {
    }
}
