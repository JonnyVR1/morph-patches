package p153l;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class hc5 extends tp50 {
    /* JADX INFO: renamed from: f */
    public static int m134445f(boolean[] zArr, int i, int[] iArr) {
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
    public static int m134446g(String str, int i) {
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
    private static void m134447h(int i, int[] iArr) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) == 0) {
                i3 = 0;
            }
            iArr[i2] = i3;
        }
    }

    @Override // p153l.tp50, p153l.qkq0
    /* JADX INFO: renamed from: a */
    public d13 mo17401a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.CODE_93) {
            return super.mo17401a(str, barcodeFormat, i, i2, map);
        }
        wg3.m206174a("Can only encode CODE_93, but got ".concat(String.valueOf(barcodeFormat)));
        return null;
    }

    @Override // p153l.tp50
    /* JADX INFO: renamed from: c */
    public boolean[] mo17402c(String str) {
        int length = str.length();
        if (length > 80) {
            wg3.m206174a("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
            return null;
        }
        int[] iArr = new int[9];
        int length2 = ((str.length() + 4) * 9) + 1;
        m134447h(gc5.f103524d[47], iArr);
        boolean[] zArr = new boolean[length2];
        int iM134445f = m134445f(zArr, 0, iArr);
        for (int i = 0; i < length; i++) {
            m134447h(gc5.f103524d["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(i))], iArr);
            iM134445f += m134445f(zArr, iM134445f, iArr);
        }
        int iM134446g = m134446g(str, 20);
        int[] iArr2 = gc5.f103524d;
        m134447h(iArr2[iM134446g], iArr);
        int iM134445f2 = iM134445f + m134445f(zArr, iM134445f, iArr);
        m134447h(iArr2[m134446g(str + "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(iM134446g), 15)], iArr);
        int iM134445f3 = iM134445f2 + m134445f(zArr, iM134445f2, iArr);
        m134447h(iArr2[47], iArr);
        zArr[iM134445f3 + m134445f(zArr, iM134445f3, iArr)] = true;
        return zArr;
    }
}
