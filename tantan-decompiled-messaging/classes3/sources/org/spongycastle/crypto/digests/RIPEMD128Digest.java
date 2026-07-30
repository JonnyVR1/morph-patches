package org.spongycastle.crypto.digests;

import org.spongycastle.util.Memoable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class RIPEMD128Digest extends GeneralDigest {
    private static final int DIGEST_LENGTH = 16;

    /* JADX INFO: renamed from: H0 */
    private int f10029H0;

    /* JADX INFO: renamed from: H1 */
    private int f10030H1;

    /* JADX INFO: renamed from: H2 */
    private int f10031H2;

    /* JADX INFO: renamed from: H3 */
    private int f10032H3;

    /* JADX INFO: renamed from: X */
    private int[] f10033X;
    private int xOff;

    public RIPEMD128Digest() {
        this.f10033X = new int[16];
        reset();
    }

    /* JADX INFO: renamed from: F1 */
    private int m9615F1(int i, int i2, int i3, int i4, int i5, int i6) {
        return m9619RL(i + m9620f1(i2, i3, i4) + i5, i6);
    }

    /* JADX INFO: renamed from: F2 */
    private int m9616F2(int i, int i2, int i3, int i4, int i5, int i6) {
        return m9619RL(i + m9621f2(i2, i3, i4) + i5 + 1518500249, i6);
    }

    /* JADX INFO: renamed from: F3 */
    private int m9617F3(int i, int i2, int i3, int i4, int i5, int i6) {
        return m9619RL(i + m9622f3(i2, i3, i4) + i5 + 1859775393, i6);
    }

    /* JADX INFO: renamed from: F4 */
    private int m9618F4(int i, int i2, int i3, int i4, int i5, int i6) {
        return m9619RL(((i + m9623f4(i2, i3, i4)) + i5) - 1894007588, i6);
    }

    private int FF1(int i, int i2, int i3, int i4, int i5, int i6) {
        return m9619RL(i + m9620f1(i2, i3, i4) + i5, i6);
    }

    private int FF2(int i, int i2, int i3, int i4, int i5, int i6) {
        return m9619RL(i + m9621f2(i2, i3, i4) + i5 + 1836072691, i6);
    }

    private int FF3(int i, int i2, int i3, int i4, int i5, int i6) {
        return m9619RL(i + m9622f3(i2, i3, i4) + i5 + 1548603684, i6);
    }

    private int FF4(int i, int i2, int i3, int i4, int i5, int i6) {
        return m9619RL(i + m9623f4(i2, i3, i4) + i5 + 1352829926, i6);
    }

    /* JADX INFO: renamed from: RL */
    private int m9619RL(int i, int i2) {
        return (i << i2) | (i >>> (32 - i2));
    }

    private void copyIn(RIPEMD128Digest rIPEMD128Digest) {
        super.copyIn((GeneralDigest) rIPEMD128Digest);
        this.f10029H0 = rIPEMD128Digest.f10029H0;
        this.f10030H1 = rIPEMD128Digest.f10030H1;
        this.f10031H2 = rIPEMD128Digest.f10031H2;
        this.f10032H3 = rIPEMD128Digest.f10032H3;
        int[] iArr = rIPEMD128Digest.f10033X;
        System.arraycopy(iArr, 0, this.f10033X, 0, iArr.length);
        this.xOff = rIPEMD128Digest.xOff;
    }

    /* JADX INFO: renamed from: f1 */
    private int m9620f1(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    /* JADX INFO: renamed from: f2 */
    private int m9621f2(int i, int i2, int i3) {
        return (i & i2) | ((~i) & i3);
    }

    /* JADX INFO: renamed from: f3 */
    private int m9622f3(int i, int i2, int i3) {
        return ((~i2) | i) ^ i3;
    }

    /* JADX INFO: renamed from: f4 */
    private int m9623f4(int i, int i2, int i3) {
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
        unpackWord(this.f10029H0, bArr, i);
        unpackWord(this.f10030H1, bArr, i + 4);
        unpackWord(this.f10031H2, bArr, i + 8);
        unpackWord(this.f10032H3, bArr, i + 12);
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
        int i = this.f10029H0;
        int i2 = this.f10030H1;
        int i3 = this.f10031H2;
        int i4 = this.f10032H3;
        int iM9615F1 = m9615F1(i, i2, i3, i4, this.f10033X[0], 11);
        int iM9615F2 = m9615F1(i4, iM9615F1, i2, i3, this.f10033X[1], 14);
        int iM9615F3 = m9615F1(i3, iM9615F2, iM9615F1, i2, this.f10033X[2], 15);
        int iM9615F4 = m9615F1(i2, iM9615F3, iM9615F2, iM9615F1, this.f10033X[3], 12);
        int iM9615F5 = m9615F1(iM9615F1, iM9615F4, iM9615F3, iM9615F2, this.f10033X[4], 5);
        int iM9615F6 = m9615F1(iM9615F2, iM9615F5, iM9615F4, iM9615F3, this.f10033X[5], 8);
        int iM9615F7 = m9615F1(iM9615F3, iM9615F6, iM9615F5, iM9615F4, this.f10033X[6], 7);
        int iM9615F8 = m9615F1(iM9615F4, iM9615F7, iM9615F6, iM9615F5, this.f10033X[7], 9);
        int iM9615F9 = m9615F1(iM9615F5, iM9615F8, iM9615F7, iM9615F6, this.f10033X[8], 11);
        int iM9615F10 = m9615F1(iM9615F6, iM9615F9, iM9615F8, iM9615F7, this.f10033X[9], 13);
        int iM9615F11 = m9615F1(iM9615F7, iM9615F10, iM9615F9, iM9615F8, this.f10033X[10], 14);
        int iM9615F12 = m9615F1(iM9615F8, iM9615F11, iM9615F10, iM9615F9, this.f10033X[11], 15);
        int iM9615F13 = m9615F1(iM9615F9, iM9615F12, iM9615F11, iM9615F10, this.f10033X[12], 6);
        int iM9615F14 = m9615F1(iM9615F10, iM9615F13, iM9615F12, iM9615F11, this.f10033X[13], 7);
        int iM9615F15 = m9615F1(iM9615F11, iM9615F14, iM9615F13, iM9615F12, this.f10033X[14], 9);
        int iM9615F16 = m9615F1(iM9615F12, iM9615F15, iM9615F14, iM9615F13, this.f10033X[15], 8);
        int iM9616F2 = m9616F2(iM9615F13, iM9615F16, iM9615F15, iM9615F14, this.f10033X[7], 7);
        int iM9616F3 = m9616F2(iM9615F14, iM9616F2, iM9615F16, iM9615F15, this.f10033X[4], 6);
        int iM9616F4 = m9616F2(iM9615F15, iM9616F3, iM9616F2, iM9615F16, this.f10033X[13], 8);
        int iM9616F5 = m9616F2(iM9615F16, iM9616F4, iM9616F3, iM9616F2, this.f10033X[1], 13);
        int iM9616F6 = m9616F2(iM9616F2, iM9616F5, iM9616F4, iM9616F3, this.f10033X[10], 11);
        int iM9616F7 = m9616F2(iM9616F3, iM9616F6, iM9616F5, iM9616F4, this.f10033X[6], 9);
        int iM9616F8 = m9616F2(iM9616F4, iM9616F7, iM9616F6, iM9616F5, this.f10033X[15], 7);
        int iM9616F9 = m9616F2(iM9616F5, iM9616F8, iM9616F7, iM9616F6, this.f10033X[3], 15);
        int iM9616F10 = m9616F2(iM9616F6, iM9616F9, iM9616F8, iM9616F7, this.f10033X[12], 7);
        int iM9616F11 = m9616F2(iM9616F7, iM9616F10, iM9616F9, iM9616F8, this.f10033X[0], 12);
        int iM9616F12 = m9616F2(iM9616F8, iM9616F11, iM9616F10, iM9616F9, this.f10033X[9], 15);
        int iM9616F13 = m9616F2(iM9616F9, iM9616F12, iM9616F11, iM9616F10, this.f10033X[5], 9);
        int iM9616F14 = m9616F2(iM9616F10, iM9616F13, iM9616F12, iM9616F11, this.f10033X[2], 11);
        int iM9616F15 = m9616F2(iM9616F11, iM9616F14, iM9616F13, iM9616F12, this.f10033X[14], 7);
        int iM9616F16 = m9616F2(iM9616F12, iM9616F15, iM9616F14, iM9616F13, this.f10033X[11], 13);
        int iM9616F17 = m9616F2(iM9616F13, iM9616F16, iM9616F15, iM9616F14, this.f10033X[8], 12);
        int iM9617F3 = m9617F3(iM9616F14, iM9616F17, iM9616F16, iM9616F15, this.f10033X[3], 11);
        int iM9617F4 = m9617F3(iM9616F15, iM9617F3, iM9616F17, iM9616F16, this.f10033X[10], 13);
        int iM9617F5 = m9617F3(iM9616F16, iM9617F4, iM9617F3, iM9616F17, this.f10033X[14], 6);
        int iM9617F6 = m9617F3(iM9616F17, iM9617F5, iM9617F4, iM9617F3, this.f10033X[4], 7);
        int iM9617F7 = m9617F3(iM9617F3, iM9617F6, iM9617F5, iM9617F4, this.f10033X[9], 14);
        int iM9617F8 = m9617F3(iM9617F4, iM9617F7, iM9617F6, iM9617F5, this.f10033X[15], 9);
        int iM9617F9 = m9617F3(iM9617F5, iM9617F8, iM9617F7, iM9617F6, this.f10033X[8], 13);
        int iM9617F10 = m9617F3(iM9617F6, iM9617F9, iM9617F8, iM9617F7, this.f10033X[1], 15);
        int iM9617F11 = m9617F3(iM9617F7, iM9617F10, iM9617F9, iM9617F8, this.f10033X[2], 14);
        int iM9617F12 = m9617F3(iM9617F8, iM9617F11, iM9617F10, iM9617F9, this.f10033X[7], 8);
        int iM9617F13 = m9617F3(iM9617F9, iM9617F12, iM9617F11, iM9617F10, this.f10033X[0], 13);
        int iM9617F14 = m9617F3(iM9617F10, iM9617F13, iM9617F12, iM9617F11, this.f10033X[6], 6);
        int iM9617F15 = m9617F3(iM9617F11, iM9617F14, iM9617F13, iM9617F12, this.f10033X[13], 5);
        int iM9617F16 = m9617F3(iM9617F12, iM9617F15, iM9617F14, iM9617F13, this.f10033X[11], 12);
        int iM9617F17 = m9617F3(iM9617F13, iM9617F16, iM9617F15, iM9617F14, this.f10033X[5], 7);
        int iM9617F18 = m9617F3(iM9617F14, iM9617F17, iM9617F16, iM9617F15, this.f10033X[12], 5);
        int iM9618F4 = m9618F4(iM9617F15, iM9617F18, iM9617F17, iM9617F16, this.f10033X[1], 11);
        int iM9618F5 = m9618F4(iM9617F16, iM9618F4, iM9617F18, iM9617F17, this.f10033X[9], 12);
        int iM9618F6 = m9618F4(iM9617F17, iM9618F5, iM9618F4, iM9617F18, this.f10033X[11], 14);
        int iM9618F7 = m9618F4(iM9617F18, iM9618F6, iM9618F5, iM9618F4, this.f10033X[10], 15);
        int iM9618F8 = m9618F4(iM9618F4, iM9618F7, iM9618F6, iM9618F5, this.f10033X[0], 14);
        int iM9618F9 = m9618F4(iM9618F5, iM9618F8, iM9618F7, iM9618F6, this.f10033X[8], 15);
        int iM9618F10 = m9618F4(iM9618F6, iM9618F9, iM9618F8, iM9618F7, this.f10033X[12], 9);
        int iM9618F11 = m9618F4(iM9618F7, iM9618F10, iM9618F9, iM9618F8, this.f10033X[4], 8);
        int iM9618F12 = m9618F4(iM9618F8, iM9618F11, iM9618F10, iM9618F9, this.f10033X[13], 9);
        int iM9618F13 = m9618F4(iM9618F9, iM9618F12, iM9618F11, iM9618F10, this.f10033X[3], 14);
        int iM9618F14 = m9618F4(iM9618F10, iM9618F13, iM9618F12, iM9618F11, this.f10033X[7], 5);
        int iM9618F15 = m9618F4(iM9618F11, iM9618F14, iM9618F13, iM9618F12, this.f10033X[15], 6);
        int iM9618F16 = m9618F4(iM9618F12, iM9618F15, iM9618F14, iM9618F13, this.f10033X[14], 8);
        int iM9618F17 = m9618F4(iM9618F13, iM9618F16, iM9618F15, iM9618F14, this.f10033X[5], 6);
        int iM9618F18 = m9618F4(iM9618F14, iM9618F17, iM9618F16, iM9618F15, this.f10033X[6], 5);
        int iM9618F19 = m9618F4(iM9618F15, iM9618F18, iM9618F17, iM9618F16, this.f10033X[2], 12);
        int iFF4 = FF4(i, i2, i3, i4, this.f10033X[5], 8);
        int iFF5 = FF4(i4, iFF4, i2, i3, this.f10033X[14], 9);
        int iFF6 = FF4(i3, iFF5, iFF4, i2, this.f10033X[7], 9);
        int iFF7 = FF4(i2, iFF6, iFF5, iFF4, this.f10033X[0], 11);
        int iFF8 = FF4(iFF4, iFF7, iFF6, iFF5, this.f10033X[9], 13);
        int iFF9 = FF4(iFF5, iFF8, iFF7, iFF6, this.f10033X[2], 15);
        int iFF10 = FF4(iFF6, iFF9, iFF8, iFF7, this.f10033X[11], 15);
        int iFF11 = FF4(iFF7, iFF10, iFF9, iFF8, this.f10033X[4], 5);
        int iFF12 = FF4(iFF8, iFF11, iFF10, iFF9, this.f10033X[13], 7);
        int iFF13 = FF4(iFF9, iFF12, iFF11, iFF10, this.f10033X[6], 7);
        int iFF14 = FF4(iFF10, iFF13, iFF12, iFF11, this.f10033X[15], 8);
        int iFF15 = FF4(iFF11, iFF14, iFF13, iFF12, this.f10033X[8], 11);
        int iFF16 = FF4(iFF12, iFF15, iFF14, iFF13, this.f10033X[1], 14);
        int iFF17 = FF4(iFF13, iFF16, iFF15, iFF14, this.f10033X[10], 14);
        int iFF18 = FF4(iFF14, iFF17, iFF16, iFF15, this.f10033X[3], 12);
        int iFF19 = FF4(iFF15, iFF18, iFF17, iFF16, this.f10033X[12], 6);
        int iFF3 = FF3(iFF16, iFF19, iFF18, iFF17, this.f10033X[6], 9);
        int iFF20 = FF3(iFF17, iFF3, iFF19, iFF18, this.f10033X[11], 13);
        int iFF21 = FF3(iFF18, iFF20, iFF3, iFF19, this.f10033X[3], 15);
        int iFF22 = FF3(iFF19, iFF21, iFF20, iFF3, this.f10033X[7], 7);
        int iFF23 = FF3(iFF3, iFF22, iFF21, iFF20, this.f10033X[0], 12);
        int iFF24 = FF3(iFF20, iFF23, iFF22, iFF21, this.f10033X[13], 8);
        int iFF25 = FF3(iFF21, iFF24, iFF23, iFF22, this.f10033X[5], 9);
        int iFF26 = FF3(iFF22, iFF25, iFF24, iFF23, this.f10033X[10], 11);
        int iFF27 = FF3(iFF23, iFF26, iFF25, iFF24, this.f10033X[14], 7);
        int iFF28 = FF3(iFF24, iFF27, iFF26, iFF25, this.f10033X[15], 7);
        int iFF29 = FF3(iFF25, iFF28, iFF27, iFF26, this.f10033X[8], 12);
        int iFF30 = FF3(iFF26, iFF29, iFF28, iFF27, this.f10033X[12], 7);
        int iFF31 = FF3(iFF27, iFF30, iFF29, iFF28, this.f10033X[4], 6);
        int iFF32 = FF3(iFF28, iFF31, iFF30, iFF29, this.f10033X[9], 15);
        int iFF33 = FF3(iFF29, iFF32, iFF31, iFF30, this.f10033X[1], 13);
        int iFF34 = FF3(iFF30, iFF33, iFF32, iFF31, this.f10033X[2], 11);
        int iFF2 = FF2(iFF31, iFF34, iFF33, iFF32, this.f10033X[15], 9);
        int iFF35 = FF2(iFF32, iFF2, iFF34, iFF33, this.f10033X[5], 7);
        int iFF36 = FF2(iFF33, iFF35, iFF2, iFF34, this.f10033X[1], 15);
        int iFF37 = FF2(iFF34, iFF36, iFF35, iFF2, this.f10033X[3], 11);
        int iFF38 = FF2(iFF2, iFF37, iFF36, iFF35, this.f10033X[7], 8);
        int iFF39 = FF2(iFF35, iFF38, iFF37, iFF36, this.f10033X[14], 6);
        int iFF40 = FF2(iFF36, iFF39, iFF38, iFF37, this.f10033X[6], 6);
        int iFF41 = FF2(iFF37, iFF40, iFF39, iFF38, this.f10033X[9], 14);
        int iFF42 = FF2(iFF38, iFF41, iFF40, iFF39, this.f10033X[11], 12);
        int iFF43 = FF2(iFF39, iFF42, iFF41, iFF40, this.f10033X[8], 13);
        int iFF44 = FF2(iFF40, iFF43, iFF42, iFF41, this.f10033X[12], 5);
        int iFF45 = FF2(iFF41, iFF44, iFF43, iFF42, this.f10033X[2], 14);
        int iFF46 = FF2(iFF42, iFF45, iFF44, iFF43, this.f10033X[10], 13);
        int iFF47 = FF2(iFF43, iFF46, iFF45, iFF44, this.f10033X[0], 13);
        int iFF48 = FF2(iFF44, iFF47, iFF46, iFF45, this.f10033X[4], 7);
        int iFF49 = FF2(iFF45, iFF48, iFF47, iFF46, this.f10033X[13], 5);
        int iFF1 = FF1(iFF46, iFF49, iFF48, iFF47, this.f10033X[8], 15);
        int iFF50 = FF1(iFF47, iFF1, iFF49, iFF48, this.f10033X[6], 5);
        int iFF51 = FF1(iFF48, iFF50, iFF1, iFF49, this.f10033X[4], 8);
        int iFF52 = FF1(iFF49, iFF51, iFF50, iFF1, this.f10033X[1], 11);
        int iFF53 = FF1(iFF1, iFF52, iFF51, iFF50, this.f10033X[3], 14);
        int iFF54 = FF1(iFF50, iFF53, iFF52, iFF51, this.f10033X[11], 14);
        int iFF55 = FF1(iFF51, iFF54, iFF53, iFF52, this.f10033X[15], 6);
        int iFF56 = FF1(iFF52, iFF55, iFF54, iFF53, this.f10033X[0], 14);
        int iFF57 = FF1(iFF53, iFF56, iFF55, iFF54, this.f10033X[5], 6);
        int iFF58 = FF1(iFF54, iFF57, iFF56, iFF55, this.f10033X[12], 9);
        int iFF59 = FF1(iFF55, iFF58, iFF57, iFF56, this.f10033X[2], 12);
        int iFF60 = FF1(iFF56, iFF59, iFF58, iFF57, this.f10033X[13], 9);
        int iFF61 = FF1(iFF57, iFF60, iFF59, iFF58, this.f10033X[9], 12);
        int iFF62 = FF1(iFF58, iFF61, iFF60, iFF59, this.f10033X[7], 5);
        int iFF63 = FF1(iFF59, iFF62, iFF61, iFF60, this.f10033X[10], 15);
        int iFF64 = FF1(iFF60, iFF63, iFF62, iFF61, this.f10033X[14], 8);
        int i5 = iFF62 + iM9618F18 + this.f10030H1;
        this.f10030H1 = this.f10031H2 + iM9618F17 + iFF61;
        this.f10031H2 = this.f10032H3 + iM9618F16 + iFF64;
        this.f10032H3 = this.f10029H0 + iM9618F19 + iFF63;
        this.f10029H0 = i5;
        this.xOff = 0;
        int i6 = 0;
        while (true) {
            int[] iArr = this.f10033X;
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
        int[] iArr = this.f10033X;
        iArr[14] = (int) j;
        iArr[15] = (int) (j >>> 32);
    }

    @Override // org.spongycastle.crypto.digests.GeneralDigest
    public void processWord(byte[] bArr, int i) {
        int[] iArr = this.f10033X;
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
        this.f10029H0 = 1732584193;
        this.f10030H1 = -271733879;
        this.f10031H2 = -1732584194;
        this.f10032H3 = 271733878;
        this.xOff = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.f10033X;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    public RIPEMD128Digest(RIPEMD128Digest rIPEMD128Digest) {
        super(rIPEMD128Digest);
        this.f10033X = new int[16];
        copyIn(rIPEMD128Digest);
    }

    @Override // org.spongycastle.util.Memoable
    public void reset(Memoable memoable) {
        copyIn((RIPEMD128Digest) memoable);
    }
}
