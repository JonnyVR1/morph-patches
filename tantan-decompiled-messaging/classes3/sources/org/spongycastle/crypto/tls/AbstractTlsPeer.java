package org.spongycastle.crypto.tls;

import java.io.IOException;
import p003l.csi0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class AbstractTlsPeer implements TlsPeer {
    @Override // org.spongycastle.crypto.tls.TlsPeer
    public void notifyAlertRaised(short s, short s2, String str, Throwable th) {
    }

    @Override // org.spongycastle.crypto.tls.TlsPeer
    public void notifyAlertReceived(short s, short s2) {
    }

    @Override // org.spongycastle.crypto.tls.TlsPeer
    public void notifyHandshakeComplete() throws IOException {
    }

    @Override // org.spongycastle.crypto.tls.TlsPeer
    public void notifySecureRenegotiation(boolean z) throws IOException {
        if (z) {
            return;
        }
        csi0.m3424a(40);
    }

    @Override // org.spongycastle.crypto.tls.TlsPeer
    public boolean shouldUseGMTUnixTime() {
        return false;
    }
}
