package com.google.common.primitives;

import com.p051p1.mobile.putong.core.data.Target;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
public final class Bytes {
    /* JADX INFO: renamed from: c */
    public static int m16443c(byte b) {
        return b;
    }

    /* JADX INFO: renamed from: d */
    public static int m16444d(byte[] bArr, byte b, int i, int i2) {
        while (i < i2) {
            if (bArr[i] == b) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: e */
    public static int m16445e(byte[] bArr, byte[] bArr2) {
        xn80.m212112q(bArr, "array");
        xn80.m212112q(bArr2, Target.TYPE);
        if (bArr2.length == 0) {
            return 0;
        }
        for (int i = 0; i < (bArr.length - bArr2.length) + 1; i++) {
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                if (bArr[i + i2] != bArr2[i2]) {
                }
            }
            return i;
        }
        return -1;
    }

    /* JADX INFO: renamed from: f */
    public static int m16446f(byte[] bArr, byte b, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            if (bArr[i3] == b) {
                return i3;
            }
        }
        return -1;
    }

    public static class ByteArrayAsList extends AbstractList<Byte> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final byte[] array;
        final int end;
        final int start;

        public ByteArrayAsList(byte[] bArr, int i, int i2) {
            this.array = bArr;
            this.start = i;
            this.end = i2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Byte) && Bytes.m16444d(this.array, ((Byte) obj).byteValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ByteArrayAsList)) {
                return super.equals(obj);
            }
            ByteArrayAsList byteArrayAsList = (ByteArrayAsList) obj;
            int size = size();
            if (byteArrayAsList.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.array[this.start + i] != byteArrayAsList.array[byteArrayAsList.start + i]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public Byte get(int i) {
            xn80.m212109n(i, size());
            return Byte.valueOf(this.array[this.start + i]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iM16443c = 1;
            for (int i = this.start; i < this.end; i++) {
                iM16443c = (iM16443c * 31) + Bytes.m16443c(this.array[i]);
            }
            return iM16443c;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int iM16444d;
            if (!(obj instanceof Byte) || (iM16444d = Bytes.m16444d(this.array, ((Byte) obj).byteValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iM16444d - this.start;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int iM16446f;
            if (!(obj instanceof Byte) || (iM16446f = Bytes.m16446f(this.array, ((Byte) obj).byteValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iM16446f - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public Byte set(int i, Byte b) {
            xn80.m212109n(i, size());
            byte[] bArr = this.array;
            int i2 = this.start;
            byte b2 = bArr[i2 + i];
            bArr[i2 + i] = ((Byte) xn80.m212111p(b)).byteValue();
            return Byte.valueOf(b2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Byte> subList(int i, int i2) {
            xn80.m212116u(i, i2, size());
            if (i == i2) {
                return Collections.EMPTY_LIST;
            }
            byte[] bArr = this.array;
            int i3 = this.start;
            return new ByteArrayAsList(bArr, i + i3, i3 + i2);
        }

        public byte[] toByteArray() {
            return Arrays.copyOfRange(this.array, this.start, this.end);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 5);
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

        public ByteArrayAsList(byte[] bArr) {
            this(bArr, 0, bArr.length);
        }
    }
}
