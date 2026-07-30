package p149l;

import android.os.Looper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class asy0 extends noy0 implements rry0 {

    /* JADX INFO: renamed from: h */
    public final e4x0 f71501h;

    /* JADX INFO: renamed from: i */
    public final bly0 f71502i;

    /* JADX INFO: renamed from: j */
    public final int f71503j;

    /* JADX INFO: renamed from: k */
    public boolean f71504k = true;

    /* JADX INFO: renamed from: l */
    public long f71505l = -9223372036854775807L;

    /* JADX INFO: renamed from: m */
    public boolean f71506m;

    /* JADX INFO: renamed from: n */
    public boolean f71507n;

    /* JADX INFO: renamed from: o */
    @Nullable
    public vjx0 f71508o;

    /* JADX INFO: renamed from: p */
    @GuardedBy("this")
    public nis0 f71509p;

    /* JADX INFO: renamed from: q */
    public final xry0 f71510q;

    /* JADX INFO: renamed from: r */
    public final mxy0 f71511r;

    public /* synthetic */ asy0(nis0 nis0Var, e4x0 e4x0Var, xry0 xry0Var, bly0 bly0Var, mxy0 mxy0Var, int i, zry0 zry0Var) {
        this.f71509p = nis0Var;
        this.f71501h = e4x0Var;
        this.f71510q = xry0Var;
        this.f71502i = bly0Var;
        this.f71511r = mxy0Var;
        this.f71503j = i;
    }

    /* JADX INFO: renamed from: A */
    public final void m98639A() {
        long j = this.f71505l;
        boolean z = this.f71506m;
        boolean z2 = this.f71507n;
        nis0 nis0VarMo98642d = mo98642d();
        xqt0 dty0Var = new dty0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j, 0L, 0L, z, false, false, null, nis0VarMo98642d, z2 ? nis0VarMo98642d.f139154d : null);
        if (this.f71504k) {
            dty0Var = new wry0(this, dty0Var);
        }
        m160438w(dty0Var);
    }

    @Override // p149l.rry0
    /* JADX INFO: renamed from: c */
    public final void mo98641c(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.f71505l;
        }
        if (!this.f71504k && this.f71505l == j && this.f71506m == z && this.f71507n == z2) {
            return;
        }
        this.f71505l = j;
        this.f71506m = z;
        this.f71507n = z2;
        this.f71504k = false;
        m98639A();
    }

    @Override // p149l.gqy0
    /* JADX INFO: renamed from: d */
    public final synchronized nis0 mo98642d() {
        return this.f71509p;
    }

    @Override // p149l.gqy0
    /* JADX INFO: renamed from: i */
    public final cqy0 mo98643i(eqy0 eqy0Var, wwy0 wwy0Var, long j) {
        z4x0 z4x0VarZza = this.f71501h.zza();
        vjx0 vjx0Var = this.f71508o;
        if (vjx0Var != null) {
            z4x0VarZza.mo128921f(vjx0Var);
        }
        t9s0 t9s0Var = mo98642d().f139152b;
        t9s0Var.getClass();
        xry0 xry0Var = this.f71510q;
        m160431o();
        return new vry0(t9s0Var.f169062a, z4x0VarZza, new ooy0(xry0Var.f194193a), this.f71502i, m160432p(eqy0Var), this.f71511r, m160434r(eqy0Var), this, wwy0Var, null, this.f71503j, ggw0.m126049F(-9223372036854775807L));
    }

    @Override // p149l.gqy0
    /* JADX INFO: renamed from: k */
    public final void mo98644k(cqy0 cqy0Var) {
        ((vry0) cqy0Var).m199786w();
    }

    @Override // p149l.noy0, p149l.gqy0
    /* JADX INFO: renamed from: m */
    public final synchronized void mo98645m(nis0 nis0Var) {
        this.f71509p = nis0Var;
    }

    @Override // p149l.noy0
    /* JADX INFO: renamed from: v */
    public final void mo98646v(@Nullable vjx0 vjx0Var) {
        this.f71508o = vjx0Var;
        Looper.myLooper().getClass();
        m160431o();
        m98639A();
    }

    @Override // p149l.gqy0
    /* JADX INFO: renamed from: G */
    public final void mo98640G() {
    }

    @Override // p149l.noy0
    /* JADX INFO: renamed from: x */
    public final void mo98647x() {
    }
}
