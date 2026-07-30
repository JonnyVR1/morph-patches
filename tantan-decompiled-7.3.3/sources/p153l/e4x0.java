package p153l;

import java.security.InvalidKeyException;

/* JADX INFO: loaded from: classes6.dex */
public final class e4x0 extends f4x0 {
    public e4x0(byte[] bArr, int i) throws InvalidKeyException {
        super(bArr, i);
    }

    @Override // p153l.f4x0
    /* JADX INFO: renamed from: a */
    public final int mo119485a() {
        return 12;
    }

    @Override // p153l.f4x0
    /* JADX INFO: renamed from: b */
    public final int[] mo119486b(int[] iArr, int i) {
        int length = iArr.length;
        if (length != 3) {
            gzi0.m133102a("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(length * 32)});
            return null;
        }
        int[] iArr2 = new int[16];
        b4x0.m102541b(iArr2, this.f97163a);
        iArr2[12] = i;
        System.arraycopy(iArr, 0, iArr2, 13, 3);
        return iArr2;
    }
}
