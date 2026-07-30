package org.spongycastle.crypto.tls;

/* JADX INFO: loaded from: classes3.dex */
public interface TlsPSKIdentityManager {
    byte[] getHint();

    byte[] getPSK(byte[] bArr);
}
