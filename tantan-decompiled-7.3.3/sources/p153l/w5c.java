package p153l;

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
public final class w5c implements fmc0 {

    /* JADX INFO: renamed from: b */
    public static final s5d0[] f187492b = new s5d0[0];

    /* JADX INFO: renamed from: a */
    public final did f187493a = new did();

    /* JADX INFO: renamed from: b */
    public static d13 m204969b(d13 d13Var) throws NotFoundException {
        int[] iArrM113485l = d13Var.m113485l();
        int[] iArrM113481e = d13Var.m113481e();
        if (iArrM113485l == null || iArrM113481e == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        int iM204970c = m204970c(iArrM113485l, d13Var);
        int i = iArrM113485l[1];
        int i2 = iArrM113481e[1];
        int i3 = iArrM113485l[0];
        int i4 = ((iArrM113481e[0] - i3) + 1) / iM204970c;
        int i5 = ((i2 - i) + 1) / iM204970c;
        if (i4 <= 0 || i5 <= 0) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i6 = iM204970c / 2;
        int i7 = i + i6;
        int i8 = i3 + i6;
        d13 d13Var2 = new d13(i4, i5);
        for (int i9 = 0; i9 < i5; i9++) {
            int i10 = (i9 * iM204970c) + i7;
            for (int i11 = 0; i11 < i4; i11++) {
                if (d13Var.m113480d((i11 * iM204970c) + i8, i10)) {
                    d13Var2.m113488o(i11, i9);
                }
            }
        }
        return d13Var2;
    }

    /* JADX INFO: renamed from: c */
    public static int m204970c(int[] iArr, d13 d13Var) throws NotFoundException {
        int iM113486m = d13Var.m113486m();
        int i = iArr[0];
        int i2 = iArr[1];
        while (i < iM113486m && d13Var.m113480d(i, i2)) {
            i++;
        }
        if (i == iM113486m) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i3 = i - iArr[0];
        if (i3 != 0) {
            return i3;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // p153l.fmc0
    /* JADX INFO: renamed from: a */
    public r5d0 mo96539a(cy2 cy2Var, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        mid midVarM115873b;
        s5d0[] s5d0VarArrM118739b;
        if (map == null || !map.containsKey(DecodeHintType.PURE_BARCODE)) {
            dzd dzdVarM17393c = new Detector(cy2Var.m113086a()).m17393c();
            midVarM115873b = this.f187493a.m115873b(dzdVarM17393c.m118738a());
            s5d0VarArrM118739b = dzdVarM17393c.m118739b();
        } else {
            midVarM115873b = this.f187493a.m115873b(m204969b(cy2Var.m113086a()));
            s5d0VarArrM118739b = f187492b;
        }
        r5d0 r5d0Var = new r5d0(midVarM115873b.m158494h(), midVarM115873b.m158491e(), s5d0VarArrM118739b, BarcodeFormat.DATA_MATRIX);
        List<byte[]> listM158487a = midVarM115873b.m158487a();
        if (listM158487a != null) {
            r5d0Var.m179859h(ResultMetadataType.BYTE_SEGMENTS, listM158487a);
        }
        String strM158488b = midVarM115873b.m158488b();
        if (strM158488b != null) {
            r5d0Var.m179859h(ResultMetadataType.ERROR_CORRECTION_LEVEL, strM158488b);
        }
        return r5d0Var;
    }

    @Override // p153l.fmc0
    public void reset() {
    }
}
