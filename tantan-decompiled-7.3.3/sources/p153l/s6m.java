package p153l;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class s6m extends tp50 {

    /* JADX INFO: renamed from: a */
    public static final int[] f166586a = {1, 1, 1, 1};

    /* JADX INFO: renamed from: b */
    public static final int[] f166587b = {3, 1, 1};

    /* JADX INFO: renamed from: c */
    public static final int[][] f166588c = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    @Override // p153l.tp50, p153l.qkq0
    /* JADX INFO: renamed from: a */
    public d13 mo17401a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.ITF) {
            return super.mo17401a(str, barcodeFormat, i, i2, map);
        }
        wg3.m206174a("Can only encode ITF, but got ".concat(String.valueOf(barcodeFormat)));
        return null;
    }

    @Override // p153l.tp50
    /* JADX INFO: renamed from: c */
    public boolean[] mo17402c(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            wg3.m206174a("The length of the input should be even");
            return null;
        }
        if (length > 80) {
            wg3.m206174a("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
            return null;
        }
        boolean[] zArr = new boolean[(length * 9) + 9];
        int iM192118b = tp50.m192118b(zArr, 0, f166586a, true);
        for (int i = 0; i < length; i += 2) {
            int iDigit = Character.digit(str.charAt(i), 10);
            int iDigit2 = Character.digit(str.charAt(i + 1), 10);
            int[] iArr = new int[10];
            for (int i2 = 0; i2 < 5; i2++) {
                int i3 = i2 * 2;
                int[][] iArr2 = f166588c;
                iArr[i3] = iArr2[iDigit][i2];
                iArr[i3 + 1] = iArr2[iDigit2][i2];
            }
            iM192118b += tp50.m192118b(zArr, iM192118b, iArr, true);
        }
        tp50.m192118b(zArr, iM192118b, f166587b, true);
        return zArr;
    }
}
