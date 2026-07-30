package p153l;

/* JADX INFO: loaded from: classes6.dex */
public class eer0 implements bgr0 {

    /* JADX INFO: renamed from: a */
    public final long f93661a;

    /* JADX INFO: renamed from: b */
    public final long f93662b;

    /* JADX INFO: renamed from: c */
    public final int f93663c;

    /* JADX INFO: renamed from: d */
    public final long f93664d;

    /* JADX INFO: renamed from: e */
    public final int f93665e;

    /* JADX INFO: renamed from: f */
    public final long f93666f;

    public eer0(long j, long j2, int i, int i2, boolean z) {
        long jM120561d;
        this.f93661a = j;
        this.f93662b = j2;
        this.f93663c = i2 == -1 ? 1 : i2;
        this.f93665e = i;
        if (j == -1) {
            this.f93664d = -1L;
            jM120561d = -9223372036854775807L;
        } else {
            this.f93664d = j - j2;
            jM120561d = m120561d(j, j2, i);
        }
        this.f93666f = jM120561d;
    }

    /* JADX INFO: renamed from: d */
    public static long m120561d(long j, long j2, int i) {
        return (Math.max(0L, j - j2) * 8000000) / ((long) i);
    }

    @Override // p153l.bgr0
    /* JADX INFO: renamed from: a */
    public final zfr0 mo97719a(long j) {
        long j2 = this.f93664d;
        if (j2 == -1) {
            cgr0 cgr0Var = new cgr0(0L, this.f93662b);
            return new zfr0(cgr0Var, cgr0Var);
        }
        long j3 = ((long) this.f93665e) * j;
        long j4 = this.f93663c;
        long jMin = ((j3 / 8000000) / j4) * j4;
        if (j2 != -1) {
            jMin = Math.min(jMin, j2 - j4);
        }
        long jMax = this.f93662b + Math.max(jMin, 0L);
        long jM120562c = m120562c(jMax);
        cgr0 cgr0Var2 = new cgr0(jM120562c, jMax);
        if (this.f93664d != -1 && jM120562c < j) {
            long j5 = jMax + ((long) this.f93663c);
            if (j5 < this.f93661a) {
                return new zfr0(cgr0Var2, new cgr0(m120562c(j5), j5));
            }
        }
        return new zfr0(cgr0Var2, cgr0Var2);
    }

    /* JADX INFO: renamed from: c */
    public final long m120562c(long j) {
        return m120561d(j, this.f93662b, this.f93665e);
    }

    @Override // p153l.bgr0
    public final long zza() {
        return this.f93666f;
    }

    @Override // p153l.bgr0
    public final boolean zzh() {
        return this.f93664d != -1;
    }
}
