package org.spongycastle.crypto.generators;

import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.DerivationFunction;
import org.spongycastle.crypto.DerivationParameters;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.macs.HMac;
import org.spongycastle.crypto.params.HKDFParameters;
import org.spongycastle.crypto.params.KeyParameter;
import p153l.tyk0;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class HKDFBytesGenerator implements DerivationFunction {
    private byte[] currentT;
    private int generatedBytes;
    private HMac hMacHash;
    private int hashLen;
    private byte[] info;

    public HKDFBytesGenerator(Digest digest) {
        this.hMacHash = new HMac(digest);
        this.hashLen = digest.getDigestSize();
    }

    private void expandNext() throws DataLengthException {
        int i = this.generatedBytes;
        int i2 = this.hashLen;
        int i3 = (i / i2) + 1;
        if (i3 >= 256) {
            tyk0.m193596a("HKDF cannot generate more than 255 blocks of HashLen size");
            return;
        }
        if (i != 0) {
            this.hMacHash.update(this.currentT, 0, i2);
        }
        HMac hMac = this.hMacHash;
        byte[] bArr = this.info;
        hMac.update(bArr, 0, bArr.length);
        this.hMacHash.update((byte) i3);
        this.hMacHash.doFinal(this.currentT, 0);
    }

    private KeyParameter extract(byte[] bArr, byte[] bArr2) {
        this.hMacHash.init(new KeyParameter(bArr2));
        HMac hMac = this.hMacHash;
        if (bArr == null) {
            hMac.init(new KeyParameter(new byte[this.hashLen]));
        } else {
            hMac.init(new KeyParameter(bArr));
        }
        this.hMacHash.update(bArr2, 0, bArr2.length);
        byte[] bArr3 = new byte[this.hashLen];
        this.hMacHash.doFinal(bArr3, 0);
        return new KeyParameter(bArr3);
    }

    @Override // org.spongycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i, int i2) throws DataLengthException, IllegalArgumentException {
        int i3 = this.generatedBytes;
        int i4 = i3 + i2;
        int i5 = this.hashLen;
        if (i4 > i5 * 255) {
            tyk0.m193596a("HKDF may only be used for 255 * HashLen bytes of output");
            return 0;
        }
        if (i3 % i5 == 0) {
            expandNext();
        }
        int i6 = this.generatedBytes;
        int i7 = this.hashLen;
        int i8 = i6 % i7;
        int iMin = Math.min(i7 - (i6 % i7), i2);
        System.arraycopy(this.currentT, i8, bArr, i, iMin);
        this.generatedBytes += iMin;
        int i9 = i2 - iMin;
        while (true) {
            i += iMin;
            if (i9 <= 0) {
                return i2;
            }
            expandNext();
            iMin = Math.min(this.hashLen, i9);
            System.arraycopy(this.currentT, 0, bArr, i, iMin);
            this.generatedBytes += iMin;
            i9 -= iMin;
        }
    }

    public Digest getDigest() {
        return this.hMacHash.getUnderlyingDigest();
    }

    @Override // org.spongycastle.crypto.DerivationFunction
    public void init(DerivationParameters derivationParameters) {
        if (!(derivationParameters instanceof HKDFParameters)) {
            wg3.m206174a("HKDF parameters required for HKDFBytesGenerator");
            return;
        }
        HKDFParameters hKDFParameters = (HKDFParameters) derivationParameters;
        boolean zSkipExtract = hKDFParameters.skipExtract();
        HMac hMac = this.hMacHash;
        if (zSkipExtract) {
            hMac.init(new KeyParameter(hKDFParameters.getIKM()));
        } else {
            hMac.init(extract(hKDFParameters.getSalt(), hKDFParameters.getIKM()));
        }
        this.info = hKDFParameters.getInfo();
        this.generatedBytes = 0;
        this.currentT = new byte[this.hashLen];
    }
}
