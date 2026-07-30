package com.google.common.collect;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p153l.gn2;
import p153l.gyj0;
import p153l.ju10;
import p153l.se5;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ImmutableMultimap<K, V> extends gn2<K, V> implements Serializable {
    private static final long serialVersionUID = 0;
    final transient ImmutableMap<K, ? extends ImmutableCollection<V>> map;
    final transient int size;

    public static class EntryCollection<K, V> extends ImmutableCollection<Map.Entry<K, V>> {
        private static final long serialVersionUID = 0;
        final ImmutableMultimap<K, V> multimap;

        public EntryCollection(ImmutableMultimap<K, V> immutableMultimap) {
            this.multimap = immutableMultimap;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.multimap.containsEntry(entry.getKey(), entry.getValue());
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return this.multimap.isPartialView();
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        public gyj0<Map.Entry<K, V>> iterator() {
            return this.multimap.entryIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.multimap.size();
        }
    }

    public class Keys extends ImmutableMultiset<K> {
        public Keys() {
        }

        @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return ImmutableMultimap.this.containsKey(obj);
        }

        @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.InterfaceC2995k
        public int count(Object obj) {
            ImmutableCollection<V> immutableCollection = ImmutableMultimap.this.map.get(obj);
            if (immutableCollection == null) {
                return 0;
            }
            return immutableCollection.size();
        }

        @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.InterfaceC2995k
        public ImmutableSet<K> elementSet() {
            return ImmutableMultimap.this.keySet();
        }

        @Override // com.google.common.collect.ImmutableMultiset
        public InterfaceC2995k.a<K> getEntry(int i) {
            Map.Entry<K, ? extends ImmutableCollection<V>> entry = ImmutableMultimap.this.map.entrySet().asList().get(i);
            return Multisets.m16150g(entry.getKey(), entry.getValue().size());
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.InterfaceC2995k
        public int size() {
            return ImmutableMultimap.this.size();
        }

        @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return new KeysSerializedForm(ImmutableMultimap.this);
        }
    }

    public static final class KeysSerializedForm implements Serializable {
        final ImmutableMultimap<?, ?> multimap;

        public KeysSerializedForm(ImmutableMultimap<?, ?> immutableMultimap) {
            this.multimap = immutableMultimap;
        }

        public Object readResolve() {
            return this.multimap.keys();
        }
    }

    public static final class Values<K, V> extends ImmutableCollection<V> {
        private static final long serialVersionUID = 0;
        private final transient ImmutableMultimap<K, V> multimap;

        public Values(ImmutableMultimap<K, V> immutableMultimap) {
            this.multimap = immutableMultimap;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.multimap.containsValue(obj);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public int copyIntoArray(Object[] objArr, int i) {
            gyj0<? extends ImmutableCollection<V>> it = this.multimap.map.values().iterator();
            while (it.hasNext()) {
                i = it.next().copyIntoArray(objArr, i);
            }
            return i;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        public gyj0<V> iterator() {
            return this.multimap.valueIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.multimap.size();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableMultimap$a */
    public class C2812a extends gyj0<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a */
        public final Iterator<? extends Map.Entry<K, ? extends ImmutableCollection<V>>> f10935a;

        /* JADX INFO: renamed from: b */
        public K f10936b = null;

        /* JADX INFO: renamed from: c */
        public Iterator<V> f10937c = Iterators.m15933i();

        public C2812a() {
            this.f10935a = ImmutableMultimap.this.map.entrySet().iterator();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (!this.f10937c.hasNext()) {
                Map.Entry<K, ? extends ImmutableCollection<V>> next = this.f10935a.next();
                this.f10936b = next.getKey();
                this.f10937c = next.getValue().iterator();
            }
            K k = this.f10936b;
            Objects.requireNonNull(k);
            return Maps.m16089j(k, this.f10937c.next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f10937c.hasNext() || this.f10935a.hasNext();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableMultimap$b */
    public class C2813b extends gyj0<V> {

        /* JADX INFO: renamed from: a */
        public Iterator<? extends ImmutableCollection<V>> f10939a;

        /* JADX INFO: renamed from: b */
        public Iterator<V> f10940b = Iterators.m15933i();

        public C2813b() {
            this.f10939a = ImmutableMultimap.this.map.values().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f10940b.hasNext() || this.f10939a.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            if (!this.f10940b.hasNext()) {
                this.f10940b = this.f10939a.next().iterator();
            }
            return this.f10940b.next();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableMultimap$c */
    public static class C2814c<K, V> {

        /* JADX INFO: renamed from: a */
        public final Map<K, Collection<V>> f10942a = C2997m.m16356h();

        /* JADX INFO: renamed from: b */
        public Comparator<? super K> f10943b;

        /* JADX INFO: renamed from: c */
        public Comparator<? super V> f10944c;

        /* JADX INFO: renamed from: a */
        public ImmutableMultimap<K, V> m15794a() {
            Collection collectionEntrySet = this.f10942a.entrySet();
            Comparator<? super K> comparator = this.f10943b;
            if (comparator != null) {
                collectionEntrySet = Ordering.from(comparator).onKeys().immutableSortedCopy(collectionEntrySet);
            }
            return ImmutableListMultimap.fromMapEntries(collectionEntrySet, this.f10944c);
        }

        /* JADX INFO: renamed from: b */
        public Collection<V> mo15795b() {
            return new ArrayList();
        }

        /* JADX INFO: renamed from: c */
        public C2814c<K, V> mo15763c(K k, V v2) {
            se5.m185515a(k, v2);
            Collection<V> collection = this.f10942a.get(k);
            if (collection == null) {
                Map<K, Collection<V>> map = this.f10942a;
                Collection<V> collectionMo15795b = mo15795b();
                map.put(k, collectionMo15795b);
                collection = collectionMo15795b;
            }
            collection.add(v2);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C2814c<K, V> mo15764d(Map.Entry<? extends K, ? extends V> entry) {
            return mo15763c(entry.getKey(), entry.getValue());
        }

        /* JADX INFO: renamed from: e */
        public C2814c<K, V> m15796e(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            Iterator<? extends Map.Entry<? extends K, ? extends V>> it = iterable.iterator();
            while (it.hasNext()) {
                mo15764d(it.next());
            }
            return this;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableMultimap$d */
    public static class C2815d {

        /* JADX INFO: renamed from: a */
        public static final C2999o.b<ImmutableMultimap> f10945a = C2999o.m16358a(ImmutableMultimap.class, "map");

        /* JADX INFO: renamed from: b */
        public static final C2999o.b<ImmutableMultimap> f10946b = C2999o.m16358a(ImmutableMultimap.class, "size");
    }

    public ImmutableMultimap(ImmutableMap<K, ? extends ImmutableCollection<V>> immutableMap, int i) {
        this.map = immutableMap;
        this.size = i;
    }

    public static <K, V> C2814c<K, V> builder() {
        return new C2814c<>();
    }

    public static <K, V> ImmutableMultimap<K, V> copyOf(ju10<? extends K, ? extends V> ju10Var) {
        if (ju10Var instanceof ImmutableMultimap) {
            ImmutableMultimap<K, V> immutableMultimap = (ImmutableMultimap) ju10Var;
            if (!immutableMultimap.isPartialView()) {
                return immutableMultimap;
            }
        }
        return ImmutableListMultimap.copyOf((ju10) ju10Var);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableMultimap<K, V> m15787of() {
        return ImmutableListMultimap.m15757of();
    }

    @Override // p153l.ju10
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
    public /* bridge */ /* synthetic */ boolean containsEntry(Object obj, Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    @Override // p153l.ju10
    public boolean containsKey(Object obj) {
        return this.map.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
    public boolean containsValue(Object obj) {
        return obj != null && super.containsValue(obj);
    }

    @Override // com.google.common.collect.AbstractC2985a
    public Map<K, Collection<V>> createAsMap() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.AbstractC2985a
    public ImmutableCollection<Map.Entry<K, V>> createEntries() {
        return new EntryCollection(this);
    }

    @Override // com.google.common.collect.AbstractC2985a
    public Set<K> createKeySet() {
        throw new AssertionError("unreachable");
    }

    @Override // com.google.common.collect.AbstractC2985a
    public ImmutableMultiset<K> createKeys() {
        return new Keys();
    }

    @Override // com.google.common.collect.AbstractC2985a
    public ImmutableCollection<V> createValues() {
        return new Values(this);
    }

    @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
    public ImmutableCollection<Map.Entry<K, V>> entries() {
        return (ImmutableCollection) super.entries();
    }

    @Override // com.google.common.collect.AbstractC2985a
    public gyj0<Map.Entry<K, V>> entryIterator() {
        return new C2812a();
    }

    @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // p153l.ju10, p153l.zor
    public abstract ImmutableCollection<V> get(K k);

    @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public abstract ImmutableMultimap<V, K> inverse();

    @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    public boolean isPartialView() {
        return this.map.isPartialView();
    }

    @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
    public ImmutableSet<K> keySet() {
        return this.map.keySet();
    }

    @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
    public ImmutableMultiset<K> keys() {
        return (ImmutableMultiset) super.keys();
    }

    @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
    @Deprecated
    public final boolean put(K k, V v2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
    @Deprecated
    public final boolean putAll(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
    @Deprecated
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // p153l.ju10, p153l.zor
    @Deprecated
    public ImmutableCollection<V> removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractC2985a, p153l.ju10, p153l.zor
    @Deprecated
    public ImmutableCollection<V> replaceValues(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // p153l.ju10
    public int size() {
        return this.size;
    }

    @Override // com.google.common.collect.AbstractC2985a
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.AbstractC2985a
    public gyj0<V> valueIterator() {
        return new C2813b();
    }

    @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
    public ImmutableCollection<V> values() {
        return (ImmutableCollection) super.values();
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableMultimap<K, V> m15788of(K k, V v2) {
        return ImmutableListMultimap.m15758of((Object) k, (Object) v2);
    }

    @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
    public ImmutableMap<K, Collection<V>> asMap() {
        return this.map;
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableMultimap<K, V> m15789of(K k, V v2, K k2, V v3) {
        return ImmutableListMultimap.m15759of((Object) k, (Object) v2, (Object) k2, (Object) v3);
    }

    @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
    @Deprecated
    public final boolean putAll(ju10<? extends K, ? extends V> ju10Var) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableMultimap<K, V> m15790of(K k, V v2, K k2, V v3, K k3, V v4) {
        return ImmutableListMultimap.m15760of((Object) k, (Object) v2, (Object) k2, (Object) v3, (Object) k3, (Object) v4);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableMultimap<K, V> m15791of(K k, V v2, K k2, V v3, K k3, V v4, K k4, V v5) {
        return ImmutableListMultimap.m15761of((Object) k, (Object) v2, (Object) k2, (Object) v3, (Object) k3, (Object) v4, (Object) k4, (Object) v5);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableMultimap<K, V> m15792of(K k, V v2, K k2, V v3, K k3, V v4, K k4, V v5, K k5, V v6) {
        return ImmutableListMultimap.m15762of((Object) k, (Object) v2, (Object) k2, (Object) v3, (Object) k3, (Object) v4, (Object) k4, (Object) v5, (Object) k5, (Object) v6);
    }

    public static <K, V> ImmutableMultimap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return ImmutableListMultimap.copyOf((Iterable) iterable);
    }
}
