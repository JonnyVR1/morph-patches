package org.spongycastle.crypto.modes;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.InvalidCipherTextException;

/* JADX INFO: loaded from: classes3.dex */
public interface AEADBlockCipher {
    int doFinal(byte[] bArr, int i) throws IllegalStateException, InvalidCipherTextException;

    String getAlgorithmName();

    byte[] getMac();

    int getOutputSize(int i);

    BlockCipher getUnderlyingCipher();

    int getUpdateOutputSize(int i);

    void init(boolean z, CipherParameters cipherParameters) throws IllegalArgumentException;

    void processAADByte(byte b);

    void processAADBytes(byte[] bArr, int i, int i2);

    int processByte(byte b, byte[] bArr, int i) throws DataLengthException;

    int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException;

    void reset();
}
