package p149l;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.WriterException;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class oie extends tgj0 {
    @Override // p149l.nh50, p149l.lbq0
    /* JADX INFO: renamed from: a */
    public o03 mo17346a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.EAN_8) {
            return super.mo17346a(str, barcodeFormat, i, i2, map);
        }
        ig3.m135964a("Can only encode EAN_8, but got ".concat(String.valueOf(barcodeFormat)));
        return null;
    }

    @Override // p149l.nh50
    /* JADX INFO: renamed from: c */
    public boolean[] mo17347c(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + sgj0.m184107q(str);
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
        boolean[] zArr = new boolean[67];
        int iM159381b = nh50.m159381b(zArr, 0, sgj0.f164437d, true);
        for (int i = 0; i <= 3; i++) {
            iM159381b += nh50.m159381b(zArr, iM159381b, sgj0.f164440g[Character.digit(str.charAt(i), 10)], false);
        }
        int iM159381b2 = iM159381b + nh50.m159381b(zArr, iM159381b, sgj0.f164438e, false);
        for (int i2 = 4; i2 <= 7; i2++) {
            iM159381b2 += nh50.m159381b(zArr, iM159381b2, sgj0.f164440g[Character.digit(str.charAt(i2), 10)], true);
        }
        nh50.m159381b(zArr, iM159381b2, sgj0.f164437d, true);
        return zArr;
    }
}
