package p153l;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class nnr0 implements unr0 {

    /* JADX INFO: renamed from: a */
    public final tnr0 f142864a;

    /* JADX INFO: renamed from: b */
    public final long f142865b;

    /* JADX INFO: renamed from: c */
    public final long f142866c;

    /* JADX INFO: renamed from: d */
    public final lor0 f142867d;

    /* JADX INFO: renamed from: e */
    public int f142868e;

    /* JADX INFO: renamed from: f */
    public long f142869f;

    /* JADX INFO: renamed from: g */
    public long f142870g;

    /* JADX INFO: renamed from: h */
    public long f142871h;

    /* JADX INFO: renamed from: i */
    public long f142872i;

    /* JADX INFO: renamed from: j */
    public long f142873j;

    /* JADX INFO: renamed from: k */
    public long f142874k;

    /* JADX INFO: renamed from: l */
    public long f142875l;

    public nnr0(lor0 lor0Var, long j, long j2, long j3, long j4, boolean z) {
        lev0.m153956d(j >= 0 && j2 > j);
        this.f142867d = lor0Var;
        this.f142865b = j;
        this.f142866c = j2;
        if (j3 == j2 - j || z) {
            this.f142869f = j4;
            this.f142868e = 4;
        } else {
            this.f142868e = 0;
        }
        this.f142864a = new tnr0();
    }

    @Override // p153l.unr0
    /* JADX INFO: renamed from: a */
    public final void mo150675a(long j) {
        this.f142871h = Math.max(0L, Math.min(j, this.f142869f - 1));
        this.f142868e = 2;
        this.f142872i = this.f142865b;
        this.f142873j = this.f142866c;
        this.f142874k = 0L;
        this.f142875l = this.f142869f;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00ab A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ac  */
    @Override // p153l.unr0
    /* JADX INFO: renamed from: b */
    public final long mo150676b(qer0 qer0Var) throws IOException {
        long j;
        long j2;
        long jMax;
        int i = this.f142868e;
        if (i == 0) {
            j = 0;
            long jZzf = qer0Var.zzf();
            this.f142870g = jZzf;
            this.f142868e = 1;
            long j3 = this.f142866c - 65307;
            if (j3 > jZzf) {
                return j3;
            }
        } else if (i != 1) {
            if (i == 2) {
                long j4 = this.f142872i;
                long j5 = this.f142873j;
                if (j4 == j5) {
                    jMax = -1;
                } else {
                    long jZzf2 = qer0Var.zzf();
                    if (this.f142864a.m191963c(qer0Var, j5)) {
                        this.f142864a.m191962b(qer0Var, false);
                        qer0Var.zzj();
                        long j6 = this.f142871h;
                        tnr0 tnr0Var = this.f142864a;
                        j2 = 2;
                        long j7 = tnr0Var.f175310b;
                        long j8 = j6 - j7;
                        int i2 = tnr0Var.f175312d + tnr0Var.f175313e;
                        if (j8 < 0 || j8 >= 72000) {
                            if (j8 < 0) {
                                this.f142873j = jZzf2;
                                this.f142875l = j7;
                            } else {
                                this.f142872i = ((long) i2) + qer0Var.zzf();
                                this.f142874k = j7;
                            }
                            long j9 = this.f142873j;
                            long j10 = this.f142872i;
                            long j11 = j9 - j10;
                            if (j11 < 100000) {
                                this.f142873j = j10;
                                jMax = j10;
                            } else {
                                jMax = Math.max(j10, Math.min((qer0Var.zzf() - (((long) i2) * (j8 <= 0 ? 2L : 1L))) + ((j8 * j11) / (this.f142875l - this.f142874k)), j9 - 1));
                            }
                        } else {
                            jMax = -1;
                        }
                    } else {
                        jMax = this.f142872i;
                        if (jMax == jZzf2) {
                            zpg0.m220844a("No ogg page can be found.");
                            return 0L;
                        }
                    }
                    if (jMax != -1) {
                        return jMax;
                    }
                    this.f142868e = 3;
                }
                j2 = 2;
                if (jMax != -1) {
                    return jMax;
                }
                this.f142868e = 3;
            } else {
                if (i != 3) {
                    return -1L;
                }
                j2 = 2;
            }
            while (true) {
                this.f142864a.m191963c(qer0Var, -1L);
                this.f142864a.m191962b(qer0Var, false);
                tnr0 tnr0Var2 = this.f142864a;
                if (tnr0Var2.f175310b > this.f142871h) {
                    qer0Var.zzj();
                    this.f142868e = 4;
                    return -(this.f142874k + j2);
                }
                ((fer0) qer0Var).m125319k(tnr0Var2.f175312d + tnr0Var2.f175313e, false);
                this.f142872i = qer0Var.zzf();
                this.f142874k = this.f142864a.f175310b;
            }
        } else {
            j = 0;
        }
        this.f142864a.m191961a();
        if (!this.f142864a.m191963c(qer0Var, -1L)) {
            vg3.m201207a();
            return j;
        }
        this.f142864a.m191962b(qer0Var, false);
        tnr0 tnr0Var3 = this.f142864a;
        ((fer0) qer0Var).m125319k(tnr0Var3.f175312d + tnr0Var3.f175313e, false);
        long j12 = this.f142864a.f175310b;
        while (true) {
            tnr0 tnr0Var4 = this.f142864a;
            if ((tnr0Var4.f175309a & 4) == 4 || !tnr0Var4.m191963c(qer0Var, -1L) || qer0Var.zzf() >= this.f142866c || !this.f142864a.m191962b(qer0Var, true)) {
                break;
            }
            tnr0 tnr0Var5 = this.f142864a;
            if (!ter0.m190895e(qer0Var, tnr0Var5.f175312d + tnr0Var5.f175313e)) {
                break;
            }
            j12 = this.f142864a.f175310b;
        }
        this.f142869f = j12;
        this.f142868e = 4;
        return this.f142870g;
    }

    @Override // p153l.unr0
    @Nullable
    public final /* bridge */ /* synthetic */ bgr0 zze() {
        lnr0 lnr0Var = null;
        if (this.f142869f != 0) {
            return new mnr0(this, lnr0Var);
        }
        return null;
    }
}
