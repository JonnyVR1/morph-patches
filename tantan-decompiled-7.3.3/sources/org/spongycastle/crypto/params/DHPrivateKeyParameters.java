package org.spongycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class DHPrivateKeyParameters extends DHKeyParameters {

    /* JADX INFO: renamed from: x */
    private BigInteger f207621x;

    public DHPrivateKeyParameters(BigInteger bigInteger, DHParameters dHParameters) {
        super(true, dHParameters);
        this.f207621x = bigInteger;
    }

    @Override // org.spongycastle.crypto.params.DHKeyParameters
    public boolean equals(Object obj) {
        return (obj instanceof DHPrivateKeyParameters) && ((DHPrivateKeyParameters) obj).getX().equals(this.f207621x) && super.equals(obj);
    }

    public BigInteger getX() {
        return this.f207621x;
    }

    @Override // org.spongycastle.crypto.params.DHKeyParameters
    public int hashCode() {
        return super.hashCode() ^ this.f207621x.hashCode();
    }
}
