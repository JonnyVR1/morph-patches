package org.spongycastle.crypto.encodings;

import java.security.SecureRandom;
import org.spongycastle.crypto.AsymmetricBlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.digests.SHA1Digest;
import org.spongycastle.crypto.params.ParametersWithRandom;
import p149l.dql;

/* JADX INFO: loaded from: classes3.dex */
public class OAEPEncoding implements AsymmetricBlockCipher {
    private byte[] defHash;
    private AsymmetricBlockCipher engine;
    private boolean forEncryption;
    private Digest mgf1Hash;
    private SecureRandom random;

    public OAEPEncoding(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, Digest digest2, byte[] bArr) {
        this.engine = asymmetricBlockCipher;
        this.mgf1Hash = digest2;
        this.defHash = new byte[digest.getDigestSize()];
        digest.reset();
        if (bArr != null) {
            digest.update(bArr, 0, bArr.length);
        }
        digest.doFinal(this.defHash, 0);
    }

    private void ItoOSP(int i, byte[] bArr) {
        bArr[0] = (byte) (i >>> 24);
        bArr[1] = (byte) (i >>> 16);
        bArr[2] = (byte) (i >>> 8);
        bArr[3] = (byte) i;
    }

    private byte[] maskGeneratorFunction1(byte[] bArr, int i, int i2, int i3) {
        byte[] bArr2 = new byte[i3];
        int digestSize = this.mgf1Hash.getDigestSize();
        byte[] bArr3 = new byte[digestSize];
        byte[] bArr4 = new byte[4];
        this.mgf1Hash.reset();
        int i4 = 0;
        while (i4 < i3 / digestSize) {
            ItoOSP(i4, bArr4);
            this.mgf1Hash.update(bArr, i, i2);
            this.mgf1Hash.update(bArr4, 0, 4);
            this.mgf1Hash.doFinal(bArr3, 0);
            System.arraycopy(bArr3, 0, bArr2, i4 * digestSize, digestSize);
            i4++;
        }
        int i5 = digestSize * i4;
        if (i5 < i3) {
            ItoOSP(i4, bArr4);
            this.mgf1Hash.update(bArr, i, i2);
            this.mgf1Hash.update(bArr4, 0, 4);
            this.mgf1Hash.doFinal(bArr3, 0);
            System.arraycopy(bArr3, 0, bArr2, i5, i3 - i5);
        }
        return bArr2;
    }

    public byte[] decodeBlock(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArrProcessBlock = this.engine.processBlock(bArr, i, i2);
        if (bArrProcessBlock.length < this.engine.getOutputBlockSize()) {
            int outputBlockSize = this.engine.getOutputBlockSize();
            byte[] bArr4 = new byte[outputBlockSize];
            System.arraycopy(bArrProcessBlock, 0, bArr4, outputBlockSize - bArrProcessBlock.length, bArrProcessBlock.length);
            bArrProcessBlock = bArr4;
        }
        int length = bArrProcessBlock.length;
        byte[] bArr5 = this.defHash;
        if (length < (bArr5.length * 2) + 1) {
            dql.m113082a("data too short");
            return null;
        }
        byte[] bArrMaskGeneratorFunction1 = maskGeneratorFunction1(bArrProcessBlock, bArr5.length, bArrProcessBlock.length - bArr5.length, bArr5.length);
        int i3 = 0;
        while (true) {
            bArr2 = this.defHash;
            if (i3 == bArr2.length) {
                break;
            }
            bArrProcessBlock[i3] = (byte) (bArrProcessBlock[i3] ^ bArrMaskGeneratorFunction1[i3]);
            i3++;
        }
        byte[] bArrMaskGeneratorFunction2 = maskGeneratorFunction1(bArrProcessBlock, 0, bArr2.length, bArrProcessBlock.length - bArr2.length);
        for (int length2 = this.defHash.length; length2 != bArrProcessBlock.length; length2++) {
            bArrProcessBlock[length2] = (byte) (bArrProcessBlock[length2] ^ bArrMaskGeneratorFunction2[length2 - this.defHash.length]);
        }
        int i4 = 0;
        boolean z = false;
        while (true) {
            bArr3 = this.defHash;
            if (i4 == bArr3.length) {
                break;
            }
            if (bArr3[i4] != bArrProcessBlock[bArr3.length + i4]) {
                z = true;
            }
            i4++;
        }
        if (z) {
            dql.m113082a("data hash wrong");
            return null;
        }
        int length3 = bArr3.length * 2;
        while (length3 != bArrProcessBlock.length && bArrProcessBlock[length3] == 0) {
            length3++;
        }
        if (length3 >= bArrProcessBlock.length - 1 || bArrProcessBlock[length3] != 1) {
            throw new InvalidCipherTextException("data start wrong " + length3);
        }
        int i5 = length3 + 1;
        int length4 = bArrProcessBlock.length - i5;
        byte[] bArr6 = new byte[length4];
        System.arraycopy(bArrProcessBlock, i5, bArr6, 0, length4);
        return bArr6;
    }

    public byte[] encodeBlock(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        int inputBlockSize = getInputBlockSize() + 1 + (this.defHash.length * 2);
        byte[] bArr2 = new byte[inputBlockSize];
        int i3 = inputBlockSize - i2;
        System.arraycopy(bArr, i, bArr2, i3, i2);
        bArr2[i3 - 1] = 1;
        byte[] bArr3 = this.defHash;
        System.arraycopy(bArr3, 0, bArr2, bArr3.length, bArr3.length);
        int length = this.defHash.length;
        byte[] bArr4 = new byte[length];
        this.random.nextBytes(bArr4);
        byte[] bArrMaskGeneratorFunction1 = maskGeneratorFunction1(bArr4, 0, length, inputBlockSize - this.defHash.length);
        for (int length2 = this.defHash.length; length2 != inputBlockSize; length2++) {
            bArr2[length2] = (byte) (bArr2[length2] ^ bArrMaskGeneratorFunction1[length2 - this.defHash.length]);
        }
        System.arraycopy(bArr4, 0, bArr2, 0, this.defHash.length);
        byte[] bArr5 = this.defHash;
        byte[] bArrMaskGeneratorFunction2 = maskGeneratorFunction1(bArr2, bArr5.length, inputBlockSize - bArr5.length, bArr5.length);
        for (int i4 = 0; i4 != this.defHash.length; i4++) {
            bArr2[i4] = (byte) (bArr2[i4] ^ bArrMaskGeneratorFunction2[i4]);
        }
        return this.engine.processBlock(bArr2, 0, inputBlockSize);
    }

    @Override // org.spongycastle.crypto.AsymmetricBlockCipher
    public int getInputBlockSize() {
        int inputBlockSize = this.engine.getInputBlockSize();
        return this.forEncryption ? (inputBlockSize - 1) - (this.defHash.length * 2) : inputBlockSize;
    }

    @Override // org.spongycastle.crypto.AsymmetricBlockCipher
    public int getOutputBlockSize() {
        int outputBlockSize = this.engine.getOutputBlockSize();
        return this.forEncryption ? outputBlockSize : (outputBlockSize - 1) - (this.defHash.length * 2);
    }

    public AsymmetricBlockCipher getUnderlyingCipher() {
        return this.engine;
    }

    @Override // org.spongycastle.crypto.AsymmetricBlockCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        if (cipherParameters instanceof ParametersWithRandom) {
            this.random = ((ParametersWithRandom) cipherParameters).getRandom();
        } else {
            this.random = new SecureRandom();
        }
        this.engine.init(z, cipherParameters);
        this.forEncryption = z;
    }

    @Override // org.spongycastle.crypto.AsymmetricBlockCipher
    public byte[] processBlock(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        return this.forEncryption ? encodeBlock(bArr, i, i2) : decodeBlock(bArr, i, i2);
    }

    public OAEPEncoding(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest) {
        this(asymmetricBlockCipher, digest, null);
    }

    public OAEPEncoding(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, byte[] bArr) {
        this(asymmetricBlockCipher, digest, digest, bArr);
    }

    public OAEPEncoding(AsymmetricBlockCipher asymmetricBlockCipher) {
        this(asymmetricBlockCipher, new SHA1Digest(), null);
    }
}
