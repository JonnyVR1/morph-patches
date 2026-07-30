package org.spongycastle.pqc.crypto.ntru;

import org.spongycastle.crypto.AsymmetricCipherKeyPair;
import org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.spongycastle.crypto.KeyGenerationParameters;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.pqc.math.ntru.polynomial.DenseTernaryPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.IntegerPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.Polynomial;
import org.spongycastle.pqc.math.ntru.polynomial.ProductFormPolynomial;
import org.spongycastle.pqc.math.ntru.util.Util;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class NTRUEncryptionKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private NTRUEncryptionKeyGenerationParameters params;

    @Override // org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        Polynomial polynomialGenerateRandomTernary;
        IntegerPolynomial integerPolynomial;
        IntegerPolynomial integerPolynomialInvertFq;
        DenseTernaryPolynomial denseTernaryPolynomialGenerateRandom;
        NTRUEncryptionKeyGenerationParameters nTRUEncryptionKeyGenerationParameters = this.params;
        int i = nTRUEncryptionKeyGenerationParameters.f10570N;
        int i2 = nTRUEncryptionKeyGenerationParameters.f10576q;
        int i3 = nTRUEncryptionKeyGenerationParameters.f10573df;
        int i4 = nTRUEncryptionKeyGenerationParameters.df1;
        int i5 = nTRUEncryptionKeyGenerationParameters.df2;
        int i6 = nTRUEncryptionKeyGenerationParameters.df3;
        int i7 = nTRUEncryptionKeyGenerationParameters.f10574dg;
        boolean z = nTRUEncryptionKeyGenerationParameters.fastFp;
        boolean z2 = nTRUEncryptionKeyGenerationParameters.sparse;
        IntegerPolynomial integerPolynomial2 = null;
        while (true) {
            NTRUEncryptionKeyGenerationParameters nTRUEncryptionKeyGenerationParameters2 = this.params;
            if (z) {
                polynomialGenerateRandomTernary = nTRUEncryptionKeyGenerationParameters2.polyType == 0 ? Util.generateRandomTernary(i, i3, i3, z2, nTRUEncryptionKeyGenerationParameters2.getRandom()) : ProductFormPolynomial.generateRandom(i, i4, i5, i6, i6, nTRUEncryptionKeyGenerationParameters2.getRandom());
                integerPolynomial = polynomialGenerateRandomTernary.toIntegerPolynomial();
                integerPolynomial.mult(3);
                int[] iArr = integerPolynomial.coeffs;
                iArr[0] = iArr[0] + 1;
            } else {
                polynomialGenerateRandomTernary = nTRUEncryptionKeyGenerationParameters2.polyType == 0 ? Util.generateRandomTernary(i, i3, i3 - 1, z2, nTRUEncryptionKeyGenerationParameters2.getRandom()) : ProductFormPolynomial.generateRandom(i, i4, i5, i6, i6 - 1, nTRUEncryptionKeyGenerationParameters2.getRandom());
                integerPolynomial = polynomialGenerateRandomTernary.toIntegerPolynomial();
                integerPolynomial2 = integerPolynomial.invertF3();
                if (integerPolynomial2 == null) {
                    continue;
                }
            }
            integerPolynomialInvertFq = integerPolynomial.invertFq(i2);
            if (integerPolynomialInvertFq != null) {
                break;
            }
        }
        if (z) {
            integerPolynomial2 = new IntegerPolynomial(i);
            integerPolynomial2.coeffs[0] = 1;
        }
        do {
            denseTernaryPolynomialGenerateRandom = DenseTernaryPolynomial.generateRandom(i, i7, i7 - 1, this.params.getRandom());
        } while (denseTernaryPolynomialGenerateRandom.invertFq(i2) == null);
        IntegerPolynomial integerPolynomialMult = denseTernaryPolynomialGenerateRandom.mult(integerPolynomialInvertFq, i2);
        integerPolynomialMult.mult3(i2);
        integerPolynomialMult.ensurePositive(i2);
        denseTernaryPolynomialGenerateRandom.clear();
        integerPolynomialInvertFq.clear();
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new NTRUEncryptionPublicKeyParameters(integerPolynomialMult, this.params.getEncryptionParameters()), (AsymmetricKeyParameter) new NTRUEncryptionPrivateKeyParameters(integerPolynomialMult, polynomialGenerateRandomTernary, integerPolynomial2, this.params.getEncryptionParameters()));
    }

    @Override // org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.params = (NTRUEncryptionKeyGenerationParameters) keyGenerationParameters;
    }
}
