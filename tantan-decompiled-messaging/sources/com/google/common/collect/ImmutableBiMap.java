package com.google.common.collect;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import p149l.sd5;
import p149l.tw2;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ImmutableBiMap<K, V> extends ImmutableMap<K, V> implements tw2<K, V> {

    public static class SerializedForm<K, V> extends ImmutableMap.SerializedForm<K, V> {
        private static final long serialVersionUID = 0;

        public SerializedForm(ImmutableBiMap<K, V> immutableBiMap) {
            super(immutableBiMap);
        }

        @Override // com.google.common.collect.ImmutableMap.SerializedForm
        public C2774a<K, V> makeBuilder(int i) {
            return new C2774a<>(i);
        }
    }

    public static <K, V> C2774a<K, V> builder() {
        return new C2774a<>();
    }

    public static <K, V> C2774a<K, V> builderWithExpectedSize(int i) {
        sd5.m183444b(i, "expectedSize");
        return new C2774a<>(i);
    }

    public static <K, V> ImmutableBiMap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return new C2774a(iterable instanceof Collection ? ((Collection) iterable).size() : 4).mo15663i(iterable).mo15658a();
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m15657of(K k, V v2, K k2, V v3, K k3, V v4, K k4, V v5, K k5, V v6, K k6, V v7, K k7, V v8, K k8, V v9, K k9, V v10, K k10, V v11) {
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
        return new RegularImmutableBiMap(new Object[]{k, v2, k2, v3, k3, v4, k4, v5, k5, v6, k6, v7, k7, v8, k8, v9, k9, v10, k10, v11}, 10);
    }

    @SafeVarargs
    public static <K, V> ImmutableBiMap<K, V> ofEntries(Map.Entry<? extends K, ? extends V>... entryArr) {
        return copyOf((Iterable) Arrays.asList(entryArr));
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableSet<V> createValues() {
        throw new AssertionError("should never be called");
    }

    @Override // p149l.tw2
    @Deprecated
    public final V forcePut(K k, V v2) {
        throw new UnsupportedOperationException();
    }

    @Override // p149l.tw2
    public abstract ImmutableBiMap<V, K> inverse();

    @Override // com.google.common.collect.ImmutableMap, java.util.Map, p149l.tw2
    public ImmutableSet<V> values() {
        return inverse().keySet();
    }

    @Override // com.google.common.collect.ImmutableMap
    public Object writeReplace() {
        return new SerializedForm(this);
    }

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableBiMap$a */
    public static final class C2774a<K, V> extends ImmutableMap.C2786b<K, V> {
        public C2774a() {
        }

        @Override // com.google.common.collect.ImmutableMap.C2786b
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public ImmutableBiMap<K, V> mo15658a() {
            return mo15660d();
        }

        @Override // com.google.common.collect.ImmutableMap.C2786b
        @Deprecated
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public ImmutableBiMap<K, V> mo15659c() {
            throw new UnsupportedOperationException("Not supported for bimaps");
        }

        @Override // com.google.common.collect.ImmutableMap.C2786b
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public ImmutableBiMap<K, V> mo15660d() {
            int i = this.f10890c;
            if (i == 0) {
                return ImmutableBiMap.m15647of();
            }
            if (this.f10888a != null) {
                if (this.f10891d) {
                    this.f10889b = Arrays.copyOf(this.f10889b, i * 2);
                }
                ImmutableMap.C2786b.m15729k(this.f10889b, this.f10890c, this.f10888a);
            }
            this.f10891d = true;
            return new RegularImmutableBiMap(this.f10889b, this.f10890c);
        }

        @Override // com.google.common.collect.ImmutableMap.C2786b
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public C2774a<K, V> mo15661g(K k, V v2) {
            super.mo15661g(k, v2);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.C2786b
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public C2774a<K, V> mo15662h(Map.Entry<? extends K, ? extends V> entry) {
            super.mo15662h(entry);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.C2786b
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public C2774a<K, V> mo15663i(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.mo15663i(iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.C2786b
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public C2774a<K, V> mo15664j(Map<? extends K, ? extends V> map) {
            super.mo15664j(map);
            return this;
        }

        public C2774a(int i) {
            super(i);
        }
    }

    public static <K, V> ImmutableBiMap<K, V> copyOf(Map<? extends K, ? extends V> map) {
        if (map instanceof ImmutableBiMap) {
            ImmutableBiMap<K, V> immutableBiMap = (ImmutableBiMap) map;
            if (!immutableBiMap.isPartialView()) {
                return immutableBiMap;
            }
        }
        return copyOf((Iterable) map.entrySet());
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m15648of(K k, V v2) {
        sd5.m183443a(k, v2);
        return new RegularImmutableBiMap(new Object[]{k, v2}, 1);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m15649of(K k, V v2, K k2, V v3) {
        sd5.m183443a(k, v2);
        sd5.m183443a(k2, v3);
        return new RegularImmutableBiMap(new Object[]{k, v2, k2, v3}, 2);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m15650of(K k, V v2, K k2, V v3, K k3, V v4) {
        sd5.m183443a(k, v2);
        sd5.m183443a(k2, v3);
        sd5.m183443a(k3, v4);
        return new RegularImmutableBiMap(new Object[]{k, v2, k2, v3, k3, v4}, 3);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m15651of(K k, V v2, K k2, V v3, K k3, V v4, K k4, V v5) {
        sd5.m183443a(k, v2);
        sd5.m183443a(k2, v3);
        sd5.m183443a(k3, v4);
        sd5.m183443a(k4, v5);
        return new RegularImmutableBiMap(new Object[]{k, v2, k2, v3, k3, v4, k4, v5}, 4);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m15652of(K k, V v2, K k2, V v3, K k3, V v4, K k4, V v5, K k5, V v6) {
        sd5.m183443a(k, v2);
        sd5.m183443a(k2, v3);
        sd5.m183443a(k3, v4);
        sd5.m183443a(k4, v5);
        sd5.m183443a(k5, v6);
        return new RegularImmutableBiMap(new Object[]{k, v2, k2, v3, k3, v4, k4, v5, k5, v6}, 5);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m15653of(K k, V v2, K k2, V v3, K k3, V v4, K k4, V v5, K k5, V v6, K k6, V v7) {
        sd5.m183443a(k, v2);
        sd5.m183443a(k2, v3);
        sd5.m183443a(k3, v4);
        sd5.m183443a(k4, v5);
        sd5.m183443a(k5, v6);
        sd5.m183443a(k6, v7);
        return new RegularImmutableBiMap(new Object[]{k, v2, k2, v3, k3, v4, k4, v5, k5, v6, k6, v7}, 6);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m15654of(K k, V v2, K k2, V v3, K k3, V v4, K k4, V v5, K k5, V v6, K k6, V v7, K k7, V v8) {
        sd5.m183443a(k, v2);
        sd5.m183443a(k2, v3);
        sd5.m183443a(k3, v4);
        sd5.m183443a(k4, v5);
        sd5.m183443a(k5, v6);
        sd5.m183443a(k6, v7);
        sd5.m183443a(k7, v8);
        return new RegularImmutableBiMap(new Object[]{k, v2, k2, v3, k3, v4, k4, v5, k5, v6, k6, v7, k7, v8}, 7);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m15655of(K k, V v2, K k2, V v3, K k3, V v4, K k4, V v5, K k5, V v6, K k6, V v7, K k7, V v8, K k8, V v9) {
        sd5.m183443a(k, v2);
        sd5.m183443a(k2, v3);
        sd5.m183443a(k3, v4);
        sd5.m183443a(k4, v5);
        sd5.m183443a(k5, v6);
        sd5.m183443a(k6, v7);
        sd5.m183443a(k7, v8);
        sd5.m183443a(k8, v9);
        return new RegularImmutableBiMap(new Object[]{k, v2, k2, v3, k3, v4, k4, v5, k5, v6, k6, v7, k7, v8, k8, v9}, 8);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m15656of(K k, V v2, K k2, V v3, K k3, V v4, K k4, V v5, K k5, V v6, K k6, V v7, K k7, V v8, K k8, V v9, K k9, V v10) {
        sd5.m183443a(k, v2);
        sd5.m183443a(k2, v3);
        sd5.m183443a(k3, v4);
        sd5.m183443a(k4, v5);
        sd5.m183443a(k5, v6);
        sd5.m183443a(k6, v7);
        sd5.m183443a(k7, v8);
        sd5.m183443a(k8, v9);
        sd5.m183443a(k9, v10);
        return new RegularImmutableBiMap(new Object[]{k, v2, k2, v3, k3, v4, k4, v5, k5, v6, k6, v7, k7, v8, k8, v9, k9, v10}, 9);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m15647of() {
        return RegularImmutableBiMap.EMPTY;
    }
}
