package org.spongycastle.crypto.engines;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class SEEDWrapEngine extends RFC3394WrapEngine {
    public SEEDWrapEngine() {
        super(new SEEDEngine());
    }
}
