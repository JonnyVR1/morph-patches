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
import p153l.adj;
import p153l.b7h0;
import p153l.cuf0;
import p153l.ju10;
import p153l.k350;
import p153l.mor;
import p153l.se5;
import p153l.u2j;
import p153l.wgj0;
import p153l.wte0;
import p153l.xn80;
import p153l.zor;

/* JADX INFO: loaded from: classes7.dex */
public final class Multimaps {

    public static class CustomListMultimap<K, V> extends AbstractListMultimap<K, V> {
        private static final long serialVersionUID = 0;
        transient b7h0<? extends List<V>> factory;

        public CustomListMultimap(Map<K, Collection<V>> map, b7h0<? extends List<V>> b7h0Var) {
            super(map);
            this.factory = (b7h0) xn80.m212111p(b7h0Var);
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.factory = (b7h0) objectInputStream.readObject();
            setMap((Map) objectInputStream.readObject());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.factory);
            objectOutputStream.writeObject(backingMap());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractC2985a
        public Map<K, Collection<V>> createAsMap() {
            return createMaybeNavigableAsMap();
        }

        @Override // com.google.common.collect.AbstractListMultimap, com.google.common.collect.AbstractMapBasedMultimap
        public List<V> createCollection() {
            return this.factory.get();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractC2985a
        public Set<K> createKeySet() {
            return createMaybeNavigableKeySet();
        }
    }

    public static class CustomMultimap<K, V> extends AbstractMapBasedMultimap<K, V> {
        private static final long serialVersionUID = 0;
        transient b7h0<? extends Collection<V>> factory;

        public CustomMultimap(Map<K, Collection<V>> map, b7h0<? extends Collection<V>> b7h0Var) {
            super(map);
            this.factory = (b7h0) xn80.m212111p(b7h0Var);
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.factory = (b7h0) objectInputStream.readObject();
            setMap((Map) objectInputStream.readObject());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.factory);
            objectOutputStream.writeObject(backingMap());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractC2985a
        public Map<K, Collection<V>> createAsMap() {
            return createMaybeNavigableAsMap();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap
        public Collection<V> createCollection() {
            return this.factory.get();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractC2985a
        public Set<K> createKeySet() {
            return createMaybeNavigableKeySet();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap
        public <E> Collection<E> unmodifiableCollectionSubclass(Collection<E> collection) {
            if (collection instanceof NavigableSet) {
                return Sets.m16182m((NavigableSet) collection);
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
                return new AbstractMapBasedMultimap.C2754m(k, (NavigableSet) collection, null);
            }
            if (collection instanceof SortedSet) {
                return new AbstractMapBasedMultimap.C2756o(k, (SortedSet) collection, null);
            }
            return collection instanceof Set ? new AbstractMapBasedMultimap.C2755n(k, (Set) collection) : new AbstractMapBasedMultimap.C2752k(k, collection, null);
        }
    }

    public static class CustomSetMultimap<K, V> extends AbstractSetMultimap<K, V> {
        private static final long serialVersionUID = 0;
        transient b7h0<? extends Set<V>> factory;

        public CustomSetMultimap(Map<K, Collection<V>> map, b7h0<? extends Set<V>> b7h0Var) {
            super(map);
            this.factory = (b7h0) xn80.m212111p(b7h0Var);
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.factory = (b7h0) objectInputStream.readObject();
            setMap((Map) objectInputStream.readObject());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.factory);
            objectOutputStream.writeObject(backingMap());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractC2985a
        public Map<K, Collection<V>> createAsMap() {
            return createMaybeNavigableAsMap();
        }

        @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
        public Set<V> createCollection() {
            return this.factory.get();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractC2985a
        public Set<K> createKeySet() {
            return createMaybeNavigableKeySet();
        }

        @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
        public <E> Collection<E> unmodifiableCollectionSubclass(Collection<E> collection) {
            if (collection instanceof NavigableSet) {
                return Sets.m16182m((NavigableSet) collection);
            }
            return collection instanceof SortedSet ? Collections.unmodifiableSortedSet((SortedSet) collection) : Collections.unmodifiableSet((Set) collection);
        }

        @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
        public Collection<V> wrapCollection(K k, Collection<V> collection) {
            if (collection instanceof NavigableSet) {
                return new AbstractMapBasedMultimap.C2754m(k, (NavigableSet) collection, null);
            }
            return collection instanceof SortedSet ? new AbstractMapBasedMultimap.C2756o(k, (SortedSet) collection, null) : new AbstractMapBasedMultimap.C2755n(k, (Set) collection);
        }
    }

    public static class CustomSortedSetMultimap<K, V> extends AbstractSortedSetMultimap<K, V> {
        private static final long serialVersionUID = 0;
        transient b7h0<? extends SortedSet<V>> factory;
        transient Comparator<? super V> valueComparator;

        public CustomSortedSetMultimap(Map<K, Collection<V>> map, b7h0<? extends SortedSet<V>> b7h0Var) {
            super(map);
            this.factory = (b7h0) xn80.m212111p(b7h0Var);
            this.valueComparator = b7h0Var.get().comparator();
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            b7h0<? extends SortedSet<V>> b7h0Var = (b7h0) objectInputStream.readObject();
            this.factory = b7h0Var;
            this.valueComparator = b7h0Var.get().comparator();
            setMap((Map) objectInputStream.readObject());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.factory);
            objectOutputStream.writeObject(backingMap());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractC2985a
        public Map<K, Collection<V>> createAsMap() {
            return createMaybeNavigableAsMap();
        }

        @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
        public SortedSet<V> createCollection() {
            return this.factory.get();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractC2985a
        public Set<K> createKeySet() {
            return createMaybeNavigableKeySet();
        }

        @Override // com.google.common.collect.AbstractSortedSetMultimap, p153l.cuf0
        public Comparator<? super V> valueComparator() {
            return this.valueComparator;
        }
    }

    public static class UnmodifiableListMultimap<K, V> extends UnmodifiableMultimap<K, V> implements zor<K, V> {
        private static final long serialVersionUID = 0;

        public UnmodifiableListMultimap(zor<K, V> zorVar) {
            super(zorVar);
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, p153l.u2j, p153l.v2j
        public zor<K, V> delegate() {
            return (zor) super.delegate();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, p153l.u2j, p153l.ju10, p153l.zor
        public List<V> get(K k) {
            return Collections.unmodifiableList(delegate().get((Object) k));
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, p153l.u2j, p153l.ju10, p153l.zor
        public List<V> removeAll(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, p153l.u2j, p153l.ju10, p153l.zor
        public List<V> replaceValues(K k, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }
    }

    public static class UnmodifiableSetMultimap<K, V> extends UnmodifiableMultimap<K, V> implements wte0<K, V> {
        private static final long serialVersionUID = 0;

        public UnmodifiableSetMultimap(wte0<K, V> wte0Var) {
            super(wte0Var);
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, p153l.u2j, p153l.v2j
        public wte0<K, V> delegate() {
            return (wte0) super.delegate();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, p153l.u2j, p153l.ju10
        public Set<Map.Entry<K, V>> entries() {
            return Maps.m16073H(delegate().entries());
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, p153l.u2j, p153l.ju10, p153l.zor
        public Set<V> get(K k) {
            return Collections.unmodifiableSet(delegate().get((Object) k));
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, p153l.u2j, p153l.ju10, p153l.zor
        public Set<V> removeAll(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, p153l.u2j, p153l.ju10, p153l.zor
        public Set<V> replaceValues(K k, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }
    }

    public static class UnmodifiableSortedSetMultimap<K, V> extends UnmodifiableSetMultimap<K, V> implements cuf0<K, V> {
        private static final long serialVersionUID = 0;

        public UnmodifiableSortedSetMultimap(cuf0<K, V> cuf0Var) {
            super(cuf0Var);
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, p153l.u2j, p153l.v2j
        public cuf0<K, V> delegate() {
            return (cuf0) super.delegate();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, p153l.u2j, p153l.ju10, p153l.zor
        public SortedSet<V> get(K k) {
            return Collections.unmodifiableSortedSet(delegate().get((Object) k));
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, p153l.u2j, p153l.ju10, p153l.zor
        public SortedSet<V> removeAll(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, p153l.u2j, p153l.ju10, p153l.zor
        public SortedSet<V> replaceValues(K k, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // p153l.cuf0
        public Comparator<? super V> valueComparator() {
            return delegate().valueComparator();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Multimaps$a */
    public static final class C2916a<K, V> extends Maps.AbstractC2909u<K, Collection<V>> {

        /* JADX INFO: renamed from: d */
        public final ju10<K, V> f11106d;

        /* JADX INFO: renamed from: com.google.common.collect.Multimaps$a$a */
        public class a extends Maps.AbstractC2898j<K, Collection<V>> {

            /* JADX INFO: renamed from: com.google.common.collect.Multimaps$a$a$a, reason: collision with other inner class name */
            public class C22793a implements adj<K, Collection<V>> {
                public C22793a() {
                }

                @Override // p153l.adj
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public Collection<V> apply(K k) {
                    return C2916a.this.f11106d.get(k);
                }
            }

            public a() {
            }

            @Override // com.google.common.collect.Maps.AbstractC2898j
            /* JADX INFO: renamed from: a */
            public Map<K, Collection<V>> mo15628a() {
                return C2916a.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return Maps.m16083d(C2916a.this.f11106d.keySet(), new C22793a());
            }

            @Override // com.google.common.collect.Maps.AbstractC2898j, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                C2916a.this.m16140g(entry.getKey());
                return true;
            }
        }

        public C2916a(ju10<K, V> ju10Var) {
            this.f11106d = (ju10) xn80.m212111p(ju10Var);
        }

        @Override // com.google.common.collect.Maps.AbstractC2909u
        /* JADX INFO: renamed from: a */
        public Set<Map.Entry<K, Collection<V>>> mo15624a() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f11106d.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.f11106d.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Collection<V> get(Object obj) {
            if (containsKey(obj)) {
                return this.f11106d.get(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Collection<V> remove(Object obj) {
            if (containsKey(obj)) {
                return this.f11106d.removeAll(obj);
            }
            return null;
        }

        /* JADX INFO: renamed from: g */
        public void m16140g(Object obj) {
            this.f11106d.keySet().remove(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return this.f11106d.isEmpty();
        }

        @Override // com.google.common.collect.Maps.AbstractC2909u, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: keySet */
        public Set<K> mo15632h() {
            return this.f11106d.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f11106d.keySet().size();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Multimaps$b */
    public static abstract class AbstractC2917b<K, V> extends AbstractCollection<Map.Entry<K, V>> {
        /* JADX INFO: renamed from: a */
        public abstract ju10<K, V> mo16142a();

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            mo16142a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return mo16142a().containsEntry(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return mo16142a().remove(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return mo16142a().size();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Multimaps$c */
    public static class C2918c<K, V> extends AbstractC2986b<K> {

        /* JADX INFO: renamed from: a */
        public final ju10<K, V> f11109a;

        /* JADX INFO: renamed from: com.google.common.collect.Multimaps$c$a */
        public class a extends wgj0<Map.Entry<K, Collection<V>>, InterfaceC2995k.a<K>> {

            /* JADX INFO: renamed from: com.google.common.collect.Multimaps$c$a$a, reason: collision with other inner class name */
            public class C22794a extends Multisets.AbstractC2920b<K> {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ Map.Entry f11110a;

                public C22794a(a aVar, Map.Entry entry) {
                    this.f11110a = entry;
                }

                @Override // com.google.common.collect.InterfaceC2995k.a
                public int getCount() {
                    return ((Collection) this.f11110a.getValue()).size();
                }

                @Override // com.google.common.collect.InterfaceC2995k.a
                public K getElement() {
                    return (K) this.f11110a.getKey();
                }
            }

            public a(C2918c c2918c, Iterator it) {
                super(it);
            }

            @Override // p153l.wgj0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public InterfaceC2995k.a<K> mo15951a(Map.Entry<K, Collection<V>> entry) {
                return new C22794a(this, entry);
            }
        }

        public C2918c(ju10<K, V> ju10Var) {
            this.f11109a = ju10Var;
        }

        @Override // com.google.common.collect.AbstractC2986b, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.f11109a.clear();
        }

        @Override // com.google.common.collect.AbstractC2986b, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.InterfaceC2995k
        public boolean contains(Object obj) {
            return this.f11109a.containsKey(obj);
        }

        @Override // com.google.common.collect.InterfaceC2995k
        public int count(Object obj) {
            Collection collection = (Collection) Maps.m16103x(this.f11109a.asMap(), obj);
            if (collection == null) {
                return 0;
            }
            return collection.size();
        }

        @Override // com.google.common.collect.AbstractC2986b
        public int distinctElements() {
            return this.f11109a.asMap().size();
        }

        @Override // com.google.common.collect.AbstractC2986b
        public Iterator<K> elementIterator() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.AbstractC2986b, com.google.common.collect.InterfaceC2995k
        public Set<K> elementSet() {
            return this.f11109a.keySet();
        }

        @Override // com.google.common.collect.AbstractC2986b
        public Iterator<InterfaceC2995k.a<K>> entryIterator() {
            return new a(this, this.f11109a.asMap().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.InterfaceC2995k
        public Iterator<K> iterator() {
            return Maps.m16092m(this.f11109a.entries().iterator());
        }

        @Override // com.google.common.collect.AbstractC2986b, com.google.common.collect.InterfaceC2995k
        public int remove(Object obj, int i) {
            se5.m185516b(i, "occurrences");
            if (i == 0) {
                return count(obj);
            }
            Collection collection = (Collection) Maps.m16103x(this.f11109a.asMap(), obj);
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

        @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.InterfaceC2995k
        public int size() {
            return this.f11109a.size();
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m16132c(ju10<?, ?> ju10Var, Object obj) {
        if (obj == ju10Var) {
            return true;
        }
        if (obj instanceof ju10) {
            return ju10Var.asMap().equals(((ju10) obj).asMap());
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static <K, V> zor<K, V> m16133d(Map<K, Collection<V>> map, b7h0<? extends List<V>> b7h0Var) {
        return new CustomListMultimap(map, b7h0Var);
    }

    /* JADX INFO: renamed from: e */
    public static <K, V> Collection<Map.Entry<K, V>> m16134e(Collection<Map.Entry<K, V>> collection) {
        return collection instanceof Set ? Maps.m16073H((Set) collection) : new Maps.C2906r(Collections.unmodifiableCollection(collection));
    }

    /* JADX INFO: renamed from: f */
    public static <V> Collection<V> m16135f(Collection<V> collection) {
        if (collection instanceof SortedSet) {
            return Collections.unmodifiableSortedSet((SortedSet) collection);
        }
        if (collection instanceof Set) {
            return Collections.unmodifiableSet((Set) collection);
        }
        return collection instanceof List ? Collections.unmodifiableList((List) collection) : Collections.unmodifiableCollection(collection);
    }

    public static class UnmodifiableMultimap<K, V> extends u2j<K, V> implements Serializable {
        private static final long serialVersionUID = 0;
        final ju10<K, V> delegate;
        transient Collection<Map.Entry<K, V>> entries;
        transient Set<K> keySet;
        transient InterfaceC2995k<K> keys;
        transient Map<K, Collection<V>> map;
        transient Collection<V> values;

        /* JADX INFO: renamed from: com.google.common.collect.Multimaps$UnmodifiableMultimap$a */
        public class C2915a implements adj<Collection<V>, Collection<V>> {
            public C2915a(UnmodifiableMultimap unmodifiableMultimap) {
            }

            @Override // p153l.adj
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Collection<V> apply(Collection<V> collection) {
                return Multimaps.m16135f(collection);
            }
        }

        public UnmodifiableMultimap(ju10<K, V> ju10Var) {
            this.delegate = (ju10) xn80.m212111p(ju10Var);
        }

        @Override // p153l.u2j, p153l.ju10
        public Map<K, Collection<V>> asMap() {
            Map<K, Collection<V>> map = this.map;
            if (map != null) {
                return map;
            }
            Map<K, Collection<V>> mapUnmodifiableMap = Collections.unmodifiableMap(Maps.m16069D(this.delegate.asMap(), new C2915a(this)));
            this.map = mapUnmodifiableMap;
            return mapUnmodifiableMap;
        }

        @Override // p153l.u2j, p153l.ju10
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // p153l.u2j, p153l.ju10
        public Collection<Map.Entry<K, V>> entries() {
            Collection<Map.Entry<K, V>> collection = this.entries;
            if (collection != null) {
                return collection;
            }
            Collection<Map.Entry<K, V>> collectionM16134e = Multimaps.m16134e(this.delegate.entries());
            this.entries = collectionM16134e;
            return collectionM16134e;
        }

        @Override // p153l.u2j, p153l.ju10, p153l.zor
        public Collection<V> get(K k) {
            return Multimaps.m16135f(this.delegate.get(k));
        }

        @Override // p153l.u2j, p153l.ju10
        public Set<K> keySet() {
            Set<K> set = this.keySet;
            if (set != null) {
                return set;
            }
            Set<K> setUnmodifiableSet = Collections.unmodifiableSet(this.delegate.keySet());
            this.keySet = setUnmodifiableSet;
            return setUnmodifiableSet;
        }

        @Override // p153l.u2j, p153l.ju10
        public InterfaceC2995k<K> keys() {
            InterfaceC2995k<K> interfaceC2995k = this.keys;
            if (interfaceC2995k != null) {
                return interfaceC2995k;
            }
            InterfaceC2995k<K> interfaceC2995kM16158o = Multisets.m16158o(this.delegate.keys());
            this.keys = interfaceC2995kM16158o;
            return interfaceC2995kM16158o;
        }

        @Override // p153l.u2j, p153l.ju10
        public boolean put(K k, V v2) {
            throw new UnsupportedOperationException();
        }

        @Override // p153l.u2j, p153l.ju10
        public boolean putAll(K k, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // p153l.u2j, p153l.ju10
        public boolean remove(Object obj, Object obj2) {
            throw new UnsupportedOperationException();
        }

        @Override // p153l.u2j, p153l.ju10, p153l.zor
        public Collection<V> removeAll(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // p153l.u2j, p153l.ju10, p153l.zor
        public Collection<V> replaceValues(K k, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // p153l.u2j, p153l.ju10
        public Collection<V> values() {
            Collection<V> collection = this.values;
            if (collection != null) {
                return collection;
            }
            Collection<V> collectionUnmodifiableCollection = Collections.unmodifiableCollection(this.delegate.values());
            this.values = collectionUnmodifiableCollection;
            return collectionUnmodifiableCollection;
        }

        @Override // p153l.u2j, p153l.v2j
        public ju10<K, V> delegate() {
            return this.delegate;
        }

        @Override // p153l.u2j, p153l.ju10
        public boolean putAll(ju10<? extends K, ? extends V> ju10Var) {
            throw new UnsupportedOperationException();
        }
    }

    public static class MapMultimap<K, V> extends AbstractC2985a<K, V> implements wte0<K, V>, Serializable {
        private static final long serialVersionUID = 7845222491160860175L;
        final Map<K, V> map;

        /* JADX INFO: renamed from: com.google.common.collect.Multimaps$MapMultimap$a */
        public class C2914a extends Sets.AbstractC2941e<V> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Object f11102a;

            /* JADX INFO: renamed from: com.google.common.collect.Multimaps$MapMultimap$a$a */
            public class a implements Iterator<V> {

                /* JADX INFO: renamed from: a */
                public int f11104a;

                public a() {
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    if (this.f11104a != 0) {
                        return false;
                    }
                    C2914a c2914a = C2914a.this;
                    return MapMultimap.this.map.containsKey(c2914a.f11102a);
                }

                @Override // java.util.Iterator
                public V next() {
                    if (!hasNext()) {
                        mor.m159308a();
                        return null;
                    }
                    this.f11104a++;
                    C2914a c2914a = C2914a.this;
                    return (V) k350.m147997a(MapMultimap.this.map.get(c2914a.f11102a));
                }

                @Override // java.util.Iterator
                public void remove() {
                    se5.m185519e(this.f11104a == 1);
                    this.f11104a = -1;
                    C2914a c2914a = C2914a.this;
                    MapMultimap.this.map.remove(c2914a.f11102a);
                }
            }

            public C2914a(Object obj) {
                this.f11102a = obj;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<V> iterator() {
                return new a();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return MapMultimap.this.map.containsKey(this.f11102a) ? 1 : 0;
            }
        }

        public MapMultimap(Map<K, V> map) {
            this.map = (Map) xn80.m212111p(map);
        }

        @Override // p153l.ju10
        public void clear() {
            this.map.clear();
        }

        @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
        public boolean containsEntry(Object obj, Object obj2) {
            return this.map.entrySet().contains(Maps.m16089j(obj, obj2));
        }

        @Override // p153l.ju10
        public boolean containsKey(Object obj) {
            return this.map.containsKey(obj);
        }

        @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
        public boolean containsValue(Object obj) {
            return this.map.containsValue(obj);
        }

        @Override // com.google.common.collect.AbstractC2985a
        public Map<K, Collection<V>> createAsMap() {
            return new C2916a(this);
        }

        @Override // com.google.common.collect.AbstractC2985a
        public Collection<Map.Entry<K, V>> createEntries() {
            throw new AssertionError("unreachable");
        }

        @Override // com.google.common.collect.AbstractC2985a
        public Set<K> createKeySet() {
            return this.map.keySet();
        }

        @Override // com.google.common.collect.AbstractC2985a
        public InterfaceC2995k<K> createKeys() {
            return new C2918c(this);
        }

        @Override // com.google.common.collect.AbstractC2985a
        public Collection<V> createValues() {
            return this.map.values();
        }

        @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
        public Set<Map.Entry<K, V>> entries() {
            return this.map.entrySet();
        }

        @Override // com.google.common.collect.AbstractC2985a
        public Iterator<Map.Entry<K, V>> entryIterator() {
            return this.map.entrySet().iterator();
        }

        @Override // p153l.ju10, p153l.zor
        public Set<V> get(K k) {
            return new C2914a(k);
        }

        @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
        public int hashCode() {
            return this.map.hashCode();
        }

        @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
        public boolean put(K k, V v2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
        public boolean putAll(K k, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
        public boolean remove(Object obj, Object obj2) {
            return this.map.entrySet().remove(Maps.m16089j(obj, obj2));
        }

        @Override // p153l.ju10, p153l.zor
        public Set<V> removeAll(Object obj) {
            HashSet hashSet = new HashSet(2);
            if (!this.map.containsKey(obj)) {
                return hashSet;
            }
            hashSet.add(this.map.remove(obj));
            return hashSet;
        }

        @Override // com.google.common.collect.AbstractC2985a, p153l.ju10, p153l.zor
        public Set<V> replaceValues(K k, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // p153l.ju10
        public int size() {
            return this.map.size();
        }

        @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
        public boolean putAll(ju10<? extends K, ? extends V> ju10Var) {
            throw new UnsupportedOperationException();
        }
    }
}
