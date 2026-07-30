package com.google.zxing.qrcode.decoder;

import p149l.j0l0;
import p149l.x9g0;

/* JADX INFO: loaded from: classes7.dex */
public enum Mode {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);

    private final int bits;
    private final int[] characterCountBitsForVersions;

    Mode(int[] iArr, int i) {
        this.characterCountBitsForVersions = iArr;
        this.bits = i;
    }

    public static Mode forBits(int i) {
        if (i == 0) {
            return TERMINATOR;
        }
        if (i == 1) {
            return NUMERIC;
        }
        if (i == 2) {
            return ALPHANUMERIC;
        }
        if (i == 3) {
            return STRUCTURED_APPEND;
        }
        if (i == 4) {
            return BYTE;
        }
        if (i == 5) {
            return FNC1_FIRST_POSITION;
        }
        if (i == 7) {
            return ECI;
        }
        if (i == 8) {
            return KANJI;
        }
        if (i == 9) {
            return FNC1_SECOND_POSITION;
        }
        if (i == 13) {
            return HANZI;
        }
        x9g0.m207497a();
        return null;
    }

    public int getBits() {
        return this.bits;
    }

    public int getCharacterCountBits(j0l0 j0l0Var) {
        char c;
        int iM139175j = j0l0Var.m139175j();
        if (iM139175j <= 9) {
            c = 0;
        } else {
            c = iM139175j <= 26 ? (char) 1 : (char) 2;
        }
        return this.characterCountBitsForVersions[c];
    }
}
