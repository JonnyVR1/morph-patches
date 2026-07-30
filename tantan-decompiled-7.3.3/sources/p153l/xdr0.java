package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class xdr0 {

    /* JADX INFO: renamed from: a */
    public final long f193627a;

    /* JADX INFO: renamed from: b */
    public final long f193628b;

    /* JADX INFO: renamed from: c */
    public final long f193629c;

    /* JADX INFO: renamed from: d */
    public long f193630d = 0;

    /* JADX INFO: renamed from: e */
    public long f193631e;

    /* JADX INFO: renamed from: f */
    public long f193632f;

    /* JADX INFO: renamed from: g */
    public long f193633g;

    /* JADX INFO: renamed from: h */
    public long f193634h;

    public xdr0(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.f193627a = j;
        this.f193628b = j2;
        this.f193631e = j4;
        this.f193632f = j5;
        this.f193633g = j6;
        this.f193629c = j7;
        this.f193634h = m210484f(j2, 0L, j4, j5, j6, j7);
    }

    /* JADX INFO: renamed from: f */
    public static long m210484f(long j, long j2, long j3, long j4, long j5, long j6) {
        if (j4 + 1 >= j5 || 1 + j2 >= j3) {
            return j4;
        }
        long j7 = (long) ((j - j2) * ((j5 - j4) / (j3 - j2)));
        return Math.max(j4, Math.min(((j4 + j7) - j6) - (j7 / 20), j5 - 1));
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ void m210485g(xdr0 xdr0Var, long j, long j2) {
        xdr0Var.f193631e = j;
        xdr0Var.f193633g = j2;
        xdr0Var.m210487i();
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ void m210486h(xdr0 xdr0Var, long j, long j2) {
        xdr0Var.f193630d = j;
        xdr0Var.f193632f = j2;
        xdr0Var.m210487i();
    }

    /* JADX INFO: renamed from: i */
    public final void m210487i() {
        this.f193634h = m210484f(this.f193628b, this.f193630d, this.f193631e, this.f193632f, this.f193633g, this.f193629c);
    }
}
