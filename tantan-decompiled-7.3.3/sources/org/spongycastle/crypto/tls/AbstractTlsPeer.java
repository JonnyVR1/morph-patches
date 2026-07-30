package org.spongycastle.crypto.tls;

import java.io.IOException;
import p153l.f1j0;

/* JADX INFO: loaded from: classes3.dex */
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
        f1j0.m123577a(40);
    }

    @Override // org.spongycastle.crypto.tls.TlsPeer
    public boolean shouldUseGMTUnixTime() {
        return false;
    }
}
