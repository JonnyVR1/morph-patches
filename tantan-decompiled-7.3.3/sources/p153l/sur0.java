package p153l;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes6.dex */
public final class sur0 implements bgr0 {

    /* JADX INFO: renamed from: a */
    public final pur0 f170754a;

    /* JADX INFO: renamed from: b */
    public final int f170755b;

    /* JADX INFO: renamed from: c */
    public final long f170756c;

    /* JADX INFO: renamed from: d */
    public final long f170757d;

    /* JADX INFO: renamed from: e */
    public final long f170758e;

    public sur0(pur0 pur0Var, int i, long j, long j2) {
        this.f170754a = pur0Var;
        this.f170755b = i;
        this.f170756c = j;
        long j3 = (j2 - j) / ((long) pur0Var.f154219d);
        this.f170757d = j3;
        this.f170758e = m188097c(j3);
    }

    /* JADX INFO: renamed from: c */
    private final long m188097c(long j) {
        return mpw0.m159395H(j * ((long) this.f170755b), 1000000L, this.f170754a.f154218c, RoundingMode.FLOOR);
    }

    @Override // p153l.bgr0
    /* JADX INFO: renamed from: a */
    public final zfr0 mo97719a(long j) {
        long jMax = Math.max(0L, Math.min((((long) this.f170754a.f154218c) * j) / (((long) this.f170755b) * 1000000), this.f170757d - 1));
        long j2 = ((long) this.f170754a.f154219d) * jMax;
        long jM188097c = m188097c(jMax);
        cgr0 cgr0Var = new cgr0(jM188097c, this.f170756c + j2);
        if (jM188097c >= j || jMax == this.f170757d - 1) {
            return new zfr0(cgr0Var, cgr0Var);
        }
        long j3 = jMax + 1;
        return new zfr0(cgr0Var, new cgr0(m188097c(j3), this.f170756c + (j3 * ((long) this.f170754a.f154219d))));
    }

    @Override // p153l.bgr0
    public final long zza() {
        return this.f170758e;
    }

    @Override // p153l.bgr0
    public final boolean zzh() {
        return true;
    }
}
