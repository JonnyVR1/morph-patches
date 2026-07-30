package org.spongycastle.crypto.engines;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class AESWrapPadEngine extends RFC5649WrapEngine {
    public AESWrapPadEngine() {
        super(new AESEngine());
    }
}
