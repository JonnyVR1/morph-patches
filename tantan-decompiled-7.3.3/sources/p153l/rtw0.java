package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class rtw0 {
    /* JADX INFO: renamed from: a */
    public static long m183174a(String str, long j) {
        if (j >= 0) {
            return j;
        }
        throw new IllegalArgumentException(str + " (" + j + ") must be >= 0");
    }

    /* JADX INFO: renamed from: b */
    public static void m183175b(boolean z) {
        if (z) {
            return;
        }
        mym.m160801a("mode was UNNECESSARY, but rounding was necessary");
    }
}
