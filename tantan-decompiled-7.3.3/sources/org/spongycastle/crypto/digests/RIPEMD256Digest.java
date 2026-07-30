package org.spongycastle.crypto.digests;

import org.spongycastle.util.Memoable;

/* JADX INFO: loaded from: classes3.dex */
public class RIPEMD256Digest extends GeneralDigest {
    private static final int DIGEST_LENGTH = 32;

    /* JADX INFO: renamed from: H0 */
    private int f207337H0;

    /* JADX INFO: renamed from: H1 */
    private int f207338H1;

    /* JADX INFO: renamed from: H2 */
    private int f207339H2;

    /* JADX INFO: renamed from: H3 */
    private int f207340H3;

    /* JADX INFO: renamed from: H4 */
    private int f207341H4;

    /* JADX INFO: renamed from: H5 */
    private int f207342H5;

    /* JADX INFO: renamed from: H6 */
    private int f207343H6;

    /* JADX INFO: renamed from: H7 */
    private int f207344H7;

    /* JADX INFO: renamed from: X */
    private int[] f207345X;
    private int xOff;

    public RIPEMD256Digest() {
        this.f207345X = new int[16];
        reset();
    }

    /* JADX INFO: renamed from: F1 */
    private int m222419F1(int i, int i2, int i3, int i4, int i5, int i6) {
        return m222423RL(i + m222424f1(i2, i3, i4) + i5, i6);
    }

    /* JADX INFO: renamed from: F2 */
    private int m222420F2(int i, int i2, int i3, int i4, int i5, int i6) {
        return m222423RL(i + m222425f2(i2, i3, i4) + i5 + 1518500249, i6);
    }

    /* JADX INFO: renamed from: F3 */
    private int m222421F3(int i, int i2, int i3, int i4, int i5, int i6) {
        return m222423RL(i + m222426f3(i2, i3, i4) + i5 + 1859775393, i6);
    }

    /* JADX INFO: renamed from: F4 */
    private int m222422F4(int i, int i2, int i3, int i4, int i5, int i6) {
        return m222423RL(((i + m222427f4(i2, i3, i4)) + i5) - 1894007588, i6);
    }

    private int FF1(int i, int i2, int i3, int i4, int i5, int i6) {
        return m222423RL(i + m222424f1(i2, i3, i4) + i5, i6);
    }

    private int FF2(int i, int i2, int i3, int i4, int i5, int i6) {
        return m222423RL(i + m222425f2(i2, i3, i4) + i5 + 1836072691, i6);
    }

    private int FF3(int i, int i2, int i3, int i4, int i5, int i6) {
        return m222423RL(i + m222426f3(i2, i3, i4) + i5 + 1548603684, i6);
    }

    private int FF4(int i, int i2, int i3, int i4, int i5, int i6) {
        return m222423RL(i + m222427f4(i2, i3, i4) + i5 + 1352829926, i6);
    }

    /* JADX INFO: renamed from: RL */
    private int m222423RL(int i, int i2) {
        return (i << i2) | (i >>> (32 - i2));
    }

    private void copyIn(RIPEMD256Digest rIPEMD256Digest) {
        super.copyIn((GeneralDigest) rIPEMD256Digest);
        this.f207337H0 = rIPEMD256Digest.f207337H0;
        this.f207338H1 = rIPEMD256Digest.f207338H1;
        this.f207339H2 = rIPEMD256Digest.f207339H2;
        this.f207340H3 = rIPEMD256Digest.f207340H3;
        this.f207341H4 = rIPEMD256Digest.f207341H4;
        this.f207342H5 = rIPEMD256Digest.f207342H5;
        this.f207343H6 = rIPEMD256Digest.f207343H6;
        this.f207344H7 = rIPEMD256Digest.f207344H7;
        int[] iArr = rIPEMD256Digest.f207345X;
        System.arraycopy(iArr, 0, this.f207345X, 0, iArr.length);
        this.xOff = rIPEMD256Digest.xOff;
    }

    /* JADX INFO: renamed from: f1 */
    private int m222424f1(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    /* JADX INFO: renamed from: f2 */
    private int m222425f2(int i, int i2, int i3) {
        return (i & i2) | ((~i) & i3);
    }

    /* JADX INFO: renamed from: f3 */
    private int m222426f3(int i, int i2, int i3) {
        return ((~i2) | i) ^ i3;
    }

    /* JADX INFO: renamed from: f4 */
    private int m222427f4(int i, int i2, int i3) {
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
        return new RIPEMD256Digest(this);
    }

    @Override // org.spongycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        finish();
        unpackWord(this.f207337H0, bArr, i);
        unpackWord(this.f207338H1, bArr, i + 4);
        unpackWord(this.f207339H2, bArr, i + 8);
        unpackWord(this.f207340H3, bArr, i + 12);
        unpackWord(this.f207341H4, bArr, i + 16);
        unpackWord(this.f207342H5, bArr, i + 20);
        unpackWord(this.f207343H6, bArr, i + 24);
        unpackWord(this.f207344H7, bArr, i + 28);
        reset();
        return 32;
    }

    @Override // org.spongycastle.crypto.Digest
    public String getAlgorithmName() {
        return "RIPEMD256";
    }

    @Override // org.spongycastle.crypto.Digest
    public int getDigestSize() {
        return 32;
    }

    @Override // org.spongycastle.crypto.digests.GeneralDigest
    public void processBlock() {
        int i = this.f207337H0;
        int i2 = this.f207338H1;
        int i3 = this.f207339H2;
        int i4 = this.f207340H3;
        int i5 = this.f207341H4;
        int i6 = this.f207342H5;
        int i7 = this.f207343H6;
        int i8 = this.f207344H7;
        int iM222419F1 = m222419F1(i, i2, i3, i4, this.f207345X[0], 11);
        int iM222419F2 = m222419F1(i4, iM222419F1, i2, i3, this.f207345X[1], 14);
        int iM222419F3 = m222419F1(i3, iM222419F2, iM222419F1, i2, this.f207345X[2], 15);
        int iM222419F4 = m222419F1(i2, iM222419F3, iM222419F2, iM222419F1, this.f207345X[3], 12);
        int iM222419F5 = m222419F1(iM222419F1, iM222419F4, iM222419F3, iM222419F2, this.f207345X[4], 5);
        int iM222419F6 = m222419F1(iM222419F2, iM222419F5, iM222419F4, iM222419F3, this.f207345X[5], 8);
        int iM222419F7 = m222419F1(iM222419F3, iM222419F6, iM222419F5, iM222419F4, this.f207345X[6], 7);
        int iM222419F8 = m222419F1(iM222419F4, iM222419F7, iM222419F6, iM222419F5, this.f207345X[7], 9);
        int iM222419F9 = m222419F1(iM222419F5, iM222419F8, iM222419F7, iM222419F6, this.f207345X[8], 11);
        int iM222419F10 = m222419F1(iM222419F6, iM222419F9, iM222419F8, iM222419F7, this.f207345X[9], 13);
        int iM222419F11 = m222419F1(iM222419F7, iM222419F10, iM222419F9, iM222419F8, this.f207345X[10], 14);
        int iM222419F12 = m222419F1(iM222419F8, iM222419F11, iM222419F10, iM222419F9, this.f207345X[11], 15);
        int iM222419F13 = m222419F1(iM222419F9, iM222419F12, iM222419F11, iM222419F10, this.f207345X[12], 6);
        int iM222419F14 = m222419F1(iM222419F10, iM222419F13, iM222419F12, iM222419F11, this.f207345X[13], 7);
        int iM222419F15 = m222419F1(iM222419F11, iM222419F14, iM222419F13, iM222419F12, this.f207345X[14], 9);
        int iM222419F16 = m222419F1(iM222419F12, iM222419F15, iM222419F14, iM222419F13, this.f207345X[15], 8);
        int iFF4 = FF4(i5, i6, i7, i8, this.f207345X[5], 8);
        int iFF5 = FF4(i8, iFF4, i6, i7, this.f207345X[14], 9);
        int iFF6 = FF4(i7, iFF5, iFF4, i6, this.f207345X[7], 9);
        int iFF7 = FF4(i6, iFF6, iFF5, iFF4, this.f207345X[0], 11);
        int iFF8 = FF4(iFF4, iFF7, iFF6, iFF5, this.f207345X[9], 13);
        int iFF9 = FF4(iFF5, iFF8, iFF7, iFF6, this.f207345X[2], 15);
        int iFF10 = FF4(iFF6, iFF9, iFF8, iFF7, this.f207345X[11], 15);
        int iFF11 = FF4(iFF7, iFF10, iFF9, iFF8, this.f207345X[4], 5);
        int iFF12 = FF4(iFF8, iFF11, iFF10, iFF9, this.f207345X[13], 7);
        int iFF13 = FF4(iFF9, iFF12, iFF11, iFF10, this.f207345X[6], 7);
        int iFF14 = FF4(iFF10, iFF13, iFF12, iFF11, this.f207345X[15], 8);
        int iFF15 = FF4(iFF11, iFF14, iFF13, iFF12, this.f207345X[8], 11);
        int iFF16 = FF4(iFF12, iFF15, iFF14, iFF13, this.f207345X[1], 14);
        int iFF17 = FF4(iFF13, iFF16, iFF15, iFF14, this.f207345X[10], 14);
        int iFF18 = FF4(iFF14, iFF17, iFF16, iFF15, this.f207345X[3], 12);
        int iFF19 = FF4(iFF15, iFF18, iFF17, iFF16, this.f207345X[12], 6);
        int iM222420F2 = m222420F2(iFF16, iM222419F16, iM222419F15, iM222419F14, this.f207345X[7], 7);
        int iM222420F3 = m222420F2(iM222419F14, iM222420F2, iM222419F16, iM222419F15, this.f207345X[4], 6);
        int iM222420F4 = m222420F2(iM222419F15, iM222420F3, iM222420F2, iM222419F16, this.f207345X[13], 8);
        int iM222420F5 = m222420F2(iM222419F16, iM222420F4, iM222420F3, iM222420F2, this.f207345X[1], 13);
        int iM222420F6 = m222420F2(iM222420F2, iM222420F5, iM222420F4, iM222420F3, this.f207345X[10], 11);
        int iM222420F7 = m222420F2(iM222420F3, iM222420F6, iM222420F5, iM222420F4, this.f207345X[6], 9);
        int iM222420F8 = m222420F2(iM222420F4, iM222420F7, iM222420F6, iM222420F5, this.f207345X[15], 7);
        int iM222420F9 = m222420F2(iM222420F5, iM222420F8, iM222420F7, iM222420F6, this.f207345X[3], 15);
        int iM222420F10 = m222420F2(iM222420F6, iM222420F9, iM222420F8, iM222420F7, this.f207345X[12], 7);
        int iM222420F11 = m222420F2(iM222420F7, iM222420F10, iM222420F9, iM222420F8, this.f207345X[0], 12);
        int iM222420F12 = m222420F2(iM222420F8, iM222420F11, iM222420F10, iM222420F9, this.f207345X[9], 15);
        int iM222420F13 = m222420F2(iM222420F9, iM222420F12, iM222420F11, iM222420F10, this.f207345X[5], 9);
        int iM222420F14 = m222420F2(iM222420F10, iM222420F13, iM222420F12, iM222420F11, this.f207345X[2], 11);
        int iM222420F15 = m222420F2(iM222420F11, iM222420F14, iM222420F13, iM222420F12, this.f207345X[14], 7);
        int iM222420F16 = m222420F2(iM222420F12, iM222420F15, iM222420F14, iM222420F13, this.f207345X[11], 13);
        int iM222420F17 = m222420F2(iM222420F13, iM222420F16, iM222420F15, iM222420F14, this.f207345X[8], 12);
        int iFF3 = FF3(iM222419F13, iFF19, iFF18, iFF17, this.f207345X[6], 9);
        int iFF20 = FF3(iFF17, iFF3, iFF19, iFF18, this.f207345X[11], 13);
        int iFF21 = FF3(iFF18, iFF20, iFF3, iFF19, this.f207345X[3], 15);
        int iFF22 = FF3(iFF19, iFF21, iFF20, iFF3, this.f207345X[7], 7);
        int iFF23 = FF3(iFF3, iFF22, iFF21, iFF20, this.f207345X[0], 12);
        int iFF24 = FF3(iFF20, iFF23, iFF22, iFF21, this.f207345X[13], 8);
        int iFF25 = FF3(iFF21, iFF24, iFF23, iFF22, this.f207345X[5], 9);
        int iFF26 = FF3(iFF22, iFF25, iFF24, iFF23, this.f207345X[10], 11);
        int iFF27 = FF3(iFF23, iFF26, iFF25, iFF24, this.f207345X[14], 7);
        int iFF28 = FF3(iFF24, iFF27, iFF26, iFF25, this.f207345X[15], 7);
        int iFF29 = FF3(iFF25, iFF28, iFF27, iFF26, this.f207345X[8], 12);
        int iFF30 = FF3(iFF26, iFF29, iFF28, iFF27, this.f207345X[12], 7);
        int iFF31 = FF3(iFF27, iFF30, iFF29, iFF28, this.f207345X[4], 6);
        int iFF32 = FF3(iFF28, iFF31, iFF30, iFF29, this.f207345X[9], 15);
        int iFF33 = FF3(iFF29, iFF32, iFF31, iFF30, this.f207345X[1], 13);
        int iFF34 = FF3(iFF30, iFF33, iFF32, iFF31, this.f207345X[2], 11);
        int iM222421F3 = m222421F3(iM222420F14, iFF34, iM222420F16, iM222420F15, this.f207345X[3], 11);
        int iM222421F4 = m222421F3(iM222420F15, iM222421F3, iFF34, iM222420F16, this.f207345X[10], 13);
        int iM222421F5 = m222421F3(iM222420F16, iM222421F4, iM222421F3, iFF34, this.f207345X[14], 6);
        int iM222421F6 = m222421F3(iFF34, iM222421F5, iM222421F4, iM222421F3, this.f207345X[4], 7);
        int iM222421F7 = m222421F3(iM222421F3, iM222421F6, iM222421F5, iM222421F4, this.f207345X[9], 14);
        int iM222421F8 = m222421F3(iM222421F4, iM222421F7, iM222421F6, iM222421F5, this.f207345X[15], 9);
        int iM222421F9 = m222421F3(iM222421F5, iM222421F8, iM222421F7, iM222421F6, this.f207345X[8], 13);
        int iM222421F10 = m222421F3(iM222421F6, iM222421F9, iM222421F8, iM222421F7, this.f207345X[1], 15);
        int iM222421F11 = m222421F3(iM222421F7, iM222421F10, iM222421F9, iM222421F8, this.f207345X[2], 14);
        int iM222421F12 = m222421F3(iM222421F8, iM222421F11, iM222421F10, iM222421F9, this.f207345X[7], 8);
        int iM222421F13 = m222421F3(iM222421F9, iM222421F12, iM222421F11, iM222421F10, this.f207345X[0], 13);
        int iM222421F14 = m222421F3(iM222421F10, iM222421F13, iM222421F12, iM222421F11, this.f207345X[6], 6);
        int iM222421F15 = m222421F3(iM222421F11, iM222421F14, iM222421F13, iM222421F12, this.f207345X[13], 5);
        int iM222421F16 = m222421F3(iM222421F12, iM222421F15, iM222421F14, iM222421F13, this.f207345X[11], 12);
        int iM222421F17 = m222421F3(iM222421F13, iM222421F16, iM222421F15, iM222421F14, this.f207345X[5], 7);
        int iM222421F18 = m222421F3(iM222421F14, iM222421F17, iM222421F16, iM222421F15, this.f207345X[12], 5);
        int iFF2 = FF2(iFF31, iM222420F17, iFF33, iFF32, this.f207345X[15], 9);
        int iFF35 = FF2(iFF32, iFF2, iM222420F17, iFF33, this.f207345X[5], 7);
        int iFF36 = FF2(iFF33, iFF35, iFF2, iM222420F17, this.f207345X[1], 15);
        int iFF37 = FF2(iM222420F17, iFF36, iFF35, iFF2, this.f207345X[3], 11);
        int iFF38 = FF2(iFF2, iFF37, iFF36, iFF35, this.f207345X[7], 8);
        int iFF39 = FF2(iFF35, iFF38, iFF37, iFF36, this.f207345X[14], 6);
        int iFF40 = FF2(iFF36, iFF39, iFF38, iFF37, this.f207345X[6], 6);
        int iFF41 = FF2(iFF37, iFF40, iFF39, iFF38, this.f207345X[9], 14);
        int iFF42 = FF2(iFF38, iFF41, iFF40, iFF39, this.f207345X[11], 12);
        int iFF43 = FF2(iFF39, iFF42, iFF41, iFF40, this.f207345X[8], 13);
        int iFF44 = FF2(iFF40, iFF43, iFF42, iFF41, this.f207345X[12], 5);
        int iFF45 = FF2(iFF41, iFF44, iFF43, iFF42, this.f207345X[2], 14);
        int iFF46 = FF2(iFF42, iFF45, iFF44, iFF43, this.f207345X[10], 13);
        int iFF47 = FF2(iFF43, iFF46, iFF45, iFF44, this.f207345X[0], 13);
        int iFF48 = FF2(iFF44, iFF47, iFF46, iFF45, this.f207345X[4], 7);
        int iFF49 = FF2(iFF45, iFF48, iFF47, iFF46, this.f207345X[13], 5);
        int iM222422F4 = m222422F4(iM222421F15, iM222421F18, iFF48, iM222421F16, this.f207345X[1], 11);
        int iM222422F5 = m222422F4(iM222421F16, iM222422F4, iM222421F18, iFF48, this.f207345X[9], 12);
        int iM222422F6 = m222422F4(iFF48, iM222422F5, iM222422F4, iM222421F18, this.f207345X[11], 14);
        int iM222422F7 = m222422F4(iM222421F18, iM222422F6, iM222422F5, iM222422F4, this.f207345X[10], 15);
        int iM222422F8 = m222422F4(iM222422F4, iM222422F7, iM222422F6, iM222422F5, this.f207345X[0], 14);
        int iM222422F9 = m222422F4(iM222422F5, iM222422F8, iM222422F7, iM222422F6, this.f207345X[8], 15);
        int iM222422F10 = m222422F4(iM222422F6, iM222422F9, iM222422F8, iM222422F7, this.f207345X[12], 9);
        int iM222422F11 = m222422F4(iM222422F7, iM222422F10, iM222422F9, iM222422F8, this.f207345X[4], 8);
        int iM222422F12 = m222422F4(iM222422F8, iM222422F11, iM222422F10, iM222422F9, this.f207345X[13], 9);
        int iM222422F13 = m222422F4(iM222422F9, iM222422F12, iM222422F11, iM222422F10, this.f207345X[3], 14);
        int iM222422F14 = m222422F4(iM222422F10, iM222422F13, iM222422F12, iM222422F11, this.f207345X[7], 5);
        int iM222422F15 = m222422F4(iM222422F11, iM222422F14, iM222422F13, iM222422F12, this.f207345X[15], 6);
        int iM222422F16 = m222422F4(iM222422F12, iM222422F15, iM222422F14, iM222422F13, this.f207345X[14], 8);
        int iM222422F17 = m222422F4(iM222422F13, iM222422F16, iM222422F15, iM222422F14, this.f207345X[5], 6);
        int iM222422F18 = m222422F4(iM222422F14, iM222422F17, iM222422F16, iM222422F15, this.f207345X[6], 5);
        int iM222422F19 = m222422F4(iM222422F15, iM222422F18, iM222422F17, iM222422F16, this.f207345X[2], 12);
        int iFF1 = FF1(iFF46, iFF49, iM222421F17, iFF47, this.f207345X[8], 15);
        int iFF50 = FF1(iFF47, iFF1, iFF49, iM222421F17, this.f207345X[6], 5);
        int iFF51 = FF1(iM222421F17, iFF50, iFF1, iFF49, this.f207345X[4], 8);
        int iFF52 = FF1(iFF49, iFF51, iFF50, iFF1, this.f207345X[1], 11);
        int iFF53 = FF1(iFF1, iFF52, iFF51, iFF50, this.f207345X[3], 14);
        int iFF54 = FF1(iFF50, iFF53, iFF52, iFF51, this.f207345X[11], 14);
        int iFF55 = FF1(iFF51, iFF54, iFF53, iFF52, this.f207345X[15], 6);
        int iFF56 = FF1(iFF52, iFF55, iFF54, iFF53, this.f207345X[0], 14);
        int iFF57 = FF1(iFF53, iFF56, iFF55, iFF54, this.f207345X[5], 6);
        int iFF58 = FF1(iFF54, iFF57, iFF56, iFF55, this.f207345X[12], 9);
        int iFF59 = FF1(iFF55, iFF58, iFF57, iFF56, this.f207345X[2], 12);
        int iFF60 = FF1(iFF56, iFF59, iFF58, iFF57, this.f207345X[13], 9);
        int iFF61 = FF1(iFF57, iFF60, iFF59, iFF58, this.f207345X[9], 12);
        int iFF62 = FF1(iFF58, iFF61, iFF60, iFF59, this.f207345X[7], 5);
        int iFF63 = FF1(iFF59, iFF62, iFF61, iFF60, this.f207345X[10], 15);
        int iFF64 = FF1(iFF60, iFF63, iFF62, iFF61, this.f207345X[14], 8);
        this.f207337H0 += iM222422F16;
        this.f207338H1 += iM222422F19;
        this.f207339H2 += iM222422F18;
        this.f207340H3 += iFF62;
        this.f207341H4 += iFF61;
        this.f207342H5 += iFF64;
        this.f207343H6 += iFF63;
        this.f207344H7 += iM222422F17;
        this.xOff = 0;
        int i9 = 0;
        while (true) {
            int[] iArr = this.f207345X;
            if (i9 == iArr.length) {
                return;
            }
            iArr[i9] = 0;
            i9++;
        }
    }

    @Override // org.spongycastle.crypto.digests.GeneralDigest
    public void processLength(long j) {
        if (this.xOff > 14) {
            processBlock();
        }
        int[] iArr = this.f207345X;
        iArr[14] = (int) j;
        iArr[15] = (int) (j >>> 32);
    }

    @Override // org.spongycastle.crypto.digests.GeneralDigest
    public void processWord(byte[] bArr, int i) {
        int[] iArr = this.f207345X;
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
        this.f207337H0 = 1732584193;
        this.f207338H1 = -271733879;
        this.f207339H2 = -1732584194;
        this.f207340H3 = 271733878;
        this.f207341H4 = 1985229328;
        this.f207342H5 = -19088744;
        this.f207343H6 = -1985229329;
        this.f207344H7 = 19088743;
        this.xOff = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.f207345X;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    public RIPEMD256Digest(RIPEMD256Digest rIPEMD256Digest) {
        super(rIPEMD256Digest);
        this.f207345X = new int[16];
        copyIn(rIPEMD256Digest);
    }

    @Override // org.spongycastle.util.Memoable
    public void reset(Memoable memoable) {
        copyIn((RIPEMD256Digest) memoable);
    }
}
