package p153l;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class llr0 {

    /* JADX INFO: renamed from: d */
    public static final long[] f132599d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: a */
    public final byte[] f132600a = new byte[8];

    /* JADX INFO: renamed from: b */
    public int f132601b;

    /* JADX INFO: renamed from: c */
    public int f132602c;

    /* JADX INFO: renamed from: b */
    public static int m154785b(int i) {
        int i2 = 0;
        while (i2 < 8) {
            int i3 = i2 + 1;
            if ((f132599d[i2] & ((long) i)) != 0) {
                return i3;
            }
            i2 = i3;
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    public static long m154786c(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= ~f132599d[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    /* JADX INFO: renamed from: a */
    public final int m154787a() {
        return this.f132602c;
    }

    /* JADX INFO: renamed from: d */
    public final long m154788d(qer0 qer0Var, boolean z, boolean z2, int i) throws IOException {
        if (this.f132601b == 0) {
            if (!qer0Var.mo125312b(this.f132600a, 0, 1, z)) {
                return -1L;
            }
            int iM154785b = m154785b(this.f132600a[0] & 255);
            this.f132602c = iM154785b;
            if (iM154785b == -1) {
                wtq0.m207906a("No valid varint length mask found");
                return 0L;
            }
            this.f132601b = 1;
        }
        int i2 = this.f132602c;
        if (i2 > i) {
            this.f132601b = 0;
            return -2L;
        }
        if (i2 != 1) {
            ((fer0) qer0Var).mo125312b(this.f132600a, 1, i2 - 1, false);
        }
        this.f132601b = 0;
        return m154786c(this.f132600a, this.f132602c, z2);
    }

    /* JADX INFO: renamed from: e */
    public final void m154789e() {
        this.f132601b = 0;
        this.f132602c = 0;
    }
}
