package com.google.common.collect;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p149l.bm10;
import p149l.dpj0;
import p149l.sd5;
import p149l.zm2;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ImmutableMultimap<K, V> extends zm2<K, V> implements Serializable {
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
        public dpj0<Map.Entry<K, V>> iterator() {
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

        @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.InterfaceC2972k
        public int count(Object obj) {
            ImmutableCollection<V> immutableCollection = ImmutableMultimap.this.map.get(obj);
            if (immutableCollection == null) {
                return 0;
            }
            return immutableCollection.size();
        }

        @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.InterfaceC2972k
        public ImmutableSet<K> elementSet() {
            return ImmutableMultimap.this.keySet();
        }

        @Override // com.google.common.collect.ImmutableMultiset
        public InterfaceC2972k.a<K> getEntry(int i) {
            Map.Entry<K, ? extends ImmutableCollection<V>> entry = ImmutableMultimap.this.map.entrySet().asList().get(i);
            return Multisets.m16096g(entry.getKey(), entry.getValue().size());
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.InterfaceC2972k
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
            dpj0<? extends ImmutableCollection<V>> it = this.multimap.map.values().iterator();
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
        public dpj0<V> iterator() {
            return this.multimap.valueIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.multimap.size();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableMultimap$a */
    public class C2789a extends dpj0<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a */
        public final Iterator<? extends Map.Entry<K, ? extends ImmutableCollection<V>>> f10898a;

        /* JADX INFO: renamed from: b */
        public K f10899b = null;

        /* JADX INFO: renamed from: c */
        public Iterator<V> f10900c = Iterators.m15879i();

        public C2789a() {
            this.f10898a = ImmutableMultimap.this.map.entrySet().iterator();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (!this.f10900c.hasNext()) {
                Map.Entry<K, ? extends ImmutableCollection<V>> next = this.f10898a.next();
                this.f10899b = next.getKey();
                this.f10900c = next.getValue().iterator();
            }
            K k = this.f10899b;
            Objects.requireNonNull(k);
            return Maps.m16035j(k, this.f10900c.next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f10900c.hasNext() || this.f10898a.hasNext();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableMultimap$b */
    public class C2790b extends dpj0<V> {

        /* JADX INFO: renamed from: a */
        public Iterator<? extends ImmutableCollection<V>> f10902a;

        /* JADX INFO: renamed from: b */
        public Iterator<V> f10903b = Iterators.m15879i();

        public C2790b() {
            this.f10902a = ImmutableMultimap.this.map.values().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f10903b.hasNext() || this.f10902a.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            if (!this.f10903b.hasNext()) {
                this.f10903b = this.f10902a.next().iterator();
            }
            return this.f10903b.next();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableMultimap$c */
    public static class C2791c<K, V> {

        /* JADX INFO: renamed from: a */
        public final Map<K, Collection<V>> f10905a = C2974m.m16302h();

        /* JADX INFO: renamed from: b */
        public Comparator<? super K> f10906b;

        /* JADX INFO: renamed from: c */
        public Comparator<? super V> f10907c;

        /* JADX INFO: renamed from: a */
        public ImmutableMultimap<K, V> m15740a() {
            Collection collectionEntrySet = this.f10905a.entrySet();
            Comparator<? super K> comparator = this.f10906b;
            if (comparator != null) {
                collectionEntrySet = Ordering.from(comparator).onKeys().immutableSortedCopy(collectionEntrySet);
            }
            return ImmutableListMultimap.fromMapEntries(collectionEntrySet, this.f10907c);
        }

        /* JADX INFO: renamed from: b */
        public Collection<V> mo15741b() {
            return new ArrayList();
        }

        /* JADX INFO: renamed from: c */
        public C2791c<K, V> mo15709c(K k, V v2) {
            sd5.m183443a(k, v2);
            Collection<V> collection = this.f10905a.get(k);
            if (collection == null) {
                Map<K, Collection<V>> map = this.f10905a;
                Collection<V> collectionMo15741b = mo15741b();
                map.put(k, collectionMo15741b);
                collection = collectionMo15741b;
            }
            collection.add(v2);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C2791c<K, V> mo15710d(Map.Entry<? extends K, ? extends V> entry) {
            return mo15709c(entry.getKey(), entry.getValue());
        }

        /* JADX INFO: renamed from: e */
        public C2791c<K, V> m15742e(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            Iterator<? extends Map.Entry<? extends K, ? extends V>> it = iterable.iterator();
            while (it.hasNext()) {
                mo15710d(it.next());
            }
            return this;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableMultimap$d */
    public static class C2792d {

        /* JADX INFO: renamed from: a */
        public static final C2976o.b<ImmutableMultimap> f10908a = C2976o.m16304a(ImmutableMultimap.class, "map");

        /* JADX INFO: renamed from: b */
        public static final C2976o.b<ImmutableMultimap> f10909b = C2976o.m16304a(ImmutableMultimap.class, "size");
    }

    public ImmutableMultimap(ImmutableMap<K, ? extends ImmutableCollection<V>> immutableMap, int i) {
        this.map = immutableMap;
        this.size = i;
    }

    public static <K, V> C2791c<K, V> builder() {
        return new C2791c<>();
    }

    public static <K, V> ImmutableMultimap<K, V> copyOf(bm10<? extends K, ? extends V> bm10Var) {
        if (bm10Var instanceof ImmutableMultimap) {
            ImmutableMultimap<K, V> immutableMultimap = (ImmutableMultimap) bm10Var;
            if (!immutableMultimap.isPartialView()) {
                return immutableMultimap;
            }
        }
        return ImmutableListMultimap.copyOf((bm10) bm10Var);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableMultimap<K, V> m15733of() {
        return ImmutableListMultimap.m15703of();
    }

    @Override // p149l.bm10
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractC2962a, p149l.bm10
    public /* bridge */ /* synthetic */ boolean containsEntry(Object obj, Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    @Override // p149l.bm10
    public boolean containsKey(Object obj) {
        return this.map.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractC2962a, p149l.bm10
    public boolean containsValue(Object obj) {
        return obj != null && super.containsValue(obj);
    }

    @Override // com.google.common.collect.AbstractC2962a
    public Map<K, Collection<V>> createAsMap() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.AbstractC2962a
    public ImmutableCollection<Map.Entry<K, V>> createEntries() {
        return new EntryCollection(this);
    }

    @Override // com.google.common.collect.AbstractC2962a
    public Set<K> createKeySet() {
        throw new AssertionError("unreachable");
    }

    @Override // com.google.common.collect.AbstractC2962a
    public ImmutableMultiset<K> createKeys() {
        return new Keys();
    }

    @Override // com.google.common.collect.AbstractC2962a
    public ImmutableCollection<V> createValues() {
        return new Values(this);
    }

    @Override // com.google.common.collect.AbstractC2962a, p149l.bm10
    public ImmutableCollection<Map.Entry<K, V>> entries() {
        return (ImmutableCollection) super.entries();
    }

    @Override // com.google.common.collect.AbstractC2962a
    public dpj0<Map.Entry<K, V>> entryIterator() {
        return new C2789a();
    }

    @Override // com.google.common.collect.AbstractC2962a, p149l.bm10
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // p149l.bm10, p149l.ymr
    public abstract ImmutableCollection<V> get(K k);

    @Override // com.google.common.collect.AbstractC2962a, p149l.bm10
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public abstract ImmutableMultimap<V, K> inverse();

    @Override // com.google.common.collect.AbstractC2962a, p149l.bm10
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    public boolean isPartialView() {
        return this.map.isPartialView();
    }

    @Override // com.google.common.collect.AbstractC2962a, p149l.bm10
    public ImmutableSet<K> keySet() {
        return this.map.keySet();
    }

    @Override // com.google.common.collect.AbstractC2962a, p149l.bm10
    public ImmutableMultiset<K> keys() {
        return (ImmutableMultiset) super.keys();
    }

    @Override // com.google.common.collect.AbstractC2962a, p149l.bm10
    @Deprecated
    public final boolean put(K k, V v2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractC2962a, p149l.bm10
    @Deprecated
    public final boolean putAll(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractC2962a, p149l.bm10
    @Deprecated
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // p149l.bm10, p149l.ymr
    @Deprecated
    public ImmutableCollection<V> removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractC2962a, p149l.bm10, p149l.ymr
    @Deprecated
    public ImmutableCollection<V> replaceValues(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // p149l.bm10
    public int size() {
        return this.size;
    }

    @Override // com.google.common.collect.AbstractC2962a
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.AbstractC2962a
    public dpj0<V> valueIterator() {
        return new C2790b();
    }

    @Override // com.google.common.collect.AbstractC2962a, p149l.bm10
    public ImmutableCollection<V> values() {
        return (ImmutableCollection) super.values();
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableMultimap<K, V> m15734of(K k, V v2) {
        return ImmutableListMultimap.m15704of((Object) k, (Object) v2);
    }

    @Override // com.google.common.collect.AbstractC2962a, p149l.bm10
    public ImmutableMap<K, Collection<V>> asMap() {
        return this.map;
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableMultimap<K, V> m15735of(K k, V v2, K k2, V v3) {
        return ImmutableListMultimap.m15705of((Object) k, (Object) v2, (Object) k2, (Object) v3);
    }

    @Override // com.google.common.collect.AbstractC2962a, p149l.bm10
    @Deprecated
    public final boolean putAll(bm10<? extends K, ? extends V> bm10Var) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableMultimap<K, V> m15736of(K k, V v2, K k2, V v3, K k3, V v4) {
        return ImmutableListMultimap.m15706of((Object) k, (Object) v2, (Object) k2, (Object) v3, (Object) k3, (Object) v4);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableMultimap<K, V> m15737of(K k, V v2, K k2, V v3, K k3, V v4, K k4, V v5) {
        return ImmutableListMultimap.m15707of((Object) k, (Object) v2, (Object) k2, (Object) v3, (Object) k3, (Object) v4, (Object) k4, (Object) v5);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableMultimap<K, V> m15738of(K k, V v2, K k2, V v3, K k3, V v4, K k4, V v5, K k5, V v6) {
        return ImmutableListMultimap.m15708of((Object) k, (Object) v2, (Object) k2, (Object) v3, (Object) k3, (Object) v4, (Object) k4, (Object) v5, (Object) k5, (Object) v6);
    }

    public static <K, V> ImmutableMultimap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return ImmutableListMultimap.copyOf((Iterable) iterable);
    }
}
