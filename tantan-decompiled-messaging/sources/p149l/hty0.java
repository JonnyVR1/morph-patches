package p149l;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class hty0 implements cqy0, bqy0 {

    /* JADX INFO: renamed from: a */
    public final cqy0 f109455a;

    /* JADX INFO: renamed from: b */
    public final long f109456b;

    /* JADX INFO: renamed from: c */
    public bqy0 f109457c;

    public hty0(cqy0 cqy0Var, long j) {
        this.f109455a = cqy0Var;
        this.f109456b = j;
    }

    @Override // p149l.cqy0, p149l.bty0
    /* JADX INFO: renamed from: a */
    public final boolean mo103896a(a1y0 a1y0Var) {
        long j = a1y0Var.f67207a;
        long j2 = this.f109456b;
        t0y0 t0y0VarM94584a = a1y0Var.m94584a();
        t0y0VarM94584a.m186883e(j - j2);
        return this.f109455a.mo103896a(t0y0VarM94584a.m186885g());
    }

    @Override // p149l.cqy0, p149l.bty0
    /* JADX INFO: renamed from: b */
    public final void mo103897b(long j) {
        this.f109455a.mo103897b(j - this.f109456b);
    }

    @Override // p149l.aty0
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ void mo12580c(bty0 bty0Var) {
        bqy0 bqy0Var = this.f109457c;
        bqy0Var.getClass();
        bqy0Var.mo12580c(this);
    }

    @Override // p149l.bqy0
    /* JADX INFO: renamed from: d */
    public final void mo12582d(cqy0 cqy0Var) {
        bqy0 bqy0Var = this.f109457c;
        bqy0Var.getClass();
        bqy0Var.mo12582d(this);
    }

    @Override // p149l.cqy0
    /* JADX INFO: renamed from: e */
    public final long mo108304e(hwy0[] hwy0VarArr, boolean[] zArr, zsy0[] zsy0VarArr, boolean[] zArr2, long j) {
        zsy0[] zsy0VarArr2 = new zsy0[zsy0VarArr.length];
        int i = 0;
        while (true) {
            zsy0 zsy0VarM128013c = null;
            if (i >= zsy0VarArr.length) {
                break;
            }
            gty0 gty0Var = (gty0) zsy0VarArr[i];
            if (gty0Var != null) {
                zsy0VarM128013c = gty0Var.m128013c();
            }
            zsy0VarArr2[i] = zsy0VarM128013c;
            i++;
        }
        long jMo108304e = this.f109455a.mo108304e(hwy0VarArr, zArr, zsy0VarArr2, zArr2, j - this.f109456b);
        for (int i2 = 0; i2 < zsy0VarArr.length; i2++) {
            zsy0 zsy0Var = zsy0VarArr2[i2];
            if (zsy0Var == null) {
                zsy0VarArr[i2] = null;
            } else {
                zsy0 zsy0Var2 = zsy0VarArr[i2];
                if (zsy0Var2 == null || ((gty0) zsy0Var2).m128013c() != zsy0Var) {
                    zsy0VarArr[i2] = new gty0(zsy0Var, this.f109456b);
                }
            }
        }
        return jMo108304e + this.f109456b;
    }

    @Override // p149l.cqy0
    /* JADX INFO: renamed from: f */
    public final long mo108305f(long j, a6y0 a6y0Var) {
        long j2 = this.f109456b;
        return this.f109455a.mo108305f(j - j2, a6y0Var) + j2;
    }

    @Override // p149l.cqy0
    /* JADX INFO: renamed from: g */
    public final void mo108306g(long j, boolean z) {
        this.f109455a.mo108306g(j - this.f109456b, false);
    }

    /* JADX INFO: renamed from: h */
    public final cqy0 m132943h() {
        return this.f109455a;
    }

    @Override // p149l.cqy0
    /* JADX INFO: renamed from: k */
    public final void mo108307k(bqy0 bqy0Var, long j) {
        this.f109457c = bqy0Var;
        this.f109455a.mo108307k(this, j - this.f109456b);
    }

    @Override // p149l.cqy0
    /* JADX INFO: renamed from: l */
    public final long mo108308l(long j) {
        long j2 = this.f109456b;
        return this.f109455a.mo108308l(j - j2) + j2;
    }

    @Override // p149l.cqy0, p149l.bty0
    public final long zzb() {
        long jZzb = this.f109455a.zzb();
        if (jZzb == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzb + this.f109456b;
    }

    @Override // p149l.cqy0, p149l.bty0
    public final long zzc() {
        long jZzc = this.f109455a.zzc();
        if (jZzc == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzc + this.f109456b;
    }

    @Override // p149l.cqy0
    public final long zzd() {
        long jZzd = this.f109455a.zzd();
        if (jZzd == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jZzd + this.f109456b;
    }

    @Override // p149l.cqy0
    public final kty0 zzh() {
        return this.f109455a.zzh();
    }

    @Override // p149l.cqy0
    public final void zzk() throws IOException {
        this.f109455a.zzk();
    }

    @Override // p149l.cqy0, p149l.bty0
    public final boolean zzp() {
        return this.f109455a.zzp();
    }
}
