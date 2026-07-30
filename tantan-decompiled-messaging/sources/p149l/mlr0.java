package p149l;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes6.dex */
public final class mlr0 implements v6r0 {

    /* JADX INFO: renamed from: a */
    public final jlr0 f134515a;

    /* JADX INFO: renamed from: b */
    public final int f134516b;

    /* JADX INFO: renamed from: c */
    public final long f134517c;

    /* JADX INFO: renamed from: d */
    public final long f134518d;

    /* JADX INFO: renamed from: e */
    public final long f134519e;

    public mlr0(jlr0 jlr0Var, int i, long j, long j2) {
        this.f134515a = jlr0Var;
        this.f134516b = i;
        this.f134517c = j;
        long j3 = (j2 - j) / ((long) jlr0Var.f118562d);
        this.f134518d = j3;
        this.f134519e = m155244c(j3);
    }

    /* JADX INFO: renamed from: c */
    private final long m155244c(long j) {
        return ggw0.m126051H(j * ((long) this.f134516b), 1000000L, this.f134515a.f118561c, RoundingMode.FLOOR);
    }

    @Override // p149l.v6r0
    /* JADX INFO: renamed from: a */
    public final t6r0 mo124628a(long j) {
        long jMax = Math.max(0L, Math.min((((long) this.f134515a.f118561c) * j) / (((long) this.f134516b) * 1000000), this.f134518d - 1));
        long j2 = ((long) this.f134515a.f118562d) * jMax;
        long jM155244c = m155244c(jMax);
        w6r0 w6r0Var = new w6r0(jM155244c, this.f134517c + j2);
        if (jM155244c >= j || jMax == this.f134518d - 1) {
            return new t6r0(w6r0Var, w6r0Var);
        }
        long j3 = jMax + 1;
        return new t6r0(w6r0Var, new w6r0(m155244c(j3), this.f134517c + (j3 * ((long) this.f134515a.f118562d))));
    }

    @Override // p149l.v6r0
    public final long zza() {
        return this.f134519e;
    }

    @Override // p149l.v6r0
    public final boolean zzh() {
        return true;
    }
}
