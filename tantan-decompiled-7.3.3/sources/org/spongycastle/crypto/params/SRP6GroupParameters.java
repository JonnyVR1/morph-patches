package org.spongycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class SRP6GroupParameters {

    /* JADX INFO: renamed from: N */
    private BigInteger f207664N;

    /* JADX INFO: renamed from: g */
    private BigInteger f207665g;

    public SRP6GroupParameters(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f207664N = bigInteger;
        this.f207665g = bigInteger2;
    }

    public BigInteger getG() {
        return this.f207665g;
    }

    public BigInteger getN() {
        return this.f207664N;
    }
}
