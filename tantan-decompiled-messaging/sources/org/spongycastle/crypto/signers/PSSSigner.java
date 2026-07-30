package org.spongycastle.crypto.signers;

import java.security.SecureRandom;
import org.spongycastle.crypto.AsymmetricBlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.CryptoException;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.Signer;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.crypto.params.RSABlindingParameters;
import org.spongycastle.crypto.params.RSAKeyParameters;
import p149l.ig3;

/* JADX INFO: loaded from: classes3.dex */
public class PSSSigner implements Signer {
    public static final byte TRAILER_IMPLICIT = -68;
    private byte[] block;
    private AsymmetricBlockCipher cipher;
    private Digest contentDigest;
    private int emBits;
    private int hLen;
    private byte[] mDash;
    private Digest mgfDigest;
    private int mgfhLen;
    private SecureRandom random;
    private int sLen;
    private boolean sSet;
    private byte[] salt;
    private byte trailer;

    public PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, Digest digest2, int i, byte b) {
        this.cipher = asymmetricBlockCipher;
        this.contentDigest = digest;
        this.mgfDigest = digest2;
        this.hLen = digest.getDigestSize();
        this.mgfhLen = digest2.getDigestSize();
        this.sSet = false;
        this.sLen = i;
        this.salt = new byte[i];
        this.mDash = new byte[i + 8 + this.hLen];
        this.trailer = b;
    }

    private void ItoOSP(int i, byte[] bArr) {
        bArr[0] = (byte) (i >>> 24);
        bArr[1] = (byte) (i >>> 16);
        bArr[2] = (byte) (i >>> 8);
        bArr[3] = (byte) i;
    }

    private void clearBlock(byte[] bArr) {
        for (int i = 0; i != bArr.length; i++) {
            bArr[i] = 0;
        }
    }

    private byte[] maskGeneratorFunction1(byte[] bArr, int i, int i2, int i3) {
        int i4;
        byte[] bArr2 = new byte[i3];
        byte[] bArr3 = new byte[this.mgfhLen];
        byte[] bArr4 = new byte[4];
        this.mgfDigest.reset();
        int i5 = 0;
        while (true) {
            i4 = this.mgfhLen;
            if (i5 >= i3 / i4) {
                break;
            }
            ItoOSP(i5, bArr4);
            this.mgfDigest.update(bArr, i, i2);
            this.mgfDigest.update(bArr4, 0, 4);
            this.mgfDigest.doFinal(bArr3, 0);
            int i6 = this.mgfhLen;
            System.arraycopy(bArr3, 0, bArr2, i5 * i6, i6);
            i5++;
        }
        if (i4 * i5 < i3) {
            ItoOSP(i5, bArr4);
            this.mgfDigest.update(bArr, i, i2);
            this.mgfDigest.update(bArr4, 0, 4);
            this.mgfDigest.doFinal(bArr3, 0);
            int i7 = this.mgfhLen;
            System.arraycopy(bArr3, 0, bArr2, i5 * i7, i3 - (i5 * i7));
        }
        return bArr2;
    }

    @Override // org.spongycastle.crypto.Signer
    public byte[] generateSignature() throws DataLengthException, CryptoException {
        Digest digest = this.contentDigest;
        byte[] bArr = this.mDash;
        digest.doFinal(bArr, (bArr.length - this.hLen) - this.sLen);
        if (this.sLen != 0) {
            if (!this.sSet) {
                this.random.nextBytes(this.salt);
            }
            byte[] bArr2 = this.salt;
            byte[] bArr3 = this.mDash;
            int length = bArr3.length;
            int i = this.sLen;
            System.arraycopy(bArr2, 0, bArr3, length - i, i);
        }
        int i2 = this.hLen;
        byte[] bArr4 = new byte[i2];
        Digest digest2 = this.contentDigest;
        byte[] bArr5 = this.mDash;
        digest2.update(bArr5, 0, bArr5.length);
        this.contentDigest.doFinal(bArr4, 0);
        byte[] bArr6 = this.block;
        int length2 = bArr6.length;
        int i3 = this.sLen;
        int i4 = this.hLen;
        bArr6[(((length2 - i3) - 1) - i4) - 1] = 1;
        System.arraycopy(this.salt, 0, bArr6, ((bArr6.length - i3) - i4) - 1, i3);
        byte[] bArrMaskGeneratorFunction1 = maskGeneratorFunction1(bArr4, 0, i2, (this.block.length - this.hLen) - 1);
        int i5 = 0;
        while (true) {
            int length3 = bArrMaskGeneratorFunction1.length;
            byte[] bArr7 = this.block;
            if (i5 == length3) {
                bArr7[0] = (byte) (bArr7[0] & (255 >> ((bArr7.length * 8) - this.emBits)));
                int length4 = bArr7.length;
                int i6 = this.hLen;
                System.arraycopy(bArr4, 0, bArr7, (length4 - i6) - 1, i6);
                byte[] bArr8 = this.block;
                bArr8[bArr8.length - 1] = this.trailer;
                byte[] bArrProcessBlock = this.cipher.processBlock(bArr8, 0, bArr8.length);
                clearBlock(this.block);
                return bArrProcessBlock;
            }
            bArr7[i5] = (byte) (bArr7[i5] ^ bArrMaskGeneratorFunction1[i5]);
            i5++;
        }
    }

    @Override // org.spongycastle.crypto.Signer
    public void init(boolean z, CipherParameters cipherParameters) {
        CipherParameters parameters;
        RSAKeyParameters publicKey;
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            parameters = parametersWithRandom.getParameters();
            this.random = parametersWithRandom.getRandom();
        } else {
            if (z) {
                this.random = new SecureRandom();
            }
            parameters = cipherParameters;
        }
        if (parameters instanceof RSABlindingParameters) {
            publicKey = ((RSABlindingParameters) parameters).getPublicKey();
            this.cipher.init(z, cipherParameters);
        } else {
            publicKey = (RSAKeyParameters) parameters;
            this.cipher.init(z, parameters);
        }
        int iBitLength = publicKey.getModulus().bitLength();
        int i = iBitLength - 1;
        this.emBits = i;
        if (i < (this.hLen * 8) + (this.sLen * 8) + 9) {
            ig3.m135964a("key too small for specified hash and salt lengths");
        } else {
            this.block = new byte[(iBitLength + 6) / 8];
            reset();
        }
    }

    @Override // org.spongycastle.crypto.Signer
    public void reset() {
        this.contentDigest.reset();
    }

    @Override // org.spongycastle.crypto.Signer
    public void update(byte b) {
        this.contentDigest.update(b);
    }

    @Override // org.spongycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        byte[] bArr2;
        Digest digest = this.contentDigest;
        byte[] bArr3 = this.mDash;
        digest.doFinal(bArr3, (bArr3.length - this.hLen) - this.sLen);
        try {
            byte[] bArrProcessBlock = this.cipher.processBlock(bArr, 0, bArr.length);
            byte[] bArr4 = this.block;
            System.arraycopy(bArrProcessBlock, 0, bArr4, bArr4.length - bArrProcessBlock.length, bArrProcessBlock.length);
            byte[] bArr5 = this.block;
            if (bArr5[bArr5.length - 1] != this.trailer) {
                clearBlock(bArr5);
                return false;
            }
            int length = bArr5.length;
            int i = this.hLen;
            byte[] bArrMaskGeneratorFunction1 = maskGeneratorFunction1(bArr5, (length - i) - 1, i, (bArr5.length - i) - 1);
            int i2 = 0;
            while (true) {
                int length2 = bArrMaskGeneratorFunction1.length;
                bArr2 = this.block;
                if (i2 == length2) {
                    break;
                }
                bArr2[i2] = (byte) (bArr2[i2] ^ bArrMaskGeneratorFunction1[i2]);
                i2++;
            }
            bArr2[0] = (byte) (bArr2[0] & (255 >> ((bArr2.length * 8) - this.emBits)));
            int i3 = 0;
            while (true) {
                byte[] bArr6 = this.block;
                int length3 = bArr6.length;
                int i4 = this.hLen;
                int i5 = this.sLen;
                if (i3 != ((length3 - i4) - i5) - 2) {
                    if (bArr6[i3] != 0) {
                        clearBlock(bArr6);
                        return false;
                    }
                    i3++;
                } else {
                    if (bArr6[((bArr6.length - i4) - i5) - 2] != 1) {
                        clearBlock(bArr6);
                        return false;
                    }
                    if (this.sSet) {
                        byte[] bArr7 = this.salt;
                        byte[] bArr8 = this.mDash;
                        System.arraycopy(bArr7, 0, bArr8, bArr8.length - i5, i5);
                    } else {
                        int length4 = ((bArr6.length - i5) - i4) - 1;
                        byte[] bArr9 = this.mDash;
                        System.arraycopy(bArr6, length4, bArr9, bArr9.length - i5, i5);
                    }
                    Digest digest2 = this.contentDigest;
                    byte[] bArr10 = this.mDash;
                    digest2.update(bArr10, 0, bArr10.length);
                    Digest digest3 = this.contentDigest;
                    byte[] bArr11 = this.mDash;
                    digest3.doFinal(bArr11, bArr11.length - this.hLen);
                    int length5 = this.block.length;
                    int i6 = this.hLen;
                    int i7 = (length5 - i6) - 1;
                    int length6 = this.mDash.length - i6;
                    while (true) {
                        byte[] bArr12 = this.mDash;
                        if (length6 == bArr12.length) {
                            clearBlock(bArr12);
                            clearBlock(this.block);
                            return true;
                        }
                        if ((this.block[i7] ^ bArr12[length6]) != 0) {
                            clearBlock(bArr12);
                            clearBlock(this.block);
                            return false;
                        }
                        i7++;
                        length6++;
                    }
                }
            }
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // org.spongycastle.crypto.Signer
    public void update(byte[] bArr, int i, int i2) {
        this.contentDigest.update(bArr, i, i2);
    }

    public PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, Digest digest2, int i) {
        this(asymmetricBlockCipher, digest, digest2, i, TRAILER_IMPLICIT);
    }

    public PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, int i, byte b) {
        this(asymmetricBlockCipher, digest, digest, i, b);
    }

    public PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, int i) {
        this(asymmetricBlockCipher, digest, i, TRAILER_IMPLICIT);
    }

    public PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, byte[] bArr) {
        this(asymmetricBlockCipher, digest, digest, bArr, TRAILER_IMPLICIT);
    }

    public PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, Digest digest2, byte[] bArr) {
        this(asymmetricBlockCipher, digest, digest2, bArr, TRAILER_IMPLICIT);
    }

    public PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, Digest digest2, byte[] bArr, byte b) {
        this.cipher = asymmetricBlockCipher;
        this.contentDigest = digest;
        this.mgfDigest = digest2;
        this.hLen = digest.getDigestSize();
        this.mgfhLen = digest2.getDigestSize();
        this.sSet = true;
        int length = bArr.length;
        this.sLen = length;
        this.salt = bArr;
        this.mDash = new byte[length + 8 + this.hLen];
        this.trailer = b;
    }
}
