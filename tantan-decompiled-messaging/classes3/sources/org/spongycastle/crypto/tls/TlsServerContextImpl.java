package org.spongycastle.crypto.tls;

import java.security.SecureRandom;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
class TlsServerContextImpl extends AbstractTlsContext implements TlsServerContext {
    public TlsServerContextImpl(SecureRandom secureRandom, SecurityParameters securityParameters) {
        super(secureRandom, securityParameters);
    }

    @Override // org.spongycastle.crypto.tls.TlsContext
    public boolean isServer() {
        return true;
    }
}
