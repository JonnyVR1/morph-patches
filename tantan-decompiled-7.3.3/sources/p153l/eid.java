package p153l;

import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class eid {

    /* JADX INFO: renamed from: a */
    public final fuc0 f94139a = new fuc0(zlj.f204936o);

    /* JADX INFO: renamed from: a */
    public final void m120888a(byte[] bArr, int i, int i2, int i3, int i4) throws ChecksumException {
        int i5 = i2 + i3;
        int i6 = i4 == 0 ? 1 : 2;
        int[] iArr = new int[i5 / i6];
        for (int i7 = 0; i7 < i5; i7++) {
            if (i4 == 0 || i7 % 2 == i4 - 1) {
                iArr[i7 / i6] = bArr[i7 + i] & 255;
            }
        }
        try {
            this.f94139a.m127454a(iArr, i3 / i6);
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
    public mid m120889b(d13 d13Var, Map<DecodeHintType, ?> map) throws ChecksumException, FormatException {
        byte[] bArr;
        byte[] bArrM118940a = new e13(d13Var).m118940a();
        m120888a(bArrM118940a, 0, 10, 10, 0);
        int i = bArrM118940a[0] & 15;
        if (i == 2 || i == 3 || i == 4) {
            m120888a(bArrM118940a, 20, 84, 40, 1);
            m120888a(bArrM118940a, 20, 84, 40, 2);
            bArr = new byte[94];
        } else {
            if (i != 5) {
                throw FormatException.getFormatInstance();
            }
            m120888a(bArrM118940a, 20, 68, 56, 1);
            m120888a(bArrM118940a, 20, 68, 56, 2);
            bArr = new byte[78];
        }
        System.arraycopy(bArrM118940a, 0, bArr, 0, 10);
        System.arraycopy(bArrM118940a, 20, bArr, 10, bArr.length - 10);
        return whd.m206342a(bArr, i);
    }
}
