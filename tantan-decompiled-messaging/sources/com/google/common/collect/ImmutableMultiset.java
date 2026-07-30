package com.google.common.collect;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import p149l.dpj0;
import p149l.sf80;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ImmutableMultiset<E> extends ImmutableMultisetGwtSerializationDependencies<E> implements InterfaceC2972k<E> {
    private transient ImmutableList<E> asList;
    private transient ImmutableSet<InterfaceC2972k.a<E>> entrySet;

    public static class EntrySetSerializedForm<E> implements Serializable {
        final ImmutableMultiset<E> multiset;

        public EntrySetSerializedForm(ImmutableMultiset<E> immutableMultiset) {
            this.multiset = immutableMultiset;
        }

        public Object readResolve() {
            return this.multiset.entrySet();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableMultiset$a */
    public class C2793a extends dpj0<E> {

        /* JADX INFO: renamed from: a */
        public int f10910a;

        /* JADX INFO: renamed from: b */
        public E f10911b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Iterator f10912c;

        public C2793a(ImmutableMultiset immutableMultiset, Iterator it) {
            this.f10912c = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f10910a > 0 || this.f10912c.hasNext();
        }

        @Override // java.util.Iterator
        public E next() {
            if (this.f10910a <= 0) {
                InterfaceC2972k.a aVar = (InterfaceC2972k.a) this.f10912c.next();
                this.f10911b = (E) aVar.getElement();
                this.f10910a = aVar.getCount();
            }
            this.f10910a--;
            E e = this.f10911b;
            Objects.requireNonNull(e);
            return e;
        }
    }

    public static <E> C2794b<E> builder() {
        return new C2794b<>();
    }

    private static <E> ImmutableMultiset<E> copyFromElements(E... eArr) {
        return new C2794b().mo15752g(eArr).mo15756k();
    }

    public static <E> ImmutableMultiset<E> copyFromEntries(Collection<? extends InterfaceC2972k.a<? extends E>> collection) {
        C2794b c2794b = new C2794b(collection.size());
        for (InterfaceC2972k.a<? extends E> aVar : collection) {
            c2794b.mo15755j(aVar.getElement(), aVar.getCount());
        }
        return c2794b.mo15756k();
    }

    public static <E> ImmutableMultiset<E> copyOf(Iterable<? extends E> iterable) {
        if (iterable instanceof ImmutableMultiset) {
            ImmutableMultiset<E> immutableMultiset = (ImmutableMultiset) iterable;
            if (!immutableMultiset.isPartialView()) {
                return immutableMultiset;
            }
        }
        C2794b c2794b = new C2794b(Multisets.m16097h(iterable));
        c2794b.mo15753h(iterable);
        return c2794b.mo15756k();
    }

    private ImmutableSet<InterfaceC2972k.a<E>> createEntrySet() {
        return isEmpty() ? ImmutableSet.m15768of() : new EntrySet(this, null);
    }

    /* JADX INFO: renamed from: of */
    public static <E> ImmutableMultiset<E> m15749of(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        return new C2794b().mo15683a(e).mo15683a(e2).mo15683a(e3).mo15683a(e4).mo15683a(e5).mo15683a(e6).mo15752g(eArr).mo15756k();
    }

    @Override // com.google.common.collect.InterfaceC2972k
    @Deprecated
    public final int add(E e, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public ImmutableList<E> asList() {
        ImmutableList<E> immutableList = this.asList;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList<E> immutableListAsList = super.asList();
        this.asList = immutableListAsList;
        return immutableListAsList;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return count(obj) > 0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int copyIntoArray(Object[] objArr, int i) {
        dpj0<InterfaceC2972k.a<E>> it = entrySet().iterator();
        while (it.hasNext()) {
            InterfaceC2972k.a<E> next = it.next();
            Arrays.fill(objArr, i, next.getCount() + i, next.getElement());
            i += next.getCount();
        }
        return i;
    }

    public abstract /* synthetic */ int count(Object obj);

    @Override // com.google.common.collect.InterfaceC2972k
    public abstract ImmutableSet<E> elementSet();

    @Override // com.google.common.collect.InterfaceC2972k
    public ImmutableSet<InterfaceC2972k.a<E>> entrySet() {
        ImmutableSet<InterfaceC2972k.a<E>> immutableSet = this.entrySet;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<InterfaceC2972k.a<E>> immutableSetCreateEntrySet = createEntrySet();
        this.entrySet = immutableSetCreateEntrySet;
        return immutableSetCreateEntrySet;
    }

    @Override // java.util.Collection, com.google.common.collect.InterfaceC2972k
    public boolean equals(Object obj) {
        return Multisets.m16095f(this, obj);
    }

    public abstract InterfaceC2972k.a<E> getEntry(int i);

    @Override // java.util.Collection, com.google.common.collect.InterfaceC2972k
    public int hashCode() {
        return Sets.m16119d(entrySet());
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public dpj0<E> iterator() {
        return new C2793a(this, entrySet().iterator());
    }

    @Override // com.google.common.collect.InterfaceC2972k
    @Deprecated
    public final int remove(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.InterfaceC2972k
    @Deprecated
    public final int setCount(E e, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return entrySet().toString();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public abstract Object writeReplace();

    public final class EntrySet extends IndexedImmutableSet<InterfaceC2972k.a<E>> {
        private static final long serialVersionUID = 0;

        private EntrySet() {
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof InterfaceC2972k.a) {
                InterfaceC2972k.a aVar = (InterfaceC2972k.a) obj;
                if (aVar.getCount() > 0 && ImmutableMultiset.this.count(aVar.getElement()) == aVar.getCount()) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.IndexedImmutableSet
        public InterfaceC2972k.a<E> get(int i) {
            return ImmutableMultiset.this.getEntry(i);
        }

        @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return ImmutableMultiset.this.hashCode();
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return ImmutableMultiset.this.isPartialView();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return ImmutableMultiset.this.elementSet().size();
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return new EntrySetSerializedForm(ImmutableMultiset.this);
        }

        public /* synthetic */ EntrySet(ImmutableMultiset immutableMultiset, C2793a c2793a) {
            this();
        }
    }

    @Override // com.google.common.collect.InterfaceC2972k
    @Deprecated
    public final boolean setCount(E e, int i, int i2) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableMultiset$b */
    public static class C2794b<E> extends ImmutableCollection.AbstractC2778b<E> {

        /* JADX INFO: renamed from: a */
        public C2973l<E> f10913a;

        /* JADX INFO: renamed from: b */
        public boolean f10914b;

        /* JADX INFO: renamed from: c */
        public boolean f10915c;

        public C2794b(int i) {
            this.f10914b = false;
            this.f10915c = false;
            this.f10913a = C2973l.m16266c(i);
        }

        /* JADX INFO: renamed from: l */
        public static <T> C2973l<T> m15750l(Iterable<T> iterable) {
            if (iterable instanceof RegularImmutableMultiset) {
                return ((RegularImmutableMultiset) iterable).contents;
            }
            if (iterable instanceof AbstractMapBasedMultiset) {
                return ((AbstractMapBasedMultiset) iterable).backingMap;
            }
            return null;
        }

        @Override // com.google.common.collect.ImmutableCollection.AbstractC2778b
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public C2794b<E> mo15683a(E e) {
            return mo15755j(e, 1);
        }

        /* JADX INFO: renamed from: g */
        public C2794b<E> mo15752g(E... eArr) {
            super.mo15677b(eArr);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: h */
        public C2794b<E> mo15753h(Iterable<? extends E> iterable) {
            Objects.requireNonNull(this.f10913a);
            if (!(iterable instanceof InterfaceC2972k)) {
                super.mo15678c(iterable);
                return this;
            }
            InterfaceC2972k interfaceC2972kM16093d = Multisets.m16093d(iterable);
            C2973l c2973lM15750l = m15750l(interfaceC2972kM16093d);
            if (c2973lM15750l != null) {
                C2973l<E> c2973l = this.f10913a;
                c2973l.m16275d(Math.max(c2973l.m16273C(), c2973lM15750l.m16273C()));
                for (int iMo16276e = c2973lM15750l.mo16276e(); iMo16276e >= 0; iMo16276e = c2973lM15750l.mo16286s(iMo16276e)) {
                    mo15755j(c2973lM15750l.m16279i(iMo16276e), c2973lM15750l.m16280k(iMo16276e));
                }
            } else {
                Set<InterfaceC2972k.a<E>> setEntrySet = interfaceC2972kM16093d.entrySet();
                C2973l<E> c2973l2 = this.f10913a;
                c2973l2.m16275d(Math.max(c2973l2.m16273C(), setEntrySet.size()));
                for (InterfaceC2972k.a<E> aVar : interfaceC2972kM16093d.entrySet()) {
                    mo15755j(aVar.getElement(), aVar.getCount());
                }
            }
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C2794b<E> mo15754i(Iterator<? extends E> it) {
            super.m15684d(it);
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C2794b<E> mo15755j(E e, int i) {
            Objects.requireNonNull(this.f10913a);
            if (i == 0) {
                return this;
            }
            if (this.f10914b) {
                this.f10913a = new C2973l<>(this.f10913a);
                this.f10915c = false;
            }
            this.f10914b = false;
            sf80.m183894p(e);
            C2973l<E> c2973l = this.f10913a;
            c2973l.m16288u(e, i + c2973l.m16277f(e));
            return this;
        }

        /* JADX INFO: renamed from: k */
        public ImmutableMultiset<E> mo15756k() {
            Objects.requireNonNull(this.f10913a);
            if (this.f10913a.m16273C() == 0) {
                return ImmutableMultiset.m15743of();
            }
            if (this.f10915c) {
                this.f10913a = new C2973l<>(this.f10913a);
                this.f10915c = false;
            }
            this.f10914b = true;
            return new RegularImmutableMultiset(this.f10913a);
        }

        public C2794b() {
            this(4);
        }

        public C2794b(boolean z) {
            this.f10914b = false;
            this.f10915c = false;
            this.f10913a = null;
        }
    }

    public static <E> ImmutableMultiset<E> copyOf(E[] eArr) {
        return copyFromElements(eArr);
    }

    public static <E> ImmutableMultiset<E> copyOf(Iterator<? extends E> it) {
        return new C2794b().mo15754i(it).mo15756k();
    }

    /* JADX INFO: renamed from: of */
    public static <E> ImmutableMultiset<E> m15744of(E e) {
        return copyFromElements(e);
    }

    /* JADX INFO: renamed from: of */
    public static <E> ImmutableMultiset<E> m15745of(E e, E e2) {
        return copyFromElements(e, e2);
    }

    /* JADX INFO: renamed from: of */
    public static <E> ImmutableMultiset<E> m15746of(E e, E e2, E e3) {
        return copyFromElements(e, e2, e3);
    }

    /* JADX INFO: renamed from: of */
    public static <E> ImmutableMultiset<E> m15747of(E e, E e2, E e3, E e4) {
        return copyFromElements(e, e2, e3, e4);
    }

    /* JADX INFO: renamed from: of */
    public static <E> ImmutableMultiset<E> m15748of(E e, E e2, E e3, E e4, E e5) {
        return copyFromElements(e, e2, e3, e4, e5);
    }

    /* JADX INFO: renamed from: of */
    public static <E> ImmutableMultiset<E> m15743of() {
        return RegularImmutableMultiset.EMPTY;
    }
}
