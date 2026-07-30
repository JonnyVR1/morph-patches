package com.google.common.primitives;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import p149l.sf80;

/* JADX INFO: loaded from: classes7.dex */
public final class Booleans {

    public enum BooleanComparator implements Comparator<Boolean> {
        TRUE_FIRST(1, "Booleans.trueFirst()"),
        FALSE_FIRST(-1, "Booleans.falseFirst()");

        private final String toString;
        private final int trueValue;

        BooleanComparator(int i, String str) {
            this.trueValue = i;
            this.toString = str;
        }

        @Override // java.util.Comparator
        public int compare(Boolean bool, Boolean bool2) {
            return (bool2.booleanValue() ? this.trueValue : 0) - (bool.booleanValue() ? this.trueValue : 0);
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.toString;
        }
    }

    public enum LexicographicalComparator implements Comparator<boolean[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(boolean[] zArr, boolean[] zArr2) {
            int iMin = Math.min(zArr.length, zArr2.length);
            for (int i = 0; i < iMin; i++) {
                int iM16381c = Booleans.m16381c(zArr[i], zArr2[i]);
                if (iM16381c != 0) {
                    return iM16381c;
                }
            }
            return zArr.length - zArr2.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Booleans.lexicographicalComparator()";
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m16381c(boolean z, boolean z2) {
        if (z == z2) {
            return 0;
        }
        return z ? 1 : -1;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m16382d(boolean[] zArr, boolean z) {
        for (boolean z2 : zArr) {
            if (z2 == z) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static int m16383e(boolean z) {
        return z ? 1231 : 1237;
    }

    /* JADX INFO: renamed from: f */
    public static int m16384f(boolean[] zArr, boolean z, int i, int i2) {
        while (i < i2) {
            if (zArr[i] == z) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: g */
    public static int m16385g(boolean[] zArr, boolean z, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            if (zArr[i3] == z) {
                return i3;
            }
        }
        return -1;
    }

    public static class BooleanArrayAsList extends AbstractList<Boolean> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final boolean[] array;
        final int end;
        final int start;

        public BooleanArrayAsList(boolean[] zArr, int i, int i2) {
            this.array = zArr;
            this.start = i;
            this.end = i2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Boolean) && Booleans.m16384f(this.array, ((Boolean) obj).booleanValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BooleanArrayAsList)) {
                return super.equals(obj);
            }
            BooleanArrayAsList booleanArrayAsList = (BooleanArrayAsList) obj;
            int size = size();
            if (booleanArrayAsList.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.array[this.start + i] != booleanArrayAsList.array[booleanArrayAsList.start + i]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public Boolean get(int i) {
            sf80.m183892n(i, size());
            return Boolean.valueOf(this.array[this.start + i]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iM16383e = 1;
            for (int i = this.start; i < this.end; i++) {
                iM16383e = (iM16383e * 31) + Booleans.m16383e(this.array[i]);
            }
            return iM16383e;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int iM16384f;
            if (!(obj instanceof Boolean) || (iM16384f = Booleans.m16384f(this.array, ((Boolean) obj).booleanValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iM16384f - this.start;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int iM16385g;
            if (!(obj instanceof Boolean) || (iM16385g = Booleans.m16385g(this.array, ((Boolean) obj).booleanValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iM16385g - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public Boolean set(int i, Boolean bool) {
            sf80.m183892n(i, size());
            boolean[] zArr = this.array;
            int i2 = this.start;
            boolean z = zArr[i2 + i];
            zArr[i2 + i] = ((Boolean) sf80.m183894p(bool)).booleanValue();
            return Boolean.valueOf(z);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Boolean> subList(int i, int i2) {
            sf80.m183899u(i, i2, size());
            if (i == i2) {
                return Collections.EMPTY_LIST;
            }
            boolean[] zArr = this.array;
            int i3 = this.start;
            return new BooleanArrayAsList(zArr, i + i3, i3 + i2);
        }

        public boolean[] toBooleanArray() {
            return Arrays.copyOfRange(this.array, this.start, this.end);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 7);
            sb.append(this.array[this.start] ? "[true" : "[false");
            int i = this.start;
            while (true) {
                i++;
                if (i >= this.end) {
                    sb.append(']');
                    return sb.toString();
                }
                sb.append(this.array[i] ? ", true" : ", false");
            }
        }

        public BooleanArrayAsList(boolean[] zArr) {
            this(zArr, 0, zArr.length);
        }
    }
}
