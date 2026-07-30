package org.spongycastle.pqc.crypto.mceliece;

import org.spongycastle.crypto.params.AsymmetricKeyParameter;

/* JADX INFO: loaded from: classes3.dex */
public class McElieceCCA2KeyParameters extends AsymmetricKeyParameter {
    private McElieceCCA2Parameters params;

    public McElieceCCA2KeyParameters(boolean z, McElieceCCA2Parameters mcElieceCCA2Parameters) {
        super(z);
        this.params = mcElieceCCA2Parameters;
    }

    public McElieceCCA2Parameters getParameters() {
        return this.params;
    }
}
