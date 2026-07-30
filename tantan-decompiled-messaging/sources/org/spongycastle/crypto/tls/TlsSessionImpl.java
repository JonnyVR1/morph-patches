package org.spongycastle.crypto.tls;

import org.spongycastle.util.Arrays;
import p149l.ig3;

/* JADX INFO: loaded from: classes3.dex */
class TlsSessionImpl implements TlsSession {
    final byte[] sessionID;
    SessionParameters sessionParameters;

    public TlsSessionImpl(byte[] bArr, SessionParameters sessionParameters) {
        if (bArr == null) {
            ig3.m135964a("'sessionID' cannot be null");
            throw null;
        }
        if (bArr.length < 1 || bArr.length > 32) {
            ig3.m135964a("'sessionID' must have length between 1 and 32 bytes, inclusive");
            throw null;
        }
        this.sessionID = Arrays.clone(bArr);
        this.sessionParameters = sessionParameters;
    }

    @Override // org.spongycastle.crypto.tls.TlsSession
    public synchronized SessionParameters exportSessionParameters() {
        SessionParameters sessionParameters;
        sessionParameters = this.sessionParameters;
        return sessionParameters == null ? null : sessionParameters.copy();
    }

    @Override // org.spongycastle.crypto.tls.TlsSession
    public synchronized byte[] getSessionID() {
        return this.sessionID;
    }

    @Override // org.spongycastle.crypto.tls.TlsSession
    public synchronized void invalidate() {
        SessionParameters sessionParameters = this.sessionParameters;
        if (sessionParameters != null) {
            sessionParameters.clear();
            this.sessionParameters = null;
        }
    }

    @Override // org.spongycastle.crypto.tls.TlsSession
    public synchronized boolean isResumable() {
        return this.sessionParameters != null;
    }
}
