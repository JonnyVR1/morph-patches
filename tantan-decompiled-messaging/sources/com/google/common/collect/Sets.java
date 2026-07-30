package com.google.common.collect;

import com.google.common.base.Predicates;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import p149l.dpj0;
import p149l.g0j;
import p149l.oh80;
import p149l.sf80;

/* JADX INFO: loaded from: classes7.dex */
public final class Sets {

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: com.google.common.collect.Sets$a */
    public class C2914a<E> extends AbstractC2919f<E> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Set f11090a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Set f11091b;

        /* JADX INFO: renamed from: com.google.common.collect.Sets$a$a */
        public class a extends AbstractIterator<E> {

            /* JADX INFO: renamed from: c */
            public final Iterator<? extends E> f11092c;

            /* JADX INFO: renamed from: d */
            public final Iterator<? extends E> f11093d;

            public a() {
                this.f11092c = C2914a.this.f11090a.iterator();
                this.f11093d = C2914a.this.f11091b.iterator();
            }

            @Override // com.google.common.collect.AbstractIterator
            /* JADX INFO: renamed from: a */
            public E mo15565a() {
                if (this.f11092c.hasNext()) {
                    return this.f11092c.next();
                }
                while (this.f11093d.hasNext()) {
                    E next = this.f11093d.next();
                    if (!C2914a.this.f11090a.contains(next)) {
                        return next;
                    }
                }
                return m15566b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2914a(Set set, Set set2) {
            super(null);
            this.f11090a = set;
            this.f11091b = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public dpj0<E> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f11090a.contains(obj) || this.f11091b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f11090a.isEmpty() && this.f11091b.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            int size = this.f11090a.size();
            Iterator<E> it = this.f11091b.iterator();
            while (it.hasNext()) {
                if (!this.f11090a.contains(it.next())) {
                    size++;
                }
            }
            return size;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: com.google.common.collect.Sets$b */
    public class C2915b<E> extends AbstractC2919f<E> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Set f11095a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Set f11096b;

        /* JADX INFO: renamed from: com.google.common.collect.Sets$b$a */
        public class a extends AbstractIterator<E> {

            /* JADX INFO: renamed from: c */
            public final Iterator<E> f11097c;

            public a() {
                this.f11097c = C2915b.this.f11095a.iterator();
            }

            @Override // com.google.common.collect.AbstractIterator
            /* JADX INFO: renamed from: a */
            public E mo15565a() {
                while (this.f11097c.hasNext()) {
                    E next = this.f11097c.next();
                    if (C2915b.this.f11096b.contains(next)) {
                        return next;
                    }
                }
                return m15566b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2915b(Set set, Set set2) {
            super(null);
            this.f11095a = set;
            this.f11096b = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: a */
        public dpj0<E> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f11095a.contains(obj) && this.f11096b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return this.f11095a.containsAll(collection) && this.f11096b.containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return Collections.disjoint(this.f11096b, this.f11095a);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator<E> it = this.f11095a.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (this.f11096b.contains(it.next())) {
                    i++;
                }
            }
            return i;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Sets$c */
    public static class C2916c<E> extends C2968g.a<E> implements Set<E> {
        public C2916c(Set<E> set, oh80<? super E> oh80Var) {
            super(set, oh80Var);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return Sets.m16116a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return Sets.m16119d(this);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Sets$d */
    public static class C2917d<E> extends C2916c<E> implements SortedSet<E> {
        public C2917d(SortedSet<E> sortedSet, oh80<? super E> oh80Var) {
            super(sortedSet, oh80Var);
        }

        @Override // java.util.SortedSet
        public Comparator<? super E> comparator() {
            return ((SortedSet) this.f11200a).comparator();
        }

        @Override // java.util.SortedSet
        public E first() {
            return (E) Iterators.m15883m(this.f11200a.iterator(), this.f11201b);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> headSet(E e) {
            return new C2917d(((SortedSet) this.f11200a).headSet(e), this.f11201b);
        }

        @Override // java.util.SortedSet
        public E last() {
            SortedSet sortedSetHeadSet = (SortedSet) this.f11200a;
            while (true) {
                E e = (Object) sortedSetHeadSet.last();
                if (this.f11201b.apply(e)) {
                    return e;
                }
                sortedSetHeadSet = sortedSetHeadSet.headSet(e);
            }
        }

        @Override // java.util.SortedSet
        public SortedSet<E> subSet(E e, E e2) {
            return new C2917d(((SortedSet) this.f11200a).subSet(e, e2), this.f11201b);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> tailSet(E e) {
            return new C2917d(((SortedSet) this.f11200a).tailSet(e), this.f11201b);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Sets$e */
    public static abstract class AbstractC2918e<E> extends AbstractSet<E> {
        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return Sets.m16125j(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return super.retainAll((Collection) sf80.m183894p(collection));
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m16116a(Set<?> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size() && set.containsAll(set2)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static <E> Set<E> m16117b(Set<E> set, oh80<? super E> oh80Var) {
        if (set instanceof SortedSet) {
            return m16118c((SortedSet) set, oh80Var);
        }
        if (!(set instanceof C2916c)) {
            return new C2916c((Set) sf80.m183894p(set), (oh80) sf80.m183894p(oh80Var));
        }
        C2916c c2916c = (C2916c) set;
        return new C2916c((Set) c2916c.f11200a, Predicates.m15416c(c2916c.f11201b, oh80Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static <E> SortedSet<E> m16118c(SortedSet<E> sortedSet, oh80<? super E> oh80Var) {
        if (!(sortedSet instanceof C2916c)) {
            return new C2917d((SortedSet) sf80.m183894p(sortedSet), (oh80) sf80.m183894p(oh80Var));
        }
        C2916c c2916c = (C2916c) sortedSet;
        return new C2917d((SortedSet) c2916c.f11200a, Predicates.m15416c(c2916c.f11201b, oh80Var));
    }

    /* JADX INFO: renamed from: d */
    public static int m16119d(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    /* JADX INFO: renamed from: e */
    public static <E> AbstractC2919f<E> m16120e(Set<E> set, Set<?> set2) {
        sf80.m183895q(set, "set1");
        sf80.m183895q(set2, "set2");
        return new C2915b(set, set2);
    }

    /* JADX INFO: renamed from: f */
    public static <E> HashSet<E> m16121f() {
        return new HashSet<>();
    }

    /* JADX INFO: renamed from: g */
    public static <E> HashSet<E> m16122g(int i) {
        return new HashSet<>(Maps.m16030e(i));
    }

    /* JADX INFO: renamed from: h */
    public static <E> Set<E> m16123h() {
        return Collections.newSetFromMap(Maps.m16043r());
    }

    /* JADX INFO: renamed from: i */
    public static <E> LinkedHashSet<E> m16124i() {
        return new LinkedHashSet<>();
    }

    /* JADX INFO: renamed from: j */
    public static boolean m16125j(Set<?> set, Collection<?> collection) {
        sf80.m183894p(collection);
        if (collection instanceof InterfaceC2972k) {
            collection = ((InterfaceC2972k) collection).elementSet();
        }
        return (!(collection instanceof Set) || collection.size() <= set.size()) ? m16126k(set, collection.iterator()) : Iterators.m15892v(set.iterator(), collection);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m16126k(Set<?> set, Iterator<?> it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }

    /* JADX INFO: renamed from: l */
    public static <E> AbstractC2919f<E> m16127l(Set<? extends E> set, Set<? extends E> set2) {
        sf80.m183895q(set, "set1");
        sf80.m183895q(set2, "set2");
        return new C2914a(set, set2);
    }

    /* JADX INFO: renamed from: m */
    public static <E> NavigableSet<E> m16128m(NavigableSet<E> navigableSet) {
        return ((navigableSet instanceof ImmutableCollection) || (navigableSet instanceof UnmodifiableNavigableSet)) ? navigableSet : new UnmodifiableNavigableSet(navigableSet);
    }

    /* JADX INFO: renamed from: com.google.common.collect.Sets$f */
    public static abstract class AbstractC2919f<E> extends AbstractSet<E> {
        public /* synthetic */ AbstractC2919f(C2914a c2914a) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public abstract dpj0<E> iterator();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean add(E e) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public AbstractC2919f() {
        }
    }

    public static final class UnmodifiableNavigableSet<E> extends g0j<E> implements NavigableSet<E>, Serializable {
        private static final long serialVersionUID = 0;
        private final NavigableSet<E> delegate;
        private transient UnmodifiableNavigableSet<E> descendingSet;
        private final SortedSet<E> unmodifiableDelegate;

        public UnmodifiableNavigableSet(NavigableSet<E> navigableSet) {
            this.delegate = (NavigableSet) sf80.m183894p(navigableSet);
            this.unmodifiableDelegate = Collections.unmodifiableSortedSet(navigableSet);
        }

        @Override // java.util.NavigableSet
        public E ceiling(E e) {
            return this.delegate.ceiling(e);
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return Iterators.m15870C(this.delegate.descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            UnmodifiableNavigableSet<E> unmodifiableNavigableSet = this.descendingSet;
            if (unmodifiableNavigableSet != null) {
                return unmodifiableNavigableSet;
            }
            UnmodifiableNavigableSet<E> unmodifiableNavigableSet2 = new UnmodifiableNavigableSet<>(this.delegate.descendingSet());
            this.descendingSet = unmodifiableNavigableSet2;
            unmodifiableNavigableSet2.descendingSet = this;
            return unmodifiableNavigableSet2;
        }

        @Override // java.util.NavigableSet
        public E floor(E e) {
            return this.delegate.floor(e);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(E e, boolean z) {
            return Sets.m16128m(this.delegate.headSet(e, z));
        }

        @Override // java.util.NavigableSet
        public E higher(E e) {
            return this.delegate.higher(e);
        }

        @Override // java.util.NavigableSet
        public E lower(E e) {
            return this.delegate.lower(e);
        }

        @Override // java.util.NavigableSet
        public E pollFirst() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableSet
        public E pollLast() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(E e, boolean z, E e2, boolean z2) {
            return Sets.m16128m(this.delegate.subSet(e, z, e2, z2));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(E e, boolean z) {
            return Sets.m16128m(this.delegate.tailSet(e, z));
        }

        @Override // p149l.g0j, p149l.e0j, p149l.qzi, p149l.a0j
        public SortedSet<E> delegate() {
            return this.unmodifiableDelegate;
        }
    }
}
