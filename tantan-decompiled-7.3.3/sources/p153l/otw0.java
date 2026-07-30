package p153l;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes6.dex */
public final class otw0 {
    /* JADX INFO: renamed from: a */
    public static int m169185a(int i, int i2, RoundingMode roundingMode) {
        roundingMode.getClass();
        int i3 = i / 8;
        int i4 = i - (i3 * 8);
        if (i4 == 0) {
            return i3;
        }
        int i5 = ((i ^ 8) >> 31) | 1;
        switch (ntw0.f143658a[roundingMode.ordinal()]) {
            case 1:
                rtw0.m183175b(false);
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
                aqg0.m99478a();
                return 0;
        }
        return i3 + i5;
    }
}
