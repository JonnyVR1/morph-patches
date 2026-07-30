package org.spongycastle.crypto.tls;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class ServerOnlyTlsAuthentication implements TlsAuthentication {
    @Override // org.spongycastle.crypto.tls.TlsAuthentication
    public final TlsCredentials getClientCredentials(CertificateRequest certificateRequest) {
        return null;
    }
}
