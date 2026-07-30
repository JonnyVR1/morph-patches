package p149l;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.WriterException;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class mie extends tgj0 {
    @Override // p149l.nh50, p149l.lbq0
    /* JADX INFO: renamed from: a */
    public o03 mo17346a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.EAN_13) {
            return super.mo17346a(str, barcodeFormat, i, i2, map);
        }
        ig3.m135964a("Can only encode EAN_13, but got ".concat(String.valueOf(barcodeFormat)));
        return null;
    }

    @Override // p149l.nh50
    /* JADX INFO: renamed from: c */
    public boolean[] mo17347c(String str) {
        int length = str.length();
        if (length == 12) {
            try {
                str = str + sgj0.m184107q(str);
            } catch (FormatException e) {
                fg3.m121203a(e);
                return null;
            }
        } else {
            if (length != 13) {
                ig3.m135964a("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf(length)));
                return null;
            }
            try {
                if (!sgj0.m184102h(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                ig3.m135964a("Illegal contents");
                return null;
            }
        }
        int i = lie.f128186j[Character.digit(str.charAt(0), 10)];
        boolean[] zArr = new boolean[95];
        int iM159381b = nh50.m159381b(zArr, 0, sgj0.f164437d, true);
        for (int i2 = 1; i2 <= 6; i2++) {
            int iDigit = Character.digit(str.charAt(i2), 10);
            if (((i >> (6 - i2)) & 1) == 1) {
                iDigit += 10;
            }
            iM159381b += nh50.m159381b(zArr, iM159381b, sgj0.f164441h[iDigit], false);
        }
        int iM159381b2 = iM159381b + nh50.m159381b(zArr, iM159381b, sgj0.f164438e, false);
        for (int i3 = 7; i3 <= 12; i3++) {
            iM159381b2 += nh50.m159381b(zArr, iM159381b2, sgj0.f164440g[Character.digit(str.charAt(i3), 10)], true);
        }
        nh50.m159381b(zArr, iM159381b2, sgj0.f164437d, true);
        return zArr;
    }
}
