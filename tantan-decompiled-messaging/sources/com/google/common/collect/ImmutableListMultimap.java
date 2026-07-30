package com.google.common.collect;

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
import p149l.ymr;

/* JADX INFO: loaded from: classes7.dex */
public class ImmutableListMultimap<K, V> extends ImmutableMultimap<K, V> implements ymr<K, V> {
    private static final long serialVersionUID = 0;
    private transient ImmutableListMultimap<V, K> inverse;

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableListMultimap$a */
    public static final class C2783a<K, V> extends ImmutableMultimap.C2791c<K, V> {
        /* JADX INFO: renamed from: f */
        public ImmutableListMultimap<K, V> m15711f() {
            return (ImmutableListMultimap) super.m15740a();
        }

        @Override // com.google.common.collect.ImmutableMultimap.C2791c
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public C2783a<K, V> mo15709c(K k, V v2) {
            super.mo15709c(k, v2);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.C2791c
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public C2783a<K, V> mo15710d(Map.Entry<? extends K, ? extends V> entry) {
            super.mo15710d(entry);
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C2783a<K, V> m15714i(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.m15742e(iterable);
            return this;
        }
    }

    public ImmutableListMultimap(ImmutableMap<K, ImmutableList<V>> immutableMap, int i) {
        super(immutableMap, i);
    }

    public static <K, V> C2783a<K, V> builder() {
        return new C2783a<>();
    }

    public static <K, V> ImmutableListMultimap<K, V> copyOf(bm10<? extends K, ? extends V> bm10Var) {
        if (bm10Var.isEmpty()) {
            return m15703of();
        }
        if (bm10Var instanceof ImmutableListMultimap) {
            ImmutableListMultimap<K, V> immutableListMultimap = (ImmutableListMultimap) bm10Var;
            if (!immutableListMultimap.isPartialView()) {
                return immutableListMultimap;
            }
        }
        return fromMapEntries(bm10Var.asMap().entrySet(), null);
    }

    public static <K, V> ImmutableListMultimap<K, V> fromMapEntries(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, Comparator<? super V> comparator) {
        if (collection.isEmpty()) {
            return m15703of();
        }
        ImmutableMap.C2786b c2786b = new ImmutableMap.C2786b(collection.size());
        int size = 0;
        for (Map.Entry<? extends K, ? extends Collection<? extends V>> entry : collection) {
            K key = entry.getKey();
            Collection<? extends V> value = entry.getValue();
            ImmutableList immutableListCopyOf = comparator == null ? ImmutableList.copyOf((Collection) value) : ImmutableList.sortedCopyOf(comparator, value);
            if (!immutableListCopyOf.isEmpty()) {
                c2786b.mo15661g(key, immutableListCopyOf);
                size += immutableListCopyOf.size();
            }
        }
        return new ImmutableListMultimap<>(c2786b.mo15660d(), size);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ImmutableListMultimap<V, K> invert() {
        C2783a c2783aBuilder = builder();
        dpj0 it = entries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            c2783aBuilder.mo15709c(entry.getValue(), entry.getKey());
        }
        ImmutableListMultimap<V, K> immutableListMultimapM15711f = c2783aBuilder.m15711f();
        immutableListMultimapM15711f.inverse = this;
        return immutableListMultimapM15711f;
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableListMultimap<K, V> m15708of(K k, V v2, K k2, V v3, K k3, V v4, K k4, V v5, K k5, V v6) {
        C2783a c2783aBuilder = builder();
        c2783aBuilder.mo15709c(k, v2);
        c2783aBuilder.mo15709c(k2, v3);
        c2783aBuilder.mo15709c(k3, v4);
        c2783aBuilder.mo15709c(k4, v5);
        c2783aBuilder.mo15709c(k5, v6);
        return c2783aBuilder.m15711f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
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
            ImmutableList.C2781a c2781aBuilder = ImmutableList.builder();
            for (int i5 = 0; i5 < i4; i5++) {
                c2781aBuilder.mo15683a(objectInputStream.readObject());
            }
            c2786bBuilder.mo15661g(object, c2781aBuilder.m15702m());
            i2 += i4;
        }
        try {
            ImmutableMultimap.C2792d.f10908a.m16316b(this, c2786bBuilder.mo15660d());
            ImmutableMultimap.C2792d.f10909b.m16315a(this, i2);
        } catch (IllegalArgumentException e) {
            throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        C2976o.m16313j(this, objectOutputStream);
    }

    @Override // com.google.common.collect.ImmutableMultimap, p149l.bm10, p149l.ymr
    public ImmutableList<V> get(K k) {
        ImmutableList<V> immutableList = (ImmutableList) this.map.get(k);
        return immutableList == null ? ImmutableList.m15685of() : immutableList;
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

    @Override // com.google.common.collect.ImmutableMultimap, p149l.bm10, p149l.ymr
    @Deprecated
    public final ImmutableList<V> removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractC2962a, p149l.bm10, p149l.ymr
    @Deprecated
    public final ImmutableList<V> replaceValues(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableListMultimap<K, V> m15704of(K k, V v2) {
        C2783a c2783aBuilder = builder();
        c2783aBuilder.mo15709c(k, v2);
        return c2783aBuilder.m15711f();
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableListMultimap<K, V> m15705of(K k, V v2, K k2, V v3) {
        C2783a c2783aBuilder = builder();
        c2783aBuilder.mo15709c(k, v2);
        c2783aBuilder.mo15709c(k2, v3);
        return c2783aBuilder.m15711f();
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableListMultimap<K, V> m15706of(K k, V v2, K k2, V v3, K k3, V v4) {
        C2783a c2783aBuilder = builder();
        c2783aBuilder.mo15709c(k, v2);
        c2783aBuilder.mo15709c(k2, v3);
        c2783aBuilder.mo15709c(k3, v4);
        return c2783aBuilder.m15711f();
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableListMultimap<K, V> m15707of(K k, V v2, K k2, V v3, K k3, V v4, K k4, V v5) {
        C2783a c2783aBuilder = builder();
        c2783aBuilder.mo15709c(k, v2);
        c2783aBuilder.mo15709c(k2, v3);
        c2783aBuilder.mo15709c(k3, v4);
        c2783aBuilder.mo15709c(k4, v5);
        return c2783aBuilder.m15711f();
    }

    public static <K, V> ImmutableListMultimap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return new C2783a().m15714i(iterable).m15711f();
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableListMultimap<K, V> m15703of() {
        return EmptyImmutableListMultimap.INSTANCE;
    }
}
