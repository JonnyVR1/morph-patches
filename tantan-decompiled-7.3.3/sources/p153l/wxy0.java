package p153l;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class wxy0 implements izy0, hzy0 {

    /* JADX INFO: renamed from: a */
    public final izy0 f191545a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public hzy0 f191546b;

    /* JADX INFO: renamed from: c */
    public vxy0[] f191547c = new vxy0[0];

    /* JADX INFO: renamed from: d */
    public long f191548d = 0;

    /* JADX INFO: renamed from: e */
    public long f191549e;

    public wxy0(izy0 izy0Var, boolean z, long j, long j2) {
        this.f191545a = izy0Var;
        this.f191549e = j2;
    }

    @Override // p153l.izy0, p153l.h2z0
    /* JADX INFO: renamed from: a */
    public final boolean mo101542a(gay0 gay0Var) {
        return this.f191545a.mo101542a(gay0Var);
    }

    @Override // p153l.izy0, p153l.h2z0
    /* JADX INFO: renamed from: b */
    public final void mo101543b(long j) {
        this.f191545a.mo101543b(j);
    }

    @Override // p153l.g2z0
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ void mo12634c(h2z0 h2z0Var) {
        hzy0 hzy0Var = this.f191546b;
        hzy0Var.getClass();
        hzy0Var.mo12634c(this);
    }

    @Override // p153l.hzy0
    /* JADX INFO: renamed from: d */
    public final void mo12636d(izy0 izy0Var) {
        hzy0 hzy0Var = this.f191546b;
        hzy0Var.getClass();
        hzy0Var.mo12636d(this);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0059  */
    @Override // p153l.izy0
    /* JADX INFO: renamed from: e */
    public final long mo101546e(n5z0[] n5z0VarArr, boolean[] zArr, f2z0[] f2z0VarArr, boolean[] zArr2, long j) {
        int length = f2z0VarArr.length;
        this.f191547c = new vxy0[length];
        f2z0[] f2z0VarArr2 = new f2z0[length];
        int i = 0;
        while (true) {
            f2z0 f2z0Var = null;
            if (i >= f2z0VarArr.length) {
                break;
            }
            vxy0[] vxy0VarArr = this.f191547c;
            vxy0 vxy0Var = (vxy0) f2z0VarArr[i];
            vxy0VarArr[i] = vxy0Var;
            if (vxy0Var != null) {
                f2z0Var = vxy0Var.f186311a;
            }
            f2z0VarArr2[i] = f2z0Var;
            i++;
        }
        long jMo101546e = this.f191545a.mo101546e(n5z0VarArr, zArr, f2z0VarArr2, zArr2, j);
        long j2 = (m208463i() && j == 0) ? 0L : j;
        this.f191548d = -9223372036854775807L;
        boolean z = true;
        if (jMo101546e != j2) {
            if (jMo101546e >= 0) {
                long j3 = this.f191549e;
                if (j3 != Long.MIN_VALUE && jMo101546e > j3) {
                    z = false;
                }
            } else {
                z = false;
            }
        }
        lev0.m153958f(z);
        for (int i2 = 0; i2 < f2z0VarArr.length; i2++) {
            f2z0 f2z0Var2 = f2z0VarArr2[i2];
            vxy0[] vxy0VarArr2 = this.f191547c;
            if (f2z0Var2 == null) {
                vxy0VarArr2[i2] = null;
            } else {
                vxy0 vxy0Var2 = vxy0VarArr2[i2];
                if (vxy0Var2 == null || vxy0Var2.f186311a != f2z0Var2) {
                    vxy0VarArr2[i2] = new vxy0(this, f2z0Var2);
                }
            }
            f2z0VarArr[i2] = this.f191547c[i2];
        }
        return jMo101546e;
    }

    @Override // p153l.izy0
    /* JADX INFO: renamed from: f */
    public final long mo101547f(long j, gfy0 gfy0Var) {
        if (j == 0) {
            return 0L;
        }
        long jMax = Math.max(0L, Math.min(gfy0Var.f103971a, j));
        long j2 = gfy0Var.f103972b;
        long j3 = this.f191549e;
        long jMax2 = Math.max(0L, Math.min(j2, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j));
        if (jMax != gfy0Var.f103971a || jMax2 != gfy0Var.f103972b) {
            gfy0Var = new gfy0(jMax, jMax2);
        }
        return this.f191545a.mo101547f(j, gfy0Var);
    }

    @Override // p153l.izy0
    /* JADX INFO: renamed from: g */
    public final void mo101548g(long j, boolean z) {
        this.f191545a.mo101548g(j, false);
    }

    /* JADX INFO: renamed from: h */
    public final void m208462h(long j, long j2) {
        this.f191549e = j2;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m208463i() {
        return this.f191548d != -9223372036854775807L;
    }

    @Override // p153l.izy0
    /* JADX INFO: renamed from: k */
    public final void mo101552k(hzy0 hzy0Var, long j) {
        this.f191546b = hzy0Var;
        this.f191545a.mo101552k(this, j);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0035  */
    @Override // p153l.izy0
    /* JADX INFO: renamed from: l */
    public final long mo101553l(long j) {
        this.f191548d = -9223372036854775807L;
        boolean z = false;
        for (vxy0 vxy0Var : this.f191547c) {
            if (vxy0Var != null) {
                vxy0Var.m203892c();
            }
        }
        long jMo101553l = this.f191545a.mo101553l(j);
        if (jMo101553l == j) {
            z = true;
        } else if (jMo101553l >= 0) {
            long j2 = this.f191549e;
            if (j2 == Long.MIN_VALUE || jMo101553l <= j2) {
                z = true;
            }
        }
        lev0.m153958f(z);
        return jMo101553l;
    }

    @Override // p153l.izy0, p153l.h2z0
    public final long zzb() {
        long jZzb = this.f191545a.zzb();
        if (jZzb != Long.MIN_VALUE) {
            long j = this.f191549e;
            if (j == Long.MIN_VALUE || jZzb < j) {
                return jZzb;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // p153l.izy0, p153l.h2z0
    public final long zzc() {
        long jZzc = this.f191545a.zzc();
        if (jZzc != Long.MIN_VALUE) {
            long j = this.f191549e;
            if (j == Long.MIN_VALUE || jZzc < j) {
                return jZzc;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // p153l.izy0
    public final long zzd() {
        if (m208463i()) {
            long j = this.f191548d;
            this.f191548d = -9223372036854775807L;
            long jZzd = zzd();
            return jZzd != -9223372036854775807L ? jZzd : j;
        }
        long jZzd2 = this.f191545a.zzd();
        if (jZzd2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        lev0.m153958f(jZzd2 >= 0);
        long j2 = this.f191549e;
        lev0.m153958f(j2 == Long.MIN_VALUE || jZzd2 <= j2);
        return jZzd2;
    }

    @Override // p153l.izy0
    public final q2z0 zzh() {
        return this.f191545a.zzh();
    }

    @Override // p153l.izy0
    public final void zzk() throws IOException {
        this.f191545a.zzk();
    }

    @Override // p153l.izy0, p153l.h2z0
    public final boolean zzp() {
        return this.f191545a.zzp();
    }
}
