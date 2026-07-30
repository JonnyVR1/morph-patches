package p153l;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class p1l0 {

    /* JADX INFO: renamed from: d */
    public static final long[] f150179d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: a */
    public final byte[] f150180a = new byte[8];

    /* JADX INFO: renamed from: b */
    public int f150181b;

    /* JADX INFO: renamed from: c */
    public int f150182c;

    /* JADX INFO: renamed from: a */
    public static long m170212a(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= ~f150179d[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    /* JADX INFO: renamed from: c */
    public static int m170213c(int i) {
        int i2 = 0;
        while (true) {
            long[] jArr = f150179d;
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
    public int m170214b() {
        return this.f150182c;
    }

    /* JADX INFO: renamed from: d */
    public long m170215d(asf asfVar, boolean z, boolean z2, int i) throws IOException {
        if (this.f150181b == 0) {
            if (!asfVar.mo99898b(this.f150180a, 0, 1, z)) {
                return -1L;
            }
            int iM170213c = m170213c(this.f150180a[0] & 255);
            this.f150182c = iM170213c;
            if (iM170213c == -1) {
                wtq0.m207906a("No valid varint length mask found");
                return 0L;
            }
            this.f150181b = 1;
        }
        int i2 = this.f150182c;
        if (i2 > i) {
            this.f150181b = 0;
            return -2L;
        }
        if (i2 != 1) {
            asfVar.readFully(this.f150180a, 1, i2 - 1);
        }
        this.f150181b = 0;
        return m170212a(this.f150180a, this.f150182c, z2);
    }

    /* JADX INFO: renamed from: e */
    public void m170216e() {
        this.f150181b = 0;
        this.f150182c = 0;
    }
}
