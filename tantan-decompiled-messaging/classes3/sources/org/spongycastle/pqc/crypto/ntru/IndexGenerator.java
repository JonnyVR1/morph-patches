package org.spongycastle.pqc.crypto.ntru;

import org.spongycastle.crypto.Digest;
import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class IndexGenerator {

    /* JADX INFO: renamed from: N */
    private int f10568N;
    private BitString buf;

    /* JADX INFO: renamed from: c */
    private int f10569c;
    private int hLen;
    private Digest hashAlg;
    private boolean initialized;
    private int minCallsR;
    private byte[] seed;
    private int totLen = 0;
    private int remLen = 0;
    private int counter = 0;

    public IndexGenerator(byte[] bArr, NTRUEncryptionParameters nTRUEncryptionParameters) {
        this.seed = bArr;
        this.f10568N = nTRUEncryptionParameters.f10577N;
        this.f10569c = nTRUEncryptionParameters.f10578c;
        this.minCallsR = nTRUEncryptionParameters.minCallsR;
        Digest digest = nTRUEncryptionParameters.hashAlg;
        this.hashAlg = digest;
        this.hLen = digest.getDigestSize();
        this.initialized = false;
    }

    private void appendHash(BitString bitString, byte[] bArr) {
        Digest digest = this.hashAlg;
        byte[] bArr2 = this.seed;
        digest.update(bArr2, 0, bArr2.length);
        putInt(this.hashAlg, this.counter);
        this.hashAlg.doFinal(bArr, 0);
        bitString.appendBits(bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] copyOf(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        if (i >= bArr.length) {
            i = bArr.length;
        }
        System.arraycopy(bArr, 0, bArr2, 0, i);
        return bArr2;
    }

    private void putInt(Digest digest, int i) {
        digest.update((byte) (i >> 24));
        digest.update((byte) (i >> 16));
        digest.update((byte) (i >> 8));
        digest.update((byte) i);
    }

    public int nextIndex() {
        int leadingAsInt;
        int i;
        int i2;
        int i3;
        if (!this.initialized) {
            this.buf = new BitString();
            byte[] bArr = new byte[this.hashAlg.getDigestSize()];
            while (true) {
                int i4 = this.counter;
                i3 = this.minCallsR;
                if (i4 >= i3) {
                    break;
                }
                appendHash(this.buf, bArr);
                this.counter++;
            }
            int i5 = i3 * 8 * this.hLen;
            this.totLen = i5;
            this.remLen = i5;
            this.initialized = true;
        }
        do {
            this.totLen += this.f10569c;
            BitString trailing = this.buf.getTrailing(this.remLen);
            int i6 = this.remLen;
            int i7 = this.f10569c;
            if (i6 < i7) {
                int i8 = i7 - i6;
                int i9 = this.counter;
                int i10 = this.hLen;
                int i11 = i9 + (((i8 + i10) - 1) / i10);
                byte[] bArr2 = new byte[this.hashAlg.getDigestSize()];
                while (this.counter < i11) {
                    appendHash(trailing, bArr2);
                    this.counter++;
                    int i12 = this.hLen;
                    if (i8 > i12 * 8) {
                        i8 -= i12 * 8;
                    }
                }
                this.remLen = (this.hLen * 8) - i8;
                BitString bitString = new BitString();
                this.buf = bitString;
                bitString.appendBits(bArr2);
            } else {
                this.remLen = i6 - i7;
            }
            leadingAsInt = trailing.getLeadingAsInt(this.f10569c);
            i = this.f10569c;
            i2 = this.f10568N;
        } while (leadingAsInt >= (1 << i) - ((1 << i) % i2));
        return leadingAsInt % i2;
    }

    public static class BitString {
        byte[] bytes = new byte[4];
        int lastByteBits;
        int numBytes;

        public void appendBits(byte b) {
            int i = this.numBytes;
            byte[] bArr = this.bytes;
            if (i == bArr.length) {
                this.bytes = IndexGenerator.copyOf(bArr, bArr.length * 2);
            }
            int i2 = this.numBytes;
            if (i2 == 0) {
                this.numBytes = 1;
                this.bytes[0] = b;
                this.lastByteBits = 8;
                return;
            }
            int i3 = this.lastByteBits;
            byte[] bArr2 = this.bytes;
            if (i3 == 8) {
                this.numBytes = i2 + 1;
                bArr2[i2] = b;
                return;
            }
            int i4 = i2 - 1;
            int i5 = b & 255;
            bArr2[i4] = (byte) ((i5 << i3) | bArr2[i4]);
            this.numBytes = i2 + 1;
            bArr2[i2] = (byte) (i5 >> (8 - i3));
        }

        public byte[] getBytes() {
            return Arrays.clone(this.bytes);
        }

        public int getLeadingAsInt(int i) {
            int i2 = (((this.numBytes - 1) * 8) + this.lastByteBits) - i;
            int i3 = i2 / 8;
            int i4 = i2 % 8;
            int i5 = (this.bytes[i3] & 255) >>> i4;
            int i6 = 8 - i4;
            while (true) {
                i3++;
                if (i3 >= this.numBytes) {
                    return i5;
                }
                i5 |= (this.bytes[i3] & 255) << i6;
                i6 += 8;
            }
        }

        public BitString getTrailing(int i) {
            int i2;
            BitString bitString = new BitString();
            int i3 = (i + 7) / 8;
            bitString.numBytes = i3;
            bitString.bytes = new byte[i3];
            int i4 = 0;
            while (true) {
                i2 = bitString.numBytes;
                if (i4 >= i2) {
                    break;
                }
                bitString.bytes[i4] = this.bytes[i4];
                i4++;
            }
            int i5 = i % 8;
            bitString.lastByteBits = i5;
            if (i5 == 0) {
                bitString.lastByteBits = 8;
                return bitString;
            }
            int i6 = 32 - i5;
            byte[] bArr = bitString.bytes;
            bArr[i2 - 1] = (byte) ((bArr[i2 - 1] << i6) >>> i6);
            return bitString;
        }

        public void appendBits(byte[] bArr) {
            for (int i = 0; i != bArr.length; i++) {
                appendBits(bArr[i]);
            }
        }
    }
}
