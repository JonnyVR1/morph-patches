package org.spongycastle.crypto.digests;

import org.spongycastle.util.Memoable;

/* JADX INFO: loaded from: classes3.dex */
public class RIPEMD256Digest extends GeneralDigest {
    private static final int DIGEST_LENGTH = 32;

    /* JADX INFO: renamed from: H0 */
    private int f206415H0;

    /* JADX INFO: renamed from: H1 */
    private int f206416H1;

    /* JADX INFO: renamed from: H2 */
    private int f206417H2;

    /* JADX INFO: renamed from: H3 */
    private int f206418H3;

    /* JADX INFO: renamed from: H4 */
    private int f206419H4;

    /* JADX INFO: renamed from: H5 */
    private int f206420H5;

    /* JADX INFO: renamed from: H6 */
    private int f206421H6;

    /* JADX INFO: renamed from: H7 */
    private int f206422H7;

    /* JADX INFO: renamed from: X */
    private int[] f206423X;
    private int xOff;

    public RIPEMD256Digest() {
        this.f206423X = new int[16];
        reset();
    }

    /* JADX INFO: renamed from: F1 */
    private int m221173F1(int i, int i2, int i3, int i4, int i5, int i6) {
        return m221177RL(i + m221178f1(i2, i3, i4) + i5, i6);
    }

    /* JADX INFO: renamed from: F2 */
    private int m221174F2(int i, int i2, int i3, int i4, int i5, int i6) {
        return m221177RL(i + m221179f2(i2, i3, i4) + i5 + 1518500249, i6);
    }

    /* JADX INFO: renamed from: F3 */
    private int m221175F3(int i, int i2, int i3, int i4, int i5, int i6) {
        return m221177RL(i + m221180f3(i2, i3, i4) + i5 + 1859775393, i6);
    }

    /* JADX INFO: renamed from: F4 */
    private int m221176F4(int i, int i2, int i3, int i4, int i5, int i6) {
        return m221177RL(((i + m221181f4(i2, i3, i4)) + i5) - 1894007588, i6);
    }

    private int FF1(int i, int i2, int i3, int i4, int i5, int i6) {
        return m221177RL(i + m221178f1(i2, i3, i4) + i5, i6);
    }

    private int FF2(int i, int i2, int i3, int i4, int i5, int i6) {
        return m221177RL(i + m221179f2(i2, i3, i4) + i5 + 1836072691, i6);
    }

    private int FF3(int i, int i2, int i3, int i4, int i5, int i6) {
        return m221177RL(i + m221180f3(i2, i3, i4) + i5 + 1548603684, i6);
    }

    private int FF4(int i, int i2, int i3, int i4, int i5, int i6) {
        return m221177RL(i + m221181f4(i2, i3, i4) + i5 + 1352829926, i6);
    }

    /* JADX INFO: renamed from: RL */
    private int m221177RL(int i, int i2) {
        return (i << i2) | (i >>> (32 - i2));
    }

    private void copyIn(RIPEMD256Digest rIPEMD256Digest) {
        super.copyIn((GeneralDigest) rIPEMD256Digest);
        this.f206415H0 = rIPEMD256Digest.f206415H0;
        this.f206416H1 = rIPEMD256Digest.f206416H1;
        this.f206417H2 = rIPEMD256Digest.f206417H2;
        this.f206418H3 = rIPEMD256Digest.f206418H3;
        this.f206419H4 = rIPEMD256Digest.f206419H4;
        this.f206420H5 = rIPEMD256Digest.f206420H5;
        this.f206421H6 = rIPEMD256Digest.f206421H6;
        this.f206422H7 = rIPEMD256Digest.f206422H7;
        int[] iArr = rIPEMD256Digest.f206423X;
        System.arraycopy(iArr, 0, this.f206423X, 0, iArr.length);
        this.xOff = rIPEMD256Digest.xOff;
    }

    /* JADX INFO: renamed from: f1 */
    private int m221178f1(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    /* JADX INFO: renamed from: f2 */
    private int m221179f2(int i, int i2, int i3) {
        return (i & i2) | ((~i) & i3);
    }

    /* JADX INFO: renamed from: f3 */
    private int m221180f3(int i, int i2, int i3) {
        return ((~i2) | i) ^ i3;
    }

    /* JADX INFO: renamed from: f4 */
    private int m221181f4(int i, int i2, int i3) {
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
        unpackWord(this.f206415H0, bArr, i);
        unpackWord(this.f206416H1, bArr, i + 4);
        unpackWord(this.f206417H2, bArr, i + 8);
        unpackWord(this.f206418H3, bArr, i + 12);
        unpackWord(this.f206419H4, bArr, i + 16);
        unpackWord(this.f206420H5, bArr, i + 20);
        unpackWord(this.f206421H6, bArr, i + 24);
        unpackWord(this.f206422H7, bArr, i + 28);
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
        int i = this.f206415H0;
        int i2 = this.f206416H1;
        int i3 = this.f206417H2;
        int i4 = this.f206418H3;
        int i5 = this.f206419H4;
        int i6 = this.f206420H5;
        int i7 = this.f206421H6;
        int i8 = this.f206422H7;
        int iM221173F1 = m221173F1(i, i2, i3, i4, this.f206423X[0], 11);
        int iM221173F2 = m221173F1(i4, iM221173F1, i2, i3, this.f206423X[1], 14);
        int iM221173F3 = m221173F1(i3, iM221173F2, iM221173F1, i2, this.f206423X[2], 15);
        int iM221173F4 = m221173F1(i2, iM221173F3, iM221173F2, iM221173F1, this.f206423X[3], 12);
        int iM221173F5 = m221173F1(iM221173F1, iM221173F4, iM221173F3, iM221173F2, this.f206423X[4], 5);
        int iM221173F6 = m221173F1(iM221173F2, iM221173F5, iM221173F4, iM221173F3, this.f206423X[5], 8);
        int iM221173F7 = m221173F1(iM221173F3, iM221173F6, iM221173F5, iM221173F4, this.f206423X[6], 7);
        int iM221173F8 = m221173F1(iM221173F4, iM221173F7, iM221173F6, iM221173F5, this.f206423X[7], 9);
        int iM221173F9 = m221173F1(iM221173F5, iM221173F8, iM221173F7, iM221173F6, this.f206423X[8], 11);
        int iM221173F10 = m221173F1(iM221173F6, iM221173F9, iM221173F8, iM221173F7, this.f206423X[9], 13);
        int iM221173F11 = m221173F1(iM221173F7, iM221173F10, iM221173F9, iM221173F8, this.f206423X[10], 14);
        int iM221173F12 = m221173F1(iM221173F8, iM221173F11, iM221173F10, iM221173F9, this.f206423X[11], 15);
        int iM221173F13 = m221173F1(iM221173F9, iM221173F12, iM221173F11, iM221173F10, this.f206423X[12], 6);
        int iM221173F14 = m221173F1(iM221173F10, iM221173F13, iM221173F12, iM221173F11, this.f206423X[13], 7);
        int iM221173F15 = m221173F1(iM221173F11, iM221173F14, iM221173F13, iM221173F12, this.f206423X[14], 9);
        int iM221173F16 = m221173F1(iM221173F12, iM221173F15, iM221173F14, iM221173F13, this.f206423X[15], 8);
        int iFF4 = FF4(i5, i6, i7, i8, this.f206423X[5], 8);
        int iFF5 = FF4(i8, iFF4, i6, i7, this.f206423X[14], 9);
        int iFF6 = FF4(i7, iFF5, iFF4, i6, this.f206423X[7], 9);
        int iFF7 = FF4(i6, iFF6, iFF5, iFF4, this.f206423X[0], 11);
        int iFF8 = FF4(iFF4, iFF7, iFF6, iFF5, this.f206423X[9], 13);
        int iFF9 = FF4(iFF5, iFF8, iFF7, iFF6, this.f206423X[2], 15);
        int iFF10 = FF4(iFF6, iFF9, iFF8, iFF7, this.f206423X[11], 15);
        int iFF11 = FF4(iFF7, iFF10, iFF9, iFF8, this.f206423X[4], 5);
        int iFF12 = FF4(iFF8, iFF11, iFF10, iFF9, this.f206423X[13], 7);
        int iFF13 = FF4(iFF9, iFF12, iFF11, iFF10, this.f206423X[6], 7);
        int iFF14 = FF4(iFF10, iFF13, iFF12, iFF11, this.f206423X[15], 8);
        int iFF15 = FF4(iFF11, iFF14, iFF13, iFF12, this.f206423X[8], 11);
        int iFF16 = FF4(iFF12, iFF15, iFF14, iFF13, this.f206423X[1], 14);
        int iFF17 = FF4(iFF13, iFF16, iFF15, iFF14, this.f206423X[10], 14);
        int iFF18 = FF4(iFF14, iFF17, iFF16, iFF15, this.f206423X[3], 12);
        int iFF19 = FF4(iFF15, iFF18, iFF17, iFF16, this.f206423X[12], 6);
        int iM221174F2 = m221174F2(iFF16, iM221173F16, iM221173F15, iM221173F14, this.f206423X[7], 7);
        int iM221174F3 = m221174F2(iM221173F14, iM221174F2, iM221173F16, iM221173F15, this.f206423X[4], 6);
        int iM221174F4 = m221174F2(iM221173F15, iM221174F3, iM221174F2, iM221173F16, this.f206423X[13], 8);
        int iM221174F5 = m221174F2(iM221173F16, iM221174F4, iM221174F3, iM221174F2, this.f206423X[1], 13);
        int iM221174F6 = m221174F2(iM221174F2, iM221174F5, iM221174F4, iM221174F3, this.f206423X[10], 11);
        int iM221174F7 = m221174F2(iM221174F3, iM221174F6, iM221174F5, iM221174F4, this.f206423X[6], 9);
        int iM221174F8 = m221174F2(iM221174F4, iM221174F7, iM221174F6, iM221174F5, this.f206423X[15], 7);
        int iM221174F9 = m221174F2(iM221174F5, iM221174F8, iM221174F7, iM221174F6, this.f206423X[3], 15);
        int iM221174F10 = m221174F2(iM221174F6, iM221174F9, iM221174F8, iM221174F7, this.f206423X[12], 7);
        int iM221174F11 = m221174F2(iM221174F7, iM221174F10, iM221174F9, iM221174F8, this.f206423X[0], 12);
        int iM221174F12 = m221174F2(iM221174F8, iM221174F11, iM221174F10, iM221174F9, this.f206423X[9], 15);
        int iM221174F13 = m221174F2(iM221174F9, iM221174F12, iM221174F11, iM221174F10, this.f206423X[5], 9);
        int iM221174F14 = m221174F2(iM221174F10, iM221174F13, iM221174F12, iM221174F11, this.f206423X[2], 11);
        int iM221174F15 = m221174F2(iM221174F11, iM221174F14, iM221174F13, iM221174F12, this.f206423X[14], 7);
        int iM221174F16 = m221174F2(iM221174F12, iM221174F15, iM221174F14, iM221174F13, this.f206423X[11], 13);
        int iM221174F17 = m221174F2(iM221174F13, iM221174F16, iM221174F15, iM221174F14, this.f206423X[8], 12);
        int iFF3 = FF3(iM221173F13, iFF19, iFF18, iFF17, this.f206423X[6], 9);
        int iFF20 = FF3(iFF17, iFF3, iFF19, iFF18, this.f206423X[11], 13);
        int iFF21 = FF3(iFF18, iFF20, iFF3, iFF19, this.f206423X[3], 15);
        int iFF22 = FF3(iFF19, iFF21, iFF20, iFF3, this.f206423X[7], 7);
        int iFF23 = FF3(iFF3, iFF22, iFF21, iFF20, this.f206423X[0], 12);
        int iFF24 = FF3(iFF20, iFF23, iFF22, iFF21, this.f206423X[13], 8);
        int iFF25 = FF3(iFF21, iFF24, iFF23, iFF22, this.f206423X[5], 9);
        int iFF26 = FF3(iFF22, iFF25, iFF24, iFF23, this.f206423X[10], 11);
        int iFF27 = FF3(iFF23, iFF26, iFF25, iFF24, this.f206423X[14], 7);
        int iFF28 = FF3(iFF24, iFF27, iFF26, iFF25, this.f206423X[15], 7);
        int iFF29 = FF3(iFF25, iFF28, iFF27, iFF26, this.f206423X[8], 12);
        int iFF30 = FF3(iFF26, iFF29, iFF28, iFF27, this.f206423X[12], 7);
        int iFF31 = FF3(iFF27, iFF30, iFF29, iFF28, this.f206423X[4], 6);
        int iFF32 = FF3(iFF28, iFF31, iFF30, iFF29, this.f206423X[9], 15);
        int iFF33 = FF3(iFF29, iFF32, iFF31, iFF30, this.f206423X[1], 13);
        int iFF34 = FF3(iFF30, iFF33, iFF32, iFF31, this.f206423X[2], 11);
        int iM221175F3 = m221175F3(iM221174F14, iFF34, iM221174F16, iM221174F15, this.f206423X[3], 11);
        int iM221175F4 = m221175F3(iM221174F15, iM221175F3, iFF34, iM221174F16, this.f206423X[10], 13);
        int iM221175F5 = m221175F3(iM221174F16, iM221175F4, iM221175F3, iFF34, this.f206423X[14], 6);
        int iM221175F6 = m221175F3(iFF34, iM221175F5, iM221175F4, iM221175F3, this.f206423X[4], 7);
        int iM221175F7 = m221175F3(iM221175F3, iM221175F6, iM221175F5, iM221175F4, this.f206423X[9], 14);
        int iM221175F8 = m221175F3(iM221175F4, iM221175F7, iM221175F6, iM221175F5, this.f206423X[15], 9);
        int iM221175F9 = m221175F3(iM221175F5, iM221175F8, iM221175F7, iM221175F6, this.f206423X[8], 13);
        int iM221175F10 = m221175F3(iM221175F6, iM221175F9, iM221175F8, iM221175F7, this.f206423X[1], 15);
        int iM221175F11 = m221175F3(iM221175F7, iM221175F10, iM221175F9, iM221175F8, this.f206423X[2], 14);
        int iM221175F12 = m221175F3(iM221175F8, iM221175F11, iM221175F10, iM221175F9, this.f206423X[7], 8);
        int iM221175F13 = m221175F3(iM221175F9, iM221175F12, iM221175F11, iM221175F10, this.f206423X[0], 13);
        int iM221175F14 = m221175F3(iM221175F10, iM221175F13, iM221175F12, iM221175F11, this.f206423X[6], 6);
        int iM221175F15 = m221175F3(iM221175F11, iM221175F14, iM221175F13, iM221175F12, this.f206423X[13], 5);
        int iM221175F16 = m221175F3(iM221175F12, iM221175F15, iM221175F14, iM221175F13, this.f206423X[11], 12);
        int iM221175F17 = m221175F3(iM221175F13, iM221175F16, iM221175F15, iM221175F14, this.f206423X[5], 7);
        int iM221175F18 = m221175F3(iM221175F14, iM221175F17, iM221175F16, iM221175F15, this.f206423X[12], 5);
        int iFF2 = FF2(iFF31, iM221174F17, iFF33, iFF32, this.f206423X[15], 9);
        int iFF35 = FF2(iFF32, iFF2, iM221174F17, iFF33, this.f206423X[5], 7);
        int iFF36 = FF2(iFF33, iFF35, iFF2, iM221174F17, this.f206423X[1], 15);
        int iFF37 = FF2(iM221174F17, iFF36, iFF35, iFF2, this.f206423X[3], 11);
        int iFF38 = FF2(iFF2, iFF37, iFF36, iFF35, this.f206423X[7], 8);
        int iFF39 = FF2(iFF35, iFF38, iFF37, iFF36, this.f206423X[14], 6);
        int iFF40 = FF2(iFF36, iFF39, iFF38, iFF37, this.f206423X[6], 6);
        int iFF41 = FF2(iFF37, iFF40, iFF39, iFF38, this.f206423X[9], 14);
        int iFF42 = FF2(iFF38, iFF41, iFF40, iFF39, this.f206423X[11], 12);
        int iFF43 = FF2(iFF39, iFF42, iFF41, iFF40, this.f206423X[8], 13);
        int iFF44 = FF2(iFF40, iFF43, iFF42, iFF41, this.f206423X[12], 5);
        int iFF45 = FF2(iFF41, iFF44, iFF43, iFF42, this.f206423X[2], 14);
        int iFF46 = FF2(iFF42, iFF45, iFF44, iFF43, this.f206423X[10], 13);
        int iFF47 = FF2(iFF43, iFF46, iFF45, iFF44, this.f206423X[0], 13);
        int iFF48 = FF2(iFF44, iFF47, iFF46, iFF45, this.f206423X[4], 7);
        int iFF49 = FF2(iFF45, iFF48, iFF47, iFF46, this.f206423X[13], 5);
        int iM221176F4 = m221176F4(iM221175F15, iM221175F18, iFF48, iM221175F16, this.f206423X[1], 11);
        int iM221176F5 = m221176F4(iM221175F16, iM221176F4, iM221175F18, iFF48, this.f206423X[9], 12);
        int iM221176F6 = m221176F4(iFF48, iM221176F5, iM221176F4, iM221175F18, this.f206423X[11], 14);
        int iM221176F7 = m221176F4(iM221175F18, iM221176F6, iM221176F5, iM221176F4, this.f206423X[10], 15);
        int iM221176F8 = m221176F4(iM221176F4, iM221176F7, iM221176F6, iM221176F5, this.f206423X[0], 14);
        int iM221176F9 = m221176F4(iM221176F5, iM221176F8, iM221176F7, iM221176F6, this.f206423X[8], 15);
        int iM221176F10 = m221176F4(iM221176F6, iM221176F9, iM221176F8, iM221176F7, this.f206423X[12], 9);
        int iM221176F11 = m221176F4(iM221176F7, iM221176F10, iM221176F9, iM221176F8, this.f206423X[4], 8);
        int iM221176F12 = m221176F4(iM221176F8, iM221176F11, iM221176F10, iM221176F9, this.f206423X[13], 9);
        int iM221176F13 = m221176F4(iM221176F9, iM221176F12, iM221176F11, iM221176F10, this.f206423X[3], 14);
        int iM221176F14 = m221176F4(iM221176F10, iM221176F13, iM221176F12, iM221176F11, this.f206423X[7], 5);
        int iM221176F15 = m221176F4(iM221176F11, iM221176F14, iM221176F13, iM221176F12, this.f206423X[15], 6);
        int iM221176F16 = m221176F4(iM221176F12, iM221176F15, iM221176F14, iM221176F13, this.f206423X[14], 8);
        int iM221176F17 = m221176F4(iM221176F13, iM221176F16, iM221176F15, iM221176F14, this.f206423X[5], 6);
        int iM221176F18 = m221176F4(iM221176F14, iM221176F17, iM221176F16, iM221176F15, this.f206423X[6], 5);
        int iM221176F19 = m221176F4(iM221176F15, iM221176F18, iM221176F17, iM221176F16, this.f206423X[2], 12);
        int iFF1 = FF1(iFF46, iFF49, iM221175F17, iFF47, this.f206423X[8], 15);
        int iFF50 = FF1(iFF47, iFF1, iFF49, iM221175F17, this.f206423X[6], 5);
        int iFF51 = FF1(iM221175F17, iFF50, iFF1, iFF49, this.f206423X[4], 8);
        int iFF52 = FF1(iFF49, iFF51, iFF50, iFF1, this.f206423X[1], 11);
        int iFF53 = FF1(iFF1, iFF52, iFF51, iFF50, this.f206423X[3], 14);
        int iFF54 = FF1(iFF50, iFF53, iFF52, iFF51, this.f206423X[11], 14);
        int iFF55 = FF1(iFF51, iFF54, iFF53, iFF52, this.f206423X[15], 6);
        int iFF56 = FF1(iFF52, iFF55, iFF54, iFF53, this.f206423X[0], 14);
        int iFF57 = FF1(iFF53, iFF56, iFF55, iFF54, this.f206423X[5], 6);
        int iFF58 = FF1(iFF54, iFF57, iFF56, iFF55, this.f206423X[12], 9);
        int iFF59 = FF1(iFF55, iFF58, iFF57, iFF56, this.f206423X[2], 12);
        int iFF60 = FF1(iFF56, iFF59, iFF58, iFF57, this.f206423X[13], 9);
        int iFF61 = FF1(iFF57, iFF60, iFF59, iFF58, this.f206423X[9], 12);
        int iFF62 = FF1(iFF58, iFF61, iFF60, iFF59, this.f206423X[7], 5);
        int iFF63 = FF1(iFF59, iFF62, iFF61, iFF60, this.f206423X[10], 15);
        int iFF64 = FF1(iFF60, iFF63, iFF62, iFF61, this.f206423X[14], 8);
        this.f206415H0 += iM221176F16;
        this.f206416H1 += iM221176F19;
        this.f206417H2 += iM221176F18;
        this.f206418H3 += iFF62;
        this.f206419H4 += iFF61;
        this.f206420H5 += iFF64;
        this.f206421H6 += iFF63;
        this.f206422H7 += iM221176F17;
        this.xOff = 0;
        int i9 = 0;
        while (true) {
            int[] iArr = this.f206423X;
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
        int[] iArr = this.f206423X;
        iArr[14] = (int) j;
        iArr[15] = (int) (j >>> 32);
    }

    @Override // org.spongycastle.crypto.digests.GeneralDigest
    public void processWord(byte[] bArr, int i) {
        int[] iArr = this.f206423X;
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
        this.f206415H0 = 1732584193;
        this.f206416H1 = -271733879;
        this.f206417H2 = -1732584194;
        this.f206418H3 = 271733878;
        this.f206419H4 = 1985229328;
        this.f206420H5 = -19088744;
        this.f206421H6 = -1985229329;
        this.f206422H7 = 19088743;
        this.xOff = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.f206423X;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    public RIPEMD256Digest(RIPEMD256Digest rIPEMD256Digest) {
        super(rIPEMD256Digest);
        this.f206423X = new int[16];
        copyIn(rIPEMD256Digest);
    }

    @Override // org.spongycastle.util.Memoable
    public void reset(Memoable memoable) {
        copyIn((RIPEMD256Digest) memoable);
    }
}
