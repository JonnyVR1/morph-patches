package p149l;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class zw5 implements hce0 {

    /* JADX INFO: renamed from: a */
    public final long f205142a;

    /* JADX INFO: renamed from: b */
    public final long f205143b;

    /* JADX INFO: renamed from: c */
    public final int f205144c;

    /* JADX INFO: renamed from: d */
    public final long f205145d;

    /* JADX INFO: renamed from: e */
    public final int f205146e;

    /* JADX INFO: renamed from: f */
    public final long f205147f;

    /* JADX INFO: renamed from: g */
    public final boolean f205148g;

    public zw5(long j, long j2, int i, int i2, boolean z) {
        this.f205142a = j;
        this.f205143b = j2;
        this.f205144c = i2 == -1 ? 1 : i2;
        this.f205146e = i;
        this.f205148g = z;
        if (j == -1) {
            this.f205145d = -1L;
            this.f205147f = -9223372036854775807L;
        } else {
            this.f205145d = j - j2;
            this.f205147f = m220576f(j, j2, i);
        }
    }

    /* JADX INFO: renamed from: f */
    public static long m220576f(long j, long j2, int i) {
        return (Math.max(0L, j - j2) * 8000000) / ((long) i);
    }

    /* JADX INFO: renamed from: a */
    public final long m220577a(long j) {
        long j2 = (j * ((long) this.f205146e)) / 8000000;
        int i = this.f205144c;
        long jMin = (j2 / ((long) i)) * ((long) i);
        long j3 = this.f205145d;
        if (j3 != -1) {
            jMin = Math.min(jMin, j3 - ((long) i));
        }
        return this.f205143b + Math.max(jMin, 0L);
    }

    /* JADX INFO: renamed from: b */
    public long m220578b(long j) {
        return m220576f(j, this.f205143b, this.f205146e);
    }

    @Override // p149l.hce0
    /* JADX INFO: renamed from: d */
    public hce0.C17274a mo98121d(long j) {
        if (this.f205145d == -1 && !this.f205148g) {
            return new hce0.C17274a(new jce0(0L, this.f205143b));
        }
        long jM220577a = m220577a(j);
        long jM220578b = m220578b(jM220577a);
        jce0 jce0Var = new jce0(jM220578b, jM220577a);
        if (this.f205145d != -1 && jM220578b < j) {
            int i = this.f205144c;
            if (((long) i) + jM220577a < this.f205142a) {
                long j2 = jM220577a + ((long) i);
                return new hce0.C17274a(jce0Var, new jce0(m220578b(j2), j2));
            }
        }
        return new hce0.C17274a(jce0Var);
    }

    @Override // p149l.hce0
    /* JADX INFO: renamed from: e */
    public boolean mo98122e() {
        return this.f205145d != -1 || this.f205148g;
    }

    @Override // p149l.hce0
    /* JADX INFO: renamed from: i */
    public long mo98123i() {
        return this.f205147f;
    }
}
