package com.google.common.collect;

import com.google.android.gms.common.api.Api;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import p153l.gig0;
import p153l.gyj0;
import p153l.se5;
import p153l.xn80;
import p153l.y850;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ImmutableCollection<E> extends AbstractCollection<E> implements Serializable {
    private static final Object[] EMPTY_ARRAY = new Object[0];

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableCollection$a */
    public static abstract class AbstractC2800a<E> extends AbstractC2801b<E> {

        /* JADX INFO: renamed from: a */
        public Object[] f10918a;

        /* JADX INFO: renamed from: b */
        public int f10919b;

        /* JADX INFO: renamed from: c */
        public boolean f10920c;

        public AbstractC2800a(int i) {
            se5.m185516b(i, "initialCapacity");
            this.f10918a = new Object[i];
            this.f10919b = 0;
        }

        @Override // com.google.common.collect.ImmutableCollection.AbstractC2801b
        /* JADX INFO: renamed from: b */
        public AbstractC2801b<E> mo15731b(E... eArr) {
            m15734g(eArr, eArr.length);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.AbstractC2801b
        /* JADX INFO: renamed from: c */
        public AbstractC2801b<E> mo15732c(Iterable<? extends E> iterable) {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                m15735h(this.f10919b + collection.size());
                if (collection instanceof ImmutableCollection) {
                    this.f10919b = ((ImmutableCollection) collection).copyIntoArray(this.f10918a, this.f10919b);
                    return this;
                }
            }
            super.mo15732c(iterable);
            return this;
        }

        /* JADX INFO: renamed from: f */
        public AbstractC2800a<E> m15733f(E e) {
            xn80.m212111p(e);
            m15735h(this.f10919b + 1);
            Object[] objArr = this.f10918a;
            int i = this.f10919b;
            this.f10919b = i + 1;
            objArr[i] = e;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public final void m15734g(Object[] objArr, int i) {
            y850.m214724c(objArr, i);
            m15735h(this.f10919b + i);
            System.arraycopy(objArr, 0, this.f10918a, this.f10919b, i);
            this.f10919b += i;
        }

        /* JADX INFO: renamed from: h */
        public final void m15735h(int i) {
            Object[] objArr = this.f10918a;
            if (objArr.length < i) {
                this.f10918a = Arrays.copyOf(objArr, AbstractC2801b.m15736e(objArr.length, i));
                this.f10920c = false;
            } else if (this.f10920c) {
                this.f10918a = (Object[]) objArr.clone();
                this.f10920c = false;
            }
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableCollection$b */
    public static abstract class AbstractC2801b<E> {
        /* JADX INFO: renamed from: e */
        public static int m15736e(int i, int i2) {
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
        public abstract AbstractC2801b<E> mo15737a(E e);

        /* JADX INFO: renamed from: b */
        public AbstractC2801b<E> mo15731b(E... eArr) {
            for (E e : eArr) {
                mo15737a(e);
            }
            return this;
        }

        /* JADX INFO: renamed from: c */
        public AbstractC2801b<E> mo15732c(Iterable<? extends E> iterable) {
            Iterator<? extends E> it = iterable.iterator();
            while (it.hasNext()) {
                mo15737a(it.next());
            }
            return this;
        }

        /* JADX INFO: renamed from: d */
        public AbstractC2801b<E> m15738d(Iterator<? extends E> it) {
            while (it.hasNext()) {
                mo15737a(it.next());
            }
            return this;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public ImmutableList<E> asList() {
        return isEmpty() ? ImmutableList.m15739of() : ImmutableList.asImmutableList(toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    public int copyIntoArray(Object[] objArr, int i) {
        gyj0<E> it = iterator();
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return i;
    }

    public Object[] internalArray() {
        return null;
    }

    public int internalArrayEnd() {
        throw new UnsupportedOperationException();
    }

    public int internalArrayStart() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean isPartialView();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public abstract gyj0<E> iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        xn80.m212111p(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] objArrInternalArray = internalArray();
            if (objArrInternalArray != null) {
                return (T[]) C2997m.m16349a(objArrInternalArray, internalArrayStart(), internalArrayEnd(), tArr);
            }
            tArr = (T[]) y850.m214726e(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        copyIntoArray(tArr, 0);
        return tArr;
    }

    public Object writeReplace() {
        return new ImmutableList.SerializedForm(toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(EMPTY_ARRAY);
    }
}
