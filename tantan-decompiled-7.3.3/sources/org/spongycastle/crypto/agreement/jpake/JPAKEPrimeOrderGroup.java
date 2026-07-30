package org.spongycastle.crypto.agreement.jpake;

import java.math.BigInteger;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class JPAKEPrimeOrderGroup {

    /* JADX INFO: renamed from: g */
    private final BigInteger f207257g;

    /* JADX INFO: renamed from: p */
    private final BigInteger f207258p;

    /* JADX INFO: renamed from: q */
    private final BigInteger f207259q;

    public JPAKEPrimeOrderGroup(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, boolean z) {
        JPAKEUtil.validateNotNull(bigInteger, "p");
        JPAKEUtil.validateNotNull(bigInteger2, "q");
        JPAKEUtil.validateNotNull(bigInteger3, "g");
        if (!z) {
            BigInteger bigInteger4 = JPAKEUtil.ONE;
            if (!bigInteger.subtract(bigInteger4).mod(bigInteger2).equals(JPAKEUtil.ZERO)) {
                wg3.m206174a("p-1 must be evenly divisible by q");
                throw null;
            }
            if (bigInteger3.compareTo(BigInteger.valueOf(2L)) == -1 || bigInteger3.compareTo(bigInteger.subtract(bigInteger4)) == 1) {
                wg3.m206174a("g must be in [2, p-1]");
                throw null;
            }
            if (!bigInteger3.modPow(bigInteger2, bigInteger).equals(bigInteger4)) {
                wg3.m206174a("g^q mod p must equal 1");
                throw null;
            }
            if (!bigInteger.isProbablePrime(20)) {
                wg3.m206174a("p must be prime");
                throw null;
            }
            if (!bigInteger2.isProbablePrime(20)) {
                wg3.m206174a("q must be prime");
                throw null;
            }
        }
        this.f207258p = bigInteger;
        this.f207259q = bigInteger2;
        this.f207257g = bigInteger3;
    }

    public BigInteger getG() {
        return this.f207257g;
    }

    public BigInteger getP() {
        return this.f207258p;
    }

    public BigInteger getQ() {
        return this.f207259q;
    }

    public JPAKEPrimeOrderGroup(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this(bigInteger, bigInteger2, bigInteger3, false);
    }
}
