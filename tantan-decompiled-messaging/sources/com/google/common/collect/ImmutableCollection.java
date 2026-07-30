package com.google.common.collect;

import com.google.android.gms.common.api.Api;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import p149l.dpj0;
import p149l.j050;
import p149l.sd5;
import p149l.sf80;
import p149l.y9g0;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ImmutableCollection<E> extends AbstractCollection<E> implements Serializable {
    private static final Object[] EMPTY_ARRAY = new Object[0];

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableCollection$a */
    public static abstract class AbstractC2777a<E> extends AbstractC2778b<E> {

        /* JADX INFO: renamed from: a */
        public Object[] f10881a;

        /* JADX INFO: renamed from: b */
        public int f10882b;

        /* JADX INFO: renamed from: c */
        public boolean f10883c;

        public AbstractC2777a(int i) {
            sd5.m183444b(i, "initialCapacity");
            this.f10881a = new Object[i];
            this.f10882b = 0;
        }

        @Override // com.google.common.collect.ImmutableCollection.AbstractC2778b
        /* JADX INFO: renamed from: b */
        public AbstractC2778b<E> mo15677b(E... eArr) {
            m15680g(eArr, eArr.length);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.AbstractC2778b
        /* JADX INFO: renamed from: c */
        public AbstractC2778b<E> mo15678c(Iterable<? extends E> iterable) {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                m15681h(this.f10882b + collection.size());
                if (collection instanceof ImmutableCollection) {
                    this.f10882b = ((ImmutableCollection) collection).copyIntoArray(this.f10881a, this.f10882b);
                    return this;
                }
            }
            super.mo15678c(iterable);
            return this;
        }

        /* JADX INFO: renamed from: f */
        public AbstractC2777a<E> m15679f(E e) {
            sf80.m183894p(e);
            m15681h(this.f10882b + 1);
            Object[] objArr = this.f10881a;
            int i = this.f10882b;
            this.f10882b = i + 1;
            objArr[i] = e;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public final void m15680g(Object[] objArr, int i) {
            j050.m139131c(objArr, i);
            m15681h(this.f10882b + i);
            System.arraycopy(objArr, 0, this.f10881a, this.f10882b, i);
            this.f10882b += i;
        }

        /* JADX INFO: renamed from: h */
        public final void m15681h(int i) {
            Object[] objArr = this.f10881a;
            if (objArr.length < i) {
                this.f10881a = Arrays.copyOf(objArr, AbstractC2778b.m15682e(objArr.length, i));
                this.f10883c = false;
            } else if (this.f10883c) {
                this.f10881a = (Object[]) objArr.clone();
                this.f10883c = false;
            }
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableCollection$b */
    public static abstract class AbstractC2778b<E> {
        /* JADX INFO: renamed from: e */
        public static int m15682e(int i, int i2) {
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
        public abstract AbstractC2778b<E> mo15683a(E e);

        /* JADX INFO: renamed from: b */
        public AbstractC2778b<E> mo15677b(E... eArr) {
            for (E e : eArr) {
                mo15683a(e);
            }
            return this;
        }

        /* JADX INFO: renamed from: c */
        public AbstractC2778b<E> mo15678c(Iterable<? extends E> iterable) {
            Iterator<? extends E> it = iterable.iterator();
            while (it.hasNext()) {
                mo15683a(it.next());
            }
            return this;
        }

        /* JADX INFO: renamed from: d */
        public AbstractC2778b<E> m15684d(Iterator<? extends E> it) {
            while (it.hasNext()) {
                mo15683a(it.next());
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
        return isEmpty() ? ImmutableList.m15685of() : ImmutableList.asImmutableList(toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    public int copyIntoArray(Object[] objArr, int i) {
        dpj0<E> it = iterator();
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
    public abstract dpj0<E> iterator();

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
        sf80.m183894p(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] objArrInternalArray = internalArray();
            if (objArrInternalArray != null) {
                return (T[]) C2974m.m16295a(objArrInternalArray, internalArrayStart(), internalArrayEnd(), tArr);
            }
            tArr = (T[]) j050.m139133e(tArr, size);
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
