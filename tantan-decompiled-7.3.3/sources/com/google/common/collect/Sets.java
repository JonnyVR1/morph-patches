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
import p153l.b3j;
import p153l.gyj0;
import p153l.tp80;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
public final class Sets {

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: com.google.common.collect.Sets$a */
    public class C2937a<E> extends AbstractC2942f<E> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Set f11127a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Set f11128b;

        /* JADX INFO: renamed from: com.google.common.collect.Sets$a$a */
        public class a extends AbstractIterator<E> {

            /* JADX INFO: renamed from: c */
            public final Iterator<? extends E> f11129c;

            /* JADX INFO: renamed from: d */
            public final Iterator<? extends E> f11130d;

            public a() {
                this.f11129c = C2937a.this.f11127a.iterator();
                this.f11130d = C2937a.this.f11128b.iterator();
            }

            @Override // com.google.common.collect.AbstractIterator
            /* JADX INFO: renamed from: a */
            public E mo15619a() {
                if (this.f11129c.hasNext()) {
                    return this.f11129c.next();
                }
                while (this.f11130d.hasNext()) {
                    E next = this.f11130d.next();
                    if (!C2937a.this.f11127a.contains(next)) {
                        return next;
                    }
                }
                return m15620b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2937a(Set set, Set set2) {
            super(null);
            this.f11127a = set;
            this.f11128b = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public gyj0<E> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f11127a.contains(obj) || this.f11128b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f11127a.isEmpty() && this.f11128b.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            int size = this.f11127a.size();
            Iterator<E> it = this.f11128b.iterator();
            while (it.hasNext()) {
                if (!this.f11127a.contains(it.next())) {
                    size++;
                }
            }
            return size;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: com.google.common.collect.Sets$b */
    public class C2938b<E> extends AbstractC2942f<E> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Set f11132a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Set f11133b;

        /* JADX INFO: renamed from: com.google.common.collect.Sets$b$a */
        public class a extends AbstractIterator<E> {

            /* JADX INFO: renamed from: c */
            public final Iterator<E> f11134c;

            public a() {
                this.f11134c = C2938b.this.f11132a.iterator();
            }

            @Override // com.google.common.collect.AbstractIterator
            /* JADX INFO: renamed from: a */
            public E mo15619a() {
                while (this.f11134c.hasNext()) {
                    E next = this.f11134c.next();
                    if (C2938b.this.f11133b.contains(next)) {
                        return next;
                    }
                }
                return m15620b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2938b(Set set, Set set2) {
            super(null);
            this.f11132a = set;
            this.f11133b = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: a */
        public gyj0<E> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f11132a.contains(obj) && this.f11133b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return this.f11132a.containsAll(collection) && this.f11133b.containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return Collections.disjoint(this.f11133b, this.f11132a);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator<E> it = this.f11132a.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (this.f11133b.contains(it.next())) {
                    i++;
                }
            }
            return i;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Sets$c */
    public static class C2939c<E> extends C2991g.a<E> implements Set<E> {
        public C2939c(Set<E> set, tp80<? super E> tp80Var) {
            super(set, tp80Var);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return Sets.m16170a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return Sets.m16173d(this);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Sets$d */
    public static class C2940d<E> extends C2939c<E> implements SortedSet<E> {
        public C2940d(SortedSet<E> sortedSet, tp80<? super E> tp80Var) {
            super(sortedSet, tp80Var);
        }

        @Override // java.util.SortedSet
        public Comparator<? super E> comparator() {
            return ((SortedSet) this.f11237a).comparator();
        }

        @Override // java.util.SortedSet
        public E first() {
            return (E) Iterators.m15937m(this.f11237a.iterator(), this.f11238b);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> headSet(E e) {
            return new C2940d(((SortedSet) this.f11237a).headSet(e), this.f11238b);
        }

        @Override // java.util.SortedSet
        public E last() {
            SortedSet sortedSetHeadSet = (SortedSet) this.f11237a;
            while (true) {
                E e = (Object) sortedSetHeadSet.last();
                if (this.f11238b.apply(e)) {
                    return e;
                }
                sortedSetHeadSet = sortedSetHeadSet.headSet(e);
            }
        }

        @Override // java.util.SortedSet
        public SortedSet<E> subSet(E e, E e2) {
            return new C2940d(((SortedSet) this.f11237a).subSet(e, e2), this.f11238b);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> tailSet(E e) {
            return new C2940d(((SortedSet) this.f11237a).tailSet(e), this.f11238b);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Sets$e */
    public static abstract class AbstractC2941e<E> extends AbstractSet<E> {
        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return Sets.m16179j(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return super.retainAll((Collection) xn80.m212111p(collection));
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m16170a(Set<?> set, Object obj) {
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
    public static <E> Set<E> m16171b(Set<E> set, tp80<? super E> tp80Var) {
        if (set instanceof SortedSet) {
            return m16172c((SortedSet) set, tp80Var);
        }
        if (!(set instanceof C2939c)) {
            return new C2939c((Set) xn80.m212111p(set), (tp80) xn80.m212111p(tp80Var));
        }
        C2939c c2939c = (C2939c) set;
        return new C2939c((Set) c2939c.f11237a, Predicates.m15470c(c2939c.f11238b, tp80Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static <E> SortedSet<E> m16172c(SortedSet<E> sortedSet, tp80<? super E> tp80Var) {
        if (!(sortedSet instanceof C2939c)) {
            return new C2940d((SortedSet) xn80.m212111p(sortedSet), (tp80) xn80.m212111p(tp80Var));
        }
        C2939c c2939c = (C2939c) sortedSet;
        return new C2940d((SortedSet) c2939c.f11237a, Predicates.m15470c(c2939c.f11238b, tp80Var));
    }

    /* JADX INFO: renamed from: d */
    public static int m16173d(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    /* JADX INFO: renamed from: e */
    public static <E> AbstractC2942f<E> m16174e(Set<E> set, Set<?> set2) {
        xn80.m212112q(set, "set1");
        xn80.m212112q(set2, "set2");
        return new C2938b(set, set2);
    }

    /* JADX INFO: renamed from: f */
    public static <E> HashSet<E> m16175f() {
        return new HashSet<>();
    }

    /* JADX INFO: renamed from: g */
    public static <E> HashSet<E> m16176g(int i) {
        return new HashSet<>(Maps.m16084e(i));
    }

    /* JADX INFO: renamed from: h */
    public static <E> Set<E> m16177h() {
        return Collections.newSetFromMap(Maps.m16097r());
    }

    /* JADX INFO: renamed from: i */
    public static <E> LinkedHashSet<E> m16178i() {
        return new LinkedHashSet<>();
    }

    /* JADX INFO: renamed from: j */
    public static boolean m16179j(Set<?> set, Collection<?> collection) {
        xn80.m212111p(collection);
        if (collection instanceof InterfaceC2995k) {
            collection = ((InterfaceC2995k) collection).elementSet();
        }
        return (!(collection instanceof Set) || collection.size() <= set.size()) ? m16180k(set, collection.iterator()) : Iterators.m15946v(set.iterator(), collection);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m16180k(Set<?> set, Iterator<?> it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }

    /* JADX INFO: renamed from: l */
    public static <E> AbstractC2942f<E> m16181l(Set<? extends E> set, Set<? extends E> set2) {
        xn80.m212112q(set, "set1");
        xn80.m212112q(set2, "set2");
        return new C2937a(set, set2);
    }

    /* JADX INFO: renamed from: m */
    public static <E> NavigableSet<E> m16182m(NavigableSet<E> navigableSet) {
        return ((navigableSet instanceof ImmutableCollection) || (navigableSet instanceof UnmodifiableNavigableSet)) ? navigableSet : new UnmodifiableNavigableSet(navigableSet);
    }

    /* JADX INFO: renamed from: com.google.common.collect.Sets$f */
    public static abstract class AbstractC2942f<E> extends AbstractSet<E> {
        public /* synthetic */ AbstractC2942f(C2937a c2937a) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public abstract gyj0<E> iterator();

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

        public AbstractC2942f() {
        }
    }

    public static final class UnmodifiableNavigableSet<E> extends b3j<E> implements NavigableSet<E>, Serializable {
        private static final long serialVersionUID = 0;
        private final NavigableSet<E> delegate;
        private transient UnmodifiableNavigableSet<E> descendingSet;
        private final SortedSet<E> unmodifiableDelegate;

        public UnmodifiableNavigableSet(NavigableSet<E> navigableSet) {
            this.delegate = (NavigableSet) xn80.m212111p(navigableSet);
            this.unmodifiableDelegate = Collections.unmodifiableSortedSet(navigableSet);
        }

        @Override // java.util.NavigableSet
        public E ceiling(E e) {
            return this.delegate.ceiling(e);
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return Iterators.m15924C(this.delegate.descendingIterator());
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
            return Sets.m16182m(this.delegate.headSet(e, z));
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
            return Sets.m16182m(this.delegate.subSet(e, z, e2, z2));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(E e, boolean z) {
            return Sets.m16182m(this.delegate.tailSet(e, z));
        }

        @Override // p153l.b3j, p153l.z2j, p153l.l2j, p153l.v2j
        public SortedSet<E> delegate() {
            return this.unmodifiableDelegate;
        }
    }
}
