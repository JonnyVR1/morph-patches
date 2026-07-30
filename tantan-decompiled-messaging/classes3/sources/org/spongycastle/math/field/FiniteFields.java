package org.spongycastle.math.field;

import java.math.BigInteger;
import l.ig3;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class FiniteFields {
    static final FiniteField GF_2 = new PrimeField(BigInteger.valueOf(2));
    static final FiniteField GF_3 = new PrimeField(BigInteger.valueOf(3));

    public static PolynomialExtensionField getBinaryExtensionField(int[] iArr) {
        if (iArr[0] != 0) {
            ig3.a("Irreducible polynomials in GF(2) must have constant term");
            return null;
        }
        for (int i = 1; i < iArr.length; i++) {
            if (iArr[i] <= iArr[i - 1]) {
                ig3.a("Polynomial exponents must be montonically increasing");
                return null;
            }
        }
        return new GenericPolynomialExtensionField(GF_2, new GF2Polynomial(iArr));
    }

    public static FiniteField getPrimeField(BigInteger bigInteger) {
        int iBitLength = bigInteger.bitLength();
        if (bigInteger.signum() <= 0 || iBitLength < 2) {
            ig3.a("'characteristic' must be >= 2");
            return null;
        }
        if (iBitLength < 3) {
            int iIntValue = bigInteger.intValue();
            if (iIntValue == 2) {
                return GF_2;
            }
            if (iIntValue == 3) {
                return GF_3;
            }
        }
        return new PrimeField(bigInteger);
    }
}
