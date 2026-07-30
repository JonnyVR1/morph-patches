package p149l;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class c4m extends nh50 {

    /* JADX INFO: renamed from: a */
    public static final int[] f79282a = {1, 1, 1, 1};

    /* JADX INFO: renamed from: b */
    public static final int[] f79283b = {3, 1, 1};

    /* JADX INFO: renamed from: c */
    public static final int[][] f79284c = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    @Override // p149l.nh50, p149l.lbq0
    /* JADX INFO: renamed from: a */
    public o03 mo17346a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.ITF) {
            return super.mo17346a(str, barcodeFormat, i, i2, map);
        }
        ig3.m135964a("Can only encode ITF, but got ".concat(String.valueOf(barcodeFormat)));
        return null;
    }

    @Override // p149l.nh50
    /* JADX INFO: renamed from: c */
    public boolean[] mo17347c(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            ig3.m135964a("The length of the input should be even");
            return null;
        }
        if (length > 80) {
            ig3.m135964a("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
            return null;
        }
        boolean[] zArr = new boolean[(length * 9) + 9];
        int iM159381b = nh50.m159381b(zArr, 0, f79282a, true);
        for (int i = 0; i < length; i += 2) {
            int iDigit = Character.digit(str.charAt(i), 10);
            int iDigit2 = Character.digit(str.charAt(i + 1), 10);
            int[] iArr = new int[10];
            for (int i2 = 0; i2 < 5; i2++) {
                int i3 = i2 * 2;
                int[][] iArr2 = f79284c;
                iArr[i3] = iArr2[iDigit][i2];
                iArr[i3 + 1] = iArr2[iDigit2][i2];
            }
            iM159381b += nh50.m159381b(zArr, iM159381b, iArr, true);
        }
        nh50.m159381b(zArr, iM159381b, f79283b, true);
        return zArr;
    }
}
