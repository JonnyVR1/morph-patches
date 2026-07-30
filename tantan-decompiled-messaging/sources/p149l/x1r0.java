package p149l;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class x1r0 {

    /* JADX INFO: renamed from: a */
    public long f189091a;

    /* JADX INFO: renamed from: b */
    public long f189092b;

    /* JADX INFO: renamed from: c */
    public long f189093c;

    /* JADX INFO: renamed from: d */
    public long f189094d;

    /* JADX INFO: renamed from: e */
    public long f189095e;

    /* JADX INFO: renamed from: f */
    public long f189096f;

    /* JADX INFO: renamed from: g */
    public final boolean[] f189097g = new boolean[15];

    /* JADX INFO: renamed from: h */
    public int f189098h;

    /* JADX INFO: renamed from: a */
    public final long m206757a() {
        long j = this.f189095e;
        if (j == 0) {
            return 0L;
        }
        return this.f189096f / j;
    }

    /* JADX INFO: renamed from: b */
    public final long m206758b() {
        return this.f189096f;
    }

    /* JADX INFO: renamed from: c */
    public final void m206759c(long j) {
        long j2 = this.f189094d;
        if (j2 == 0) {
            this.f189091a = j;
        } else if (j2 == 1) {
            long j3 = j - this.f189091a;
            this.f189092b = j3;
            this.f189096f = j3;
            this.f189095e = 1L;
        } else {
            long j4 = j - this.f189093c;
            int i = (int) (j2 % 15);
            if (Math.abs(j4 - this.f189092b) <= 1000000) {
                this.f189095e++;
                this.f189096f += j4;
                boolean[] zArr = this.f189097g;
                if (zArr[i]) {
                    zArr[i] = false;
                    this.f189098h--;
                }
            } else {
                boolean[] zArr2 = this.f189097g;
                if (!zArr2[i]) {
                    zArr2[i] = true;
                    this.f189098h++;
                }
            }
        }
        this.f189094d++;
        this.f189093c = j;
    }

    /* JADX INFO: renamed from: d */
    public final void m206760d() {
        this.f189094d = 0L;
        this.f189095e = 0L;
        this.f189096f = 0L;
        this.f189098h = 0;
        Arrays.fill(this.f189097g, false);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m206761e() {
        long j = this.f189094d;
        if (j == 0) {
            return false;
        }
        return this.f189097g[(int) ((j - 1) % 15)];
    }

    /* JADX INFO: renamed from: f */
    public final boolean m206762f() {
        return this.f189094d > 15 && this.f189098h == 0;
    }
}
