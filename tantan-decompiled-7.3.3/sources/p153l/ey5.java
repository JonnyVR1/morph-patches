package p153l;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class ey5 implements mke0 {

    /* JADX INFO: renamed from: a */
    public final long f96394a;

    /* JADX INFO: renamed from: b */
    public final long f96395b;

    /* JADX INFO: renamed from: c */
    public final int f96396c;

    /* JADX INFO: renamed from: d */
    public final long f96397d;

    /* JADX INFO: renamed from: e */
    public final int f96398e;

    /* JADX INFO: renamed from: f */
    public final long f96399f;

    /* JADX INFO: renamed from: g */
    public final boolean f96400g;

    public ey5(long j, long j2, int i, int i2, boolean z) {
        this.f96394a = j;
        this.f96395b = j2;
        this.f96396c = i2 == -1 ? 1 : i2;
        this.f96398e = i;
        this.f96400g = z;
        if (j == -1) {
            this.f96397d = -1L;
            this.f96399f = -9223372036854775807L;
        } else {
            this.f96397d = j - j2;
            this.f96399f = m123170f(j, j2, i);
        }
    }

    /* JADX INFO: renamed from: f */
    public static long m123170f(long j, long j2, int i) {
        return (Math.max(0L, j - j2) * 8000000) / ((long) i);
    }

    /* JADX INFO: renamed from: a */
    public final long m123171a(long j) {
        long j2 = (j * ((long) this.f96398e)) / 8000000;
        int i = this.f96396c;
        long jMin = (j2 / ((long) i)) * ((long) i);
        long j3 = this.f96397d;
        if (j3 != -1) {
            jMin = Math.min(jMin, j3 - ((long) i));
        }
        return this.f96395b + Math.max(jMin, 0L);
    }

    /* JADX INFO: renamed from: b */
    public long m123172b(long j) {
        return m123170f(j, this.f96395b, this.f96398e);
    }

    @Override // p153l.mke0
    /* JADX INFO: renamed from: d */
    public mke0.C18640a mo107791d(long j) {
        if (this.f96397d == -1 && !this.f96400g) {
            return new mke0.C18640a(new oke0(0L, this.f96395b));
        }
        long jM123171a = m123171a(j);
        long jM123172b = m123172b(jM123171a);
        oke0 oke0Var = new oke0(jM123172b, jM123171a);
        if (this.f96397d != -1 && jM123172b < j) {
            int i = this.f96396c;
            if (((long) i) + jM123171a < this.f96394a) {
                long j2 = jM123171a + ((long) i);
                return new mke0.C18640a(oke0Var, new oke0(m123172b(j2), j2));
            }
        }
        return new mke0.C18640a(oke0Var);
    }

    @Override // p153l.mke0
    /* JADX INFO: renamed from: e */
    public boolean mo107792e() {
        return this.f96397d != -1 || this.f96400g;
    }

    @Override // p153l.mke0
    /* JADX INFO: renamed from: i */
    public long mo107793i() {
        return this.f96399f;
    }
}
