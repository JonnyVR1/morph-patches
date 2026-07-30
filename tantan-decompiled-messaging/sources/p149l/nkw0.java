package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class nkw0 {
    /* JADX INFO: renamed from: a */
    public static char m160008a(long j) {
        char c = (char) j;
        nfw0.m159285g(((long) c) == j, "Out of range: %s", j);
        return c;
    }

    /* JADX INFO: renamed from: b */
    public static char m160009b(byte b, byte b2) {
        return (char) ((b << 8) | (b2 & 255));
    }
}
