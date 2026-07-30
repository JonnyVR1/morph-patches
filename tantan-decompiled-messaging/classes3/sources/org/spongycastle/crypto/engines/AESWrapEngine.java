package org.spongycastle.crypto.engines;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class AESWrapEngine extends RFC3394WrapEngine {
    public AESWrapEngine() {
        super(new AESEngine());
    }

    public AESWrapEngine(boolean z) {
        super(new AESEngine(), z);
    }
}
