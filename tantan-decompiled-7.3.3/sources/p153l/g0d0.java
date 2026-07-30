package p153l;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class g0d0 {
    /* JADX INFO: renamed from: a */
    public static int m128417a(int i, int i2) {
        for (int i3 = 1; i3 <= 2; i3++) {
            int i4 = (i + i3) % 3;
            if (m128418b(i4, i2)) {
                return i4;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m128418b(int i, int i2) {
        if (i == 0) {
            return true;
        }
        if (i != 1) {
            return i == 2 && (i2 & 2) != 0;
        }
        return (i2 & 1) != 0;
    }
}
