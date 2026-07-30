package com.google.common.primitives;

import com.google.android.gms.common.api.Api;
import com.google.common.base.Converter;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import p153l.bzp;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
public final class Ints extends bzp {

    public enum LexicographicalComparator implements Comparator<int[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(int[] iArr, int[] iArr2) {
            int iMin = Math.min(iArr.length, iArr2.length);
            for (int i = 0; i < iMin; i++) {
                int iM16515e = Ints.m16515e(iArr[i], iArr2[i]);
                if (iM16515e != 0) {
                    return iM16515e;
                }
            }
            return iArr.length - iArr2.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Ints.lexicographicalComparator()";
        }
    }

    /* JADX INFO: renamed from: c */
    public static List<Integer> m16513c(int... iArr) {
        return iArr.length == 0 ? Collections.EMPTY_LIST : new IntArrayAsList(iArr);
    }

    /* JADX INFO: renamed from: d */
    public static int m16514d(long j) {
        int i = (int) j;
        xn80.m212103h(((long) i) == j, "Out of range: %s", j);
        return i;
    }

    /* JADX INFO: renamed from: e */
    public static int m16515e(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    /* JADX INFO: renamed from: f */
    public static int m16516f(int i, int i2, int i3) {
        xn80.m212102g(i2 <= i3, "min (%s) must be less than or equal to max (%s)", i2, i3);
        return Math.min(Math.max(i, i2), i3);
    }

    /* JADX INFO: renamed from: g */
    public static int m16517g(byte b, byte b2, byte b3, byte b4) {
        return (b << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }

    /* JADX INFO: renamed from: h */
    public static int m16518h(int i) {
        return i;
    }

    /* JADX INFO: renamed from: i */
    public static int m16519i(int[] iArr, int i) {
        return m16520j(iArr, i, 0, iArr.length);
    }

    /* JADX INFO: renamed from: j */
    public static int m16520j(int[] iArr, int i, int i2, int i3) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: k */
    public static int m16521k(int[] iArr, int i, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            if (iArr[i4] == i) {
                return i4;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: l */
    public static int m16522l(int... iArr) {
        xn80.m212099d(iArr.length > 0);
        int i = iArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            int i3 = iArr[i2];
            if (i3 < i) {
                i = i3;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: m */
    public static int m16523m(long j) {
        if (j > 2147483647L) {
            return Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    /* JADX INFO: renamed from: n */
    public static int[] m16524n(Collection<? extends Number> collection) {
        if (collection instanceof IntArrayAsList) {
            return ((IntArrayAsList) collection).toIntArray();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = ((Number) xn80.m212111p(array[i])).intValue();
        }
        return iArr;
    }

    public static final class IntConverter extends Converter<String, Integer> implements Serializable {
        static final IntConverter INSTANCE = new IntConverter();
        private static final long serialVersionUID = 1;

        private IntConverter() {
        }

        private Object readResolve() {
            return INSTANCE;
        }

        public String toString() {
            return "Ints.stringConverter()";
        }

        @Override // com.google.common.base.Converter
        public String doBackward(Integer num) {
            return num.toString();
        }

        @Override // com.google.common.base.Converter
        public Integer doForward(String str) {
            return Integer.decode(str);
        }
    }

    public static class IntArrayAsList extends AbstractList<Integer> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final int[] array;
        final int end;
        final int start;

        public IntArrayAsList(int[] iArr, int i, int i2) {
            this.array = iArr;
            this.start = i;
            this.end = i2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Integer) && Ints.m16520j(this.array, ((Integer) obj).intValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof IntArrayAsList)) {
                return super.equals(obj);
            }
            IntArrayAsList intArrayAsList = (IntArrayAsList) obj;
            int size = size();
            if (intArrayAsList.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.array[this.start + i] != intArrayAsList.array[intArrayAsList.start + i]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public Integer get(int i) {
            xn80.m212109n(i, size());
            return Integer.valueOf(this.array[this.start + i]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iM16518h = 1;
            for (int i = this.start; i < this.end; i++) {
                iM16518h = (iM16518h * 31) + Ints.m16518h(this.array[i]);
            }
            return iM16518h;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int iM16520j;
            if (!(obj instanceof Integer) || (iM16520j = Ints.m16520j(this.array, ((Integer) obj).intValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iM16520j - this.start;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int iM16521k;
            if (!(obj instanceof Integer) || (iM16521k = Ints.m16521k(this.array, ((Integer) obj).intValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iM16521k - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public Integer set(int i, Integer num) {
            xn80.m212109n(i, size());
            int[] iArr = this.array;
            int i2 = this.start;
            int i3 = iArr[i2 + i];
            iArr[i2 + i] = ((Integer) xn80.m212111p(num)).intValue();
            return Integer.valueOf(i3);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Integer> subList(int i, int i2) {
            xn80.m212116u(i, i2, size());
            if (i == i2) {
                return Collections.EMPTY_LIST;
            }
            int[] iArr = this.array;
            int i3 = this.start;
            return new IntArrayAsList(iArr, i + i3, i3 + i2);
        }

        public int[] toIntArray() {
            return Arrays.copyOfRange(this.array, this.start, this.end);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 5);
            sb.append('[');
            sb.append(this.array[this.start]);
            int i = this.start;
            while (true) {
                i++;
                if (i >= this.end) {
                    sb.append(']');
                    return sb.toString();
                }
                sb.append(", ");
                sb.append(this.array[i]);
            }
        }

        public IntArrayAsList(int[] iArr) {
            this(iArr, 0, iArr.length);
        }
    }
}
