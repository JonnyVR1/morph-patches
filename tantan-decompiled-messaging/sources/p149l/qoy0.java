package p149l;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class qoy0 implements cqy0, bqy0 {

    /* JADX INFO: renamed from: a */
    public final cqy0 f155648a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public bqy0 f155649b;

    /* JADX INFO: renamed from: c */
    public poy0[] f155650c = new poy0[0];

    /* JADX INFO: renamed from: d */
    public long f155651d = 0;

    /* JADX INFO: renamed from: e */
    public long f155652e;

    public qoy0(cqy0 cqy0Var, boolean z, long j, long j2) {
        this.f155648a = cqy0Var;
        this.f155652e = j2;
    }

    @Override // p149l.cqy0, p149l.bty0
    /* JADX INFO: renamed from: a */
    public final boolean mo103896a(a1y0 a1y0Var) {
        return this.f155648a.mo103896a(a1y0Var);
    }

    @Override // p149l.cqy0, p149l.bty0
    /* JADX INFO: renamed from: b */
    public final void mo103897b(long j) {
        this.f155648a.mo103897b(j);
    }

    @Override // p149l.aty0
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ void mo12580c(bty0 bty0Var) {
        bqy0 bqy0Var = this.f155649b;
        bqy0Var.getClass();
        bqy0Var.mo12580c(this);
    }

    @Override // p149l.bqy0
    /* JADX INFO: renamed from: d */
    public final void mo12582d(cqy0 cqy0Var) {
        bqy0 bqy0Var = this.f155649b;
        bqy0Var.getClass();
        bqy0Var.mo12582d(this);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0059  */
    @Override // p149l.cqy0
    /* JADX INFO: renamed from: e */
    public final long mo108304e(hwy0[] hwy0VarArr, boolean[] zArr, zsy0[] zsy0VarArr, boolean[] zArr2, long j) {
        int length = zsy0VarArr.length;
        this.f155650c = new poy0[length];
        zsy0[] zsy0VarArr2 = new zsy0[length];
        int i = 0;
        while (true) {
            zsy0 zsy0Var = null;
            if (i >= zsy0VarArr.length) {
                break;
            }
            poy0[] poy0VarArr = this.f155650c;
            poy0 poy0Var = (poy0) zsy0VarArr[i];
            poy0VarArr[i] = poy0Var;
            if (poy0Var != null) {
                zsy0Var = poy0Var.f150571a;
            }
            zsy0VarArr2[i] = zsy0Var;
            i++;
        }
        long jMo108304e = this.f155648a.mo108304e(hwy0VarArr, zArr, zsy0VarArr2, zArr2, j);
        long j2 = (m175788i() && j == 0) ? 0L : j;
        this.f155651d = -9223372036854775807L;
        boolean z = true;
        if (jMo108304e != j2) {
            if (jMo108304e >= 0) {
                long j3 = this.f155652e;
                if (j3 != Long.MIN_VALUE && jMo108304e > j3) {
                    z = false;
                }
            } else {
                z = false;
            }
        }
        f5v0.m119535f(z);
        for (int i2 = 0; i2 < zsy0VarArr.length; i2++) {
            zsy0 zsy0Var2 = zsy0VarArr2[i2];
            poy0[] poy0VarArr2 = this.f155650c;
            if (zsy0Var2 == null) {
                poy0VarArr2[i2] = null;
            } else {
                poy0 poy0Var2 = poy0VarArr2[i2];
                if (poy0Var2 == null || poy0Var2.f150571a != zsy0Var2) {
                    poy0VarArr2[i2] = new poy0(this, zsy0Var2);
                }
            }
            zsy0VarArr[i2] = this.f155650c[i2];
        }
        return jMo108304e;
    }

    @Override // p149l.cqy0
    /* JADX INFO: renamed from: f */
    public final long mo108305f(long j, a6y0 a6y0Var) {
        if (j == 0) {
            return 0L;
        }
        long jMax = Math.max(0L, Math.min(a6y0Var.f67817a, j));
        long j2 = a6y0Var.f67818b;
        long j3 = this.f155652e;
        long jMax2 = Math.max(0L, Math.min(j2, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j));
        if (jMax != a6y0Var.f67817a || jMax2 != a6y0Var.f67818b) {
            a6y0Var = new a6y0(jMax, jMax2);
        }
        return this.f155648a.mo108305f(j, a6y0Var);
    }

    @Override // p149l.cqy0
    /* JADX INFO: renamed from: g */
    public final void mo108306g(long j, boolean z) {
        this.f155648a.mo108306g(j, false);
    }

    /* JADX INFO: renamed from: h */
    public final void m175787h(long j, long j2) {
        this.f155652e = j2;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m175788i() {
        return this.f155651d != -9223372036854775807L;
    }

    @Override // p149l.cqy0
    /* JADX INFO: renamed from: k */
    public final void mo108307k(bqy0 bqy0Var, long j) {
        this.f155649b = bqy0Var;
        this.f155648a.mo108307k(this, j);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0035  */
    @Override // p149l.cqy0
    /* JADX INFO: renamed from: l */
    public final long mo108308l(long j) {
        this.f155651d = -9223372036854775807L;
        boolean z = false;
        for (poy0 poy0Var : this.f155650c) {
            if (poy0Var != null) {
                poy0Var.m170644c();
            }
        }
        long jMo108308l = this.f155648a.mo108308l(j);
        if (jMo108308l == j) {
            z = true;
        } else if (jMo108308l >= 0) {
            long j2 = this.f155652e;
            if (j2 == Long.MIN_VALUE || jMo108308l <= j2) {
                z = true;
            }
        }
        f5v0.m119535f(z);
        return jMo108308l;
    }

    @Override // p149l.cqy0, p149l.bty0
    public final long zzb() {
        long jZzb = this.f155648a.zzb();
        if (jZzb != Long.MIN_VALUE) {
            long j = this.f155652e;
            if (j == Long.MIN_VALUE || jZzb < j) {
                return jZzb;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // p149l.cqy0, p149l.bty0
    public final long zzc() {
        long jZzc = this.f155648a.zzc();
        if (jZzc != Long.MIN_VALUE) {
            long j = this.f155652e;
            if (j == Long.MIN_VALUE || jZzc < j) {
                return jZzc;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // p149l.cqy0
    public final long zzd() {
        if (m175788i()) {
            long j = this.f155651d;
            this.f155651d = -9223372036854775807L;
            long jZzd = zzd();
            return jZzd != -9223372036854775807L ? jZzd : j;
        }
        long jZzd2 = this.f155648a.zzd();
        if (jZzd2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        f5v0.m119535f(jZzd2 >= 0);
        long j2 = this.f155652e;
        f5v0.m119535f(j2 == Long.MIN_VALUE || jZzd2 <= j2);
        return jZzd2;
    }

    @Override // p149l.cqy0
    public final kty0 zzh() {
        return this.f155648a.zzh();
    }

    @Override // p149l.cqy0
    public final void zzk() throws IOException {
        this.f155648a.zzk();
    }

    @Override // p149l.cqy0, p149l.bty0
    public final boolean zzp() {
        return this.f155648a.zzp();
    }
}
