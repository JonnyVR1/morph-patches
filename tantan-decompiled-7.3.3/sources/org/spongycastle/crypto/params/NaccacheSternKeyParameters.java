package org.spongycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class NaccacheSternKeyParameters extends AsymmetricKeyParameter {

    /* JADX INFO: renamed from: g */
    private BigInteger f207656g;
    int lowerSigmaBound;

    /* JADX INFO: renamed from: n */
    private BigInteger f207657n;

    public NaccacheSternKeyParameters(boolean z, BigInteger bigInteger, BigInteger bigInteger2, int i) {
        super(z);
        this.f207656g = bigInteger;
        this.f207657n = bigInteger2;
        this.lowerSigmaBound = i;
    }

    public BigInteger getG() {
        return this.f207656g;
    }

    public int getLowerSigmaBound() {
        return this.lowerSigmaBound;
    }

    public BigInteger getModulus() {
        return this.f207657n;
    }
}
