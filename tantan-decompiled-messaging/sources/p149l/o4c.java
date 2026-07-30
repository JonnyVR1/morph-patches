package p149l;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.datamatrix.detector.Detector;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class o4c implements ydc0 {

    /* JADX INFO: renamed from: b */
    public static final pxc0[] f141760b = new pxc0[0];

    /* JADX INFO: renamed from: a */
    public final xgd f141761a = new xgd();

    /* JADX INFO: renamed from: b */
    public static o03 m162556b(o03 o03Var) throws NotFoundException {
        int[] iArrM162115l = o03Var.m162115l();
        int[] iArrM162111e = o03Var.m162111e();
        if (iArrM162115l == null || iArrM162111e == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        int iM162557c = m162557c(iArrM162115l, o03Var);
        int i = iArrM162115l[1];
        int i2 = iArrM162111e[1];
        int i3 = iArrM162115l[0];
        int i4 = ((iArrM162111e[0] - i3) + 1) / iM162557c;
        int i5 = ((i2 - i) + 1) / iM162557c;
        if (i4 <= 0 || i5 <= 0) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i6 = iM162557c / 2;
        int i7 = i + i6;
        int i8 = i3 + i6;
        o03 o03Var2 = new o03(i4, i5);
        for (int i9 = 0; i9 < i5; i9++) {
            int i10 = (i9 * iM162557c) + i7;
            for (int i11 = 0; i11 < i4; i11++) {
                if (o03Var.m162110d((i11 * iM162557c) + i8, i10)) {
                    o03Var2.m162118o(i11, i9);
                }
            }
        }
        return o03Var2;
    }

    /* JADX INFO: renamed from: c */
    public static int m162557c(int[] iArr, o03 o03Var) throws NotFoundException {
        int iM162116m = o03Var.m162116m();
        int i = iArr[0];
        int i2 = iArr[1];
        while (i < iM162116m && o03Var.m162110d(i, i2)) {
            i++;
        }
        if (i == iM162116m) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i3 = i - iArr[0];
        if (i3 != 0) {
            return i3;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // p149l.ydc0
    /* JADX INFO: renamed from: a */
    public oxc0 mo131886a(nx2 nx2Var, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        ghd ghdVarM208627b;
        pxc0[] pxc0VarArrM171834b;
        if (map == null || !map.containsKey(DecodeHintType.PURE_BARCODE)) {
            pxd pxdVarM17338c = new Detector(nx2Var.m161925a()).m17338c();
            ghdVarM208627b = this.f141761a.m208627b(pxdVarM17338c.m171833a());
            pxc0VarArrM171834b = pxdVarM17338c.m171834b();
        } else {
            ghdVarM208627b = this.f141761a.m208627b(m162556b(nx2Var.m161925a()));
            pxc0VarArrM171834b = f141760b;
        }
        oxc0 oxc0Var = new oxc0(ghdVarM208627b.m126171h(), ghdVarM208627b.m126168e(), pxc0VarArrM171834b, BarcodeFormat.DATA_MATRIX);
        List<byte[]> listM126164a = ghdVarM208627b.m126164a();
        if (listM126164a != null) {
            oxc0Var.m166534h(ResultMetadataType.BYTE_SEGMENTS, listM126164a);
        }
        String strM126165b = ghdVarM208627b.m126165b();
        if (strM126165b != null) {
            oxc0Var.m166534h(ResultMetadataType.ERROR_CORRECTION_LEVEL, strM126165b);
        }
        return oxc0Var;
    }

    @Override // p149l.ydc0
    public void reset() {
    }
}
