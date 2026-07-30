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
import p149l.ggf0;
import p149l.rle0;
import p149l.sf80;
import p149l.vu40;
import p149l.y9g0;

/* JADX INFO: loaded from: classes7.dex */
abstract class AbstractMapBasedMultimap<K, V> extends AbstractC2962a<K, V> implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;
    private transient Map<K, Collection<V>> map;
    private transient int totalSize;

    /* JADX INFO: renamed from: com.google.common.collect.AbstractMapBasedMultimap$a */
    public class C2719a extends AbstractMapBasedMultimap<K, V>.AbstractC2722d<V> {
        public C2719a(AbstractMapBasedMultimap abstractMapBasedMultimap) {
            super();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.AbstractC2722d
        /* JADX INFO: renamed from: a */
        public V mo15568a(K k, V v2) {
            return v2;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.AbstractMapBasedMultimap$b */
    public class C2720b extends AbstractMapBasedMultimap<K, V>.AbstractC2722d<Map.Entry<K, V>> {
        public C2720b(AbstractMapBasedMultimap abstractMapBasedMultimap) {
            super();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.AbstractC2722d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> mo15568a(K k, V v2) {
            return Maps.m16035j(k, v2);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.AbstractMapBasedMultimap$c */
    public class C2721c extends Maps.AbstractC2886u<K, Collection<V>> {

        /* JADX INFO: renamed from: d */
        public final transient Map<K, Collection<V>> f10774d;

        /* JADX INFO: renamed from: com.google.common.collect.AbstractMapBasedMultimap$c$a */
        public class a extends Maps.AbstractC2875j<K, Collection<V>> {
            public a() {
            }

            @Override // com.google.common.collect.Maps.AbstractC2875j
            /* JADX INFO: renamed from: a */
            public Map<K, Collection<V>> mo15574a() {
                return C2721c.this;
            }

            @Override // com.google.common.collect.Maps.AbstractC2875j, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return C2968g.m16260c(C2721c.this.f10774d.entrySet(), obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return C2721c.this.new b();
            }

            @Override // com.google.common.collect.Maps.AbstractC2875j, java.util.AbstractCollection, java.util.Collection, java.util.Set
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
            public final Iterator<Map.Entry<K, Collection<V>>> f10777a;

            /* JADX INFO: renamed from: b */
            public Collection<V> f10778b;

            public b() {
                this.f10777a = C2721c.this.f10774d.entrySet().iterator();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, Collection<V>> next() {
                Map.Entry<K, Collection<V>> next = this.f10777a.next();
                this.f10778b = next.getValue();
                return C2721c.this.m15573f(next);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f10777a.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                sf80.m183901w(this.f10778b != null, "no calls to next() since the last call to remove()");
                this.f10777a.remove();
                AbstractMapBasedMultimap.access$220(AbstractMapBasedMultimap.this, this.f10778b.size());
                this.f10778b.clear();
                this.f10778b = null;
            }
        }

        public C2721c(Map<K, Collection<V>> map) {
            this.f10774d = map;
        }

        @Override // com.google.common.collect.Maps.AbstractC2886u
        /* JADX INFO: renamed from: a */
        public Set<Map.Entry<K, Collection<V>>> mo15570a() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.f10774d == AbstractMapBasedMultimap.this.map) {
                AbstractMapBasedMultimap.this.clear();
            } else {
                Iterators.m15875e(new b());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return Maps.m16048w(this.f10774d, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Collection<V> get(Object obj) {
            Collection<V> collection = (Collection) Maps.m16049x(this.f10774d, obj);
            if (collection == null) {
                return null;
            }
            return AbstractMapBasedMultimap.this.wrapCollection(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Collection<V> remove(Object obj) {
            Collection<V> collectionRemove = this.f10774d.remove(obj);
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
            return this == obj || this.f10774d.equals(obj);
        }

        /* JADX INFO: renamed from: f */
        public Map.Entry<K, Collection<V>> m15573f(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            return Maps.m16035j(key, AbstractMapBasedMultimap.this.wrapCollection(key, entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.f10774d.hashCode();
        }

        @Override // com.google.common.collect.Maps.AbstractC2886u, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: keySet */
        public Set<K> mo15578h() {
            return AbstractMapBasedMultimap.this.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f10774d.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.f10774d.toString();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.AbstractMapBasedMultimap$d */
    public abstract class AbstractC2722d<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a */
        public final Iterator<Map.Entry<K, Collection<V>>> f10780a;

        /* JADX INFO: renamed from: b */
        public K f10781b = null;

        /* JADX INFO: renamed from: c */
        public Collection<V> f10782c = null;

        /* JADX INFO: renamed from: d */
        public Iterator<V> f10783d = Iterators.m15881k();

        public AbstractC2722d() {
            this.f10780a = AbstractMapBasedMultimap.this.map.entrySet().iterator();
        }

        /* JADX INFO: renamed from: a */
        public abstract T mo15568a(K k, V v2);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f10780a.hasNext() || this.f10783d.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.f10783d.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.f10780a.next();
                this.f10781b = next.getKey();
                Collection<V> value = next.getValue();
                this.f10782c = value;
                this.f10783d = value.iterator();
            }
            return mo15568a(vu40.m200060a(this.f10781b), this.f10783d.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f10783d.remove();
            Collection<V> collection = this.f10782c;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f10780a.remove();
            }
            AbstractMapBasedMultimap.access$210(AbstractMapBasedMultimap.this);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.AbstractMapBasedMultimap$e */
    public class C2723e extends Maps.C2878m<K, Collection<V>> {

        /* JADX INFO: renamed from: com.google.common.collect.AbstractMapBasedMultimap$e$a */
        public class a implements Iterator<K> {

            /* JADX INFO: renamed from: a */
            public Map.Entry<K, Collection<V>> f10786a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Iterator f10787b;

            public a(Iterator it) {
                this.f10787b = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f10787b.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.f10787b.next();
                this.f10786a = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                sf80.m183901w(this.f10786a != null, "no calls to next() since the last call to remove()");
                Collection<V> value = this.f10786a.getValue();
                this.f10787b.remove();
                AbstractMapBasedMultimap.access$220(AbstractMapBasedMultimap.this, value.size());
                value.clear();
                this.f10786a = null;
            }
        }

        public C2723e(Map<K, Collection<V>> map) {
            super(map);
        }

        @Override // com.google.common.collect.Maps.C2878m, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            Iterators.m15875e(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return mo16063c().keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return this == obj || mo16063c().keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return mo16063c().keySet().hashCode();
        }

        @Override // com.google.common.collect.Maps.C2878m, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a(mo16063c().entrySet().iterator());
        }

        @Override // com.google.common.collect.Maps.C2878m, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int size;
            Collection<V> collectionRemove = mo16063c().remove(obj);
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
    public class C2724f extends AbstractMapBasedMultimap<K, V>.C2727i implements NavigableMap<K, Collection<V>> {
        public C2724f(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> ceilingEntry(K k) {
            Map.Entry<K, Collection<V>> entryCeilingEntry = mo15579i().ceilingEntry(k);
            if (entryCeilingEntry == null) {
                return null;
            }
            return m15573f(entryCeilingEntry);
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k) {
            return mo15579i().ceilingKey(k);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> descendingMap() {
            return new C2724f(mo15579i().descendingMap());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> entryFirstEntry = mo15579i().firstEntry();
            if (entryFirstEntry == null) {
                return null;
            }
            return m15573f(entryFirstEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> floorEntry(K k) {
            Map.Entry<K, Collection<V>> entryFloorEntry = mo15579i().floorEntry(k);
            if (entryFloorEntry == null) {
                return null;
            }
            return m15573f(entryFloorEntry);
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k) {
            return mo15579i().floorKey(k);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> headMap(K k, boolean z) {
            return new C2724f(mo15579i().headMap(k, z));
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> higherEntry(K k) {
            Map.Entry<K, Collection<V>> entryHigherEntry = mo15579i().higherEntry(k);
            if (entryHigherEntry == null) {
                return null;
            }
            return m15573f(entryHigherEntry);
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k) {
            return mo15579i().higherKey(k);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.C2727i
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableSet<K> mo15577g() {
            return new C2725g(mo15579i());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.C2727i, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> headMap(K k) {
            return headMap(k, false);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.C2727i, com.google.common.collect.AbstractMapBasedMultimap.C2721c, com.google.common.collect.Maps.AbstractC2886u, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: keySet, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> mo15578h() {
            return (NavigableSet) super.mo15578h();
        }

        /* JADX INFO: renamed from: l */
        public Map.Entry<K, Collection<V>> m15582l(Iterator<Map.Entry<K, Collection<V>>> it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry<K, Collection<V>> next = it.next();
            Collection<V> collectionCreateCollection = AbstractMapBasedMultimap.this.createCollection();
            collectionCreateCollection.addAll(next.getValue());
            it.remove();
            return Maps.m16035j(next.getKey(), AbstractMapBasedMultimap.this.unmodifiableCollectionSubclass(collectionCreateCollection));
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> entryLastEntry = mo15579i().lastEntry();
            if (entryLastEntry == null) {
                return null;
            }
            return m15573f(entryLastEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lowerEntry(K k) {
            Map.Entry<K, Collection<V>> entryLowerEntry = mo15579i().lowerEntry(k);
            if (entryLowerEntry == null) {
                return null;
            }
            return m15573f(entryLowerEntry);
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k) {
            return mo15579i().lowerKey(k);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.C2727i
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> mo15579i() {
            return (NavigableMap) super.mo15579i();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.C2727i, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> subMap(K k, K k2) {
            return subMap(k, true, k2, false);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return mo15578h();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.C2727i, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> tailMap(K k) {
            return tailMap(k, true);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollFirstEntry() {
            return m15582l(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollLastEntry() {
            return m15582l(descendingMap().entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> subMap(K k, boolean z, K k2, boolean z2) {
            return new C2724f(mo15579i().subMap(k, z, k2, z2));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> tailMap(K k, boolean z) {
            return new C2724f(mo15579i().tailMap(k, z));
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.AbstractMapBasedMultimap$g */
    public class C2725g extends AbstractMapBasedMultimap<K, V>.C2728j implements NavigableSet<K> {
        public C2725g(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        public K ceiling(K k) {
            return mo15586c().ceilingKey(k);
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return new C2725g(mo15586c().descendingMap());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.C2728j, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> headSet(K k) {
            return headSet(k, false);
        }

        @Override // java.util.NavigableSet
        public K floor(K k) {
            return mo15586c().floorKey(k);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.C2728j
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> mo15586c() {
            return (NavigableMap) super.mo15586c();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.C2728j, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> subSet(K k, K k2) {
            return subSet(k, true, k2, false);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(K k, boolean z) {
            return new C2725g(mo15586c().headMap(k, z));
        }

        @Override // java.util.NavigableSet
        public K higher(K k) {
            return mo15586c().higherKey(k);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.C2728j, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> tailSet(K k) {
            return tailSet(k, true);
        }

        @Override // java.util.NavigableSet
        public K lower(K k) {
            return mo15586c().lowerKey(k);
        }

        @Override // java.util.NavigableSet
        public K pollFirst() {
            return (K) Iterators.m15891u(iterator());
        }

        @Override // java.util.NavigableSet
        public K pollLast() {
            return (K) Iterators.m15891u(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(K k, boolean z, K k2, boolean z2) {
            return new C2725g(mo15586c().subMap(k, z, k2, z2));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(K k, boolean z) {
            return new C2725g(mo15586c().tailMap(k, z));
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.AbstractMapBasedMultimap$h */
    public class C2726h extends AbstractMapBasedMultimap<K, V>.C2730l implements RandomAccess {
        public C2726h(AbstractMapBasedMultimap abstractMapBasedMultimap, K k, List<V> list, AbstractMapBasedMultimap<K, V>.C2729k c2729k) {
            super(k, list, c2729k);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.AbstractMapBasedMultimap$i */
    public class C2727i extends AbstractMapBasedMultimap<K, V>.C2721c implements SortedMap<K, Collection<V>> {

        /* JADX INFO: renamed from: f */
        public SortedSet<K> f10791f;

        public C2727i(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return mo15579i().comparator();
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return mo15579i().firstKey();
        }

        @Override // com.google.common.collect.Maps.AbstractC2886u
        /* JADX INFO: renamed from: g */
        public SortedSet<K> mo15577g() {
            return new C2728j(mo15579i());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.C2721c, com.google.common.collect.Maps.AbstractC2886u, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: h */
        public SortedSet<K> mo15578h() {
            SortedSet<K> sortedSet = this.f10791f;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> sortedSetMo15577g = mo15577g();
            this.f10791f = sortedSetMo15577g;
            return sortedSetMo15577g;
        }

        public SortedMap<K, Collection<V>> headMap(K k) {
            return new C2727i(mo15579i().headMap(k));
        }

        /* JADX INFO: renamed from: i */
        public SortedMap<K, Collection<V>> mo15579i() {
            return (SortedMap) this.f10774d;
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return mo15579i().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(K k, K k2) {
            return new C2727i(mo15579i().subMap(k, k2));
        }

        public SortedMap<K, Collection<V>> tailMap(K k) {
            return new C2727i(mo15579i().tailMap(k));
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.AbstractMapBasedMultimap$j */
    public class C2728j extends AbstractMapBasedMultimap<K, V>.C2723e implements SortedSet<K> {
        public C2728j(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        /* JADX INFO: renamed from: c */
        public SortedMap<K, Collection<V>> mo15586c() {
            return (SortedMap) super.mo16063c();
        }

        @Override // java.util.SortedSet
        public Comparator<? super K> comparator() {
            return mo15586c().comparator();
        }

        @Override // java.util.SortedSet
        public K first() {
            return mo15586c().firstKey();
        }

        public SortedSet<K> headSet(K k) {
            return new C2728j(mo15586c().headMap(k));
        }

        @Override // java.util.SortedSet
        public K last() {
            return mo15586c().lastKey();
        }

        public SortedSet<K> subSet(K k, K k2) {
            return new C2728j(mo15586c().subMap(k, k2));
        }

        public SortedSet<K> tailSet(K k) {
            return new C2728j(mo15586c().tailMap(k));
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.AbstractMapBasedMultimap$m */
    public class C2731m extends AbstractMapBasedMultimap<K, V>.C2733o implements NavigableSet<V> {
        public C2731m(K k, NavigableSet<V> navigableSet, AbstractMapBasedMultimap<K, V>.C2729k c2729k) {
            super(k, navigableSet, c2729k);
        }

        @Override // java.util.NavigableSet
        public V ceiling(V v2) {
            return mo15601j().ceiling(v2);
        }

        @Override // java.util.NavigableSet
        public Iterator<V> descendingIterator() {
            return new C2729k.a(mo15601j().descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> descendingSet() {
            return m15603o(mo15601j().descendingSet());
        }

        @Override // java.util.NavigableSet
        public V floor(V v2) {
            return mo15601j().floor(v2);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> headSet(V v2, boolean z) {
            return m15603o(mo15601j().headSet(v2, z));
        }

        @Override // java.util.NavigableSet
        public V higher(V v2) {
            return mo15601j().higher(v2);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.C2733o
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public NavigableSet<V> mo15601j() {
            return (NavigableSet) super.mo15601j();
        }

        @Override // java.util.NavigableSet
        public V lower(V v2) {
            return mo15601j().lower(v2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v1, types: [com.google.common.collect.AbstractMapBasedMultimap$k] */
        /* JADX WARN: Type inference failed for: r4v3 */
        /* JADX WARN: Type inference failed for: r4v4 */
        /* JADX INFO: renamed from: o */
        public final NavigableSet<V> m15603o(NavigableSet<V> navigableSet) {
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            K k = this.f10794a;
            AbstractMapBasedMultimap<K, V>.C2729k c2729kM15592c = m15592c();
            ?? M15592c = this;
            if (c2729kM15592c != null) {
                M15592c = m15592c();
            }
            return new C2731m(k, navigableSet, M15592c);
        }

        @Override // java.util.NavigableSet
        public V pollFirst() {
            return (V) Iterators.m15891u(iterator());
        }

        @Override // java.util.NavigableSet
        public V pollLast() {
            return (V) Iterators.m15891u(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> subSet(V v2, boolean z, V v3, boolean z2) {
            return m15603o(mo15601j().subSet(v2, z, v3, z2));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> tailSet(V v2, boolean z) {
            return m15603o(mo15601j().tailSet(v2, z));
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.AbstractMapBasedMultimap$n */
    public class C2732n extends AbstractMapBasedMultimap<K, V>.C2729k implements Set<V> {
        public C2732n(K k, Set<V> set) {
            super(k, set, null);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.C2729k, java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zM16125j = Sets.m16125j((Set) this.f10795b, collection);
            if (zM16125j) {
                AbstractMapBasedMultimap.access$212(AbstractMapBasedMultimap.this, this.f10795b.size() - size);
                m15596i();
            }
            return zM16125j;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.AbstractMapBasedMultimap$o */
    public class C2733o extends AbstractMapBasedMultimap<K, V>.C2729k implements SortedSet<V> {
        public C2733o(K k, SortedSet<V> sortedSet, AbstractMapBasedMultimap<K, V>.C2729k c2729k) {
            super(k, sortedSet, c2729k);
        }

        @Override // java.util.SortedSet
        public Comparator<? super V> comparator() {
            return mo15601j().comparator();
        }

        @Override // java.util.SortedSet
        public V first() {
            m15595h();
            return mo15601j().first();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v1, types: [com.google.common.collect.AbstractMapBasedMultimap$k] */
        /* JADX WARN: Type inference failed for: r4v3 */
        /* JADX WARN: Type inference failed for: r4v4 */
        @Override // java.util.SortedSet
        public SortedSet<V> headSet(V v2) {
            m15595h();
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            Object objM15594g = m15594g();
            SortedSet<V> sortedSetHeadSet = mo15601j().headSet(v2);
            AbstractMapBasedMultimap<K, V>.C2729k c2729kM15592c = m15592c();
            ?? M15592c = this;
            if (c2729kM15592c != null) {
                M15592c = m15592c();
            }
            return new C2733o(objM15594g, sortedSetHeadSet, M15592c);
        }

        /* JADX INFO: renamed from: j */
        public SortedSet<V> mo15601j() {
            return (SortedSet) m15593f();
        }

        @Override // java.util.SortedSet
        public V last() {
            m15595h();
            return mo15601j().last();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v1, types: [com.google.common.collect.AbstractMapBasedMultimap$k] */
        /* JADX WARN: Type inference failed for: r4v3 */
        /* JADX WARN: Type inference failed for: r4v4 */
        @Override // java.util.SortedSet
        public SortedSet<V> subSet(V v2, V v3) {
            m15595h();
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            Object objM15594g = m15594g();
            SortedSet<V> sortedSetSubSet = mo15601j().subSet(v2, v3);
            AbstractMapBasedMultimap<K, V>.C2729k c2729kM15592c = m15592c();
            ?? M15592c = this;
            if (c2729kM15592c != null) {
                M15592c = m15592c();
            }
            return new C2733o(objM15594g, sortedSetSubSet, M15592c);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v1, types: [com.google.common.collect.AbstractMapBasedMultimap$k] */
        /* JADX WARN: Type inference failed for: r4v3 */
        /* JADX WARN: Type inference failed for: r4v4 */
        @Override // java.util.SortedSet
        public SortedSet<V> tailSet(V v2) {
            m15595h();
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            Object objM15594g = m15594g();
            SortedSet<V> sortedSetTailSet = mo15601j().tailSet(v2);
            AbstractMapBasedMultimap<K, V>.C2729k c2729kM15592c = m15592c();
            ?? M15592c = this;
            if (c2729kM15592c != null) {
                M15592c = m15592c();
            }
            return new C2733o(objM15594g, sortedSetTailSet, M15592c);
        }
    }

    public AbstractMapBasedMultimap(Map<K, Collection<V>> map) {
        sf80.m183882d(map.isEmpty());
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
        Collection collection = (Collection) Maps.m16050y(this.map, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.totalSize -= size;
        }
    }

    public Map<K, Collection<V>> backingMap() {
        return this.map;
    }

    @Override // p149l.bm10
    public void clear() {
        Iterator<Collection<V>> it = this.map.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.map.clear();
        this.totalSize = 0;
    }

    @Override // p149l.bm10
    public boolean containsKey(Object obj) {
        return this.map.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractC2962a
    public Map<K, Collection<V>> createAsMap() {
        return new C2721c(this.map);
    }

    public abstract Collection<V> createCollection();

    public Collection<V> createCollection(K k) {
        return createCollection();
    }

    @Override // com.google.common.collect.AbstractC2962a
    public Collection<Map.Entry<K, V>> createEntries() {
        return this instanceof rle0 ? new AbstractC2962a.b(this) : new AbstractC2962a.a();
    }

    @Override // com.google.common.collect.AbstractC2962a
    public Set<K> createKeySet() {
        return new C2723e(this.map);
    }

    @Override // com.google.common.collect.AbstractC2962a
    public InterfaceC2972k<K> createKeys() {
        return new Multimaps.C2895c(this);
    }

    public final Map<K, Collection<V>> createMaybeNavigableAsMap() {
        Map<K, Collection<V>> map = this.map;
        if (map instanceof NavigableMap) {
            return new C2724f((NavigableMap) this.map);
        }
        return map instanceof SortedMap ? new C2727i((SortedMap) this.map) : new C2721c(this.map);
    }

    public final Set<K> createMaybeNavigableKeySet() {
        Map<K, Collection<V>> map = this.map;
        if (map instanceof NavigableMap) {
            return new C2725g((NavigableMap) this.map);
        }
        return map instanceof SortedMap ? new C2728j((SortedMap) this.map) : new C2723e(this.map);
    }

    public Collection<V> createUnmodifiableEmptyCollection() {
        return (Collection<V>) unmodifiableCollectionSubclass(createCollection());
    }

    @Override // com.google.common.collect.AbstractC2962a
    public Collection<V> createValues() {
        return new AbstractC2962a.c();
    }

    @Override // com.google.common.collect.AbstractC2962a, p149l.bm10
    public Collection<Map.Entry<K, V>> entries() {
        return super.entries();
    }

    @Override // com.google.common.collect.AbstractC2962a
    public Iterator<Map.Entry<K, V>> entryIterator() {
        return new C2720b(this);
    }

    @Override // p149l.bm10, p149l.ymr
    public Collection<V> get(K k) {
        Collection<V> collectionCreateCollection = this.map.get(k);
        if (collectionCreateCollection == null) {
            collectionCreateCollection = createCollection(k);
        }
        return wrapCollection(k, collectionCreateCollection);
    }

    @Override // com.google.common.collect.AbstractC2962a, p149l.bm10
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
            y9g0.m213537a("New Collection violated the Collection spec");
            return false;
        }
        this.totalSize++;
        this.map.put(k, collectionCreateCollection);
        return true;
    }

    @Override // p149l.bm10, p149l.ymr
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

    @Override // com.google.common.collect.AbstractC2962a, p149l.bm10, p149l.ymr
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
            sf80.m183882d(!collection.isEmpty());
            this.totalSize += collection.size();
        }
    }

    @Override // p149l.bm10
    public int size() {
        return this.totalSize;
    }

    public <E> Collection<E> unmodifiableCollectionSubclass(Collection<E> collection) {
        return Collections.unmodifiableCollection(collection);
    }

    @Override // com.google.common.collect.AbstractC2962a
    public Iterator<V> valueIterator() {
        return new C2719a(this);
    }

    @Override // com.google.common.collect.AbstractC2962a, p149l.bm10
    public Collection<V> values() {
        return super.values();
    }

    public Collection<V> wrapCollection(K k, Collection<V> collection) {
        return new C2729k(k, collection, null);
    }

    public final List<V> wrapList(K k, List<V> list, AbstractMapBasedMultimap<K, V>.C2729k c2729k) {
        return list instanceof RandomAccess ? new C2726h(this, k, list, c2729k) : new C2730l(k, list, c2729k);
    }

    /* JADX INFO: renamed from: com.google.common.collect.AbstractMapBasedMultimap$l */
    public class C2730l extends AbstractMapBasedMultimap<K, V>.C2729k implements List<V> {
        public C2730l(K k, List<V> list, AbstractMapBasedMultimap<K, V>.C2729k c2729k) {
            super(k, list, c2729k);
        }

        @Override // java.util.List
        public void add(int i, V v2) {
            m15595h();
            boolean zIsEmpty = m15593f().isEmpty();
            m15599j().add(i, v2);
            AbstractMapBasedMultimap.access$208(AbstractMapBasedMultimap.this);
            if (zIsEmpty) {
                m15591a();
            }
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = m15599j().addAll(i, collection);
            if (zAddAll) {
                AbstractMapBasedMultimap.access$212(AbstractMapBasedMultimap.this, m15593f().size() - size);
                if (size == 0) {
                    m15591a();
                }
            }
            return zAddAll;
        }

        @Override // java.util.List
        public V get(int i) {
            m15595h();
            return m15599j().get(i);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            m15595h();
            return m15599j().indexOf(obj);
        }

        /* JADX INFO: renamed from: j */
        public List<V> m15599j() {
            return (List) m15593f();
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            m15595h();
            return m15599j().lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator() {
            m15595h();
            return new a();
        }

        @Override // java.util.List
        public V remove(int i) {
            m15595h();
            V vRemove = m15599j().remove(i);
            AbstractMapBasedMultimap.access$210(AbstractMapBasedMultimap.this);
            m15596i();
            return vRemove;
        }

        @Override // java.util.List
        public V set(int i, V v2) {
            m15595h();
            return m15599j().set(i, v2);
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
            m15595h();
            ?? r0 = AbstractMapBasedMultimap.this;
            Object objM15594g = m15594g();
            List<V> listSubList = m15599j().subList(i, i2);
            AbstractMapBasedMultimap<K, V>.C2729k c2729kM15592c = m15592c();
            ?? M15592c = this;
            if (c2729kM15592c != null) {
                M15592c = m15592c();
            }
            return r0.wrapList(objM15594g, listSubList, M15592c);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator(int i) {
            m15595h();
            return new a(i);
        }

        /* JADX INFO: renamed from: com.google.common.collect.AbstractMapBasedMultimap$l$a */
        public class a extends AbstractMapBasedMultimap<K, V>.C2729k.a implements ListIterator<V> {
            public a(int i) {
                super(C2730l.this.m15599j().listIterator(i));
            }

            @Override // java.util.ListIterator
            public void add(V v2) {
                boolean zIsEmpty = C2730l.this.isEmpty();
                m15600c().add(v2);
                AbstractMapBasedMultimap.access$208(AbstractMapBasedMultimap.this);
                if (zIsEmpty) {
                    C2730l.this.m15591a();
                }
            }

            /* JADX INFO: renamed from: c */
            public final ListIterator<V> m15600c() {
                return (ListIterator) m15597a();
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return m15600c().hasPrevious();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return m15600c().nextIndex();
            }

            @Override // java.util.ListIterator
            public V previous() {
                return m15600c().previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return m15600c().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(V v2) {
                m15600c().set(v2);
            }

            public a() {
                super();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.AbstractMapBasedMultimap$k */
    public class C2729k extends AbstractCollection<V> {

        /* JADX INFO: renamed from: a */
        public final K f10794a;

        /* JADX INFO: renamed from: b */
        public Collection<V> f10795b;

        /* JADX INFO: renamed from: c */
        public final AbstractMapBasedMultimap<K, V>.C2729k f10796c;

        /* JADX INFO: renamed from: d */
        public final Collection<V> f10797d;

        public C2729k(K k, Collection<V> collection, AbstractMapBasedMultimap<K, V>.C2729k c2729k) {
            this.f10794a = k;
            this.f10795b = collection;
            this.f10796c = c2729k;
            this.f10797d = c2729k == null ? null : c2729k.m15593f();
        }

        /* JADX INFO: renamed from: a */
        public void m15591a() {
            AbstractMapBasedMultimap<K, V>.C2729k c2729k = this.f10796c;
            if (c2729k != null) {
                c2729k.m15591a();
            } else {
                AbstractMapBasedMultimap.this.map.put(this.f10794a, this.f10795b);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(V v2) {
            m15595h();
            boolean zIsEmpty = this.f10795b.isEmpty();
            boolean zAdd = this.f10795b.add(v2);
            if (zAdd) {
                AbstractMapBasedMultimap.access$208(AbstractMapBasedMultimap.this);
                if (zIsEmpty) {
                    m15591a();
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
            boolean zAddAll = this.f10795b.addAll(collection);
            if (zAddAll) {
                AbstractMapBasedMultimap.access$212(AbstractMapBasedMultimap.this, this.f10795b.size() - size);
                if (size == 0) {
                    m15591a();
                }
            }
            return zAddAll;
        }

        /* JADX INFO: renamed from: c */
        public AbstractMapBasedMultimap<K, V>.C2729k m15592c() {
            return this.f10796c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f10795b.clear();
            AbstractMapBasedMultimap.access$220(AbstractMapBasedMultimap.this, size);
            m15596i();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            m15595h();
            return this.f10795b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            m15595h();
            return this.f10795b.containsAll(collection);
        }

        @Override // java.util.Collection
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            m15595h();
            return this.f10795b.equals(obj);
        }

        /* JADX INFO: renamed from: f */
        public Collection<V> m15593f() {
            return this.f10795b;
        }

        /* JADX INFO: renamed from: g */
        public K m15594g() {
            return this.f10794a;
        }

        /* JADX INFO: renamed from: h */
        public void m15595h() {
            Collection<V> collection;
            AbstractMapBasedMultimap<K, V>.C2729k c2729k = this.f10796c;
            if (c2729k != null) {
                c2729k.m15595h();
                if (this.f10796c.m15593f() == this.f10797d) {
                    return;
                }
                ggf0.m125962a();
                return;
            }
            if (!this.f10795b.isEmpty() || (collection = (Collection) AbstractMapBasedMultimap.this.map.get(this.f10794a)) == null) {
                return;
            }
            this.f10795b = collection;
        }

        @Override // java.util.Collection
        public int hashCode() {
            m15595h();
            return this.f10795b.hashCode();
        }

        /* JADX INFO: renamed from: i */
        public void m15596i() {
            AbstractMapBasedMultimap<K, V>.C2729k c2729k = this.f10796c;
            if (c2729k != null) {
                c2729k.m15596i();
            } else if (this.f10795b.isEmpty()) {
                AbstractMapBasedMultimap.this.map.remove(this.f10794a);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            m15595h();
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            m15595h();
            boolean zRemove = this.f10795b.remove(obj);
            if (zRemove) {
                AbstractMapBasedMultimap.access$210(AbstractMapBasedMultimap.this);
                m15596i();
            }
            return zRemove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zRemoveAll = this.f10795b.removeAll(collection);
            if (zRemoveAll) {
                AbstractMapBasedMultimap.access$212(AbstractMapBasedMultimap.this, this.f10795b.size() - size);
                m15596i();
            }
            return zRemoveAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            sf80.m183894p(collection);
            int size = size();
            boolean zRetainAll = this.f10795b.retainAll(collection);
            if (zRetainAll) {
                AbstractMapBasedMultimap.access$212(AbstractMapBasedMultimap.this, this.f10795b.size() - size);
                m15596i();
            }
            return zRetainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            m15595h();
            return this.f10795b.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            m15595h();
            return this.f10795b.toString();
        }

        /* JADX INFO: renamed from: com.google.common.collect.AbstractMapBasedMultimap$k$a */
        public class a implements Iterator<V> {

            /* JADX INFO: renamed from: a */
            public final Iterator<V> f10799a;

            /* JADX INFO: renamed from: b */
            public final Collection<V> f10800b;

            public a() {
                Collection<V> collection = C2729k.this.f10795b;
                this.f10800b = collection;
                this.f10799a = AbstractMapBasedMultimap.iteratorOrListIterator(collection);
            }

            /* JADX INFO: renamed from: a */
            public Iterator<V> m15597a() {
                m15598b();
                return this.f10799a;
            }

            /* JADX INFO: renamed from: b */
            public void m15598b() {
                C2729k.this.m15595h();
                if (C2729k.this.f10795b == this.f10800b) {
                    return;
                }
                ggf0.m125962a();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                m15598b();
                return this.f10799a.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                m15598b();
                return this.f10799a.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f10799a.remove();
                AbstractMapBasedMultimap.access$210(AbstractMapBasedMultimap.this);
                C2729k.this.m15596i();
            }

            public a(Iterator<V> it) {
                this.f10800b = C2729k.this.f10795b;
                this.f10799a = it;
            }
        }
    }
}
