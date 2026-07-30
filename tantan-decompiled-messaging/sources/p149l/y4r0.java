package p149l;

/* JADX INFO: loaded from: classes6.dex */
public class y4r0 implements v6r0 {

    /* JADX INFO: renamed from: a */
    public final long f196330a;

    /* JADX INFO: renamed from: b */
    public final long f196331b;

    /* JADX INFO: renamed from: c */
    public final int f196332c;

    /* JADX INFO: renamed from: d */
    public final long f196333d;

    /* JADX INFO: renamed from: e */
    public final int f196334e;

    /* JADX INFO: renamed from: f */
    public final long f196335f;

    public y4r0(long j, long j2, int i, int i2, boolean z) {
        long jM212942d;
        this.f196330a = j;
        this.f196331b = j2;
        this.f196332c = i2 == -1 ? 1 : i2;
        this.f196334e = i;
        if (j == -1) {
            this.f196333d = -1L;
            jM212942d = -9223372036854775807L;
        } else {
            this.f196333d = j - j2;
            jM212942d = m212942d(j, j2, i);
        }
        this.f196335f = jM212942d;
    }

    /* JADX INFO: renamed from: d */
    public static long m212942d(long j, long j2, int i) {
        return (Math.max(0L, j - j2) * 8000000) / ((long) i);
    }

    @Override // p149l.v6r0
    /* JADX INFO: renamed from: a */
    public final t6r0 mo124628a(long j) {
        long j2 = this.f196333d;
        if (j2 == -1) {
            w6r0 w6r0Var = new w6r0(0L, this.f196331b);
            return new t6r0(w6r0Var, w6r0Var);
        }
        long j3 = ((long) this.f196334e) * j;
        long j4 = this.f196332c;
        long jMin = ((j3 / 8000000) / j4) * j4;
        if (j2 != -1) {
            jMin = Math.min(jMin, j2 - j4);
        }
        long jMax = this.f196331b + Math.max(jMin, 0L);
        long jM212943c = m212943c(jMax);
        w6r0 w6r0Var2 = new w6r0(jM212943c, jMax);
        if (this.f196333d != -1 && jM212943c < j) {
            long j5 = jMax + ((long) this.f196332c);
            if (j5 < this.f196330a) {
                return new t6r0(w6r0Var2, new w6r0(m212943c(j5), j5));
            }
        }
        return new t6r0(w6r0Var2, w6r0Var2);
    }

    /* JADX INFO: renamed from: c */
    public final long m212943c(long j) {
        return m212942d(j, this.f196331b, this.f196334e);
    }

    @Override // p149l.v6r0
    public final long zza() {
        return this.f196335f;
    }

    @Override // p149l.v6r0
    public final boolean zzh() {
        return this.f196333d != -1;
    }
}
