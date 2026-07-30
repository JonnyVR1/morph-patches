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
import java.util.regex.Pattern;
import org.slf4j.Marker;
import p153l.j7e;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
public final class Doubles extends j7e {

    /* JADX INFO: renamed from: a */
    public static final Pattern f11311a = m16458c();

    public enum LexicographicalComparator implements Comparator<double[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(double[] dArr, double[] dArr2) {
            int iMin = Math.min(dArr.length, dArr2.length);
            for (int i = 0; i < iMin; i++) {
                int iCompare = Double.compare(dArr[i], dArr2[i]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return dArr.length - dArr2.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Doubles.lexicographicalComparator()";
        }
    }

    /* JADX INFO: renamed from: c */
    public static Pattern m16458c() {
        String strConcat = "(?:\\d+#(?:\\.\\d*#)?|\\.\\d+#)".concat("(?:[eE][+-]?\\d+#)?[fFdD]?");
        StringBuilder sb = new StringBuilder("(?:[0-9a-fA-F]+#(?:\\.[0-9a-fA-F]*#)?|\\.[0-9a-fA-F]+#)".length() + 25);
        sb.append("0[xX](?:[0-9a-fA-F]+#(?:\\.[0-9a-fA-F]*#)?|\\.[0-9a-fA-F]+#)[pP][+-]?\\d+#[fFdD]?");
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder(strConcat.length() + 23 + string.length());
        sb2.append("[+-]?(?:NaN|Infinity|");
        sb2.append(strConcat);
        sb2.append("|");
        sb2.append(string);
        sb2.append(")");
        return Pattern.compile(sb2.toString().replace("#", Marker.ANY_NON_NULL_MARKER));
    }

    /* JADX INFO: renamed from: d */
    public static int m16459d(double d) {
        return Double.valueOf(d).hashCode();
    }

    /* JADX INFO: renamed from: e */
    public static int m16460e(double[] dArr, double d, int i, int i2) {
        while (i < i2) {
            if (dArr[i] == d) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m16461f(double d) {
        return Double.NEGATIVE_INFINITY < d && d < Double.POSITIVE_INFINITY;
    }

    /* JADX INFO: renamed from: g */
    public static int m16462g(double[] dArr, double d, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            if (dArr[i3] == d) {
                return i3;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: h */
    public static double[] m16463h(Collection<? extends Number> collection) {
        if (collection instanceof DoubleArrayAsList) {
            return ((DoubleArrayAsList) collection).toDoubleArray();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        double[] dArr = new double[length];
        for (int i = 0; i < length; i++) {
            dArr[i] = ((Number) xn80.m212111p(array[i])).doubleValue();
        }
        return dArr;
    }

    public static final class DoubleConverter extends Converter<String, Double> implements Serializable {
        static final DoubleConverter INSTANCE = new DoubleConverter();
        private static final long serialVersionUID = 1;

        private DoubleConverter() {
        }

        private Object readResolve() {
            return INSTANCE;
        }

        public String toString() {
            return "Doubles.stringConverter()";
        }

        @Override // com.google.common.base.Converter
        public String doBackward(Double d) {
            return d.toString();
        }

        @Override // com.google.common.base.Converter
        public Double doForward(String str) {
            return Double.valueOf(str);
        }
    }

    public static class DoubleArrayAsList extends AbstractList<Double> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final double[] array;
        final int end;
        final int start;

        public DoubleArrayAsList(double[] dArr, int i, int i2) {
            this.array = dArr;
            this.start = i;
            this.end = i2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Double) && Doubles.m16460e(this.array, ((Double) obj).doubleValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DoubleArrayAsList)) {
                return super.equals(obj);
            }
            DoubleArrayAsList doubleArrayAsList = (DoubleArrayAsList) obj;
            int size = size();
            if (doubleArrayAsList.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.array[this.start + i] != doubleArrayAsList.array[doubleArrayAsList.start + i]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public Double get(int i) {
            xn80.m212109n(i, size());
            return Double.valueOf(this.array[this.start + i]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iM16459d = 1;
            for (int i = this.start; i < this.end; i++) {
                iM16459d = (iM16459d * 31) + Doubles.m16459d(this.array[i]);
            }
            return iM16459d;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int iM16460e;
            if (!(obj instanceof Double) || (iM16460e = Doubles.m16460e(this.array, ((Double) obj).doubleValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iM16460e - this.start;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int iM16462g;
            if (!(obj instanceof Double) || (iM16462g = Doubles.m16462g(this.array, ((Double) obj).doubleValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iM16462g - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public Double set(int i, Double d) {
            xn80.m212109n(i, size());
            double[] dArr = this.array;
            int i2 = this.start;
            double d2 = dArr[i2 + i];
            dArr[i2 + i] = ((Double) xn80.m212111p(d)).doubleValue();
            return Double.valueOf(d2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Double> subList(int i, int i2) {
            xn80.m212116u(i, i2, size());
            if (i == i2) {
                return Collections.EMPTY_LIST;
            }
            double[] dArr = this.array;
            int i3 = this.start;
            return new DoubleArrayAsList(dArr, i + i3, i3 + i2);
        }

        public double[] toDoubleArray() {
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

        public DoubleArrayAsList(double[] dArr) {
            this(dArr, 0, dArr.length);
        }
    }
}
