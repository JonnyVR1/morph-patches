package p153l;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.WriterException;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class qje extends wpj0 {
    @Override // p153l.tp50, p153l.qkq0
    /* JADX INFO: renamed from: a */
    public d13 mo17401a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.EAN_13) {
            return super.mo17401a(str, barcodeFormat, i, i2, map);
        }
        wg3.m206174a("Can only encode EAN_13, but got ".concat(String.valueOf(barcodeFormat)));
        return null;
    }

    @Override // p153l.tp50
    /* JADX INFO: renamed from: c */
    public boolean[] mo17402c(String str) {
        int length = str.length();
        if (length == 12) {
            try {
                str = str + vpj0.m202260q(str);
            } catch (FormatException e) {
                tg3.m191013a(e);
                return null;
            }
        } else {
            if (length != 13) {
                wg3.m206174a("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf(length)));
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
        int i = pje.f152687j[Character.digit(str.charAt(0), 10)];
        boolean[] zArr = new boolean[95];
        int iM192118b = tp50.m192118b(zArr, 0, vpj0.f185259d, true);
        for (int i2 = 1; i2 <= 6; i2++) {
            int iDigit = Character.digit(str.charAt(i2), 10);
            if (((i >> (6 - i2)) & 1) == 1) {
                iDigit += 10;
            }
            iM192118b += tp50.m192118b(zArr, iM192118b, vpj0.f185263h[iDigit], false);
        }
        int iM192118b2 = iM192118b + tp50.m192118b(zArr, iM192118b, vpj0.f185260e, false);
        for (int i3 = 7; i3 <= 12; i3++) {
            iM192118b2 += tp50.m192118b(zArr, iM192118b2, vpj0.f185262g[Character.digit(str.charAt(i3), 10)], true);
        }
        tp50.m192118b(zArr, iM192118b2, vpj0.f185259d, true);
        return zArr;
    }
}
