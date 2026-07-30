package org.spongycastle.pqc.crypto.mceliece;

import java.security.SecureRandom;
import l.ig3;
import l.whq0;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.digests.SHA1Digest;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.crypto.prng.DigestRandomGenerator;
import org.spongycastle.pqc.crypto.MessageEncryptor;
import org.spongycastle.pqc.math.linearalgebra.ByteUtils;
import org.spongycastle.pqc.math.linearalgebra.GF2Vector;
import org.spongycastle.pqc.math.linearalgebra.IntegerFunctions;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class McElieceKobaraImaiCipher implements MessageEncryptor {
    private static final String DEFAULT_PRNG_NAME = "SHA1PRNG";
    public static final String OID = "1.3.6.1.4.1.8301.3.1.3.4.2.3";
    public static final byte[] PUBLIC_CONSTANT = "a predetermined public constant".getBytes();

    /* JADX INFO: renamed from: k */
    private int f10545k;
    McElieceCCA2KeyParameters key;
    private Digest messDigest;

    /* JADX INFO: renamed from: n */
    private int f10546n;

    /* JADX INFO: renamed from: sr */
    private SecureRandom f10547sr;

    /* JADX INFO: renamed from: t */
    private int f10548t;

    private void initCipherEncrypt(McElieceCCA2PublicKeyParameters mcElieceCCA2PublicKeyParameters) {
        this.messDigest = mcElieceCCA2PublicKeyParameters.getParameters().getDigest();
        this.f10546n = mcElieceCCA2PublicKeyParameters.getN();
        this.f10545k = mcElieceCCA2PublicKeyParameters.getK();
        this.f10548t = mcElieceCCA2PublicKeyParameters.getT();
    }

    public int getKeySize(McElieceCCA2KeyParameters mcElieceCCA2KeyParameters) {
        if (mcElieceCCA2KeyParameters instanceof McElieceCCA2PublicKeyParameters) {
            return ((McElieceCCA2PublicKeyParameters) mcElieceCCA2KeyParameters).getN();
        }
        if (mcElieceCCA2KeyParameters instanceof McElieceCCA2PrivateKeyParameters) {
            return ((McElieceCCA2PrivateKeyParameters) mcElieceCCA2KeyParameters).getN();
        }
        ig3.a("unsupported type");
        return 0;
    }

    @Override // org.spongycastle.pqc.crypto.MessageEncryptor
    public void init(boolean z, CipherParameters cipherParameters) {
        if (!z) {
            McElieceCCA2PrivateKeyParameters mcElieceCCA2PrivateKeyParameters = (McElieceCCA2PrivateKeyParameters) cipherParameters;
            this.key = mcElieceCCA2PrivateKeyParameters;
            initCipherDecrypt(mcElieceCCA2PrivateKeyParameters);
        } else {
            if (!(cipherParameters instanceof ParametersWithRandom)) {
                this.f10547sr = new SecureRandom();
                McElieceCCA2PublicKeyParameters mcElieceCCA2PublicKeyParameters = (McElieceCCA2PublicKeyParameters) cipherParameters;
                this.key = mcElieceCCA2PublicKeyParameters;
                initCipherEncrypt(mcElieceCCA2PublicKeyParameters);
                return;
            }
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.f10547sr = parametersWithRandom.getRandom();
            McElieceCCA2PublicKeyParameters mcElieceCCA2PublicKeyParameters2 = (McElieceCCA2PublicKeyParameters) parametersWithRandom.getParameters();
            this.key = mcElieceCCA2PublicKeyParameters2;
            initCipherEncrypt(mcElieceCCA2PublicKeyParameters2);
        }
    }

    public void initCipherDecrypt(McElieceCCA2PrivateKeyParameters mcElieceCCA2PrivateKeyParameters) {
        this.messDigest = mcElieceCCA2PrivateKeyParameters.getParameters().getDigest();
        this.f10546n = mcElieceCCA2PrivateKeyParameters.getN();
        this.f10545k = mcElieceCCA2PrivateKeyParameters.getK();
        this.f10548t = mcElieceCCA2PrivateKeyParameters.getT();
    }

    @Override // org.spongycastle.pqc.crypto.MessageEncryptor
    public byte[] messageDecrypt(byte[] bArr) throws Exception {
        byte[] bArr2;
        int i = this.f10546n >> 3;
        if (bArr.length < i) {
            whq0.a("Bad Padding: Ciphertext too short.");
            return null;
        }
        int digestSize = this.messDigest.getDigestSize();
        int i2 = this.f10545k >> 3;
        int length = bArr.length - i;
        if (length > 0) {
            byte[][] bArrSplit = ByteUtils.split(bArr, length);
            bArr2 = bArrSplit[0];
            bArr = bArrSplit[1];
        } else {
            bArr2 = new byte[0];
        }
        GF2Vector[] gF2VectorArrDecryptionPrimitive = McElieceCCA2Primitives.decryptionPrimitive((McElieceCCA2PrivateKeyParameters) this.key, GF2Vector.OS2VP(this.f10546n, bArr));
        byte[] encoded = gF2VectorArrDecryptionPrimitive[0].getEncoded();
        GF2Vector gF2Vector = gF2VectorArrDecryptionPrimitive[1];
        if (encoded.length > i2) {
            encoded = ByteUtils.subArray(encoded, 0, i2);
        }
        byte[] bArrConcatenate = ByteUtils.concatenate(ByteUtils.concatenate(bArr2, Conversions.decode(this.f10546n, this.f10548t, gF2Vector)), encoded);
        int length2 = bArrConcatenate.length - digestSize;
        byte[][] bArrSplit2 = ByteUtils.split(bArrConcatenate, digestSize);
        byte[] bArr3 = bArrSplit2[0];
        byte[] bArr4 = bArrSplit2[1];
        byte[] bArr5 = new byte[this.messDigest.getDigestSize()];
        this.messDigest.update(bArr4, 0, bArr4.length);
        this.messDigest.doFinal(bArr5, 0);
        for (int i3 = digestSize - 1; i3 >= 0; i3--) {
            bArr5[i3] = (byte) (bArr5[i3] ^ bArr3[i3]);
        }
        DigestRandomGenerator digestRandomGenerator = new DigestRandomGenerator(new SHA1Digest());
        digestRandomGenerator.addSeedMaterial(bArr5);
        byte[] bArr6 = new byte[length2];
        digestRandomGenerator.nextBytes(bArr6);
        for (int i4 = length2 - 1; i4 >= 0; i4--) {
            bArr6[i4] = (byte) (bArr6[i4] ^ bArr4[i4]);
        }
        byte[] bArr7 = PUBLIC_CONSTANT;
        byte[][] bArrSplit3 = ByteUtils.split(bArr6, length2 - bArr7.length);
        byte[] bArr8 = bArrSplit3[0];
        if (ByteUtils.equals(bArrSplit3[1], bArr7)) {
            return bArr8;
        }
        whq0.a("Bad Padding: invalid ciphertext");
        return null;
    }

    @Override // org.spongycastle.pqc.crypto.MessageEncryptor
    public byte[] messageEncrypt(byte[] bArr) throws Exception {
        int digestSize = this.messDigest.getDigestSize();
        int i = this.f10545k >> 3;
        int iBitLength = (IntegerFunctions.binomial(this.f10546n, this.f10548t).bitLength() - 1) >> 3;
        byte[] bArr2 = PUBLIC_CONSTANT;
        int length = ((i + iBitLength) - digestSize) - bArr2.length;
        if (bArr.length > length) {
            length = bArr.length;
        }
        int length2 = bArr2.length + length;
        int i2 = ((length2 + digestSize) - i) - iBitLength;
        byte[] bArr3 = new byte[length2];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, length, bArr2.length);
        byte[] bArr4 = new byte[digestSize];
        this.f10547sr.nextBytes(bArr4);
        DigestRandomGenerator digestRandomGenerator = new DigestRandomGenerator(new SHA1Digest());
        digestRandomGenerator.addSeedMaterial(bArr4);
        byte[] bArr5 = new byte[length2];
        digestRandomGenerator.nextBytes(bArr5);
        for (int i3 = length2 - 1; i3 >= 0; i3--) {
            bArr5[i3] = (byte) (bArr5[i3] ^ bArr3[i3]);
        }
        byte[] bArr6 = new byte[this.messDigest.getDigestSize()];
        this.messDigest.update(bArr5, 0, length2);
        this.messDigest.doFinal(bArr6, 0);
        for (int i4 = digestSize - 1; i4 >= 0; i4--) {
            bArr6[i4] = (byte) (bArr6[i4] ^ bArr4[i4]);
        }
        byte[] bArrConcatenate = ByteUtils.concatenate(bArr6, bArr5);
        byte[] bArr7 = new byte[0];
        if (i2 > 0) {
            bArr7 = new byte[i2];
            System.arraycopy(bArrConcatenate, 0, bArr7, 0, i2);
        }
        byte[] bArr8 = new byte[iBitLength];
        System.arraycopy(bArrConcatenate, i2, bArr8, 0, iBitLength);
        byte[] bArr9 = new byte[i];
        System.arraycopy(bArrConcatenate, iBitLength + i2, bArr9, 0, i);
        byte[] encoded = McElieceCCA2Primitives.encryptionPrimitive((McElieceCCA2PublicKeyParameters) this.key, GF2Vector.OS2VP(this.f10545k, bArr9), Conversions.encode(this.f10546n, this.f10548t, bArr8)).getEncoded();
        return i2 > 0 ? ByteUtils.concatenate(bArr7, encoded) : encoded;
    }
}
