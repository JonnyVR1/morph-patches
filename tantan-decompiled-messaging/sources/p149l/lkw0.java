package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class lkw0 {
    /* JADX INFO: renamed from: a */
    public static long m150389a(String str, long j) {
        if (j >= 0) {
            return j;
        }
        throw new IllegalArgumentException(str + " (" + j + ") must be >= 0");
    }

    /* JADX INFO: renamed from: b */
    public static void m150390b(boolean z) {
        if (z) {
            return;
        }
        lwm.m151979a("mode was UNNECESSARY, but rounding was necessary");
    }
}
