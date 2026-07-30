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
public final class ImmutableIntArray implements Serializable {
    private static final ImmutableIntArray EMPTY = new ImmutableIntArray(new int[0]);
    private final int[] array;
    private final int end;
    private final transient int start;

    public static class AsList extends AbstractList<Integer> implements RandomAccess, Serializable {
        private final ImmutableIntArray parent;

        private AsList(ImmutableIntArray immutableIntArray) {
            this.parent = immutableIntArray;
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
                if (obj2 instanceof Integer) {
                    int i2 = i + 1;
                    if (this.parent.array[i] == ((Integer) obj2).intValue()) {
                        i = i2;
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public Integer get(int i) {
            return Integer.valueOf(this.parent.get(i));
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            return this.parent.hashCode();
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            if (obj instanceof Integer) {
                return this.parent.indexOf(((Integer) obj).intValue());
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            if (obj instanceof Integer) {
                return this.parent.lastIndexOf(((Integer) obj).intValue());
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.parent.length();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Integer> subList(int i, int i2) {
            return this.parent.subArray(i, i2).asList();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return this.parent.toString();
        }
    }

    /* JADX INFO: renamed from: com.google.common.primitives.ImmutableIntArray$b */
    public static final class C3039b {

        /* JADX INFO: renamed from: a */
        public int[] f11314a;

        /* JADX INFO: renamed from: b */
        public int f11315b = 0;

        public C3039b(int i) {
            this.f11314a = new int[i];
        }

        /* JADX INFO: renamed from: f */
        public static int m16491f(int i, int i2) {
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
        public C3039b m16492a(int i) {
            m16496e(1);
            int[] iArr = this.f11314a;
            int i2 = this.f11315b;
            iArr[i2] = i;
            this.f11315b = i2 + 1;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public C3039b m16493b(Iterable<Integer> iterable) {
            if (iterable instanceof Collection) {
                return m16494c((Collection) iterable);
            }
            Iterator<Integer> it = iterable.iterator();
            while (it.hasNext()) {
                m16492a(it.next().intValue());
            }
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C3039b m16494c(Collection<Integer> collection) {
            m16496e(collection.size());
            for (Integer num : collection) {
                int[] iArr = this.f11314a;
                int i = this.f11315b;
                this.f11315b = i + 1;
                iArr[i] = num.intValue();
            }
            return this;
        }

        /* JADX INFO: renamed from: d */
        public ImmutableIntArray m16495d() {
            if (this.f11315b == 0) {
                return ImmutableIntArray.EMPTY;
            }
            return new ImmutableIntArray(this.f11314a, 0, this.f11315b);
        }

        /* JADX INFO: renamed from: e */
        public final void m16496e(int i) {
            int i2 = this.f11315b + i;
            int[] iArr = this.f11314a;
            if (i2 > iArr.length) {
                this.f11314a = Arrays.copyOf(iArr, m16491f(iArr.length, i2));
            }
        }
    }

    private ImmutableIntArray(int[] iArr, int i, int i2) {
        this.array = iArr;
        this.start = i;
        this.end = i2;
    }

    public static C3039b builder(int i) {
        xn80.m212101f(i >= 0, "Invalid initialCapacity: %s", i);
        return new C3039b(i);
    }

    public static ImmutableIntArray copyOf(Iterable<Integer> iterable) {
        return iterable instanceof Collection ? copyOf((Collection<Integer>) iterable) : builder().m16493b(iterable).m16495d();
    }

    private boolean isPartialView() {
        return this.start > 0 || this.end < this.array.length;
    }

    /* JADX INFO: renamed from: of */
    public static ImmutableIntArray m16490of(int i, int... iArr) {
        xn80.m212100e(iArr.length <= 2147483646, "the total number of elements must fit in an int");
        int[] iArr2 = new int[iArr.length + 1];
        iArr2[0] = i;
        System.arraycopy(iArr, 0, iArr2, 1, iArr.length);
        return new ImmutableIntArray(iArr2);
    }

    public List<Integer> asList() {
        return new AsList();
    }

    public boolean contains(int i) {
        return indexOf(i) >= 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableIntArray)) {
            return false;
        }
        ImmutableIntArray immutableIntArray = (ImmutableIntArray) obj;
        if (length() != immutableIntArray.length()) {
            return false;
        }
        for (int i = 0; i < length(); i++) {
            if (get(i) != immutableIntArray.get(i)) {
                return false;
            }
        }
        return true;
    }

    public int get(int i) {
        xn80.m212109n(i, length());
        return this.array[this.start + i];
    }

    public int hashCode() {
        int iM16518h = 1;
        for (int i = this.start; i < this.end; i++) {
            iM16518h = (iM16518h * 31) + Ints.m16518h(this.array[i]);
        }
        return iM16518h;
    }

    public int indexOf(int i) {
        for (int i2 = this.start; i2 < this.end; i2++) {
            if (this.array[i2] == i) {
                return i2 - this.start;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.end == this.start;
    }

    public int lastIndexOf(int i) {
        int i2;
        int i3 = this.end;
        do {
            i3--;
            i2 = this.start;
            if (i3 < i2) {
                return -1;
            }
        } while (this.array[i3] != i);
        return i3 - i2;
    }

    public int length() {
        return this.end - this.start;
    }

    public Object readResolve() {
        return isEmpty() ? EMPTY : this;
    }

    public ImmutableIntArray subArray(int i, int i2) {
        xn80.m212116u(i, i2, length());
        if (i == i2) {
            return EMPTY;
        }
        int[] iArr = this.array;
        int i3 = this.start;
        return new ImmutableIntArray(iArr, i + i3, i3 + i2);
    }

    public int[] toArray() {
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

    public ImmutableIntArray trimmed() {
        return isPartialView() ? new ImmutableIntArray(toArray()) : this;
    }

    public Object writeReplace() {
        return trimmed();
    }

    private ImmutableIntArray(int[] iArr) {
        this(iArr, 0, iArr.length);
    }

    public static C3039b builder() {
        return new C3039b(10);
    }

    public static ImmutableIntArray copyOf(Collection<Integer> collection) {
        return collection.isEmpty() ? EMPTY : new ImmutableIntArray(Ints.m16524n(collection));
    }

    public static ImmutableIntArray copyOf(int[] iArr) {
        return iArr.length == 0 ? EMPTY : new ImmutableIntArray(Arrays.copyOf(iArr, iArr.length));
    }

    /* JADX INFO: renamed from: of */
    public static ImmutableIntArray m16484of(int i) {
        return new ImmutableIntArray(new int[]{i});
    }

    /* JADX INFO: renamed from: of */
    public static ImmutableIntArray m16485of(int i, int i2) {
        return new ImmutableIntArray(new int[]{i, i2});
    }

    /* JADX INFO: renamed from: of */
    public static ImmutableIntArray m16486of(int i, int i2, int i3) {
        return new ImmutableIntArray(new int[]{i, i2, i3});
    }

    /* JADX INFO: renamed from: of */
    public static ImmutableIntArray m16487of(int i, int i2, int i3, int i4) {
        return new ImmutableIntArray(new int[]{i, i2, i3, i4});
    }

    /* JADX INFO: renamed from: of */
    public static ImmutableIntArray m16488of(int i, int i2, int i3, int i4, int i5) {
        return new ImmutableIntArray(new int[]{i, i2, i3, i4, i5});
    }

    /* JADX INFO: renamed from: of */
    public static ImmutableIntArray m16489of(int i, int i2, int i3, int i4, int i5, int i6) {
        return new ImmutableIntArray(new int[]{i, i2, i3, i4, i5, i6});
    }

    /* JADX INFO: renamed from: of */
    public static ImmutableIntArray m16483of() {
        return EMPTY;
    }
}
