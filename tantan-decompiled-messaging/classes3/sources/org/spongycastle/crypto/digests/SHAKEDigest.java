package org.spongycastle.crypto.digests;

import l.ctq0;
import l.ig3;
import org.spongycastle.crypto.Xof;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class SHAKEDigest extends KeccakDigest implements Xof {
    public SHAKEDigest(int i) {
        super(checkBitLength(i));
    }

    private static int checkBitLength(int i) {
        if (i == 128 || i == 256) {
            return i;
        }
        ctq0.a("'bitLength' ", i, " not supported for SHAKE");
        return 0;
    }

    public int doFinal(byte[] bArr, int i, int i2, byte b, int i3) {
        if (i3 < 0 || i3 > 7) {
            ig3.a("'partialBits' must be in the range [0,7]");
            return 0;
        }
        int i4 = (b & ((1 << i3) - 1)) | (15 << i3);
        int i5 = i3 + 4;
        if (i5 >= 8) {
            byte[] bArr2 = this.oneByte;
            bArr2[0] = (byte) i4;
            absorb(bArr2, 0, 8L);
            i5 = i3 - 4;
            i4 >>>= 8;
        }
        if (i5 > 0) {
            byte[] bArr3 = this.oneByte;
            bArr3[0] = (byte) i4;
            absorb(bArr3, 0, i5);
        }
        squeeze(bArr, i, ((long) i2) * 8);
        reset();
        return i2;
    }

    @Override // org.spongycastle.crypto.digests.KeccakDigest, org.spongycastle.crypto.Digest
    public String getAlgorithmName() {
        return "SHAKE" + this.fixedOutputLength;
    }

    public SHAKEDigest() {
        this(128);
    }

    public SHAKEDigest(SHAKEDigest sHAKEDigest) {
        super(sHAKEDigest);
    }

    @Override // org.spongycastle.crypto.Xof
    public int doFinal(byte[] bArr, int i, int i2) {
        absorb(new byte[]{15}, 0, 4L);
        squeeze(bArr, i, ((long) i2) * 8);
        reset();
        return i2;
    }

    @Override // org.spongycastle.crypto.digests.KeccakDigest
    public int doFinal(byte[] bArr, int i, byte b, int i2) {
        return doFinal(bArr, i, getDigestSize(), b, i2);
    }

    @Override // org.spongycastle.crypto.digests.KeccakDigest, org.spongycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        return doFinal(bArr, i, getDigestSize());
    }
}
