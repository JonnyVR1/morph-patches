package p153l;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class y5c implements qkq0 {
    /* JADX INFO: renamed from: b */
    public static d13 m214288b(hr3 hr3Var, int i, int i2) {
        d13 d13Var;
        int iM136740e = hr3Var.m136740e();
        int iM136739d = hr3Var.m136739d();
        int iMax = Math.max(i, iM136740e);
        int iMax2 = Math.max(i2, iM136739d);
        int iMin = Math.min(iMax / iM136740e, iMax2 / iM136739d);
        int i3 = (iMax - (iM136740e * iMin)) / 2;
        int i4 = (iMax2 - (iM136739d * iMin)) / 2;
        if (i2 < iM136739d || i < iM136740e) {
            d13Var = new d13(iM136740e, iM136739d);
            i3 = 0;
            i4 = 0;
        } else {
            d13Var = new d13(i, i2);
        }
        d13Var.clear();
        int i5 = 0;
        while (i5 < iM136739d) {
            int i6 = i3;
            int i7 = 0;
            while (i7 < iM136740e) {
                if (hr3Var.m136737b(i7, i5) == 1) {
                    d13Var.m113489p(i6, i4, iMin, iMin);
                }
                i7++;
                i6 += iMin;
            }
            i5++;
            i4 += iMin;
        }
        return d13Var;
    }

    /* JADX INFO: renamed from: c */
    public static d13 m214289c(ird irdVar, hoh0 hoh0Var, int i, int i2) {
        int iM136428h = hoh0Var.m136428h();
        int iM136427g = hoh0Var.m136427g();
        hr3 hr3Var = new hr3(hoh0Var.m136430j(), hoh0Var.m136429i());
        int i3 = 0;
        for (int i4 = 0; i4 < iM136427g; i4++) {
            if (i4 % hoh0Var.f110913e == 0) {
                int i5 = 0;
                for (int i6 = 0; i6 < hoh0Var.m136430j(); i6++) {
                    hr3Var.m136742g(i5, i3, i6 % 2 == 0);
                    i5++;
                }
                i3++;
            }
            int i7 = 0;
            for (int i8 = 0; i8 < iM136428h; i8++) {
                if (i8 % hoh0Var.f110912d == 0) {
                    hr3Var.m136742g(i7, i3, true);
                    i7++;
                }
                hr3Var.m136742g(i7, i3, irdVar.m141780e(i8, i4));
                int i9 = i7 + 1;
                int i10 = hoh0Var.f110912d;
                if (i8 % i10 == i10 - 1) {
                    hr3Var.m136742g(i9, i3, i4 % 2 == 0);
                    i7 += 2;
                } else {
                    i7 = i9;
                }
            }
            int i11 = i3 + 1;
            int i12 = hoh0Var.f110913e;
            if (i4 % i12 == i12 - 1) {
                int i13 = 0;
                for (int i14 = 0; i14 < hoh0Var.m136430j(); i14++) {
                    hr3Var.m136742g(i13, i11, true);
                    i13++;
                }
                i3 += 2;
            } else {
                i3 = i11;
            }
        }
        return m214288b(hr3Var, i, i2);
    }

    @Override // p153l.qkq0
    /* JADX INFO: renamed from: a */
    public d13 mo17401a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        s2e s2eVar;
        s2e s2eVar2 = null;
        if (str.isEmpty()) {
            wg3.m206174a("Found empty contents");
            return null;
        }
        if (barcodeFormat != BarcodeFormat.DATA_MATRIX) {
            wg3.m206174a("Can only encode DATA_MATRIX, but got ".concat(String.valueOf(barcodeFormat)));
            return null;
        }
        if (i < 0 || i2 < 0) {
            mvb0.m160259a("Requested dimensions can't be negative: ", i, i2);
            return null;
        }
        SymbolShapeHint symbolShapeHint = SymbolShapeHint.FORCE_NONE;
        if (map != null) {
            SymbolShapeHint symbolShapeHint2 = (SymbolShapeHint) map.get(EncodeHintType.DATA_MATRIX_SHAPE);
            if (symbolShapeHint2 != null) {
                symbolShapeHint = symbolShapeHint2;
            }
            s2e s2eVar3 = (s2e) map.get(EncodeHintType.MIN_SIZE);
            if (s2eVar3 == null) {
                s2eVar3 = null;
            }
            s2eVar = (s2e) map.get(EncodeHintType.MAX_SIZE);
            if (s2eVar == null) {
                s2eVar = null;
            }
            s2eVar2 = s2eVar3;
        } else {
            s2eVar = null;
        }
        String strM218594b = z4l.m218594b(str, symbolShapeHint, s2eVar2, s2eVar);
        hoh0 hoh0VarM136420l = hoh0.m136420l(strM218594b.length(), symbolShapeHint, s2eVar2, s2eVar, true);
        ird irdVar = new ird(d3f.m113807c(strM218594b, hoh0VarM136420l), hoh0VarM136420l.m136428h(), hoh0VarM136420l.m136427g());
        irdVar.m141783h();
        return m214289c(irdVar, hoh0VarM136420l, i, i2);
    }
}
