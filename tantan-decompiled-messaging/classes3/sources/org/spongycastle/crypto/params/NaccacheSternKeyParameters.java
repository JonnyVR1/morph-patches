package org.spongycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class NaccacheSternKeyParameters extends AsymmetricKeyParameter {

    /* JADX INFO: renamed from: g */
    private BigInteger f10359g;
    int lowerSigmaBound;

    /* JADX INFO: renamed from: n */
    private BigInteger f10360n;

    public NaccacheSternKeyParameters(boolean z, BigInteger bigInteger, BigInteger bigInteger2, int i) {
        super(z);
        this.f10359g = bigInteger;
        this.f10360n = bigInteger2;
        this.lowerSigmaBound = i;
    }

    public BigInteger getG() {
        return this.f10359g;
    }

    public int getLowerSigmaBound() {
        return this.lowerSigmaBound;
    }

    public BigInteger getModulus() {
        return this.f10360n;
    }
}
