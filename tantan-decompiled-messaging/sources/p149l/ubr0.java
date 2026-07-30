package p149l;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class ubr0 {

    /* JADX INFO: renamed from: a */
    public final v6w0 f175748a = new v6w0(8);

    /* JADX INFO: renamed from: b */
    public int f175749b;

    /* JADX INFO: renamed from: a */
    public final boolean m192933a(k5r0 k5r0Var) throws IOException {
        long jZzd = k5r0Var.zzd();
        long j = 1024;
        if (jZzd != -1 && jZzd <= 1024) {
            j = jZzd;
        }
        z4r0 z4r0Var = (z4r0) k5r0Var;
        z4r0Var.mo140051c(this.f175748a.m197264m(), 0, 4, false);
        long jM197246J = this.f175748a.m197246J();
        this.f175749b = 4;
        while (jM197246J != 440786851) {
            int i = (int) j;
            int i2 = this.f175749b + 1;
            this.f175749b = i2;
            if (i2 == i) {
                return false;
            }
            z4r0Var.mo140051c(this.f175748a.m197264m(), 0, 1, false);
            jM197246J = ((jM197246J << 8) & (-256)) | ((long) (this.f175748a.m197264m()[0] & 255));
        }
        long jM192934b = m192934b(k5r0Var);
        long j2 = this.f175749b;
        if (jM192934b != Long.MIN_VALUE) {
            long j3 = j2 + jM192934b;
            if (jZzd == -1 || j3 < jZzd) {
                while (true) {
                    long j4 = this.f175749b;
                    if (j4 < j3) {
                        if (m192934b(k5r0Var) == Long.MIN_VALUE) {
                            return false;
                        }
                        long jM192934b2 = m192934b(k5r0Var);
                        if (jM192934b2 < 0) {
                            return false;
                        }
                        if (jM192934b2 != 0) {
                            int i3 = (int) jM192934b2;
                            z4r0Var.m217118j(i3, false);
                            this.f175749b += i3;
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
    public final long m192934b(k5r0 k5r0Var) throws IOException {
        int i;
        z4r0 z4r0Var = (z4r0) k5r0Var;
        int i2 = 0;
        z4r0Var.mo140051c(this.f175748a.m197264m(), 0, 1, false);
        int i3 = this.f175748a.m197264m()[0] & 255;
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
        z4r0Var.mo140051c(this.f175748a.m197264m(), 1, i5, false);
        while (i2 < i5) {
            i2++;
            i6 = (this.f175748a.m197264m()[i2] & 255) + (i6 << 8);
        }
        this.f175749b += i;
        return i6;
    }
}
