package org.spongycastle.pqc.crypto.mceliece;

import java.security.SecureRandom;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.digests.SHA1Digest;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.crypto.prng.DigestRandomGenerator;
import org.spongycastle.pqc.crypto.MessageEncryptor;
import org.spongycastle.pqc.math.linearalgebra.ByteUtils;
import org.spongycastle.pqc.math.linearalgebra.GF2Vector;
import p153l.brq0;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class McEliecePointchevalCipher implements MessageEncryptor {
    public static final String OID = "1.3.6.1.4.1.8301.3.1.3.4.2.2";

    /* JADX INFO: renamed from: k */
    private int f207853k;
    McElieceCCA2KeyParameters key;
    private Digest messDigest;

    /* JADX INFO: renamed from: n */
    private int f207854n;

    /* JADX INFO: renamed from: sr */
    private SecureRandom f207855sr;

    /* JADX INFO: renamed from: t */
    private int f207856t;

    public int decryptOutputSize(int i) {
        return 0;
    }

    public int encryptOutputSize(int i) {
        return 0;
    }

    public int getKeySize(McElieceCCA2KeyParameters mcElieceCCA2KeyParameters) throws IllegalArgumentException {
        if (mcElieceCCA2KeyParameters instanceof McElieceCCA2PublicKeyParameters) {
            return ((McElieceCCA2PublicKeyParameters) mcElieceCCA2KeyParameters).getN();
        }
        if (mcElieceCCA2KeyParameters instanceof McElieceCCA2PrivateKeyParameters) {
            return ((McElieceCCA2PrivateKeyParameters) mcElieceCCA2KeyParameters).getN();
        }
        wg3.m206174a("unsupported type");
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
                this.f207855sr = new SecureRandom();
                McElieceCCA2PublicKeyParameters mcElieceCCA2PublicKeyParameters = (McElieceCCA2PublicKeyParameters) cipherParameters;
                this.key = mcElieceCCA2PublicKeyParameters;
                initCipherEncrypt(mcElieceCCA2PublicKeyParameters);
                return;
            }
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.f207855sr = parametersWithRandom.getRandom();
            McElieceCCA2PublicKeyParameters mcElieceCCA2PublicKeyParameters2 = (McElieceCCA2PublicKeyParameters) parametersWithRandom.getParameters();
            this.key = mcElieceCCA2PublicKeyParameters2;
            initCipherEncrypt(mcElieceCCA2PublicKeyParameters2);
        }
    }

    public void initCipherDecrypt(McElieceCCA2PrivateKeyParameters mcElieceCCA2PrivateKeyParameters) {
        this.messDigest = mcElieceCCA2PrivateKeyParameters.getParameters().getDigest();
        this.f207854n = mcElieceCCA2PrivateKeyParameters.getN();
        this.f207853k = mcElieceCCA2PrivateKeyParameters.getK();
        this.f207856t = mcElieceCCA2PrivateKeyParameters.getT();
    }

    public void initCipherEncrypt(McElieceCCA2PublicKeyParameters mcElieceCCA2PublicKeyParameters) {
        SecureRandom secureRandom = this.f207855sr;
        if (secureRandom == null) {
            secureRandom = new SecureRandom();
        }
        this.f207855sr = secureRandom;
        this.messDigest = mcElieceCCA2PublicKeyParameters.getParameters().getDigest();
        this.f207854n = mcElieceCCA2PublicKeyParameters.getN();
        this.f207853k = mcElieceCCA2PublicKeyParameters.getK();
        this.f207856t = mcElieceCCA2PublicKeyParameters.getT();
    }

    @Override // org.spongycastle.pqc.crypto.MessageEncryptor
    public byte[] messageDecrypt(byte[] bArr) throws Exception {
        int i = (this.f207854n + 7) >> 3;
        int length = bArr.length - i;
        byte[][] bArrSplit = ByteUtils.split(bArr, i);
        byte[] bArr2 = bArrSplit[0];
        byte[] bArr3 = bArrSplit[1];
        GF2Vector[] gF2VectorArrDecryptionPrimitive = McElieceCCA2Primitives.decryptionPrimitive((McElieceCCA2PrivateKeyParameters) this.key, GF2Vector.OS2VP(this.f207854n, bArr2));
        byte[] encoded = gF2VectorArrDecryptionPrimitive[0].getEncoded();
        GF2Vector gF2Vector = gF2VectorArrDecryptionPrimitive[1];
        DigestRandomGenerator digestRandomGenerator = new DigestRandomGenerator(new SHA1Digest());
        digestRandomGenerator.addSeedMaterial(encoded);
        byte[] bArr4 = new byte[length];
        digestRandomGenerator.nextBytes(bArr4);
        for (int i2 = 0; i2 < length; i2++) {
            bArr4[i2] = (byte) (bArr4[i2] ^ bArr3[i2]);
        }
        this.messDigest.update(bArr4, 0, length);
        byte[] bArr5 = new byte[this.messDigest.getDigestSize()];
        this.messDigest.doFinal(bArr5, 0);
        if (Conversions.encode(this.f207854n, this.f207856t, bArr5).equals(gF2Vector)) {
            return ByteUtils.split(bArr4, length - (this.f207853k >> 3))[0];
        }
        brq0.m106161a("Bad Padding: Invalid ciphertext.");
        return null;
    }

    @Override // org.spongycastle.pqc.crypto.MessageEncryptor
    public byte[] messageEncrypt(byte[] bArr) throws Exception {
        int i = this.f207853k >> 3;
        byte[] bArr2 = new byte[i];
        this.f207855sr.nextBytes(bArr2);
        GF2Vector gF2Vector = new GF2Vector(this.f207853k, this.f207855sr);
        byte[] encoded = gF2Vector.getEncoded();
        byte[] bArrConcatenate = ByteUtils.concatenate(bArr, bArr2);
        this.messDigest.update(bArrConcatenate, 0, bArrConcatenate.length);
        byte[] bArr3 = new byte[this.messDigest.getDigestSize()];
        this.messDigest.doFinal(bArr3, 0);
        byte[] encoded2 = McElieceCCA2Primitives.encryptionPrimitive((McElieceCCA2PublicKeyParameters) this.key, gF2Vector, Conversions.encode(this.f207854n, this.f207856t, bArr3)).getEncoded();
        DigestRandomGenerator digestRandomGenerator = new DigestRandomGenerator(new SHA1Digest());
        digestRandomGenerator.addSeedMaterial(encoded);
        byte[] bArr4 = new byte[bArr.length + i];
        digestRandomGenerator.nextBytes(bArr4);
        for (int i2 = 0; i2 < bArr.length; i2++) {
            bArr4[i2] = (byte) (bArr4[i2] ^ bArr[i2]);
        }
        for (int i3 = 0; i3 < i; i3++) {
            int length = bArr.length + i3;
            bArr4[length] = (byte) (bArr4[length] ^ bArr2[i3]);
        }
        return ByteUtils.concatenate(encoded2, bArr4);
    }
}
