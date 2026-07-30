package com.google.common.primitives;

import java.util.Comparator;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
public final class SignedBytes {

    public enum LexicographicalComparator implements Comparator<byte[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(byte[] bArr, byte[] bArr2) {
            int iMin = Math.min(bArr.length, bArr2.length);
            for (int i = 0; i < iMin; i++) {
                int iM16541b = SignedBytes.m16541b(bArr[i], bArr2[i]);
                if (iM16541b != 0) {
                    return iM16541b;
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
    public static byte m16540a(long j) {
        byte b = (byte) j;
        xn80.m212103h(((long) b) == j, "Out of range: %s", j);
        return b;
    }

    /* JADX INFO: renamed from: b */
    public static int m16541b(byte b, byte b2) {
        return b - b2;
    }
}
