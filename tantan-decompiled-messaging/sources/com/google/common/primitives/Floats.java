package com.google.common.primitives;

import com.google.common.base.Converter;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import p149l.dri;
import p149l.sf80;

/* JADX INFO: loaded from: classes7.dex */
public final class Floats extends dri {

    public enum LexicographicalComparator implements Comparator<float[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(float[] fArr, float[] fArr2) {
            int iMin = Math.min(fArr.length, fArr2.length);
            for (int i = 0; i < iMin; i++) {
                int iCompare = Float.compare(fArr[i], fArr2[i]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return fArr.length - fArr2.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Floats.lexicographicalComparator()";
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m16411c(float f) {
        return Float.valueOf(f).hashCode();
    }

    /* JADX INFO: renamed from: d */
    public static int m16412d(float[] fArr, float f, int i, int i2) {
        while (i < i2) {
            if (fArr[i] == f) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: e */
    public static int m16413e(float[] fArr, float f, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            if (fArr[i3] == f) {
                return i3;
            }
        }
        return -1;
    }

    public static final class FloatConverter extends Converter<String, Float> implements Serializable {
        static final FloatConverter INSTANCE = new FloatConverter();
        private static final long serialVersionUID = 1;

        private FloatConverter() {
        }

        private Object readResolve() {
            return INSTANCE;
        }

        public String toString() {
            return "Floats.stringConverter()";
        }

        @Override // com.google.common.base.Converter
        public String doBackward(Float f) {
            return f.toString();
        }

        @Override // com.google.common.base.Converter
        public Float doForward(String str) {
            return Float.valueOf(str);
        }
    }

    public static class FloatArrayAsList extends AbstractList<Float> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final float[] array;
        final int end;
        final int start;

        public FloatArrayAsList(float[] fArr, int i, int i2) {
            this.array = fArr;
            this.start = i;
            this.end = i2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Float) && Floats.m16412d(this.array, ((Float) obj).floatValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FloatArrayAsList)) {
                return super.equals(obj);
            }
            FloatArrayAsList floatArrayAsList = (FloatArrayAsList) obj;
            int size = size();
            if (floatArrayAsList.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.array[this.start + i] != floatArrayAsList.array[floatArrayAsList.start + i]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public Float get(int i) {
            sf80.m183892n(i, size());
            return Float.valueOf(this.array[this.start + i]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iM16411c = 1;
            for (int i = this.start; i < this.end; i++) {
                iM16411c = (iM16411c * 31) + Floats.m16411c(this.array[i]);
            }
            return iM16411c;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int iM16412d;
            if (!(obj instanceof Float) || (iM16412d = Floats.m16412d(this.array, ((Float) obj).floatValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iM16412d - this.start;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int iM16413e;
            if (!(obj instanceof Float) || (iM16413e = Floats.m16413e(this.array, ((Float) obj).floatValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iM16413e - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public Float set(int i, Float f) {
            sf80.m183892n(i, size());
            float[] fArr = this.array;
            int i2 = this.start;
            float f2 = fArr[i2 + i];
            fArr[i2 + i] = ((Float) sf80.m183894p(f)).floatValue();
            return Float.valueOf(f2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Float> subList(int i, int i2) {
            sf80.m183899u(i, i2, size());
            if (i == i2) {
                return Collections.EMPTY_LIST;
            }
            float[] fArr = this.array;
            int i3 = this.start;
            return new FloatArrayAsList(fArr, i + i3, i3 + i2);
        }

        public float[] toFloatArray() {
            return Arrays.copyOfRange(this.array, this.start, this.end);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 12);
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

        public FloatArrayAsList(float[] fArr) {
            this(fArr, 0, fArr.length);
        }
    }
}
