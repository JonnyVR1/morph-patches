package net.jpountz.lz4;

import net.jpountz.util.SafeUtils;
import p149l.e5r;

/* JADX INFO: loaded from: classes2.dex */
enum LZ4SafeUtils {
    ;

    public static class Match {
        int len;
        int ref;
        int start;

        public int end() {
            return this.start + this.len;
        }

        public void fix(int i) {
            this.start += i;
            this.ref += i;
            this.len -= i;
        }
    }

    public static int commonBytes(byte[] bArr, int i, int i2, int i3) {
        int i4 = 0;
        while (i2 < i3) {
            int i5 = i + 1;
            int i6 = i2 + 1;
            if (bArr[i] != bArr[i2]) {
                break;
            }
            i4++;
            i = i5;
            i2 = i6;
        }
        return i4;
    }

    public static int commonBytesBackward(byte[] bArr, int i, int i2, int i3, int i4) {
        int i5 = 0;
        while (i > i3 && i2 > i4) {
            i--;
            i2--;
            if (bArr[i] != bArr[i2]) {
                break;
            }
            i5++;
        }
        return i5;
    }

    public static void copy8Bytes(byte[] bArr, int i, byte[] bArr2, int i2) {
        for (int i3 = 0; i3 < 8; i3++) {
            bArr2[i2 + i3] = bArr[i + i3];
        }
    }

    public static void copyTo(Match match, Match match2) {
        match2.len = match.len;
        match2.start = match.start;
        match2.ref = match.ref;
    }

    public static int encodeSequence(byte[] bArr, int i, int i2, int i3, int i4, byte[] bArr2, int i5, int i6) {
        int i7;
        int i8;
        int i9 = i2 - i;
        int iWriteLen = i5 + 1;
        if (iWriteLen + i9 + 8 + (i9 >>> 8) > i6) {
            throw new LZ4Exception("maxDestLen is too small");
        }
        if (i9 >= 15) {
            iWriteLen = writeLen(i9 - 15, bArr2, iWriteLen);
            i7 = -16;
        } else {
            i7 = i9 << 4;
        }
        wildArraycopy(bArr, i, bArr2, iWriteLen, i9);
        int i10 = iWriteLen + i9;
        int i11 = i2 - i3;
        bArr2[i10] = (byte) i11;
        int iWriteLen2 = i10 + 2;
        bArr2[i10 + 1] = (byte) (i11 >>> 8);
        int i12 = i4 - 4;
        if (i10 + 8 + (i12 >>> 8) > i6) {
            throw new LZ4Exception("maxDestLen is too small");
        }
        if (i12 >= 15) {
            i8 = i7 | 15;
            iWriteLen2 = writeLen(i4 - 19, bArr2, iWriteLen2);
        } else {
            i8 = i12 | i7;
        }
        bArr2[i5] = (byte) i8;
        return iWriteLen2;
    }

    public static int hash(byte[] bArr, int i) {
        return LZ4Utils.hash(SafeUtils.readInt(bArr, i));
    }

    public static int hash64k(byte[] bArr, int i) {
        return LZ4Utils.hash64k(SafeUtils.readInt(bArr, i));
    }

    public static int lastLiterals(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        int iWriteLen;
        if (i3 + i2 + 1 + ((i2 + 240) / 255) > i4) {
            throw new LZ4Exception();
        }
        if (i2 >= 15) {
            bArr2[i3] = -16;
            iWriteLen = writeLen(i2 - 15, bArr2, i3 + 1);
        } else {
            bArr2[i3] = (byte) (i2 << 4);
            iWriteLen = i3 + 1;
        }
        System.arraycopy(bArr, i, bArr2, iWriteLen, i2);
        return iWriteLen + i2;
    }

    public static boolean readIntEquals(byte[] bArr, int i, int i2) {
        return bArr[i] == bArr[i2] && bArr[i + 1] == bArr[i2 + 1] && bArr[i + 2] == bArr[i2 + 2] && bArr[i + 3] == bArr[i2 + 3];
    }

    public static void safeArraycopy(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        System.arraycopy(bArr, i, bArr2, i2, i3);
    }

    public static void safeIncrementalCopy(byte[] bArr, int i, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[i2 + i4] = bArr[i + i4];
        }
    }

    public static void wildArraycopy(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4 += 8) {
            try {
                copy8Bytes(bArr, i + i4, bArr2, i2 + i4);
            } catch (ArrayIndexOutOfBoundsException unused) {
                e5r.m114891a("Malformed input at offset ", i);
                return;
            }
        }
    }

    public static void wildIncrementalCopy(byte[] bArr, int i, int i2, int i3) {
        do {
            copy8Bytes(bArr, i, bArr, i2);
            i += 8;
            i2 += 8;
        } while (i2 < i3);
    }

    public static int writeLen(int i, byte[] bArr, int i2) {
        while (i >= 255) {
            bArr[i2] = -1;
            i -= 255;
            i2++;
        }
        int i3 = i2 + 1;
        bArr[i2] = (byte) i;
        return i3;
    }
}
