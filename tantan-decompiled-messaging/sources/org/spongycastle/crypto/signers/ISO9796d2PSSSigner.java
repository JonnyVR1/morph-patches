package org.spongycastle.crypto.signers;

import java.security.SecureRandom;
import org.spongycastle.crypto.AsymmetricBlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.CryptoException;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.SignerWithRecovery;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.crypto.params.ParametersWithSalt;
import org.spongycastle.crypto.params.RSAKeyParameters;
import org.spongycastle.util.Arrays;
import p149l.f3c;
import p149l.ig3;
import p149l.kg3;
import p149l.qkq0;

/* JADX INFO: loaded from: classes3.dex */
public class ISO9796d2PSSSigner implements SignerWithRecovery {
    public static final int TRAILER_IMPLICIT = 188;
    public static final int TRAILER_RIPEMD128 = 13004;
    public static final int TRAILER_RIPEMD160 = 12748;
    public static final int TRAILER_SHA1 = 13260;
    public static final int TRAILER_SHA256 = 13516;
    public static final int TRAILER_SHA384 = 14028;
    public static final int TRAILER_SHA512 = 13772;
    public static final int TRAILER_WHIRLPOOL = 14284;
    private byte[] block;
    private AsymmetricBlockCipher cipher;
    private Digest digest;
    private boolean fullMessage;
    private int hLen;
    private int keyBits;
    private byte[] mBuf;
    private int messageLength;
    private byte[] preBlock;
    private int preMStart;
    private byte[] preSig;
    private int preTLength;
    private SecureRandom random;
    private byte[] recoveredMessage;
    private int saltLength;
    private byte[] standardSalt;
    private int trailer;

    public ISO9796d2PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, int i, boolean z) {
        this.cipher = asymmetricBlockCipher;
        this.digest = digest;
        this.hLen = digest.getDigestSize();
        this.saltLength = i;
        if (z) {
            this.trailer = 188;
            return;
        }
        Integer trailer = ISOTrailers.getTrailer(digest);
        if (trailer != null) {
            this.trailer = trailer.intValue();
        } else {
            kg3.m145878a("no valid trailer for digest: ", digest.getAlgorithmName());
            throw null;
        }
    }

    private void ItoOSP(int i, byte[] bArr) {
        bArr[0] = (byte) (i >>> 24);
        bArr[1] = (byte) (i >>> 16);
        bArr[2] = (byte) (i >>> 8);
        bArr[3] = (byte) i;
    }

    private void LtoOSP(long j, byte[] bArr) {
        bArr[0] = (byte) (j >>> 56);
        bArr[1] = (byte) (j >>> 48);
        bArr[2] = (byte) (j >>> 40);
        bArr[3] = (byte) (j >>> 32);
        bArr[4] = (byte) (j >>> 24);
        bArr[5] = (byte) (j >>> 16);
        bArr[6] = (byte) (j >>> 8);
        bArr[7] = (byte) j;
    }

    private void clearBlock(byte[] bArr) {
        for (int i = 0; i != bArr.length; i++) {
            bArr[i] = 0;
        }
    }

    private boolean isSameAs(byte[] bArr, byte[] bArr2) {
        boolean z = this.messageLength == bArr2.length;
        for (int i = 0; i != bArr2.length; i++) {
            if (bArr[i] != bArr2[i]) {
                z = false;
            }
        }
        return z;
    }

    private byte[] maskGeneratorFunction1(byte[] bArr, int i, int i2, int i3) {
        int i4;
        byte[] bArr2 = new byte[i3];
        byte[] bArr3 = new byte[this.hLen];
        byte[] bArr4 = new byte[4];
        this.digest.reset();
        int i5 = 0;
        while (true) {
            i4 = this.hLen;
            if (i5 >= i3 / i4) {
                break;
            }
            ItoOSP(i5, bArr4);
            this.digest.update(bArr, i, i2);
            this.digest.update(bArr4, 0, 4);
            this.digest.doFinal(bArr3, 0);
            int i6 = this.hLen;
            System.arraycopy(bArr3, 0, bArr2, i5 * i6, i6);
            i5++;
        }
        if (i4 * i5 < i3) {
            ItoOSP(i5, bArr4);
            this.digest.update(bArr, i, i2);
            this.digest.update(bArr4, 0, 4);
            this.digest.doFinal(bArr3, 0);
            int i7 = this.hLen;
            System.arraycopy(bArr3, 0, bArr2, i5 * i7, i3 - (i5 * i7));
        }
        return bArr2;
    }

    @Override // org.spongycastle.crypto.Signer
    public byte[] generateSignature() throws CryptoException {
        byte[] bArr;
        int digestSize = this.digest.getDigestSize();
        byte[] bArr2 = new byte[digestSize];
        this.digest.doFinal(bArr2, 0);
        byte[] bArr3 = new byte[8];
        LtoOSP(this.messageLength * 8, bArr3);
        this.digest.update(bArr3, 0, 8);
        this.digest.update(this.mBuf, 0, this.messageLength);
        this.digest.update(bArr2, 0, digestSize);
        byte[] bArr4 = this.standardSalt;
        if (bArr4 == null) {
            bArr4 = new byte[this.saltLength];
            this.random.nextBytes(bArr4);
        }
        this.digest.update(bArr4, 0, bArr4.length);
        int digestSize2 = this.digest.getDigestSize();
        byte[] bArr5 = new byte[digestSize2];
        this.digest.doFinal(bArr5, 0);
        int i = this.trailer == 188 ? 1 : 2;
        byte[] bArr6 = this.block;
        int length = bArr6.length;
        int i2 = this.messageLength;
        int length2 = (((length - i2) - bArr4.length) - this.hLen) - i;
        bArr6[length2 - 1] = 1;
        System.arraycopy(this.mBuf, 0, bArr6, length2, i2);
        System.arraycopy(bArr4, 0, this.block, length2 + this.messageLength, bArr4.length);
        byte[] bArrMaskGeneratorFunction1 = maskGeneratorFunction1(bArr5, 0, digestSize2, (this.block.length - this.hLen) - i);
        int i3 = 0;
        while (true) {
            int length3 = bArrMaskGeneratorFunction1.length;
            bArr = this.block;
            if (i3 == length3) {
                break;
            }
            bArr[i3] = (byte) (bArr[i3] ^ bArrMaskGeneratorFunction1[i3]);
            i3++;
        }
        int length4 = bArr.length;
        int i4 = this.hLen;
        System.arraycopy(bArr5, 0, bArr, (length4 - i4) - i, i4);
        int i5 = this.trailer;
        byte[] bArr7 = this.block;
        if (i5 == 188) {
            bArr7[bArr7.length - 1] = PSSSigner.TRAILER_IMPLICIT;
        } else {
            bArr7[bArr7.length - 2] = (byte) (i5 >>> 8);
            bArr7[bArr7.length - 1] = (byte) i5;
        }
        byte[] bArr8 = this.block;
        bArr8[0] = (byte) (bArr8[0] & 127);
        byte[] bArrProcessBlock = this.cipher.processBlock(bArr8, 0, bArr8.length);
        int i6 = this.messageLength;
        byte[] bArr9 = new byte[i6];
        this.recoveredMessage = bArr9;
        byte[] bArr10 = this.mBuf;
        this.fullMessage = i6 <= bArr10.length;
        System.arraycopy(bArr10, 0, bArr9, 0, bArr9.length);
        clearBlock(this.mBuf);
        clearBlock(this.block);
        this.messageLength = 0;
        return bArrProcessBlock;
    }

    @Override // org.spongycastle.crypto.SignerWithRecovery
    public byte[] getRecoveredMessage() {
        return this.recoveredMessage;
    }

    @Override // org.spongycastle.crypto.SignerWithRecovery
    public boolean hasFullMessage() {
        return this.fullMessage;
    }

    @Override // org.spongycastle.crypto.Signer
    public void init(boolean z, CipherParameters cipherParameters) {
        RSAKeyParameters rSAKeyParameters;
        int length = this.saltLength;
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            rSAKeyParameters = (RSAKeyParameters) parametersWithRandom.getParameters();
            if (z) {
                this.random = parametersWithRandom.getRandom();
            }
        } else if (cipherParameters instanceof ParametersWithSalt) {
            ParametersWithSalt parametersWithSalt = (ParametersWithSalt) cipherParameters;
            rSAKeyParameters = (RSAKeyParameters) parametersWithSalt.getParameters();
            byte[] salt = parametersWithSalt.getSalt();
            this.standardSalt = salt;
            length = salt.length;
            if (salt.length != this.saltLength) {
                ig3.m135964a("Fixed salt is of wrong length");
                return;
            }
        } else {
            rSAKeyParameters = (RSAKeyParameters) cipherParameters;
            if (z) {
                this.random = new SecureRandom();
            }
        }
        this.cipher.init(z, rSAKeyParameters);
        int iBitLength = rSAKeyParameters.getModulus().bitLength();
        this.keyBits = iBitLength;
        byte[] bArr = new byte[(iBitLength + 7) / 8];
        this.block = bArr;
        int i = this.trailer;
        Digest digest = this.digest;
        if (i == 188) {
            this.mBuf = new byte[((bArr.length - digest.getDigestSize()) - length) - 2];
        } else {
            this.mBuf = new byte[((bArr.length - digest.getDigestSize()) - length) - 3];
        }
        reset();
    }

    @Override // org.spongycastle.crypto.Signer
    public void reset() {
        this.digest.reset();
        this.messageLength = 0;
        byte[] bArr = this.mBuf;
        if (bArr != null) {
            clearBlock(bArr);
        }
        byte[] bArr2 = this.recoveredMessage;
        if (bArr2 != null) {
            clearBlock(bArr2);
            this.recoveredMessage = null;
        }
        this.fullMessage = false;
        if (this.preSig != null) {
            this.preSig = null;
            clearBlock(this.preBlock);
            this.preBlock = null;
        }
    }

    @Override // org.spongycastle.crypto.Signer
    public void update(byte[] bArr, int i, int i2) {
        if (this.preSig == null) {
            while (i2 > 0 && this.messageLength < this.mBuf.length) {
                update(bArr[i]);
                i++;
                i2--;
            }
        }
        if (i2 > 0) {
            this.digest.update(bArr, i, i2);
        }
    }

    @Override // org.spongycastle.crypto.SignerWithRecovery
    public void updateWithRecoveredMessage(byte[] bArr) throws InvalidCipherTextException {
        int i;
        byte[] bArrProcessBlock = this.cipher.processBlock(bArr, 0, bArr.length);
        int length = bArrProcessBlock.length;
        int i2 = this.keyBits;
        if (length < (i2 + 7) / 8) {
            int i3 = (i2 + 7) / 8;
            byte[] bArr2 = new byte[i3];
            System.arraycopy(bArrProcessBlock, 0, bArr2, i3 - bArrProcessBlock.length, bArrProcessBlock.length);
            clearBlock(bArrProcessBlock);
            bArrProcessBlock = bArr2;
        }
        if (((bArrProcessBlock[bArrProcessBlock.length - 1] & 255) ^ 188) == 0) {
            i = 1;
        } else {
            i = 2;
            int i4 = ((bArrProcessBlock[bArrProcessBlock.length - 2] & 255) << 8) | (bArrProcessBlock[bArrProcessBlock.length - 1] & 255);
            Integer trailer = ISOTrailers.getTrailer(this.digest);
            if (trailer == null) {
                ig3.m135964a("unrecognised hash in signature");
                return;
            } else if (i4 != trailer.intValue()) {
                f3c.m119257a("signer initialised with wrong digest for trailer ", i4);
                return;
            }
        }
        this.digest.doFinal(new byte[this.hLen], 0);
        int length2 = bArrProcessBlock.length;
        int i5 = this.hLen;
        byte[] bArrMaskGeneratorFunction1 = maskGeneratorFunction1(bArrProcessBlock, (length2 - i5) - i, i5, (bArrProcessBlock.length - i5) - i);
        for (int i6 = 0; i6 != bArrMaskGeneratorFunction1.length; i6++) {
            bArrProcessBlock[i6] = (byte) (bArrProcessBlock[i6] ^ bArrMaskGeneratorFunction1[i6]);
        }
        bArrProcessBlock[0] = (byte) (bArrProcessBlock[0] & 127);
        int i7 = 0;
        while (i7 != bArrProcessBlock.length && bArrProcessBlock[i7] != 1) {
            i7++;
        }
        int i8 = i7 + 1;
        if (i8 >= bArrProcessBlock.length) {
            clearBlock(bArrProcessBlock);
        }
        this.fullMessage = i8 > 1;
        byte[] bArr3 = new byte[(bArrMaskGeneratorFunction1.length - i8) - this.saltLength];
        this.recoveredMessage = bArr3;
        System.arraycopy(bArrProcessBlock, i8, bArr3, 0, bArr3.length);
        byte[] bArr4 = this.recoveredMessage;
        System.arraycopy(bArr4, 0, this.mBuf, 0, bArr4.length);
        this.preSig = bArr;
        this.preBlock = bArrProcessBlock;
        this.preMStart = i8;
        this.preTLength = i;
    }

    @Override // org.spongycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        int i = this.hLen;
        byte[] bArr2 = new byte[i];
        this.digest.doFinal(bArr2, 0);
        byte[] bArr3 = this.preSig;
        if (bArr3 == null) {
            try {
                updateWithRecoveredMessage(bArr);
            } catch (Exception unused) {
                return false;
            }
        } else if (!Arrays.areEqual(bArr3, bArr)) {
            qkq0.m175383a("updateWithRecoveredMessage called on different signature");
            return false;
        }
        byte[] bArr4 = this.preBlock;
        int i2 = this.preMStart;
        int i3 = this.preTLength;
        this.preSig = null;
        this.preBlock = null;
        byte[] bArr5 = new byte[8];
        LtoOSP(this.recoveredMessage.length * 8, bArr5);
        this.digest.update(bArr5, 0, 8);
        byte[] bArr6 = this.recoveredMessage;
        if (bArr6.length != 0) {
            this.digest.update(bArr6, 0, bArr6.length);
        }
        this.digest.update(bArr2, 0, i);
        byte[] bArr7 = this.standardSalt;
        Digest digest = this.digest;
        if (bArr7 != null) {
            digest.update(bArr7, 0, bArr7.length);
        } else {
            digest.update(bArr4, i2 + this.recoveredMessage.length, this.saltLength);
        }
        int digestSize = this.digest.getDigestSize();
        byte[] bArr8 = new byte[digestSize];
        this.digest.doFinal(bArr8, 0);
        int length = (bArr4.length - i3) - digestSize;
        boolean z = true;
        for (int i4 = 0; i4 != digestSize; i4++) {
            if (bArr8[i4] != bArr4[length + i4]) {
                z = false;
            }
        }
        clearBlock(bArr4);
        clearBlock(bArr8);
        if (!z) {
            this.fullMessage = false;
            clearBlock(this.recoveredMessage);
            return false;
        }
        if (this.messageLength != 0) {
            if (!isSameAs(this.mBuf, this.recoveredMessage)) {
                clearBlock(this.mBuf);
                return false;
            }
            this.messageLength = 0;
        }
        clearBlock(this.mBuf);
        return true;
    }

    @Override // org.spongycastle.crypto.Signer
    public void update(byte b) {
        if (this.preSig == null) {
            int i = this.messageLength;
            byte[] bArr = this.mBuf;
            if (i < bArr.length) {
                this.messageLength = i + 1;
                bArr[i] = b;
                return;
            }
        }
        this.digest.update(b);
    }

    public ISO9796d2PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, int i) {
        this(asymmetricBlockCipher, digest, i, false);
    }
}
