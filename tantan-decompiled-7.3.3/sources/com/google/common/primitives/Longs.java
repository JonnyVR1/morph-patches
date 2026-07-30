package com.google.common.primitives;

import com.google.common.base.Converter;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
public final class Longs {

    public enum LexicographicalComparator implements Comparator<long[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(long[] jArr, long[] jArr2) {
            int iMin = Math.min(jArr.length, jArr2.length);
            for (int i = 0; i < iMin; i++) {
                int iM16527c = Longs.m16527c(jArr[i], jArr2[i]);
                if (iM16527c != 0) {
                    return iM16527c;
                }
            }
            return jArr.length - jArr2.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Longs.lexicographicalComparator()";
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m16527c(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j > j2 ? 1 : 0;
    }

    /* JADX INFO: renamed from: d */
    public static long m16528d(byte b, byte b2, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8) {
        return ((((long) b2) & 255) << 48) | ((((long) b) & 255) << 56) | ((((long) b3) & 255) << 40) | ((((long) b4) & 255) << 32) | ((((long) b5) & 255) << 24) | ((((long) b6) & 255) << 16) | ((((long) b7) & 255) << 8) | (((long) b8) & 255);
    }

    /* JADX INFO: renamed from: e */
    public static int m16529e(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX INFO: renamed from: f */
    public static int m16530f(long[] jArr, long j, int i, int i2) {
        while (i < i2) {
            if (jArr[i] == j) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: g */
    public static int m16531g(long[] jArr, long j, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            if (jArr[i3] == j) {
                return i3;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: h */
    public static long m16532h(long... jArr) {
        xn80.m212099d(jArr.length > 0);
        long j = jArr[0];
        for (int i = 1; i < jArr.length; i++) {
            long j2 = jArr[i];
            if (j2 > j) {
                j = j2;
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: i */
    public static long[] m16533i(Collection<? extends Number> collection) {
        if (collection instanceof LongArrayAsList) {
            return ((LongArrayAsList) collection).toLongArray();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            jArr[i] = ((Number) xn80.m212111p(array[i])).longValue();
        }
        return jArr;
    }

    public static final class LongConverter extends Converter<String, Long> implements Serializable {
        static final LongConverter INSTANCE = new LongConverter();
        private static final long serialVersionUID = 1;

        private LongConverter() {
        }

        private Object readResolve() {
            return INSTANCE;
        }

        public String toString() {
            return "Longs.stringConverter()";
        }

        @Override // com.google.common.base.Converter
        public String doBackward(Long l2) {
            return l2.toString();
        }

        @Override // com.google.common.base.Converter
        public Long doForward(String str) {
            return Long.decode(str);
        }
    }

    public static class LongArrayAsList extends AbstractList<Long> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final long[] array;
        final int end;
        final int start;

        public LongArrayAsList(long[] jArr, int i, int i2) {
            this.array = jArr;
            this.start = i;
            this.end = i2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Long) && Longs.m16530f(this.array, ((Long) obj).longValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LongArrayAsList)) {
                return super.equals(obj);
            }
            LongArrayAsList longArrayAsList = (LongArrayAsList) obj;
            int size = size();
            if (longArrayAsList.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.array[this.start + i] != longArrayAsList.array[longArrayAsList.start + i]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public Long get(int i) {
            xn80.m212109n(i, size());
            return Long.valueOf(this.array[this.start + i]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iM16529e = 1;
            for (int i = this.start; i < this.end; i++) {
                iM16529e = (iM16529e * 31) + Longs.m16529e(this.array[i]);
            }
            return iM16529e;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int iM16530f;
            if (!(obj instanceof Long) || (iM16530f = Longs.m16530f(this.array, ((Long) obj).longValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iM16530f - this.start;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int iM16531g;
            if (!(obj instanceof Long) || (iM16531g = Longs.m16531g(this.array, ((Long) obj).longValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iM16531g - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public Long set(int i, Long l2) {
            xn80.m212109n(i, size());
            long[] jArr = this.array;
            int i2 = this.start;
            long j = jArr[i2 + i];
            jArr[i2 + i] = ((Long) xn80.m212111p(l2)).longValue();
            return Long.valueOf(j);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Long> subList(int i, int i2) {
            xn80.m212116u(i, i2, size());
            if (i == i2) {
                return Collections.EMPTY_LIST;
            }
            long[] jArr = this.array;
            int i3 = this.start;
            return new LongArrayAsList(jArr, i + i3, i3 + i2);
        }

        public long[] toLongArray() {
            return Arrays.copyOfRange(this.array, this.start, this.end);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 10);
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

        public LongArrayAsList(long[] jArr) {
            this(jArr, 0, jArr.length);
        }
    }
}
