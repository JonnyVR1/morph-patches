package org.spongycastle.crypto.tls;

import java.io.IOException;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface TlsPeer {
    TlsCipher getCipher() throws IOException;

    TlsCompression getCompression() throws IOException;

    void notifyAlertRaised(short s, short s2, String str, Throwable th);

    void notifyAlertReceived(short s, short s2);

    void notifyHandshakeComplete() throws IOException;

    void notifySecureRenegotiation(boolean z) throws IOException;

    boolean shouldUseGMTUnixTime();
}
