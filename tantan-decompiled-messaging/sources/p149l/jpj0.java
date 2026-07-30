package p149l;

/* JADX INFO: loaded from: classes7.dex */
public final class jpj0 {
    /* JADX INFO: renamed from: a */
    public static byte m142744a(long j) {
        sf80.m183886h((j >> 8) == 0, "out of range: %s", j);
        return (byte) j;
    }

    /* JADX INFO: renamed from: b */
    public static int m142745b(byte b, byte b2) {
        return m142746c(b) - m142746c(b2);
    }

    /* JADX INFO: renamed from: c */
    public static int m142746c(byte b) {
        return b & 255;
    }
}
