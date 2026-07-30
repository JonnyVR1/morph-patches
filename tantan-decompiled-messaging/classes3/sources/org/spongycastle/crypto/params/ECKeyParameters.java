package org.spongycastle.crypto.params;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ECKeyParameters extends AsymmetricKeyParameter {
    ECDomainParameters params;

    public ECKeyParameters(boolean z, ECDomainParameters eCDomainParameters) {
        super(z);
        this.params = eCDomainParameters;
    }

    public ECDomainParameters getParameters() {
        return this.params;
    }
}
