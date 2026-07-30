package org.spongycastle.crypto.digests;

import p153l.i2r0;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class SHA3Digest extends KeccakDigest {
    public SHA3Digest(int i) {
        super(checkBitLength(i));
    }

    private static int checkBitLength(int i) {
        if (i == 224 || i == 256 || i == 384 || i == 512) {
            return i;
        }
        i2r0.m138234a("'bitLength' ", i, " not supported for SHA-3");
        return 0;
    }

    @Override // org.spongycastle.crypto.digests.KeccakDigest
    public int doFinal(byte[] bArr, int i, byte b, int i2) {
        if (i2 < 0 || i2 > 7) {
            wg3.m206174a("'partialBits' must be in the range [0,7]");
            return 0;
        }
        int i3 = (b & ((1 << i2) - 1)) | (2 << i2);
        int i4 = i2 + 2;
        if (i4 >= 8) {
            byte[] bArr2 = this.oneByte;
            bArr2[0] = (byte) i3;
            absorb(bArr2, 0, 8L);
            i4 = i2 - 6;
            i3 >>>= 8;
        }
        return super.doFinal(bArr, i, (byte) i3, i4);
    }

    @Override // org.spongycastle.crypto.digests.KeccakDigest, org.spongycastle.crypto.Digest
    public String getAlgorithmName() {
        return "SHA3-" + this.fixedOutputLength;
    }

    public SHA3Digest() {
        this(256);
    }

    public SHA3Digest(SHA3Digest sHA3Digest) {
        super(sHA3Digest);
    }

    @Override // org.spongycastle.crypto.digests.KeccakDigest, org.spongycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        absorb(new byte[]{2}, 0, 2L);
        return super.doFinal(bArr, i);
    }
}
