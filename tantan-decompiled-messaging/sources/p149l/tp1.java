package p149l;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class tp1 implements lbq0 {
    /* JADX INFO: renamed from: b */
    public static o03 m189942b(String str, BarcodeFormat barcodeFormat, int i, int i2, Charset charset, int i3, int i4) {
        if (barcodeFormat == BarcodeFormat.AZTEC) {
            return m189943c(oze.m166751d(str.getBytes(charset), i3, i4), i, i2);
        }
        ig3.m135964a("Can only encode AZTEC, but got ".concat(String.valueOf(barcodeFormat)));
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static o03 m189943c(qp1 qp1Var, int i, int i2) {
        o03 o03VarM175789a = qp1Var.m175789a();
        if (o03VarM175789a == null) {
            ohg0.m164364a();
            return null;
        }
        int iM162116m = o03VarM175789a.m162116m();
        int iM162113j = o03VarM175789a.m162113j();
        int iMax = Math.max(i, iM162116m);
        int iMax2 = Math.max(i2, iM162113j);
        int iMin = Math.min(iMax / iM162116m, iMax2 / iM162113j);
        int i3 = (iMax - (iM162116m * iMin)) / 2;
        int i4 = (iMax2 - (iM162113j * iMin)) / 2;
        o03 o03Var = new o03(iMax, iMax2);
        int i5 = 0;
        while (i5 < iM162113j) {
            int i6 = 0;
            int i7 = i3;
            while (i6 < iM162116m) {
                if (o03VarM175789a.m162110d(i6, i5)) {
                    o03Var.m162119p(i7, i4, iMin, iMin);
                }
                i6++;
                i7 += iMin;
            }
            i5++;
            i4 += iMin;
        }
        return o03Var;
    }

    @Override // p149l.lbq0
    /* JADX INFO: renamed from: a */
    public o03 mo17346a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        Charset charsetForName = StandardCharsets.ISO_8859_1;
        int i3 = 33;
        int i4 = 0;
        if (map != null) {
            EncodeHintType encodeHintType = EncodeHintType.CHARACTER_SET;
            if (map.containsKey(encodeHintType)) {
                charsetForName = Charset.forName(map.get(encodeHintType).toString());
            }
            EncodeHintType encodeHintType2 = EncodeHintType.ERROR_CORRECTION;
            i3 = map.containsKey(encodeHintType2) ? Integer.parseInt(map.get(encodeHintType2).toString()) : 33;
            EncodeHintType encodeHintType3 = EncodeHintType.AZTEC_LAYERS;
            if (map.containsKey(encodeHintType3)) {
                i4 = Integer.parseInt(map.get(encodeHintType3).toString());
            }
        }
        return m189942b(str, barcodeFormat, i, i2, charsetForName, i3, i4);
    }
}
