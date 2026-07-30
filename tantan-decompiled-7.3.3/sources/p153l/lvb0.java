package p153l;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class lvb0 implements fmc0 {

    /* JADX INFO: renamed from: b */
    public static final s5d0[] f133696b = new s5d0[0];

    /* JADX INFO: renamed from: a */
    public final fid f133697a = new fid();

    /* JADX INFO: renamed from: b */
    private static d13 m155981b(d13 d13Var) throws NotFoundException {
        int[] iArrM113485l = d13Var.m113485l();
        int[] iArrM113481e = d13Var.m113481e();
        if (iArrM113485l == null || iArrM113481e == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        float fM155982c = m155982c(iArrM113485l, d13Var);
        int i = iArrM113485l[1];
        int i2 = iArrM113481e[1];
        int i3 = iArrM113485l[0];
        int i4 = iArrM113481e[0];
        if (i3 >= i4 || i >= i2) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i5 = i2 - i;
        if (i5 != i4 - i3 && (i4 = i3 + i5) >= d13Var.m113486m()) {
            throw NotFoundException.getNotFoundInstance();
        }
        int iRound = Math.round(((i4 - i3) + 1) / fM155982c);
        int iRound2 = Math.round((i5 + 1) / fM155982c);
        if (iRound <= 0 || iRound2 <= 0) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (iRound2 != iRound) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i6 = (int) (fM155982c / 2.0f);
        int i7 = i + i6;
        int i8 = i3 + i6;
        int i9 = (((int) ((iRound - 1) * fM155982c)) + i8) - i4;
        if (i9 > 0) {
            if (i9 > i6) {
                throw NotFoundException.getNotFoundInstance();
            }
            i8 -= i9;
        }
        int i10 = (((int) ((iRound2 - 1) * fM155982c)) + i7) - i2;
        if (i10 > 0) {
            if (i10 > i6) {
                throw NotFoundException.getNotFoundInstance();
            }
            i7 -= i10;
        }
        d13 d13Var2 = new d13(iRound, iRound2);
        for (int i11 = 0; i11 < iRound2; i11++) {
            int i12 = ((int) (i11 * fM155982c)) + i7;
            for (int i13 = 0; i13 < iRound; i13++) {
                if (d13Var.m113480d(((int) (i13 * fM155982c)) + i8, i12)) {
                    d13Var2.m113488o(i13, i11);
                }
            }
        }
        return d13Var2;
    }

    /* JADX INFO: renamed from: c */
    public static float m155982c(int[] iArr, d13 d13Var) throws NotFoundException {
        int iM113483j = d13Var.m113483j();
        int iM113486m = d13Var.m113486m();
        int i = iArr[0];
        boolean z = true;
        int i2 = iArr[1];
        int i3 = 0;
        while (i < iM113486m && i2 < iM113483j) {
            if (z != d13Var.m113480d(i, i2)) {
                i3++;
                if (i3 == 5) {
                    break;
                }
                z = !z;
            }
            i++;
            i2++;
        }
        if (i == iM113486m || i2 == iM113483j) {
            throw NotFoundException.getNotFoundInstance();
        }
        return (i - iArr[0]) / 7.0f;
    }

    @Override // p153l.fmc0
    /* JADX INFO: renamed from: a */
    public final r5d0 mo96539a(cy2 cy2Var, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        mid midVarM125679c;
        s5d0[] s5d0VarArrM118739b;
        if (map == null || !map.containsKey(DecodeHintType.PURE_BARCODE)) {
            dzd dzdVarM213614e = new xyd(cy2Var.m113086a()).m213614e(map);
            midVarM125679c = this.f133697a.m125679c(dzdVarM213614e.m118738a(), map);
            s5d0VarArrM118739b = dzdVarM213614e.m118739b();
        } else {
            midVarM125679c = this.f133697a.m125679c(m155981b(cy2Var.m113086a()), map);
            s5d0VarArrM118739b = f133696b;
        }
        if (midVarM125679c.m158490d() instanceof jvb0) {
            ((jvb0) midVarM125679c.m158490d()).m147009a(s5d0VarArrM118739b);
        }
        r5d0 r5d0Var = new r5d0(midVarM125679c.m158494h(), midVarM125679c.m158491e(), s5d0VarArrM118739b, BarcodeFormat.QR_CODE);
        List<byte[]> listM158487a = midVarM125679c.m158487a();
        if (listM158487a != null) {
            r5d0Var.m179859h(ResultMetadataType.BYTE_SEGMENTS, listM158487a);
        }
        String strM158488b = midVarM125679c.m158488b();
        if (strM158488b != null) {
            r5d0Var.m179859h(ResultMetadataType.ERROR_CORRECTION_LEVEL, strM158488b);
        }
        if (midVarM125679c.m158495i()) {
            r5d0Var.m179859h(ResultMetadataType.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(midVarM125679c.m158493g()));
            r5d0Var.m179859h(ResultMetadataType.STRUCTURED_APPEND_PARITY, Integer.valueOf(midVarM125679c.m158492f()));
        }
        return r5d0Var;
    }

    @Override // p153l.fmc0
    public void reset() {
    }
}
