package p149l;

import java.security.InvalidKeyException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class cvw0 extends zuw0 {
    public cvw0(byte[] bArr, int i) throws InvalidKeyException {
        super(bArr, i);
    }

    @Override // p149l.zuw0
    /* JADX INFO: renamed from: a */
    public final int mo108967a() {
        return 24;
    }

    @Override // p149l.zuw0
    /* JADX INFO: renamed from: b */
    public final int[] mo108968b(int[] iArr, int i) {
        int length = iArr.length;
        if (length != 6) {
            dqi0.m113073a("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(length * 32)});
            return null;
        }
        int[] iArr2 = new int[16];
        int[] iArr3 = new int[16];
        vuw0.m200140b(iArr3, this.f204912a);
        iArr3[12] = iArr[0];
        iArr3[13] = iArr[1];
        iArr3[14] = iArr[2];
        iArr3[15] = iArr[3];
        vuw0.m200141c(iArr3);
        iArr3[4] = iArr3[12];
        iArr3[5] = iArr3[13];
        iArr3[6] = iArr3[14];
        iArr3[7] = iArr3[15];
        vuw0.m200140b(iArr2, Arrays.copyOf(iArr3, 8));
        iArr2[12] = i;
        iArr2[13] = 0;
        iArr2[14] = iArr[4];
        iArr2[15] = iArr[5];
        return iArr2;
    }
}
