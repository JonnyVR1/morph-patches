package p149l;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class q4c implements lbq0 {
    /* JADX INFO: renamed from: b */
    public static o03 m172929b(hq3 hq3Var, int i, int i2) {
        o03 o03Var;
        int iM132425e = hq3Var.m132425e();
        int iM132424d = hq3Var.m132424d();
        int iMax = Math.max(i, iM132425e);
        int iMax2 = Math.max(i2, iM132424d);
        int iMin = Math.min(iMax / iM132425e, iMax2 / iM132424d);
        int i3 = (iMax - (iM132425e * iMin)) / 2;
        int i4 = (iMax2 - (iM132424d * iMin)) / 2;
        if (i2 < iM132424d || i < iM132425e) {
            o03Var = new o03(iM132425e, iM132424d);
            i3 = 0;
            i4 = 0;
        } else {
            o03Var = new o03(i, i2);
        }
        o03Var.clear();
        int i5 = 0;
        while (i5 < iM132424d) {
            int i6 = i3;
            int i7 = 0;
            while (i7 < iM132425e) {
                if (hq3Var.m132422b(i7, i5) == 1) {
                    o03Var.m162119p(i6, i4, iMin, iMin);
                }
                i7++;
                i6 += iMin;
            }
            i5++;
            i4 += iMin;
        }
        return o03Var;
    }

    /* JADX INFO: renamed from: c */
    public static o03 m172930c(rpd rpdVar, zfh0 zfh0Var, int i, int i2) {
        int iM218478h = zfh0Var.m218478h();
        int iM218477g = zfh0Var.m218477g();
        hq3 hq3Var = new hq3(zfh0Var.m218480j(), zfh0Var.m218479i());
        int i3 = 0;
        for (int i4 = 0; i4 < iM218477g; i4++) {
            if (i4 % zfh0Var.f202948e == 0) {
                int i5 = 0;
                for (int i6 = 0; i6 < zfh0Var.m218480j(); i6++) {
                    hq3Var.m132427g(i5, i3, i6 % 2 == 0);
                    i5++;
                }
                i3++;
            }
            int i7 = 0;
            for (int i8 = 0; i8 < iM218478h; i8++) {
                if (i8 % zfh0Var.f202947d == 0) {
                    hq3Var.m132427g(i7, i3, true);
                    i7++;
                }
                hq3Var.m132427g(i7, i3, rpdVar.m180320e(i8, i4));
                int i9 = i7 + 1;
                int i10 = zfh0Var.f202947d;
                if (i8 % i10 == i10 - 1) {
                    hq3Var.m132427g(i9, i3, i4 % 2 == 0);
                    i7 += 2;
                } else {
                    i7 = i9;
                }
            }
            int i11 = i3 + 1;
            int i12 = zfh0Var.f202948e;
            if (i4 % i12 == i12 - 1) {
                int i13 = 0;
                for (int i14 = 0; i14 < zfh0Var.m218480j(); i14++) {
                    hq3Var.m132427g(i13, i11, true);
                    i13++;
                }
                i3 += 2;
            } else {
                i3 = i11;
            }
        }
        return m172929b(hq3Var, i, i2);
    }

    @Override // p149l.lbq0
    /* JADX INFO: renamed from: a */
    public o03 mo17346a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        e1e e1eVar;
        e1e e1eVar2 = null;
        if (str.isEmpty()) {
            ig3.m135964a("Found empty contents");
            return null;
        }
        if (barcodeFormat != BarcodeFormat.DATA_MATRIX) {
            ig3.m135964a("Can only encode DATA_MATRIX, but got ".concat(String.valueOf(barcodeFormat)));
            return null;
        }
        if (i < 0 || i2 < 0) {
            inb0.m137128a("Requested dimensions can't be negative: ", i, i2);
            return null;
        }
        SymbolShapeHint symbolShapeHint = SymbolShapeHint.FORCE_NONE;
        if (map != null) {
            SymbolShapeHint symbolShapeHint2 = (SymbolShapeHint) map.get(EncodeHintType.DATA_MATRIX_SHAPE);
            if (symbolShapeHint2 != null) {
                symbolShapeHint = symbolShapeHint2;
            }
            e1e e1eVar3 = (e1e) map.get(EncodeHintType.MIN_SIZE);
            if (e1eVar3 == null) {
                e1eVar3 = null;
            }
            e1eVar = (e1e) map.get(EncodeHintType.MAX_SIZE);
            if (e1eVar == null) {
                e1eVar = null;
            }
            e1eVar2 = e1eVar3;
        } else {
            e1eVar = null;
        }
        String strM139466b = j2l.m139466b(str, symbolShapeHint, e1eVar2, e1eVar);
        zfh0 zfh0VarM218472l = zfh0.m218472l(strM139466b.length(), symbolShapeHint, e1eVar2, e1eVar, true);
        rpd rpdVar = new rpd(y1f.m212194c(strM139466b, zfh0VarM218472l), zfh0VarM218472l.m218478h(), zfh0VarM218472l.m218477g());
        rpdVar.m180323h();
        return m172930c(rpdVar, zfh0VarM218472l, i, i2);
    }
}
