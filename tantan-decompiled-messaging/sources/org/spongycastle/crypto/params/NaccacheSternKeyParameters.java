package org.spongycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class NaccacheSternKeyParameters extends AsymmetricKeyParameter {

    /* JADX INFO: renamed from: g */
    private BigInteger f206734g;
    int lowerSigmaBound;

    /* JADX INFO: renamed from: n */
    private BigInteger f206735n;

    public NaccacheSternKeyParameters(boolean z, BigInteger bigInteger, BigInteger bigInteger2, int i) {
        super(z);
        this.f206734g = bigInteger;
        this.f206735n = bigInteger2;
        this.lowerSigmaBound = i;
    }

    public BigInteger getG() {
        return this.f206734g;
    }

    public int getLowerSigmaBound() {
        return this.lowerSigmaBound;
    }

    public BigInteger getModulus() {
        return this.f206735n;
    }
}
