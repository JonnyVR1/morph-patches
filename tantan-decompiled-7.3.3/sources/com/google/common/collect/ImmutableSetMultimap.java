package com.google.common.collect;

import com.google.common.base.C2677a;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import p153l.gyj0;
import p153l.ju10;
import p153l.un5;
import p153l.wte0;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
public class ImmutableSetMultimap<K, V> extends ImmutableMultimap<K, V> implements wte0<K, V> {
    private static final long serialVersionUID = 0;
    private final transient ImmutableSet<V> emptySet;
    private transient ImmutableSet<Map.Entry<K, V>> entries;
    private transient ImmutableSetMultimap<V, K> inverse;

    public static final class EntrySet<K, V> extends ImmutableSet<Map.Entry<K, V>> {
        private final transient ImmutableSetMultimap<K, V> multimap;

        public EntrySet(ImmutableSetMultimap<K, V> immutableSetMultimap) {
            this.multimap = immutableSetMultimap;
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
            return false;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        public gyj0<Map.Entry<K, V>> iterator() {
            return this.multimap.entryIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.multimap.size();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableSetMultimap$a */
    public static final class C2826a<K, V> extends ImmutableMultimap.C2814c<K, V> {
        @Override // com.google.common.collect.ImmutableMultimap.C2814c
        /* JADX INFO: renamed from: b */
        public Collection<V> mo15795b() {
            return C2997m.m16355g();
        }

        /* JADX INFO: renamed from: f */
        public ImmutableSetMultimap<K, V> m15841f() {
            Collection collectionEntrySet = this.f10942a.entrySet();
            Comparator<? super K> comparator = this.f10943b;
            if (comparator != null) {
                collectionEntrySet = Ordering.from(comparator).onKeys().immutableSortedCopy(collectionEntrySet);
            }
            return ImmutableSetMultimap.fromMapEntries(collectionEntrySet, this.f10944c);
        }

        @Override // com.google.common.collect.ImmutableMultimap.C2814c
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public C2826a<K, V> mo15763c(K k, V v2) {
            super.mo15763c(k, v2);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.C2814c
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public C2826a<K, V> mo15764d(Map.Entry<? extends K, ? extends V> entry) {
            super.mo15764d(entry);
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C2826a<K, V> m15844i(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.m15796e(iterable);
            return this;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableSetMultimap$b */
    public static final class C2827b {

        /* JADX INFO: renamed from: a */
        public static final C2999o.b<ImmutableSetMultimap> f10963a = C2999o.m16358a(ImmutableSetMultimap.class, "emptySet");
    }

    public ImmutableSetMultimap(ImmutableMap<K, ImmutableSet<V>> immutableMap, int i, Comparator<? super V> comparator) {
        super(immutableMap, i);
        this.emptySet = emptySet(comparator);
    }

    public static <K, V> C2826a<K, V> builder() {
        return new C2826a<>();
    }

    private static <K, V> ImmutableSetMultimap<K, V> copyOf(ju10<? extends K, ? extends V> ju10Var, Comparator<? super V> comparator) {
        xn80.m212111p(ju10Var);
        if (ju10Var.isEmpty() && comparator == null) {
            return m15835of();
        }
        if (ju10Var instanceof ImmutableSetMultimap) {
            ImmutableSetMultimap<K, V> immutableSetMultimap = (ImmutableSetMultimap) ju10Var;
            if (!immutableSetMultimap.isPartialView()) {
                return immutableSetMultimap;
            }
        }
        return fromMapEntries(ju10Var.asMap().entrySet(), comparator);
    }

    private static <V> ImmutableSet<V> emptySet(Comparator<? super V> comparator) {
        return comparator == null ? ImmutableSet.m15822of() : ImmutableSortedSet.emptySet(comparator);
    }

    public static <K, V> ImmutableSetMultimap<K, V> fromMapEntries(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, Comparator<? super V> comparator) {
        if (collection.isEmpty()) {
            return m15835of();
        }
        ImmutableMap.C2809b c2809b = new ImmutableMap.C2809b(collection.size());
        int size = 0;
        for (Map.Entry<? extends K, ? extends Collection<? extends V>> entry : collection) {
            K key = entry.getKey();
            ImmutableSet immutableSetValueSet = valueSet(comparator, entry.getValue());
            if (!immutableSetValueSet.isEmpty()) {
                c2809b.mo15715g(key, immutableSetValueSet);
                size += immutableSetValueSet.size();
            }
        }
        return new ImmutableSetMultimap<>(c2809b.mo15714d(), size, comparator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ImmutableSetMultimap<V, K> invert() {
        C2826a c2826aBuilder = builder();
        gyj0 it = entries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            c2826aBuilder.mo15763c(entry.getValue(), entry.getKey());
        }
        ImmutableSetMultimap<V, K> immutableSetMultimapM15841f = c2826aBuilder.m15841f();
        immutableSetMultimapM15841f.inverse = this;
        return immutableSetMultimapM15841f;
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableSetMultimap<K, V> m15840of(K k, V v2, K k2, V v3, K k3, V v4, K k4, V v5, K k5, V v6) {
        C2826a c2826aBuilder = builder();
        c2826aBuilder.mo15763c(k, v2);
        c2826aBuilder.mo15763c(k2, v3);
        c2826aBuilder.mo15763c(k3, v4);
        c2826aBuilder.mo15763c(k4, v5);
        c2826aBuilder.mo15763c(k5, v6);
        return c2826aBuilder.m15841f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            un5.m196828a(29, "Invalid key count ", i);
            return;
        }
        ImmutableMap.C2809b c2809bBuilder = ImmutableMap.builder();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object object = objectInputStream.readObject();
            int i4 = objectInputStream.readInt();
            if (i4 <= 0) {
                un5.m196828a(31, "Invalid value count ", i4);
                return;
            }
            ImmutableSet.C2825a c2825aValuesBuilder = valuesBuilder(comparator);
            for (int i5 = 0; i5 < i4; i5++) {
                c2825aValuesBuilder.mo15737a(objectInputStream.readObject());
            }
            ImmutableSet immutableSetMo15834n = c2825aValuesBuilder.mo15834n();
            if (immutableSetMo15834n.size() != i4) {
                String strValueOf = String.valueOf(object);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 40);
                sb.append("Duplicate key-value pairs exist for key ");
                sb.append(strValueOf);
                throw new InvalidObjectException(sb.toString());
            }
            c2809bBuilder.mo15715g(object, immutableSetMo15834n);
            i2 += i4;
        }
        try {
            ImmutableMultimap.C2815d.f10945a.m16370b(this, c2809bBuilder.mo15714d());
            ImmutableMultimap.C2815d.f10946b.m16369a(this, i2);
            C2827b.f10963a.m16370b(this, emptySet(comparator));
        } catch (IllegalArgumentException e) {
            throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
        }
    }

    private static <V> ImmutableSet<V> valueSet(Comparator<? super V> comparator, Collection<? extends V> collection) {
        return comparator == null ? ImmutableSet.copyOf((Collection) collection) : ImmutableSortedSet.copyOf((Comparator) comparator, (Collection) collection);
    }

    private static <V> ImmutableSet.C2825a<V> valuesBuilder(Comparator<? super V> comparator) {
        return comparator == null ? new ImmutableSet.C2825a<>() : new ImmutableSortedSet.C2832a(comparator);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(valueComparator());
        C2999o.m16367j(this, objectOutputStream);
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractC2985a, p153l.ju10
    public ImmutableSet<Map.Entry<K, V>> entries() {
        ImmutableSet<Map.Entry<K, V>> immutableSet = this.entries;
        if (immutableSet != null) {
            return immutableSet;
        }
        EntrySet entrySet = new EntrySet(this);
        this.entries = entrySet;
        return entrySet;
    }

    @Override // com.google.common.collect.ImmutableMultimap, p153l.ju10, p153l.zor
    public ImmutableSet<V> get(K k) {
        return (ImmutableSet) C2677a.m15480a((ImmutableSet) this.map.get(k), this.emptySet);
    }

    @Override // com.google.common.collect.ImmutableMultimap
    public ImmutableSetMultimap<V, K> inverse() {
        ImmutableSetMultimap<V, K> immutableSetMultimap = this.inverse;
        if (immutableSetMultimap != null) {
            return immutableSetMultimap;
        }
        ImmutableSetMultimap<V, K> immutableSetMultimapInvert = invert();
        this.inverse = immutableSetMultimapInvert;
        return immutableSetMultimapInvert;
    }

    @Override // com.google.common.collect.ImmutableMultimap, p153l.ju10, p153l.zor
    @Deprecated
    public final ImmutableSet<V> removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractC2985a, p153l.ju10, p153l.zor
    @Deprecated
    public final ImmutableSet<V> replaceValues(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    public Comparator<? super V> valueComparator() {
        ImmutableSet<V> immutableSet = this.emptySet;
        if (immutableSet instanceof ImmutableSortedSet) {
            return ((ImmutableSortedSet) immutableSet).comparator();
        }
        return null;
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableSetMultimap<K, V> m15836of(K k, V v2) {
        C2826a c2826aBuilder = builder();
        c2826aBuilder.mo15763c(k, v2);
        return c2826aBuilder.m15841f();
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableSetMultimap<K, V> m15837of(K k, V v2, K k2, V v3) {
        C2826a c2826aBuilder = builder();
        c2826aBuilder.mo15763c(k, v2);
        c2826aBuilder.mo15763c(k2, v3);
        return c2826aBuilder.m15841f();
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableSetMultimap<K, V> m15838of(K k, V v2, K k2, V v3, K k3, V v4) {
        C2826a c2826aBuilder = builder();
        c2826aBuilder.mo15763c(k, v2);
        c2826aBuilder.mo15763c(k2, v3);
        c2826aBuilder.mo15763c(k3, v4);
        return c2826aBuilder.m15841f();
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableSetMultimap<K, V> m15839of(K k, V v2, K k2, V v3, K k3, V v4, K k4, V v5) {
        C2826a c2826aBuilder = builder();
        c2826aBuilder.mo15763c(k, v2);
        c2826aBuilder.mo15763c(k2, v3);
        c2826aBuilder.mo15763c(k3, v4);
        c2826aBuilder.mo15763c(k4, v5);
        return c2826aBuilder.m15841f();
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableSetMultimap<K, V> m15835of() {
        return EmptyImmutableSetMultimap.INSTANCE;
    }

    public static <K, V> ImmutableSetMultimap<K, V> copyOf(ju10<? extends K, ? extends V> ju10Var) {
        return copyOf(ju10Var, null);
    }

    public static <K, V> ImmutableSetMultimap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return new C2826a().m15844i(iterable).m15841f();
    }
}
