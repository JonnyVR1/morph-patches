package org.spongycastle.crypto.signers;

import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.crypto.AsymmetricBlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.CryptoException;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.SignerWithRecovery;
import org.spongycastle.crypto.params.RSAKeyParameters;
import org.spongycastle.util.Arrays;
import p153l.o4c;
import p153l.psl;
import p153l.wg3;
import p153l.wtq0;
import p153l.yg3;

/* JADX INFO: loaded from: classes3.dex */
public class ISO9796d2Signer implements SignerWithRecovery {
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
    private int keyBits;
    private byte[] mBuf;
    private int messageLength;
    private byte[] preBlock;
    private byte[] preSig;
    private byte[] recoveredMessage;
    private int trailer;

    public ISO9796d2Signer(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, boolean z) {
        this.cipher = asymmetricBlockCipher;
        this.digest = digest;
        if (z) {
            this.trailer = 188;
            return;
        }
        Integer trailer = ISOTrailers.getTrailer(digest);
        if (trailer != null) {
            this.trailer = trailer.intValue();
        } else {
            yg3.m215829a("no valid trailer for digest: ", digest.getAlgorithmName());
            throw null;
        }
    }

    private void clearBlock(byte[] bArr) {
        for (int i = 0; i != bArr.length; i++) {
            bArr[i] = 0;
        }
    }

    private boolean isSameAs(byte[] bArr, byte[] bArr2) {
        boolean z;
        int i = this.messageLength;
        byte[] bArr3 = this.mBuf;
        if (i > bArr3.length) {
            z = bArr3.length <= bArr2.length;
            for (int i2 = 0; i2 != this.mBuf.length; i2++) {
                if (bArr[i2] != bArr2[i2]) {
                    z = false;
                }
            }
            return z;
        }
        z = i == bArr2.length;
        for (int i3 = 0; i3 != bArr2.length; i3++) {
            if (bArr[i3] != bArr2[i3]) {
                z = false;
            }
        }
        return z;
    }

    private boolean returnFalse(byte[] bArr) {
        clearBlock(this.mBuf);
        clearBlock(bArr);
        return false;
    }

    @Override // org.spongycastle.crypto.Signer
    public byte[] generateSignature() throws CryptoException {
        int length;
        int i;
        int i2;
        int i3;
        byte[] bArr;
        int digestSize = this.digest.getDigestSize();
        int i4 = this.trailer;
        byte[] bArr2 = this.block;
        if (i4 == 188) {
            length = (bArr2.length - digestSize) - 1;
            this.digest.doFinal(bArr2, length);
            byte[] bArr3 = this.block;
            bArr3[bArr3.length - 1] = PSSSigner.TRAILER_IMPLICIT;
            i = 8;
        } else {
            length = (bArr2.length - digestSize) - 2;
            this.digest.doFinal(bArr2, length);
            byte[] bArr4 = this.block;
            int length2 = bArr4.length - 2;
            int i5 = this.trailer;
            bArr4[length2] = (byte) (i5 >>> 8);
            bArr4[bArr4.length - 1] = (byte) i5;
            i = 16;
        }
        int i6 = this.messageLength;
        int i7 = ((((digestSize + i6) * 8) + i) + 4) - this.keyBits;
        byte[] bArr5 = this.mBuf;
        if (i7 > 0) {
            int i8 = i6 - ((i7 + 7) / 8);
            i2 = length - i8;
            System.arraycopy(bArr5, 0, this.block, i2, i8);
            this.recoveredMessage = new byte[i8];
            i3 = 96;
        } else {
            i2 = length - i6;
            System.arraycopy(bArr5, 0, this.block, i2, i6);
            this.recoveredMessage = new byte[this.messageLength];
            i3 = 64;
        }
        int i9 = i2 - 1;
        if (i9 > 0) {
            int i10 = i9;
            while (true) {
                bArr = this.block;
                if (i10 == 0) {
                    break;
                }
                bArr[i10] = -69;
                i10--;
            }
            bArr[i9] = (byte) (bArr[i9] ^ 1);
            bArr[0] = 11;
            bArr[0] = (byte) (11 | i3);
        } else {
            byte[] bArr6 = this.block;
            bArr6[0] = 10;
            bArr6[0] = (byte) (10 | i3);
        }
        AsymmetricBlockCipher asymmetricBlockCipher = this.cipher;
        byte[] bArr7 = this.block;
        byte[] bArrProcessBlock = asymmetricBlockCipher.processBlock(bArr7, 0, bArr7.length);
        this.fullMessage = (i3 & 32) == 0;
        byte[] bArr8 = this.mBuf;
        byte[] bArr9 = this.recoveredMessage;
        System.arraycopy(bArr8, 0, bArr9, 0, bArr9.length);
        clearBlock(this.mBuf);
        clearBlock(this.block);
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
        RSAKeyParameters rSAKeyParameters = (RSAKeyParameters) cipherParameters;
        this.cipher.init(z, rSAKeyParameters);
        int iBitLength = rSAKeyParameters.getModulus().bitLength();
        this.keyBits = iBitLength;
        byte[] bArr = new byte[(iBitLength + 7) / 8];
        this.block = bArr;
        int i = this.trailer;
        Digest digest = this.digest;
        if (i == 188) {
            this.mBuf = new byte[(bArr.length - digest.getDigestSize()) - 2];
        } else {
            this.mBuf = new byte[(bArr.length - digest.getDigestSize()) - 3];
        }
        reset();
    }

    @Override // org.spongycastle.crypto.Signer
    public void reset() {
        this.digest.reset();
        this.messageLength = 0;
        clearBlock(this.mBuf);
        byte[] bArr = this.recoveredMessage;
        if (bArr != null) {
            clearBlock(bArr);
        }
        this.recoveredMessage = null;
        this.fullMessage = false;
        if (this.preSig != null) {
            this.preSig = null;
            clearBlock(this.preBlock);
            this.preBlock = null;
        }
    }

    @Override // org.spongycastle.crypto.Signer
    public void update(byte[] bArr, int i, int i2) {
        while (i2 > 0 && this.messageLength < this.mBuf.length) {
            update(bArr[i]);
            i++;
            i2--;
        }
        this.digest.update(bArr, i, i2);
        this.messageLength += i2;
    }

    @Override // org.spongycastle.crypto.SignerWithRecovery
    public void updateWithRecoveredMessage(byte[] bArr) throws InvalidCipherTextException {
        int i;
        byte[] bArrProcessBlock = this.cipher.processBlock(bArr, 0, bArr.length);
        if (((bArrProcessBlock[0] & 192) ^ 64) != 0) {
            psl.m173659a("malformed signature");
            return;
        }
        if (((bArrProcessBlock[bArrProcessBlock.length - 1] & 15) ^ 12) != 0) {
            psl.m173659a("malformed signature");
            return;
        }
        if (((bArrProcessBlock[bArrProcessBlock.length - 1] & 255) ^ 188) == 0) {
            i = 1;
        } else {
            i = 2;
            int i2 = ((bArrProcessBlock[bArrProcessBlock.length - 2] & 255) << 8) | (bArrProcessBlock[bArrProcessBlock.length - 1] & 255);
            Integer trailer = ISOTrailers.getTrailer(this.digest);
            if (trailer == null) {
                wg3.m206174a("unrecognised hash in signature");
                return;
            } else if (i2 != trailer.intValue()) {
                o4c.m165980a("signer initialised with wrong digest for trailer ", i2);
                return;
            }
        }
        int i3 = 0;
        while (i3 != bArrProcessBlock.length && ((bArrProcessBlock[i3] & 15) ^ 10) != 0) {
            i3++;
        }
        int i4 = i3 + 1;
        int length = ((bArrProcessBlock.length - i) - this.digest.getDigestSize()) - i4;
        if (length <= 0) {
            psl.m173659a("malformed block");
            return;
        }
        if ((bArrProcessBlock[0] & HttpTokens.SPACE) == 0) {
            this.fullMessage = true;
            byte[] bArr2 = new byte[length];
            this.recoveredMessage = bArr2;
            System.arraycopy(bArrProcessBlock, i4, bArr2, 0, bArr2.length);
        } else {
            this.fullMessage = false;
            byte[] bArr3 = new byte[length];
            this.recoveredMessage = bArr3;
            System.arraycopy(bArrProcessBlock, i4, bArr3, 0, bArr3.length);
        }
        this.preSig = bArr;
        this.preBlock = bArrProcessBlock;
        Digest digest = this.digest;
        byte[] bArr4 = this.recoveredMessage;
        digest.update(bArr4, 0, bArr4.length);
        byte[] bArr5 = this.recoveredMessage;
        this.messageLength = bArr5.length;
        System.arraycopy(bArr5, 0, this.mBuf, 0, bArr5.length);
    }

    @Override // org.spongycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        byte[] bArrProcessBlock;
        int i;
        byte[] bArr2 = this.preSig;
        if (bArr2 == null) {
            try {
                bArrProcessBlock = this.cipher.processBlock(bArr, 0, bArr.length);
            } catch (Exception unused) {
                return false;
            }
        } else {
            if (!Arrays.areEqual(bArr2, bArr)) {
                wtq0.m207906a("updateWithRecoveredMessage called on different signature");
                return false;
            }
            bArrProcessBlock = this.preBlock;
            this.preSig = null;
            this.preBlock = null;
        }
        if (((bArrProcessBlock[0] & 192) ^ 64) != 0) {
            return returnFalse(bArrProcessBlock);
        }
        if (((bArrProcessBlock[bArrProcessBlock.length - 1] & 15) ^ 12) != 0) {
            return returnFalse(bArrProcessBlock);
        }
        if (((bArrProcessBlock[bArrProcessBlock.length - 1] & 255) ^ 188) == 0) {
            i = 1;
        } else {
            i = 2;
            int i2 = ((bArrProcessBlock[bArrProcessBlock.length - 2] & 255) << 8) | (bArrProcessBlock[bArrProcessBlock.length - 1] & 255);
            Integer trailer = ISOTrailers.getTrailer(this.digest);
            if (trailer == null) {
                wg3.m206174a("unrecognised hash in signature");
                return false;
            }
            if (i2 != trailer.intValue()) {
                o4c.m165980a("signer initialised with wrong digest for trailer ", i2);
                return false;
            }
        }
        int i3 = 0;
        while (i3 != bArrProcessBlock.length && ((bArrProcessBlock[i3] & 15) ^ 10) != 0) {
            i3++;
        }
        int i4 = i3 + 1;
        int digestSize = this.digest.getDigestSize();
        byte[] bArr3 = new byte[digestSize];
        int length = (bArrProcessBlock.length - i) - digestSize;
        int i5 = length - i4;
        if (i5 <= 0) {
            return returnFalse(bArrProcessBlock);
        }
        if ((bArrProcessBlock[0] & HttpTokens.SPACE) == 0) {
            this.fullMessage = true;
            if (this.messageLength > i5) {
                return returnFalse(bArrProcessBlock);
            }
            this.digest.reset();
            this.digest.update(bArrProcessBlock, i4, i5);
            this.digest.doFinal(bArr3, 0);
            boolean z = true;
            for (int i6 = 0; i6 != digestSize; i6++) {
                int i7 = length + i6;
                byte b = (byte) (bArrProcessBlock[i7] ^ bArr3[i6]);
                bArrProcessBlock[i7] = b;
                if (b != 0) {
                    z = false;
                }
            }
            if (!z) {
                return returnFalse(bArrProcessBlock);
            }
            byte[] bArr4 = new byte[i5];
            this.recoveredMessage = bArr4;
            System.arraycopy(bArrProcessBlock, i4, bArr4, 0, bArr4.length);
        } else {
            this.fullMessage = false;
            this.digest.doFinal(bArr3, 0);
            boolean z2 = true;
            for (int i8 = 0; i8 != digestSize; i8++) {
                int i9 = length + i8;
                byte b2 = (byte) (bArrProcessBlock[i9] ^ bArr3[i8]);
                bArrProcessBlock[i9] = b2;
                if (b2 != 0) {
                    z2 = false;
                }
            }
            if (!z2) {
                return returnFalse(bArrProcessBlock);
            }
            byte[] bArr5 = new byte[i5];
            this.recoveredMessage = bArr5;
            System.arraycopy(bArrProcessBlock, i4, bArr5, 0, bArr5.length);
        }
        if (this.messageLength != 0 && !isSameAs(this.mBuf, this.recoveredMessage)) {
            return returnFalse(bArrProcessBlock);
        }
        clearBlock(this.mBuf);
        clearBlock(bArrProcessBlock);
        return true;
    }

    @Override // org.spongycastle.crypto.Signer
    public void update(byte b) {
        this.digest.update(b);
        int i = this.messageLength;
        byte[] bArr = this.mBuf;
        if (i < bArr.length) {
            bArr[i] = b;
        }
        this.messageLength = i + 1;
    }

    public ISO9796d2Signer(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest) {
        this(asymmetricBlockCipher, digest, false);
    }
}
