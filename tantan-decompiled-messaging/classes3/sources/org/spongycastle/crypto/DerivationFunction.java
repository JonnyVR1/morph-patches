package org.spongycastle.crypto;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface DerivationFunction {
    int generateBytes(byte[] bArr, int i, int i2) throws DataLengthException, IllegalArgumentException;

    void init(DerivationParameters derivationParameters);
}
