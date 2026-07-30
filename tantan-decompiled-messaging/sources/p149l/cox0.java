package p149l;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes6.dex */
public final class cox0 {

    /* JADX INFO: renamed from: a */
    public final long f81875a;

    /* JADX INFO: renamed from: b */
    public final long f81876b;

    /* JADX INFO: renamed from: c */
    public long f81877c = -9223372036854775807L;

    /* JADX INFO: renamed from: d */
    public long f81878d = -9223372036854775807L;

    /* JADX INFO: renamed from: f */
    public long f81880f = -9223372036854775807L;

    /* JADX INFO: renamed from: g */
    public long f81881g = -9223372036854775807L;

    /* JADX INFO: renamed from: j */
    public float f81884j = 0.97f;

    /* JADX INFO: renamed from: i */
    public float f81883i = 1.03f;

    /* JADX INFO: renamed from: k */
    public float f81885k = 1.0f;

    /* JADX INFO: renamed from: l */
    public long f81886l = -9223372036854775807L;

    /* JADX INFO: renamed from: e */
    public long f81879e = -9223372036854775807L;

    /* JADX INFO: renamed from: h */
    public long f81882h = -9223372036854775807L;

    /* JADX INFO: renamed from: m */
    public long f81887m = -9223372036854775807L;

    /* JADX INFO: renamed from: n */
    public long f81888n = -9223372036854775807L;

    public /* synthetic */ cox0(float f, float f2, long j, float f3, long j2, long j3, float f4, xnx0 xnx0Var) {
        this.f81875a = j2;
        this.f81876b = j3;
    }

    /* JADX INFO: renamed from: f */
    public static long m108040f(long j, long j2, float f) {
        return (long) ((j * 0.999f) + (j2 * 9.999871E-4f));
    }

    /* JADX INFO: renamed from: a */
    public final float m108041a(long j, long j2) {
        long j3;
        if (this.f81877c == -9223372036854775807L) {
            return 1.0f;
        }
        long j4 = j - j2;
        long j5 = this.f81887m;
        if (j5 == -9223372036854775807L) {
            this.f81887m = j4;
            this.f81888n = 0L;
        } else {
            long jMax = Math.max(j4, m108040f(j5, j4, 0.999f));
            this.f81887m = jMax;
            this.f81888n = m108040f(this.f81888n, Math.abs(j4 - jMax), 0.999f);
        }
        if (this.f81886l != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f81886l < 1000) {
            return this.f81885k;
        }
        this.f81886l = SystemClock.elapsedRealtime();
        long j6 = this.f81887m + (this.f81888n * 3);
        if (this.f81882h > j6) {
            float fM126049F = ggw0.m126049F(1000L);
            long[] jArr = {j6, this.f81879e, this.f81882h - (((long) ((this.f81885k - 1.0f) * fM126049F)) + ((long) ((this.f81883i - 1.0f) * fM126049F)))};
            j3 = jArr[0];
            for (int i = 1; i < 3; i++) {
                long j7 = jArr[i];
                if (j7 > j3) {
                    j3 = j7;
                }
            }
            this.f81882h = j3;
        } else {
            long jMax2 = Math.max(this.f81882h, Math.min(j - ((long) (Math.max(0.0f, this.f81885k - 1.0f) / 1.0E-7f)), j6));
            this.f81882h = jMax2;
            long j8 = this.f81881g;
            if (j8 == -9223372036854775807L || jMax2 <= j8) {
                j3 = jMax2;
            } else {
                this.f81882h = j8;
                j3 = j8;
            }
        }
        long j9 = j - j3;
        if (Math.abs(j9) < this.f81875a) {
            this.f81885k = 1.0f;
            return 1.0f;
        }
        float fMax = Math.max(this.f81884j, Math.min((j9 * 1.0E-7f) + 1.0f, this.f81883i));
        this.f81885k = fMax;
        return fMax;
    }

    /* JADX INFO: renamed from: b */
    public final long m108042b() {
        return this.f81882h;
    }

    /* JADX INFO: renamed from: c */
    public final void m108043c() {
        long j = this.f81882h;
        if (j == -9223372036854775807L) {
            return;
        }
        long j2 = j + this.f81876b;
        this.f81882h = j2;
        long j3 = this.f81881g;
        if (j3 != -9223372036854775807L && j2 > j3) {
            this.f81882h = j3;
        }
        this.f81886l = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: d */
    public final void m108044d(d6s0 d6s0Var) {
        long j = d6s0Var.f84657a;
        this.f81877c = ggw0.m126049F(-9223372036854775807L);
        this.f81880f = ggw0.m126049F(-9223372036854775807L);
        this.f81881g = ggw0.m126049F(-9223372036854775807L);
        this.f81884j = 0.97f;
        this.f81883i = 1.03f;
        m108046g();
    }

    /* JADX INFO: renamed from: e */
    public final void m108045e(long j) {
        this.f81878d = j;
        m108046g();
    }

    /* JADX INFO: renamed from: g */
    public final void m108046g() {
        long j;
        long j2 = this.f81877c;
        if (j2 != -9223372036854775807L) {
            j = this.f81878d;
            if (j == -9223372036854775807L) {
                long j3 = this.f81880f;
                if (j3 != -9223372036854775807L && j2 < j3) {
                    j2 = j3;
                }
                j = this.f81881g;
                if (j == -9223372036854775807L || j2 <= j) {
                    j = j2;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.f81879e == j) {
            return;
        }
        this.f81879e = j;
        this.f81882h = j;
        this.f81887m = -9223372036854775807L;
        this.f81888n = -9223372036854775807L;
        this.f81886l = -9223372036854775807L;
    }
}
