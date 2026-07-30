package com.google.common.primitives;

import java.util.Comparator;
import p153l.myj0;

/* JADX INFO: loaded from: classes7.dex */
enum UnsignedBytes$LexicographicalComparatorHolder$PureJavaComparator implements Comparator<byte[]> {
    INSTANCE;

    @Override // java.util.Comparator
    public int compare(byte[] bArr, byte[] bArr2) {
        int iMin = Math.min(bArr.length, bArr2.length);
        for (int i = 0; i < iMin; i++) {
            int iM160798b = myj0.m160798b(bArr[i], bArr2[i]);
            if (iM160798b != 0) {
                return iM160798b;
            }
        }
        return bArr.length - bArr2.length;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
    }
}
