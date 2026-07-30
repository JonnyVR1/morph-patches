package org.spongycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class DHPrivateKeyParameters extends DHKeyParameters {

    /* JADX INFO: renamed from: x */
    private BigInteger f10324x;

    public DHPrivateKeyParameters(BigInteger bigInteger, DHParameters dHParameters) {
        super(true, dHParameters);
        this.f10324x = bigInteger;
    }

    @Override // org.spongycastle.crypto.params.DHKeyParameters
    public boolean equals(Object obj) {
        return (obj instanceof DHPrivateKeyParameters) && ((DHPrivateKeyParameters) obj).getX().equals(this.f10324x) && super.equals(obj);
    }

    public BigInteger getX() {
        return this.f10324x;
    }

    @Override // org.spongycastle.crypto.params.DHKeyParameters
    public int hashCode() {
        return super.hashCode() ^ this.f10324x.hashCode();
    }
}
