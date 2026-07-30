package org.spongycastle.crypto.agreement.kdf;

import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.DerivationFunction;
import org.spongycastle.crypto.DerivationParameters;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.params.KDFParameters;
import p153l.tyk0;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class ConcatenationKDFGenerator implements DerivationFunction {
    private Digest digest;
    private int hLen;
    private byte[] otherInfo;
    private byte[] shared;

    public ConcatenationKDFGenerator(Digest digest) {
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
        int i4;
        if (bArr.length - i2 < i) {
            tyk0.m193596a("output buffer too small");
            return 0;
        }
        byte[] bArr2 = new byte[this.hLen];
        byte[] bArr3 = new byte[4];
        this.digest.reset();
        int i5 = 1;
        if (i2 > this.hLen) {
            i3 = 0;
            while (true) {
                ItoOSP(i5, bArr3);
                this.digest.update(bArr3, 0, 4);
                Digest digest = this.digest;
                byte[] bArr4 = this.shared;
                digest.update(bArr4, 0, bArr4.length);
                Digest digest2 = this.digest;
                byte[] bArr5 = this.otherInfo;
                digest2.update(bArr5, 0, bArr5.length);
                this.digest.doFinal(bArr2, 0);
                System.arraycopy(bArr2, 0, bArr, i + i3, this.hLen);
                int i6 = this.hLen;
                i3 += i6;
                i4 = i5 + 1;
                if (i5 >= i2 / i6) {
                    break;
                }
                i5 = i4;
            }
            i5 = i4;
        } else {
            i3 = 0;
        }
        if (i3 < i2) {
            ItoOSP(i5, bArr3);
            this.digest.update(bArr3, 0, 4);
            Digest digest3 = this.digest;
            byte[] bArr6 = this.shared;
            digest3.update(bArr6, 0, bArr6.length);
            Digest digest4 = this.digest;
            byte[] bArr7 = this.otherInfo;
            digest4.update(bArr7, 0, bArr7.length);
            this.digest.doFinal(bArr2, 0);
            System.arraycopy(bArr2, 0, bArr, i + i3, i2 - i3);
        }
        return i2;
    }

    public Digest getDigest() {
        return this.digest;
    }

    @Override // org.spongycastle.crypto.DerivationFunction
    public void init(DerivationParameters derivationParameters) {
        if (!(derivationParameters instanceof KDFParameters)) {
            wg3.m206174a("KDF parameters required for KDF2Generator");
            return;
        }
        KDFParameters kDFParameters = (KDFParameters) derivationParameters;
        this.shared = kDFParameters.getSharedSecret();
        this.otherInfo = kDFParameters.getIV();
    }
}
