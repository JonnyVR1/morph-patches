package com.google.common.primitives;

import java.util.Comparator;
import p149l.sf80;

/* JADX INFO: loaded from: classes7.dex */
public final class SignedBytes {

    public enum LexicographicalComparator implements Comparator<byte[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(byte[] bArr, byte[] bArr2) {
            int iMin = Math.min(bArr.length, bArr2.length);
            for (int i = 0; i < iMin; i++) {
                int iM16486b = SignedBytes.m16486b(bArr[i], bArr2[i]);
                if (iM16486b != 0) {
                    return iM16486b;
                }
            }
            return bArr.length - bArr2.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "SignedBytes.lexicographicalComparator()";
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte m16485a(long j) {
        byte b = (byte) j;
        sf80.m183886h(((long) b) == j, "Out of range: %s", j);
        return b;
    }

    /* JADX INFO: renamed from: b */
    public static int m16486b(byte b, byte b2) {
        return b - b2;
    }
}
