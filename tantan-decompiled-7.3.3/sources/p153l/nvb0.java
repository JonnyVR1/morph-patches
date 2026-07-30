package p153l;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class nvb0 implements qkq0 {
    /* JADX INFO: renamed from: b */
    public static d13 m164868b(ivb0 ivb0Var, int i, int i2, int i3) {
        hr3 hr3VarM142278a = ivb0Var.m142278a();
        if (hr3VarM142278a == null) {
            wpg0.m207458a();
            return null;
        }
        int iM136740e = hr3VarM142278a.m136740e();
        int iM136739d = hr3VarM142278a.m136739d();
        int i4 = i3 << 1;
        int i5 = iM136740e + i4;
        int i6 = i4 + iM136739d;
        int iMax = Math.max(i, i5);
        int iMax2 = Math.max(i2, i6);
        int iMin = Math.min(iMax / i5, iMax2 / i6);
        int i7 = (iMax - (iM136740e * iMin)) / 2;
        int i8 = (iMax2 - (iM136739d * iMin)) / 2;
        d13 d13Var = new d13(iMax, iMax2);
        int i9 = 0;
        while (i9 < iM136739d) {
            int i10 = 0;
            int i11 = i7;
            while (i10 < iM136740e) {
                if (hr3VarM142278a.m136737b(i10, i9) == 1) {
                    d13Var.m113489p(i11, i8, iMin, iMin);
                }
                i10++;
                i11 += iMin;
            }
            i9++;
            i8 += iMin;
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
        if (barcodeFormat != BarcodeFormat.QR_CODE) {
            wg3.m206174a("Can only encode QR_CODE, but got ".concat(String.valueOf(barcodeFormat)));
            return null;
        }
        if (i < 0 || i2 < 0) {
            mvb0.m160259a("Requested dimensions are too small: ", i, i2);
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
        return m164868b(u0f.m193822n(str, errorCorrectionLevelValueOf, map), i, i2, i3);
    }
}
