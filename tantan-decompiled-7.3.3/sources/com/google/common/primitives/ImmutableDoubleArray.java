package com.google.common.primitives;

import com.google.android.gms.common.api.Api;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import p153l.gig0;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
public final class ImmutableDoubleArray implements Serializable {
    private static final ImmutableDoubleArray EMPTY = new ImmutableDoubleArray(new double[0]);
    private final double[] array;
    private final int end;
    private final transient int start;

    public static class AsList extends AbstractList<Double> implements RandomAccess, Serializable {
        private final ImmutableDoubleArray parent;

        private AsList(ImmutableDoubleArray immutableDoubleArray) {
            this.parent = immutableDoubleArray;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return indexOf(obj) >= 0;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj instanceof AsList) {
                return this.parent.equals(((AsList) obj).parent);
            }
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            if (size() != list.size()) {
                return false;
            }
            int i = this.parent.start;
            for (Object obj2 : list) {
                if (obj2 instanceof Double) {
                    int i2 = i + 1;
                    if (ImmutableDoubleArray.areEqual(this.parent.array[i], ((Double) obj2).doubleValue())) {
                        i = i2;
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public Double get(int i) {
            return Double.valueOf(this.parent.get(i));
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            return this.parent.hashCode();
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            if (obj instanceof Double) {
                return this.parent.indexOf(((Double) obj).doubleValue());
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            if (obj instanceof Double) {
                return this.parent.lastIndexOf(((Double) obj).doubleValue());
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.parent.length();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Double> subList(int i, int i2) {
            return this.parent.subArray(i, i2).asList();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return this.parent.toString();
        }
    }

    /* JADX INFO: renamed from: com.google.common.primitives.ImmutableDoubleArray$b */
    public static final class C3037b {

        /* JADX INFO: renamed from: a */
        public double[] f11312a;

        /* JADX INFO: renamed from: b */
        public int f11313b = 0;

        public C3037b(int i) {
            this.f11312a = new double[i];
        }

        /* JADX INFO: renamed from: f */
        public static int m16477f(int i, int i2) {
            if (i2 < 0) {
                gig0.m130323a("cannot store more than MAX_VALUE elements");
                return 0;
            }
            int iHighestOneBit = i + (i >> 1) + 1;
            if (iHighestOneBit < i2) {
                iHighestOneBit = Integer.highestOneBit(i2 - 1) << 1;
            }
            return iHighestOneBit < 0 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : iHighestOneBit;
        }

        /* JADX INFO: renamed from: a */
        public C3037b m16478a(double d) {
            m16482e(1);
            double[] dArr = this.f11312a;
            int i = this.f11313b;
            dArr[i] = d;
            this.f11313b = i + 1;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public C3037b m16479b(Iterable<Double> iterable) {
            if (iterable instanceof Collection) {
                return m16480c((Collection) iterable);
            }
            Iterator<Double> it = iterable.iterator();
            while (it.hasNext()) {
                m16478a(it.next().doubleValue());
            }
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C3037b m16480c(Collection<Double> collection) {
            m16482e(collection.size());
            for (Double d : collection) {
                double[] dArr = this.f11312a;
                int i = this.f11313b;
                this.f11313b = i + 1;
                dArr[i] = d.doubleValue();
            }
            return this;
        }

        /* JADX INFO: renamed from: d */
        public ImmutableDoubleArray m16481d() {
            if (this.f11313b == 0) {
                return ImmutableDoubleArray.EMPTY;
            }
            return new ImmutableDoubleArray(this.f11312a, 0, this.f11313b);
        }

        /* JADX INFO: renamed from: e */
        public final void m16482e(int i) {
            int i2 = this.f11313b + i;
            double[] dArr = this.f11312a;
            if (i2 > dArr.length) {
                this.f11312a = Arrays.copyOf(dArr, m16477f(dArr.length, i2));
            }
        }
    }

    private ImmutableDoubleArray(double[] dArr, int i, int i2) {
        this.array = dArr;
        this.start = i;
        this.end = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean areEqual(double d, double d2) {
        return Double.doubleToLongBits(d) == Double.doubleToLongBits(d2);
    }

    public static C3037b builder(int i) {
        xn80.m212101f(i >= 0, "Invalid initialCapacity: %s", i);
        return new C3037b(i);
    }

    public static ImmutableDoubleArray copyOf(Iterable<Double> iterable) {
        return iterable instanceof Collection ? copyOf((Collection<Double>) iterable) : builder().m16479b(iterable).m16481d();
    }

    private boolean isPartialView() {
        return this.start > 0 || this.end < this.array.length;
    }

    /* JADX INFO: renamed from: of */
    public static ImmutableDoubleArray m16476of(double d, double... dArr) {
        xn80.m212100e(dArr.length <= 2147483646, "the total number of elements must fit in an int");
        double[] dArr2 = new double[dArr.length + 1];
        dArr2[0] = d;
        System.arraycopy(dArr, 0, dArr2, 1, dArr.length);
        return new ImmutableDoubleArray(dArr2);
    }

    public List<Double> asList() {
        return new AsList();
    }

    public boolean contains(double d) {
        return indexOf(d) >= 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableDoubleArray)) {
            return false;
        }
        ImmutableDoubleArray immutableDoubleArray = (ImmutableDoubleArray) obj;
        if (length() != immutableDoubleArray.length()) {
            return false;
        }
        for (int i = 0; i < length(); i++) {
            if (!areEqual(get(i), immutableDoubleArray.get(i))) {
                return false;
            }
        }
        return true;
    }

    public double get(int i) {
        xn80.m212109n(i, length());
        return this.array[this.start + i];
    }

    public int hashCode() {
        int iM16459d = 1;
        for (int i = this.start; i < this.end; i++) {
            iM16459d = (iM16459d * 31) + Doubles.m16459d(this.array[i]);
        }
        return iM16459d;
    }

    public int indexOf(double d) {
        for (int i = this.start; i < this.end; i++) {
            if (areEqual(this.array[i], d)) {
                return i - this.start;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.end == this.start;
    }

    public int lastIndexOf(double d) {
        int i = this.end;
        do {
            i--;
            if (i < this.start) {
                return -1;
            }
        } while (!areEqual(this.array[i], d));
        return i - this.start;
    }

    public int length() {
        return this.end - this.start;
    }

    public Object readResolve() {
        return isEmpty() ? EMPTY : this;
    }

    public ImmutableDoubleArray subArray(int i, int i2) {
        xn80.m212116u(i, i2, length());
        if (i == i2) {
            return EMPTY;
        }
        double[] dArr = this.array;
        int i3 = this.start;
        return new ImmutableDoubleArray(dArr, i + i3, i3 + i2);
    }

    public double[] toArray() {
        return Arrays.copyOfRange(this.array, this.start, this.end);
    }

    public String toString() {
        if (isEmpty()) {
            return WeJson.EMPTY_ARR;
        }
        StringBuilder sb = new StringBuilder(length() * 5);
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

    public ImmutableDoubleArray trimmed() {
        return isPartialView() ? new ImmutableDoubleArray(toArray()) : this;
    }

    public Object writeReplace() {
        return trimmed();
    }

    private ImmutableDoubleArray(double[] dArr) {
        this(dArr, 0, dArr.length);
    }

    public static C3037b builder() {
        return new C3037b(10);
    }

    public static ImmutableDoubleArray copyOf(Collection<Double> collection) {
        return collection.isEmpty() ? EMPTY : new ImmutableDoubleArray(Doubles.m16463h(collection));
    }

    public static ImmutableDoubleArray copyOf(double[] dArr) {
        if (dArr.length == 0) {
            return EMPTY;
        }
        return new ImmutableDoubleArray(Arrays.copyOf(dArr, dArr.length));
    }

    /* JADX INFO: renamed from: of */
    public static ImmutableDoubleArray m16470of(double d) {
        return new ImmutableDoubleArray(new double[]{d});
    }

    /* JADX INFO: renamed from: of */
    public static ImmutableDoubleArray m16471of(double d, double d2) {
        return new ImmutableDoubleArray(new double[]{d, d2});
    }

    /* JADX INFO: renamed from: of */
    public static ImmutableDoubleArray m16472of(double d, double d2, double d3) {
        return new ImmutableDoubleArray(new double[]{d, d2, d3});
    }

    /* JADX INFO: renamed from: of */
    public static ImmutableDoubleArray m16473of(double d, double d2, double d3, double d4) {
        return new ImmutableDoubleArray(new double[]{d, d2, d3, d4});
    }

    /* JADX INFO: renamed from: of */
    public static ImmutableDoubleArray m16474of(double d, double d2, double d3, double d4, double d5) {
        return new ImmutableDoubleArray(new double[]{d, d2, d3, d4, d5});
    }

    /* JADX INFO: renamed from: of */
    public static ImmutableDoubleArray m16475of(double d, double d2, double d3, double d4, double d5, double d6) {
        return new ImmutableDoubleArray(new double[]{d, d2, d3, d4, d5, d6});
    }

    /* JADX INFO: renamed from: of */
    public static ImmutableDoubleArray m16469of() {
        return EMPTY;
    }
}
