package org.spongycastle.pqc.crypto.mceliece;

import java.security.SecureRandom;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.pqc.crypto.MessageEncryptor;
import org.spongycastle.pqc.math.linearalgebra.GF2Matrix;
import org.spongycastle.pqc.math.linearalgebra.GF2Vector;
import org.spongycastle.pqc.math.linearalgebra.GF2mField;
import org.spongycastle.pqc.math.linearalgebra.GoppaCode;
import org.spongycastle.pqc.math.linearalgebra.Permutation;
import org.spongycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM;
import p153l.brq0;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class McEliecePKCSCipher implements MessageEncryptor {
    public static final String OID = "1.3.6.1.4.1.8301.3.1.3.4.1";
    public int cipherTextSize;

    /* JADX INFO: renamed from: k */
    private int f207846k;
    McElieceKeyParameters key;
    public int maxPlainTextSize;

    /* JADX INFO: renamed from: n */
    private int f207847n;

    /* JADX INFO: renamed from: sr */
    private SecureRandom f207848sr;

    /* JADX INFO: renamed from: t */
    private int f207849t;

    private byte[] computeMessage(GF2Vector gF2Vector) throws Exception {
        byte[] encoded = gF2Vector.getEncoded();
        int length = encoded.length - 1;
        while (length >= 0 && encoded[length] == 0) {
            length--;
        }
        if (length < 0 || encoded[length] != 1) {
            brq0.m106161a("Bad Padding: invalid ciphertext");
            return null;
        }
        byte[] bArr = new byte[length];
        System.arraycopy(encoded, 0, bArr, 0, length);
        return bArr;
    }

    private GF2Vector computeMessageRepresentative(byte[] bArr) {
        byte[] bArr2 = new byte[this.maxPlainTextSize + ((this.f207846k & 7) != 0 ? 1 : 0)];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        bArr2[bArr.length] = 1;
        return GF2Vector.OS2VP(this.f207846k, bArr2);
    }

    public int getKeySize(McElieceKeyParameters mcElieceKeyParameters) {
        if (mcElieceKeyParameters instanceof McEliecePublicKeyParameters) {
            return ((McEliecePublicKeyParameters) mcElieceKeyParameters).getN();
        }
        if (mcElieceKeyParameters instanceof McEliecePrivateKeyParameters) {
            return ((McEliecePrivateKeyParameters) mcElieceKeyParameters).getN();
        }
        wg3.m206174a("unsupported type");
        return 0;
    }

    @Override // org.spongycastle.pqc.crypto.MessageEncryptor
    public void init(boolean z, CipherParameters cipherParameters) {
        if (!z) {
            McEliecePrivateKeyParameters mcEliecePrivateKeyParameters = (McEliecePrivateKeyParameters) cipherParameters;
            this.key = mcEliecePrivateKeyParameters;
            initCipherDecrypt(mcEliecePrivateKeyParameters);
        } else {
            if (!(cipherParameters instanceof ParametersWithRandom)) {
                this.f207848sr = new SecureRandom();
                McEliecePublicKeyParameters mcEliecePublicKeyParameters = (McEliecePublicKeyParameters) cipherParameters;
                this.key = mcEliecePublicKeyParameters;
                initCipherEncrypt(mcEliecePublicKeyParameters);
                return;
            }
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.f207848sr = parametersWithRandom.getRandom();
            McEliecePublicKeyParameters mcEliecePublicKeyParameters2 = (McEliecePublicKeyParameters) parametersWithRandom.getParameters();
            this.key = mcEliecePublicKeyParameters2;
            initCipherEncrypt(mcEliecePublicKeyParameters2);
        }
    }

    public void initCipherDecrypt(McEliecePrivateKeyParameters mcEliecePrivateKeyParameters) {
        this.f207847n = mcEliecePrivateKeyParameters.getN();
        int k = mcEliecePrivateKeyParameters.getK();
        this.f207846k = k;
        this.maxPlainTextSize = k >> 3;
        this.cipherTextSize = this.f207847n >> 3;
    }

    public void initCipherEncrypt(McEliecePublicKeyParameters mcEliecePublicKeyParameters) {
        SecureRandom secureRandom = this.f207848sr;
        if (secureRandom == null) {
            secureRandom = new SecureRandom();
        }
        this.f207848sr = secureRandom;
        this.f207847n = mcEliecePublicKeyParameters.getN();
        this.f207846k = mcEliecePublicKeyParameters.getK();
        this.f207849t = mcEliecePublicKeyParameters.getT();
        this.cipherTextSize = this.f207847n >> 3;
        this.maxPlainTextSize = this.f207846k >> 3;
    }

    @Override // org.spongycastle.pqc.crypto.MessageEncryptor
    public byte[] messageDecrypt(byte[] bArr) throws Exception {
        GF2Vector gF2VectorOS2VP = GF2Vector.OS2VP(this.f207847n, bArr);
        McEliecePrivateKeyParameters mcEliecePrivateKeyParameters = (McEliecePrivateKeyParameters) this.key;
        GF2mField field = mcEliecePrivateKeyParameters.getField();
        PolynomialGF2mSmallM goppaPoly = mcEliecePrivateKeyParameters.getGoppaPoly();
        GF2Matrix sInv = mcEliecePrivateKeyParameters.getSInv();
        Permutation p1 = mcEliecePrivateKeyParameters.getP1();
        Permutation p2 = mcEliecePrivateKeyParameters.getP2();
        GF2Matrix h = mcEliecePrivateKeyParameters.getH();
        PolynomialGF2mSmallM[] qInv = mcEliecePrivateKeyParameters.getQInv();
        Permutation permutationRightMultiply = p1.rightMultiply(p2);
        GF2Vector gF2Vector = (GF2Vector) gF2VectorOS2VP.multiply(permutationRightMultiply.computeInverse());
        GF2Vector gF2VectorSyndromeDecode = GoppaCode.syndromeDecode((GF2Vector) h.rightMultiply(gF2Vector), field, goppaPoly, qInv);
        GF2Vector gF2Vector2 = (GF2Vector) ((GF2Vector) gF2Vector.add(gF2VectorSyndromeDecode)).multiply(p1);
        return computeMessage((GF2Vector) sInv.leftMultiply(gF2Vector2.extractRightVector(this.f207846k)));
    }

    @Override // org.spongycastle.pqc.crypto.MessageEncryptor
    public byte[] messageEncrypt(byte[] bArr) {
        GF2Vector gF2VectorComputeMessageRepresentative = computeMessageRepresentative(bArr);
        return ((GF2Vector) ((McEliecePublicKeyParameters) this.key).getG().leftMultiply(gF2VectorComputeMessageRepresentative).add(new GF2Vector(this.f207847n, this.f207849t, this.f207848sr))).getEncoded();
    }
}
