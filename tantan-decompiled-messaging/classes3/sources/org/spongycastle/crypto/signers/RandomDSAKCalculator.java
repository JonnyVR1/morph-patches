package org.spongycastle.crypto.signers;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class RandomDSAKCalculator implements DSAKCalculator {
    private static final BigInteger ZERO = BigInteger.valueOf(0);

    /* JADX INFO: renamed from: q */
    private BigInteger f10389q;
    private SecureRandom random;

    @Override // org.spongycastle.crypto.signers.DSAKCalculator
    public void init(BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        throw new IllegalStateException("Operation not supported");
    }

    @Override // org.spongycastle.crypto.signers.DSAKCalculator
    public boolean isDeterministic() {
        return false;
    }

    @Override // org.spongycastle.crypto.signers.DSAKCalculator
    public BigInteger nextK() {
        int iBitLength = this.f10389q.bitLength();
        while (true) {
            BigInteger bigInteger = new BigInteger(iBitLength, this.random);
            if (!bigInteger.equals(ZERO) && bigInteger.compareTo(this.f10389q) < 0) {
                return bigInteger;
            }
        }
    }

    @Override // org.spongycastle.crypto.signers.DSAKCalculator
    public void init(BigInteger bigInteger, SecureRandom secureRandom) {
        this.f10389q = bigInteger;
        this.random = secureRandom;
    }
}
