package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.MaxBytesExceededException;
import org.spongycastle.crypto.SkippingStreamCipher;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.util.Pack;
import org.spongycastle.util.Strings;
import p153l.C17103g;
import p153l.fig0;
import p153l.iki;
import p153l.rrc0;
import p153l.tyk0;
import p153l.wg3;
import p153l.wtq0;

/* JADX INFO: loaded from: classes3.dex */
public class Salsa20Engine implements SkippingStreamCipher {
    public static final int DEFAULT_ROUNDS = 20;
    private static final int STATE_SIZE = 16;
    protected static final byte[] sigma = Strings.toByteArray("expand 32-byte k");
    protected static final byte[] tau = Strings.toByteArray("expand 16-byte k");
    private int cW0;
    private int cW1;
    private int cW2;
    protected int[] engineState;
    private int index;
    private boolean initialised;
    private byte[] keyStream;
    protected int rounds;

    /* JADX INFO: renamed from: x */
    protected int[] f207502x;

    public Salsa20Engine(int i) {
        this.index = 0;
        this.engineState = new int[16];
        this.f207502x = new int[16];
        this.keyStream = new byte[64];
        this.initialised = false;
        if (i <= 0 || (i & 1) != 0) {
            wg3.m206174a("'rounds' must be a positive, even number");
            throw null;
        }
        this.rounds = i;
    }

    private boolean limitExceeded(int i) {
        int i2 = this.cW0 + i;
        this.cW0 = i2;
        if (i2 < i && i2 >= 0) {
            int i3 = this.cW1 + 1;
            this.cW1 = i3;
            if (i3 == 0) {
                int i4 = this.cW2 + 1;
                this.cW2 = i4;
                if ((i4 & 32) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    private void resetLimitCounter() {
        this.cW0 = 0;
        this.cW1 = 0;
        this.cW2 = 0;
    }

    public static int rotl(int i, int i2) {
        return (i >>> (-i2)) | (i << i2);
    }

    public static void salsaCore(int i, int[] iArr, int[] iArr2) {
        if (iArr.length != 16) {
            fig0.m125680a();
            return;
        }
        if (iArr2.length != 16) {
            fig0.m125680a();
            return;
        }
        if (i % 2 != 0) {
            wg3.m206174a("Number of rounds must be even");
            return;
        }
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        char c = 3;
        int i5 = iArr[3];
        char c2 = 4;
        int i6 = iArr[4];
        char c3 = 5;
        int i7 = iArr[5];
        char c4 = 6;
        int i8 = iArr[6];
        int i9 = 7;
        int i10 = iArr[7];
        int i11 = iArr[8];
        int i12 = 9;
        int i13 = iArr[9];
        int i14 = iArr[10];
        int i15 = iArr[11];
        int i16 = iArr[12];
        int i17 = 13;
        int i18 = iArr[13];
        int i19 = iArr[14];
        int iRotl = iArr[15];
        int iRotl2 = i19;
        int iRotl3 = i18;
        int iRotl4 = i16;
        int iRotl5 = i15;
        int iRotl6 = i14;
        int i20 = i13;
        int i21 = i11;
        int i22 = i10;
        int i23 = i8;
        int iRotl7 = i7;
        int i24 = i6;
        int i25 = i5;
        int i26 = i4;
        int i27 = i3;
        int iRotl8 = i2;
        int i28 = i;
        while (i28 > 0) {
            char c5 = c;
            int iRotl9 = rotl(iRotl8 + iRotl4, i9) ^ i24;
            int iRotl10 = i21 ^ rotl(iRotl9 + iRotl8, i12);
            char c6 = c2;
            int iRotl11 = iRotl4 ^ rotl(iRotl10 + iRotl9, i17);
            char c7 = c3;
            char c8 = c4;
            int iRotl12 = iRotl8 ^ rotl(iRotl11 + iRotl10, 18);
            int iRotl13 = i20 ^ rotl(iRotl7 + i27, i9);
            int iRotl14 = iRotl3 ^ rotl(iRotl13 + iRotl7, i12);
            int iRotl15 = rotl(iRotl14 + iRotl13, i17) ^ i27;
            int iRotl16 = rotl(iRotl15 + iRotl14, 18) ^ iRotl7;
            int iRotl17 = iRotl2 ^ rotl(iRotl6 + i23, 7);
            int iRotl18 = i26 ^ rotl(iRotl17 + iRotl6, 9);
            int iRotl19 = i23 ^ rotl(iRotl18 + iRotl17, 13);
            int iRotl20 = iRotl6 ^ rotl(iRotl19 + iRotl18, 18);
            int iRotl21 = i25 ^ rotl(iRotl + iRotl5, 7);
            int iRotl22 = i22 ^ rotl(iRotl21 + iRotl, 9);
            int iRotl23 = iRotl5 ^ rotl(iRotl22 + iRotl21, 13);
            int iRotl24 = iRotl ^ rotl(iRotl23 + iRotl22, 18);
            int iRotl25 = iRotl15 ^ rotl(iRotl12 + iRotl21, 7);
            int iRotl26 = rotl(iRotl25 + iRotl12, 9) ^ iRotl18;
            int iRotl27 = iRotl21 ^ rotl(iRotl26 + iRotl25, 13);
            iRotl8 = iRotl12 ^ rotl(iRotl27 + iRotl26, 18);
            int iRotl28 = rotl(iRotl16 + iRotl9, 7) ^ iRotl19;
            int iRotl29 = rotl(iRotl28 + iRotl16, 9) ^ iRotl22;
            int iRotl30 = iRotl9 ^ rotl(iRotl29 + iRotl28, 13);
            iRotl7 = iRotl16 ^ rotl(iRotl30 + iRotl29, 18);
            iRotl5 = iRotl23 ^ rotl(iRotl20 + iRotl13, 7);
            int iRotl31 = rotl(iRotl5 + iRotl20, 9) ^ iRotl10;
            int iRotl32 = rotl(iRotl31 + iRotl5, 13) ^ iRotl13;
            iRotl6 = iRotl20 ^ rotl(iRotl32 + iRotl31, 18);
            iRotl4 = iRotl11 ^ rotl(iRotl24 + iRotl17, 7);
            iRotl3 = iRotl14 ^ rotl(iRotl4 + iRotl24, 9);
            iRotl2 = iRotl17 ^ rotl(iRotl3 + iRotl4, 13);
            iRotl = iRotl24 ^ rotl(iRotl2 + iRotl3, 18);
            i28 -= 2;
            i21 = iRotl31;
            i27 = iRotl25;
            i23 = iRotl28;
            i24 = iRotl30;
            i22 = iRotl29;
            i20 = iRotl32;
            c = c5;
            c2 = c6;
            c3 = c7;
            c4 = c8;
            i9 = 7;
            i26 = iRotl26;
            i25 = iRotl27;
            i12 = 9;
            i17 = 13;
        }
        char c9 = c;
        char c10 = c2;
        char c11 = c3;
        char c12 = c4;
        iArr2[0] = iRotl8 + iArr[0];
        iArr2[1] = i27 + iArr[1];
        iArr2[2] = i26 + iArr[2];
        iArr2[c9] = i25 + iArr[c9];
        iArr2[c10] = i24 + iArr[c10];
        iArr2[c11] = iRotl7 + iArr[c11];
        iArr2[c12] = i23 + iArr[c12];
        iArr2[7] = i22 + iArr[7];
        iArr2[8] = i21 + iArr[8];
        iArr2[9] = i20 + iArr[9];
        iArr2[10] = iRotl6 + iArr[10];
        iArr2[11] = iRotl5 + iArr[11];
        iArr2[12] = iRotl4 + iArr[12];
        iArr2[13] = iRotl3 + iArr[13];
        iArr2[14] = iRotl2 + iArr[14];
        iArr2[15] = iRotl + iArr[15];
    }

    public void advanceCounter(long j) {
        int i = (int) (j >>> 32);
        int i2 = (int) j;
        if (i > 0) {
            int[] iArr = this.engineState;
            iArr[9] = iArr[9] + i;
        }
        int[] iArr2 = this.engineState;
        int i3 = iArr2[8];
        int i4 = i2 + i3;
        iArr2[8] = i4;
        if (i3 == 0 || i4 >= i3) {
            return;
        }
        iArr2[9] = iArr2[9] + 1;
    }

    public void generateKeyStream(byte[] bArr) {
        salsaCore(this.rounds, this.engineState, this.f207502x);
        Pack.intToLittleEndian(this.f207502x, bArr, 0);
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        if (this.rounds == 20) {
            return "Salsa20";
        }
        return "Salsa20/" + this.rounds;
    }

    public long getCounter() {
        int[] iArr = this.engineState;
        return (((long) iArr[9]) << 32) | (((long) iArr[8]) & 4294967295L);
    }

    public int getNonceSize() {
        return 8;
    }

    @Override // org.spongycastle.crypto.SkippingCipher
    public long getPosition() {
        return (getCounter() * 64) + ((long) this.index);
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            iki.m140324a(getAlgorithmName(), " Init parameters must include an IV");
            return;
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] iv = parametersWithIV.getIV();
        if (iv == null || iv.length != getNonceSize()) {
            throw new IllegalArgumentException(getAlgorithmName() + " requires exactly " + getNonceSize() + " bytes of IV");
        }
        CipherParameters parameters = parametersWithIV.getParameters();
        if (parameters == null) {
            if (!this.initialised) {
                rrc0.m182720a(getAlgorithmName(), " KeyParameter can not be null for first initialisation");
                return;
            }
            setKey(null, iv);
        } else {
            if (!(parameters instanceof KeyParameter)) {
                iki.m140324a(getAlgorithmName(), " Init parameters must contain a KeyParameter (or null for re-init)");
                return;
            }
            setKey(((KeyParameter) parameters).getKey(), iv);
        }
        reset();
        this.initialised = true;
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (!this.initialised) {
            rrc0.m182720a(getAlgorithmName(), " not initialised");
            return 0;
        }
        if (i + i2 > bArr.length) {
            tyk0.m193596a("input buffer too short");
            return 0;
        }
        if (i3 + i2 > bArr2.length) {
            C17103g.m128363a("output buffer too short");
            return 0;
        }
        if (limitExceeded(i2)) {
            throw new MaxBytesExceededException("2^70 byte limit per IV would be exceeded; Change IV");
        }
        for (int i4 = 0; i4 < i2; i4++) {
            byte[] bArr3 = this.keyStream;
            int i5 = this.index;
            bArr2[i4 + i3] = (byte) (bArr3[i5] ^ bArr[i4 + i]);
            int i6 = (i5 + 1) & 63;
            this.index = i6;
            if (i6 == 0) {
                advanceCounter();
                generateKeyStream(this.keyStream);
            }
        }
        return i2;
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public void reset() {
        this.index = 0;
        resetLimitCounter();
        resetCounter();
        generateKeyStream(this.keyStream);
    }

    public void resetCounter() {
        int[] iArr = this.engineState;
        iArr[9] = 0;
        iArr[8] = 0;
    }

    public void retreatCounter(long j) {
        int i = (int) (j >>> 32);
        int i2 = (int) j;
        if (i != 0) {
            int[] iArr = this.engineState;
            int i3 = iArr[9];
            if ((((long) i3) & 4294967295L) < (((long) i) & 4294967295L)) {
                wtq0.m207906a("attempt to reduce counter past zero.");
                return;
            }
            iArr[9] = i3 - i;
        }
        int[] iArr2 = this.engineState;
        int i4 = iArr2[8];
        if ((((long) i4) & 4294967295L) >= (4294967295L & ((long) i2))) {
            iArr2[8] = i4 - i2;
            return;
        }
        int i5 = iArr2[9];
        if (i5 == 0) {
            wtq0.m207906a("attempt to reduce counter past zero.");
        } else {
            iArr2[9] = i5 - 1;
            iArr2[8] = i4 - i2;
        }
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public byte returnByte(byte b) {
        if (limitExceeded()) {
            throw new MaxBytesExceededException("2^70 byte limit per IV; Change IV");
        }
        byte[] bArr = this.keyStream;
        int i = this.index;
        byte b2 = (byte) (b ^ bArr[i]);
        int i2 = (i + 1) & 63;
        this.index = i2;
        if (i2 == 0) {
            advanceCounter();
            generateKeyStream(this.keyStream);
        }
        return b2;
    }

    @Override // org.spongycastle.crypto.SkippingCipher
    public long seekTo(long j) {
        reset();
        return skip(j);
    }

    public void setKey(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        if (bArr != null) {
            int i = 16;
            if (bArr.length != 16 && bArr.length != 32) {
                iki.m140324a(getAlgorithmName(), " requires 128 bit or 256 bit key");
                return;
            }
            this.engineState[1] = Pack.littleEndianToInt(bArr, 0);
            this.engineState[2] = Pack.littleEndianToInt(bArr, 4);
            this.engineState[3] = Pack.littleEndianToInt(bArr, 8);
            this.engineState[4] = Pack.littleEndianToInt(bArr, 12);
            if (bArr.length == 32) {
                bArr3 = sigma;
            } else {
                bArr3 = tau;
                i = 0;
            }
            this.engineState[11] = Pack.littleEndianToInt(bArr, i);
            this.engineState[12] = Pack.littleEndianToInt(bArr, i + 4);
            this.engineState[13] = Pack.littleEndianToInt(bArr, i + 8);
            this.engineState[14] = Pack.littleEndianToInt(bArr, i + 12);
            this.engineState[0] = Pack.littleEndianToInt(bArr3, 0);
            this.engineState[5] = Pack.littleEndianToInt(bArr3, 4);
            this.engineState[10] = Pack.littleEndianToInt(bArr3, 8);
            this.engineState[15] = Pack.littleEndianToInt(bArr3, 12);
        }
        this.engineState[6] = Pack.littleEndianToInt(bArr2, 0);
        this.engineState[7] = Pack.littleEndianToInt(bArr2, 4);
    }

    @Override // org.spongycastle.crypto.SkippingCipher
    public long skip(long j) {
        long j2;
        if (j >= 0) {
            if (j >= 64) {
                long j3 = j / 64;
                advanceCounter(j3);
                j2 = j - (j3 * 64);
            } else {
                j2 = j;
            }
            int i = this.index;
            int i2 = (((int) j2) + i) & 63;
            this.index = i2;
            if (i2 < i) {
                advanceCounter();
            }
        } else {
            long j4 = -j;
            if (j4 >= 64) {
                long j5 = j4 / 64;
                retreatCounter(j5);
                j4 -= j5 * 64;
            }
            for (long j6 = 0; j6 < j4; j6++) {
                if (this.index == 0) {
                    retreatCounter();
                }
                this.index = (this.index - 1) & 63;
            }
        }
        generateKeyStream(this.keyStream);
        return j;
    }

    private boolean limitExceeded() {
        int i = this.cW0 + 1;
        this.cW0 = i;
        if (i == 0) {
            int i2 = this.cW1 + 1;
            this.cW1 = i2;
            if (i2 == 0) {
                int i3 = this.cW2 + 1;
                this.cW2 = i3;
                if ((i3 & 32) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public void advanceCounter() {
        int[] iArr = this.engineState;
        int i = iArr[8] + 1;
        iArr[8] = i;
        if (i == 0) {
            iArr[9] = iArr[9] + 1;
        }
    }

    public Salsa20Engine() {
        this(20);
    }

    public void retreatCounter() {
        int[] iArr = this.engineState;
        int i = iArr[8];
        if (i == 0 && iArr[9] == 0) {
            wtq0.m207906a("attempt to reduce counter past zero.");
            return;
        }
        int i2 = i - 1;
        iArr[8] = i2;
        if (i2 == -1) {
            iArr[9] = iArr[9] - 1;
        }
    }
}
