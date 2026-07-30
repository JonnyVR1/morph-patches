package p153l;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class ytr0 {

    /* JADX INFO: renamed from: c */
    public boolean f201535c;

    /* JADX INFO: renamed from: d */
    public boolean f201536d;

    /* JADX INFO: renamed from: e */
    public boolean f201537e;

    /* JADX INFO: renamed from: a */
    public final nnw0 f201533a = new nnw0(0);

    /* JADX INFO: renamed from: f */
    public long f201538f = -9223372036854775807L;

    /* JADX INFO: renamed from: g */
    public long f201539g = -9223372036854775807L;

    /* JADX INFO: renamed from: h */
    public long f201540h = -9223372036854775807L;

    /* JADX INFO: renamed from: b */
    public final bgw0 f201534b = new bgw0();

    public ytr0(int i) {
    }

    /* JADX INFO: renamed from: a */
    public final int m217340a(qer0 qer0Var, yfr0 yfr0Var, int i) throws IOException {
        if (i <= 0) {
            m217344e(qer0Var);
            return 0;
        }
        long j = -9223372036854775807L;
        if (this.f201537e) {
            if (this.f201539g == -9223372036854775807L) {
                m217344e(qer0Var);
                return 0;
            }
            if (this.f201536d) {
                long j2 = this.f201538f;
                if (j2 == -9223372036854775807L) {
                    m217344e(qer0Var);
                    return 0;
                }
                nnw0 nnw0Var = this.f201533a;
                this.f201540h = nnw0Var.m164000c(this.f201539g) - nnw0Var.m163999b(j2);
                m217344e(qer0Var);
                return 0;
            }
            int iMin = (int) Math.min(112800L, qer0Var.zzd());
            if (qer0Var.zzf() != 0) {
                yfr0Var.f199649a = 0L;
                return 1;
            }
            this.f201534b.m104266h(iMin);
            qer0Var.zzj();
            ((fer0) qer0Var).mo125313c(this.f201534b.m104271m(), 0, iMin, false);
            bgw0 bgw0Var = this.f201534b;
            int iM104278t = bgw0Var.m104278t();
            for (int iM104277s = bgw0Var.m104277s(); iM104277s < iM104278t; iM104277s++) {
                if (bgw0Var.m104271m()[iM104277s] == 71) {
                    long jM142235b = iur0.m142235b(bgw0Var, iM104277s, i);
                    if (jM142235b != -9223372036854775807L) {
                        j = jM142235b;
                        break;
                    }
                }
            }
            this.f201538f = j;
            this.f201536d = true;
            return 0;
        }
        long jZzd = qer0Var.zzd();
        int iMin2 = (int) Math.min(112800L, jZzd);
        long j3 = jZzd - ((long) iMin2);
        if (qer0Var.zzf() != j3) {
            yfr0Var.f199649a = j3;
            return 1;
        }
        this.f201534b.m104266h(iMin2);
        qer0Var.zzj();
        ((fer0) qer0Var).mo125313c(this.f201534b.m104271m(), 0, iMin2, false);
        bgw0 bgw0Var2 = this.f201534b;
        int iM104277s2 = bgw0Var2.m104277s();
        int iM104278t2 = bgw0Var2.m104278t();
        for (int i2 = iM104278t2 - 188; i2 >= iM104277s2; i2--) {
            byte[] bArrM104271m = bgw0Var2.m104271m();
            int i3 = 0;
            for (int i4 = -4; i4 <= 4; i4++) {
                int i5 = (i4 * 188) + i2;
                if (i5 >= iM104277s2 && i5 < iM104278t2 && bArrM104271m[i5] == 71) {
                    i3++;
                    if (i3 == 5) {
                        long jM142235b2 = iur0.m142235b(bgw0Var2, i2, i);
                        if (jM142235b2 == -9223372036854775807L) {
                            break;
                        }
                        j = jM142235b2;
                        break;
                    }
                } else {
                    i3 = 0;
                }
            }
        }
        this.f201539g = j;
        this.f201537e = true;
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public final long m217341b() {
        return this.f201540h;
    }

    /* JADX INFO: renamed from: c */
    public final nnw0 m217342c() {
        return this.f201533a;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m217343d() {
        return this.f201535c;
    }

    /* JADX INFO: renamed from: e */
    public final int m217344e(qer0 qer0Var) {
        byte[] bArr = mpw0.f137962f;
        int length = bArr.length;
        this.f201534b.m104267i(bArr, 0);
        this.f201535c = true;
        qer0Var.zzj();
        return 0;
    }
}
