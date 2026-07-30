package org.spongycastle.pqc.math.ntru.euclid;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class BigIntEuclidean {
    public BigInteger gcd;

    /* JADX INFO: renamed from: x */
    public BigInteger f207007x;

    /* JADX INFO: renamed from: y */
    public BigInteger f207008y;

    private BigIntEuclidean() {
    }

    public static BigIntEuclidean calculate(BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger bigInteger3 = BigInteger.ZERO;
        BigInteger bigInteger4 = bigInteger;
        BigInteger bigInteger5 = bigInteger2;
        BigInteger bigIntegerSubtract = BigInteger.ONE;
        BigInteger bigInteger6 = bigIntegerSubtract;
        BigInteger bigInteger7 = bigInteger3;
        while (!bigInteger5.equals(BigInteger.ZERO)) {
            BigInteger[] bigIntegerArrDivideAndRemainder = bigInteger4.divideAndRemainder(bigInteger5);
            BigInteger bigInteger8 = bigIntegerArrDivideAndRemainder[0];
            BigInteger bigInteger9 = bigIntegerArrDivideAndRemainder[1];
            BigInteger bigIntegerSubtract2 = bigInteger6.subtract(bigInteger8.multiply(bigInteger7));
            bigInteger4 = bigInteger5;
            bigInteger5 = bigInteger9;
            BigInteger bigInteger10 = bigIntegerSubtract;
            bigIntegerSubtract = bigInteger3.subtract(bigInteger8.multiply(bigIntegerSubtract));
            bigInteger3 = bigInteger10;
            bigInteger6 = bigInteger7;
            bigInteger7 = bigIntegerSubtract2;
        }
        BigIntEuclidean bigIntEuclidean = new BigIntEuclidean();
        bigIntEuclidean.f207007x = bigInteger6;
        bigIntEuclidean.f207008y = bigInteger3;
        bigIntEuclidean.gcd = bigInteger4;
        return bigIntEuclidean;
    }
}
