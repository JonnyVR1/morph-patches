package p149l;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class jnb0 implements lbq0 {
    /* JADX INFO: renamed from: b */
    public static o03 m142371b(enb0 enb0Var, int i, int i2, int i3) {
        hq3 hq3VarM117251a = enb0Var.m117251a();
        if (hq3VarM117251a == null) {
            ohg0.m164364a();
            return null;
        }
        int iM132425e = hq3VarM117251a.m132425e();
        int iM132424d = hq3VarM117251a.m132424d();
        int i4 = i3 << 1;
        int i5 = iM132425e + i4;
        int i6 = i4 + iM132424d;
        int iMax = Math.max(i, i5);
        int iMax2 = Math.max(i2, i6);
        int iMin = Math.min(iMax / i5, iMax2 / i6);
        int i7 = (iMax - (iM132425e * iMin)) / 2;
        int i8 = (iMax2 - (iM132424d * iMin)) / 2;
        o03 o03Var = new o03(iMax, iMax2);
        int i9 = 0;
        while (i9 < iM132424d) {
            int i10 = 0;
            int i11 = i7;
            while (i10 < iM132425e) {
                if (hq3VarM117251a.m132422b(i10, i9) == 1) {
                    o03Var.m162119p(i11, i8, iMin, iMin);
                }
                i10++;
                i11 += iMin;
            }
            i9++;
            i8 += iMin;
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
        if (barcodeFormat != BarcodeFormat.QR_CODE) {
            ig3.m135964a("Can only encode QR_CODE, but got ".concat(String.valueOf(barcodeFormat)));
            return null;
        }
        if (i < 0 || i2 < 0) {
            inb0.m137128a("Requested dimensions are too small: ", i, i2);
            return null;
        }
        ErrorCorrectionLevel errorCorrectionLevelValueOf = ErrorCorrectionLevel.L;
        int i3 = 4;
        if (map != null) {
            EncodeHintType encodeHintType = EncodeHintType.ERROR_CORRECTION;
            if (map.containsKey(encodeHintType)) {
                errorCorrectionLevelValueOf = ErrorCorrectionLevel.valueOf(map.get(encodeHintType).toString());
            }
            EncodeHintType encodeHintType2 = EncodeHintType.MARGIN;
            if (map.containsKey(encodeHintType2)) {
                i3 = Integer.parseInt(map.get(encodeHintType2).toString());
            }
        }
        return m142371b(qze.m177191n(str, errorCorrectionLevelValueOf, map), i, i2, i3);
    }
}
