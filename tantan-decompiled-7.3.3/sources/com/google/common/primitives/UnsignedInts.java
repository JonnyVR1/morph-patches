package com.google.common.primitives;

import java.util.Comparator;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
public final class UnsignedInts {

    public enum LexicographicalComparator implements Comparator<int[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(int[] iArr, int[] iArr2) {
            int iMin = Math.min(iArr.length, iArr2.length);
            for (int i = 0; i < iMin; i++) {
                int i2 = iArr[i];
                int i3 = iArr2[i];
                if (i2 != i3) {
                    return UnsignedInts.m16543a(i2, i3);
                }
            }
            return iArr.length - iArr2.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "UnsignedInts.lexicographicalComparator()";
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m16543a(int i, int i2) {
        return Ints.m16515e(m16545c(i), m16545c(i2));
    }

    /* JADX INFO: renamed from: b */
    public static int m16544b(int i, int i2) {
        return (int) (m16548f(i) / m16548f(i2));
    }

    /* JADX INFO: renamed from: c */
    public static int m16545c(int i) {
        return i ^ Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: d */
    public static int m16546d(String str, int i) {
        xn80.m212111p(str);
        long j = Long.parseLong(str, i);
        if ((4294967295L & j) == j) {
            return (int) j;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 69);
        sb.append("Input ");
        sb.append(str);
        sb.append(" in base ");
        sb.append(i);
        sb.append(" is not in the range of an unsigned integer");
        throw new NumberFormatException(sb.toString());
    }

    /* JADX INFO: renamed from: e */
    public static int m16547e(int i, int i2) {
        return (int) (m16548f(i) % m16548f(i2));
    }

    /* JADX INFO: renamed from: f */
    public static long m16548f(int i) {
        return ((long) i) & 4294967295L;
    }

    /* JADX INFO: renamed from: g */
    public static String m16549g(int i, int i2) {
        return Long.toString(((long) i) & 4294967295L, i2);
    }
}
