package org.spongycastle.crypto.generators;

import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.DerivationFunction;
import org.spongycastle.crypto.DerivationParameters;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.params.MGFParameters;
import p149l.ig3;
import p149l.npk0;

/* JADX INFO: loaded from: classes3.dex */
public class MGF1BytesGenerator implements DerivationFunction {
    private Digest digest;
    private int hLen;
    private byte[] seed;

    public MGF1BytesGenerator(Digest digest) {
        this.digest = digest;
        this.hLen = digest.getDigestSize();
    }

    private void ItoOSP(int i, byte[] bArr) {
        bArr[0] = (byte) (i >>> 24);
        bArr[1] = (byte) (i >>> 16);
        bArr[2] = (byte) (i >>> 8);
        bArr[3] = (byte) i;
    }

    @Override // org.spongycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i, int i2) throws DataLengthException, IllegalArgumentException {
        int i3;
        if (bArr.length - i2 < i) {
            npk0.m160508a("output buffer too small");
            return 0;
        }
        byte[] bArr2 = new byte[this.hLen];
        byte[] bArr3 = new byte[4];
        this.digest.reset();
        if (i2 > this.hLen) {
            i3 = 0;
            do {
                ItoOSP(i3, bArr3);
                Digest digest = this.digest;
                byte[] bArr4 = this.seed;
                digest.update(bArr4, 0, bArr4.length);
                this.digest.update(bArr3, 0, 4);
                this.digest.doFinal(bArr2, 0);
                int i4 = this.hLen;
                System.arraycopy(bArr2, 0, bArr, (i3 * i4) + i, i4);
                i3++;
            } while (i3 < i2 / this.hLen);
        } else {
            i3 = 0;
        }
        if (this.hLen * i3 < i2) {
            ItoOSP(i3, bArr3);
            Digest digest2 = this.digest;
            byte[] bArr5 = this.seed;
            digest2.update(bArr5, 0, bArr5.length);
            this.digest.update(bArr3, 0, 4);
            this.digest.doFinal(bArr2, 0);
            int i5 = this.hLen;
            System.arraycopy(bArr2, 0, bArr, i + (i3 * i5), i2 - (i3 * i5));
        }
        return i2;
    }

    public Digest getDigest() {
        return this.digest;
    }

    @Override // org.spongycastle.crypto.DerivationFunction
    public void init(DerivationParameters derivationParameters) {
        if (derivationParameters instanceof MGFParameters) {
            this.seed = ((MGFParameters) derivationParameters).getSeed();
        } else {
            ig3.m135964a("MGF parameters required for MGF1Generator");
        }
    }
}
