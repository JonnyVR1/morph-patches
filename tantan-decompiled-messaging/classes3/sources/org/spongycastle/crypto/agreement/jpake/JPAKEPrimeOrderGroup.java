package org.spongycastle.crypto.agreement.jpake;

import java.math.BigInteger;
import l.ig3;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class JPAKEPrimeOrderGroup {

    /* JADX INFO: renamed from: g */
    private final BigInteger f9960g;

    /* JADX INFO: renamed from: p */
    private final BigInteger f9961p;

    /* JADX INFO: renamed from: q */
    private final BigInteger f9962q;

    public JPAKEPrimeOrderGroup(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, boolean z) {
        JPAKEUtil.validateNotNull(bigInteger, "p");
        JPAKEUtil.validateNotNull(bigInteger2, "q");
        JPAKEUtil.validateNotNull(bigInteger3, "g");
        if (!z) {
            BigInteger bigInteger4 = JPAKEUtil.ONE;
            if (!bigInteger.subtract(bigInteger4).mod(bigInteger2).equals(JPAKEUtil.ZERO)) {
                ig3.a("p-1 must be evenly divisible by q");
                throw null;
            }
            if (bigInteger3.compareTo(BigInteger.valueOf(2L)) == -1 || bigInteger3.compareTo(bigInteger.subtract(bigInteger4)) == 1) {
                ig3.a("g must be in [2, p-1]");
                throw null;
            }
            if (!bigInteger3.modPow(bigInteger2, bigInteger).equals(bigInteger4)) {
                ig3.a("g^q mod p must equal 1");
                throw null;
            }
            if (!bigInteger.isProbablePrime(20)) {
                ig3.a("p must be prime");
                throw null;
            }
            if (!bigInteger2.isProbablePrime(20)) {
                ig3.a("q must be prime");
                throw null;
            }
        }
        this.f9961p = bigInteger;
        this.f9962q = bigInteger2;
        this.f9960g = bigInteger3;
    }

    public BigInteger getG() {
        return this.f9960g;
    }

    public BigInteger getP() {
        return this.f9961p;
    }

    public BigInteger getQ() {
        return this.f9962q;
    }

    public JPAKEPrimeOrderGroup(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this(bigInteger, bigInteger2, bigInteger3, false);
    }
}
