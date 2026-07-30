package org.spongycastle.crypto.generators;

import l.ig3;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.DerivationParameters;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.DigestDerivationFunction;
import org.spongycastle.crypto.params.ISO18033KDFParameters;
import org.spongycastle.crypto.params.KDFParameters;
import org.spongycastle.util.Pack;
import p003l.npk0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class BaseKDFBytesGenerator implements DigestDerivationFunction {
    private int counterStart;
    private Digest digest;

    /* JADX INFO: renamed from: iv */
    private byte[] f10228iv;
    private byte[] shared;

    public BaseKDFBytesGenerator(int i, Digest digest) {
        this.counterStart = i;
        this.digest = digest;
    }

    @Override // org.spongycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i, int i2) throws DataLengthException, IllegalArgumentException {
        int i3 = i2;
        int i4 = i;
        if (bArr.length - i3 < i4) {
            npk0.m6558a("output buffer too small");
            return 0;
        }
        long j = i3;
        int digestSize = this.digest.getDigestSize();
        if (j > 8589934591L) {
            ig3.a("Output length too large");
            return 0;
        }
        long j2 = digestSize;
        int i5 = (int) (((j + j2) - 1) / j2);
        byte[] bArr2 = new byte[this.digest.getDigestSize()];
        byte[] bArr3 = new byte[4];
        Pack.intToBigEndian(this.counterStart, bArr3, 0);
        int i6 = this.counterStart & (-256);
        int i7 = 0;
        while (true) {
            Digest digest = this.digest;
            if (i7 >= i5) {
                digest.reset();
                return (int) j;
            }
            byte[] bArr4 = this.shared;
            digest.update(bArr4, 0, bArr4.length);
            this.digest.update(bArr3, 0, 4);
            byte[] bArr5 = this.f10228iv;
            if (bArr5 != null) {
                this.digest.update(bArr5, 0, bArr5.length);
            }
            this.digest.doFinal(bArr2, 0);
            if (i3 > digestSize) {
                System.arraycopy(bArr2, 0, bArr, i4, digestSize);
                i4 += digestSize;
                i3 -= digestSize;
            } else {
                System.arraycopy(bArr2, 0, bArr, i4, i3);
            }
            byte b = (byte) (bArr3[3] + 1);
            bArr3[3] = b;
            if (b == 0) {
                i6 += 256;
                Pack.intToBigEndian(i6, bArr3, 0);
            }
            i7++;
        }
    }

    @Override // org.spongycastle.crypto.DigestDerivationFunction
    public Digest getDigest() {
        return this.digest;
    }

    @Override // org.spongycastle.crypto.DerivationFunction
    public void init(DerivationParameters derivationParameters) {
        if (derivationParameters instanceof KDFParameters) {
            KDFParameters kDFParameters = (KDFParameters) derivationParameters;
            this.shared = kDFParameters.getSharedSecret();
            this.f10228iv = kDFParameters.getIV();
        } else if (!(derivationParameters instanceof ISO18033KDFParameters)) {
            ig3.a("KDF parameters required for KDF2Generator");
        } else {
            this.shared = ((ISO18033KDFParameters) derivationParameters).getSeed();
            this.f10228iv = null;
        }
    }
}
