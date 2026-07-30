package p149l;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public abstract class nh50 implements lbq0 {
    /* JADX INFO: renamed from: b */
    public static int m159381b(boolean[] zArr, int i, int[] iArr, boolean z) {
        int i2 = 0;
        for (int i3 : iArr) {
            int i4 = 0;
            while (i4 < i3) {
                zArr[i] = z;
                i4++;
                i++;
            }
            i2 += i3;
            z = !z;
        }
        return i2;
    }

    /* JADX INFO: renamed from: e */
    public static o03 m159382e(boolean[] zArr, int i, int i2, int i3) {
        int length = zArr.length;
        int i4 = i3 + length;
        int iMax = Math.max(i, i4);
        int iMax2 = Math.max(1, i2);
        int i5 = iMax / i4;
        int i6 = (iMax - (length * i5)) / 2;
        o03 o03Var = new o03(iMax, iMax2);
        int i7 = 0;
        while (i7 < length) {
            if (zArr[i7]) {
                o03Var.m162119p(i6, 0, i5, iMax2);
            }
            i7++;
            i6 += i5;
        }
        return o03Var;
    }

    @Override // p149l.lbq0
    /* JADX INFO: renamed from: a */
    public o03 mo17346a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (str.isEmpty()) {
            ig3.m135964a("Found empty contents");
            return null;
        }
        if (i < 0 || i2 < 0) {
            inb0.m137128a("Negative size is not allowed. Input: ", i, i2);
            return null;
        }
        int iMo159383d = mo159383d();
        if (map != null) {
            EncodeHintType encodeHintType = EncodeHintType.MARGIN;
            if (map.containsKey(encodeHintType)) {
                iMo159383d = Integer.parseInt(map.get(encodeHintType).toString());
            }
        }
        return m159382e(mo17347c(str), i, i2, iMo159383d);
    }

    /* JADX INFO: renamed from: c */
    public abstract boolean[] mo17347c(String str);

    /* JADX INFO: renamed from: d */
    public int mo159383d() {
        return 10;
    }
}
