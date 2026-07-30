package p149l;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class wpy0 implements cqy0, bqy0 {

    /* JADX INFO: renamed from: a */
    public final eqy0 f187589a;

    /* JADX INFO: renamed from: b */
    public final long f187590b;

    /* JADX INFO: renamed from: c */
    public gqy0 f187591c;

    /* JADX INFO: renamed from: d */
    public cqy0 f187592d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public bqy0 f187593e;

    /* JADX INFO: renamed from: f */
    public long f187594f = -9223372036854775807L;

    /* JADX INFO: renamed from: g */
    public final wwy0 f187595g;

    public wpy0(eqy0 eqy0Var, wwy0 wwy0Var, long j) {
        this.f187589a = eqy0Var;
        this.f187595g = wwy0Var;
        this.f187590b = j;
    }

    @Override // p149l.cqy0, p149l.bty0
    /* JADX INFO: renamed from: a */
    public final boolean mo103896a(a1y0 a1y0Var) {
        cqy0 cqy0Var = this.f187592d;
        return cqy0Var != null && cqy0Var.mo103896a(a1y0Var);
    }

    @Override // p149l.cqy0, p149l.bty0
    /* JADX INFO: renamed from: b */
    public final void mo103897b(long j) {
        cqy0 cqy0Var = this.f187592d;
        int i = ggw0.f102568a;
        cqy0Var.mo103897b(j);
    }

    @Override // p149l.aty0
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ void mo12580c(bty0 bty0Var) {
        bqy0 bqy0Var = this.f187593e;
        int i = ggw0.f102568a;
        bqy0Var.mo12580c(this);
    }

    @Override // p149l.bqy0
    /* JADX INFO: renamed from: d */
    public final void mo12582d(cqy0 cqy0Var) {
        bqy0 bqy0Var = this.f187593e;
        int i = ggw0.f102568a;
        bqy0Var.mo12582d(this);
    }

    @Override // p149l.cqy0
    /* JADX INFO: renamed from: e */
    public final long mo108304e(hwy0[] hwy0VarArr, boolean[] zArr, zsy0[] zsy0VarArr, boolean[] zArr2, long j) {
        long j2 = this.f187594f;
        if (j2 != -9223372036854775807L && j == this.f187590b) {
            j = j2;
        }
        this.f187594f = -9223372036854775807L;
        cqy0 cqy0Var = this.f187592d;
        int i = ggw0.f102568a;
        return cqy0Var.mo108304e(hwy0VarArr, zArr, zsy0VarArr, zArr2, j);
    }

    @Override // p149l.cqy0
    /* JADX INFO: renamed from: f */
    public final long mo108305f(long j, a6y0 a6y0Var) {
        cqy0 cqy0Var = this.f187592d;
        int i = ggw0.f102568a;
        return cqy0Var.mo108305f(j, a6y0Var);
    }

    @Override // p149l.cqy0
    /* JADX INFO: renamed from: g */
    public final void mo108306g(long j, boolean z) {
        cqy0 cqy0Var = this.f187592d;
        int i = ggw0.f102568a;
        cqy0Var.mo108306g(j, false);
    }

    /* JADX INFO: renamed from: h */
    public final long m204952h() {
        return this.f187594f;
    }

    /* JADX INFO: renamed from: i */
    public final long m204953i() {
        return this.f187590b;
    }

    /* JADX INFO: renamed from: j */
    public final void m204954j(eqy0 eqy0Var) {
        long jM204958p = m204958p(this.f187590b);
        gqy0 gqy0Var = this.f187591c;
        gqy0Var.getClass();
        cqy0 cqy0VarMo98643i = gqy0Var.mo98643i(eqy0Var, this.f187595g, jM204958p);
        this.f187592d = cqy0VarMo98643i;
        if (this.f187593e != null) {
            cqy0VarMo98643i.mo108307k(this, jM204958p);
        }
    }

    @Override // p149l.cqy0
    /* JADX INFO: renamed from: k */
    public final void mo108307k(bqy0 bqy0Var, long j) {
        this.f187593e = bqy0Var;
        cqy0 cqy0Var = this.f187592d;
        if (cqy0Var != null) {
            cqy0Var.mo108307k(this, m204958p(this.f187590b));
        }
    }

    @Override // p149l.cqy0
    /* JADX INFO: renamed from: l */
    public final long mo108308l(long j) {
        cqy0 cqy0Var = this.f187592d;
        int i = ggw0.f102568a;
        return cqy0Var.mo108308l(j);
    }

    /* JADX INFO: renamed from: m */
    public final void m204955m(long j) {
        this.f187594f = j;
    }

    /* JADX INFO: renamed from: n */
    public final void m204956n() {
        cqy0 cqy0Var = this.f187592d;
        if (cqy0Var != null) {
            gqy0 gqy0Var = this.f187591c;
            gqy0Var.getClass();
            gqy0Var.mo98644k(cqy0Var);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m204957o(gqy0 gqy0Var) {
        f5v0.m119535f(this.f187591c == null);
        this.f187591c = gqy0Var;
    }

    /* JADX INFO: renamed from: p */
    public final long m204958p(long j) {
        long j2 = this.f187594f;
        return j2 != -9223372036854775807L ? j2 : j;
    }

    @Override // p149l.cqy0, p149l.bty0
    public final long zzb() {
        cqy0 cqy0Var = this.f187592d;
        int i = ggw0.f102568a;
        return cqy0Var.zzb();
    }

    @Override // p149l.cqy0, p149l.bty0
    public final long zzc() {
        cqy0 cqy0Var = this.f187592d;
        int i = ggw0.f102568a;
        return cqy0Var.zzc();
    }

    @Override // p149l.cqy0
    public final long zzd() {
        cqy0 cqy0Var = this.f187592d;
        int i = ggw0.f102568a;
        return cqy0Var.zzd();
    }

    @Override // p149l.cqy0
    public final kty0 zzh() {
        cqy0 cqy0Var = this.f187592d;
        int i = ggw0.f102568a;
        return cqy0Var.zzh();
    }

    @Override // p149l.cqy0
    public final void zzk() throws IOException {
        cqy0 cqy0Var = this.f187592d;
        if (cqy0Var != null) {
            cqy0Var.zzk();
            return;
        }
        gqy0 gqy0Var = this.f187591c;
        if (gqy0Var != null) {
            gqy0Var.mo98640G();
        }
    }

    @Override // p149l.cqy0, p149l.bty0
    public final boolean zzp() {
        cqy0 cqy0Var = this.f187592d;
        return cqy0Var != null && cqy0Var.zzp();
    }
}
