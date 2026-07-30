package org.spongycastle.crypto.params;

import org.spongycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class AsymmetricKeyParameter implements CipherParameters {
    boolean privateKey;

    public AsymmetricKeyParameter(boolean z) {
        this.privateKey = z;
    }

    public boolean isPrivate() {
        return this.privateKey;
    }
}
