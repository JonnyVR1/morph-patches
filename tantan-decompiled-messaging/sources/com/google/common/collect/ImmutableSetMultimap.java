package com.google.common.collect;

import com.google.common.base.C2654a;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import p149l.bm10;
import p149l.dpj0;
import p149l.qm5;
import p149l.rle0;
import p149l.sf80;

/* JADX INFO: loaded from: classes7.dex */
public class ImmutableSetMultimap<K, V> extends ImmutableMultimap<K, V> implements rle0<K, V> {
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
        public dpj0<Map.Entry<K, V>> iterator() {
            return this.multimap.entryIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.multimap.size();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableSetMultimap$a */
    public static final class C2803a<K, V> extends ImmutableMultimap.C2791c<K, V> {
        @Override // com.google.common.collect.ImmutableMultimap.C2791c
        /* JADX INFO: renamed from: b */
        public Collection<V> mo15741b() {
            return C2974m.m16301g();
        }

        /* JADX INFO: renamed from: f */
        public ImmutableSetMultimap<K, V> m15787f() {
            Collection collectionEntrySet = this.f10905a.entrySet();
            Comparator<? super K> comparator = this.f10906b;
            if (comparator != null) {
                collectionEntrySet = Ordering.from(comparator).onKeys().immutableSortedCopy(collectionEntrySet);
            }
            return ImmutableSetMultimap.fromMapEntries(collectionEntrySet, this.f10907c);
        }

        @Override // com.google.common.collect.ImmutableMultimap.C2791c
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public C2803a<K, V> mo15709c(K k, V v2) {
            super.mo15709c(k, v2);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.C2791c
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public C2803a<K, V> mo15710d(Map.Entry<? extends K, ? extends V> entry) {
            super.mo15710d(entry);
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C2803a<K, V> m15790i(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.m15742e(iterable);
            return this;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableSetMultimap$b */
    public static final class C2804b {

        /* JADX INFO: renamed from: a */
        public static final C2976o.b<ImmutableSetMultimap> f10926a = C2976o.m16304a(ImmutableSetMultimap.class, "emptySet");
    }

    public ImmutableSetMultimap(ImmutableMap<K, ImmutableSet<V>> immutableMap, int i, Comparator<? super V> comparator) {
        super(immutableMap, i);
        this.emptySet = emptySet(comparator);
    }

    public static <K, V> C2803a<K, V> builder() {
        return new C2803a<>();
    }

    private static <K, V> ImmutableSetMultimap<K, V> copyOf(bm10<? extends K, ? extends V> bm10Var, Comparator<? super V> comparator) {
        sf80.m183894p(bm10Var);
        if (bm10Var.isEmpty() && comparator == null) {
            return m15781of();
        }
        if (bm10Var instanceof ImmutableSetMultimap) {
            ImmutableSetMultimap<K, V> immutableSetMultimap = (ImmutableSetMultimap) bm10Var;
            if (!immutableSetMultimap.isPartialView()) {
                return immutableSetMultimap;
            }
        }
        return fromMapEntries(bm10Var.asMap().entrySet(), comparator);
    }

    private static <V> ImmutableSet<V> emptySet(Comparator<? super V> comparator) {
        return comparator == null ? ImmutableSet.m15768of() : ImmutableSortedSet.emptySet(comparator);
    }

    public static <K, V> ImmutableSetMultimap<K, V> fromMapEntries(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, Comparator<? super V> comparator) {
        if (collection.isEmpty()) {
            return m15781of();
        }
        ImmutableMap.C2786b c2786b = new ImmutableMap.C2786b(collection.size());
        int size = 0;
        for (Map.Entry<? extends K, ? extends Collection<? extends V>> entry : collection) {
            K key = entry.getKey();
            ImmutableSet immutableSetValueSet = valueSet(comparator, entry.getValue());
            if (!immutableSetValueSet.isEmpty()) {
                c2786b.mo15661g(key, immutableSetValueSet);
                size += immutableSetValueSet.size();
            }
        }
        return new ImmutableSetMultimap<>(c2786b.mo15660d(), size, comparator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ImmutableSetMultimap<V, K> invert() {
        C2803a c2803aBuilder = builder();
        dpj0 it = entries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            c2803aBuilder.mo15709c(entry.getValue(), entry.getKey());
        }
        ImmutableSetMultimap<V, K> immutableSetMultimapM15787f = c2803aBuilder.m15787f();
        immutableSetMultimapM15787f.inverse = this;
        return immutableSetMultimapM15787f;
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableSetMultimap<K, V> m15786of(K k, V v2, K k2, V v3, K k3, V v4, K k4, V v5, K k5, V v6) {
        C2803a c2803aBuilder = builder();
        c2803aBuilder.mo15709c(k, v2);
        c2803aBuilder.mo15709c(k2, v3);
        c2803aBuilder.mo15709c(k3, v4);
        c2803aBuilder.mo15709c(k4, v5);
        c2803aBuilder.mo15709c(k5, v6);
        return c2803aBuilder.m15787f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            qm5.m175553a(29, "Invalid key count ", i);
            return;
        }
        ImmutableMap.C2786b c2786bBuilder = ImmutableMap.builder();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object object = objectInputStream.readObject();
            int i4 = objectInputStream.readInt();
            if (i4 <= 0) {
                qm5.m175553a(31, "Invalid value count ", i4);
                return;
            }
            ImmutableSet.C2802a c2802aValuesBuilder = valuesBuilder(comparator);
            for (int i5 = 0; i5 < i4; i5++) {
                c2802aValuesBuilder.mo15683a(objectInputStream.readObject());
            }
            ImmutableSet immutableSetMo15780n = c2802aValuesBuilder.mo15780n();
            if (immutableSetMo15780n.size() != i4) {
                String strValueOf = String.valueOf(object);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 40);
                sb.append("Duplicate key-value pairs exist for key ");
                sb.append(strValueOf);
                throw new InvalidObjectException(sb.toString());
            }
            c2786bBuilder.mo15661g(object, immutableSetMo15780n);
            i2 += i4;
        }
        try {
            ImmutableMultimap.C2792d.f10908a.m16316b(this, c2786bBuilder.mo15660d());
            ImmutableMultimap.C2792d.f10909b.m16315a(this, i2);
            C2804b.f10926a.m16316b(this, emptySet(comparator));
        } catch (IllegalArgumentException e) {
            throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
        }
    }

    private static <V> ImmutableSet<V> valueSet(Comparator<? super V> comparator, Collection<? extends V> collection) {
        return comparator == null ? ImmutableSet.copyOf((Collection) collection) : ImmutableSortedSet.copyOf((Comparator) comparator, (Collection) collection);
    }

    private static <V> ImmutableSet.C2802a<V> valuesBuilder(Comparator<? super V> comparator) {
        return comparator == null ? new ImmutableSet.C2802a<>() : new ImmutableSortedSet.C2809a(comparator);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(valueComparator());
        C2976o.m16313j(this, objectOutputStream);
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractC2962a, p149l.bm10
    public ImmutableSet<Map.Entry<K, V>> entries() {
        ImmutableSet<Map.Entry<K, V>> immutableSet = this.entries;
        if (immutableSet != null) {
            return immutableSet;
        }
        EntrySet entrySet = new EntrySet(this);
        this.entries = entrySet;
        return entrySet;
    }

    @Override // com.google.common.collect.ImmutableMultimap, p149l.bm10, p149l.ymr
    public ImmutableSet<V> get(K k) {
        return (ImmutableSet) C2654a.m15426a((ImmutableSet) this.map.get(k), this.emptySet);
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

    @Override // com.google.common.collect.ImmutableMultimap, p149l.bm10, p149l.ymr
    @Deprecated
    public final ImmutableSet<V> removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractC2962a, p149l.bm10, p149l.ymr
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
    public static <K, V> ImmutableSetMultimap<K, V> m15782of(K k, V v2) {
        C2803a c2803aBuilder = builder();
        c2803aBuilder.mo15709c(k, v2);
        return c2803aBuilder.m15787f();
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableSetMultimap<K, V> m15783of(K k, V v2, K k2, V v3) {
        C2803a c2803aBuilder = builder();
        c2803aBuilder.mo15709c(k, v2);
        c2803aBuilder.mo15709c(k2, v3);
        return c2803aBuilder.m15787f();
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableSetMultimap<K, V> m15784of(K k, V v2, K k2, V v3, K k3, V v4) {
        C2803a c2803aBuilder = builder();
        c2803aBuilder.mo15709c(k, v2);
        c2803aBuilder.mo15709c(k2, v3);
        c2803aBuilder.mo15709c(k3, v4);
        return c2803aBuilder.m15787f();
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableSetMultimap<K, V> m15785of(K k, V v2, K k2, V v3, K k3, V v4, K k4, V v5) {
        C2803a c2803aBuilder = builder();
        c2803aBuilder.mo15709c(k, v2);
        c2803aBuilder.mo15709c(k2, v3);
        c2803aBuilder.mo15709c(k3, v4);
        c2803aBuilder.mo15709c(k4, v5);
        return c2803aBuilder.m15787f();
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableSetMultimap<K, V> m15781of() {
        return EmptyImmutableSetMultimap.INSTANCE;
    }

    public static <K, V> ImmutableSetMultimap<K, V> copyOf(bm10<? extends K, ? extends V> bm10Var) {
        return copyOf(bm10Var, null);
    }

    public static <K, V> ImmutableSetMultimap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return new C2803a().m15790i(iterable).m15787f();
    }
}
