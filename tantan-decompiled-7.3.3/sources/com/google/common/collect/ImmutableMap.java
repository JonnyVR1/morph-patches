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
import p153l.AbstractC18359l7;
import p153l.gyj0;
import p153l.se5;

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
                public gyj0<Map.Entry<K, V>> iterator() {
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

        public abstract gyj0<Map.Entry<K, V>> entryIterator();

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public /* bridge */ /* synthetic */ Set entrySet() {
            return super.entrySet();
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public /* bridge */ /* synthetic */ Set keySet() {
            return super.keySet();
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map, p153l.jx2
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
            gyj0<Map.Entry<K, V>> it = immutableMap.entrySet().iterator();
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
            C2809b<K, V> c2809bMakeBuilder = makeBuilder(objArr.length);
            for (int i = 0; i < objArr.length; i++) {
                c2809bMakeBuilder.mo15715g(objArr[i], objArr2[i]);
            }
            return c2809bMakeBuilder.mo15714d();
        }

        public C2809b<K, V> makeBuilder(int i) {
            return new C2809b<>(i);
        }

        public final Object readResolve() {
            Object obj = this.keys;
            if (!(obj instanceof ImmutableSet)) {
                return legacyReadResolve();
            }
            ImmutableSet immutableSet = (ImmutableSet) obj;
            ImmutableCollection immutableCollection = (ImmutableCollection) this.values;
            C2809b<K, V> c2809bMakeBuilder = makeBuilder(immutableSet.size());
            gyj0 it = immutableSet.iterator();
            gyj0 it2 = immutableCollection.iterator();
            while (it.hasNext()) {
                c2809bMakeBuilder.mo15715g(it.next(), it2.next());
            }
            return c2809bMakeBuilder.mo15714d();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableMap$a */
    public class C2808a extends gyj0<K> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ gyj0 f10924a;

        public C2808a(ImmutableMap immutableMap, gyj0 gyj0Var) {
            this.f10924a = gyj0Var;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f10924a.hasNext();
        }

        @Override // java.util.Iterator
        public K next() {
            return (K) ((Map.Entry) this.f10924a.next()).getKey();
        }
    }

    public static <K, V> C2809b<K, V> builder() {
        return new C2809b<>();
    }

    public static <K, V> C2809b<K, V> builderWithExpectedSize(int i) {
        se5.m185516b(i, "expectedSize");
        return new C2809b<>(i);
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
        se5.m185515a(k, v2);
        return new AbstractMap.SimpleImmutableEntry(k, v2);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableMap<K, V> m15779of(K k, V v2, K k2, V v3, K k3, V v4, K k4, V v5, K k5, V v6, K k6, V v7, K k7, V v8, K k8, V v9, K k9, V v10, K k10, V v11) {
        se5.m185515a(k, v2);
        se5.m185515a(k2, v3);
        se5.m185515a(k3, v4);
        se5.m185515a(k4, v5);
        se5.m185515a(k5, v6);
        se5.m185515a(k6, v7);
        se5.m185515a(k7, v8);
        se5.m185515a(k8, v9);
        se5.m185515a(k9, v10);
        se5.m185515a(k10, v11);
        return RegularImmutableMap.create(10, new Object[]{k, v2, k2, v3, k3, v4, k4, v5, k5, v6, k6, v7, k7, v8, k8, v9, k9, v10, k10, v11});
    }

    @SafeVarargs
    public static <K, V> ImmutableMap<K, V> ofEntries(Map.Entry<? extends K, ? extends V>... entryArr) {
        return copyOf(Arrays.asList(entryArr));
    }

    public ImmutableSetMultimap<K, V> asMultimap() {
        if (isEmpty()) {
            return ImmutableSetMultimap.m15835of();
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
        return Maps.m16088i(this, obj);
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
        return Sets.m16173d(entrySet());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean isHashCodeFast() {
        return false;
    }

    public abstract boolean isPartialView();

    public gyj0<K> keyIterator() {
        return new C2808a(this, entrySet().iterator());
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
        return Maps.m16105z(this);
    }

    @Override // java.util.Map, p153l.jx2
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
        public class C2807a extends gyj0<Map.Entry<K, ImmutableSet<V>>> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Iterator f10922a;

            /* JADX INFO: renamed from: com.google.common.collect.ImmutableMap$MapViewOfValuesAsSingletonSets$a$a */
            public class a extends AbstractC18359l7<K, ImmutableSet<V>> {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ Map.Entry f10923a;

                public a(C2807a c2807a, Map.Entry entry) {
                    this.f10923a = entry;
                }

                @Override // p153l.AbstractC18359l7, java.util.Map.Entry
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public ImmutableSet<V> getValue() {
                    return ImmutableSet.m15823of(this.f10923a.getValue());
                }

                @Override // p153l.AbstractC18359l7, java.util.Map.Entry
                public K getKey() {
                    return (K) this.f10923a.getKey();
                }
            }

            public C2807a(MapViewOfValuesAsSingletonSets mapViewOfValuesAsSingletonSets, Iterator it) {
                this.f10922a = it;
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, ImmutableSet<V>> next() {
                return new a(this, (Map.Entry) this.f10922a.next());
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f10922a.hasNext();
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
        public gyj0<Map.Entry<K, ImmutableSet<V>>> entryIterator() {
            return new C2807a(this, ImmutableMap.this.entrySet().iterator());
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public ImmutableSet<V> get(Object obj) {
            Object obj2 = ImmutableMap.this.get(obj);
            if (obj2 == null) {
                return null;
            }
            return ImmutableSet.m15823of(obj2);
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

        public /* synthetic */ MapViewOfValuesAsSingletonSets(ImmutableMap immutableMap, C2808a c2808a) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableMap$b */
    public static class C2809b<K, V> {

        /* JADX INFO: renamed from: a */
        public Comparator<? super V> f10925a;

        /* JADX INFO: renamed from: b */
        public Object[] f10926b;

        /* JADX INFO: renamed from: c */
        public int f10927c;

        /* JADX INFO: renamed from: d */
        public boolean f10928d;

        /* JADX INFO: renamed from: e */
        public a f10929e;

        /* JADX INFO: renamed from: com.google.common.collect.ImmutableMap$b$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public final Object f10930a;

            /* JADX INFO: renamed from: b */
            public final Object f10931b;

            /* JADX INFO: renamed from: c */
            public final Object f10932c;

            public a(Object obj, Object obj2, Object obj3) {
                this.f10930a = obj;
                this.f10931b = obj2;
                this.f10932c = obj3;
            }

            /* JADX INFO: renamed from: a */
            public IllegalArgumentException m15786a() {
                String strValueOf = String.valueOf(this.f10930a);
                String strValueOf2 = String.valueOf(this.f10931b);
                String strValueOf3 = String.valueOf(this.f10930a);
                String strValueOf4 = String.valueOf(this.f10932c);
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

        public C2809b(int i) {
            this.f10926b = new Object[i * 2];
            this.f10927c = 0;
            this.f10928d = false;
        }

        /* JADX INFO: renamed from: e */
        private void m15782e(int i) {
            int i2 = i * 2;
            Object[] objArr = this.f10926b;
            if (i2 > objArr.length) {
                this.f10926b = Arrays.copyOf(objArr, ImmutableCollection.AbstractC2801b.m15736e(objArr.length, i2));
                this.f10928d = false;
            }
        }

        /* JADX INFO: renamed from: k */
        public static <V> void m15783k(Object[] objArr, int i, Comparator<? super V> comparator) {
            Map.Entry[] entryArr = new Map.Entry[i];
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = i2 * 2;
                Object obj = objArr[i3];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i3 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i2] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i, Ordering.from(comparator).onResultOf(Maps.m16076K()));
            for (int i4 = 0; i4 < i; i4++) {
                int i5 = i4 * 2;
                objArr[i5] = entryArr[i4].getKey();
                objArr[i5 + 1] = entryArr[i4].getValue();
            }
        }

        /* JADX INFO: renamed from: a */
        public ImmutableMap<K, V> mo15712a() {
            return mo15714d();
        }

        /* JADX INFO: renamed from: b */
        public final ImmutableMap<K, V> m15784b(boolean z) {
            Object[] objArrM15785f;
            a aVar;
            a aVar2;
            if (z && (aVar2 = this.f10929e) != null) {
                throw aVar2.m15786a();
            }
            int length = this.f10927c;
            if (this.f10925a == null) {
                objArrM15785f = this.f10926b;
            } else {
                if (this.f10928d) {
                    this.f10926b = Arrays.copyOf(this.f10926b, length * 2);
                }
                objArrM15785f = this.f10926b;
                if (!z) {
                    objArrM15785f = m15785f(objArrM15785f, this.f10927c);
                    if (objArrM15785f.length < this.f10926b.length) {
                        length = objArrM15785f.length >>> 1;
                    }
                }
                m15783k(objArrM15785f, length, this.f10925a);
            }
            this.f10928d = true;
            RegularImmutableMap regularImmutableMapCreate = RegularImmutableMap.create(length, objArrM15785f, this);
            if (!z || (aVar = this.f10929e) == null) {
                return regularImmutableMapCreate;
            }
            throw aVar.m15786a();
        }

        /* JADX INFO: renamed from: c */
        public ImmutableMap<K, V> mo15713c() {
            return m15784b(false);
        }

        /* JADX INFO: renamed from: d */
        public ImmutableMap<K, V> mo15714d() {
            return m15784b(true);
        }

        /* JADX INFO: renamed from: f */
        public final Object[] m15785f(Object[] objArr, int i) {
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
        public C2809b<K, V> mo15715g(K k, V v2) {
            m15782e(this.f10927c + 1);
            se5.m185515a(k, v2);
            Object[] objArr = this.f10926b;
            int i = this.f10927c;
            objArr[i * 2] = k;
            objArr[(i * 2) + 1] = v2;
            this.f10927c = i + 1;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C2809b<K, V> mo15716h(Map.Entry<? extends K, ? extends V> entry) {
            return mo15715g(entry.getKey(), entry.getValue());
        }

        /* JADX INFO: renamed from: i */
        public C2809b<K, V> mo15717i(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                m15782e(this.f10927c + ((Collection) iterable).size());
            }
            Iterator<? extends Map.Entry<? extends K, ? extends V>> it = iterable.iterator();
            while (it.hasNext()) {
                mo15716h(it.next());
            }
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C2809b<K, V> mo15718j(Map<? extends K, ? extends V> map) {
            return mo15717i(map.entrySet());
        }

        public C2809b() {
            this(4);
        }
    }

    public static <K, V> ImmutableMap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        C2809b c2809b = new C2809b(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        c2809b.mo15717i(iterable);
        return c2809b.mo15712a();
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableMap<K, V> m15770of(K k, V v2) {
        se5.m185515a(k, v2);
        return RegularImmutableMap.create(1, new Object[]{k, v2});
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableMap<K, V> m15771of(K k, V v2, K k2, V v3) {
        se5.m185515a(k, v2);
        se5.m185515a(k2, v3);
        return RegularImmutableMap.create(2, new Object[]{k, v2, k2, v3});
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableMap<K, V> m15772of(K k, V v2, K k2, V v3, K k3, V v4) {
        se5.m185515a(k, v2);
        se5.m185515a(k2, v3);
        se5.m185515a(k3, v4);
        return RegularImmutableMap.create(3, new Object[]{k, v2, k2, v3, k3, v4});
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableMap<K, V> m15773of(K k, V v2, K k2, V v3, K k3, V v4, K k4, V v5) {
        se5.m185515a(k, v2);
        se5.m185515a(k2, v3);
        se5.m185515a(k3, v4);
        se5.m185515a(k4, v5);
        return RegularImmutableMap.create(4, new Object[]{k, v2, k2, v3, k3, v4, k4, v5});
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableMap<K, V> m15774of(K k, V v2, K k2, V v3, K k3, V v4, K k4, V v5, K k5, V v6) {
        se5.m185515a(k, v2);
        se5.m185515a(k2, v3);
        se5.m185515a(k3, v4);
        se5.m185515a(k4, v5);
        se5.m185515a(k5, v6);
        return RegularImmutableMap.create(5, new Object[]{k, v2, k2, v3, k3, v4, k4, v5, k5, v6});
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableMap<K, V> m15775of(K k, V v2, K k2, V v3, K k3, V v4, K k4, V v5, K k5, V v6, K k6, V v7) {
        se5.m185515a(k, v2);
        se5.m185515a(k2, v3);
        se5.m185515a(k3, v4);
        se5.m185515a(k4, v5);
        se5.m185515a(k5, v6);
        se5.m185515a(k6, v7);
        return RegularImmutableMap.create(6, new Object[]{k, v2, k2, v3, k3, v4, k4, v5, k5, v6, k6, v7});
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableMap<K, V> m15776of(K k, V v2, K k2, V v3, K k3, V v4, K k4, V v5, K k5, V v6, K k6, V v7, K k7, V v8) {
        se5.m185515a(k, v2);
        se5.m185515a(k2, v3);
        se5.m185515a(k3, v4);
        se5.m185515a(k4, v5);
        se5.m185515a(k5, v6);
        se5.m185515a(k6, v7);
        se5.m185515a(k7, v8);
        return RegularImmutableMap.create(7, new Object[]{k, v2, k2, v3, k3, v4, k4, v5, k5, v6, k6, v7, k7, v8});
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableMap<K, V> m15777of(K k, V v2, K k2, V v3, K k3, V v4, K k4, V v5, K k5, V v6, K k6, V v7, K k7, V v8, K k8, V v9) {
        se5.m185515a(k, v2);
        se5.m185515a(k2, v3);
        se5.m185515a(k3, v4);
        se5.m185515a(k4, v5);
        se5.m185515a(k5, v6);
        se5.m185515a(k6, v7);
        se5.m185515a(k7, v8);
        se5.m185515a(k8, v9);
        return RegularImmutableMap.create(8, new Object[]{k, v2, k2, v3, k3, v4, k4, v5, k5, v6, k6, v7, k7, v8, k8, v9});
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableMap<K, V> m15778of(K k, V v2, K k2, V v3, K k3, V v4, K k4, V v5, K k5, V v6, K k6, V v7, K k7, V v8, K k8, V v9, K k9, V v10) {
        se5.m185515a(k, v2);
        se5.m185515a(k2, v3);
        se5.m185515a(k3, v4);
        se5.m185515a(k4, v5);
        se5.m185515a(k5, v6);
        se5.m185515a(k6, v7);
        se5.m185515a(k7, v8);
        se5.m185515a(k8, v9);
        se5.m185515a(k9, v10);
        return RegularImmutableMap.create(9, new Object[]{k, v2, k2, v3, k3, v4, k4, v5, k5, v6, k6, v7, k7, v8, k8, v9, k9, v10});
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableMap<K, V> m15769of() {
        return (ImmutableMap<K, V>) RegularImmutableMap.EMPTY;
    }
}
