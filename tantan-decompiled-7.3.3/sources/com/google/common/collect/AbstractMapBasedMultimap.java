package com.google.common.collect;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import p153l.gig0;
import p153l.k350;
import p153l.nof0;
import p153l.wte0;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
abstract class AbstractMapBasedMultimap<K, V> extends AbstractC2985a<K, V> implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;
    private transient Map<K, Collection<V>> map;
    private transient int totalSize;

    /* JADX INFO: renamed from: com.google.common.collect.AbstractMapBasedMultimap$a */
    public class C2742a extends AbstractMapBasedMultimap<K, V>.AbstractC2745d<V> {
        public C2742a(AbstractMapBasedMultimap abstractMapBasedMultimap) {
            super();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.AbstractC2745d
        /* JADX INFO: renamed from: a */
        public V mo15622a(K k, V v2) {
            return v2;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.AbstractMapBasedMultimap$b */
    public class C2743b extends AbstractMapBasedMultimap<K, V>.AbstractC2745d<Map.Entry<K, V>> {
        public C2743b(AbstractMapBasedMultimap abstractMapBasedMultimap) {
            super();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.AbstractC2745d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> mo15622a(K k, V v2) {
            return Maps.m16089j(k, v2);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.AbstractMapBasedMultimap$c */
    public class C2744c extends Maps.AbstractC2909u<K, Collection<V>> {

        /* JADX INFO: renamed from: d */
        public final transient Map<K, Collection<V>> f10811d;

        /* JADX INFO: renamed from: com.google.common.collect.AbstractMapBasedMultimap$c$a */
        public class a extends Maps.AbstractC2898j<K, Collection<V>> {
            public a() {
            }

            @Override // com.google.common.collect.Maps.AbstractC2898j
            /* JADX INFO: renamed from: a */
            public Map<K, Collection<V>> mo15628a() {
                return C2744c.this;
            }

            @Override // com.google.common.collect.Maps.AbstractC2898j, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return C2991g.m16314c(C2744c.this.f10811d.entrySet(), obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return C2744c.this.new b();
            }

            @Override // com.google.common.collect.Maps.AbstractC2898j, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                AbstractMapBasedMultimap.this.removeValuesForKey(entry.getKey());
                return true;
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.AbstractMapBasedMultimap$c$b */
        public class b implements Iterator<Map.Entry<K, Collection<V>>> {

            /* JADX INFO: renamed from: a */
            public final Iterator<Map.Entry<K, Collection<V>>> f10814a;

            /* JADX INFO: renamed from: b */
            public Collection<V> f10815b;

            public b() {
                this.f10814a = C2744c.this.f10811d.entrySet().iterator();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, Collection<V>> next() {
                Map.Entry<K, Collection<V>> next = this.f10814a.next();
                this.f10815b = next.getValue();
                return C2744c.this.m15627f(next);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f10814a.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                xn80.m212118w(this.f10815b != null, "no calls to next() since the last call to remove()");
                this.f10814a.remove();
                AbstractMapBasedMultimap.access$220(AbstractMapBasedMultimap.this, this.f10815b.size());
                this.f10815b.clear();
                this.f10815b = null;
            }
        }

        public C2744c(Map<K, Collection<V>> map) {
            this.f10811d = map;
        }

        @Override // com.google.common.collect.Maps.AbstractC2909u
        /* JADX INFO: renamed from: a */
        public Set<Map.Entry<K, Collection<V>>> mo15624a() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.f10811d == AbstractMapBasedMultimap.this.map) {
                AbstractMapBasedMultimap.this.clear();
            } else {
                Iterators.m15929e(new b());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return Maps.m16102w(this.f10811d, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Collection<V> get(Object obj) {
            Collection<V> collection = (Collection) Maps.m16103x(this.f10811d, obj);
            if (collection == null) {
                return null;
            }
            return AbstractMapBasedMultimap.this.wrapCollection(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Collection<V> remove(Object obj) {
            Collection<V> collectionRemove = this.f10811d.remove(obj);
            if (collectionRemove == null) {
                return null;
            }
            Collection<V> collectionCreateCollection = AbstractMapBasedMultimap.this.createCollection();
            collectionCreateCollection.addAll(collectionRemove);
            AbstractMapBasedMultimap.access$220(AbstractMapBasedMultimap.this, collectionRemove.size());
            collectionRemove.clear();
            return collectionCreateCollection;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(Object obj) {
            return this == obj || this.f10811d.equals(obj);
        }

        /* JADX INFO: renamed from: f */
        public Map.Entry<K, Collection<V>> m15627f(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            return Maps.m16089j(key, AbstractMapBasedMultimap.this.wrapCollection(key, entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.f10811d.hashCode();
        }

        @Override // com.google.common.collect.Maps.AbstractC2909u, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: keySet */
        public Set<K> mo15632h() {
            return AbstractMapBasedMultimap.this.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f10811d.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.f10811d.toString();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.AbstractMapBasedMultimap$d */
    public abstract class AbstractC2745d<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a */
        public final Iterator<Map.Entry<K, Collection<V>>> f10817a;

        /* JADX INFO: renamed from: b */
        public K f10818b = null;

        /* JADX INFO: renamed from: c */
        public Collection<V> f10819c = null;

        /* JADX INFO: renamed from: d */
        public Iterator<V> f10820d = Iterators.m15935k();

        public AbstractC2745d() {
            this.f10817a = AbstractMapBasedMultimap.this.map.entrySet().iterator();
        }

        /* JADX INFO: renamed from: a */
        public abstract T mo15622a(K k, V v2);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f10817a.hasNext() || this.f10820d.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.f10820d.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.f10817a.next();
                this.f10818b = next.getKey();
                Collection<V> value = next.getValue();
                this.f10819c = value;
                this.f10820d = value.iterator();
            }
            return mo15622a(k350.m147997a(this.f10818b), this.f10820d.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f10820d.remove();
            Collection<V> collection = this.f10819c;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f10817a.remove();
            }
            AbstractMapBasedMultimap.access$210(AbstractMapBasedMultimap.this);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.AbstractMapBasedMultimap$e */
    public class C2746e extends Maps.C2901m<K, Collection<V>> {

        /* JADX INFO: renamed from: com.google.common.collect.AbstractMapBasedMultimap$e$a */
        public class a implements Iterator<K> {

            /* JADX INFO: renamed from: a */
            public Map.Entry<K, Collection<V>> f10823a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Iterator f10824b;

            public a(Iterator it) {
                this.f10824b = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f10824b.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.f10824b.next();
                this.f10823a = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                xn80.m212118w(this.f10823a != null, "no calls to next() since the last call to remove()");
                Collection<V> value = this.f10823a.getValue();
                this.f10824b.remove();
                AbstractMapBasedMultimap.access$220(AbstractMapBasedMultimap.this, value.size());
                value.clear();
                this.f10823a = null;
            }
        }

        public C2746e(Map<K, Collection<V>> map) {
            super(map);
        }

        @Override // com.google.common.collect.Maps.C2901m, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            Iterators.m15929e(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return mo16117c().keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return this == obj || mo16117c().keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return mo16117c().keySet().hashCode();
        }

        @Override // com.google.common.collect.Maps.C2901m, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a(mo16117c().entrySet().iterator());
        }

        @Override // com.google.common.collect.Maps.C2901m, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int size;
            Collection<V> collectionRemove = mo16117c().remove(obj);
            if (collectionRemove != null) {
                size = collectionRemove.size();
                collectionRemove.clear();
                AbstractMapBasedMultimap.access$220(AbstractMapBasedMultimap.this, size);
            } else {
                size = 0;
            }
            return size > 0;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.AbstractMapBasedMultimap$f */
    public class C2747f extends AbstractMapBasedMultimap<K, V>.C2750i implements NavigableMap<K, Collection<V>> {
        public C2747f(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> ceilingEntry(K k) {
            Map.Entry<K, Collection<V>> entryCeilingEntry = mo15633i().ceilingEntry(k);
            if (entryCeilingEntry == null) {
                return null;
            }
            return m15627f(entryCeilingEntry);
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k) {
            return mo15633i().ceilingKey(k);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> descendingMap() {
            return new C2747f(mo15633i().descendingMap());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> entryFirstEntry = mo15633i().firstEntry();
            if (entryFirstEntry == null) {
                return null;
            }
            return m15627f(entryFirstEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> floorEntry(K k) {
            Map.Entry<K, Collection<V>> entryFloorEntry = mo15633i().floorEntry(k);
            if (entryFloorEntry == null) {
                return null;
            }
            return m15627f(entryFloorEntry);
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k) {
            return mo15633i().floorKey(k);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> headMap(K k, boolean z) {
            return new C2747f(mo15633i().headMap(k, z));
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> higherEntry(K k) {
            Map.Entry<K, Collection<V>> entryHigherEntry = mo15633i().higherEntry(k);
            if (entryHigherEntry == null) {
                return null;
            }
            return m15627f(entryHigherEntry);
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k) {
            return mo15633i().higherKey(k);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.C2750i
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableSet<K> mo15631g() {
            return new C2748g(mo15633i());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.C2750i, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> headMap(K k) {
            return headMap(k, false);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.C2750i, com.google.common.collect.AbstractMapBasedMultimap.C2744c, com.google.common.collect.Maps.AbstractC2909u, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: keySet, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> mo15632h() {
            return (NavigableSet) super.mo15632h();
        }

        /* JADX INFO: renamed from: l */
        public Map.Entry<K, Collection<V>> m15636l(Iterator<Map.Entry<K, Collection<V>>> it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry<K, Collection<V>> next = it.next();
            Collection<V> collectionCreateCollection = AbstractMapBasedMultimap.this.createCollection();
            collectionCreateCollection.addAll(next.getValue());
            it.remove();
            return Maps.m16089j(next.getKey(), AbstractMapBasedMultimap.this.unmodifiableCollectionSubclass(collectionCreateCollection));
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> entryLastEntry = mo15633i().lastEntry();
            if (entryLastEntry == null) {
                return null;
            }
            return m15627f(entryLastEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lowerEntry(K k) {
            Map.Entry<K, Collection<V>> entryLowerEntry = mo15633i().lowerEntry(k);
            if (entryLowerEntry == null) {
                return null;
            }
            return m15627f(entryLowerEntry);
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k) {
            return mo15633i().lowerKey(k);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.C2750i
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> mo15633i() {
            return (NavigableMap) super.mo15633i();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.C2750i, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> subMap(K k, K k2) {
            return subMap(k, true, k2, false);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return mo15632h();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.C2750i, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> tailMap(K k) {
            return tailMap(k, true);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollFirstEntry() {
            return m15636l(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollLastEntry() {
            return m15636l(descendingMap().entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> subMap(K k, boolean z, K k2, boolean z2) {
            return new C2747f(mo15633i().subMap(k, z, k2, z2));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> tailMap(K k, boolean z) {
            return new C2747f(mo15633i().tailMap(k, z));
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.AbstractMapBasedMultimap$g */
    public class C2748g extends AbstractMapBasedMultimap<K, V>.C2751j implements NavigableSet<K> {
        public C2748g(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        public K ceiling(K k) {
            return mo15640c().ceilingKey(k);
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return new C2748g(mo15640c().descendingMap());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.C2751j, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> headSet(K k) {
            return headSet(k, false);
        }

        @Override // java.util.NavigableSet
        public K floor(K k) {
            return mo15640c().floorKey(k);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.C2751j
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> mo15640c() {
            return (NavigableMap) super.mo15640c();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.C2751j, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> subSet(K k, K k2) {
            return subSet(k, true, k2, false);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(K k, boolean z) {
            return new C2748g(mo15640c().headMap(k, z));
        }

        @Override // java.util.NavigableSet
        public K higher(K k) {
            return mo15640c().higherKey(k);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.C2751j, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> tailSet(K k) {
            return tailSet(k, true);
        }

        @Override // java.util.NavigableSet
        public K lower(K k) {
            return mo15640c().lowerKey(k);
        }

        @Override // java.util.NavigableSet
        public K pollFirst() {
            return (K) Iterators.m15945u(iterator());
        }

        @Override // java.util.NavigableSet
        public K pollLast() {
            return (K) Iterators.m15945u(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(K k, boolean z, K k2, boolean z2) {
            return new C2748g(mo15640c().subMap(k, z, k2, z2));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(K k, boolean z) {
            return new C2748g(mo15640c().tailMap(k, z));
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.AbstractMapBasedMultimap$h */
    public class C2749h extends AbstractMapBasedMultimap<K, V>.C2753l implements RandomAccess {
        public C2749h(AbstractMapBasedMultimap abstractMapBasedMultimap, K k, List<V> list, AbstractMapBasedMultimap<K, V>.C2752k c2752k) {
            super(k, list, c2752k);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.AbstractMapBasedMultimap$i */
    public class C2750i extends AbstractMapBasedMultimap<K, V>.C2744c implements SortedMap<K, Collection<V>> {

        /* JADX INFO: renamed from: f */
        public SortedSet<K> f10828f;

        public C2750i(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return mo15633i().comparator();
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return mo15633i().firstKey();
        }

        @Override // com.google.common.collect.Maps.AbstractC2909u
        /* JADX INFO: renamed from: g */
        public SortedSet<K> mo15631g() {
            return new C2751j(mo15633i());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.C2744c, com.google.common.collect.Maps.AbstractC2909u, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: h */
        public SortedSet<K> mo15632h() {
            SortedSet<K> sortedSet = this.f10828f;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> sortedSetMo15631g = mo15631g();
            this.f10828f = sortedSetMo15631g;
            return sortedSetMo15631g;
        }

        public SortedMap<K, Collection<V>> headMap(K k) {
            return new C2750i(mo15633i().headMap(k));
        }

        /* JADX INFO: renamed from: i */
        public SortedMap<K, Collection<V>> mo15633i() {
            return (SortedMap) this.f10811d;
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return mo15633i().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(K k, K k2) {
            return new C2750i(mo15633i().subMap(k, k2));
        }

        public SortedMap<K, Collection<V>> tailMap(K k) {
            return new C2750i(mo15633i().tailMap(k));
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.AbstractMapBasedMultimap$j */
    public class C2751j extends AbstractMapBasedMultimap<K, V>.C2746e implements SortedSet<K> {
        public C2751j(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        /* JADX INFO: renamed from: c */
        public SortedMap<K, Collection<V>> mo15640c() {
            return (SortedMap) super.mo16117c();
        }

        @Override // java.util.SortedSet
        public Comparator<? super K> comparator() {
            return mo15640c().comparator();
        }

        @Override // java.util.SortedSet
        public K first() {
            return mo15640c().firstKey();
        }

        public SortedSet<K> headSet(K k) {
            return new C2751j(mo15640c().headMap(k));
        }

        @Override // java.util.SortedSet
        public K last() {
            return mo15640c().lastKey();
        }

        public SortedSet<K> subSet(K k, K k2) {
            return new C2751j(mo15640c().subMap(k, k2));
        }

        public SortedSet<K> tailSet(K k) {
            return new C2751j(mo15640c().tailMap(k));
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.AbstractMapBasedMultimap$m */
    public class C2754m extends AbstractMapBasedMultimap<K, V>.C2756o implements NavigableSet<V> {
        public C2754m(K k, NavigableSet<V> navigableSet, AbstractMapBasedMultimap<K, V>.C2752k c2752k) {
            super(k, navigableSet, c2752k);
        }

        @Override // java.util.NavigableSet
        public V ceiling(V v2) {
            return mo15655j().ceiling(v2);
        }

        @Override // java.util.NavigableSet
        public Iterator<V> descendingIterator() {
            return new C2752k.a(mo15655j().descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> descendingSet() {
            return m15657o(mo15655j().descendingSet());
        }

        @Override // java.util.NavigableSet
        public V floor(V v2) {
            return mo15655j().floor(v2);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> headSet(V v2, boolean z) {
            return m15657o(mo15655j().headSet(v2, z));
        }

        @Override // java.util.NavigableSet
        public V higher(V v2) {
            return mo15655j().higher(v2);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.C2756o
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public NavigableSet<V> mo15655j() {
            return (NavigableSet) super.mo15655j();
        }

        @Override // java.util.NavigableSet
        public V lower(V v2) {
            return mo15655j().lower(v2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v1, types: [com.google.common.collect.AbstractMapBasedMultimap$k] */
        /* JADX WARN: Type inference failed for: r4v3 */
        /* JADX WARN: Type inference failed for: r4v4 */
        /* JADX INFO: renamed from: o */
        public final NavigableSet<V> m15657o(NavigableSet<V> navigableSet) {
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            K k = this.f10831a;
            AbstractMapBasedMultimap<K, V>.C2752k c2752kM15646c = m15646c();
            ?? M15646c = this;
            if (c2752kM15646c != null) {
                M15646c = m15646c();
            }
            return new C2754m(k, navigableSet, M15646c);
        }

        @Override // java.util.NavigableSet
        public V pollFirst() {
            return (V) Iterators.m15945u(iterator());
        }

        @Override // java.util.NavigableSet
        public V pollLast() {
            return (V) Iterators.m15945u(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> subSet(V v2, boolean z, V v3, boolean z2) {
            return m15657o(mo15655j().subSet(v2, z, v3, z2));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> tailSet(V v2, boolean z) {
            return m15657o(mo15655j().tailSet(v2, z));
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.AbstractMapBasedMultimap$n */
    public class C2755n extends AbstractMapBasedMultimap<K, V>.C2752k implements Set<V> {
        public C2755n(K k, Set<V> set) {
            super(k, set, null);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.C2752k, java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zM16179j = Sets.m16179j((Set) this.f10832b, collection);
            if (zM16179j) {
                AbstractMapBasedMultimap.access$212(AbstractMapBasedMultimap.this, this.f10832b.size() - size);
                m15650i();
            }
            return zM16179j;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.AbstractMapBasedMultimap$o */
    public class C2756o extends AbstractMapBasedMultimap<K, V>.C2752k implements SortedSet<V> {
        public C2756o(K k, SortedSet<V> sortedSet, AbstractMapBasedMultimap<K, V>.C2752k c2752k) {
            super(k, sortedSet, c2752k);
        }

        @Override // java.util.SortedSet
        public Comparator<? super V> comparator() {
            return mo15655j().comparator();
        }

        @Override // java.util.SortedSet
        public V first() {
            m15649h();
            return mo15655j().first();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v1, types: [com.google.common.collect.AbstractMapBasedMultimap$k] */
        /* JADX WARN: Type inference failed for: r4v3 */
        /* JADX WARN: Type inference failed for: r4v4 */
        @Override // java.util.SortedSet
        public SortedSet<V> headSet(V v2) {
            m15649h();
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            Object objM15648g = m15648g();
            SortedSet<V> sortedSetHeadSet = mo15655j().headSet(v2);
            AbstractMapBasedMultimap<K, V>.C2752k c2752kM15646c = m15646c();
            ?? M15646c = this;
            if (c2752kM15646c != null) {
                M15646c = m15646c();
            }
            return new C2756o(objM15648g, sortedSetHeadSet, M15646c);
        }

        /* JADX INFO: renamed from: j */
        public SortedSet<V> mo15655j() {
            return (SortedSet) m15647f();
        }

        @Override // java.util.SortedSet
        public V last() {
            m15649h();
            return mo15655j().last();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v1, types: [com.google.common.collect.AbstractMapBasedMultimap$k] */
        /* JADX WARN: Type inference failed for: r4v3 */
        /* JADX WARN: Type inference failed for: r4v4 */
        @Override // java.util.SortedSet
        public SortedSet<V> subSet(V v2, V v3) {
            m15649h();
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            Object objM15648g = m15648g();
            SortedSet<V> sortedSetSubSet = mo15655j().subSet(v2, v3);
            AbstractMapBasedMultimap<K, V>.C2752k c2752kM15646c = m15646c();
            ?? M15646c = this;
            if (c2752kM15646c != null) {
                M15646c = m15646c();
            }
            return new C2756o(objM15648g, sortedSetSubSet, M15646c);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v1, types: [com.google.common.collect.AbstractMapBasedMultimap$k] */
        /* JADX WARN: Type inference failed for: r4v3 */
        /* JADX WARN: Type inference failed for: r4v4 */
        @Override // java.util.SortedSet
        public SortedSet<V> tailSet(V v2) {
            m15649h();
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            Object objM15648g = m15648g();
            SortedSet<V> sortedSetTailSet = mo15655j().tailSet(v2);
            AbstractMapBasedMultimap<K, V>.C2752k c2752kM15646c = m15646c();
            ?? M15646c = this;
            if (c2752kM15646c != null) {
                M15646c = m15646c();
            }
            return new C2756o(objM15648g, sortedSetTailSet, M15646c);
        }
    }

    public AbstractMapBasedMultimap(Map<K, Collection<V>> map) {
        xn80.m212099d(map.isEmpty());
        this.map = map;
    }

    public static /* synthetic */ int access$208(AbstractMapBasedMultimap abstractMapBasedMultimap) {
        int i = abstractMapBasedMultimap.totalSize;
        abstractMapBasedMultimap.totalSize = i + 1;
        return i;
    }

    public static /* synthetic */ int access$210(AbstractMapBasedMultimap abstractMapBasedMultimap) {
        int i = abstractMapBasedMultimap.totalSize;
        abstractMapBasedMultimap.totalSize = i - 1;
        return i;
    }

    public static /* synthetic */ int access$212(AbstractMapBasedMultimap abstractMapBasedMultimap, int i) {
        int i2 = abstractMapBasedMultimap.totalSize + i;
        abstractMapBasedMultimap.totalSize = i2;
        return i2;
    }

    public static /* synthetic */ int access$220(AbstractMapBasedMultimap abstractMapBasedMultimap, int i) {
        int i2 = abstractMapBasedMultimap.totalSize - i;
        abstractMapBasedMultimap.totalSize = i2;
        return i2;
    }

    private Collection<V> getOrCreateCollection(K k) {
        Collection<V> collection = this.map.get(k);
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionCreateCollection = createCollection(k);
        this.map.put(k, collectionCreateCollection);
        return collectionCreateCollection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> Iterator<E> iteratorOrListIterator(Collection<E> collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeValuesForKey(Object obj) {
        Collection collection = (Collection) Maps.m16104y(this.map, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.totalSize -= size;
        }
    }

    public Map<K, Collection<V>> backingMap() {
        return this.map;
    }

    @Override // p153l.ju10
    public void clear() {
        Iterator<Collection<V>> it = this.map.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.map.clear();
        this.totalSize = 0;
    }

    @Override // p153l.ju10
    public boolean containsKey(Object obj) {
        return this.map.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractC2985a
    public Map<K, Collection<V>> createAsMap() {
        return new C2744c(this.map);
    }

    public abstract Collection<V> createCollection();

    public Collection<V> createCollection(K k) {
        return createCollection();
    }

    @Override // com.google.common.collect.AbstractC2985a
    public Collection<Map.Entry<K, V>> createEntries() {
        return this instanceof wte0 ? new AbstractC2985a.b(this) : new AbstractC2985a.a();
    }

    @Override // com.google.common.collect.AbstractC2985a
    public Set<K> createKeySet() {
        return new C2746e(this.map);
    }

    @Override // com.google.common.collect.AbstractC2985a
    public InterfaceC2995k<K> createKeys() {
        return new Multimaps.C2918c(this);
    }

    public final Map<K, Collection<V>> createMaybeNavigableAsMap() {
        Map<K, Collection<V>> map = this.map;
        if (map instanceof NavigableMap) {
            return new C2747f((NavigableMap) this.map);
        }
        return map instanceof SortedMap ? new C2750i((SortedMap) this.map) : new C2744c(this.map);
    }

    public final Set<K> createMaybeNavigableKeySet() {
        Map<K, Collection<V>> map = this.map;
        if (map instanceof NavigableMap) {
            return new C2748g((NavigableMap) this.map);
        }
        return map instanceof SortedMap ? new C2751j((SortedMap) this.map) : new C2746e(this.map);
    }

    public Collection<V> createUnmodifiableEmptyCollection() {
        return (Collection<V>) unmodifiableCollectionSubclass(createCollection());
    }

    @Override // com.google.common.collect.AbstractC2985a
    public Collection<V> createValues() {
        return new AbstractC2985a.c();
    }

    @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
    public Collection<Map.Entry<K, V>> entries() {
        return super.entries();
    }

    @Override // com.google.common.collect.AbstractC2985a
    public Iterator<Map.Entry<K, V>> entryIterator() {
        return new C2743b(this);
    }

    @Override // p153l.ju10, p153l.zor
    public Collection<V> get(K k) {
        Collection<V> collectionCreateCollection = this.map.get(k);
        if (collectionCreateCollection == null) {
            collectionCreateCollection = createCollection(k);
        }
        return wrapCollection(k, collectionCreateCollection);
    }

    @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
    public boolean put(K k, V v2) {
        Collection<V> collection = this.map.get(k);
        if (collection != null) {
            if (!collection.add(v2)) {
                return false;
            }
            this.totalSize++;
            return true;
        }
        Collection<V> collectionCreateCollection = createCollection(k);
        if (!collectionCreateCollection.add(v2)) {
            gig0.m130323a("New Collection violated the Collection spec");
            return false;
        }
        this.totalSize++;
        this.map.put(k, collectionCreateCollection);
        return true;
    }

    @Override // p153l.ju10, p153l.zor
    public Collection<V> removeAll(Object obj) {
        Collection<V> collectionRemove = this.map.remove(obj);
        if (collectionRemove == null) {
            return createUnmodifiableEmptyCollection();
        }
        Collection collectionCreateCollection = createCollection();
        collectionCreateCollection.addAll(collectionRemove);
        this.totalSize -= collectionRemove.size();
        collectionRemove.clear();
        return (Collection<V>) unmodifiableCollectionSubclass(collectionCreateCollection);
    }

    @Override // com.google.common.collect.AbstractC2985a, p153l.ju10, p153l.zor
    public Collection<V> replaceValues(K k, Iterable<? extends V> iterable) {
        Iterator<? extends V> it = iterable.iterator();
        if (!it.hasNext()) {
            return removeAll(k);
        }
        Collection<V> orCreateCollection = getOrCreateCollection(k);
        Collection<V> collectionCreateCollection = createCollection();
        collectionCreateCollection.addAll(orCreateCollection);
        this.totalSize -= orCreateCollection.size();
        orCreateCollection.clear();
        while (it.hasNext()) {
            if (orCreateCollection.add(it.next())) {
                this.totalSize++;
            }
        }
        return (Collection<V>) unmodifiableCollectionSubclass(collectionCreateCollection);
    }

    public final void setMap(Map<K, Collection<V>> map) {
        this.map = map;
        this.totalSize = 0;
        for (Collection<V> collection : map.values()) {
            xn80.m212099d(!collection.isEmpty());
            this.totalSize += collection.size();
        }
    }

    @Override // p153l.ju10
    public int size() {
        return this.totalSize;
    }

    public <E> Collection<E> unmodifiableCollectionSubclass(Collection<E> collection) {
        return Collections.unmodifiableCollection(collection);
    }

    @Override // com.google.common.collect.AbstractC2985a
    public Iterator<V> valueIterator() {
        return new C2742a(this);
    }

    @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
    public Collection<V> values() {
        return super.values();
    }

    public Collection<V> wrapCollection(K k, Collection<V> collection) {
        return new C2752k(k, collection, null);
    }

    public final List<V> wrapList(K k, List<V> list, AbstractMapBasedMultimap<K, V>.C2752k c2752k) {
        return list instanceof RandomAccess ? new C2749h(this, k, list, c2752k) : new C2753l(k, list, c2752k);
    }

    /* JADX INFO: renamed from: com.google.common.collect.AbstractMapBasedMultimap$l */
    public class C2753l extends AbstractMapBasedMultimap<K, V>.C2752k implements List<V> {
        public C2753l(K k, List<V> list, AbstractMapBasedMultimap<K, V>.C2752k c2752k) {
            super(k, list, c2752k);
        }

        @Override // java.util.List
        public void add(int i, V v2) {
            m15649h();
            boolean zIsEmpty = m15647f().isEmpty();
            m15653j().add(i, v2);
            AbstractMapBasedMultimap.access$208(AbstractMapBasedMultimap.this);
            if (zIsEmpty) {
                m15645a();
            }
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = m15653j().addAll(i, collection);
            if (zAddAll) {
                AbstractMapBasedMultimap.access$212(AbstractMapBasedMultimap.this, m15647f().size() - size);
                if (size == 0) {
                    m15645a();
                }
            }
            return zAddAll;
        }

        @Override // java.util.List
        public V get(int i) {
            m15649h();
            return m15653j().get(i);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            m15649h();
            return m15653j().indexOf(obj);
        }

        /* JADX INFO: renamed from: j */
        public List<V> m15653j() {
            return (List) m15647f();
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            m15649h();
            return m15653j().lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator() {
            m15649h();
            return new a();
        }

        @Override // java.util.List
        public V remove(int i) {
            m15649h();
            V vRemove = m15653j().remove(i);
            AbstractMapBasedMultimap.access$210(AbstractMapBasedMultimap.this);
            m15650i();
            return vRemove;
        }

        @Override // java.util.List
        public V set(int i, V v2) {
            m15649h();
            return m15653j().set(i, v2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.collect.AbstractMapBasedMultimap] */
        /* JADX WARN: Type inference failed for: r3v1, types: [com.google.common.collect.AbstractMapBasedMultimap$k] */
        /* JADX WARN: Type inference failed for: r3v4 */
        /* JADX WARN: Type inference failed for: r3v5 */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // java.util.List
        public List<V> subList(int i, int i2) {
            m15649h();
            ?? r0 = AbstractMapBasedMultimap.this;
            Object objM15648g = m15648g();
            List<V> listSubList = m15653j().subList(i, i2);
            AbstractMapBasedMultimap<K, V>.C2752k c2752kM15646c = m15646c();
            ?? M15646c = this;
            if (c2752kM15646c != null) {
                M15646c = m15646c();
            }
            return r0.wrapList(objM15648g, listSubList, M15646c);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator(int i) {
            m15649h();
            return new a(i);
        }

        /* JADX INFO: renamed from: com.google.common.collect.AbstractMapBasedMultimap$l$a */
        public class a extends AbstractMapBasedMultimap<K, V>.C2752k.a implements ListIterator<V> {
            public a(int i) {
                super(C2753l.this.m15653j().listIterator(i));
            }

            @Override // java.util.ListIterator
            public void add(V v2) {
                boolean zIsEmpty = C2753l.this.isEmpty();
                m15654c().add(v2);
                AbstractMapBasedMultimap.access$208(AbstractMapBasedMultimap.this);
                if (zIsEmpty) {
                    C2753l.this.m15645a();
                }
            }

            /* JADX INFO: renamed from: c */
            public final ListIterator<V> m15654c() {
                return (ListIterator) m15651a();
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return m15654c().hasPrevious();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return m15654c().nextIndex();
            }

            @Override // java.util.ListIterator
            public V previous() {
                return m15654c().previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return m15654c().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(V v2) {
                m15654c().set(v2);
            }

            public a() {
                super();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.AbstractMapBasedMultimap$k */
    public class C2752k extends AbstractCollection<V> {

        /* JADX INFO: renamed from: a */
        public final K f10831a;

        /* JADX INFO: renamed from: b */
        public Collection<V> f10832b;

        /* JADX INFO: renamed from: c */
        public final AbstractMapBasedMultimap<K, V>.C2752k f10833c;

        /* JADX INFO: renamed from: d */
        public final Collection<V> f10834d;

        public C2752k(K k, Collection<V> collection, AbstractMapBasedMultimap<K, V>.C2752k c2752k) {
            this.f10831a = k;
            this.f10832b = collection;
            this.f10833c = c2752k;
            this.f10834d = c2752k == null ? null : c2752k.m15647f();
        }

        /* JADX INFO: renamed from: a */
        public void m15645a() {
            AbstractMapBasedMultimap<K, V>.C2752k c2752k = this.f10833c;
            if (c2752k != null) {
                c2752k.m15645a();
            } else {
                AbstractMapBasedMultimap.this.map.put(this.f10831a, this.f10832b);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(V v2) {
            m15649h();
            boolean zIsEmpty = this.f10832b.isEmpty();
            boolean zAdd = this.f10832b.add(v2);
            if (zAdd) {
                AbstractMapBasedMultimap.access$208(AbstractMapBasedMultimap.this);
                if (zIsEmpty) {
                    m15645a();
                }
            }
            return zAdd;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = this.f10832b.addAll(collection);
            if (zAddAll) {
                AbstractMapBasedMultimap.access$212(AbstractMapBasedMultimap.this, this.f10832b.size() - size);
                if (size == 0) {
                    m15645a();
                }
            }
            return zAddAll;
        }

        /* JADX INFO: renamed from: c */
        public AbstractMapBasedMultimap<K, V>.C2752k m15646c() {
            return this.f10833c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f10832b.clear();
            AbstractMapBasedMultimap.access$220(AbstractMapBasedMultimap.this, size);
            m15650i();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            m15649h();
            return this.f10832b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            m15649h();
            return this.f10832b.containsAll(collection);
        }

        @Override // java.util.Collection
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            m15649h();
            return this.f10832b.equals(obj);
        }

        /* JADX INFO: renamed from: f */
        public Collection<V> m15647f() {
            return this.f10832b;
        }

        /* JADX INFO: renamed from: g */
        public K m15648g() {
            return this.f10831a;
        }

        /* JADX INFO: renamed from: h */
        public void m15649h() {
            Collection<V> collection;
            AbstractMapBasedMultimap<K, V>.C2752k c2752k = this.f10833c;
            if (c2752k != null) {
                c2752k.m15649h();
                if (this.f10833c.m15647f() == this.f10834d) {
                    return;
                }
                nof0.m164126a();
                return;
            }
            if (!this.f10832b.isEmpty() || (collection = (Collection) AbstractMapBasedMultimap.this.map.get(this.f10831a)) == null) {
                return;
            }
            this.f10832b = collection;
        }

        @Override // java.util.Collection
        public int hashCode() {
            m15649h();
            return this.f10832b.hashCode();
        }

        /* JADX INFO: renamed from: i */
        public void m15650i() {
            AbstractMapBasedMultimap<K, V>.C2752k c2752k = this.f10833c;
            if (c2752k != null) {
                c2752k.m15650i();
            } else if (this.f10832b.isEmpty()) {
                AbstractMapBasedMultimap.this.map.remove(this.f10831a);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            m15649h();
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            m15649h();
            boolean zRemove = this.f10832b.remove(obj);
            if (zRemove) {
                AbstractMapBasedMultimap.access$210(AbstractMapBasedMultimap.this);
                m15650i();
            }
            return zRemove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zRemoveAll = this.f10832b.removeAll(collection);
            if (zRemoveAll) {
                AbstractMapBasedMultimap.access$212(AbstractMapBasedMultimap.this, this.f10832b.size() - size);
                m15650i();
            }
            return zRemoveAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            xn80.m212111p(collection);
            int size = size();
            boolean zRetainAll = this.f10832b.retainAll(collection);
            if (zRetainAll) {
                AbstractMapBasedMultimap.access$212(AbstractMapBasedMultimap.this, this.f10832b.size() - size);
                m15650i();
            }
            return zRetainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            m15649h();
            return this.f10832b.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            m15649h();
            return this.f10832b.toString();
        }

        /* JADX INFO: renamed from: com.google.common.collect.AbstractMapBasedMultimap$k$a */
        public class a implements Iterator<V> {

            /* JADX INFO: renamed from: a */
            public final Iterator<V> f10836a;

            /* JADX INFO: renamed from: b */
            public final Collection<V> f10837b;

            public a() {
                Collection<V> collection = C2752k.this.f10832b;
                this.f10837b = collection;
                this.f10836a = AbstractMapBasedMultimap.iteratorOrListIterator(collection);
            }

            /* JADX INFO: renamed from: a */
            public Iterator<V> m15651a() {
                m15652b();
                return this.f10836a;
            }

            /* JADX INFO: renamed from: b */
            public void m15652b() {
                C2752k.this.m15649h();
                if (C2752k.this.f10832b == this.f10837b) {
                    return;
                }
                nof0.m164126a();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                m15652b();
                return this.f10836a.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                m15652b();
                return this.f10836a.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f10836a.remove();
                AbstractMapBasedMultimap.access$210(AbstractMapBasedMultimap.this);
                C2752k.this.m15650i();
            }

            public a(Iterator<V> it) {
                this.f10837b = C2752k.this.f10832b;
                this.f10836a = it;
            }
        }
    }
}
