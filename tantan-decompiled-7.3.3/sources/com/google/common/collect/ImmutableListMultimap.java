package com.google.common.collect;

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
import p153l.zor;

/* JADX INFO: loaded from: classes7.dex */
public class ImmutableListMultimap<K, V> extends ImmutableMultimap<K, V> implements zor<K, V> {
    private static final long serialVersionUID = 0;
    private transient ImmutableListMultimap<V, K> inverse;

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableListMultimap$a */
    public static final class C2806a<K, V> extends ImmutableMultimap.C2814c<K, V> {
        /* JADX INFO: renamed from: f */
        public ImmutableListMultimap<K, V> m15765f() {
            return (ImmutableListMultimap) super.m15794a();
        }

        @Override // com.google.common.collect.ImmutableMultimap.C2814c
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public C2806a<K, V> mo15763c(K k, V v2) {
            super.mo15763c(k, v2);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.C2814c
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public C2806a<K, V> mo15764d(Map.Entry<? extends K, ? extends V> entry) {
            super.mo15764d(entry);
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C2806a<K, V> m15768i(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.m15796e(iterable);
            return this;
        }
    }

    public ImmutableListMultimap(ImmutableMap<K, ImmutableList<V>> immutableMap, int i) {
        super(immutableMap, i);
    }

    public static <K, V> C2806a<K, V> builder() {
        return new C2806a<>();
    }

    public static <K, V> ImmutableListMultimap<K, V> copyOf(ju10<? extends K, ? extends V> ju10Var) {
        if (ju10Var.isEmpty()) {
            return m15757of();
        }
        if (ju10Var instanceof ImmutableListMultimap) {
            ImmutableListMultimap<K, V> immutableListMultimap = (ImmutableListMultimap) ju10Var;
            if (!immutableListMultimap.isPartialView()) {
                return immutableListMultimap;
            }
        }
        return fromMapEntries(ju10Var.asMap().entrySet(), null);
    }

    public static <K, V> ImmutableListMultimap<K, V> fromMapEntries(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, Comparator<? super V> comparator) {
        if (collection.isEmpty()) {
            return m15757of();
        }
        ImmutableMap.C2809b c2809b = new ImmutableMap.C2809b(collection.size());
        int size = 0;
        for (Map.Entry<? extends K, ? extends Collection<? extends V>> entry : collection) {
            K key = entry.getKey();
            Collection<? extends V> value = entry.getValue();
            ImmutableList immutableListCopyOf = comparator == null ? ImmutableList.copyOf((Collection) value) : ImmutableList.sortedCopyOf(comparator, value);
            if (!immutableListCopyOf.isEmpty()) {
                c2809b.mo15715g(key, immutableListCopyOf);
                size += immutableListCopyOf.size();
            }
        }
        return new ImmutableListMultimap<>(c2809b.mo15714d(), size);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ImmutableListMultimap<V, K> invert() {
        C2806a c2806aBuilder = builder();
        gyj0 it = entries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            c2806aBuilder.mo15763c(entry.getValue(), entry.getKey());
        }
        ImmutableListMultimap<V, K> immutableListMultimapM15765f = c2806aBuilder.m15765f();
        immutableListMultimapM15765f.inverse = this;
        return immutableListMultimapM15765f;
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableListMultimap<K, V> m15762of(K k, V v2, K k2, V v3, K k3, V v4, K k4, V v5, K k5, V v6) {
        C2806a c2806aBuilder = builder();
        c2806aBuilder.mo15763c(k, v2);
        c2806aBuilder.mo15763c(k2, v3);
        c2806aBuilder.mo15763c(k3, v4);
        c2806aBuilder.mo15763c(k4, v5);
        c2806aBuilder.mo15763c(k5, v6);
        return c2806aBuilder.m15765f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
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
            ImmutableList.C2804a c2804aBuilder = ImmutableList.builder();
            for (int i5 = 0; i5 < i4; i5++) {
                c2804aBuilder.mo15737a(objectInputStream.readObject());
            }
            c2809bBuilder.mo15715g(object, c2804aBuilder.m15756m());
            i2 += i4;
        }
        try {
            ImmutableMultimap.C2815d.f10945a.m16370b(this, c2809bBuilder.mo15714d());
            ImmutableMultimap.C2815d.f10946b.m16369a(this, i2);
        } catch (IllegalArgumentException e) {
            throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        C2999o.m16367j(this, objectOutputStream);
    }

    @Override // com.google.common.collect.ImmutableMultimap, p153l.ju10, p153l.zor
    public ImmutableList<V> get(K k) {
        ImmutableList<V> immutableList = (ImmutableList) this.map.get(k);
        return immutableList == null ? ImmutableList.m15739of() : immutableList;
    }

    @Override // com.google.common.collect.ImmutableMultimap
    public ImmutableListMultimap<V, K> inverse() {
        ImmutableListMultimap<V, K> immutableListMultimap = this.inverse;
        if (immutableListMultimap != null) {
            return immutableListMultimap;
        }
        ImmutableListMultimap<V, K> immutableListMultimapInvert = invert();
        this.inverse = immutableListMultimapInvert;
        return immutableListMultimapInvert;
    }

    @Override // com.google.common.collect.ImmutableMultimap, p153l.ju10, p153l.zor
    @Deprecated
    public final ImmutableList<V> removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractC2985a, p153l.ju10, p153l.zor
    @Deprecated
    public final ImmutableList<V> replaceValues(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableListMultimap<K, V> m15758of(K k, V v2) {
        C2806a c2806aBuilder = builder();
        c2806aBuilder.mo15763c(k, v2);
        return c2806aBuilder.m15765f();
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableListMultimap<K, V> m15759of(K k, V v2, K k2, V v3) {
        C2806a c2806aBuilder = builder();
        c2806aBuilder.mo15763c(k, v2);
        c2806aBuilder.mo15763c(k2, v3);
        return c2806aBuilder.m15765f();
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableListMultimap<K, V> m15760of(K k, V v2, K k2, V v3, K k3, V v4) {
        C2806a c2806aBuilder = builder();
        c2806aBuilder.mo15763c(k, v2);
        c2806aBuilder.mo15763c(k2, v3);
        c2806aBuilder.mo15763c(k3, v4);
        return c2806aBuilder.m15765f();
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableListMultimap<K, V> m15761of(K k, V v2, K k2, V v3, K k3, V v4, K k4, V v5) {
        C2806a c2806aBuilder = builder();
        c2806aBuilder.mo15763c(k, v2);
        c2806aBuilder.mo15763c(k2, v3);
        c2806aBuilder.mo15763c(k3, v4);
        c2806aBuilder.mo15763c(k4, v5);
        return c2806aBuilder.m15765f();
    }

    public static <K, V> ImmutableListMultimap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return new C2806a().m15768i(iterable).m15765f();
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableListMultimap<K, V> m15757of() {
        return EmptyImmutableListMultimap.INSTANCE;
    }
}
