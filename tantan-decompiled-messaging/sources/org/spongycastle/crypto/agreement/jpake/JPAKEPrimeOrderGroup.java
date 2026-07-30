package org.spongycastle.crypto.agreement.jpake;

import java.math.BigInteger;
import p149l.ig3;

/* JADX INFO: loaded from: classes3.dex */
public class JPAKEPrimeOrderGroup {

    /* JADX INFO: renamed from: g */
    private final BigInteger f206335g;

    /* JADX INFO: renamed from: p */
    private final BigInteger f206336p;

    /* JADX INFO: renamed from: q */
    private final BigInteger f206337q;

    public JPAKEPrimeOrderGroup(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, boolean z) {
        JPAKEUtil.validateNotNull(bigInteger, "p");
        JPAKEUtil.validateNotNull(bigInteger2, "q");
        JPAKEUtil.validateNotNull(bigInteger3, "g");
        if (!z) {
            BigInteger bigInteger4 = JPAKEUtil.ONE;
            if (!bigInteger.subtract(bigInteger4).mod(bigInteger2).equals(JPAKEUtil.ZERO)) {
                ig3.m135964a("p-1 must be evenly divisible by q");
                throw null;
            }
            if (bigInteger3.compareTo(BigInteger.valueOf(2L)) == -1 || bigInteger3.compareTo(bigInteger.subtract(bigInteger4)) == 1) {
                ig3.m135964a("g must be in [2, p-1]");
                throw null;
            }
            if (!bigInteger3.modPow(bigInteger2, bigInteger).equals(bigInteger4)) {
                ig3.m135964a("g^q mod p must equal 1");
                throw null;
            }
            if (!bigInteger.isProbablePrime(20)) {
                ig3.m135964a("p must be prime");
                throw null;
            }
            if (!bigInteger2.isProbablePrime(20)) {
                ig3.m135964a("q must be prime");
                throw null;
            }
        }
        this.f206336p = bigInteger;
        this.f206337q = bigInteger2;
        this.f206335g = bigInteger3;
    }

    public BigInteger getG() {
        return this.f206335g;
    }

    public BigInteger getP() {
        return this.f206336p;
    }

    public BigInteger getQ() {
        return this.f206337q;
    }

    public JPAKEPrimeOrderGroup(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this(bigInteger, bigInteger2, bigInteger3, false);
    }
}
