package p153l;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class n2z0 implements izy0, hzy0 {

    /* JADX INFO: renamed from: a */
    public final izy0 f139902a;

    /* JADX INFO: renamed from: b */
    public final long f139903b;

    /* JADX INFO: renamed from: c */
    public hzy0 f139904c;

    public n2z0(izy0 izy0Var, long j) {
        this.f139902a = izy0Var;
        this.f139903b = j;
    }

    @Override // p153l.izy0, p153l.h2z0
    /* JADX INFO: renamed from: a */
    public final boolean mo101542a(gay0 gay0Var) {
        long j = gay0Var.f103033a;
        long j2 = this.f139903b;
        z9y0 z9y0VarM129751a = gay0Var.m129751a();
        z9y0VarM129751a.m219093e(j - j2);
        return this.f139902a.mo101542a(z9y0VarM129751a.m219095g());
    }

    @Override // p153l.izy0, p153l.h2z0
    /* JADX INFO: renamed from: b */
    public final void mo101543b(long j) {
        this.f139902a.mo101543b(j - this.f139903b);
    }

    @Override // p153l.g2z0
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ void mo12634c(h2z0 h2z0Var) {
        hzy0 hzy0Var = this.f139904c;
        hzy0Var.getClass();
        hzy0Var.mo12634c(this);
    }

    @Override // p153l.hzy0
    /* JADX INFO: renamed from: d */
    public final void mo12636d(izy0 izy0Var) {
        hzy0 hzy0Var = this.f139904c;
        hzy0Var.getClass();
        hzy0Var.mo12636d(this);
    }

    @Override // p153l.izy0
    /* JADX INFO: renamed from: e */
    public final long mo101546e(n5z0[] n5z0VarArr, boolean[] zArr, f2z0[] f2z0VarArr, boolean[] zArr2, long j) {
        f2z0[] f2z0VarArr2 = new f2z0[f2z0VarArr.length];
        int i = 0;
        while (true) {
            f2z0 f2z0VarM156915c = null;
            if (i >= f2z0VarArr.length) {
                break;
            }
            m2z0 m2z0Var = (m2z0) f2z0VarArr[i];
            if (m2z0Var != null) {
                f2z0VarM156915c = m2z0Var.m156915c();
            }
            f2z0VarArr2[i] = f2z0VarM156915c;
            i++;
        }
        long jMo101546e = this.f139902a.mo101546e(n5z0VarArr, zArr, f2z0VarArr2, zArr2, j - this.f139903b);
        for (int i2 = 0; i2 < f2z0VarArr.length; i2++) {
            f2z0 f2z0Var = f2z0VarArr2[i2];
            if (f2z0Var == null) {
                f2z0VarArr[i2] = null;
            } else {
                f2z0 f2z0Var2 = f2z0VarArr[i2];
                if (f2z0Var2 == null || ((m2z0) f2z0Var2).m156915c() != f2z0Var) {
                    f2z0VarArr[i2] = new m2z0(f2z0Var, this.f139903b);
                }
            }
        }
        return jMo101546e + this.f139903b;
    }

    @Override // p153l.izy0
    /* JADX INFO: renamed from: f */
    public final long mo101547f(long j, gfy0 gfy0Var) {
        long j2 = this.f139903b;
        return this.f139902a.mo101547f(j - j2, gfy0Var) + j2;
    }

    @Override // p153l.izy0
    /* JADX INFO: renamed from: g */
    public final void mo101548g(long j, boolean z) {
        this.f139902a.mo101548g(j - this.f139903b, false);
    }

    /* JADX INFO: renamed from: h */
    public final izy0 m161259h() {
        return this.f139902a;
    }

    @Override // p153l.izy0
    /* JADX INFO: renamed from: k */
    public final void mo101552k(hzy0 hzy0Var, long j) {
        this.f139904c = hzy0Var;
        this.f139902a.mo101552k(this, j - this.f139903b);
    }

    @Override // p153l.izy0
    /* JADX INFO: renamed from: l */
    public final long mo101553l(long j) {
        long j2 = this.f139903b;
        return this.f139902a.mo101553l(j - j2) + j2;
    }

    @Override // p153l.izy0, p153l.h2z0
    public final long zzb() {
        long jZzb = this.f139902a.zzb();
        if (jZzb == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzb + this.f139903b;
    }

    @Override // p153l.izy0, p153l.h2z0
    public final long zzc() {
        long jZzc = this.f139902a.zzc();
        if (jZzc == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzc + this.f139903b;
    }

    @Override // p153l.izy0
    public final long zzd() {
        long jZzd = this.f139902a.zzd();
        if (jZzd == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jZzd + this.f139903b;
    }

    @Override // p153l.izy0
    public final q2z0 zzh() {
        return this.f139902a.zzh();
    }

    @Override // p153l.izy0
    public final void zzk() throws IOException {
        this.f139902a.zzk();
    }

    @Override // p153l.izy0, p153l.h2z0
    public final boolean zzp() {
        return this.f139902a.zzp();
    }
}
