package p153l;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class czy0 implements izy0, hzy0 {

    /* JADX INFO: renamed from: a */
    public final kzy0 f84507a;

    /* JADX INFO: renamed from: b */
    public final long f84508b;

    /* JADX INFO: renamed from: c */
    public mzy0 f84509c;

    /* JADX INFO: renamed from: d */
    public izy0 f84510d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public hzy0 f84511e;

    /* JADX INFO: renamed from: f */
    public long f84512f = -9223372036854775807L;

    /* JADX INFO: renamed from: g */
    public final c6z0 f84513g;

    public czy0(kzy0 kzy0Var, c6z0 c6z0Var, long j) {
        this.f84507a = kzy0Var;
        this.f84513g = c6z0Var;
        this.f84508b = j;
    }

    @Override // p153l.izy0, p153l.h2z0
    /* JADX INFO: renamed from: a */
    public final boolean mo101542a(gay0 gay0Var) {
        izy0 izy0Var = this.f84510d;
        return izy0Var != null && izy0Var.mo101542a(gay0Var);
    }

    @Override // p153l.izy0, p153l.h2z0
    /* JADX INFO: renamed from: b */
    public final void mo101543b(long j) {
        izy0 izy0Var = this.f84510d;
        int i = mpw0.f137957a;
        izy0Var.mo101543b(j);
    }

    @Override // p153l.g2z0
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ void mo12634c(h2z0 h2z0Var) {
        hzy0 hzy0Var = this.f84511e;
        int i = mpw0.f137957a;
        hzy0Var.mo12634c(this);
    }

    @Override // p153l.hzy0
    /* JADX INFO: renamed from: d */
    public final void mo12636d(izy0 izy0Var) {
        hzy0 hzy0Var = this.f84511e;
        int i = mpw0.f137957a;
        hzy0Var.mo12636d(this);
    }

    @Override // p153l.izy0
    /* JADX INFO: renamed from: e */
    public final long mo101546e(n5z0[] n5z0VarArr, boolean[] zArr, f2z0[] f2z0VarArr, boolean[] zArr2, long j) {
        long j2 = this.f84512f;
        if (j2 != -9223372036854775807L && j == this.f84508b) {
            j = j2;
        }
        this.f84512f = -9223372036854775807L;
        izy0 izy0Var = this.f84510d;
        int i = mpw0.f137957a;
        return izy0Var.mo101546e(n5z0VarArr, zArr, f2z0VarArr, zArr2, j);
    }

    @Override // p153l.izy0
    /* JADX INFO: renamed from: f */
    public final long mo101547f(long j, gfy0 gfy0Var) {
        izy0 izy0Var = this.f84510d;
        int i = mpw0.f137957a;
        return izy0Var.mo101547f(j, gfy0Var);
    }

    @Override // p153l.izy0
    /* JADX INFO: renamed from: g */
    public final void mo101548g(long j, boolean z) {
        izy0 izy0Var = this.f84510d;
        int i = mpw0.f137957a;
        izy0Var.mo101548g(j, false);
    }

    /* JADX INFO: renamed from: h */
    public final long m113353h() {
        return this.f84512f;
    }

    /* JADX INFO: renamed from: i */
    public final long m113354i() {
        return this.f84508b;
    }

    /* JADX INFO: renamed from: j */
    public final void m113355j(kzy0 kzy0Var) {
        long jM113359p = m113359p(this.f84508b);
        mzy0 mzy0Var = this.f84509c;
        mzy0Var.getClass();
        izy0 izy0VarMo128359i = mzy0Var.mo128359i(kzy0Var, this.f84513g, jM113359p);
        this.f84510d = izy0VarMo128359i;
        if (this.f84511e != null) {
            izy0VarMo128359i.mo101552k(this, jM113359p);
        }
    }

    @Override // p153l.izy0
    /* JADX INFO: renamed from: k */
    public final void mo101552k(hzy0 hzy0Var, long j) {
        this.f84511e = hzy0Var;
        izy0 izy0Var = this.f84510d;
        if (izy0Var != null) {
            izy0Var.mo101552k(this, m113359p(this.f84508b));
        }
    }

    @Override // p153l.izy0
    /* JADX INFO: renamed from: l */
    public final long mo101553l(long j) {
        izy0 izy0Var = this.f84510d;
        int i = mpw0.f137957a;
        return izy0Var.mo101553l(j);
    }

    /* JADX INFO: renamed from: m */
    public final void m113356m(long j) {
        this.f84512f = j;
    }

    /* JADX INFO: renamed from: n */
    public final void m113357n() {
        izy0 izy0Var = this.f84510d;
        if (izy0Var != null) {
            mzy0 mzy0Var = this.f84509c;
            mzy0Var.getClass();
            mzy0Var.mo128360k(izy0Var);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m113358o(mzy0 mzy0Var) {
        lev0.m153958f(this.f84509c == null);
        this.f84509c = mzy0Var;
    }

    /* JADX INFO: renamed from: p */
    public final long m113359p(long j) {
        long j2 = this.f84512f;
        return j2 != -9223372036854775807L ? j2 : j;
    }

    @Override // p153l.izy0, p153l.h2z0
    public final long zzb() {
        izy0 izy0Var = this.f84510d;
        int i = mpw0.f137957a;
        return izy0Var.zzb();
    }

    @Override // p153l.izy0, p153l.h2z0
    public final long zzc() {
        izy0 izy0Var = this.f84510d;
        int i = mpw0.f137957a;
        return izy0Var.zzc();
    }

    @Override // p153l.izy0
    public final long zzd() {
        izy0 izy0Var = this.f84510d;
        int i = mpw0.f137957a;
        return izy0Var.zzd();
    }

    @Override // p153l.izy0
    public final q2z0 zzh() {
        izy0 izy0Var = this.f84510d;
        int i = mpw0.f137957a;
        return izy0Var.zzh();
    }

    @Override // p153l.izy0
    public final void zzk() throws IOException {
        izy0 izy0Var = this.f84510d;
        if (izy0Var != null) {
            izy0Var.zzk();
            return;
        }
        mzy0 mzy0Var = this.f84509c;
        if (mzy0Var != null) {
            mzy0Var.mo128352G();
        }
    }

    @Override // p153l.izy0, p153l.h2z0
    public final boolean zzp() {
        izy0 izy0Var = this.f84510d;
        return izy0Var != null && izy0Var.zzp();
    }
}
