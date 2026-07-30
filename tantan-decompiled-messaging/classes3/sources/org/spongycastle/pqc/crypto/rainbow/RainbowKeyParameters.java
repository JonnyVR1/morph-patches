package org.spongycastle.pqc.crypto.rainbow;

import org.spongycastle.crypto.params.AsymmetricKeyParameter;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class RainbowKeyParameters extends AsymmetricKeyParameter {
    private int docLength;

    public RainbowKeyParameters(boolean z, int i) {
        super(z);
        this.docLength = i;
    }

    public int getDocLength() {
        return this.docLength;
    }
}
