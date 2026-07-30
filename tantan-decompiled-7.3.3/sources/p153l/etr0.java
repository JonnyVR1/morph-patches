package p153l;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class etr0 {

    /* JADX INFO: renamed from: c */
    public boolean f95807c;

    /* JADX INFO: renamed from: d */
    public boolean f95808d;

    /* JADX INFO: renamed from: e */
    public boolean f95809e;

    /* JADX INFO: renamed from: a */
    public final nnw0 f95805a = new nnw0(0);

    /* JADX INFO: renamed from: f */
    public long f95810f = -9223372036854775807L;

    /* JADX INFO: renamed from: g */
    public long f95811g = -9223372036854775807L;

    /* JADX INFO: renamed from: h */
    public long f95812h = -9223372036854775807L;

    /* JADX INFO: renamed from: b */
    public final bgw0 f95806b = new bgw0();

    /* JADX INFO: renamed from: c */
    public static long m122496c(bgw0 bgw0Var) {
        int iM104277s = bgw0Var.m104277s();
        if (bgw0Var.m104275q() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        bgw0Var.m104265g(bArr, 0, 9);
        bgw0Var.m104269k(iM104277s);
        byte b = bArr[0];
        if ((b & 196) != 68) {
            return -9223372036854775807L;
        }
        byte b2 = bArr[2];
        if ((b2 & 4) != 4) {
            return -9223372036854775807L;
        }
        byte b3 = bArr[4];
        if ((b3 & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j = b;
        long j2 = b2;
        long j3 = (248 & j2) >> 3;
        long j4 = (j2 & 3) << 13;
        return j4 | ((bArr[1] & 255) << 20) | ((j & 3) << 28) | (((j & 56) >> 3) << 30) | (j3 << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b3) & 248) >> 3);
    }

    /* JADX INFO: renamed from: g */
    public static final int m122497g(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* JADX INFO: renamed from: a */
    public final int m122498a(qer0 qer0Var, yfr0 yfr0Var) throws IOException {
        long j = -9223372036854775807L;
        if (!this.f95809e) {
            long jZzd = qer0Var.zzd();
            int iMin = (int) Math.min(20000L, jZzd);
            long j2 = jZzd - ((long) iMin);
            if (qer0Var.zzf() != j2) {
                yfr0Var.f199649a = j2;
                return 1;
            }
            this.f95806b.m104266h(iMin);
            qer0Var.zzj();
            ((fer0) qer0Var).mo125313c(this.f95806b.m104271m(), 0, iMin, false);
            bgw0 bgw0Var = this.f95806b;
            int iM104277s = bgw0Var.m104277s();
            for (int iM104278t = bgw0Var.m104278t() - 4; iM104278t >= iM104277s; iM104278t--) {
                if (m122497g(bgw0Var.m104271m(), iM104278t) == 442) {
                    bgw0Var.m104269k(iM104278t + 4);
                    long jM122496c = m122496c(bgw0Var);
                    if (jM122496c != -9223372036854775807L) {
                        j = jM122496c;
                        break;
                    }
                }
            }
            this.f95811g = j;
            this.f95809e = true;
            return 0;
        }
        if (this.f95811g == -9223372036854775807L) {
            m122502f(qer0Var);
            return 0;
        }
        if (this.f95808d) {
            long j3 = this.f95810f;
            if (j3 == -9223372036854775807L) {
                m122502f(qer0Var);
                return 0;
            }
            nnw0 nnw0Var = this.f95805a;
            this.f95812h = nnw0Var.m164000c(this.f95811g) - nnw0Var.m163999b(j3);
            m122502f(qer0Var);
            return 0;
        }
        int iMin2 = (int) Math.min(20000L, qer0Var.zzd());
        if (qer0Var.zzf() != 0) {
            yfr0Var.f199649a = 0L;
            return 1;
        }
        this.f95806b.m104266h(iMin2);
        qer0Var.zzj();
        ((fer0) qer0Var).mo125313c(this.f95806b.m104271m(), 0, iMin2, false);
        bgw0 bgw0Var2 = this.f95806b;
        int iM104278t2 = bgw0Var2.m104278t();
        for (int iM104277s2 = bgw0Var2.m104277s(); iM104277s2 < iM104278t2 - 3; iM104277s2++) {
            if (m122497g(bgw0Var2.m104271m(), iM104277s2) == 442) {
                bgw0Var2.m104269k(iM104277s2 + 4);
                long jM122496c2 = m122496c(bgw0Var2);
                if (jM122496c2 != -9223372036854775807L) {
                    j = jM122496c2;
                    break;
                }
            }
        }
        this.f95810f = j;
        this.f95808d = true;
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public final long m122499b() {
        return this.f95812h;
    }

    /* JADX INFO: renamed from: d */
    public final nnw0 m122500d() {
        return this.f95805a;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m122501e() {
        return this.f95807c;
    }

    /* JADX INFO: renamed from: f */
    public final int m122502f(qer0 qer0Var) {
        byte[] bArr = mpw0.f137962f;
        int length = bArr.length;
        this.f95806b.m104267i(bArr, 0);
        this.f95807c = true;
        qer0Var.zzj();
        return 0;
    }
}
