package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class ttw0 {
    /* JADX INFO: renamed from: a */
    public static char m192696a(long j) {
        char c = (char) j;
        tow0.m192092g(((long) c) == j, "Out of range: %s", j);
        return c;
    }

    /* JADX INFO: renamed from: b */
    public static char m192697b(byte b, byte b2) {
        return (char) ((b << 8) | (b2 & 255));
    }
}
