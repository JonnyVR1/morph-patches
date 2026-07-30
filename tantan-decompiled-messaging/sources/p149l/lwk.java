package p149l;

/* JADX INFO: loaded from: classes7.dex */
public final class lwk {
    /* JADX INFO: renamed from: a */
    public static int m151971a(int i, double d) {
        int iMax = Math.max(i, 2);
        int iHighestOneBit = Integer.highestOneBit(iMax);
        if (iMax <= ((int) (d * ((double) iHighestOneBit)))) {
            return iHighestOneBit;
        }
        int i2 = iHighestOneBit << 1;
        if (i2 > 0) {
            return i2;
        }
        return 1073741824;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m151972b(int i, int i2, double d) {
        return ((double) i) > d * ((double) i2) && i2 < 1073741824;
    }

    /* JADX INFO: renamed from: c */
    public static int m151973c(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }

    /* JADX INFO: renamed from: d */
    public static int m151974d(Object obj) {
        return m151973c(obj == null ? 0 : obj.hashCode());
    }
}
