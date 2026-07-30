package org.spongycastle.crypto.prng;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface EntropySource {
    int entropySize();

    byte[] getEntropy();

    boolean isPredictionResistant();
}
