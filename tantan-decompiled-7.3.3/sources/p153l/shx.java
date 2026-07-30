package p153l;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class shx implements fmc0 {

    /* JADX INFO: renamed from: b */
    public static final s5d0[] f168768b = new s5d0[0];

    /* JADX INFO: renamed from: a */
    public final eid f168769a = new eid();

    /* JADX INFO: renamed from: b */
    private static d13 m185944b(d13 d13Var) throws NotFoundException {
        int[] iArrM113482f = d13Var.m113482f();
        if (iArrM113482f == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i = iArrM113482f[0];
        int i2 = iArrM113482f[1];
        int i3 = iArrM113482f[2];
        int i4 = iArrM113482f[3];
        d13 d13Var2 = new d13(30, 33);
        for (int i5 = 0; i5 < 33; i5++) {
            int i6 = (((i5 * i4) + (i4 / 2)) / 33) + i2;
            for (int i7 = 0; i7 < 30; i7++) {
                if (d13Var.m113480d(((((i7 * i3) + (i3 / 2)) + (((i5 & 1) * i3) / 2)) / 30) + i, i6)) {
                    d13Var2.m113488o(i7, i5);
                }
            }
        }
        return d13Var2;
    }

    @Override // p153l.fmc0
    /* JADX INFO: renamed from: a */
    public r5d0 mo96539a(cy2 cy2Var, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        if (map == null || !map.containsKey(DecodeHintType.PURE_BARCODE)) {
            throw NotFoundException.getNotFoundInstance();
        }
        mid midVarM120889b = this.f168769a.m120889b(m185944b(cy2Var.m113086a()), map);
        r5d0 r5d0Var = new r5d0(midVarM120889b.m158494h(), midVarM120889b.m158491e(), f168768b, BarcodeFormat.MAXICODE);
        String strM158488b = midVarM120889b.m158488b();
        if (strM158488b != null) {
            r5d0Var.m179859h(ResultMetadataType.ERROR_CORRECTION_LEVEL, strM158488b);
        }
        return r5d0Var;
    }

    @Override // p153l.fmc0
    public void reset() {
    }
}
