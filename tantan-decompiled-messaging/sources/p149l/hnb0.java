package p149l;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class hnb0 implements ydc0 {

    /* JADX INFO: renamed from: b */
    public static final pxc0[] f108595b = new pxc0[0];

    /* JADX INFO: renamed from: a */
    public final zgd f108596a = new zgd();

    /* JADX INFO: renamed from: b */
    private static o03 m131884b(o03 o03Var) throws NotFoundException {
        int[] iArrM162115l = o03Var.m162115l();
        int[] iArrM162111e = o03Var.m162111e();
        if (iArrM162115l == null || iArrM162111e == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        float fM131885c = m131885c(iArrM162115l, o03Var);
        int i = iArrM162115l[1];
        int i2 = iArrM162111e[1];
        int i3 = iArrM162115l[0];
        int i4 = iArrM162111e[0];
        if (i3 >= i4 || i >= i2) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i5 = i2 - i;
        if (i5 != i4 - i3 && (i4 = i3 + i5) >= o03Var.m162116m()) {
            throw NotFoundException.getNotFoundInstance();
        }
        int iRound = Math.round(((i4 - i3) + 1) / fM131885c);
        int iRound2 = Math.round((i5 + 1) / fM131885c);
        if (iRound <= 0 || iRound2 <= 0) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (iRound2 != iRound) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i6 = (int) (fM131885c / 2.0f);
        int i7 = i + i6;
        int i8 = i3 + i6;
        int i9 = (((int) ((iRound - 1) * fM131885c)) + i8) - i4;
        if (i9 > 0) {
            if (i9 > i6) {
                throw NotFoundException.getNotFoundInstance();
            }
            i8 -= i9;
        }
        int i10 = (((int) ((iRound2 - 1) * fM131885c)) + i7) - i2;
        if (i10 > 0) {
            if (i10 > i6) {
                throw NotFoundException.getNotFoundInstance();
            }
            i7 -= i10;
        }
        o03 o03Var2 = new o03(iRound, iRound2);
        for (int i11 = 0; i11 < iRound2; i11++) {
            int i12 = ((int) (i11 * fM131885c)) + i7;
            for (int i13 = 0; i13 < iRound; i13++) {
                if (o03Var.m162110d(((int) (i13 * fM131885c)) + i8, i12)) {
                    o03Var2.m162118o(i13, i11);
                }
            }
        }
        return o03Var2;
    }

    /* JADX INFO: renamed from: c */
    public static float m131885c(int[] iArr, o03 o03Var) throws NotFoundException {
        int iM162113j = o03Var.m162113j();
        int iM162116m = o03Var.m162116m();
        int i = iArr[0];
        boolean z = true;
        int i2 = iArr[1];
        int i3 = 0;
        while (i < iM162116m && i2 < iM162113j) {
            if (z != o03Var.m162110d(i, i2)) {
                i3++;
                if (i3 == 5) {
                    break;
                }
                z = !z;
            }
            i++;
            i2++;
        }
        if (i == iM162116m || i2 == iM162113j) {
            throw NotFoundException.getNotFoundInstance();
        }
        return (i - iArr[0]) / 7.0f;
    }

    @Override // p149l.ydc0
    /* JADX INFO: renamed from: a */
    public final oxc0 mo131886a(nx2 nx2Var, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        ghd ghdVarM218642c;
        pxc0[] pxc0VarArrM171834b;
        if (map == null || !map.containsKey(DecodeHintType.PURE_BARCODE)) {
            pxd pxdVarM143778e = new jxd(nx2Var.m161925a()).m143778e(map);
            ghdVarM218642c = this.f108596a.m218642c(pxdVarM143778e.m171833a(), map);
            pxc0VarArrM171834b = pxdVarM143778e.m171834b();
        } else {
            ghdVarM218642c = this.f108596a.m218642c(m131884b(nx2Var.m161925a()), map);
            pxc0VarArrM171834b = f108595b;
        }
        if (ghdVarM218642c.m126167d() instanceof fnb0) {
            ((fnb0) ghdVarM218642c.m126167d()).m122294a(pxc0VarArrM171834b);
        }
        oxc0 oxc0Var = new oxc0(ghdVarM218642c.m126171h(), ghdVarM218642c.m126168e(), pxc0VarArrM171834b, BarcodeFormat.QR_CODE);
        List<byte[]> listM126164a = ghdVarM218642c.m126164a();
        if (listM126164a != null) {
            oxc0Var.m166534h(ResultMetadataType.BYTE_SEGMENTS, listM126164a);
        }
        String strM126165b = ghdVarM218642c.m126165b();
        if (strM126165b != null) {
            oxc0Var.m166534h(ResultMetadataType.ERROR_CORRECTION_LEVEL, strM126165b);
        }
        if (ghdVarM218642c.m126172i()) {
            oxc0Var.m166534h(ResultMetadataType.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(ghdVarM218642c.m126170g()));
            oxc0Var.m166534h(ResultMetadataType.STRUCTURED_APPEND_PARITY, Integer.valueOf(ghdVarM218642c.m126169f()));
        }
        return oxc0Var;
    }

    @Override // p149l.ydc0
    public void reset() {
    }
}
