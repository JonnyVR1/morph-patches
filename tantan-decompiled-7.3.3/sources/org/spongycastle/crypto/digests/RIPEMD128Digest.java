package org.spongycastle.crypto.digests;

import org.spongycastle.util.Memoable;

/* JADX INFO: loaded from: classes3.dex */
public class RIPEMD128Digest extends GeneralDigest {
    private static final int DIGEST_LENGTH = 16;

    /* JADX INFO: renamed from: H0 */
    private int f207326H0;

    /* JADX INFO: renamed from: H1 */
    private int f207327H1;

    /* JADX INFO: renamed from: H2 */
    private int f207328H2;

    /* JADX INFO: renamed from: H3 */
    private int f207329H3;

    /* JADX INFO: renamed from: X */
    private int[] f207330X;
    private int xOff;

    public RIPEMD128Digest() {
        this.f207330X = new int[16];
        reset();
    }

    /* JADX INFO: renamed from: F1 */
    private int m222404F1(int i, int i2, int i3, int i4, int i5, int i6) {
        return m222408RL(i + m222409f1(i2, i3, i4) + i5, i6);
    }

    /* JADX INFO: renamed from: F2 */
    private int m222405F2(int i, int i2, int i3, int i4, int i5, int i6) {
        return m222408RL(i + m222410f2(i2, i3, i4) + i5 + 1518500249, i6);
    }

    /* JADX INFO: renamed from: F3 */
    private int m222406F3(int i, int i2, int i3, int i4, int i5, int i6) {
        return m222408RL(i + m222411f3(i2, i3, i4) + i5 + 1859775393, i6);
    }

    /* JADX INFO: renamed from: F4 */
    private int m222407F4(int i, int i2, int i3, int i4, int i5, int i6) {
        return m222408RL(((i + m222412f4(i2, i3, i4)) + i5) - 1894007588, i6);
    }

    private int FF1(int i, int i2, int i3, int i4, int i5, int i6) {
        return m222408RL(i + m222409f1(i2, i3, i4) + i5, i6);
    }

    private int FF2(int i, int i2, int i3, int i4, int i5, int i6) {
        return m222408RL(i + m222410f2(i2, i3, i4) + i5 + 1836072691, i6);
    }

    private int FF3(int i, int i2, int i3, int i4, int i5, int i6) {
        return m222408RL(i + m222411f3(i2, i3, i4) + i5 + 1548603684, i6);
    }

    private int FF4(int i, int i2, int i3, int i4, int i5, int i6) {
        return m222408RL(i + m222412f4(i2, i3, i4) + i5 + 1352829926, i6);
    }

    /* JADX INFO: renamed from: RL */
    private int m222408RL(int i, int i2) {
        return (i << i2) | (i >>> (32 - i2));
    }

    private void copyIn(RIPEMD128Digest rIPEMD128Digest) {
        super.copyIn((GeneralDigest) rIPEMD128Digest);
        this.f207326H0 = rIPEMD128Digest.f207326H0;
        this.f207327H1 = rIPEMD128Digest.f207327H1;
        this.f207328H2 = rIPEMD128Digest.f207328H2;
        this.f207329H3 = rIPEMD128Digest.f207329H3;
        int[] iArr = rIPEMD128Digest.f207330X;
        System.arraycopy(iArr, 0, this.f207330X, 0, iArr.length);
        this.xOff = rIPEMD128Digest.xOff;
    }

    /* JADX INFO: renamed from: f1 */
    private int m222409f1(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    /* JADX INFO: renamed from: f2 */
    private int m222410f2(int i, int i2, int i3) {
        return (i & i2) | ((~i) & i3);
    }

    /* JADX INFO: renamed from: f3 */
    private int m222411f3(int i, int i2, int i3) {
        return ((~i2) | i) ^ i3;
    }

    /* JADX INFO: renamed from: f4 */
    private int m222412f4(int i, int i2, int i3) {
        return (i & i3) | ((~i3) & i2);
    }

    private void unpackWord(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    @Override // org.spongycastle.util.Memoable
    public Memoable copy() {
        return new RIPEMD128Digest(this);
    }

    @Override // org.spongycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        finish();
        unpackWord(this.f207326H0, bArr, i);
        unpackWord(this.f207327H1, bArr, i + 4);
        unpackWord(this.f207328H2, bArr, i + 8);
        unpackWord(this.f207329H3, bArr, i + 12);
        reset();
        return 16;
    }

    @Override // org.spongycastle.crypto.Digest
    public String getAlgorithmName() {
        return "RIPEMD128";
    }

    @Override // org.spongycastle.crypto.Digest
    public int getDigestSize() {
        return 16;
    }

    @Override // org.spongycastle.crypto.digests.GeneralDigest
    public void processBlock() {
        int i = this.f207326H0;
        int i2 = this.f207327H1;
        int i3 = this.f207328H2;
        int i4 = this.f207329H3;
        int iM222404F1 = m222404F1(i, i2, i3, i4, this.f207330X[0], 11);
        int iM222404F2 = m222404F1(i4, iM222404F1, i2, i3, this.f207330X[1], 14);
        int iM222404F3 = m222404F1(i3, iM222404F2, iM222404F1, i2, this.f207330X[2], 15);
        int iM222404F4 = m222404F1(i2, iM222404F3, iM222404F2, iM222404F1, this.f207330X[3], 12);
        int iM222404F5 = m222404F1(iM222404F1, iM222404F4, iM222404F3, iM222404F2, this.f207330X[4], 5);
        int iM222404F6 = m222404F1(iM222404F2, iM222404F5, iM222404F4, iM222404F3, this.f207330X[5], 8);
        int iM222404F7 = m222404F1(iM222404F3, iM222404F6, iM222404F5, iM222404F4, this.f207330X[6], 7);
        int iM222404F8 = m222404F1(iM222404F4, iM222404F7, iM222404F6, iM222404F5, this.f207330X[7], 9);
        int iM222404F9 = m222404F1(iM222404F5, iM222404F8, iM222404F7, iM222404F6, this.f207330X[8], 11);
        int iM222404F10 = m222404F1(iM222404F6, iM222404F9, iM222404F8, iM222404F7, this.f207330X[9], 13);
        int iM222404F11 = m222404F1(iM222404F7, iM222404F10, iM222404F9, iM222404F8, this.f207330X[10], 14);
        int iM222404F12 = m222404F1(iM222404F8, iM222404F11, iM222404F10, iM222404F9, this.f207330X[11], 15);
        int iM222404F13 = m222404F1(iM222404F9, iM222404F12, iM222404F11, iM222404F10, this.f207330X[12], 6);
        int iM222404F14 = m222404F1(iM222404F10, iM222404F13, iM222404F12, iM222404F11, this.f207330X[13], 7);
        int iM222404F15 = m222404F1(iM222404F11, iM222404F14, iM222404F13, iM222404F12, this.f207330X[14], 9);
        int iM222404F16 = m222404F1(iM222404F12, iM222404F15, iM222404F14, iM222404F13, this.f207330X[15], 8);
        int iM222405F2 = m222405F2(iM222404F13, iM222404F16, iM222404F15, iM222404F14, this.f207330X[7], 7);
        int iM222405F3 = m222405F2(iM222404F14, iM222405F2, iM222404F16, iM222404F15, this.f207330X[4], 6);
        int iM222405F4 = m222405F2(iM222404F15, iM222405F3, iM222405F2, iM222404F16, this.f207330X[13], 8);
        int iM222405F5 = m222405F2(iM222404F16, iM222405F4, iM222405F3, iM222405F2, this.f207330X[1], 13);
        int iM222405F6 = m222405F2(iM222405F2, iM222405F5, iM222405F4, iM222405F3, this.f207330X[10], 11);
        int iM222405F7 = m222405F2(iM222405F3, iM222405F6, iM222405F5, iM222405F4, this.f207330X[6], 9);
        int iM222405F8 = m222405F2(iM222405F4, iM222405F7, iM222405F6, iM222405F5, this.f207330X[15], 7);
        int iM222405F9 = m222405F2(iM222405F5, iM222405F8, iM222405F7, iM222405F6, this.f207330X[3], 15);
        int iM222405F10 = m222405F2(iM222405F6, iM222405F9, iM222405F8, iM222405F7, this.f207330X[12], 7);
        int iM222405F11 = m222405F2(iM222405F7, iM222405F10, iM222405F9, iM222405F8, this.f207330X[0], 12);
        int iM222405F12 = m222405F2(iM222405F8, iM222405F11, iM222405F10, iM222405F9, this.f207330X[9], 15);
        int iM222405F13 = m222405F2(iM222405F9, iM222405F12, iM222405F11, iM222405F10, this.f207330X[5], 9);
        int iM222405F14 = m222405F2(iM222405F10, iM222405F13, iM222405F12, iM222405F11, this.f207330X[2], 11);
        int iM222405F15 = m222405F2(iM222405F11, iM222405F14, iM222405F13, iM222405F12, this.f207330X[14], 7);
        int iM222405F16 = m222405F2(iM222405F12, iM222405F15, iM222405F14, iM222405F13, this.f207330X[11], 13);
        int iM222405F17 = m222405F2(iM222405F13, iM222405F16, iM222405F15, iM222405F14, this.f207330X[8], 12);
        int iM222406F3 = m222406F3(iM222405F14, iM222405F17, iM222405F16, iM222405F15, this.f207330X[3], 11);
        int iM222406F4 = m222406F3(iM222405F15, iM222406F3, iM222405F17, iM222405F16, this.f207330X[10], 13);
        int iM222406F5 = m222406F3(iM222405F16, iM222406F4, iM222406F3, iM222405F17, this.f207330X[14], 6);
        int iM222406F6 = m222406F3(iM222405F17, iM222406F5, iM222406F4, iM222406F3, this.f207330X[4], 7);
        int iM222406F7 = m222406F3(iM222406F3, iM222406F6, iM222406F5, iM222406F4, this.f207330X[9], 14);
        int iM222406F8 = m222406F3(iM222406F4, iM222406F7, iM222406F6, iM222406F5, this.f207330X[15], 9);
        int iM222406F9 = m222406F3(iM222406F5, iM222406F8, iM222406F7, iM222406F6, this.f207330X[8], 13);
        int iM222406F10 = m222406F3(iM222406F6, iM222406F9, iM222406F8, iM222406F7, this.f207330X[1], 15);
        int iM222406F11 = m222406F3(iM222406F7, iM222406F10, iM222406F9, iM222406F8, this.f207330X[2], 14);
        int iM222406F12 = m222406F3(iM222406F8, iM222406F11, iM222406F10, iM222406F9, this.f207330X[7], 8);
        int iM222406F13 = m222406F3(iM222406F9, iM222406F12, iM222406F11, iM222406F10, this.f207330X[0], 13);
        int iM222406F14 = m222406F3(iM222406F10, iM222406F13, iM222406F12, iM222406F11, this.f207330X[6], 6);
        int iM222406F15 = m222406F3(iM222406F11, iM222406F14, iM222406F13, iM222406F12, this.f207330X[13], 5);
        int iM222406F16 = m222406F3(iM222406F12, iM222406F15, iM222406F14, iM222406F13, this.f207330X[11], 12);
        int iM222406F17 = m222406F3(iM222406F13, iM222406F16, iM222406F15, iM222406F14, this.f207330X[5], 7);
        int iM222406F18 = m222406F3(iM222406F14, iM222406F17, iM222406F16, iM222406F15, this.f207330X[12], 5);
        int iM222407F4 = m222407F4(iM222406F15, iM222406F18, iM222406F17, iM222406F16, this.f207330X[1], 11);
        int iM222407F5 = m222407F4(iM222406F16, iM222407F4, iM222406F18, iM222406F17, this.f207330X[9], 12);
        int iM222407F6 = m222407F4(iM222406F17, iM222407F5, iM222407F4, iM222406F18, this.f207330X[11], 14);
        int iM222407F7 = m222407F4(iM222406F18, iM222407F6, iM222407F5, iM222407F4, this.f207330X[10], 15);
        int iM222407F8 = m222407F4(iM222407F4, iM222407F7, iM222407F6, iM222407F5, this.f207330X[0], 14);
        int iM222407F9 = m222407F4(iM222407F5, iM222407F8, iM222407F7, iM222407F6, this.f207330X[8], 15);
        int iM222407F10 = m222407F4(iM222407F6, iM222407F9, iM222407F8, iM222407F7, this.f207330X[12], 9);
        int iM222407F11 = m222407F4(iM222407F7, iM222407F10, iM222407F9, iM222407F8, this.f207330X[4], 8);
        int iM222407F12 = m222407F4(iM222407F8, iM222407F11, iM222407F10, iM222407F9, this.f207330X[13], 9);
        int iM222407F13 = m222407F4(iM222407F9, iM222407F12, iM222407F11, iM222407F10, this.f207330X[3], 14);
        int iM222407F14 = m222407F4(iM222407F10, iM222407F13, iM222407F12, iM222407F11, this.f207330X[7], 5);
        int iM222407F15 = m222407F4(iM222407F11, iM222407F14, iM222407F13, iM222407F12, this.f207330X[15], 6);
        int iM222407F16 = m222407F4(iM222407F12, iM222407F15, iM222407F14, iM222407F13, this.f207330X[14], 8);
        int iM222407F17 = m222407F4(iM222407F13, iM222407F16, iM222407F15, iM222407F14, this.f207330X[5], 6);
        int iM222407F18 = m222407F4(iM222407F14, iM222407F17, iM222407F16, iM222407F15, this.f207330X[6], 5);
        int iM222407F19 = m222407F4(iM222407F15, iM222407F18, iM222407F17, iM222407F16, this.f207330X[2], 12);
        int iFF4 = FF4(i, i2, i3, i4, this.f207330X[5], 8);
        int iFF5 = FF4(i4, iFF4, i2, i3, this.f207330X[14], 9);
        int iFF6 = FF4(i3, iFF5, iFF4, i2, this.f207330X[7], 9);
        int iFF7 = FF4(i2, iFF6, iFF5, iFF4, this.f207330X[0], 11);
        int iFF8 = FF4(iFF4, iFF7, iFF6, iFF5, this.f207330X[9], 13);
        int iFF9 = FF4(iFF5, iFF8, iFF7, iFF6, this.f207330X[2], 15);
        int iFF10 = FF4(iFF6, iFF9, iFF8, iFF7, this.f207330X[11], 15);
        int iFF11 = FF4(iFF7, iFF10, iFF9, iFF8, this.f207330X[4], 5);
        int iFF12 = FF4(iFF8, iFF11, iFF10, iFF9, this.f207330X[13], 7);
        int iFF13 = FF4(iFF9, iFF12, iFF11, iFF10, this.f207330X[6], 7);
        int iFF14 = FF4(iFF10, iFF13, iFF12, iFF11, this.f207330X[15], 8);
        int iFF15 = FF4(iFF11, iFF14, iFF13, iFF12, this.f207330X[8], 11);
        int iFF16 = FF4(iFF12, iFF15, iFF14, iFF13, this.f207330X[1], 14);
        int iFF17 = FF4(iFF13, iFF16, iFF15, iFF14, this.f207330X[10], 14);
        int iFF18 = FF4(iFF14, iFF17, iFF16, iFF15, this.f207330X[3], 12);
        int iFF19 = FF4(iFF15, iFF18, iFF17, iFF16, this.f207330X[12], 6);
        int iFF3 = FF3(iFF16, iFF19, iFF18, iFF17, this.f207330X[6], 9);
        int iFF20 = FF3(iFF17, iFF3, iFF19, iFF18, this.f207330X[11], 13);
        int iFF21 = FF3(iFF18, iFF20, iFF3, iFF19, this.f207330X[3], 15);
        int iFF22 = FF3(iFF19, iFF21, iFF20, iFF3, this.f207330X[7], 7);
        int iFF23 = FF3(iFF3, iFF22, iFF21, iFF20, this.f207330X[0], 12);
        int iFF24 = FF3(iFF20, iFF23, iFF22, iFF21, this.f207330X[13], 8);
        int iFF25 = FF3(iFF21, iFF24, iFF23, iFF22, this.f207330X[5], 9);
        int iFF26 = FF3(iFF22, iFF25, iFF24, iFF23, this.f207330X[10], 11);
        int iFF27 = FF3(iFF23, iFF26, iFF25, iFF24, this.f207330X[14], 7);
        int iFF28 = FF3(iFF24, iFF27, iFF26, iFF25, this.f207330X[15], 7);
        int iFF29 = FF3(iFF25, iFF28, iFF27, iFF26, this.f207330X[8], 12);
        int iFF30 = FF3(iFF26, iFF29, iFF28, iFF27, this.f207330X[12], 7);
        int iFF31 = FF3(iFF27, iFF30, iFF29, iFF28, this.f207330X[4], 6);
        int iFF32 = FF3(iFF28, iFF31, iFF30, iFF29, this.f207330X[9], 15);
        int iFF33 = FF3(iFF29, iFF32, iFF31, iFF30, this.f207330X[1], 13);
        int iFF34 = FF3(iFF30, iFF33, iFF32, iFF31, this.f207330X[2], 11);
        int iFF2 = FF2(iFF31, iFF34, iFF33, iFF32, this.f207330X[15], 9);
        int iFF35 = FF2(iFF32, iFF2, iFF34, iFF33, this.f207330X[5], 7);
        int iFF36 = FF2(iFF33, iFF35, iFF2, iFF34, this.f207330X[1], 15);
        int iFF37 = FF2(iFF34, iFF36, iFF35, iFF2, this.f207330X[3], 11);
        int iFF38 = FF2(iFF2, iFF37, iFF36, iFF35, this.f207330X[7], 8);
        int iFF39 = FF2(iFF35, iFF38, iFF37, iFF36, this.f207330X[14], 6);
        int iFF40 = FF2(iFF36, iFF39, iFF38, iFF37, this.f207330X[6], 6);
        int iFF41 = FF2(iFF37, iFF40, iFF39, iFF38, this.f207330X[9], 14);
        int iFF42 = FF2(iFF38, iFF41, iFF40, iFF39, this.f207330X[11], 12);
        int iFF43 = FF2(iFF39, iFF42, iFF41, iFF40, this.f207330X[8], 13);
        int iFF44 = FF2(iFF40, iFF43, iFF42, iFF41, this.f207330X[12], 5);
        int iFF45 = FF2(iFF41, iFF44, iFF43, iFF42, this.f207330X[2], 14);
        int iFF46 = FF2(iFF42, iFF45, iFF44, iFF43, this.f207330X[10], 13);
        int iFF47 = FF2(iFF43, iFF46, iFF45, iFF44, this.f207330X[0], 13);
        int iFF48 = FF2(iFF44, iFF47, iFF46, iFF45, this.f207330X[4], 7);
        int iFF49 = FF2(iFF45, iFF48, iFF47, iFF46, this.f207330X[13], 5);
        int iFF1 = FF1(iFF46, iFF49, iFF48, iFF47, this.f207330X[8], 15);
        int iFF50 = FF1(iFF47, iFF1, iFF49, iFF48, this.f207330X[6], 5);
        int iFF51 = FF1(iFF48, iFF50, iFF1, iFF49, this.f207330X[4], 8);
        int iFF52 = FF1(iFF49, iFF51, iFF50, iFF1, this.f207330X[1], 11);
        int iFF53 = FF1(iFF1, iFF52, iFF51, iFF50, this.f207330X[3], 14);
        int iFF54 = FF1(iFF50, iFF53, iFF52, iFF51, this.f207330X[11], 14);
        int iFF55 = FF1(iFF51, iFF54, iFF53, iFF52, this.f207330X[15], 6);
        int iFF56 = FF1(iFF52, iFF55, iFF54, iFF53, this.f207330X[0], 14);
        int iFF57 = FF1(iFF53, iFF56, iFF55, iFF54, this.f207330X[5], 6);
        int iFF58 = FF1(iFF54, iFF57, iFF56, iFF55, this.f207330X[12], 9);
        int iFF59 = FF1(iFF55, iFF58, iFF57, iFF56, this.f207330X[2], 12);
        int iFF60 = FF1(iFF56, iFF59, iFF58, iFF57, this.f207330X[13], 9);
        int iFF61 = FF1(iFF57, iFF60, iFF59, iFF58, this.f207330X[9], 12);
        int iFF62 = FF1(iFF58, iFF61, iFF60, iFF59, this.f207330X[7], 5);
        int iFF63 = FF1(iFF59, iFF62, iFF61, iFF60, this.f207330X[10], 15);
        int iFF64 = FF1(iFF60, iFF63, iFF62, iFF61, this.f207330X[14], 8);
        int i5 = iFF62 + iM222407F18 + this.f207327H1;
        this.f207327H1 = this.f207328H2 + iM222407F17 + iFF61;
        this.f207328H2 = this.f207329H3 + iM222407F16 + iFF64;
        this.f207329H3 = this.f207326H0 + iM222407F19 + iFF63;
        this.f207326H0 = i5;
        this.xOff = 0;
        int i6 = 0;
        while (true) {
            int[] iArr = this.f207330X;
            if (i6 == iArr.length) {
                return;
            }
            iArr[i6] = 0;
            i6++;
        }
    }

    @Override // org.spongycastle.crypto.digests.GeneralDigest
    public void processLength(long j) {
        if (this.xOff > 14) {
            processBlock();
        }
        int[] iArr = this.f207330X;
        iArr[14] = (int) j;
        iArr[15] = (int) (j >>> 32);
    }

    @Override // org.spongycastle.crypto.digests.GeneralDigest
    public void processWord(byte[] bArr, int i) {
        int[] iArr = this.f207330X;
        int i2 = this.xOff;
        int i3 = i2 + 1;
        this.xOff = i3;
        iArr[i2] = ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        if (i3 == 16) {
            processBlock();
        }
    }

    @Override // org.spongycastle.crypto.digests.GeneralDigest, org.spongycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.f207326H0 = 1732584193;
        this.f207327H1 = -271733879;
        this.f207328H2 = -1732584194;
        this.f207329H3 = 271733878;
        this.xOff = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.f207330X;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    public RIPEMD128Digest(RIPEMD128Digest rIPEMD128Digest) {
        super(rIPEMD128Digest);
        this.f207330X = new int[16];
        copyIn(rIPEMD128Digest);
    }

    @Override // org.spongycastle.util.Memoable
    public void reset(Memoable memoable) {
        copyIn((RIPEMD128Digest) memoable);
    }
}
