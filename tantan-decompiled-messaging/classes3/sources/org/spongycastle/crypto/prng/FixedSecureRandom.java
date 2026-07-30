package org.spongycastle.crypto.prng;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.SecureRandom;
import l.ig3;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class FixedSecureRandom extends SecureRandom {
    private byte[] _data;
    private int _index;
    private int _intPad;

    public FixedSecureRandom(boolean z, byte[][] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i = 0; i != bArr.length; i++) {
            try {
                byteArrayOutputStream.write(bArr[i]);
            } catch (IOException unused) {
                ig3.a("can't save value array.");
                throw null;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        this._data = byteArray;
        if (z) {
            this._intPad = byteArray.length % 4;
        }
    }

    private int nextValue() {
        byte[] bArr = this._data;
        int i = this._index;
        this._index = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.security.SecureRandom
    public byte[] generateSeed(int i) {
        byte[] bArr = new byte[i];
        nextBytes(bArr);
        return bArr;
    }

    public boolean isExhausted() {
        return this._index == this._data.length;
    }

    @Override // java.security.SecureRandom, java.util.Random
    public void nextBytes(byte[] bArr) {
        System.arraycopy(this._data, this._index, bArr, 0, bArr.length);
        this._index += bArr.length;
    }

    @Override // java.util.Random
    public int nextInt() {
        int iNextValue = (nextValue() << 24) | (nextValue() << 16);
        int i = this._intPad;
        if (i == 2) {
            this._intPad = i - 1;
        } else {
            iNextValue |= nextValue() << 8;
        }
        int i2 = this._intPad;
        if (i2 != 1) {
            return nextValue() | iNextValue;
        }
        this._intPad = i2 - 1;
        return iNextValue;
    }

    @Override // java.util.Random
    public long nextLong() {
        return (((long) nextValue()) << 56) | (((long) nextValue()) << 48) | (((long) nextValue()) << 40) | (((long) nextValue()) << 32) | (((long) nextValue()) << 24) | (((long) nextValue()) << 16) | (((long) nextValue()) << 8) | ((long) nextValue());
    }

    public FixedSecureRandom(byte[][] bArr) {
        this(false, bArr);
    }

    public FixedSecureRandom(boolean z, byte[] bArr) {
        this(z, new byte[][]{bArr});
    }

    public FixedSecureRandom(byte[] bArr) {
        this(false, new byte[][]{bArr});
    }
}
