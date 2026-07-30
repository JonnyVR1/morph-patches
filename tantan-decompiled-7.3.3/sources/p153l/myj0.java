package p153l;

/* JADX INFO: loaded from: classes7.dex */
public final class myj0 {
    /* JADX INFO: renamed from: a */
    public static byte m160797a(long j) {
        xn80.m212103h((j >> 8) == 0, "out of range: %s", j);
        return (byte) j;
    }

    /* JADX INFO: renamed from: b */
    public static int m160798b(byte b, byte b2) {
        return m160799c(b) - m160799c(b2);
    }

    /* JADX INFO: renamed from: c */
    public static int m160799c(byte b) {
        return b & 255;
    }
}
