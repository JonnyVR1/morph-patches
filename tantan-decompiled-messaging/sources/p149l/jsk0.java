package p149l;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class jsk0 {

    /* JADX INFO: renamed from: d */
    public static final long[] f119520d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: a */
    public final byte[] f119521a = new byte[8];

    /* JADX INFO: renamed from: b */
    public int f119522b;

    /* JADX INFO: renamed from: c */
    public int f119523c;

    /* JADX INFO: renamed from: a */
    public static long m143047a(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= ~f119520d[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    /* JADX INFO: renamed from: c */
    public static int m143048c(int i) {
        int i2 = 0;
        while (true) {
            long[] jArr = f119520d;
            if (i2 >= jArr.length) {
                return -1;
            }
            if ((jArr[i2] & ((long) i)) != 0) {
                return i2 + 1;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: b */
    public int m143049b() {
        return this.f119523c;
    }

    /* JADX INFO: renamed from: d */
    public long m143050d(tqf tqfVar, boolean z, boolean z2, int i) throws IOException {
        if (this.f119522b == 0) {
            if (!tqfVar.mo150653c(this.f119521a, 0, 1, z)) {
                return -1L;
            }
            int iM143048c = m143048c(this.f119521a[0] & 255);
            this.f119523c = iM143048c;
            if (iM143048c == -1) {
                qkq0.m175383a("No valid varint length mask found");
                return 0L;
            }
            this.f119522b = 1;
        }
        int i2 = this.f119523c;
        if (i2 > i) {
            this.f119522b = 0;
            return -2L;
        }
        if (i2 != 1) {
            tqfVar.readFully(this.f119521a, 1, i2 - 1);
        }
        this.f119522b = 0;
        return m143047a(this.f119521a, this.f119523c, z2);
    }

    /* JADX INFO: renamed from: e */
    public void m143051e() {
        this.f119522b = 0;
        this.f119523c = 0;
    }
}
