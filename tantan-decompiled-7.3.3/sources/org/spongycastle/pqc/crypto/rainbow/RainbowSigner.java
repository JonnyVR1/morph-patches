package org.spongycastle.pqc.crypto.rainbow;

import java.security.SecureRandom;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.pqc.crypto.MessageSigner;
import org.spongycastle.pqc.crypto.rainbow.util.ComputeInField;
import org.spongycastle.pqc.crypto.rainbow.util.GF2Field;

/* JADX INFO: loaded from: classes3.dex */
public class RainbowSigner implements MessageSigner {

    /* JADX INFO: renamed from: cf */
    private ComputeInField f207916cf = new ComputeInField();
    RainbowKeyParameters key;
    private SecureRandom random;
    int signableDocumentLength;

    /* JADX INFO: renamed from: x */
    private short[] f207917x;

    private short[] initSign(Layer[] layerArr, short[] sArr) {
        short[] sArr2 = new short[sArr.length];
        short[] sArrMultiplyMatrix = this.f207916cf.multiplyMatrix(((RainbowPrivateKeyParameters) this.key).getInvA1(), this.f207916cf.addVect(((RainbowPrivateKeyParameters) this.key).getB1(), sArr));
        for (int i = 0; i < layerArr[0].getVi(); i++) {
            this.f207917x[i] = (short) this.random.nextInt();
            short[] sArr3 = this.f207917x;
            sArr3[i] = (short) (sArr3[i] & 255);
        }
        return sArrMultiplyMatrix;
    }

    private short[] makeMessageRepresentative(byte[] bArr) {
        int i = this.signableDocumentLength;
        short[] sArr = new short[i];
        int i2 = 0;
        int i3 = 0;
        while (i2 < bArr.length) {
            short s = bArr[i3];
            sArr[i2] = s;
            sArr[i2] = (short) (s & 255);
            i3++;
            i2++;
            if (i2 >= i) {
                break;
            }
        }
        return sArr;
    }

    private short[] verifySignatureIntern(short[] sArr) {
        short[][] coeffQuadratic = ((RainbowPublicKeyParameters) this.key).getCoeffQuadratic();
        short[][] coeffSingular = ((RainbowPublicKeyParameters) this.key).getCoeffSingular();
        short[] coeffScalar = ((RainbowPublicKeyParameters) this.key).getCoeffScalar();
        short[] sArr2 = new short[coeffQuadratic.length];
        int length = coeffSingular[0].length;
        for (int i = 0; i < coeffQuadratic.length; i++) {
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                for (int i4 = i3; i4 < length; i4++) {
                    sArr2[i] = GF2Field.addElem(sArr2[i], GF2Field.multElem(coeffQuadratic[i][i2], GF2Field.multElem(sArr[i3], sArr[i4])));
                    i2++;
                }
                sArr2[i] = GF2Field.addElem(sArr2[i], GF2Field.multElem(coeffSingular[i][i3], sArr[i3]));
            }
            sArr2[i] = GF2Field.addElem(sArr2[i], coeffScalar[i]);
        }
        return sArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0024, code lost:
    
        r4 = initSign(r0, makeMessageRepresentative(r14));
        r5 = 0;
        r6 = 0;
        r7 = 0;
     */
    @Override // org.spongycastle.pqc.crypto.MessageSigner
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte[] generateSignature(byte[] bArr) {
        short[] sArrInitSign;
        Layer[] layers = ((RainbowPrivateKeyParameters) this.key).getLayers();
        int length = layers.length;
        this.f207917x = new short[((RainbowPrivateKeyParameters) this.key).getInvA2().length];
        int viNext = layers[length - 1].getViNext();
        byte[] bArr2 = new byte[viNext];
        while (true) {
            try {
                break;
            } catch (Exception unused) {
            }
        }
        for (int i = 0; i < length; i++) {
            short[] sArr = new short[layers[i].getOi()];
            short[] sArr2 = new short[layers[i].getOi()];
            for (int i2 = 0; i2 < layers[i].getOi(); i2++) {
                sArr[i2] = sArrInitSign[i];
                int i3 = i3 + 1;
            }
            short[] sArrSolveEquation = this.f207916cf.solveEquation(layers[i].plugInVinegars(this.f207917x), sArr);
            if (sArrSolveEquation == null) {
                throw new Exception("LES is not solveable!");
            }
            for (int i4 = 0; i4 < sArrSolveEquation.length; i4++) {
                this.f207917x[layers[i].getVi() + i4] = sArrSolveEquation[i4];
            }
        }
        short[] sArrMultiplyMatrix = this.f207916cf.multiplyMatrix(((RainbowPrivateKeyParameters) this.key).getInvA2(), this.f207916cf.addVect(((RainbowPrivateKeyParameters) this.key).getB2(), this.f207917x));
        for (int i5 = 0; i5 < viNext; i5++) {
            bArr2[i5] = (byte) sArrMultiplyMatrix[i5];
        }
        return bArr2;
    }

    @Override // org.spongycastle.pqc.crypto.MessageSigner
    public void init(boolean z, CipherParameters cipherParameters) {
        if (!z) {
            this.key = (RainbowPublicKeyParameters) cipherParameters;
        } else if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.random = parametersWithRandom.getRandom();
            this.key = (RainbowPrivateKeyParameters) parametersWithRandom.getParameters();
        } else {
            this.random = new SecureRandom();
            this.key = (RainbowPrivateKeyParameters) cipherParameters;
        }
        this.signableDocumentLength = this.key.getDocLength();
    }

    @Override // org.spongycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        short[] sArr = new short[bArr2.length];
        for (int i = 0; i < bArr2.length; i++) {
            sArr[i] = (short) (bArr2[i] & 255);
        }
        short[] sArrMakeMessageRepresentative = makeMessageRepresentative(bArr);
        short[] sArrVerifySignatureIntern = verifySignatureIntern(sArr);
        if (sArrMakeMessageRepresentative.length != sArrVerifySignatureIntern.length) {
            return false;
        }
        boolean z = true;
        for (int i2 = 0; i2 < sArrMakeMessageRepresentative.length; i2++) {
            z = z && sArrMakeMessageRepresentative[i2] == sArrVerifySignatureIntern[i2];
        }
        return z;
    }
}
