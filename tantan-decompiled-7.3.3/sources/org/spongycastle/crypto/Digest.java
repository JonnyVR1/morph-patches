package org.spongycastle.crypto;

/* JADX INFO: loaded from: classes3.dex */
public interface Digest {
    int doFinal(byte[] bArr, int i);

    String getAlgorithmName();

    int getDigestSize();

    void reset();

    void update(byte b);

    void update(byte[] bArr, int i, int i2);
}
