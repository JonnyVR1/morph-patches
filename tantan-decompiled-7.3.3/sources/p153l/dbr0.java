package p153l;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class dbr0 {

    /* JADX INFO: renamed from: a */
    public long f87697a;

    /* JADX INFO: renamed from: b */
    public long f87698b;

    /* JADX INFO: renamed from: c */
    public long f87699c;

    /* JADX INFO: renamed from: d */
    public long f87700d;

    /* JADX INFO: renamed from: e */
    public long f87701e;

    /* JADX INFO: renamed from: f */
    public long f87702f;

    /* JADX INFO: renamed from: g */
    public final boolean[] f87703g = new boolean[15];

    /* JADX INFO: renamed from: h */
    public int f87704h;

    /* JADX INFO: renamed from: a */
    public final long m115163a() {
        long j = this.f87701e;
        if (j == 0) {
            return 0L;
        }
        return this.f87702f / j;
    }

    /* JADX INFO: renamed from: b */
    public final long m115164b() {
        return this.f87702f;
    }

    /* JADX INFO: renamed from: c */
    public final void m115165c(long j) {
        long j2 = this.f87700d;
        if (j2 == 0) {
            this.f87697a = j;
        } else if (j2 == 1) {
            long j3 = j - this.f87697a;
            this.f87698b = j3;
            this.f87702f = j3;
            this.f87701e = 1L;
        } else {
            long j4 = j - this.f87699c;
            int i = (int) (j2 % 15);
            if (Math.abs(j4 - this.f87698b) <= 1000000) {
                this.f87701e++;
                this.f87702f += j4;
                boolean[] zArr = this.f87703g;
                if (zArr[i]) {
                    zArr[i] = false;
                    this.f87704h--;
                }
            } else {
                boolean[] zArr2 = this.f87703g;
                if (!zArr2[i]) {
                    zArr2[i] = true;
                    this.f87704h++;
                }
            }
        }
        this.f87700d++;
        this.f87699c = j;
    }

    /* JADX INFO: renamed from: d */
    public final void m115166d() {
        this.f87700d = 0L;
        this.f87701e = 0L;
        this.f87702f = 0L;
        this.f87704h = 0;
        Arrays.fill(this.f87703g, false);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m115167e() {
        long j = this.f87700d;
        if (j == 0) {
            return false;
        }
        return this.f87703g[(int) ((j - 1) % 15)];
    }

    /* JADX INFO: renamed from: f */
    public final boolean m115168f() {
        return this.f87700d > 15 && this.f87704h == 0;
    }
}
