package org.spongycastle.crypto.engines;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class CamelliaWrapEngine extends RFC3394WrapEngine {
    public CamelliaWrapEngine() {
        super(new CamelliaEngine());
    }
}
