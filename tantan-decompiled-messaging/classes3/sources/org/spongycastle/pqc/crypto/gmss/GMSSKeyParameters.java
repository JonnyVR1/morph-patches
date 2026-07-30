package org.spongycastle.pqc.crypto.gmss;

import org.spongycastle.crypto.params.AsymmetricKeyParameter;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class GMSSKeyParameters extends AsymmetricKeyParameter {
    private GMSSParameters params;

    public GMSSKeyParameters(boolean z, GMSSParameters gMSSParameters) {
        super(z);
        this.params = gMSSParameters;
    }

    public GMSSParameters getParameters() {
        return this.params;
    }
}
