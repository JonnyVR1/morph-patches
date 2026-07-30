package org.spongycastle.crypto.signers;

import java.math.BigInteger;
import org.spongycastle.crypto.AsymmetricBlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.CryptoException;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.Signer;
import org.spongycastle.crypto.params.RSAKeyParameters;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.BigIntegers;
import p153l.yg3;

/* JADX INFO: loaded from: classes3.dex */
public class X931Signer implements Signer {
    public static final int TRAILER_IMPLICIT = 188;
    public static final int TRAILER_RIPEMD128 = 13004;
    public static final int TRAILER_RIPEMD160 = 12748;
    public static final int TRAILER_SHA1 = 13260;
    public static final int TRAILER_SHA224 = 14540;
    public static final int TRAILER_SHA256 = 13516;
    public static final int TRAILER_SHA384 = 14028;
    public static final int TRAILER_SHA512 = 13772;
    public static final int TRAILER_WHIRLPOOL = 14284;
    private byte[] block;
    private AsymmetricBlockCipher cipher;
    private Digest digest;
    private RSAKeyParameters kParam;
    private int keyBits;
    private int trailer;

    public X931Signer(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, boolean z) {
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

    private void createSignatureBlock() {
        int length;
        int digestSize = this.digest.getDigestSize();
        int i = this.trailer;
        byte[] bArr = this.block;
        if (i == 188) {
            length = (bArr.length - digestSize) - 1;
            this.digest.doFinal(bArr, length);
            byte[] bArr2 = this.block;
            bArr2[bArr2.length - 1] = PSSSigner.TRAILER_IMPLICIT;
        } else {
            length = (bArr.length - digestSize) - 2;
            this.digest.doFinal(bArr, length);
            byte[] bArr3 = this.block;
            int length2 = bArr3.length - 2;
            int i2 = this.trailer;
            bArr3[length2] = (byte) (i2 >>> 8);
            bArr3[bArr3.length - 1] = (byte) i2;
        }
        this.block[0] = 107;
        int i3 = length - 2;
        while (true) {
            byte[] bArr4 = this.block;
            if (i3 == 0) {
                bArr4[length - 1] = -70;
                return;
            } else {
                bArr4[i3] = -69;
                i3--;
            }
        }
    }

    @Override // org.spongycastle.crypto.Signer
    public byte[] generateSignature() throws CryptoException {
        createSignatureBlock();
        AsymmetricBlockCipher asymmetricBlockCipher = this.cipher;
        byte[] bArr = this.block;
        BigInteger bigInteger = new BigInteger(1, asymmetricBlockCipher.processBlock(bArr, 0, bArr.length));
        clearBlock(this.block);
        return BigIntegers.asUnsignedByteArray((this.kParam.getModulus().bitLength() + 7) / 8, bigInteger.min(this.kParam.getModulus().subtract(bigInteger)));
    }

    @Override // org.spongycastle.crypto.Signer
    public void init(boolean z, CipherParameters cipherParameters) {
        RSAKeyParameters rSAKeyParameters = (RSAKeyParameters) cipherParameters;
        this.kParam = rSAKeyParameters;
        this.cipher.init(z, rSAKeyParameters);
        int iBitLength = this.kParam.getModulus().bitLength();
        this.keyBits = iBitLength;
        this.block = new byte[(iBitLength + 7) / 8];
        reset();
    }

    @Override // org.spongycastle.crypto.Signer
    public void reset() {
        this.digest.reset();
    }

    @Override // org.spongycastle.crypto.Signer
    public void update(byte b) {
        this.digest.update(b);
    }

    @Override // org.spongycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        try {
            this.block = this.cipher.processBlock(bArr, 0, bArr.length);
            BigInteger bigInteger = new BigInteger(1, this.block);
            if ((bigInteger.intValue() & 15) != 12) {
                bigInteger = this.kParam.getModulus().subtract(bigInteger);
                if ((bigInteger.intValue() & 15) != 12) {
                    return false;
                }
            }
            createSignatureBlock();
            byte[] bArrAsUnsignedByteArray = BigIntegers.asUnsignedByteArray(this.block.length, bigInteger);
            boolean zConstantTimeAreEqual = Arrays.constantTimeAreEqual(this.block, bArrAsUnsignedByteArray);
            clearBlock(this.block);
            clearBlock(bArrAsUnsignedByteArray);
            return zConstantTimeAreEqual;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // org.spongycastle.crypto.Signer
    public void update(byte[] bArr, int i, int i2) {
        this.digest.update(bArr, i, i2);
    }

    public X931Signer(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest) {
        this(asymmetricBlockCipher, digest, false);
    }
}
