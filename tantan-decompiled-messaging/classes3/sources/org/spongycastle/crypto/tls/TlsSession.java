package org.spongycastle.crypto.tls;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface TlsSession {
    SessionParameters exportSessionParameters();

    byte[] getSessionID();

    void invalidate();

    boolean isResumable();
}
