package org.spongycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class DHPublicKeyParameters extends DHKeyParameters {

    /* JADX INFO: renamed from: y */
    private BigInteger f10325y;

    public DHPublicKeyParameters(BigInteger bigInteger, DHParameters dHParameters) {
        super(false, dHParameters);
        this.f10325y = bigInteger;
    }

    @Override // org.spongycastle.crypto.params.DHKeyParameters
    public boolean equals(Object obj) {
        return (obj instanceof DHPublicKeyParameters) && ((DHPublicKeyParameters) obj).getY().equals(this.f10325y) && super.equals(obj);
    }

    public BigInteger getY() {
        return this.f10325y;
    }

    @Override // org.spongycastle.crypto.params.DHKeyParameters
    public int hashCode() {
        return super.hashCode() ^ this.f10325y.hashCode();
    }
}
