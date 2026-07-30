package p149l;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes6.dex */
public final class ikw0 {
    /* JADX INFO: renamed from: a */
    public static int m136900a(int i, int i2, RoundingMode roundingMode) {
        roundingMode.getClass();
        int i3 = i / 8;
        int i4 = i - (i3 * 8);
        if (i4 == 0) {
            return i3;
        }
        int i5 = ((i ^ 8) >> 31) | 1;
        switch (hkw0.f108292a[roundingMode.ordinal()]) {
            case 1:
                lkw0.m150390b(false);
                return i3;
            case 2:
                return i3;
            case 3:
                if (i5 >= 0) {
                    return i3;
                }
                break;
            case 4:
                break;
            case 5:
                if (i5 <= 0) {
                    return i3;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i4);
                int iAbs2 = iAbs - (Math.abs(8) - iAbs);
                if (iAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP) {
                        if ((i3 & 1 & (roundingMode != RoundingMode.HALF_EVEN ? 0 : 1)) == 0) {
                            return i3;
                        }
                    }
                } else if (iAbs2 <= 0) {
                    return i3;
                }
            default:
                shg0.m184191a();
                return 0;
        }
        return i3 + i5;
    }
}
