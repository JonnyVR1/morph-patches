package org.spongycastle.pqc.math.ntru.polynomial;

import java.math.BigInteger;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class Resultant {
    public BigInteger res;
    public BigIntPolynomial rho;

    public Resultant(BigIntPolynomial bigIntPolynomial, BigInteger bigInteger) {
        this.rho = bigIntPolynomial;
        this.res = bigInteger;
    }
}
