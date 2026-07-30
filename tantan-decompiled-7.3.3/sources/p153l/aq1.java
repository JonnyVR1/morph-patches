package p153l;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class aq1 implements qkq0 {
    /* JADX INFO: renamed from: b */
    public static d13 m99409b(String str, BarcodeFormat barcodeFormat, int i, int i2, Charset charset, int i3, int i4) {
        if (barcodeFormat == BarcodeFormat.AZTEC) {
            return m99410c(s0f.m183930d(str.getBytes(charset), i3, i4), i, i2);
        }
        wg3.m206174a("Can only encode AZTEC, but got ".concat(String.valueOf(barcodeFormat)));
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static d13 m99410c(xp1 xp1Var, int i, int i2) {
        d13 d13VarM212506a = xp1Var.m212506a();
        if (d13VarM212506a == null) {
            wpg0.m207458a();
            return null;
        }
        int iM113486m = d13VarM212506a.m113486m();
        int iM113483j = d13VarM212506a.m113483j();
        int iMax = Math.max(i, iM113486m);
        int iMax2 = Math.max(i2, iM113483j);
        int iMin = Math.min(iMax / iM113486m, iMax2 / iM113483j);
        int i3 = (iMax - (iM113486m * iMin)) / 2;
        int i4 = (iMax2 - (iM113483j * iMin)) / 2;
        d13 d13Var = new d13(iMax, iMax2);
        int i5 = 0;
        while (i5 < iM113483j) {
            int i6 = 0;
            int i7 = i3;
            while (i6 < iM113486m) {
                if (d13VarM212506a.m113480d(i6, i5)) {
                    d13Var.m113489p(i7, i4, iMin, iMin);
                }
                i6++;
                i7 += iMin;
            }
            i5++;
            i4 += iMin;
        }
        return d13Var;
    }

    @Override // p153l.qkq0
    /* JADX INFO: renamed from: a */
    public d13 mo17401a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
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
        return m99409b(str, barcodeFormat, i, i2, charsetForName, i3, i4);
    }
}
