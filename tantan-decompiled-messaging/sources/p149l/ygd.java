package p149l;

import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class ygd {

    /* JADX INFO: renamed from: a */
    public final ylc0 f198155a = new ylc0(gjj.f103077o);

    /* JADX INFO: renamed from: a */
    public final void m214634a(byte[] bArr, int i, int i2, int i3, int i4) throws ChecksumException {
        int i5 = i2 + i3;
        int i6 = i4 == 0 ? 1 : 2;
        int[] iArr = new int[i5 / i6];
        for (int i7 = 0; i7 < i5; i7++) {
            if (i4 == 0 || i7 % 2 == i4 - 1) {
                iArr[i7 / i6] = bArr[i7 + i] & 255;
            }
        }
        try {
            this.f198155a.m215261a(iArr, i3 / i6);
            for (int i8 = 0; i8 < i2; i8++) {
                if (i4 == 0 || i8 % 2 == i4 - 1) {
                    bArr[i8 + i] = (byte) iArr[i8 / i6];
                }
            }
        } catch (ReedSolomonException unused) {
            throw ChecksumException.getChecksumInstance();
        }
    }

    /* JADX INFO: renamed from: b */
    public ghd m214635b(o03 o03Var, Map<DecodeHintType, ?> map) throws ChecksumException, FormatException {
        byte[] bArr;
        byte[] bArrM166910a = new p03(o03Var).m166910a();
        m214634a(bArrM166910a, 0, 10, 10, 0);
        int i = bArrM166910a[0] & 15;
        if (i == 2 || i == 3 || i == 4) {
            m214634a(bArrM166910a, 20, 84, 40, 1);
            m214634a(bArrM166910a, 20, 84, 40, 2);
            bArr = new byte[94];
        } else {
            if (i != 5) {
                throw FormatException.getFormatInstance();
            }
            m214634a(bArrM166910a, 20, 68, 56, 1);
            m214634a(bArrM166910a, 20, 68, 56, 2);
            bArr = new byte[78];
        }
        System.arraycopy(bArrM166910a, 0, bArr, 0, 10);
        System.arraycopy(bArrM166910a, 20, bArr, 10, bArr.length - 10);
        return qgd.m174397a(bArr, i);
    }
}
