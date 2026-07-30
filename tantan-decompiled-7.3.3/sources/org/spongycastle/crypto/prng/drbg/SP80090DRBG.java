package org.spongycastle.crypto.prng.drbg;

/* JADX INFO: loaded from: classes3.dex */
public interface SP80090DRBG {
    int generate(byte[] bArr, byte[] bArr2, boolean z);

    int getBlockSize();

    void reseed(byte[] bArr);
}
