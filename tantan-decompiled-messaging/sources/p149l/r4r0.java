package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class r4r0 {

    /* JADX INFO: renamed from: a */
    public final long f157717a;

    /* JADX INFO: renamed from: b */
    public final long f157718b;

    /* JADX INFO: renamed from: c */
    public final long f157719c;

    /* JADX INFO: renamed from: d */
    public long f157720d = 0;

    /* JADX INFO: renamed from: e */
    public long f157721e;

    /* JADX INFO: renamed from: f */
    public long f157722f;

    /* JADX INFO: renamed from: g */
    public long f157723g;

    /* JADX INFO: renamed from: h */
    public long f157724h;

    public r4r0(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.f157717a = j;
        this.f157718b = j2;
        this.f157721e = j4;
        this.f157722f = j5;
        this.f157723g = j6;
        this.f157719c = j7;
        this.f157724h = m177828f(j2, 0L, j4, j5, j6, j7);
    }

    /* JADX INFO: renamed from: f */
    public static long m177828f(long j, long j2, long j3, long j4, long j5, long j6) {
        if (j4 + 1 >= j5 || 1 + j2 >= j3) {
            return j4;
        }
        long j7 = (long) ((j - j2) * ((j5 - j4) / (j3 - j2)));
        return Math.max(j4, Math.min(((j4 + j7) - j6) - (j7 / 20), j5 - 1));
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ void m177829g(r4r0 r4r0Var, long j, long j2) {
        r4r0Var.f157721e = j;
        r4r0Var.f157723g = j2;
        r4r0Var.m177831i();
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ void m177830h(r4r0 r4r0Var, long j, long j2) {
        r4r0Var.f157720d = j;
        r4r0Var.f157722f = j2;
        r4r0Var.m177831i();
    }

    /* JADX INFO: renamed from: i */
    public final void m177831i() {
        this.f157724h = m177828f(this.f157718b, this.f157720d, this.f157721e, this.f157722f, this.f157723g, this.f157719c);
    }
}
