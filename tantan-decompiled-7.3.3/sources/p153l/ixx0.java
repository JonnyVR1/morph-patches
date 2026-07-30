package p153l;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes6.dex */
public final class ixx0 {

    /* JADX INFO: renamed from: a */
    public final long f117469a;

    /* JADX INFO: renamed from: b */
    public final long f117470b;

    /* JADX INFO: renamed from: c */
    public long f117471c = -9223372036854775807L;

    /* JADX INFO: renamed from: d */
    public long f117472d = -9223372036854775807L;

    /* JADX INFO: renamed from: f */
    public long f117474f = -9223372036854775807L;

    /* JADX INFO: renamed from: g */
    public long f117475g = -9223372036854775807L;

    /* JADX INFO: renamed from: j */
    public float f117478j = 0.97f;

    /* JADX INFO: renamed from: i */
    public float f117477i = 1.03f;

    /* JADX INFO: renamed from: k */
    public float f117479k = 1.0f;

    /* JADX INFO: renamed from: l */
    public long f117480l = -9223372036854775807L;

    /* JADX INFO: renamed from: e */
    public long f117473e = -9223372036854775807L;

    /* JADX INFO: renamed from: h */
    public long f117476h = -9223372036854775807L;

    /* JADX INFO: renamed from: m */
    public long f117481m = -9223372036854775807L;

    /* JADX INFO: renamed from: n */
    public long f117482n = -9223372036854775807L;

    public /* synthetic */ ixx0(float f, float f2, long j, float f3, long j2, long j3, float f4, dxx0 dxx0Var) {
        this.f117469a = j2;
        this.f117470b = j3;
    }

    /* JADX INFO: renamed from: f */
    public static long m142594f(long j, long j2, float f) {
        return (long) ((j * 0.999f) + (j2 * 9.999871E-4f));
    }

    /* JADX INFO: renamed from: a */
    public final float m142595a(long j, long j2) {
        long j3;
        if (this.f117471c == -9223372036854775807L) {
            return 1.0f;
        }
        long j4 = j - j2;
        long j5 = this.f117481m;
        if (j5 == -9223372036854775807L) {
            this.f117481m = j4;
            this.f117482n = 0L;
        } else {
            long jMax = Math.max(j4, m142594f(j5, j4, 0.999f));
            this.f117481m = jMax;
            this.f117482n = m142594f(this.f117482n, Math.abs(j4 - jMax), 0.999f);
        }
        if (this.f117480l != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f117480l < 1000) {
            return this.f117479k;
        }
        this.f117480l = SystemClock.elapsedRealtime();
        long j6 = this.f117481m + (this.f117482n * 3);
        if (this.f117476h > j6) {
            float fM159393F = mpw0.m159393F(1000L);
            long[] jArr = {j6, this.f117473e, this.f117476h - (((long) ((this.f117479k - 1.0f) * fM159393F)) + ((long) ((this.f117477i - 1.0f) * fM159393F)))};
            j3 = jArr[0];
            for (int i = 1; i < 3; i++) {
                long j7 = jArr[i];
                if (j7 > j3) {
                    j3 = j7;
                }
            }
            this.f117476h = j3;
        } else {
            long jMax2 = Math.max(this.f117476h, Math.min(j - ((long) (Math.max(0.0f, this.f117479k - 1.0f) / 1.0E-7f)), j6));
            this.f117476h = jMax2;
            long j8 = this.f117475g;
            if (j8 == -9223372036854775807L || jMax2 <= j8) {
                j3 = jMax2;
            } else {
                this.f117476h = j8;
                j3 = j8;
            }
        }
        long j9 = j - j3;
        if (Math.abs(j9) < this.f117469a) {
            this.f117479k = 1.0f;
            return 1.0f;
        }
        float fMax = Math.max(this.f117478j, Math.min((j9 * 1.0E-7f) + 1.0f, this.f117477i));
        this.f117479k = fMax;
        return fMax;
    }

    /* JADX INFO: renamed from: b */
    public final long m142596b() {
        return this.f117476h;
    }

    /* JADX INFO: renamed from: c */
    public final void m142597c() {
        long j = this.f117476h;
        if (j == -9223372036854775807L) {
            return;
        }
        long j2 = j + this.f117470b;
        this.f117476h = j2;
        long j3 = this.f117475g;
        if (j3 != -9223372036854775807L && j2 > j3) {
            this.f117476h = j3;
        }
        this.f117480l = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: d */
    public final void m142598d(jfs0 jfs0Var) {
        long j = jfs0Var.f120626a;
        this.f117471c = mpw0.m159393F(-9223372036854775807L);
        this.f117474f = mpw0.m159393F(-9223372036854775807L);
        this.f117475g = mpw0.m159393F(-9223372036854775807L);
        this.f117478j = 0.97f;
        this.f117477i = 1.03f;
        m142600g();
    }

    /* JADX INFO: renamed from: e */
    public final void m142599e(long j) {
        this.f117472d = j;
        m142600g();
    }

    /* JADX INFO: renamed from: g */
    public final void m142600g() {
        long j;
        long j2 = this.f117471c;
        if (j2 != -9223372036854775807L) {
            j = this.f117472d;
            if (j == -9223372036854775807L) {
                long j3 = this.f117474f;
                if (j3 != -9223372036854775807L && j2 < j3) {
                    j2 = j3;
                }
                j = this.f117475g;
                if (j == -9223372036854775807L || j2 <= j) {
                    j = j2;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.f117473e == j) {
            return;
        }
        this.f117473e = j;
        this.f117476h = j;
        this.f117481m = -9223372036854775807L;
        this.f117482n = -9223372036854775807L;
        this.f117480l = -9223372036854775807L;
    }
}
