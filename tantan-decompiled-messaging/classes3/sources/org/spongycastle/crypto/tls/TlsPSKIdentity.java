package org.spongycastle.crypto.tls;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface TlsPSKIdentity {
    byte[] getPSK();

    byte[] getPSKIdentity();

    void notifyIdentityHint(byte[] bArr);

    void skipIdentityHint();
}
