package org.spongycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class SRP6GroupParameters {

    /* JADX INFO: renamed from: N */
    private BigInteger f206742N;

    /* JADX INFO: renamed from: g */
    private BigInteger f206743g;

    public SRP6GroupParameters(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f206742N = bigInteger;
        this.f206743g = bigInteger2;
    }

    public BigInteger getG() {
        return this.f206743g;
    }

    public BigInteger getN() {
        return this.f206742N;
    }
}
