package p153l;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class alr0 {

    /* JADX INFO: renamed from: a */
    public final bgw0 f72150a = new bgw0(8);

    /* JADX INFO: renamed from: b */
    public int f72151b;

    /* JADX INFO: renamed from: a */
    public final boolean m98720a(qer0 qer0Var) throws IOException {
        long jZzd = qer0Var.zzd();
        long j = 1024;
        if (jZzd != -1 && jZzd <= 1024) {
            j = jZzd;
        }
        fer0 fer0Var = (fer0) qer0Var;
        fer0Var.mo125313c(this.f72150a.m104271m(), 0, 4, false);
        long jM104253J = this.f72150a.m104253J();
        this.f72151b = 4;
        while (jM104253J != 440786851) {
            int i = (int) j;
            int i2 = this.f72151b + 1;
            this.f72151b = i2;
            if (i2 == i) {
                return false;
            }
            fer0Var.mo125313c(this.f72150a.m104271m(), 0, 1, false);
            jM104253J = ((jM104253J << 8) & (-256)) | ((long) (this.f72150a.m104271m()[0] & 255));
        }
        long jM98721b = m98721b(qer0Var);
        long j2 = this.f72151b;
        if (jM98721b != Long.MIN_VALUE) {
            long j3 = j2 + jM98721b;
            if (jZzd == -1 || j3 < jZzd) {
                while (true) {
                    long j4 = this.f72151b;
                    if (j4 < j3) {
                        if (m98721b(qer0Var) == Long.MIN_VALUE) {
                            return false;
                        }
                        long jM98721b2 = m98721b(qer0Var);
                        if (jM98721b2 < 0) {
                            return false;
                        }
                        if (jM98721b2 != 0) {
                            int i3 = (int) jM98721b2;
                            fer0Var.m125318j(i3, false);
                            this.f72151b += i3;
                        }
                    } else if (j4 == j3) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final long m98721b(qer0 qer0Var) throws IOException {
        int i;
        fer0 fer0Var = (fer0) qer0Var;
        int i2 = 0;
        fer0Var.mo125313c(this.f72150a.m104271m(), 0, 1, false);
        int i3 = this.f72150a.m104271m()[0] & 255;
        if (i3 == 0) {
            return Long.MIN_VALUE;
        }
        int i4 = 128;
        int i5 = 0;
        while (true) {
            i = i5 + 1;
            if ((i3 & i4) != 0) {
                break;
            }
            i4 >>= 1;
            i5 = i;
        }
        int i6 = i3 & (~i4);
        fer0Var.mo125313c(this.f72150a.m104271m(), 1, i5, false);
        while (i2 < i5) {
            i2++;
            i6 = (this.f72150a.m104271m()[i2] & 255) + (i6 << 8);
        }
        this.f72151b += i;
        return i6;
    }
}
