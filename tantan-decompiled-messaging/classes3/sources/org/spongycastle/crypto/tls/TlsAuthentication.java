package org.spongycastle.crypto.tls;

import java.io.IOException;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface TlsAuthentication {
    TlsCredentials getClientCredentials(CertificateRequest certificateRequest) throws IOException;

    void notifyServerCertificate(Certificate certificate) throws IOException;
}
