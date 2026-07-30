package org.spongycastle.pqc.math.ntru.polynomial;

import java.math.BigInteger;
import org.spongycastle.pqc.math.ntru.euclid.BigIntEuclidean;

/* JADX INFO: loaded from: classes3.dex */
public class ModularResultant extends Resultant {
    BigInteger modulus;

    public ModularResultant(BigIntPolynomial bigIntPolynomial, BigInteger bigInteger, BigInteger bigInteger2) {
        super(bigIntPolynomial, bigInteger);
        this.modulus = bigInteger2;
    }

    public static ModularResultant combineRho(ModularResultant modularResultant, ModularResultant modularResultant2) {
        BigInteger bigInteger = modularResultant.modulus;
        BigInteger bigInteger2 = modularResultant2.modulus;
        BigInteger bigIntegerMultiply = bigInteger.multiply(bigInteger2);
        BigIntEuclidean bigIntEuclideanCalculate = BigIntEuclidean.calculate(bigInteger2, bigInteger);
        BigIntPolynomial bigIntPolynomial = (BigIntPolynomial) modularResultant.rho.clone();
        bigIntPolynomial.mult(bigIntEuclideanCalculate.f207007x.multiply(bigInteger2));
        BigIntPolynomial bigIntPolynomial2 = (BigIntPolynomial) modularResultant2.rho.clone();
        bigIntPolynomial2.mult(bigIntEuclideanCalculate.f207008y.multiply(bigInteger));
        bigIntPolynomial.add(bigIntPolynomial2);
        bigIntPolynomial.mod(bigIntegerMultiply);
        return new ModularResultant(bigIntPolynomial, null, bigIntegerMultiply);
    }
}
