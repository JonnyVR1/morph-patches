package p149l;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class tex implements ydc0 {

    /* JADX INFO: renamed from: b */
    public static final pxc0[] f169929b = new pxc0[0];

    /* JADX INFO: renamed from: a */
    public final ygd f169930a = new ygd();

    /* JADX INFO: renamed from: b */
    private static o03 m188640b(o03 o03Var) throws NotFoundException {
        int[] iArrM162112f = o03Var.m162112f();
        if (iArrM162112f == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i = iArrM162112f[0];
        int i2 = iArrM162112f[1];
        int i3 = iArrM162112f[2];
        int i4 = iArrM162112f[3];
        o03 o03Var2 = new o03(30, 33);
        for (int i5 = 0; i5 < 33; i5++) {
            int i6 = (((i5 * i4) + (i4 / 2)) / 33) + i2;
            for (int i7 = 0; i7 < 30; i7++) {
                if (o03Var.m162110d(((((i7 * i3) + (i3 / 2)) + (((i5 & 1) * i3) / 2)) / 30) + i, i6)) {
                    o03Var2.m162118o(i7, i5);
                }
            }
        }
        return o03Var2;
    }

    @Override // p149l.ydc0
    /* JADX INFO: renamed from: a */
    public oxc0 mo131886a(nx2 nx2Var, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        if (map == null || !map.containsKey(DecodeHintType.PURE_BARCODE)) {
            throw NotFoundException.getNotFoundInstance();
        }
        ghd ghdVarM214635b = this.f169930a.m214635b(m188640b(nx2Var.m161925a()), map);
        oxc0 oxc0Var = new oxc0(ghdVarM214635b.m126171h(), ghdVarM214635b.m126168e(), f169929b, BarcodeFormat.MAXICODE);
        String strM126165b = ghdVarM214635b.m126165b();
        if (strM126165b != null) {
            oxc0Var.m166534h(ResultMetadataType.ERROR_CORRECTION_LEVEL, strM126165b);
        }
        return oxc0Var;
    }

    @Override // p149l.ydc0
    public void reset() {
    }
}
