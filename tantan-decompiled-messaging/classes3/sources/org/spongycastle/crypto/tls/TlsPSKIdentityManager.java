package org.spongycastle.crypto.tls;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface TlsPSKIdentityManager {
    byte[] getHint();

    byte[] getPSK(byte[] bArr);
}
