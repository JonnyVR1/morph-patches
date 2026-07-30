package org.spongycastle.crypto.engines;

import okio.Utf8;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.signers.PSSSigner;
import org.spongycastle.math.p131ec.Tnaf;
import org.spongycastle.util.Pack;
import p149l.C16968g;
import p149l.ig3;
import p149l.npk0;
import p149l.qkq0;

/* JADX INFO: loaded from: classes3.dex */
public class SM4Engine implements BlockCipher {
    private static final int BLOCK_SIZE = 16;

    /* JADX INFO: renamed from: X */
    private final int[] f206578X = new int[4];

    /* JADX INFO: renamed from: rk */
    private int[] f206579rk;
    private static final byte[] Sbox = {-42, -112, -23, -2, -52, -31, 61, -73, 22, -74, 20, -62, 40, -5, 44, 5, 43, 103, -102, 118, 42, -66, 4, -61, -86, 68, 19, 38, 73, -122, 6, -103, -100, 66, 80, -12, -111, -17, -104, 122, 51, 84, 11, 67, -19, -49, -84, 98, -28, -77, 28, -87, -55, 8, -24, -107, -128, -33, -108, -6, 117, -113, Utf8.REPLACEMENT_BYTE, -90, 71, 7, -89, -4, -13, 115, 23, -70, -125, 89, 60, 25, -26, -123, 79, -88, 104, 107, -127, -78, 113, 100, -38, -117, -8, -21, 15, 75, 112, 86, -99, 53, 30, 36, 14, 94, 99, 88, -47, -94, 37, 34, 124, HttpTokens.SEMI_COLON, 1, 33, 120, -121, -44, 0, 70, 87, -97, -45, 39, 82, 76, 54, 2, -25, -96, -60, -56, -98, -22, -65, -118, -46, 64, -57, 56, -75, -93, -9, -14, -50, -7, 97, 21, -95, -32, -82, 93, -92, -101, 52, 26, 85, -83, -109, 50, 48, -11, -116, -79, -29, 29, -10, -30, 46, -126, 102, -54, 96, -64, 41, 35, -85, HttpTokens.CARRIAGE_RETURN, 83, 78, 111, -43, -37, 55, 69, -34, -3, -114, 47, 3, -1, 106, 114, 109, 108, 91, 81, -115, 27, -81, -110, -69, -35, PSSSigner.TRAILER_IMPLICIT, 127, 17, -39, 92, 65, 31, Tnaf.POW_2_WIDTH, 90, -40, 10, -63, 49, -120, -91, -51, 123, -67, 45, 116, -48, 18, -72, -27, -76, -80, -119, 105, -105, 74, 12, -106, 119, 126, 101, -71, -15, 9, -59, 110, -58, -124, 24, -16, 125, -20, HttpTokens.COLON, -36, 77, HttpTokens.SPACE, 121, -18, 95, 62, -41, -53, 57, 72};

    /* JADX INFO: renamed from: CK */
    private static final int[] f206576CK = {462357, 472066609, 943670861, 1415275113, 1886879365, -1936483679, -1464879427, -993275175, -521670923, -66909679, 404694573, 876298825, 1347903077, 1819507329, -2003855715, -1532251463, -1060647211, -589042959, -117504499, 337322537, 808926789, 1280531041, 1752135293, -2071227751, -1599623499, -1128019247, -656414995, -184876535, 269950501, 741554753, 1213159005, 1684763257};

    /* JADX INFO: renamed from: FK */
    private static final int[] f206577FK = {-1548633402, 1453994832, 1736282519, -1301273892};

    /* JADX INFO: renamed from: F0 */
    private int m221207F0(int[] iArr, int i) {
        return m221213T((iArr[3] ^ (iArr[1] ^ iArr[2])) ^ i) ^ iArr[0];
    }

    /* JADX INFO: renamed from: F1 */
    private int m221208F1(int[] iArr, int i) {
        return m221213T((iArr[0] ^ (iArr[2] ^ iArr[3])) ^ i) ^ iArr[1];
    }

    /* JADX INFO: renamed from: F2 */
    private int m221209F2(int[] iArr, int i) {
        return m221213T((iArr[1] ^ (iArr[3] ^ iArr[0])) ^ i) ^ iArr[2];
    }

    /* JADX INFO: renamed from: F3 */
    private int m221210F3(int[] iArr, int i) {
        return m221213T((iArr[2] ^ (iArr[0] ^ iArr[1])) ^ i) ^ iArr[3];
    }

    /* JADX INFO: renamed from: L */
    private int m221211L(int i) {
        return rotateLeft(i, 24) ^ (((rotateLeft(i, 2) ^ i) ^ rotateLeft(i, 10)) ^ rotateLeft(i, 18));
    }

    private int L_ap(int i) {
        return rotateLeft(i, 23) ^ (rotateLeft(i, 13) ^ i);
    }

    /* JADX INFO: renamed from: R */
    private void m221212R(int[] iArr, int i) {
        int i2 = i + 1;
        int i3 = i + 2;
        int i4 = i + 3;
        int i5 = iArr[i] ^ iArr[i4];
        iArr[i] = i5;
        int i6 = i5 ^ iArr[i4];
        iArr[i4] = i6;
        iArr[i] = iArr[i] ^ i6;
        int i7 = iArr[i2] ^ iArr[i3];
        iArr[i2] = i7;
        int i8 = i7 ^ iArr[i3];
        iArr[i3] = i8;
        iArr[i2] = i8 ^ iArr[i2];
    }

    /* JADX INFO: renamed from: T */
    private int m221213T(int i) {
        return m221211L(tau(i));
    }

    private int T_ap(int i) {
        return L_ap(tau(i));
    }

    private int[] expandKey(boolean z, byte[] bArr) {
        int[] iArr = new int[32];
        int[] iArr2 = {Pack.bigEndianToInt(bArr, 0), Pack.bigEndianToInt(bArr, 4), Pack.bigEndianToInt(bArr, 8), Pack.bigEndianToInt(bArr, 12)};
        int i = iArr2[0];
        int[] iArr3 = f206577FK;
        int[] iArr4 = {i ^ iArr3[0], iArr2[1] ^ iArr3[1], iArr2[2] ^ iArr3[2], iArr2[3] ^ iArr3[3]};
        if (z) {
            int i2 = iArr4[0];
            int i3 = (iArr4[1] ^ iArr4[2]) ^ iArr4[3];
            int[] iArr5 = f206576CK;
            int iT_ap = i2 ^ T_ap(i3 ^ iArr5[0]);
            iArr[0] = iT_ap;
            int iT_ap2 = T_ap((iT_ap ^ (iArr4[2] ^ iArr4[3])) ^ iArr5[1]) ^ iArr4[1];
            iArr[1] = iT_ap2;
            int iT_ap3 = T_ap((iT_ap2 ^ (iArr4[3] ^ iArr[0])) ^ iArr5[2]) ^ iArr4[2];
            iArr[2] = iT_ap3;
            iArr[3] = T_ap((iT_ap3 ^ (iArr[0] ^ iArr[1])) ^ iArr5[3]) ^ iArr4[3];
            for (int i4 = 4; i4 < 32; i4++) {
                iArr[i4] = iArr[i4 - 4] ^ T_ap(((iArr[i4 - 3] ^ iArr[i4 - 2]) ^ iArr[i4 - 1]) ^ f206576CK[i4]);
            }
        } else {
            int i5 = iArr4[0];
            int i6 = (iArr4[1] ^ iArr4[2]) ^ iArr4[3];
            int[] iArr6 = f206576CK;
            int iT_ap4 = i5 ^ T_ap(i6 ^ iArr6[0]);
            iArr[31] = iT_ap4;
            int iT_ap5 = T_ap((iT_ap4 ^ (iArr4[2] ^ iArr4[3])) ^ iArr6[1]) ^ iArr4[1];
            iArr[30] = iT_ap5;
            int iT_ap6 = T_ap((iT_ap5 ^ (iArr4[3] ^ iArr[31])) ^ iArr6[2]) ^ iArr4[2];
            iArr[29] = iT_ap6;
            iArr[28] = T_ap((iT_ap6 ^ (iArr[31] ^ iArr[30])) ^ iArr6[3]) ^ iArr4[3];
            for (int i7 = 27; i7 >= 0; i7--) {
                iArr[i7] = iArr[i7 + 4] ^ T_ap(((iArr[i7 + 3] ^ iArr[i7 + 2]) ^ iArr[i7 + 1]) ^ f206576CK[31 - i7]);
            }
        }
        return iArr;
    }

    private int rotateLeft(int i, int i2) {
        return (i << i2) | (i >>> (-i2));
    }

    private int tau(int i) {
        byte[] bArr = Sbox;
        return (bArr[i & 255] & 255) | ((bArr[(i >> 24) & 255] & 255) << 24) | ((bArr[(i >> 16) & 255] & 255) << 16) | ((bArr[(i >> 8) & 255] & 255) << 8);
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "SM4";
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void init(boolean z, CipherParameters cipherParameters) throws IllegalArgumentException {
        if (!(cipherParameters instanceof KeyParameter)) {
            ig3.m135964a("invalid parameter passed to SM4 init - ".concat(cipherParameters.getClass().getName()));
            return;
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        if (key.length == 16) {
            this.f206579rk = expandKey(z, key);
        } else {
            ig3.m135964a("SM4 requires a 128 bit key");
        }
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws IllegalStateException, DataLengthException {
        if (this.f206579rk == null) {
            qkq0.m175383a("SM4 not initialised");
            return 0;
        }
        if (i + 16 > bArr.length) {
            npk0.m160508a("input buffer too short");
            return 0;
        }
        if (i2 + 16 > bArr2.length) {
            C16968g.m123940a("output buffer too short");
            return 0;
        }
        this.f206578X[0] = Pack.bigEndianToInt(bArr, i);
        this.f206578X[1] = Pack.bigEndianToInt(bArr, i + 4);
        this.f206578X[2] = Pack.bigEndianToInt(bArr, i + 8);
        this.f206578X[3] = Pack.bigEndianToInt(bArr, i + 12);
        int i3 = 0;
        while (true) {
            int[] iArr = this.f206578X;
            if (i3 >= 32) {
                m221212R(iArr, 0);
                Pack.intToBigEndian(this.f206578X[0], bArr2, i2);
                Pack.intToBigEndian(this.f206578X[1], bArr2, i2 + 4);
                Pack.intToBigEndian(this.f206578X[2], bArr2, i2 + 8);
                Pack.intToBigEndian(this.f206578X[3], bArr2, i2 + 12);
                return 16;
            }
            iArr[0] = m221207F0(iArr, this.f206579rk[i3]);
            int[] iArr2 = this.f206578X;
            iArr2[1] = m221208F1(iArr2, this.f206579rk[i3 + 1]);
            int[] iArr3 = this.f206578X;
            iArr3[2] = m221209F2(iArr3, this.f206579rk[i3 + 2]);
            int[] iArr4 = this.f206578X;
            iArr4[3] = m221210F3(iArr4, this.f206579rk[i3 + 3]);
            i3 += 4;
        }
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void reset() {
    }
}
