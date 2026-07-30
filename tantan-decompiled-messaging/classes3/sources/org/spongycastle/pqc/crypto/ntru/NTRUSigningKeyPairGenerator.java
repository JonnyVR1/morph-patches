package org.spongycastle.pqc.crypto.ntru;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import l.phg0;
import org.spongycastle.crypto.AsymmetricCipherKeyPair;
import org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.spongycastle.crypto.KeyGenerationParameters;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.pqc.math.ntru.euclid.BigIntEuclidean;
import org.spongycastle.pqc.math.ntru.polynomial.BigDecimalPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.BigIntPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.DenseTernaryPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.IntegerPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.Polynomial;
import org.spongycastle.pqc.math.ntru.polynomial.ProductFormPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.Resultant;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class NTRUSigningKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private NTRUSigningKeyGenerationParameters params;

    public class BasisGenerationTask implements Callable<NTRUSigningPrivateKeyParameters.Basis> {
        private BasisGenerationTask() {
        }

        @Override // java.util.concurrent.Callable
        public NTRUSigningPrivateKeyParameters.Basis call() throws Exception {
            return NTRUSigningKeyPairGenerator.this.generateBoundedBasis();
        }
    }

    public class FGBasis extends NTRUSigningPrivateKeyParameters.Basis {

        /* JADX INFO: renamed from: F */
        public IntegerPolynomial f10595F;

        /* JADX INFO: renamed from: G */
        public IntegerPolynomial f10596G;

        public FGBasis(Polynomial polynomial, Polynomial polynomial2, IntegerPolynomial integerPolynomial, IntegerPolynomial integerPolynomial2, IntegerPolynomial integerPolynomial3, NTRUSigningKeyGenerationParameters nTRUSigningKeyGenerationParameters) {
            super(polynomial, polynomial2, integerPolynomial, nTRUSigningKeyGenerationParameters);
            this.f10595F = integerPolynomial2;
            this.f10596G = integerPolynomial3;
        }

        public boolean isNormOk() {
            NTRUSigningKeyGenerationParameters nTRUSigningKeyGenerationParameters = this.params;
            double d = nTRUSigningKeyGenerationParameters.keyNormBoundSq;
            int i = nTRUSigningKeyGenerationParameters.f10594q;
            return ((double) this.f10595F.centeredNormSq(i)) < d && ((double) this.f10596G.centeredNormSq(i)) < d;
        }
    }

    private FGBasis generateBasis() {
        boolean z;
        Polynomial polynomialGenerateRandom;
        IntegerPolynomial integerPolynomial;
        IntegerPolynomial integerPolynomialInvertFq;
        Polynomial polynomialGenerateRandom2;
        IntegerPolynomial integerPolynomial2;
        int i;
        Resultant resultant;
        BigIntEuclidean bigIntEuclideanCalculate;
        BigIntPolynomial bigIntPolynomialRound;
        IntegerPolynomial integerPolynomialMult;
        int i2;
        NTRUSigningKeyPairGenerator nTRUSigningKeyPairGenerator = this;
        NTRUSigningKeyGenerationParameters nTRUSigningKeyGenerationParameters = nTRUSigningKeyPairGenerator.params;
        int i3 = nTRUSigningKeyGenerationParameters.f10589N;
        int i4 = nTRUSigningKeyGenerationParameters.f10594q;
        int i5 = nTRUSigningKeyGenerationParameters.f10590d;
        int i6 = nTRUSigningKeyGenerationParameters.f10591d1;
        int i7 = nTRUSigningKeyGenerationParameters.f10592d2;
        int i8 = nTRUSigningKeyGenerationParameters.f10593d3;
        int i9 = nTRUSigningKeyGenerationParameters.basisType;
        int i10 = 1;
        int i11 = (i3 * 2) + 1;
        boolean z2 = nTRUSigningKeyGenerationParameters.primeCheck;
        while (true) {
            z = z2;
            polynomialGenerateRandom = nTRUSigningKeyPairGenerator.params.polyType == 0 ? DenseTernaryPolynomial.generateRandom(i3, i5 + 1, i5, new SecureRandom()) : ProductFormPolynomial.generateRandom(i3, i6, i7, i8 + 1, i8, new SecureRandom());
            integerPolynomial = polynomialGenerateRandom.toIntegerPolynomial();
            if (!z || !integerPolynomial.resultant(i11).res.equals(BigInteger.ZERO)) {
                integerPolynomialInvertFq = integerPolynomial.invertFq(i4);
                if (integerPolynomialInvertFq != null) {
                    break;
                }
                nTRUSigningKeyPairGenerator = this;
            }
            z2 = z;
        }
        Resultant resultant2 = integerPolynomial.resultant();
        while (true) {
            if (nTRUSigningKeyPairGenerator.params.polyType == 0) {
                polynomialGenerateRandom2 = DenseTernaryPolynomial.generateRandom(i3, i5 + 1, i5, new SecureRandom());
                resultant2 = resultant2;
            } else {
                resultant2 = resultant2;
                polynomialGenerateRandom2 = ProductFormPolynomial.generateRandom(i3, i6, i7, i8 + 1, i8, new SecureRandom());
            }
            integerPolynomial2 = polynomialGenerateRandom2.toIntegerPolynomial();
            i6 = i6;
            if (z) {
                i = i7;
                if (!integerPolynomial2.resultant(i11).res.equals(BigInteger.ZERO)) {
                }
                i7 = i;
            } else {
                i = i7;
            }
            if (integerPolynomial2.invertFq(i4) != null) {
                resultant = integerPolynomial2.resultant();
                int i12 = i8;
                bigIntEuclideanCalculate = BigIntEuclidean.calculate(resultant2.res, resultant.res);
                int i13 = i5;
                if (bigIntEuclideanCalculate.gcd.equals(BigInteger.ONE)) {
                    break;
                }
                nTRUSigningKeyPairGenerator = this;
                i7 = i;
                i8 = i12;
                i5 = i13;
            } else {
                nTRUSigningKeyPairGenerator = this;
                i7 = i;
            }
        }
        BigIntPolynomial bigIntPolynomial = (BigIntPolynomial) resultant2.rho.clone();
        bigIntPolynomial.mult(bigIntEuclideanCalculate.f10632x.multiply(BigInteger.valueOf(i4)));
        BigIntPolynomial bigIntPolynomial2 = (BigIntPolynomial) resultant.rho.clone();
        bigIntPolynomial2.mult(bigIntEuclideanCalculate.f10633y.multiply(BigInteger.valueOf(-i4)));
        int i14 = 0;
        if (nTRUSigningKeyPairGenerator.params.keyGenAlg == 0) {
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            iArr[0] = integerPolynomial.coeffs[0];
            iArr2[0] = integerPolynomial2.coeffs[0];
            while (i2 < i3) {
                i2 = i10;
                int i15 = i3 - i2;
                iArr[i2] = integerPolynomial.coeffs[i15];
                iArr2[i2] = integerPolynomial2.coeffs[i15];
                i2++;
            }
            i2 = i10;
            IntegerPolynomial integerPolynomial3 = new IntegerPolynomial(iArr);
            IntegerPolynomial integerPolynomial4 = new IntegerPolynomial(iArr2);
            IntegerPolynomial integerPolynomialMult2 = polynomialGenerateRandom.mult(integerPolynomial3);
            integerPolynomialMult2.add(polynomialGenerateRandom2.mult(integerPolynomial4));
            Resultant resultant3 = integerPolynomialMult2.resultant();
            BigIntPolynomial bigIntPolynomialMult = integerPolynomial3.mult(bigIntPolynomial2);
            bigIntPolynomialMult.add(integerPolynomial4.mult(bigIntPolynomial));
            bigIntPolynomialRound = bigIntPolynomialMult.mult(resultant3.rho);
            bigIntPolynomialRound.div(resultant3.res);
        } else {
            for (int i16 = i10; i16 < i3; i16 *= 10) {
                i14++;
            }
            BigDecimalPolynomial bigDecimalPolynomialDiv = resultant2.rho.div(new BigDecimal(resultant2.res), bigIntPolynomial2.getMaxCoeffLength() + 1 + i14);
            BigDecimalPolynomial bigDecimalPolynomialDiv2 = resultant.rho.div(new BigDecimal(resultant.res), bigIntPolynomial.getMaxCoeffLength() + 1 + i14);
            BigDecimalPolynomial bigDecimalPolynomialMult = bigDecimalPolynomialDiv.mult(bigIntPolynomial2);
            bigDecimalPolynomialMult.add(bigDecimalPolynomialDiv2.mult(bigIntPolynomial));
            bigDecimalPolynomialMult.halve();
            bigIntPolynomialRound = bigDecimalPolynomialMult.round();
        }
        BigIntPolynomial bigIntPolynomial3 = (BigIntPolynomial) bigIntPolynomial2.clone();
        bigIntPolynomial3.sub(polynomialGenerateRandom.mult(bigIntPolynomialRound));
        BigIntPolynomial bigIntPolynomial4 = (BigIntPolynomial) bigIntPolynomial.clone();
        bigIntPolynomial4.sub(polynomialGenerateRandom2.mult(bigIntPolynomialRound));
        IntegerPolynomial integerPolynomial5 = new IntegerPolynomial(bigIntPolynomial3);
        IntegerPolynomial integerPolynomial6 = new IntegerPolynomial(bigIntPolynomial4);
        nTRUSigningKeyPairGenerator.minimizeFG(integerPolynomial, integerPolynomial2, integerPolynomial5, integerPolynomial6, i3);
        if (i9 == 0) {
            integerPolynomialMult = polynomialGenerateRandom2.mult(integerPolynomialInvertFq, i4);
            polynomialGenerateRandom2 = integerPolynomial5;
        } else {
            integerPolynomialMult = integerPolynomial5.mult(integerPolynomialInvertFq, i4);
        }
        integerPolynomialMult.modPositive(i4);
        return nTRUSigningKeyPairGenerator.new FGBasis(polynomialGenerateRandom, polynomialGenerateRandom2, integerPolynomialMult, integerPolynomial5, integerPolynomial6, nTRUSigningKeyPairGenerator.params);
    }

    private void minimizeFG(IntegerPolynomial integerPolynomial, IntegerPolynomial integerPolynomial2, IntegerPolynomial integerPolynomial3, IntegerPolynomial integerPolynomial4, int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = integerPolynomial.coeffs[i3];
            int i5 = integerPolynomial2.coeffs[i3];
            i2 += i * 2 * ((i4 * i4) + (i5 * i5));
        }
        int i6 = i2 - 4;
        IntegerPolynomial integerPolynomial5 = (IntegerPolynomial) integerPolynomial.clone();
        IntegerPolynomial integerPolynomial6 = (IntegerPolynomial) integerPolynomial2.clone();
        int i7 = 0;
        int i8 = 0;
        while (i7 < i && i8 < i) {
            int i9 = 0;
            for (int i10 = 0; i10 < i; i10++) {
                i9 += i * 4 * ((integerPolynomial3.coeffs[i10] * integerPolynomial.coeffs[i10]) + (integerPolynomial4.coeffs[i10] * integerPolynomial2.coeffs[i10]));
            }
            int iSumCoeffs = i9 - ((integerPolynomial3.sumCoeffs() + integerPolynomial4.sumCoeffs()) * 4);
            if (iSumCoeffs > i6) {
                integerPolynomial3.sub(integerPolynomial5);
                integerPolynomial4.sub(integerPolynomial6);
            } else {
                if (iSumCoeffs < (-i6)) {
                    integerPolynomial3.add(integerPolynomial5);
                    integerPolynomial4.add(integerPolynomial6);
                }
                i8++;
                integerPolynomial5.rotate1();
                integerPolynomial6.rotate1();
            }
            i7++;
            i8 = 0;
            i8++;
            integerPolynomial5.rotate1();
            integerPolynomial6.rotate1();
        }
    }

    public NTRUSigningPrivateKeyParameters.Basis generateBoundedBasis() {
        FGBasis fGBasisGenerateBasis;
        do {
            fGBasisGenerateBasis = generateBasis();
        } while (!fGBasisGenerateBasis.isNormOk());
        return fGBasisGenerateBasis;
    }

    @Override // org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        ArrayList arrayList = new ArrayList();
        int i = this.params.f10588B;
        while (true) {
            if (i < 0) {
                break;
            }
            arrayList.add(executorServiceNewCachedThreadPool.submit(new BasisGenerationTask()));
            i--;
        }
        executorServiceNewCachedThreadPool.shutdown();
        ArrayList arrayList2 = new ArrayList();
        NTRUSigningPublicKeyParameters nTRUSigningPublicKeyParameters = null;
        for (int i2 = this.params.f10588B; i2 >= 0; i2--) {
            Future future = (Future) arrayList.get(i2);
            try {
                arrayList2.add(future.get());
                if (i2 == this.params.f10588B) {
                    nTRUSigningPublicKeyParameters = new NTRUSigningPublicKeyParameters(((NTRUSigningPrivateKeyParameters.Basis) future.get()).f10605h, this.params.getSigningParameters());
                }
            } catch (Exception e) {
                phg0.a(e);
                return null;
            }
        }
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) nTRUSigningPublicKeyParameters, (AsymmetricKeyParameter) new NTRUSigningPrivateKeyParameters(arrayList2, nTRUSigningPublicKeyParameters));
    }

    public AsymmetricCipherKeyPair generateKeyPairSingleThread() {
        ArrayList arrayList = new ArrayList();
        NTRUSigningPublicKeyParameters nTRUSigningPublicKeyParameters = null;
        for (int i = this.params.f10588B; i >= 0; i--) {
            NTRUSigningPrivateKeyParameters.Basis basisGenerateBoundedBasis = generateBoundedBasis();
            arrayList.add(basisGenerateBoundedBasis);
            if (i == 0) {
                nTRUSigningPublicKeyParameters = new NTRUSigningPublicKeyParameters(basisGenerateBoundedBasis.f10605h, this.params.getSigningParameters());
            }
        }
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) nTRUSigningPublicKeyParameters, (AsymmetricKeyParameter) new NTRUSigningPrivateKeyParameters(arrayList, nTRUSigningPublicKeyParameters));
    }

    @Override // org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.params = (NTRUSigningKeyGenerationParameters) keyGenerationParameters;
    }
}
