package p153l;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.WriterException;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class sje extends wpj0 {
    @Override // p153l.tp50, p153l.qkq0
    /* JADX INFO: renamed from: a */
    public d13 mo17401a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.EAN_8) {
            return super.mo17401a(str, barcodeFormat, i, i2, map);
        }
        wg3.m206174a("Can only encode EAN_8, but got ".concat(String.valueOf(barcodeFormat)));
        return null;
    }

    @Override // p153l.tp50
    /* JADX INFO: renamed from: c */
    public boolean[] mo17402c(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + vpj0.m202260q(str);
            } catch (FormatException e) {
                tg3.m191013a(e);
                return null;
            }
        } else {
            if (length != 8) {
                wg3.m206174a("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length)));
                return null;
            }
            try {
                if (!vpj0.m202255h(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                wg3.m206174a("Illegal contents");
                return null;
            }
        }
        boolean[] zArr = new boolean[67];
        int iM192118b = tp50.m192118b(zArr, 0, vpj0.f185259d, true);
        for (int i = 0; i <= 3; i++) {
            iM192118b += tp50.m192118b(zArr, iM192118b, vpj0.f185262g[Character.digit(str.charAt(i), 10)], false);
        }
        int iM192118b2 = iM192118b + tp50.m192118b(zArr, iM192118b, vpj0.f185260e, false);
        for (int i2 = 4; i2 <= 7; i2++) {
            iM192118b2 += tp50.m192118b(zArr, iM192118b2, vpj0.f185262g[Character.digit(str.charAt(i2), 10)], true);
        }
        tp50.m192118b(zArr, iM192118b2, vpj0.f185259d, true);
        return zArr;
    }
}
