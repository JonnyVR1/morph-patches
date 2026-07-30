package org.spongycastle.crypto.modes;

import l.ig3;
import l.qkq0;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.SkippingStreamCipher;
import org.spongycastle.crypto.StreamBlockCipher;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Pack;
import p003l.pac0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class SICBlockCipher extends StreamBlockCipher implements SkippingStreamCipher {

    /* JADX INFO: renamed from: IV */
    private byte[] f10297IV;
    private final int blockSize;
    private int byteCount;
    private final BlockCipher cipher;
    private byte[] counter;
    private byte[] counterOut;

    public SICBlockCipher(BlockCipher blockCipher) {
        super(blockCipher);
        this.cipher = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.f10297IV = new byte[blockSize];
        this.counter = new byte[blockSize];
        this.counterOut = new byte[blockSize];
        this.byteCount = 0;
    }

    private void adjustCounter(long j) {
        long j2;
        long j3;
        int i = this.byteCount;
        int i2 = 5;
        if (j >= 0) {
            long j4 = (((long) i) + j) / ((long) this.blockSize);
            if (j4 > 255) {
                j3 = j4;
                while (i2 >= 1) {
                    long j5 = 1 << (i2 * 8);
                    while (j3 >= j5) {
                        incrementCounterAt(i2);
                        j3 -= j5;
                    }
                    i2--;
                }
            } else {
                j3 = j4;
            }
            incrementCounter((int) j3);
            this.byteCount = (int) ((j + ((long) this.byteCount)) - (((long) this.blockSize) * j4));
            return;
        }
        long j6 = ((-j) - ((long) i)) / ((long) this.blockSize);
        if (j6 > 255) {
            j2 = j6;
            while (i2 >= 1) {
                long j7 = 1 << (i2 * 8);
                while (j2 > j7) {
                    decrementCounterAt(i2);
                    j2 -= j7;
                }
                i2--;
            }
        } else {
            j2 = j6;
        }
        for (long j8 = 0; j8 != j2; j8++) {
            decrementCounterAt(0);
        }
        int i3 = (int) (((long) this.byteCount) + j + (((long) this.blockSize) * j6));
        if (i3 >= 0) {
            this.byteCount = 0;
        } else {
            decrementCounterAt(0);
            this.byteCount = this.blockSize + i3;
        }
    }

    private void checkCounter() {
        if (this.f10297IV.length >= this.blockSize) {
            return;
        }
        int i = 0;
        while (true) {
            byte[] bArr = this.f10297IV;
            if (i == bArr.length) {
                return;
            }
            if (this.counter[i] != bArr[i]) {
                qkq0.a("Counter in CTR/SIC mode out of range.");
                return;
            }
            i++;
        }
    }

    private void decrementCounterAt(int i) {
        byte b;
        int length = this.counter.length - i;
        do {
            length--;
            if (length < 0) {
                return;
            }
            byte[] bArr = this.counter;
            b = (byte) (bArr[length] - 1);
            bArr[length] = b;
        } while (b == -1);
    }

    private void incrementCounter(int i) {
        byte[] bArr = this.counter;
        byte b = bArr[bArr.length - 1];
        int length = bArr.length - 1;
        bArr[length] = (byte) (bArr[length] + i);
        if (b == 0 || bArr[bArr.length - 1] >= b) {
            return;
        }
        incrementCounterAt(1);
    }

    private void incrementCounterAt(int i) {
        byte b;
        int length = this.counter.length - i;
        do {
            length--;
            if (length < 0) {
                return;
            }
            byte[] bArr = this.counter;
            b = (byte) (bArr[length] + 1);
            bArr[length] = b;
        } while (b == 0);
    }

    @Override // org.spongycastle.crypto.StreamBlockCipher
    public byte calculateByte(byte b) throws IllegalStateException, DataLengthException {
        int i = this.byteCount;
        if (i == 0) {
            this.cipher.processBlock(this.counter, 0, this.counterOut, 0);
            byte[] bArr = this.counterOut;
            int i2 = this.byteCount;
            this.byteCount = i2 + 1;
            return (byte) (bArr[i2] ^ b);
        }
        byte[] bArr2 = this.counterOut;
        int i3 = i + 1;
        this.byteCount = i3;
        byte b2 = (byte) (b ^ bArr2[i]);
        if (i3 == this.counter.length) {
            this.byteCount = 0;
            incrementCounterAt(0);
            checkCounter();
        }
        return b2;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + "/SIC";
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.cipher.getBlockSize();
    }

    @Override // org.spongycastle.crypto.SkippingCipher
    public long getPosition() {
        byte[] bArr = this.counter;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        int i = length - 1;
        while (i >= 1) {
            byte[] bArr3 = this.f10297IV;
            int i2 = i < bArr3.length ? (bArr2[i] & 255) - (bArr3[i] & 255) : bArr2[i] & 255;
            if (i2 < 0) {
                int i3 = i - 1;
                bArr2[i3] = (byte) (bArr2[i3] - 1);
                i2 += 256;
            }
            bArr2[i] = (byte) i2;
            i--;
        }
        return (Pack.bigEndianToLong(bArr2, length - 8) * ((long) this.blockSize)) + ((long) this.byteCount);
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void init(boolean z, CipherParameters cipherParameters) throws IllegalArgumentException {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            ig3.a("CTR/SIC mode requires ParametersWithIV");
            return;
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] bArrClone = Arrays.clone(parametersWithIV.getIV());
        this.f10297IV = bArrClone;
        int i = this.blockSize;
        if (i < bArrClone.length) {
            pac0.m6817a("CTR/SIC mode requires IV no greater than: ", this.blockSize, " bytes.");
            return;
        }
        int i2 = 8 > i / 2 ? i / 2 : 8;
        if (i - bArrClone.length > i2) {
            pac0.m6817a("CTR/SIC mode requires IV of at least: ", this.blockSize - i2, " bytes.");
            return;
        }
        if (parametersWithIV.getParameters() != null) {
            this.cipher.init(true, parametersWithIV.getParameters());
        }
        reset();
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws IllegalStateException, DataLengthException {
        processBytes(bArr, i, this.blockSize, bArr2, i2);
        return this.blockSize;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void reset() {
        Arrays.fill(this.counter, (byte) 0);
        byte[] bArr = this.f10297IV;
        System.arraycopy(bArr, 0, this.counter, 0, bArr.length);
        this.cipher.reset();
        this.byteCount = 0;
    }

    @Override // org.spongycastle.crypto.SkippingCipher
    public long seekTo(long j) {
        reset();
        return skip(j);
    }

    @Override // org.spongycastle.crypto.SkippingCipher
    public long skip(long j) {
        adjustCounter(j);
        checkCounter();
        this.cipher.processBlock(this.counter, 0, this.counterOut, 0);
        return j;
    }
}
