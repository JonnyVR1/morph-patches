package com.google.common.primitives;

import com.google.common.base.Converter;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import p153l.d7f0;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
public final class Shorts extends d7f0 {

    public enum LexicographicalComparator implements Comparator<short[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(short[] sArr, short[] sArr2) {
            int iMin = Math.min(sArr.length, sArr2.length);
            for (int i = 0; i < iMin; i++) {
                int iM16536c = Shorts.m16536c(sArr[i], sArr2[i]);
                if (iM16536c != 0) {
                    return iM16536c;
                }
            }
            return sArr.length - sArr2.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Shorts.lexicographicalComparator()";
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m16536c(short s, short s2) {
        return s - s2;
    }

    /* JADX INFO: renamed from: d */
    public static int m16537d(short s) {
        return s;
    }

    /* JADX INFO: renamed from: e */
    public static int m16538e(short[] sArr, short s, int i, int i2) {
        while (i < i2) {
            if (sArr[i] == s) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: f */
    public static int m16539f(short[] sArr, short s, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            if (sArr[i3] == s) {
                return i3;
            }
        }
        return -1;
    }

    public static final class ShortConverter extends Converter<String, Short> implements Serializable {
        static final ShortConverter INSTANCE = new ShortConverter();
        private static final long serialVersionUID = 1;

        private ShortConverter() {
        }

        private Object readResolve() {
            return INSTANCE;
        }

        public String toString() {
            return "Shorts.stringConverter()";
        }

        @Override // com.google.common.base.Converter
        public String doBackward(Short sh) {
            return sh.toString();
        }

        @Override // com.google.common.base.Converter
        public Short doForward(String str) {
            return Short.decode(str);
        }
    }

    public static class ShortArrayAsList extends AbstractList<Short> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final short[] array;
        final int end;
        final int start;

        public ShortArrayAsList(short[] sArr, int i, int i2) {
            this.array = sArr;
            this.start = i;
            this.end = i2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Short) && Shorts.m16538e(this.array, ((Short) obj).shortValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ShortArrayAsList)) {
                return super.equals(obj);
            }
            ShortArrayAsList shortArrayAsList = (ShortArrayAsList) obj;
            int size = size();
            if (shortArrayAsList.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.array[this.start + i] != shortArrayAsList.array[shortArrayAsList.start + i]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public Short get(int i) {
            xn80.m212109n(i, size());
            return Short.valueOf(this.array[this.start + i]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iM16537d = 1;
            for (int i = this.start; i < this.end; i++) {
                iM16537d = (iM16537d * 31) + Shorts.m16537d(this.array[i]);
            }
            return iM16537d;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int iM16538e;
            if (!(obj instanceof Short) || (iM16538e = Shorts.m16538e(this.array, ((Short) obj).shortValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iM16538e - this.start;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int iM16539f;
            if (!(obj instanceof Short) || (iM16539f = Shorts.m16539f(this.array, ((Short) obj).shortValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iM16539f - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public Short set(int i, Short sh) {
            xn80.m212109n(i, size());
            short[] sArr = this.array;
            int i2 = this.start;
            short s = sArr[i2 + i];
            sArr[i2 + i] = ((Short) xn80.m212111p(sh)).shortValue();
            return Short.valueOf(s);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Short> subList(int i, int i2) {
            xn80.m212116u(i, i2, size());
            if (i == i2) {
                return Collections.EMPTY_LIST;
            }
            short[] sArr = this.array;
            int i3 = this.start;
            return new ShortArrayAsList(sArr, i + i3, i3 + i2);
        }

        public short[] toShortArray() {
            return Arrays.copyOfRange(this.array, this.start, this.end);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 6);
            sb.append('[');
            sb.append((int) this.array[this.start]);
            int i = this.start;
            while (true) {
                i++;
                if (i >= this.end) {
                    sb.append(']');
                    return sb.toString();
                }
                sb.append(", ");
                sb.append((int) this.array[i]);
            }
        }

        public ShortArrayAsList(short[] sArr) {
            this(sArr, 0, sArr.length);
        }
    }
}
