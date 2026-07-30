package p149l;

import java.security.InvalidKeyException;

/* JADX INFO: loaded from: classes6.dex */
public final class yuw0 extends zuw0 {
    public yuw0(byte[] bArr, int i) throws InvalidKeyException {
        super(bArr, i);
    }

    @Override // p149l.zuw0
    /* JADX INFO: renamed from: a */
    public final int mo108967a() {
        return 12;
    }

    @Override // p149l.zuw0
    /* JADX INFO: renamed from: b */
    public final int[] mo108968b(int[] iArr, int i) {
        int length = iArr.length;
        if (length != 3) {
            dqi0.m113073a("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(length * 32)});
            return null;
        }
        int[] iArr2 = new int[16];
        vuw0.m200140b(iArr2, this.f204912a);
        iArr2[12] = i;
        System.arraycopy(iArr, 0, iArr2, 13, 3);
        return iArr2;
    }
}
