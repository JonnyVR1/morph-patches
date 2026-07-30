package com.google.common.collect;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import p149l.AbstractC19437q7;
import p149l.dpj0;
import p149l.sd5;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ImmutableMap<K, V> implements Map<K, V>, Serializable {
    static final Map.Entry<?, ?>[] EMPTY_ENTRY_ARRAY = new Map.Entry[0];
    private transient ImmutableSet<Map.Entry<K, V>> entrySet;
    private transient ImmutableSet<K> keySet;
    private transient ImmutableSetMultimap<K, V> multimapView;
    private transient ImmutableCollection<V> values;

    public static abstract class IteratorBasedImmutableMap<K, V> extends ImmutableMap<K, V> {
        @Override // com.google.common.collect.ImmutableMap
        public ImmutableSet<Map.Entry<K, V>> createEntrySet() {
            return new ImmutableMapEntrySet<K, V>() { // from class: com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap.1EntrySetImpl
                @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
                public dpj0<Map.Entry<K, V>> iterator() {
                    return IteratorBasedImmutableMap.this.entryIterator();
                }

                @Override // com.google.common.collect.ImmutableMapEntrySet
                public ImmutableMap<K, V> map() {
                    return IteratorBasedImmutableMap.this;
                }
            };
        }

        @Override // com.google.common.collect.ImmutableMap
        public ImmutableSet<K> createKeySet() {
            return new ImmutableMapKeySet(this);
        }

        @Override // com.google.common.collect.ImmutableMap
        public ImmutableCollection<V> createValues() {
            return new ImmutableMapValues(this);
        }

        public abstract dpj0<Map.Entry<K, V>> entryIterator();

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public /* bridge */ /* synthetic */ Set entrySet() {
            return super.entrySet();
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public /* bridge */ /* synthetic */ Set keySet() {
            return super.keySet();
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map, p149l.tw2
        public /* bridge */ /* synthetic */ Collection values() {
            return super.values();
        }
    }

    public static class SerializedForm<K, V> implements Serializable {
        private static final boolean USE_LEGACY_SERIALIZATION = true;
        private static final long serialVersionUID = 0;
        private final Object keys;
        private final Object values;

        public SerializedForm(ImmutableMap<K, V> immutableMap) {
            Object[] objArr = new Object[immutableMap.size()];
            Object[] objArr2 = new Object[immutableMap.size()];
            dpj0<Map.Entry<K, V>> it = immutableMap.entrySet().iterator();
            int i = 0;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                objArr[i] = next.getKey();
                objArr2[i] = next.getValue();
                i++;
            }
            this.keys = objArr;
            this.values = objArr2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Object legacyReadResolve() {
            Object[] objArr = (Object[]) this.keys;
            Object[] objArr2 = (Object[]) this.values;
            C2786b<K, V> c2786bMakeBuilder = makeBuilder(objArr.length);
            for (int i = 0; i < objArr.length; i++) {
                c2786bMakeBuilder.mo15661g(objArr[i], objArr2[i]);
            }
            return c2786bMakeBuilder.mo15660d();
        }

        public C2786b<K, V> makeBuilder(int i) {
            return new C2786b<>(i);
        }

        public final Object readResolve() {
            Object obj = this.keys;
            if (!(obj instanceof ImmutableSet)) {
                return legacyReadResolve();
            }
            ImmutableSet immutableSet = (ImmutableSet) obj;
            ImmutableCollection immutableCollection = (ImmutableCollection) this.values;
            C2786b<K, V> c2786bMakeBuilder = makeBuilder(immutableSet.size());
            dpj0 it = immutableSet.iterator();
            dpj0 it2 = immutableCollection.iterator();
            while (it.hasNext()) {
                c2786bMakeBuilder.mo15661g(it.next(), it2.next());
            }
            return c2786bMakeBuilder.mo15660d();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableMap$a */
    public class C2785a extends dpj0<K> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ dpj0 f10887a;

        public C2785a(ImmutableMap immutableMap, dpj0 dpj0Var) {
            this.f10887a = dpj0Var;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f10887a.hasNext();
        }

        @Override // java.util.Iterator
        public K next() {
            return (K) ((Map.Entry) this.f10887a.next()).getKey();
        }
    }

    public static <K, V> C2786b<K, V> builder() {
        return new C2786b<>();
    }

    public static <K, V> C2786b<K, V> builderWithExpectedSize(int i) {
        sd5.m183444b(i, "expectedSize");
        return new C2786b<>(i);
    }

    public static void checkNoConflict(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw conflictException(str, obj, obj2);
        }
    }

    public static IllegalArgumentException conflictException(String str, Object obj, Object obj2) {
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(obj2);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + strValueOf.length() + strValueOf2.length());
        sb.append("Multiple entries with same ");
        sb.append(str);
        sb.append(": ");
        sb.append(strValueOf);
        sb.append(" and ");
        sb.append(strValueOf2);
        return new IllegalArgumentException(sb.toString());
    }

    public static <K, V> ImmutableMap<K, V> copyOf(Map<? extends K, ? extends V> map) {
        if ((map instanceof ImmutableMap) && !(map instanceof SortedMap)) {
            ImmutableMap<K, V> immutableMap = (ImmutableMap) map;
            if (!immutableMap.isPartialView()) {
                return immutableMap;
            }
        }
        return copyOf(map.entrySet());
    }

    public static <K, V> Map.Entry<K, V> entryOf(K k, V v2) {
        sd5.m183443a(k, v2);
        return new AbstractMap.SimpleImmutableEntry(k, v2);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableMap<K, V> m15725of(K k, V v2, K k2, V v3, K k3, V v4, K k4, V v5, K k5, V v6, K k6, V v7, K k7, V v8, K k8, V v9, K k9, V v10, K k10, V v11) {
        sd5.m183443a(k, v2);
        sd5.m183443a(k2, v3);
        sd5.m183443a(k3, v4);
        sd5.m183443a(k4, v5);
        sd5.m183443a(k5, v6);
        sd5.m183443a(k6, v7);
        sd5.m183443a(k7, v8);
        sd5.m183443a(k8, v9);
        sd5.m183443a(k9, v10);
        sd5.m183443a(k10, v11);
        return RegularImmutableMap.create(10, new Object[]{k, v2, k2, v3, k3, v4, k4, v5, k5, v6, k6, v7, k7, v8, k8, v9, k9, v10, k10, v11});
    }

    @SafeVarargs
    public static <K, V> ImmutableMap<K, V> ofEntries(Map.Entry<? extends K, ? extends V>... entryArr) {
        return copyOf(Arrays.asList(entryArr));
    }

    public ImmutableSetMultimap<K, V> asMultimap() {
        if (isEmpty()) {
            return ImmutableSetMultimap.m15781of();
        }
        ImmutableSetMultimap<K, V> immutableSetMultimap = this.multimapView;
        if (immutableSetMultimap != null) {
            return immutableSetMultimap;
        }
        ImmutableSetMultimap<K, V> immutableSetMultimap2 = new ImmutableSetMultimap<>(new MapViewOfValuesAsSingletonSets(this, null), size(), null);
        this.multimapView = immutableSetMultimap2;
        return immutableSetMultimap2;
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public abstract ImmutableSet<Map.Entry<K, V>> createEntrySet();

    public abstract ImmutableSet<K> createKeySet();

    public abstract ImmutableCollection<V> createValues();

    @Override // java.util.Map
    public ImmutableSet<Map.Entry<K, V>> entrySet() {
        ImmutableSet<Map.Entry<K, V>> immutableSet = this.entrySet;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<Map.Entry<K, V>> immutableSetCreateEntrySet = createEntrySet();
        this.entrySet = immutableSetCreateEntrySet;
        return immutableSetCreateEntrySet;
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return Maps.m16034i(this, obj);
    }

    @Override // java.util.Map
    public abstract V get(Object obj);

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v2) {
        V v3 = get(obj);
        return v3 != null ? v3 : v2;
    }

    @Override // java.util.Map
    public int hashCode() {
        return Sets.m16119d(entrySet());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean isHashCodeFast() {
        return false;
    }

    public abstract boolean isPartialView();

    public dpj0<K> keyIterator() {
        return new C2785a(this, entrySet().iterator());
    }

    @Override // java.util.Map
    public ImmutableSet<K> keySet() {
        ImmutableSet<K> immutableSet = this.keySet;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<K> immutableSetCreateKeySet = createKeySet();
        this.keySet = immutableSetCreateKeySet;
        return immutableSetCreateKeySet;
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k, V v2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return Maps.m16051z(this);
    }

    @Override // java.util.Map, p149l.tw2
    public ImmutableCollection<V> values() {
        ImmutableCollection<V> immutableCollection = this.values;
        if (immutableCollection != null) {
            return immutableCollection;
        }
        ImmutableCollection<V> immutableCollectionCreateValues = createValues();
        this.values = immutableCollectionCreateValues;
        return immutableCollectionCreateValues;
    }

    public Object writeReplace() {
        return new SerializedForm(this);
    }

    public final class MapViewOfValuesAsSingletonSets extends IteratorBasedImmutableMap<K, ImmutableSet<V>> {

        /* JADX INFO: renamed from: com.google.common.collect.ImmutableMap$MapViewOfValuesAsSingletonSets$a */
        public class C2784a extends dpj0<Map.Entry<K, ImmutableSet<V>>> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Iterator f10885a;

            /* JADX INFO: renamed from: com.google.common.collect.ImmutableMap$MapViewOfValuesAsSingletonSets$a$a */
            public class a extends AbstractC19437q7<K, ImmutableSet<V>> {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ Map.Entry f10886a;

                public a(C2784a c2784a, Map.Entry entry) {
                    this.f10886a = entry;
                }

                @Override // p149l.AbstractC19437q7, java.util.Map.Entry
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public ImmutableSet<V> getValue() {
                    return ImmutableSet.m15769of(this.f10886a.getValue());
                }

                @Override // p149l.AbstractC19437q7, java.util.Map.Entry
                public K getKey() {
                    return (K) this.f10886a.getKey();
                }
            }

            public C2784a(MapViewOfValuesAsSingletonSets mapViewOfValuesAsSingletonSets, Iterator it) {
                this.f10885a = it;
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, ImmutableSet<V>> next() {
                return new a(this, (Map.Entry) this.f10885a.next());
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f10885a.hasNext();
            }
        }

        private MapViewOfValuesAsSingletonSets() {
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public boolean containsKey(Object obj) {
            return ImmutableMap.this.containsKey(obj);
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        public ImmutableSet<K> createKeySet() {
            return ImmutableMap.this.keySet();
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap
        public dpj0<Map.Entry<K, ImmutableSet<V>>> entryIterator() {
            return new C2784a(this, ImmutableMap.this.entrySet().iterator());
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public ImmutableSet<V> get(Object obj) {
            Object obj2 = ImmutableMap.this.get(obj);
            if (obj2 == null) {
                return null;
            }
            return ImmutableSet.m15769of(obj2);
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public int hashCode() {
            return ImmutableMap.this.hashCode();
        }

        @Override // com.google.common.collect.ImmutableMap
        public boolean isHashCodeFast() {
            return ImmutableMap.this.isHashCodeFast();
        }

        @Override // com.google.common.collect.ImmutableMap
        public boolean isPartialView() {
            return ImmutableMap.this.isPartialView();
        }

        @Override // java.util.Map
        public int size() {
            return ImmutableMap.this.size();
        }

        public /* synthetic */ MapViewOfValuesAsSingletonSets(ImmutableMap immutableMap, C2785a c2785a) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableMap$b */
    public static class C2786b<K, V> {

        /* JADX INFO: renamed from: a */
        public Comparator<? super V> f10888a;

        /* JADX INFO: renamed from: b */
        public Object[] f10889b;

        /* JADX INFO: renamed from: c */
        public int f10890c;

        /* JADX INFO: renamed from: d */
        public boolean f10891d;

        /* JADX INFO: renamed from: e */
        public a f10892e;

        /* JADX INFO: renamed from: com.google.common.collect.ImmutableMap$b$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public final Object f10893a;

            /* JADX INFO: renamed from: b */
            public final Object f10894b;

            /* JADX INFO: renamed from: c */
            public final Object f10895c;

            public a(Object obj, Object obj2, Object obj3) {
                this.f10893a = obj;
                this.f10894b = obj2;
                this.f10895c = obj3;
            }

            /* JADX INFO: renamed from: a */
            public IllegalArgumentException m15732a() {
                String strValueOf = String.valueOf(this.f10893a);
                String strValueOf2 = String.valueOf(this.f10894b);
                String strValueOf3 = String.valueOf(this.f10893a);
                String strValueOf4 = String.valueOf(this.f10895c);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 39 + strValueOf2.length() + strValueOf3.length() + strValueOf4.length());
                sb.append("Multiple entries with same key: ");
                sb.append(strValueOf);
                sb.append("=");
                sb.append(strValueOf2);
                sb.append(" and ");
                sb.append(strValueOf3);
                sb.append("=");
                sb.append(strValueOf4);
                return new IllegalArgumentException(sb.toString());
            }
        }

        public C2786b(int i) {
            this.f10889b = new Object[i * 2];
            this.f10890c = 0;
            this.f10891d = false;
        }

        /* JADX INFO: renamed from: e */
        private void m15728e(int i) {
            int i2 = i * 2;
            Object[] objArr = this.f10889b;
            if (i2 > objArr.length) {
                this.f10889b = Arrays.copyOf(objArr, ImmutableCollection.AbstractC2778b.m15682e(objArr.length, i2));
                this.f10891d = false;
            }
        }

        /* JADX INFO: renamed from: k */
        public static <V> void m15729k(Object[] objArr, int i, Comparator<? super V> comparator) {
            Map.Entry[] entryArr = new Map.Entry[i];
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = i2 * 2;
                Object obj = objArr[i3];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i3 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i2] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i, Ordering.from(comparator).onResultOf(Maps.m16022K()));
            for (int i4 = 0; i4 < i; i4++) {
                int i5 = i4 * 2;
                objArr[i5] = entryArr[i4].getKey();
                objArr[i5 + 1] = entryArr[i4].getValue();
            }
        }

        /* JADX INFO: renamed from: a */
        public ImmutableMap<K, V> mo15658a() {
            return mo15660d();
        }

        /* JADX INFO: renamed from: b */
        public final ImmutableMap<K, V> m15730b(boolean z) {
            Object[] objArrM15731f;
            a aVar;
            a aVar2;
            if (z && (aVar2 = this.f10892e) != null) {
                throw aVar2.m15732a();
            }
            int length = this.f10890c;
            if (this.f10888a == null) {
                objArrM15731f = this.f10889b;
            } else {
                if (this.f10891d) {
                    this.f10889b = Arrays.copyOf(this.f10889b, length * 2);
                }
                objArrM15731f = this.f10889b;
                if (!z) {
                    objArrM15731f = m15731f(objArrM15731f, this.f10890c);
                    if (objArrM15731f.length < this.f10889b.length) {
                        length = objArrM15731f.length >>> 1;
                    }
                }
                m15729k(objArrM15731f, length, this.f10888a);
            }
            this.f10891d = true;
            RegularImmutableMap regularImmutableMapCreate = RegularImmutableMap.create(length, objArrM15731f, this);
            if (!z || (aVar = this.f10892e) == null) {
                return regularImmutableMapCreate;
            }
            throw aVar.m15732a();
        }

        /* JADX INFO: renamed from: c */
        public ImmutableMap<K, V> mo15659c() {
            return m15730b(false);
        }

        /* JADX INFO: renamed from: d */
        public ImmutableMap<K, V> mo15660d() {
            return m15730b(true);
        }

        /* JADX INFO: renamed from: f */
        public final Object[] m15731f(Object[] objArr, int i) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i2 = i - 1; i2 >= 0; i2--) {
                Object obj = objArr[i2 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i2);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[(i - bitSet.cardinality()) * 2];
            int i3 = 0;
            int i4 = 0;
            while (i3 < i * 2) {
                if (bitSet.get(i3 >>> 1)) {
                    i3 += 2;
                } else {
                    int i5 = i4 + 1;
                    int i6 = i3 + 1;
                    Object obj2 = objArr[i3];
                    Objects.requireNonNull(obj2);
                    objArr2[i4] = obj2;
                    i4 += 2;
                    i3 += 2;
                    Object obj3 = objArr[i6];
                    Objects.requireNonNull(obj3);
                    objArr2[i5] = obj3;
                }
            }
            return objArr2;
        }

        /* JADX INFO: renamed from: g */
        public C2786b<K, V> mo15661g(K k, V v2) {
            m15728e(this.f10890c + 1);
            sd5.m183443a(k, v2);
            Object[] objArr = this.f10889b;
            int i = this.f10890c;
            objArr[i * 2] = k;
            objArr[(i * 2) + 1] = v2;
            this.f10890c = i + 1;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C2786b<K, V> mo15662h(Map.Entry<? extends K, ? extends V> entry) {
            return mo15661g(entry.getKey(), entry.getValue());
        }

        /* JADX INFO: renamed from: i */
        public C2786b<K, V> mo15663i(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                m15728e(this.f10890c + ((Collection) iterable).size());
            }
            Iterator<? extends Map.Entry<? extends K, ? extends V>> it = iterable.iterator();
            while (it.hasNext()) {
                mo15662h(it.next());
            }
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C2786b<K, V> mo15664j(Map<? extends K, ? extends V> map) {
            return mo15663i(map.entrySet());
        }

        public C2786b() {
            this(4);
        }
    }

    public static <K, V> ImmutableMap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        C2786b c2786b = new C2786b(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        c2786b.mo15663i(iterable);
        return c2786b.mo15658a();
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableMap<K, V> m15716of(K k, V v2) {
        sd5.m183443a(k, v2);
        return RegularImmutableMap.create(1, new Object[]{k, v2});
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableMap<K, V> m15717of(K k, V v2, K k2, V v3) {
        sd5.m183443a(k, v2);
        sd5.m183443a(k2, v3);
        return RegularImmutableMap.create(2, new Object[]{k, v2, k2, v3});
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableMap<K, V> m15718of(K k, V v2, K k2, V v3, K k3, V v4) {
        sd5.m183443a(k, v2);
        sd5.m183443a(k2, v3);
        sd5.m183443a(k3, v4);
        return RegularImmutableMap.create(3, new Object[]{k, v2, k2, v3, k3, v4});
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableMap<K, V> m15719of(K k, V v2, K k2, V v3, K k3, V v4, K k4, V v5) {
        sd5.m183443a(k, v2);
        sd5.m183443a(k2, v3);
        sd5.m183443a(k3, v4);
        sd5.m183443a(k4, v5);
        return RegularImmutableMap.create(4, new Object[]{k, v2, k2, v3, k3, v4, k4, v5});
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableMap<K, V> m15720of(K k, V v2, K k2, V v3, K k3, V v4, K k4, V v5, K k5, V v6) {
        sd5.m183443a(k, v2);
        sd5.m183443a(k2, v3);
        sd5.m183443a(k3, v4);
        sd5.m183443a(k4, v5);
        sd5.m183443a(k5, v6);
        return RegularImmutableMap.create(5, new Object[]{k, v2, k2, v3, k3, v4, k4, v5, k5, v6});
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableMap<K, V> m15721of(K k, V v2, K k2, V v3, K k3, V v4, K k4, V v5, K k5, V v6, K k6, V v7) {
        sd5.m183443a(k, v2);
        sd5.m183443a(k2, v3);
        sd5.m183443a(k3, v4);
        sd5.m183443a(k4, v5);
        sd5.m183443a(k5, v6);
        sd5.m183443a(k6, v7);
        return RegularImmutableMap.create(6, new Object[]{k, v2, k2, v3, k3, v4, k4, v5, k5, v6, k6, v7});
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableMap<K, V> m15722of(K k, V v2, K k2, V v3, K k3, V v4, K k4, V v5, K k5, V v6, K k6, V v7, K k7, V v8) {
        sd5.m183443a(k, v2);
        sd5.m183443a(k2, v3);
        sd5.m183443a(k3, v4);
        sd5.m183443a(k4, v5);
        sd5.m183443a(k5, v6);
        sd5.m183443a(k6, v7);
        sd5.m183443a(k7, v8);
        return RegularImmutableMap.create(7, new Object[]{k, v2, k2, v3, k3, v4, k4, v5, k5, v6, k6, v7, k7, v8});
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableMap<K, V> m15723of(K k, V v2, K k2, V v3, K k3, V v4, K k4, V v5, K k5, V v6, K k6, V v7, K k7, V v8, K k8, V v9) {
        sd5.m183443a(k, v2);
        sd5.m183443a(k2, v3);
        sd5.m183443a(k3, v4);
        sd5.m183443a(k4, v5);
        sd5.m183443a(k5, v6);
        sd5.m183443a(k6, v7);
        sd5.m183443a(k7, v8);
        sd5.m183443a(k8, v9);
        return RegularImmutableMap.create(8, new Object[]{k, v2, k2, v3, k3, v4, k4, v5, k5, v6, k6, v7, k7, v8, k8, v9});
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableMap<K, V> m15724of(K k, V v2, K k2, V v3, K k3, V v4, K k4, V v5, K k5, V v6, K k6, V v7, K k7, V v8, K k8, V v9, K k9, V v10) {
        sd5.m183443a(k, v2);
        sd5.m183443a(k2, v3);
        sd5.m183443a(k3, v4);
        sd5.m183443a(k4, v5);
        sd5.m183443a(k5, v6);
        sd5.m183443a(k6, v7);
        sd5.m183443a(k7, v8);
        sd5.m183443a(k8, v9);
        sd5.m183443a(k9, v10);
        return RegularImmutableMap.create(9, new Object[]{k, v2, k2, v3, k3, v4, k4, v5, k5, v6, k6, v7, k7, v8, k8, v9, k9, v10});
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableMap<K, V> m15715of() {
        return (ImmutableMap<K, V>) RegularImmutableMap.EMPTY;
    }
}
