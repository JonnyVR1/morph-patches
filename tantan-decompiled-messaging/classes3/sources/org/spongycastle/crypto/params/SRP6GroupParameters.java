package org.spongycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class SRP6GroupParameters {

    /* JADX INFO: renamed from: N */
    private BigInteger f10367N;

    /* JADX INFO: renamed from: g */
    private BigInteger f10368g;

    public SRP6GroupParameters(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f10367N = bigInteger;
        this.f10368g = bigInteger2;
    }

    public BigInteger getG() {
        return this.f10368g;
    }

    public BigInteger getN() {
        return this.f10367N;
    }
}
