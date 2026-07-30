package org.spongycastle.crypto.prng;

import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.crypto.signers.PSSSigner;
import org.spongycastle.math.p012ec.Tnaf;
import org.spongycastle.util.Pack;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VMPCRandomGenerator implements RandomGenerator {

    /* JADX INFO: renamed from: n */
    private byte f10370n = 0;

    /* JADX INFO: renamed from: P */
    private byte[] f10369P = {-69, 44, 98, 127, -75, -86, -44, HttpTokens.CARRIAGE_RETURN, -127, -2, -78, -126, -53, -96, -95, 8, 24, 113, 86, -24, 73, 2, Tnaf.POW_2_WIDTH, -60, -34, 53, -91, -20, -128, 18, -72, 105, -38, 47, 117, -52, -94, 9, 54, 3, 97, 45, -3, -32, -35, 5, 67, -112, -83, -56, -31, -81, 87, -101, 76, -40, 81, -82, 80, -123, 60, 10, -28, -13, -100, 38, 35, 83, -55, -125, -105, 70, -79, -103, 100, 49, 119, -43, 29, -42, 120, -67, 94, -80, -118, 34, 56, -8, 104, 43, 42, -59, -45, -9, PSSSigner.TRAILER_IMPLICIT, 111, -33, 4, -27, -107, 62, 37, -122, -90, 11, -113, -15, 36, 14, -41, 64, -77, -49, 126, 6, 21, -102, 77, 28, -93, -37, 50, -110, 88, 17, 39, -12, 89, -48, 78, 106, 23, 91, -84, -1, 7, -64, 101, 121, -4, -57, -51, 118, 66, 93, -25, HttpTokens.COLON, 52, 122, 48, 40, 15, 115, 1, -7, -47, -46, 25, -23, -111, -71, 90, -19, 65, 109, -76, -61, -98, -65, 99, -6, 31, 51, 96, 71, -119, -16, -106, 26, 95, -109, 61, 55, 75, -39, -88, -63, 27, -10, 57, -117, -73, 12, HttpTokens.SPACE, -50, -120, 110, -74, 116, -114, -115, 22, 41, -14, -121, -11, -21, 112, -29, -5, 85, -97, -58, 68, 74, 69, 125, -30, 107, 92, 108, 102, -87, -116, -18, -124, 19, -89, 30, -99, -36, 103, 72, -70, 46, -26, -92, -85, 124, -108, 0, 33, -17, -22, -66, -54, 114, 79, 82, -104, 63, -62, 20, 123, HttpTokens.SEMI_COLON, 84};

    /* JADX INFO: renamed from: s */
    private byte f10371s = -66;

    @Override // org.spongycastle.crypto.prng.RandomGenerator
    public void addSeedMaterial(byte[] bArr) {
        for (byte b : bArr) {
            byte[] bArr2 = this.f10369P;
            byte b2 = this.f10371s;
            byte b3 = this.f10370n;
            byte b4 = bArr2[(b2 + bArr2[b3 & 255] + b) & 255];
            this.f10371s = b4;
            byte b5 = bArr2[b3 & 255];
            bArr2[b3 & 255] = bArr2[b4 & 255];
            bArr2[b4 & 255] = b5;
            this.f10370n = (byte) ((b3 + 1) & 255);
        }
    }

    @Override // org.spongycastle.crypto.prng.RandomGenerator
    public void nextBytes(byte[] bArr, int i, int i2) {
        synchronized (this.f10369P) {
            int i3 = i2 + i;
            while (i != i3) {
                try {
                    byte[] bArr2 = this.f10369P;
                    byte b = this.f10371s;
                    byte b2 = this.f10370n;
                    byte b3 = bArr2[(b + bArr2[b2 & 255]) & 255];
                    this.f10371s = b3;
                    bArr[i] = bArr2[(bArr2[bArr2[b3 & 255] & 255] + 1) & 255];
                    byte b4 = bArr2[b2 & 255];
                    bArr2[b2 & 255] = bArr2[b3 & 255];
                    bArr2[b3 & 255] = b4;
                    this.f10370n = (byte) ((b2 + 1) & 255);
                    i++;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // org.spongycastle.crypto.prng.RandomGenerator
    public void addSeedMaterial(long j) {
        addSeedMaterial(Pack.longToBigEndian(j));
    }

    @Override // org.spongycastle.crypto.prng.RandomGenerator
    public void nextBytes(byte[] bArr) {
        nextBytes(bArr, 0, bArr.length);
    }
}
