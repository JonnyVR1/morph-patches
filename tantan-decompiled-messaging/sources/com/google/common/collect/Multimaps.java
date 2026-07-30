package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import p149l.bm10;
import p149l.gaj;
import p149l.lmr;
import p149l.rle0;
import p149l.s7j0;
import p149l.sd5;
import p149l.sf80;
import p149l.tlf0;
import p149l.tyg0;
import p149l.vu40;
import p149l.ymr;
import p149l.zzi;

/* JADX INFO: loaded from: classes7.dex */
public final class Multimaps {

    public static class CustomListMultimap<K, V> extends AbstractListMultimap<K, V> {
        private static final long serialVersionUID = 0;
        transient tyg0<? extends List<V>> factory;

        public CustomListMultimap(Map<K, Collection<V>> map, tyg0<? extends List<V>> tyg0Var) {
            super(map);
            this.factory = (tyg0) sf80.m183894p(tyg0Var);
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.factory = (tyg0) objectInputStream.readObject();
            setMap((Map) objectInputStream.readObject());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.factory);
            objectOutputStream.writeObject(backingMap());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractC2962a
        public Map<K, Collection<V>> createAsMap() {
            return createMaybeNavigableAsMap();
        }

        @Override // com.google.common.collect.AbstractListMultimap, com.google.common.collect.AbstractMapBasedMultimap
        public List<V> createCollection() {
            return this.factory.get();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractC2962a
        public Set<K> createKeySet() {
            return createMaybeNavigableKeySet();
        }
    }

    public static class CustomMultimap<K, V> extends AbstractMapBasedMultimap<K, V> {
        private static final long serialVersionUID = 0;
        transient tyg0<? extends Collection<V>> factory;

        public CustomMultimap(Map<K, Collection<V>> map, tyg0<? extends Collection<V>> tyg0Var) {
            super(map);
            this.factory = (tyg0) sf80.m183894p(tyg0Var);
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.factory = (tyg0) objectInputStream.readObject();
            setMap((Map) objectInputStream.readObject());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.factory);
            objectOutputStream.writeObject(backingMap());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractC2962a
        public Map<K, Collection<V>> createAsMap() {
            return createMaybeNavigableAsMap();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap
        public Collection<V> createCollection() {
            return this.factory.get();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractC2962a
        public Set<K> createKeySet() {
            return createMaybeNavigableKeySet();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap
        public <E> Collection<E> unmodifiableCollectionSubclass(Collection<E> collection) {
            if (collection instanceof NavigableSet) {
                return Sets.m16128m((NavigableSet) collection);
            }
            if (collection instanceof SortedSet) {
                return Collections.unmodifiableSortedSet((SortedSet) collection);
            }
            if (collection instanceof Set) {
                return Collections.unmodifiableSet((Set) collection);
            }
            return collection instanceof List ? Collections.unmodifiableList((List) collection) : Collections.unmodifiableCollection(collection);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap
        public Collection<V> wrapCollection(K k, Collection<V> collection) {
            if (collection instanceof List) {
                return wrapList(k, (List) collection, null);
            }
            if (collection instanceof NavigableSet) {
                return new AbstractMapBasedMultimap.C2731m(k, (NavigableSet) collection, null);
            }
            if (collection instanceof SortedSet) {
                return new AbstractMapBasedMultimap.C2733o(k, (SortedSet) collection, null);
            }
            return collection instanceof Set ? new AbstractMapBasedMultimap.C2732n(k, (Set) collection) : new AbstractMapBasedMultimap.C2729k(k, collection, null);
        }
    }

    public static class CustomSetMultimap<K, V> extends AbstractSetMultimap<K, V> {
        private static final long serialVersionUID = 0;
        transient tyg0<? extends Set<V>> factory;

        public CustomSetMultimap(Map<K, Collection<V>> map, tyg0<? extends Set<V>> tyg0Var) {
            super(map);
            this.factory = (tyg0) sf80.m183894p(tyg0Var);
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.factory = (tyg0) objectInputStream.readObject();
            setMap((Map) objectInputStream.readObject());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.factory);
            objectOutputStream.writeObject(backingMap());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractC2962a
        public Map<K, Collection<V>> createAsMap() {
            return createMaybeNavigableAsMap();
        }

        @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
        public Set<V> createCollection() {
            return this.factory.get();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractC2962a
        public Set<K> createKeySet() {
            return createMaybeNavigableKeySet();
        }

        @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
        public <E> Collection<E> unmodifiableCollectionSubclass(Collection<E> collection) {
            if (collection instanceof NavigableSet) {
                return Sets.m16128m((NavigableSet) collection);
            }
            return collection instanceof SortedSet ? Collections.unmodifiableSortedSet((SortedSet) collection) : Collections.unmodifiableSet((Set) collection);
        }

        @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
        public Collection<V> wrapCollection(K k, Collection<V> collection) {
            if (collection instanceof NavigableSet) {
                return new AbstractMapBasedMultimap.C2731m(k, (NavigableSet) collection, null);
            }
            return collection instanceof SortedSet ? new AbstractMapBasedMultimap.C2733o(k, (SortedSet) collection, null) : new AbstractMapBasedMultimap.C2732n(k, (Set) collection);
        }
    }

    public static class CustomSortedSetMultimap<K, V> extends AbstractSortedSetMultimap<K, V> {
        private static final long serialVersionUID = 0;
        transient tyg0<? extends SortedSet<V>> factory;
        transient Comparator<? super V> valueComparator;

        public CustomSortedSetMultimap(Map<K, Collection<V>> map, tyg0<? extends SortedSet<V>> tyg0Var) {
            super(map);
            this.factory = (tyg0) sf80.m183894p(tyg0Var);
            this.valueComparator = tyg0Var.get().comparator();
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            tyg0<? extends SortedSet<V>> tyg0Var = (tyg0) objectInputStream.readObject();
            this.factory = tyg0Var;
            this.valueComparator = tyg0Var.get().comparator();
            setMap((Map) objectInputStream.readObject());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.factory);
            objectOutputStream.writeObject(backingMap());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractC2962a
        public Map<K, Collection<V>> createAsMap() {
            return createMaybeNavigableAsMap();
        }

        @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
        public SortedSet<V> createCollection() {
            return this.factory.get();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractC2962a
        public Set<K> createKeySet() {
            return createMaybeNavigableKeySet();
        }

        @Override // com.google.common.collect.AbstractSortedSetMultimap, p149l.tlf0
        public Comparator<? super V> valueComparator() {
            return this.valueComparator;
        }
    }

    public static class UnmodifiableListMultimap<K, V> extends UnmodifiableMultimap<K, V> implements ymr<K, V> {
        private static final long serialVersionUID = 0;

        public UnmodifiableListMultimap(ymr<K, V> ymrVar) {
            super(ymrVar);
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, p149l.zzi, p149l.a0j
        public ymr<K, V> delegate() {
            return (ymr) super.delegate();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, p149l.zzi, p149l.bm10, p149l.ymr
        public List<V> get(K k) {
            return Collections.unmodifiableList(delegate().get((Object) k));
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, p149l.zzi, p149l.bm10, p149l.ymr
        public List<V> removeAll(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, p149l.zzi, p149l.bm10, p149l.ymr
        public List<V> replaceValues(K k, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }
    }

    public static class UnmodifiableSetMultimap<K, V> extends UnmodifiableMultimap<K, V> implements rle0<K, V> {
        private static final long serialVersionUID = 0;

        public UnmodifiableSetMultimap(rle0<K, V> rle0Var) {
            super(rle0Var);
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, p149l.zzi, p149l.a0j
        public rle0<K, V> delegate() {
            return (rle0) super.delegate();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, p149l.zzi, p149l.bm10
        public Set<Map.Entry<K, V>> entries() {
            return Maps.m16019H(delegate().entries());
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, p149l.zzi, p149l.bm10, p149l.ymr
        public Set<V> get(K k) {
            return Collections.unmodifiableSet(delegate().get((Object) k));
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, p149l.zzi, p149l.bm10, p149l.ymr
        public Set<V> removeAll(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, p149l.zzi, p149l.bm10, p149l.ymr
        public Set<V> replaceValues(K k, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }
    }

    public static class UnmodifiableSortedSetMultimap<K, V> extends UnmodifiableSetMultimap<K, V> implements tlf0<K, V> {
        private static final long serialVersionUID = 0;

        public UnmodifiableSortedSetMultimap(tlf0<K, V> tlf0Var) {
            super(tlf0Var);
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, p149l.zzi, p149l.a0j
        public tlf0<K, V> delegate() {
            return (tlf0) super.delegate();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, p149l.zzi, p149l.bm10, p149l.ymr
        public SortedSet<V> get(K k) {
            return Collections.unmodifiableSortedSet(delegate().get((Object) k));
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, p149l.zzi, p149l.bm10, p149l.ymr
        public SortedSet<V> removeAll(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, p149l.zzi, p149l.bm10, p149l.ymr
        public SortedSet<V> replaceValues(K k, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // p149l.tlf0
        public Comparator<? super V> valueComparator() {
            return delegate().valueComparator();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Multimaps$a */
    public static final class C2893a<K, V> extends Maps.AbstractC2886u<K, Collection<V>> {

        /* JADX INFO: renamed from: d */
        public final bm10<K, V> f11069d;

        /* JADX INFO: renamed from: com.google.common.collect.Multimaps$a$a */
        public class a extends Maps.AbstractC2875j<K, Collection<V>> {

            /* JADX INFO: renamed from: com.google.common.collect.Multimaps$a$a$a, reason: collision with other inner class name */
            public class C22677a implements gaj<K, Collection<V>> {
                public C22677a() {
                }

                @Override // p149l.gaj
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public Collection<V> apply(K k) {
                    return C2893a.this.f11069d.get(k);
                }
            }

            public a() {
            }

            @Override // com.google.common.collect.Maps.AbstractC2875j
            /* JADX INFO: renamed from: a */
            public Map<K, Collection<V>> mo15574a() {
                return C2893a.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return Maps.m16029d(C2893a.this.f11069d.keySet(), new C22677a());
            }

            @Override // com.google.common.collect.Maps.AbstractC2875j, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                C2893a.this.m16086g(entry.getKey());
                return true;
            }
        }

        public C2893a(bm10<K, V> bm10Var) {
            this.f11069d = (bm10) sf80.m183894p(bm10Var);
        }

        @Override // com.google.common.collect.Maps.AbstractC2886u
        /* JADX INFO: renamed from: a */
        public Set<Map.Entry<K, Collection<V>>> mo15570a() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f11069d.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.f11069d.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Collection<V> get(Object obj) {
            if (containsKey(obj)) {
                return this.f11069d.get(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Collection<V> remove(Object obj) {
            if (containsKey(obj)) {
                return this.f11069d.removeAll(obj);
            }
            return null;
        }

        /* JADX INFO: renamed from: g */
        public void m16086g(Object obj) {
            this.f11069d.keySet().remove(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return this.f11069d.isEmpty();
        }

        @Override // com.google.common.collect.Maps.AbstractC2886u, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: keySet */
        public Set<K> mo15578h() {
            return this.f11069d.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f11069d.keySet().size();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Multimaps$b */
    public static abstract class AbstractC2894b<K, V> extends AbstractCollection<Map.Entry<K, V>> {
        /* JADX INFO: renamed from: a */
        public abstract bm10<K, V> mo16088a();

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            mo16088a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return mo16088a().containsEntry(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return mo16088a().remove(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return mo16088a().size();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Multimaps$c */
    public static class C2895c<K, V> extends AbstractC2963b<K> {

        /* JADX INFO: renamed from: a */
        public final bm10<K, V> f11072a;

        /* JADX INFO: renamed from: com.google.common.collect.Multimaps$c$a */
        public class a extends s7j0<Map.Entry<K, Collection<V>>, InterfaceC2972k.a<K>> {

            /* JADX INFO: renamed from: com.google.common.collect.Multimaps$c$a$a, reason: collision with other inner class name */
            public class C22678a extends Multisets.AbstractC2897b<K> {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ Map.Entry f11073a;

                public C22678a(a aVar, Map.Entry entry) {
                    this.f11073a = entry;
                }

                @Override // com.google.common.collect.InterfaceC2972k.a
                public int getCount() {
                    return ((Collection) this.f11073a.getValue()).size();
                }

                @Override // com.google.common.collect.InterfaceC2972k.a
                public K getElement() {
                    return (K) this.f11073a.getKey();
                }
            }

            public a(C2895c c2895c, Iterator it) {
                super(it);
            }

            @Override // p149l.s7j0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public InterfaceC2972k.a<K> mo15897a(Map.Entry<K, Collection<V>> entry) {
                return new C22678a(this, entry);
            }
        }

        public C2895c(bm10<K, V> bm10Var) {
            this.f11072a = bm10Var;
        }

        @Override // com.google.common.collect.AbstractC2963b, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.f11072a.clear();
        }

        @Override // com.google.common.collect.AbstractC2963b, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.InterfaceC2972k
        public boolean contains(Object obj) {
            return this.f11072a.containsKey(obj);
        }

        @Override // com.google.common.collect.InterfaceC2972k
        public int count(Object obj) {
            Collection collection = (Collection) Maps.m16049x(this.f11072a.asMap(), obj);
            if (collection == null) {
                return 0;
            }
            return collection.size();
        }

        @Override // com.google.common.collect.AbstractC2963b
        public int distinctElements() {
            return this.f11072a.asMap().size();
        }

        @Override // com.google.common.collect.AbstractC2963b
        public Iterator<K> elementIterator() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.AbstractC2963b, com.google.common.collect.InterfaceC2972k
        public Set<K> elementSet() {
            return this.f11072a.keySet();
        }

        @Override // com.google.common.collect.AbstractC2963b
        public Iterator<InterfaceC2972k.a<K>> entryIterator() {
            return new a(this, this.f11072a.asMap().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.InterfaceC2972k
        public Iterator<K> iterator() {
            return Maps.m16038m(this.f11072a.entries().iterator());
        }

        @Override // com.google.common.collect.AbstractC2963b, com.google.common.collect.InterfaceC2972k
        public int remove(Object obj, int i) {
            sd5.m183444b(i, "occurrences");
            if (i == 0) {
                return count(obj);
            }
            Collection collection = (Collection) Maps.m16049x(this.f11072a.asMap(), obj);
            if (collection == null) {
                return 0;
            }
            int size = collection.size();
            if (i >= size) {
                collection.clear();
                return size;
            }
            Iterator it = collection.iterator();
            for (int i2 = 0; i2 < i; i2++) {
                it.next();
                it.remove();
            }
            return size;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.InterfaceC2972k
        public int size() {
            return this.f11072a.size();
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m16078c(bm10<?, ?> bm10Var, Object obj) {
        if (obj == bm10Var) {
            return true;
        }
        if (obj instanceof bm10) {
            return bm10Var.asMap().equals(((bm10) obj).asMap());
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static <K, V> ymr<K, V> m16079d(Map<K, Collection<V>> map, tyg0<? extends List<V>> tyg0Var) {
        return new CustomListMultimap(map, tyg0Var);
    }

    /* JADX INFO: renamed from: e */
    public static <K, V> Collection<Map.Entry<K, V>> m16080e(Collection<Map.Entry<K, V>> collection) {
        return collection instanceof Set ? Maps.m16019H((Set) collection) : new Maps.C2883r(Collections.unmodifiableCollection(collection));
    }

    /* JADX INFO: renamed from: f */
    public static <V> Collection<V> m16081f(Collection<V> collection) {
        if (collection instanceof SortedSet) {
            return Collections.unmodifiableSortedSet((SortedSet) collection);
        }
        if (collection instanceof Set) {
            return Collections.unmodifiableSet((Set) collection);
        }
        return collection instanceof List ? Collections.unmodifiableList((List) collection) : Collections.unmodifiableCollection(collection);
    }

    public static class UnmodifiableMultimap<K, V> extends zzi<K, V> implements Serializable {
        private static final long serialVersionUID = 0;
        final bm10<K, V> delegate;
        transient Collection<Map.Entry<K, V>> entries;
        transient Set<K> keySet;
        transient InterfaceC2972k<K> keys;
        transient Map<K, Collection<V>> map;
        transient Collection<V> values;

        /* JADX INFO: renamed from: com.google.common.collect.Multimaps$UnmodifiableMultimap$a */
        public class C2892a implements gaj<Collection<V>, Collection<V>> {
            public C2892a(UnmodifiableMultimap unmodifiableMultimap) {
            }

            @Override // p149l.gaj
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Collection<V> apply(Collection<V> collection) {
                return Multimaps.m16081f(collection);
            }
        }

        public UnmodifiableMultimap(bm10<K, V> bm10Var) {
            this.delegate = (bm10) sf80.m183894p(bm10Var);
        }

        @Override // p149l.zzi, p149l.bm10
        public Map<K, Collection<V>> asMap() {
            Map<K, Collection<V>> map = this.map;
            if (map != null) {
                return map;
            }
            Map<K, Collection<V>> mapUnmodifiableMap = Collections.unmodifiableMap(Maps.m16015D(this.delegate.asMap(), new C2892a(this)));
            this.map = mapUnmodifiableMap;
            return mapUnmodifiableMap;
        }

        @Override // p149l.zzi, p149l.bm10
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // p149l.zzi, p149l.bm10
        public Collection<Map.Entry<K, V>> entries() {
            Collection<Map.Entry<K, V>> collection = this.entries;
            if (collection != null) {
                return collection;
            }
            Collection<Map.Entry<K, V>> collectionM16080e = Multimaps.m16080e(this.delegate.entries());
            this.entries = collectionM16080e;
            return collectionM16080e;
        }

        @Override // p149l.zzi, p149l.bm10, p149l.ymr
        public Collection<V> get(K k) {
            return Multimaps.m16081f(this.delegate.get(k));
        }

        @Override // p149l.zzi, p149l.bm10
        public Set<K> keySet() {
            Set<K> set = this.keySet;
            if (set != null) {
                return set;
            }
            Set<K> setUnmodifiableSet = Collections.unmodifiableSet(this.delegate.keySet());
            this.keySet = setUnmodifiableSet;
            return setUnmodifiableSet;
        }

        @Override // p149l.zzi, p149l.bm10
        public InterfaceC2972k<K> keys() {
            InterfaceC2972k<K> interfaceC2972k = this.keys;
            if (interfaceC2972k != null) {
                return interfaceC2972k;
            }
            InterfaceC2972k<K> interfaceC2972kM16104o = Multisets.m16104o(this.delegate.keys());
            this.keys = interfaceC2972kM16104o;
            return interfaceC2972kM16104o;
        }

        @Override // p149l.zzi, p149l.bm10
        public boolean put(K k, V v2) {
            throw new UnsupportedOperationException();
        }

        @Override // p149l.zzi, p149l.bm10
        public boolean putAll(K k, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // p149l.zzi, p149l.bm10
        public boolean remove(Object obj, Object obj2) {
            throw new UnsupportedOperationException();
        }

        @Override // p149l.zzi, p149l.bm10, p149l.ymr
        public Collection<V> removeAll(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // p149l.zzi, p149l.bm10, p149l.ymr
        public Collection<V> replaceValues(K k, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // p149l.zzi, p149l.bm10
        public Collection<V> values() {
            Collection<V> collection = this.values;
            if (collection != null) {
                return collection;
            }
            Collection<V> collectionUnmodifiableCollection = Collections.unmodifiableCollection(this.delegate.values());
            this.values = collectionUnmodifiableCollection;
            return collectionUnmodifiableCollection;
        }

        @Override // p149l.zzi, p149l.a0j
        public bm10<K, V> delegate() {
            return this.delegate;
        }

        @Override // p149l.zzi, p149l.bm10
        public boolean putAll(bm10<? extends K, ? extends V> bm10Var) {
            throw new UnsupportedOperationException();
        }
    }

    public static class MapMultimap<K, V> extends AbstractC2962a<K, V> implements rle0<K, V>, Serializable {
        private static final long serialVersionUID = 7845222491160860175L;
        final Map<K, V> map;

        /* JADX INFO: renamed from: com.google.common.collect.Multimaps$MapMultimap$a */
        public class C2891a extends Sets.AbstractC2918e<V> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Object f11065a;

            /* JADX INFO: renamed from: com.google.common.collect.Multimaps$MapMultimap$a$a */
            public class a implements Iterator<V> {

                /* JADX INFO: renamed from: a */
                public int f11067a;

                public a() {
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    if (this.f11067a != 0) {
                        return false;
                    }
                    C2891a c2891a = C2891a.this;
                    return MapMultimap.this.map.containsKey(c2891a.f11065a);
                }

                @Override // java.util.Iterator
                public V next() {
                    if (!hasNext()) {
                        lmr.m150601a();
                        return null;
                    }
                    this.f11067a++;
                    C2891a c2891a = C2891a.this;
                    return (V) vu40.m200060a(MapMultimap.this.map.get(c2891a.f11065a));
                }

                @Override // java.util.Iterator
                public void remove() {
                    sd5.m183447e(this.f11067a == 1);
                    this.f11067a = -1;
                    C2891a c2891a = C2891a.this;
                    MapMultimap.this.map.remove(c2891a.f11065a);
                }
            }

            public C2891a(Object obj) {
                this.f11065a = obj;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<V> iterator() {
                return new a();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return MapMultimap.this.map.containsKey(this.f11065a) ? 1 : 0;
            }
        }

        public MapMultimap(Map<K, V> map) {
            this.map = (Map) sf80.m183894p(map);
        }

        @Override // p149l.bm10
        public void clear() {
            this.map.clear();
        }

        @Override // com.google.common.collect.AbstractC2962a, p149l.bm10
        public boolean containsEntry(Object obj, Object obj2) {
            return this.map.entrySet().contains(Maps.m16035j(obj, obj2));
        }

        @Override // p149l.bm10
        public boolean containsKey(Object obj) {
            return this.map.containsKey(obj);
        }

        @Override // com.google.common.collect.AbstractC2962a, p149l.bm10
        public boolean containsValue(Object obj) {
            return this.map.containsValue(obj);
        }

        @Override // com.google.common.collect.AbstractC2962a
        public Map<K, Collection<V>> createAsMap() {
            return new C2893a(this);
        }

        @Override // com.google.common.collect.AbstractC2962a
        public Collection<Map.Entry<K, V>> createEntries() {
            throw new AssertionError("unreachable");
        }

        @Override // com.google.common.collect.AbstractC2962a
        public Set<K> createKeySet() {
            return this.map.keySet();
        }

        @Override // com.google.common.collect.AbstractC2962a
        public InterfaceC2972k<K> createKeys() {
            return new C2895c(this);
        }

        @Override // com.google.common.collect.AbstractC2962a
        public Collection<V> createValues() {
            return this.map.values();
        }

        @Override // com.google.common.collect.AbstractC2962a, p149l.bm10
        public Set<Map.Entry<K, V>> entries() {
            return this.map.entrySet();
        }

        @Override // com.google.common.collect.AbstractC2962a
        public Iterator<Map.Entry<K, V>> entryIterator() {
            return this.map.entrySet().iterator();
        }

        @Override // p149l.bm10, p149l.ymr
        public Set<V> get(K k) {
            return new C2891a(k);
        }

        @Override // com.google.common.collect.AbstractC2962a, p149l.bm10
        public int hashCode() {
            return this.map.hashCode();
        }

        @Override // com.google.common.collect.AbstractC2962a, p149l.bm10
        public boolean put(K k, V v2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractC2962a, p149l.bm10
        public boolean putAll(K k, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractC2962a, p149l.bm10
        public boolean remove(Object obj, Object obj2) {
            return this.map.entrySet().remove(Maps.m16035j(obj, obj2));
        }

        @Override // p149l.bm10, p149l.ymr
        public Set<V> removeAll(Object obj) {
            HashSet hashSet = new HashSet(2);
            if (!this.map.containsKey(obj)) {
                return hashSet;
            }
            hashSet.add(this.map.remove(obj));
            return hashSet;
        }

        @Override // com.google.common.collect.AbstractC2962a, p149l.bm10, p149l.ymr
        public Set<V> replaceValues(K k, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // p149l.bm10
        public int size() {
            return this.map.size();
        }

        @Override // com.google.common.collect.AbstractC2962a, p149l.bm10
        public boolean putAll(bm10<? extends K, ? extends V> bm10Var) {
            throw new UnsupportedOperationException();
        }
    }
}
