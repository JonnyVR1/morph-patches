package com.google.common.collect;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import p149l.dpj0;
import p149l.j050;
import p149l.lwk;
import p149l.sd5;
import p149l.sf80;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ImmutableSet<E> extends ImmutableCollection<E> implements Set<E> {
    private static final int CUTOFF = 751619276;
    private static final double DESIRED_LOAD_FACTOR = 0.7d;
    static final int MAX_TABLE_SIZE = 1073741824;
    private transient ImmutableList<E> asList;

    public static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        final Object[] elements;

        public SerializedForm(Object[] objArr) {
            this.elements = objArr;
        }

        public Object readResolve() {
            return ImmutableSet.copyOf(this.elements);
        }
    }

    public static <E> C2802a<E> builder() {
        return new C2802a<>();
    }

    public static <E> C2802a<E> builderWithExpectedSize(int i) {
        sd5.m183444b(i, "expectedSize");
        return new C2802a<>(i);
    }

    public static int chooseTableSize(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= CUTOFF) {
            sf80.m183883e(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * DESIRED_LOAD_FACTOR < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> ImmutableSet<E> construct(int i, Object... objArr) {
        if (i == 0) {
            return m15768of();
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return m15769of(obj);
        }
        int iChooseTableSize = chooseTableSize(i);
        Object[] objArr2 = new Object[iChooseTableSize];
        int i2 = iChooseTableSize - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object objM139129a = j050.m139129a(objArr[i5], i5);
            int iHashCode = objM139129a.hashCode();
            int iM151973c = lwk.m151973c(iHashCode);
            while (true) {
                int i6 = iM151973c & i2;
                Object obj2 = objArr2[i6];
                if (obj2 == null) {
                    objArr[i4] = objM139129a;
                    objArr2[i6] = objM139129a;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (obj2.equals(objM139129a)) {
                    break;
                }
                iM151973c++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return new SingletonImmutableSet(obj3);
        }
        if (chooseTableSize(i4) < iChooseTableSize / 2) {
            return construct(i4, objArr);
        }
        if (shouldTrim(i4, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new RegularImmutableSet(objArr, i3, objArr2, i2, i4);
    }

    public static <E> ImmutableSet<E> copyOf(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return m15768of();
        }
        E next = it.next();
        return !it.hasNext() ? m15769of((Object) next) : new C2802a().mo15683a(next).mo15778l(it).mo15780n();
    }

    @SafeVarargs
    /* JADX INFO: renamed from: of */
    public static <E> ImmutableSet<E> m15774of(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        sf80.m183883e(eArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = eArr.length + 6;
        Object[] objArr = new Object[length];
        objArr[0] = e;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return construct(length, objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean shouldTrim(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public ImmutableList<E> asList() {
        ImmutableList<E> immutableList = this.asList;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList<E> immutableListCreateAsList = createAsList();
        this.asList = immutableListCreateAsList;
        return immutableListCreateAsList;
    }

    public ImmutableList<E> createAsList() {
        return ImmutableList.asImmutableList(toArray());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ImmutableSet) && isHashCodeFast() && ((ImmutableSet) obj).isHashCodeFast() && hashCode() != obj.hashCode()) {
            return false;
        }
        return Sets.m16116a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return Sets.m16119d(this);
    }

    public boolean isHashCodeFast() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public abstract dpj0<E> iterator();

    @Override // com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(toArray());
    }

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableSet$a */
    public static class C2802a<E> extends ImmutableCollection.AbstractC2777a<E> {

        /* JADX INFO: renamed from: d */
        public Object[] f10924d;

        /* JADX INFO: renamed from: e */
        public int f10925e;

        public C2802a(int i) {
            super(i);
            this.f10924d = new Object[ImmutableSet.chooseTableSize(i)];
        }

        @Override // com.google.common.collect.ImmutableCollection.AbstractC2778b
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public C2802a<E> mo15683a(E e) {
            sf80.m183894p(e);
            if (this.f10924d != null && ImmutableSet.chooseTableSize(this.f10882b) <= this.f10924d.length) {
                m15779m(e);
                return this;
            }
            this.f10924d = null;
            super.m15679f(e);
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C2802a<E> mo15776j(E... eArr) {
            if (this.f10924d == null) {
                super.mo15677b(eArr);
                return this;
            }
            for (E e : eArr) {
                mo15683a(e);
            }
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C2802a<E> mo15777k(Iterable<? extends E> iterable) {
            sf80.m183894p(iterable);
            if (this.f10924d == null) {
                super.mo15678c(iterable);
                return this;
            }
            Iterator<? extends E> it = iterable.iterator();
            while (it.hasNext()) {
                mo15683a(it.next());
            }
            return this;
        }

        /* JADX INFO: renamed from: l */
        public C2802a<E> mo15778l(Iterator<? extends E> it) {
            sf80.m183894p(it);
            while (it.hasNext()) {
                mo15683a(it.next());
            }
            return this;
        }

        /* JADX INFO: renamed from: m */
        public final void m15779m(E e) {
            Objects.requireNonNull(this.f10924d);
            int length = this.f10924d.length - 1;
            int iHashCode = e.hashCode();
            int iM151973c = lwk.m151973c(iHashCode);
            while (true) {
                int i = iM151973c & length;
                Object[] objArr = this.f10924d;
                Object obj = objArr[i];
                if (obj == null) {
                    objArr[i] = e;
                    this.f10925e += iHashCode;
                    super.m15679f(e);
                    return;
                } else if (obj.equals(e)) {
                    return;
                } else {
                    iM151973c = i + 1;
                }
            }
        }

        /* JADX INFO: renamed from: n */
        public ImmutableSet<E> mo15780n() {
            ImmutableSet<E> immutableSetConstruct;
            int i = this.f10882b;
            if (i == 0) {
                return ImmutableSet.m15768of();
            }
            if (i == 1) {
                Object obj = this.f10881a[0];
                Objects.requireNonNull(obj);
                return ImmutableSet.m15769of(obj);
            }
            if (this.f10924d == null || ImmutableSet.chooseTableSize(i) != this.f10924d.length) {
                immutableSetConstruct = ImmutableSet.construct(this.f10882b, this.f10881a);
                this.f10882b = immutableSetConstruct.size();
            } else {
                boolean zShouldTrim = ImmutableSet.shouldTrim(this.f10882b, this.f10881a.length);
                Object[] objArrCopyOf = this.f10881a;
                if (zShouldTrim) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, this.f10882b);
                }
                int i2 = this.f10925e;
                Object[] objArr = this.f10924d;
                immutableSetConstruct = new RegularImmutableSet<>(objArrCopyOf, i2, objArr, objArr.length - 1, this.f10882b);
            }
            this.f10883c = true;
            this.f10924d = null;
            return immutableSetConstruct;
        }

        public C2802a() {
            super(4);
        }
    }

    public static <E> ImmutableSet<E> copyOf(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return copyOf((Collection) iterable);
        }
        return copyOf(iterable.iterator());
    }

    /* JADX INFO: renamed from: of */
    public static <E> ImmutableSet<E> m15769of(E e) {
        return new SingletonImmutableSet(e);
    }

    public static <E> ImmutableSet<E> copyOf(Collection<? extends E> collection) {
        if ((collection instanceof ImmutableSet) && !(collection instanceof SortedSet)) {
            ImmutableSet<E> immutableSet = (ImmutableSet) collection;
            if (!immutableSet.isPartialView()) {
                return immutableSet;
            }
        }
        Object[] array = collection.toArray();
        return construct(array.length, array);
    }

    /* JADX INFO: renamed from: of */
    public static <E> ImmutableSet<E> m15770of(E e, E e2) {
        return construct(2, e, e2);
    }

    /* JADX INFO: renamed from: of */
    public static <E> ImmutableSet<E> m15771of(E e, E e2, E e3) {
        return construct(3, e, e2, e3);
    }

    /* JADX INFO: renamed from: of */
    public static <E> ImmutableSet<E> m15772of(E e, E e2, E e3, E e4) {
        return construct(4, e, e2, e3, e4);
    }

    /* JADX INFO: renamed from: of */
    public static <E> ImmutableSet<E> m15773of(E e, E e2, E e3, E e4, E e5) {
        return construct(5, e, e2, e3, e4, e5);
    }

    /* JADX INFO: renamed from: of */
    public static <E> ImmutableSet<E> m15768of() {
        return RegularImmutableSet.EMPTY;
    }

    public static <E> ImmutableSet<E> copyOf(E[] eArr) {
        int length = eArr.length;
        if (length == 0) {
            return m15768of();
        }
        if (length != 1) {
            return construct(eArr.length, (Object[]) eArr.clone());
        }
        return m15769of((Object) eArr[0]);
    }
}
