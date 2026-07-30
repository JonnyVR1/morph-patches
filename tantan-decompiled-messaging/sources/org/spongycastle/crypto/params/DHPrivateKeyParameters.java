package org.spongycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class DHPrivateKeyParameters extends DHKeyParameters {

    /* JADX INFO: renamed from: x */
    private BigInteger f206699x;

    public DHPrivateKeyParameters(BigInteger bigInteger, DHParameters dHParameters) {
        super(true, dHParameters);
        this.f206699x = bigInteger;
    }

    @Override // org.spongycastle.crypto.params.DHKeyParameters
    public boolean equals(Object obj) {
        return (obj instanceof DHPrivateKeyParameters) && ((DHPrivateKeyParameters) obj).getX().equals(this.f206699x) && super.equals(obj);
    }

    public BigInteger getX() {
        return this.f206699x;
    }

    @Override // org.spongycastle.crypto.params.DHKeyParameters
    public int hashCode() {
        return super.hashCode() ^ this.f206699x.hashCode();
    }
}
