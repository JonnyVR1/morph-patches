package com.google.common.primitives;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
public final class Chars {

    public enum LexicographicalComparator implements Comparator<char[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(char[] cArr, char[] cArr2) {
            int iMin = Math.min(cArr.length, cArr2.length);
            for (int i = 0; i < iMin; i++) {
                int iM16450d = Chars.m16450d(cArr[i], cArr2[i]);
                if (iM16450d != 0) {
                    return iM16450d;
                }
            }
            return cArr.length - cArr2.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Chars.lexicographicalComparator()";
        }
    }

    /* JADX INFO: renamed from: c */
    public static char m16449c(long j) {
        char c = (char) j;
        xn80.m212103h(((long) c) == j, "Out of range: %s", j);
        return c;
    }

    /* JADX INFO: renamed from: d */
    public static int m16450d(char c, char c2) {
        return c - c2;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m16451e(char[] cArr, char c) {
        for (char c2 : cArr) {
            if (c2 == c) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static char m16452f(byte b, byte b2) {
        return (char) ((b << 8) | (b2 & 255));
    }

    /* JADX INFO: renamed from: g */
    public static int m16453g(char c) {
        return c;
    }

    /* JADX INFO: renamed from: h */
    public static int m16454h(char[] cArr, char c, int i, int i2) {
        while (i < i2) {
            if (cArr[i] == c) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: i */
    public static int m16455i(char[] cArr, char c, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            if (cArr[i3] == c) {
                return i3;
            }
        }
        return -1;
    }

    public static class CharArrayAsList extends AbstractList<Character> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final char[] array;
        final int end;
        final int start;

        public CharArrayAsList(char[] cArr, int i, int i2) {
            this.array = cArr;
            this.start = i;
            this.end = i2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Character) && Chars.m16454h(this.array, ((Character) obj).charValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CharArrayAsList)) {
                return super.equals(obj);
            }
            CharArrayAsList charArrayAsList = (CharArrayAsList) obj;
            int size = size();
            if (charArrayAsList.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.array[this.start + i] != charArrayAsList.array[charArrayAsList.start + i]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public Character get(int i) {
            xn80.m212109n(i, size());
            return Character.valueOf(this.array[this.start + i]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iM16453g = 1;
            for (int i = this.start; i < this.end; i++) {
                iM16453g = (iM16453g * 31) + Chars.m16453g(this.array[i]);
            }
            return iM16453g;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int iM16454h;
            if (!(obj instanceof Character) || (iM16454h = Chars.m16454h(this.array, ((Character) obj).charValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iM16454h - this.start;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int iM16455i;
            if (!(obj instanceof Character) || (iM16455i = Chars.m16455i(this.array, ((Character) obj).charValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iM16455i - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public Character set(int i, Character ch) {
            xn80.m212109n(i, size());
            char[] cArr = this.array;
            int i2 = this.start;
            char c = cArr[i2 + i];
            cArr[i2 + i] = ((Character) xn80.m212111p(ch)).charValue();
            return Character.valueOf(c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Character> subList(int i, int i2) {
            xn80.m212116u(i, i2, size());
            if (i == i2) {
                return Collections.EMPTY_LIST;
            }
            char[] cArr = this.array;
            int i3 = this.start;
            return new CharArrayAsList(cArr, i + i3, i3 + i2);
        }

        public char[] toCharArray() {
            return Arrays.copyOfRange(this.array, this.start, this.end);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 3);
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

        public CharArrayAsList(char[] cArr) {
            this(cArr, 0, cArr.length);
        }
    }
}
