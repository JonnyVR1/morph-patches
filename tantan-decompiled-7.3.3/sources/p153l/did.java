package p153l;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.google.zxing.datamatrix.decoder.DecodedBitStreamParser;

/* JADX INFO: loaded from: classes7.dex */
public final class did {

    /* JADX INFO: renamed from: a */
    public final fuc0 f88625a = new fuc0(zlj.f204934m);

    /* JADX INFO: renamed from: a */
    public final void m115872a(byte[] bArr, int i) throws ChecksumException {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        try {
            this.f88625a.m127454a(iArr, bArr.length - i);
            for (int i3 = 0; i3 < i; i3++) {
                bArr[i3] = (byte) iArr[i3];
            }
        } catch (ReedSolomonException unused) {
            throw ChecksumException.getChecksumInstance();
        }
    }

    /* JADX INFO: renamed from: b */
    public mid m115873b(d13 d13Var) throws ChecksumException, FormatException {
        f13 f13Var = new f13(d13Var);
        n5c[] n5cVarArrM161695b = n5c.m161695b(f13Var.m123547c(), f13Var.m123546b());
        int iM161697c = 0;
        for (n5c n5cVar : n5cVarArrM161695b) {
            iM161697c += n5cVar.m161697c();
        }
        byte[] bArr = new byte[iM161697c];
        int length = n5cVarArrM161695b.length;
        for (int i = 0; i < length; i++) {
            n5c n5cVar2 = n5cVarArrM161695b[i];
            byte[] bArrM161696a = n5cVar2.m161696a();
            int iM161697c2 = n5cVar2.m161697c();
            m115872a(bArrM161696a, iM161697c2);
            for (int i2 = 0; i2 < iM161697c2; i2++) {
                bArr[(i2 * length) + i] = bArrM161696a[i2];
            }
        }
        return DecodedBitStreamParser.m17379a(bArr);
    }
}
