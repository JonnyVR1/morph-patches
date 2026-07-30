package p153l;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public abstract class tp50 implements qkq0 {
    /* JADX INFO: renamed from: b */
    public static int m192118b(boolean[] zArr, int i, int[] iArr, boolean z) {
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
    public static d13 m192119e(boolean[] zArr, int i, int i2, int i3) {
        int length = zArr.length;
        int i4 = i3 + length;
        int iMax = Math.max(i, i4);
        int iMax2 = Math.max(1, i2);
        int i5 = iMax / i4;
        int i6 = (iMax - (length * i5)) / 2;
        d13 d13Var = new d13(iMax, iMax2);
        int i7 = 0;
        while (i7 < length) {
            if (zArr[i7]) {
                d13Var.m113489p(i6, 0, i5, iMax2);
            }
            i7++;
            i6 += i5;
        }
        return d13Var;
    }

    @Override // p153l.qkq0
    /* JADX INFO: renamed from: a */
    public d13 mo17401a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (str.isEmpty()) {
            wg3.m206174a("Found empty contents");
            return null;
        }
        if (i < 0 || i2 < 0) {
            mvb0.m160259a("Negative size is not allowed. Input: ", i, i2);
            return null;
        }
        int iMo192120d = mo192120d();
        if (map != null) {
            EncodeHintType encodeHintType = EncodeHintType.MARGIN;
            if (map.containsKey(encodeHintType)) {
                iMo192120d = Integer.parseInt(map.get(encodeHintType).toString());
            }
        }
        return m192119e(mo17402c(str), i, i2, iMo192120d);
    }

    /* JADX INFO: renamed from: c */
    public abstract boolean[] mo17402c(String str);

    /* JADX INFO: renamed from: d */
    public int mo192120d() {
        return 10;
    }
}
