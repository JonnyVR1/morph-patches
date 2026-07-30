package org.spongycastle.crypto.modes.gcm;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface GCMExponentiator {
    void exponentiateX(long j, byte[] bArr);

    void init(byte[] bArr);
}
