package p149l;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.WriterException;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class vgj0 extends tgj0 {
    @Override // p149l.nh50, p149l.lbq0
    /* JADX INFO: renamed from: a */
    public o03 mo17346a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.UPC_E) {
            return super.mo17346a(str, barcodeFormat, i, i2, map);
        }
        ig3.m135964a("Can only encode UPC_E, but got ".concat(String.valueOf(barcodeFormat)));
        return null;
    }

    @Override // p149l.nh50
    /* JADX INFO: renamed from: c */
    public boolean[] mo17347c(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + sgj0.m184107q(ugj0.m193565r(str));
            } catch (FormatException e) {
                fg3.m121203a(e);
                return null;
            }
        } else {
            if (length != 8) {
                ig3.m135964a("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length)));
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
        int iDigit = Character.digit(str.charAt(0), 10);
        if (iDigit != 0 && iDigit != 1) {
            ig3.m135964a("Number system must be 0 or 1");
            return null;
        }
        int i = ugj0.f176395k[iDigit][Character.digit(str.charAt(7), 10)];
        boolean[] zArr = new boolean[51];
        int iM159381b = nh50.m159381b(zArr, 0, sgj0.f164437d, true);
        for (int i2 = 1; i2 <= 6; i2++) {
            int iDigit2 = Character.digit(str.charAt(i2), 10);
            if (((i >> (6 - i2)) & 1) == 1) {
                iDigit2 += 10;
            }
            iM159381b += nh50.m159381b(zArr, iM159381b, sgj0.f164441h[iDigit2], false);
        }
        nh50.m159381b(zArr, iM159381b, sgj0.f164439f, false);
        return zArr;
    }
}
