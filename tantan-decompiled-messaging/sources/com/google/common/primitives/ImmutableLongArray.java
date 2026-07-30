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
import p149l.sf80;
import p149l.y9g0;

/* JADX INFO: loaded from: classes7.dex */
public final class ImmutableLongArray implements Serializable {
    private static final ImmutableLongArray EMPTY = new ImmutableLongArray(new long[0]);
    private final long[] array;
    private final int end;
    private final transient int start;

    public static class AsList extends AbstractList<Long> implements RandomAccess, Serializable {
        private final ImmutableLongArray parent;

        private AsList(ImmutableLongArray immutableLongArray) {
            this.parent = immutableLongArray;
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
                if (obj2 instanceof Long) {
                    int i2 = i + 1;
                    if (this.parent.array[i] == ((Long) obj2).longValue()) {
                        i = i2;
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public Long get(int i) {
            return Long.valueOf(this.parent.get(i));
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            return this.parent.hashCode();
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            if (obj instanceof Long) {
                return this.parent.indexOf(((Long) obj).longValue());
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            if (obj instanceof Long) {
                return this.parent.lastIndexOf(((Long) obj).longValue());
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.parent.length();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Long> subList(int i, int i2) {
            return this.parent.subArray(i, i2).asList();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return this.parent.toString();
        }
    }

    /* JADX INFO: renamed from: com.google.common.primitives.ImmutableLongArray$b */
    public static final class C3018b {

        /* JADX INFO: renamed from: a */
        public long[] f11279a;

        /* JADX INFO: renamed from: b */
        public int f11280b = 0;

        public C3018b(int i) {
            this.f11279a = new long[i];
        }

        /* JADX INFO: renamed from: f */
        public static int m16450f(int i, int i2) {
            if (i2 < 0) {
                y9g0.m213537a("cannot store more than MAX_VALUE elements");
                return 0;
            }
            int iHighestOneBit = i + (i >> 1) + 1;
            if (iHighestOneBit < i2) {
                iHighestOneBit = Integer.highestOneBit(i2 - 1) << 1;
            }
            return iHighestOneBit < 0 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : iHighestOneBit;
        }

        /* JADX INFO: renamed from: a */
        public C3018b m16451a(long j) {
            m16455e(1);
            long[] jArr = this.f11279a;
            int i = this.f11280b;
            jArr[i] = j;
            this.f11280b = i + 1;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public C3018b m16452b(Iterable<Long> iterable) {
            if (iterable instanceof Collection) {
                return m16453c((Collection) iterable);
            }
            Iterator<Long> it = iterable.iterator();
            while (it.hasNext()) {
                m16451a(it.next().longValue());
            }
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C3018b m16453c(Collection<Long> collection) {
            m16455e(collection.size());
            for (Long l2 : collection) {
                long[] jArr = this.f11279a;
                int i = this.f11280b;
                this.f11280b = i + 1;
                jArr[i] = l2.longValue();
            }
            return this;
        }

        /* JADX INFO: renamed from: d */
        public ImmutableLongArray m16454d() {
            if (this.f11280b == 0) {
                return ImmutableLongArray.EMPTY;
            }
            return new ImmutableLongArray(this.f11279a, 0, this.f11280b);
        }

        /* JADX INFO: renamed from: e */
        public final void m16455e(int i) {
            int i2 = this.f11280b + i;
            long[] jArr = this.f11279a;
            if (i2 > jArr.length) {
                this.f11279a = Arrays.copyOf(jArr, m16450f(jArr.length, i2));
            }
        }
    }

    private ImmutableLongArray(long[] jArr, int i, int i2) {
        this.array = jArr;
        this.start = i;
        this.end = i2;
    }

    public static C3018b builder(int i) {
        sf80.m183884f(i >= 0, "Invalid initialCapacity: %s", i);
        return new C3018b(i);
    }

    public static ImmutableLongArray copyOf(Iterable<Long> iterable) {
        return iterable instanceof Collection ? copyOf((Collection<Long>) iterable) : builder().m16452b(iterable).m16454d();
    }

    private boolean isPartialView() {
        return this.start > 0 || this.end < this.array.length;
    }

    /* JADX INFO: renamed from: of */
    public static ImmutableLongArray m16449of(long j, long... jArr) {
        sf80.m183883e(jArr.length <= 2147483646, "the total number of elements must fit in an int");
        long[] jArr2 = new long[jArr.length + 1];
        jArr2[0] = j;
        System.arraycopy(jArr, 0, jArr2, 1, jArr.length);
        return new ImmutableLongArray(jArr2);
    }

    public List<Long> asList() {
        return new AsList();
    }

    public boolean contains(long j) {
        return indexOf(j) >= 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableLongArray)) {
            return false;
        }
        ImmutableLongArray immutableLongArray = (ImmutableLongArray) obj;
        if (length() != immutableLongArray.length()) {
            return false;
        }
        for (int i = 0; i < length(); i++) {
            if (get(i) != immutableLongArray.get(i)) {
                return false;
            }
        }
        return true;
    }

    public long get(int i) {
        sf80.m183892n(i, length());
        return this.array[this.start + i];
    }

    public int hashCode() {
        int iM16474e = 1;
        for (int i = this.start; i < this.end; i++) {
            iM16474e = (iM16474e * 31) + Longs.m16474e(this.array[i]);
        }
        return iM16474e;
    }

    public int indexOf(long j) {
        for (int i = this.start; i < this.end; i++) {
            if (this.array[i] == j) {
                return i - this.start;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.end == this.start;
    }

    public int lastIndexOf(long j) {
        int i;
        int i2 = this.end;
        do {
            i2--;
            i = this.start;
            if (i2 < i) {
                return -1;
            }
        } while (this.array[i2] != j);
        return i2 - i;
    }

    public int length() {
        return this.end - this.start;
    }

    public Object readResolve() {
        return isEmpty() ? EMPTY : this;
    }

    public ImmutableLongArray subArray(int i, int i2) {
        sf80.m183899u(i, i2, length());
        if (i == i2) {
            return EMPTY;
        }
        long[] jArr = this.array;
        int i3 = this.start;
        return new ImmutableLongArray(jArr, i + i3, i3 + i2);
    }

    public long[] toArray() {
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

    public ImmutableLongArray trimmed() {
        return isPartialView() ? new ImmutableLongArray(toArray()) : this;
    }

    public Object writeReplace() {
        return trimmed();
    }

    private ImmutableLongArray(long[] jArr) {
        this(jArr, 0, jArr.length);
    }

    public static C3018b builder() {
        return new C3018b(10);
    }

    public static ImmutableLongArray copyOf(Collection<Long> collection) {
        return collection.isEmpty() ? EMPTY : new ImmutableLongArray(Longs.m16478i(collection));
    }

    public static ImmutableLongArray copyOf(long[] jArr) {
        if (jArr.length == 0) {
            return EMPTY;
        }
        return new ImmutableLongArray(Arrays.copyOf(jArr, jArr.length));
    }

    /* JADX INFO: renamed from: of */
    public static ImmutableLongArray m16443of(long j) {
        return new ImmutableLongArray(new long[]{j});
    }

    /* JADX INFO: renamed from: of */
    public static ImmutableLongArray m16444of(long j, long j2) {
        return new ImmutableLongArray(new long[]{j, j2});
    }

    /* JADX INFO: renamed from: of */
    public static ImmutableLongArray m16445of(long j, long j2, long j3) {
        return new ImmutableLongArray(new long[]{j, j2, j3});
    }

    /* JADX INFO: renamed from: of */
    public static ImmutableLongArray m16446of(long j, long j2, long j3, long j4) {
        return new ImmutableLongArray(new long[]{j, j2, j3, j4});
    }

    /* JADX INFO: renamed from: of */
    public static ImmutableLongArray m16447of(long j, long j2, long j3, long j4, long j5) {
        return new ImmutableLongArray(new long[]{j, j2, j3, j4, j5});
    }

    /* JADX INFO: renamed from: of */
    public static ImmutableLongArray m16448of(long j, long j2, long j3, long j4, long j5, long j6) {
        return new ImmutableLongArray(new long[]{j, j2, j3, j4, j5, j6});
    }

    /* JADX INFO: renamed from: of */
    public static ImmutableLongArray m16442of() {
        return EMPTY;
    }
}
