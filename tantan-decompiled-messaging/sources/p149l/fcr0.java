package p149l;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class fcr0 {

    /* JADX INFO: renamed from: d */
    public static final long[] f96846d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: a */
    public final byte[] f96847a = new byte[8];

    /* JADX INFO: renamed from: b */
    public int f96848b;

    /* JADX INFO: renamed from: c */
    public int f96849c;

    /* JADX INFO: renamed from: b */
    public static int m120457b(int i) {
        int i2 = 0;
        while (i2 < 8) {
            int i3 = i2 + 1;
            if ((f96846d[i2] & ((long) i)) != 0) {
                return i3;
            }
            i2 = i3;
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    public static long m120458c(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= ~f96846d[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    /* JADX INFO: renamed from: a */
    public final int m120459a() {
        return this.f96849c;
    }

    /* JADX INFO: renamed from: d */
    public final long m120460d(k5r0 k5r0Var, boolean z, boolean z2, int i) throws IOException {
        if (this.f96848b == 0) {
            if (!k5r0Var.mo140050b(this.f96847a, 0, 1, z)) {
                return -1L;
            }
            int iM120457b = m120457b(this.f96847a[0] & 255);
            this.f96849c = iM120457b;
            if (iM120457b == -1) {
                qkq0.m175383a("No valid varint length mask found");
                return 0L;
            }
            this.f96848b = 1;
        }
        int i2 = this.f96849c;
        if (i2 > i) {
            this.f96848b = 0;
            return -2L;
        }
        if (i2 != 1) {
            ((z4r0) k5r0Var).mo140050b(this.f96847a, 1, i2 - 1, false);
        }
        this.f96848b = 0;
        return m120458c(this.f96847a, this.f96849c, z2);
    }

    /* JADX INFO: renamed from: e */
    public final void m120461e() {
        this.f96848b = 0;
        this.f96849c = 0;
    }
}
