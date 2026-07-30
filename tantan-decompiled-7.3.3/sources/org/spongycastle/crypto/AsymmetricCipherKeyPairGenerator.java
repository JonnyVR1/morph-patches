package org.spongycastle.crypto;

/* JADX INFO: loaded from: classes3.dex */
public interface AsymmetricCipherKeyPairGenerator {
    AsymmetricCipherKeyPair generateKeyPair();

    void init(KeyGenerationParameters keyGenerationParameters);
}
