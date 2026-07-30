package com.google.common.collect;

import com.clevertap.android.sdk.Constants;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.SortedMap;
import p153l.akq;
import p153l.gyj0;
import p153l.hkc0;
import p153l.se5;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
public final class ImmutableSortedMap<K, V> extends ImmutableSortedMapFauxverideShim<K, V> implements NavigableMap<K, V> {
    private static final long serialVersionUID = 0;
    private transient ImmutableSortedMap<K, V> descendingMap;
    private final transient RegularImmutableSortedSet<K> keySet;
    private final transient ImmutableList<V> valueList;
    private static final Comparator<Comparable> NATURAL_ORDER = Ordering.natural();
    private static final ImmutableSortedMap<Comparable, Object> NATURAL_EMPTY_MAP = new ImmutableSortedMap<>(ImmutableSortedSet.emptySet(Ordering.natural()), ImmutableList.m15739of());

    public static class SerializedForm<K, V> extends ImmutableMap.SerializedForm<K, V> {
        private static final long serialVersionUID = 0;
        private final Comparator<? super K> comparator;

        public SerializedForm(ImmutableSortedMap<K, V> immutableSortedMap) {
            super(immutableSortedMap);
            this.comparator = immutableSortedMap.comparator();
        }

        @Override // com.google.common.collect.ImmutableMap.SerializedForm
        public C2830b<K, V> makeBuilder(int i) {
            return new C2830b<>(this.comparator);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableSortedMap$a */
    public class C2829a implements Comparator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Comparator f10964a;

        public C2829a(Comparator comparator) {
            this.f10964a = comparator;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Map.Entry<K, V> entry, Map.Entry<K, V> entry2) {
            Objects.requireNonNull(entry);
            Objects.requireNonNull(entry2);
            return this.f10964a.compare(entry.getKey(), entry2.getKey());
        }
    }

    public ImmutableSortedMap(RegularImmutableSortedSet<K> regularImmutableSortedSet, ImmutableList<V> immutableList, ImmutableSortedMap<K, V> immutableSortedMap) {
        this.keySet = regularImmutableSortedSet;
        this.valueList = immutableList;
        this.descendingMap = immutableSortedMap;
    }

    public static <K, V> ImmutableSortedMap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable, Comparator<? super K> comparator) {
        return fromEntries((Comparator) xn80.m212111p(comparator), false, iterable);
    }

    private static <K, V> ImmutableSortedMap<K, V> copyOfInternal(Map<? extends K, ? extends V> map, Comparator<? super K> comparator) {
        boolean zEquals = false;
        if (map instanceof SortedMap) {
            Comparator<? super K> comparator2 = ((SortedMap) map).comparator();
            if (comparator2 != null) {
                zEquals = comparator.equals(comparator2);
            } else if (comparator == NATURAL_ORDER) {
                zEquals = true;
            }
        }
        if (zEquals && (map instanceof ImmutableSortedMap)) {
            ImmutableSortedMap<K, V> immutableSortedMap = (ImmutableSortedMap) map;
            if (!immutableSortedMap.isPartialView()) {
                return immutableSortedMap;
            }
        }
        return fromEntries(comparator, zEquals, map.entrySet());
    }

    public static <K, V> ImmutableSortedMap<K, V> copyOfSorted(SortedMap<K, ? extends V> sortedMap) {
        Comparator<? super K> comparator = sortedMap.comparator();
        if (comparator == null) {
            comparator = NATURAL_ORDER;
        }
        if (sortedMap instanceof ImmutableSortedMap) {
            ImmutableSortedMap<K, V> immutableSortedMap = (ImmutableSortedMap) sortedMap;
            if (!immutableSortedMap.isPartialView()) {
                return immutableSortedMap;
            }
        }
        return fromEntries(comparator, true, sortedMap.entrySet());
    }

    public static <K, V> ImmutableSortedMap<K, V> emptyMap(Comparator<? super K> comparator) {
        return Ordering.natural().equals(comparator) ? m15845of() : new ImmutableSortedMap<>(ImmutableSortedSet.emptySet(comparator), ImmutableList.m15739of());
    }

    private static <K, V> ImmutableSortedMap<K, V> fromEntries(Comparator<? super K> comparator, boolean z, Map.Entry<K, V>[] entryArr, int i) {
        if (i == 0) {
            return emptyMap(comparator);
        }
        if (i == 1) {
            Map.Entry<K, V> entry = entryArr[0];
            Objects.requireNonNull(entry);
            Map.Entry<K, V> entry2 = entry;
            return m15856of(comparator, entry2.getKey(), entry2.getValue());
        }
        Object[] objArr = new Object[i];
        Object[] objArr2 = new Object[i];
        if (z) {
            for (int i2 = 0; i2 < i; i2++) {
                Map.Entry<K, V> entry3 = entryArr[i2];
                Objects.requireNonNull(entry3);
                Map.Entry<K, V> entry4 = entry3;
                K key = entry4.getKey();
                V value = entry4.getValue();
                se5.m185515a(key, value);
                objArr[i2] = key;
                objArr2[i2] = value;
            }
        } else {
            Arrays.sort(entryArr, 0, i, new C2829a(comparator));
            Map.Entry<K, V> entry5 = entryArr[0];
            Objects.requireNonNull(entry5);
            Map.Entry<K, V> entry6 = entry5;
            Object key2 = entry6.getKey();
            objArr[0] = key2;
            V value2 = entry6.getValue();
            objArr2[0] = value2;
            se5.m185515a(objArr[0], value2);
            int i3 = 1;
            while (i3 < i) {
                Map.Entry<K, V> entry7 = entryArr[i3 - 1];
                Objects.requireNonNull(entry7);
                Map.Entry<K, V> entry8 = entry7;
                Map.Entry<K, V> entry9 = entryArr[i3];
                Objects.requireNonNull(entry9);
                Map.Entry<K, V> entry10 = entry9;
                Object key3 = entry10.getKey();
                V value3 = entry10.getValue();
                se5.m185515a(key3, value3);
                objArr[i3] = key3;
                objArr2[i3] = value3;
                ImmutableMap.checkNoConflict(comparator.compare(key2, key3) != 0, Constants.KEY_KEY, entry8, entry10);
                i3++;
                key2 = key3;
            }
        }
        return new ImmutableSortedMap<>(new RegularImmutableSortedSet(ImmutableList.asImmutableList(objArr), comparator), ImmutableList.asImmutableList(objArr2));
    }

    private ImmutableSortedMap<K, V> getSubMap(int i, int i2) {
        if (i == 0 && i2 == size()) {
            return this;
        }
        return i == i2 ? emptyMap(comparator()) : new ImmutableSortedMap<>(this.keySet.getSubSet(i, i2), this.valueList.subList(i, i2));
    }

    public static <K extends Comparable<?>, V> C2830b<K, V> naturalOrder() {
        return new C2830b<>(Ordering.natural());
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    /* JADX INFO: renamed from: of */
    public static ImmutableSortedMap m15855of(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3, Comparable comparable4, Object obj4, Comparable comparable5, Object obj5, Comparable comparable6, Object obj6, Comparable comparable7, Object obj7, Comparable comparable8, Object obj8, Comparable comparable9, Object obj9, Comparable comparable10, Object obj10) {
        return fromEntries(ImmutableMap.entryOf(comparable, obj), ImmutableMap.entryOf(comparable2, obj2), ImmutableMap.entryOf(comparable3, obj3), ImmutableMap.entryOf(comparable4, obj4), ImmutableMap.entryOf(comparable5, obj5), ImmutableMap.entryOf(comparable6, obj6), ImmutableMap.entryOf(comparable7, obj7), ImmutableMap.entryOf(comparable8, obj8), ImmutableMap.entryOf(comparable9, obj9), ImmutableMap.entryOf(comparable10, obj10));
    }

    public static <K, V> C2830b<K, V> orderedBy(Comparator<K> comparator) {
        return new C2830b<>(comparator);
    }

    public static <K extends Comparable<?>, V> C2830b<K, V> reverseOrder() {
        return new C2830b<>(Ordering.natural().reverse());
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> ceilingEntry(K k) {
        return tailMap((Object) k, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public K ceilingKey(K k) {
        return (K) Maps.m16093n(ceilingEntry(k));
    }

    @Override // java.util.SortedMap
    public Comparator<? super K> comparator() {
        return keySet().comparator();
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableSet<Map.Entry<K, V>> createEntrySet() {
        return isEmpty() ? ImmutableSet.m15822of() : new ImmutableMapEntrySet<K, V>() { // from class: com.google.common.collect.ImmutableSortedMap.1EntrySet
            @Override // com.google.common.collect.ImmutableSet
            public ImmutableList<Map.Entry<K, V>> createAsList() {
                return new ImmutableList<Map.Entry<K, V>>() { // from class: com.google.common.collect.ImmutableSortedMap.1EntrySet.1
                    @Override // java.util.List
                    public Map.Entry<K, V> get(int i) {
                        return new AbstractMap.SimpleImmutableEntry(ImmutableSortedMap.this.keySet.asList().get(i), ImmutableSortedMap.this.valueList.get(i));
                    }

                    @Override // com.google.common.collect.ImmutableCollection
                    public boolean isPartialView() {
                        return true;
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                    public int size() {
                        return ImmutableSortedMap.this.size();
                    }
                };
            }

            @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
            public gyj0<Map.Entry<K, V>> iterator() {
                return asList().iterator();
            }

            @Override // com.google.common.collect.ImmutableMapEntrySet
            public ImmutableMap<K, V> map() {
                return ImmutableSortedMap.this;
            }
        };
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableSet<K> createKeySet() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableCollection<V> createValues() {
        throw new AssertionError("should never be called");
    }

    @Override // java.util.NavigableMap
    public ImmutableSortedSet<K> descendingKeySet() {
        return this.keySet.descendingSet();
    }

    @Override // java.util.NavigableMap
    public ImmutableSortedMap<K, V> descendingMap() {
        ImmutableSortedMap<K, V> immutableSortedMap = this.descendingMap;
        if (immutableSortedMap == null) {
            return isEmpty() ? emptyMap(Ordering.from(comparator()).reverse()) : new ImmutableSortedMap<>((RegularImmutableSortedSet) this.keySet.descendingSet(), this.valueList.reverse(), this);
        }
        return immutableSortedMap;
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return entrySet().asList().get(0);
    }

    @Override // java.util.SortedMap
    public K firstKey() {
        return keySet().first();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> floorEntry(K k) {
        return headMap((Object) k, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public K floorKey(K k) {
        return (K) Maps.m16093n(floorEntry(k));
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public V get(Object obj) {
        int iIndexOf = this.keySet.indexOf(obj);
        if (iIndexOf == -1) {
            return null;
        }
        return this.valueList.get(iIndexOf);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.util.NavigableMap
    public ImmutableSortedMap<K, V> headMap(K k, boolean z) {
        return getSubMap(0, this.keySet.headIndex((K) xn80.m212111p(k), z));
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> higherEntry(K k) {
        return tailMap((Object) k, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public K higherKey(K k) {
        return (K) Maps.m16093n(higherEntry(k));
    }

    @Override // com.google.common.collect.ImmutableMap
    public boolean isPartialView() {
        return this.keySet.isPartialView() || this.valueList.isPartialView();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return entrySet().asList().get(size() - 1);
    }

    @Override // java.util.SortedMap
    public K lastKey() {
        return keySet().last();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> lowerEntry(K k) {
        return headMap((Object) k, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public K lowerKey(K k) {
        return (K) Maps.m16093n(lowerEntry(k));
    }

    @Override // java.util.NavigableMap
    @Deprecated
    public final Map.Entry<K, V> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    @Deprecated
    public final Map.Entry<K, V> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public int size() {
        return this.valueList.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap
    public ImmutableSortedMap<K, V> subMap(K k, boolean z, K k2, boolean z2) {
        xn80.m212111p(k);
        xn80.m212111p(k2);
        xn80.m212107l(comparator().compare(k, k2) <= 0, "expected fromKey <= toKey but %s > %s", k, k2);
        return headMap((Object) k2, z2).tailMap((Object) k, z);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.util.NavigableMap
    public ImmutableSortedMap<K, V> tailMap(K k, boolean z) {
        return getSubMap(this.keySet.tailIndex((K) xn80.m212111p(k), z), size());
    }

    @Override // com.google.common.collect.ImmutableMap
    public Object writeReplace() {
        return new SerializedForm(this);
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public ImmutableSet<Map.Entry<K, V>> entrySet() {
        return super.entrySet();
    }

    @Override // java.util.NavigableMap
    public ImmutableSortedSet<K> navigableKeySet() {
        return this.keySet;
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map, p153l.jx2
    public ImmutableCollection<V> values() {
        return this.valueList;
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public ImmutableSortedSet<K> keySet() {
        return this.keySet;
    }

    public ImmutableSortedMap(RegularImmutableSortedSet<K> regularImmutableSortedSet, ImmutableList<V> immutableList) {
        this(regularImmutableSortedSet, immutableList, null);
    }

    public static <K, V> ImmutableSortedMap<K, V> copyOf(Map<? extends K, ? extends V> map, Comparator<? super K> comparator) {
        return copyOfInternal(map, (Comparator) xn80.m212111p(comparator));
    }

    public static <K, V> ImmutableSortedMap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return copyOf(iterable, (Ordering) NATURAL_ORDER);
    }

    public static <K, V> ImmutableSortedMap<K, V> copyOf(Map<? extends K, ? extends V> map) {
        return copyOfInternal(map, (Ordering) NATURAL_ORDER);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public ImmutableSortedMap<K, V> headMap(K k) {
        return headMap((Object) k, false);
    }

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableSortedMap$b */
    public static class C2830b<K, V> extends ImmutableMap.C2809b<K, V> {

        /* JADX INFO: renamed from: f */
        public transient Object[] f10965f;

        /* JADX INFO: renamed from: g */
        public transient Object[] f10966g;

        /* JADX INFO: renamed from: h */
        public final Comparator<? super K> f10967h;

        public C2830b(Comparator<? super K> comparator, int i) {
            this.f10967h = (Comparator) xn80.m212111p(comparator);
            this.f10965f = new Object[i];
            this.f10966g = new Object[i];
        }

        /* JADX INFO: renamed from: e */
        public final void m15858e(int i) {
            Object[] objArr = this.f10965f;
            if (i > objArr.length) {
                int iM15736e = ImmutableCollection.AbstractC2801b.m15736e(objArr.length, i);
                this.f10965f = Arrays.copyOf(this.f10965f, iM15736e);
                this.f10966g = Arrays.copyOf(this.f10966g, iM15736e);
            }
        }

        @Override // com.google.common.collect.ImmutableMap.C2809b
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public ImmutableSortedMap<K, V> mo15712a() {
            return mo15714d();
        }

        @Override // com.google.common.collect.ImmutableMap.C2809b
        @Deprecated
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final ImmutableSortedMap<K, V> mo15713c() {
            throw new UnsupportedOperationException("ImmutableSortedMap.Builder does not yet implement buildKeepingLast()");
        }

        @Override // com.google.common.collect.ImmutableMap.C2809b
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public ImmutableSortedMap<K, V> mo15714d() {
            int i = this.f10927c;
            if (i == 0) {
                return ImmutableSortedMap.emptyMap(this.f10967h);
            }
            if (i == 1) {
                Comparator<? super K> comparator = this.f10967h;
                Object obj = this.f10965f[0];
                Objects.requireNonNull(obj);
                Object obj2 = this.f10966g[0];
                Objects.requireNonNull(obj2);
                return ImmutableSortedMap.m15856of(comparator, obj, obj2);
            }
            Object[] objArrCopyOf = Arrays.copyOf(this.f10965f, i);
            Arrays.sort(objArrCopyOf, this.f10967h);
            Object[] objArr = new Object[this.f10927c];
            for (int i2 = 0; i2 < this.f10927c; i2++) {
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    if (this.f10967h.compare(objArrCopyOf[i3], objArrCopyOf[i2]) == 0) {
                        String strValueOf = String.valueOf(objArrCopyOf[i3]);
                        String strValueOf2 = String.valueOf(objArrCopyOf[i2]);
                        hkc0.m135621a(strValueOf.length() + 57 + strValueOf2.length(), "keys required to be distinct but compared as equal: ", strValueOf, " and ", strValueOf2);
                        return null;
                    }
                }
                Object obj3 = this.f10965f[i2];
                Objects.requireNonNull(obj3);
                int iBinarySearch = Arrays.binarySearch(objArrCopyOf, obj3, this.f10967h);
                Object obj4 = this.f10966g[i2];
                Objects.requireNonNull(obj4);
                objArr[iBinarySearch] = obj4;
            }
            return new ImmutableSortedMap<>(new RegularImmutableSortedSet(ImmutableList.asImmutableList(objArrCopyOf), this.f10967h), ImmutableList.asImmutableList(objArr));
        }

        @Override // com.google.common.collect.ImmutableMap.C2809b
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public C2830b<K, V> mo15715g(K k, V v2) {
            m15858e(this.f10927c + 1);
            se5.m185515a(k, v2);
            Object[] objArr = this.f10965f;
            int i = this.f10927c;
            objArr[i] = k;
            this.f10966g[i] = v2;
            this.f10927c = i + 1;
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.C2809b
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public C2830b<K, V> mo15716h(Map.Entry<? extends K, ? extends V> entry) {
            super.mo15716h(entry);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.C2809b
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public C2830b<K, V> mo15717i(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.mo15717i(iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.C2809b
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public C2830b<K, V> mo15718j(Map<? extends K, ? extends V> map) {
            super.mo15718j(map);
            return this;
        }

        public C2830b(Comparator<? super K> comparator) {
            this(comparator, 4);
        }
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public ImmutableSortedMap<K, V> tailMap(K k) {
        return tailMap((Object) k, true);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public ImmutableSortedMap<K, V> subMap(K k, K k2) {
        return subMap((Object) k, true, (Object) k2, false);
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    /* JADX INFO: renamed from: of */
    public static ImmutableSortedMap m15846of(Comparable comparable, Object obj) {
        return m15856of(Ordering.natural(), comparable, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableSortedMap<K, V> m15856of(Comparator<? super K> comparator, K k, V v2) {
        return new ImmutableSortedMap<>(new RegularImmutableSortedSet(ImmutableList.m15740of(k), (Comparator) xn80.m212111p(comparator)), ImmutableList.m15740of(v2));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    /* JADX INFO: renamed from: of */
    public static ImmutableSortedMap m15847of(Comparable comparable, Object obj, Comparable comparable2, Object obj2) {
        return fromEntries(ImmutableMap.entryOf(comparable, obj), ImmutableMap.entryOf(comparable2, obj2));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    /* JADX INFO: renamed from: of */
    public static ImmutableSortedMap m15848of(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3) {
        return fromEntries(ImmutableMap.entryOf(comparable, obj), ImmutableMap.entryOf(comparable2, obj2), ImmutableMap.entryOf(comparable3, obj3));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    /* JADX INFO: renamed from: of */
    public static ImmutableSortedMap m15849of(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3, Comparable comparable4, Object obj4) {
        return fromEntries(ImmutableMap.entryOf(comparable, obj), ImmutableMap.entryOf(comparable2, obj2), ImmutableMap.entryOf(comparable3, obj3), ImmutableMap.entryOf(comparable4, obj4));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    /* JADX INFO: renamed from: of */
    public static ImmutableSortedMap m15850of(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3, Comparable comparable4, Object obj4, Comparable comparable5, Object obj5) {
        return fromEntries(ImmutableMap.entryOf(comparable, obj), ImmutableMap.entryOf(comparable2, obj2), ImmutableMap.entryOf(comparable3, obj3), ImmutableMap.entryOf(comparable4, obj4), ImmutableMap.entryOf(comparable5, obj5));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    /* JADX INFO: renamed from: of */
    public static ImmutableSortedMap m15851of(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3, Comparable comparable4, Object obj4, Comparable comparable5, Object obj5, Comparable comparable6, Object obj6) {
        return fromEntries(ImmutableMap.entryOf(comparable, obj), ImmutableMap.entryOf(comparable2, obj2), ImmutableMap.entryOf(comparable3, obj3), ImmutableMap.entryOf(comparable4, obj4), ImmutableMap.entryOf(comparable5, obj5), ImmutableMap.entryOf(comparable6, obj6));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    /* JADX INFO: renamed from: of */
    public static ImmutableSortedMap m15852of(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3, Comparable comparable4, Object obj4, Comparable comparable5, Object obj5, Comparable comparable6, Object obj6, Comparable comparable7, Object obj7) {
        return fromEntries(ImmutableMap.entryOf(comparable, obj), ImmutableMap.entryOf(comparable2, obj2), ImmutableMap.entryOf(comparable3, obj3), ImmutableMap.entryOf(comparable4, obj4), ImmutableMap.entryOf(comparable5, obj5), ImmutableMap.entryOf(comparable6, obj6), ImmutableMap.entryOf(comparable7, obj7));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    /* JADX INFO: renamed from: of */
    public static ImmutableSortedMap m15853of(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3, Comparable comparable4, Object obj4, Comparable comparable5, Object obj5, Comparable comparable6, Object obj6, Comparable comparable7, Object obj7, Comparable comparable8, Object obj8) {
        return fromEntries(ImmutableMap.entryOf(comparable, obj), ImmutableMap.entryOf(comparable2, obj2), ImmutableMap.entryOf(comparable3, obj3), ImmutableMap.entryOf(comparable4, obj4), ImmutableMap.entryOf(comparable5, obj5), ImmutableMap.entryOf(comparable6, obj6), ImmutableMap.entryOf(comparable7, obj7), ImmutableMap.entryOf(comparable8, obj8));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    /* JADX INFO: renamed from: of */
    public static ImmutableSortedMap m15854of(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3, Comparable comparable4, Object obj4, Comparable comparable5, Object obj5, Comparable comparable6, Object obj6, Comparable comparable7, Object obj7, Comparable comparable8, Object obj8, Comparable comparable9, Object obj9) {
        return fromEntries(ImmutableMap.entryOf(comparable, obj), ImmutableMap.entryOf(comparable2, obj2), ImmutableMap.entryOf(comparable3, obj3), ImmutableMap.entryOf(comparable4, obj4), ImmutableMap.entryOf(comparable5, obj5), ImmutableMap.entryOf(comparable6, obj6), ImmutableMap.entryOf(comparable7, obj7), ImmutableMap.entryOf(comparable8, obj8), ImmutableMap.entryOf(comparable9, obj9));
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableSortedMap<K, V> m15845of() {
        return (ImmutableSortedMap<K, V>) NATURAL_EMPTY_MAP;
    }

    private static <K, V> ImmutableSortedMap<K, V> fromEntries(Comparator<? super K> comparator, boolean z, Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        Map.Entry[] entryArr = (Map.Entry[]) akq.m98609q(iterable, ImmutableMap.EMPTY_ENTRY_ARRAY);
        return fromEntries(comparator, z, entryArr, entryArr.length);
    }

    private static <K extends Comparable<? super K>, V> ImmutableSortedMap<K, V> fromEntries(Map.Entry<K, V>... entryArr) {
        return fromEntries(Ordering.natural(), false, entryArr, entryArr.length);
    }
}
