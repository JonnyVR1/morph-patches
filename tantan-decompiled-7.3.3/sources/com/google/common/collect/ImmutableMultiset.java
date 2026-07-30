package com.google.common.collect;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import p153l.gyj0;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ImmutableMultiset<E> extends ImmutableMultisetGwtSerializationDependencies<E> implements InterfaceC2995k<E> {
    private transient ImmutableList<E> asList;
    private transient ImmutableSet<InterfaceC2995k.a<E>> entrySet;

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
    public class C2816a extends gyj0<E> {

        /* JADX INFO: renamed from: a */
        public int f10947a;

        /* JADX INFO: renamed from: b */
        public E f10948b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Iterator f10949c;

        public C2816a(ImmutableMultiset immutableMultiset, Iterator it) {
            this.f10949c = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f10947a > 0 || this.f10949c.hasNext();
        }

        @Override // java.util.Iterator
        public E next() {
            if (this.f10947a <= 0) {
                InterfaceC2995k.a aVar = (InterfaceC2995k.a) this.f10949c.next();
                this.f10948b = (E) aVar.getElement();
                this.f10947a = aVar.getCount();
            }
            this.f10947a--;
            E e = this.f10948b;
            Objects.requireNonNull(e);
            return e;
        }
    }

    public static <E> C2817b<E> builder() {
        return new C2817b<>();
    }

    private static <E> ImmutableMultiset<E> copyFromElements(E... eArr) {
        return new C2817b().mo15806g(eArr).mo15810k();
    }

    public static <E> ImmutableMultiset<E> copyFromEntries(Collection<? extends InterfaceC2995k.a<? extends E>> collection) {
        C2817b c2817b = new C2817b(collection.size());
        for (InterfaceC2995k.a<? extends E> aVar : collection) {
            c2817b.mo15809j(aVar.getElement(), aVar.getCount());
        }
        return c2817b.mo15810k();
    }

    public static <E> ImmutableMultiset<E> copyOf(Iterable<? extends E> iterable) {
        if (iterable instanceof ImmutableMultiset) {
            ImmutableMultiset<E> immutableMultiset = (ImmutableMultiset) iterable;
            if (!immutableMultiset.isPartialView()) {
                return immutableMultiset;
            }
        }
        C2817b c2817b = new C2817b(Multisets.m16151h(iterable));
        c2817b.mo15807h(iterable);
        return c2817b.mo15810k();
    }

    private ImmutableSet<InterfaceC2995k.a<E>> createEntrySet() {
        return isEmpty() ? ImmutableSet.m15822of() : new EntrySet(this, null);
    }

    /* JADX INFO: renamed from: of */
    public static <E> ImmutableMultiset<E> m15803of(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        return new C2817b().mo15737a(e).mo15737a(e2).mo15737a(e3).mo15737a(e4).mo15737a(e5).mo15737a(e6).mo15806g(eArr).mo15810k();
    }

    @Override // com.google.common.collect.InterfaceC2995k
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
        gyj0<InterfaceC2995k.a<E>> it = entrySet().iterator();
        while (it.hasNext()) {
            InterfaceC2995k.a<E> next = it.next();
            Arrays.fill(objArr, i, next.getCount() + i, next.getElement());
            i += next.getCount();
        }
        return i;
    }

    public abstract /* synthetic */ int count(Object obj);

    @Override // com.google.common.collect.InterfaceC2995k
    public abstract ImmutableSet<E> elementSet();

    @Override // com.google.common.collect.InterfaceC2995k
    public ImmutableSet<InterfaceC2995k.a<E>> entrySet() {
        ImmutableSet<InterfaceC2995k.a<E>> immutableSet = this.entrySet;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<InterfaceC2995k.a<E>> immutableSetCreateEntrySet = createEntrySet();
        this.entrySet = immutableSetCreateEntrySet;
        return immutableSetCreateEntrySet;
    }

    @Override // java.util.Collection, com.google.common.collect.InterfaceC2995k
    public boolean equals(Object obj) {
        return Multisets.m16149f(this, obj);
    }

    public abstract InterfaceC2995k.a<E> getEntry(int i);

    @Override // java.util.Collection, com.google.common.collect.InterfaceC2995k
    public int hashCode() {
        return Sets.m16173d(entrySet());
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public gyj0<E> iterator() {
        return new C2816a(this, entrySet().iterator());
    }

    @Override // com.google.common.collect.InterfaceC2995k
    @Deprecated
    public final int remove(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.InterfaceC2995k
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

    public final class EntrySet extends IndexedImmutableSet<InterfaceC2995k.a<E>> {
        private static final long serialVersionUID = 0;

        private EntrySet() {
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof InterfaceC2995k.a) {
                InterfaceC2995k.a aVar = (InterfaceC2995k.a) obj;
                if (aVar.getCount() > 0 && ImmutableMultiset.this.count(aVar.getElement()) == aVar.getCount()) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.IndexedImmutableSet
        public InterfaceC2995k.a<E> get(int i) {
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

        public /* synthetic */ EntrySet(ImmutableMultiset immutableMultiset, C2816a c2816a) {
            this();
        }
    }

    @Override // com.google.common.collect.InterfaceC2995k
    @Deprecated
    public final boolean setCount(E e, int i, int i2) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableMultiset$b */
    public static class C2817b<E> extends ImmutableCollection.AbstractC2801b<E> {

        /* JADX INFO: renamed from: a */
        public C2996l<E> f10950a;

        /* JADX INFO: renamed from: b */
        public boolean f10951b;

        /* JADX INFO: renamed from: c */
        public boolean f10952c;

        public C2817b(int i) {
            this.f10951b = false;
            this.f10952c = false;
            this.f10950a = C2996l.m16320c(i);
        }

        /* JADX INFO: renamed from: l */
        public static <T> C2996l<T> m15804l(Iterable<T> iterable) {
            if (iterable instanceof RegularImmutableMultiset) {
                return ((RegularImmutableMultiset) iterable).contents;
            }
            if (iterable instanceof AbstractMapBasedMultiset) {
                return ((AbstractMapBasedMultiset) iterable).backingMap;
            }
            return null;
        }

        @Override // com.google.common.collect.ImmutableCollection.AbstractC2801b
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public C2817b<E> mo15737a(E e) {
            return mo15809j(e, 1);
        }

        /* JADX INFO: renamed from: g */
        public C2817b<E> mo15806g(E... eArr) {
            super.mo15731b(eArr);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: h */
        public C2817b<E> mo15807h(Iterable<? extends E> iterable) {
            Objects.requireNonNull(this.f10950a);
            if (!(iterable instanceof InterfaceC2995k)) {
                super.mo15732c(iterable);
                return this;
            }
            InterfaceC2995k interfaceC2995kM16147d = Multisets.m16147d(iterable);
            C2996l c2996lM15804l = m15804l(interfaceC2995kM16147d);
            if (c2996lM15804l != null) {
                C2996l<E> c2996l = this.f10950a;
                c2996l.m16329d(Math.max(c2996l.m16327C(), c2996lM15804l.m16327C()));
                for (int iMo16330e = c2996lM15804l.mo16330e(); iMo16330e >= 0; iMo16330e = c2996lM15804l.mo16340s(iMo16330e)) {
                    mo15809j(c2996lM15804l.m16333i(iMo16330e), c2996lM15804l.m16334k(iMo16330e));
                }
            } else {
                Set<InterfaceC2995k.a<E>> setEntrySet = interfaceC2995kM16147d.entrySet();
                C2996l<E> c2996l2 = this.f10950a;
                c2996l2.m16329d(Math.max(c2996l2.m16327C(), setEntrySet.size()));
                for (InterfaceC2995k.a<E> aVar : interfaceC2995kM16147d.entrySet()) {
                    mo15809j(aVar.getElement(), aVar.getCount());
                }
            }
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C2817b<E> mo15808i(Iterator<? extends E> it) {
            super.m15738d(it);
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C2817b<E> mo15809j(E e, int i) {
            Objects.requireNonNull(this.f10950a);
            if (i == 0) {
                return this;
            }
            if (this.f10951b) {
                this.f10950a = new C2996l<>(this.f10950a);
                this.f10952c = false;
            }
            this.f10951b = false;
            xn80.m212111p(e);
            C2996l<E> c2996l = this.f10950a;
            c2996l.m16342u(e, i + c2996l.m16331f(e));
            return this;
        }

        /* JADX INFO: renamed from: k */
        public ImmutableMultiset<E> mo15810k() {
            Objects.requireNonNull(this.f10950a);
            if (this.f10950a.m16327C() == 0) {
                return ImmutableMultiset.m15797of();
            }
            if (this.f10952c) {
                this.f10950a = new C2996l<>(this.f10950a);
                this.f10952c = false;
            }
            this.f10951b = true;
            return new RegularImmutableMultiset(this.f10950a);
        }

        public C2817b() {
            this(4);
        }

        public C2817b(boolean z) {
            this.f10951b = false;
            this.f10952c = false;
            this.f10950a = null;
        }
    }

    public static <E> ImmutableMultiset<E> copyOf(E[] eArr) {
        return copyFromElements(eArr);
    }

    public static <E> ImmutableMultiset<E> copyOf(Iterator<? extends E> it) {
        return new C2817b().mo15808i(it).mo15810k();
    }

    /* JADX INFO: renamed from: of */
    public static <E> ImmutableMultiset<E> m15798of(E e) {
        return copyFromElements(e);
    }

    /* JADX INFO: renamed from: of */
    public static <E> ImmutableMultiset<E> m15799of(E e, E e2) {
        return copyFromElements(e, e2);
    }

    /* JADX INFO: renamed from: of */
    public static <E> ImmutableMultiset<E> m15800of(E e, E e2, E e3) {
        return copyFromElements(e, e2, e3);
    }

    /* JADX INFO: renamed from: of */
    public static <E> ImmutableMultiset<E> m15801of(E e, E e2, E e3, E e4) {
        return copyFromElements(e, e2, e3, e4);
    }

    /* JADX INFO: renamed from: of */
    public static <E> ImmutableMultiset<E> m15802of(E e, E e2, E e3, E e4, E e5) {
        return copyFromElements(e, e2, e3, e4, e5);
    }

    /* JADX INFO: renamed from: of */
    public static <E> ImmutableMultiset<E> m15797of() {
        return RegularImmutableMultiset.EMPTY;
    }
}
