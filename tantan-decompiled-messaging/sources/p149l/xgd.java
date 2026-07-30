package p149l;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.google.zxing.datamatrix.decoder.DecodedBitStreamParser;

/* JADX INFO: loaded from: classes7.dex */
public final class xgd {

    /* JADX INFO: renamed from: a */
    public final ylc0 f192755a = new ylc0(gjj.f103075m);

    /* JADX INFO: renamed from: a */
    public final void m208626a(byte[] bArr, int i) throws ChecksumException {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        try {
            this.f192755a.m215261a(iArr, bArr.length - i);
            for (int i3 = 0; i3 < i; i3++) {
                bArr[i3] = (byte) iArr[i3];
            }
        } catch (ReedSolomonException unused) {
            throw ChecksumException.getChecksumInstance();
        }
    }

    /* JADX INFO: renamed from: b */
    public ghd m208627b(o03 o03Var) throws ChecksumException, FormatException {
        q03 q03Var = new q03(o03Var);
        f4c[] f4cVarArrM119296b = f4c.m119296b(q03Var.m172278c(), q03Var.m172277b());
        int iM119298c = 0;
        for (f4c f4cVar : f4cVarArrM119296b) {
            iM119298c += f4cVar.m119298c();
        }
        byte[] bArr = new byte[iM119298c];
        int length = f4cVarArrM119296b.length;
        for (int i = 0; i < length; i++) {
            f4c f4cVar2 = f4cVarArrM119296b[i];
            byte[] bArrM119297a = f4cVar2.m119297a();
            int iM119298c2 = f4cVar2.m119298c();
            m208626a(bArrM119297a, iM119298c2);
            for (int i2 = 0; i2 < iM119298c2; i2++) {
                bArr[(i2 * length) + i] = bArrM119297a[i2];
            }
        }
        return DecodedBitStreamParser.m17324a(bArr);
    }
}
