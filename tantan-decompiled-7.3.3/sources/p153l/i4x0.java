package p153l;

import java.security.InvalidKeyException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class i4x0 extends f4x0 {
    public i4x0(byte[] bArr, int i) throws InvalidKeyException {
        super(bArr, i);
    }

    @Override // p153l.f4x0
    /* JADX INFO: renamed from: a */
    public final int mo119485a() {
        return 24;
    }

    @Override // p153l.f4x0
    /* JADX INFO: renamed from: b */
    public final int[] mo119486b(int[] iArr, int i) {
        int length = iArr.length;
        if (length != 6) {
            gzi0.m133102a("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(length * 32)});
            return null;
        }
        int[] iArr2 = new int[16];
        int[] iArr3 = new int[16];
        b4x0.m102541b(iArr3, this.f97163a);
        iArr3[12] = iArr[0];
        iArr3[13] = iArr[1];
        iArr3[14] = iArr[2];
        iArr3[15] = iArr[3];
        b4x0.m102542c(iArr3);
        iArr3[4] = iArr3[12];
        iArr3[5] = iArr3[13];
        iArr3[6] = iArr3[14];
        iArr3[7] = iArr3[15];
        b4x0.m102541b(iArr2, Arrays.copyOf(iArr3, 8));
        iArr2[12] = i;
        iArr2[13] = 0;
        iArr2[14] = iArr[4];
        iArr2[15] = iArr[5];
        return iArr2;
    }
}
