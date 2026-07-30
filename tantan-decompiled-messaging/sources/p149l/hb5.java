package p149l;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class hb5 extends nh50 {
    /* JADX INFO: renamed from: f */
    public static int m130321f(boolean[] zArr, int i, int[] iArr) {
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i + 1;
            zArr[i] = iArr[i2] != 0;
            i2++;
            i = i3;
        }
        return 9;
    }

    /* JADX INFO: renamed from: g */
    public static int m130322g(String str, int i) {
        int iIndexOf = 0;
        int i2 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i2;
            i2++;
            if (i2 > i) {
                i2 = 1;
            }
        }
        return iIndexOf % 47;
    }

    /* JADX INFO: renamed from: h */
    private static void m130323h(int i, int[] iArr) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) == 0) {
                i3 = 0;
            }
            iArr[i2] = i3;
        }
    }

    @Override // p149l.nh50, p149l.lbq0
    /* JADX INFO: renamed from: a */
    public o03 mo17346a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.CODE_93) {
            return super.mo17346a(str, barcodeFormat, i, i2, map);
        }
        ig3.m135964a("Can only encode CODE_93, but got ".concat(String.valueOf(barcodeFormat)));
        return null;
    }

    @Override // p149l.nh50
    /* JADX INFO: renamed from: c */
    public boolean[] mo17347c(String str) {
        int length = str.length();
        if (length > 80) {
            ig3.m135964a("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
            return null;
        }
        int[] iArr = new int[9];
        int length2 = ((str.length() + 4) * 9) + 1;
        m130323h(gb5.f101809d[47], iArr);
        boolean[] zArr = new boolean[length2];
        int iM130321f = m130321f(zArr, 0, iArr);
        for (int i = 0; i < length; i++) {
            m130323h(gb5.f101809d["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(i))], iArr);
            iM130321f += m130321f(zArr, iM130321f, iArr);
        }
        int iM130322g = m130322g(str, 20);
        int[] iArr2 = gb5.f101809d;
        m130323h(iArr2[iM130322g], iArr);
        int iM130321f2 = iM130321f + m130321f(zArr, iM130321f, iArr);
        m130323h(iArr2[m130322g(str + "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(iM130322g), 15)], iArr);
        int iM130321f3 = iM130321f2 + m130321f(zArr, iM130321f2, iArr);
        m130323h(iArr2[47], iArr);
        zArr[iM130321f3 + m130321f(zArr, iM130321f3, iArr)] = true;
        return zArr;
    }
}
