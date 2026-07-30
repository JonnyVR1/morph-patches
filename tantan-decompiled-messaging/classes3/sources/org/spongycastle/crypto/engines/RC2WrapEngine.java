package org.spongycastle.crypto.engines;

import java.security.SecureRandom;
import l.ig3;
import l.qkq0;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.Wrapper;
import org.spongycastle.crypto.digests.SHA1Digest;
import org.spongycastle.crypto.modes.CBCBlockCipher;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.util.Arrays;
import p003l.dql;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class RC2WrapEngine implements Wrapper {
    private static final byte[] IV2 = {74, -35, -94, 44, 121, -24, 33, 5};
    private CBCBlockCipher engine;
    private boolean forWrapping;

    /* JADX INFO: renamed from: iv */
    private byte[] f10185iv;
    private CipherParameters param;
    private ParametersWithIV paramPlusIV;

    /* JADX INFO: renamed from: sr */
    private SecureRandom f10186sr;
    Digest sha1 = new SHA1Digest();
    byte[] digest = new byte[20];

    private byte[] calculateCMSKeyChecksum(byte[] bArr) {
        byte[] bArr2 = new byte[8];
        this.sha1.update(bArr, 0, bArr.length);
        this.sha1.doFinal(this.digest, 0);
        System.arraycopy(this.digest, 0, bArr2, 0, 8);
        return bArr2;
    }

    private boolean checkCMSKeyChecksum(byte[] bArr, byte[] bArr2) {
        return Arrays.constantTimeAreEqual(calculateCMSKeyChecksum(bArr), bArr2);
    }

    @Override // org.spongycastle.crypto.Wrapper
    public String getAlgorithmName() {
        return "RC2";
    }

    @Override // org.spongycastle.crypto.Wrapper
    public void init(boolean z, CipherParameters cipherParameters) {
        this.forWrapping = z;
        this.engine = new CBCBlockCipher(new RC2Engine());
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.f10186sr = parametersWithRandom.getRandom();
            cipherParameters = parametersWithRandom.getParameters();
        } else {
            this.f10186sr = new SecureRandom();
        }
        if (!(cipherParameters instanceof ParametersWithIV)) {
            this.param = cipherParameters;
            if (this.forWrapping) {
                byte[] bArr = new byte[8];
                this.f10185iv = bArr;
                this.f10186sr.nextBytes(bArr);
                this.paramPlusIV = new ParametersWithIV(this.param, this.f10185iv);
                return;
            }
            return;
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        this.paramPlusIV = parametersWithIV;
        this.f10185iv = parametersWithIV.getIV();
        this.param = this.paramPlusIV.getParameters();
        if (!this.forWrapping) {
            ig3.a("You should not supply an IV for unwrapping");
            return;
        }
        byte[] bArr2 = this.f10185iv;
        if (bArr2 == null || bArr2.length != 8) {
            ig3.a("IV is not 8 octets");
        }
    }

    @Override // org.spongycastle.crypto.Wrapper
    public byte[] unwrap(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        if (this.forWrapping) {
            qkq0.a("Not set for unwrapping");
            return null;
        }
        if (bArr == null) {
            dql.m3633a("Null pointer as ciphertext");
            return null;
        }
        if (i2 % this.engine.getBlockSize() != 0) {
            throw new InvalidCipherTextException("Ciphertext not multiple of " + this.engine.getBlockSize());
        }
        this.engine.init(false, new ParametersWithIV(this.param, IV2));
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        for (int i3 = 0; i3 < i2 / this.engine.getBlockSize(); i3++) {
            int blockSize = this.engine.getBlockSize() * i3;
            this.engine.processBlock(bArr2, blockSize, bArr2, blockSize);
        }
        byte[] bArr3 = new byte[i2];
        int i4 = 0;
        while (i4 < i2) {
            int i5 = i4 + 1;
            bArr3[i4] = bArr2[i2 - i5];
            i4 = i5;
        }
        byte[] bArr4 = new byte[8];
        this.f10185iv = bArr4;
        int i6 = i2 - 8;
        byte[] bArr5 = new byte[i6];
        System.arraycopy(bArr3, 0, bArr4, 0, 8);
        System.arraycopy(bArr3, 8, bArr5, 0, i6);
        ParametersWithIV parametersWithIV = new ParametersWithIV(this.param, this.f10185iv);
        this.paramPlusIV = parametersWithIV;
        this.engine.init(false, parametersWithIV);
        byte[] bArr6 = new byte[i6];
        System.arraycopy(bArr5, 0, bArr6, 0, i6);
        for (int i7 = 0; i7 < i6 / this.engine.getBlockSize(); i7++) {
            int blockSize2 = this.engine.getBlockSize() * i7;
            this.engine.processBlock(bArr6, blockSize2, bArr6, blockSize2);
        }
        int i8 = i2 - 16;
        byte[] bArr7 = new byte[i8];
        byte[] bArr8 = new byte[8];
        System.arraycopy(bArr6, 0, bArr7, 0, i8);
        System.arraycopy(bArr6, i8, bArr8, 0, 8);
        if (!checkCMSKeyChecksum(bArr7, bArr8)) {
            dql.m3633a("Checksum inside ciphertext is corrupted");
            return null;
        }
        int i9 = bArr7[0];
        if (i8 - ((i9 & 255) + 1) <= 7) {
            byte[] bArr9 = new byte[i9];
            System.arraycopy(bArr7, 1, bArr9, 0, i9);
            return bArr9;
        }
        throw new InvalidCipherTextException("too many pad bytes (" + (i8 - ((bArr7[0] & 255) + 1)) + ")");
    }

    @Override // org.spongycastle.crypto.Wrapper
    public byte[] wrap(byte[] bArr, int i, int i2) {
        if (!this.forWrapping) {
            qkq0.a("Not initialized for wrapping");
            return null;
        }
        int i3 = i2 + 1;
        int i4 = i3 % 8;
        int i5 = i4 != 0 ? (8 - i4) + i3 : i3;
        byte[] bArr2 = new byte[i5];
        bArr2[0] = (byte) i2;
        System.arraycopy(bArr, i, bArr2, 1, i2);
        int i6 = (i5 - i2) - 1;
        byte[] bArr3 = new byte[i6];
        if (i6 > 0) {
            this.f10186sr.nextBytes(bArr3);
            System.arraycopy(bArr3, 0, bArr2, i3, i6);
        }
        byte[] bArrCalculateCMSKeyChecksum = calculateCMSKeyChecksum(bArr2);
        int length = bArrCalculateCMSKeyChecksum.length + i5;
        byte[] bArr4 = new byte[length];
        System.arraycopy(bArr2, 0, bArr4, 0, i5);
        System.arraycopy(bArrCalculateCMSKeyChecksum, 0, bArr4, i5, bArrCalculateCMSKeyChecksum.length);
        byte[] bArr5 = new byte[length];
        System.arraycopy(bArr4, 0, bArr5, 0, length);
        int blockSize = length / this.engine.getBlockSize();
        if (length % this.engine.getBlockSize() != 0) {
            qkq0.a("Not multiple of block length");
            return null;
        }
        this.engine.init(true, this.paramPlusIV);
        for (int i7 = 0; i7 < blockSize; i7++) {
            int blockSize2 = this.engine.getBlockSize() * i7;
            this.engine.processBlock(bArr5, blockSize2, bArr5, blockSize2);
        }
        byte[] bArr6 = this.f10185iv;
        int length2 = bArr6.length + length;
        byte[] bArr7 = new byte[length2];
        System.arraycopy(bArr6, 0, bArr7, 0, bArr6.length);
        System.arraycopy(bArr5, 0, bArr7, this.f10185iv.length, length);
        byte[] bArr8 = new byte[length2];
        int i8 = 0;
        while (i8 < length2) {
            int i9 = i8 + 1;
            bArr8[i8] = bArr7[length2 - i9];
            i8 = i9;
        }
        this.engine.init(true, new ParametersWithIV(this.param, IV2));
        for (int i10 = 0; i10 < blockSize + 1; i10++) {
            int blockSize3 = this.engine.getBlockSize() * i10;
            this.engine.processBlock(bArr8, blockSize3, bArr8, blockSize3);
        }
        return bArr8;
    }
}
