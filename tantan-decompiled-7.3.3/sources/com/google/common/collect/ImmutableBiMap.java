package com.google.common.collect;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import p153l.jx2;
import p153l.se5;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ImmutableBiMap<K, V> extends ImmutableMap<K, V> implements jx2<K, V> {

    public static class SerializedForm<K, V> extends ImmutableMap.SerializedForm<K, V> {
        private static final long serialVersionUID = 0;

        public SerializedForm(ImmutableBiMap<K, V> immutableBiMap) {
            super(immutableBiMap);
        }

        @Override // com.google.common.collect.ImmutableMap.SerializedForm
        public C2797a<K, V> makeBuilder(int i) {
            return new C2797a<>(i);
        }
    }

    public static <K, V> C2797a<K, V> builder() {
        return new C2797a<>();
    }

    public static <K, V> C2797a<K, V> builderWithExpectedSize(int i) {
        se5.m185516b(i, "expectedSize");
        return new C2797a<>(i);
    }

    public static <K, V> ImmutableBiMap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return new C2797a(iterable instanceof Collection ? ((Collection) iterable).size() : 4).mo15717i(iterable).mo15712a();
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m15711of(K k, V v2, K k2, V v3, K k3, V v4, K k4, V v5, K k5, V v6, K k6, V v7, K k7, V v8, K k8, V v9, K k9, V v10, K k10, V v11) {
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

    @Override // p153l.jx2
    @Deprecated
    public final V forcePut(K k, V v2) {
        throw new UnsupportedOperationException();
    }

    @Override // p153l.jx2
    public abstract ImmutableBiMap<V, K> inverse();

    @Override // com.google.common.collect.ImmutableMap, java.util.Map, p153l.jx2
    public ImmutableSet<V> values() {
        return inverse().keySet();
    }

    @Override // com.google.common.collect.ImmutableMap
    public Object writeReplace() {
        return new SerializedForm(this);
    }

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableBiMap$a */
    public static final class C2797a<K, V> extends ImmutableMap.C2809b<K, V> {
        public C2797a() {
        }

        @Override // com.google.common.collect.ImmutableMap.C2809b
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public ImmutableBiMap<K, V> mo15712a() {
            return mo15714d();
        }

        @Override // com.google.common.collect.ImmutableMap.C2809b
        @Deprecated
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public ImmutableBiMap<K, V> mo15713c() {
            throw new UnsupportedOperationException("Not supported for bimaps");
        }

        @Override // com.google.common.collect.ImmutableMap.C2809b
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public ImmutableBiMap<K, V> mo15714d() {
            int i = this.f10927c;
            if (i == 0) {
                return ImmutableBiMap.m15701of();
            }
            if (this.f10925a != null) {
                if (this.f10928d) {
                    this.f10926b = Arrays.copyOf(this.f10926b, i * 2);
                }
                ImmutableMap.C2809b.m15783k(this.f10926b, this.f10927c, this.f10925a);
            }
            this.f10928d = true;
            return new RegularImmutableBiMap(this.f10926b, this.f10927c);
        }

        @Override // com.google.common.collect.ImmutableMap.C2809b
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public C2797a<K, V> mo15715g(K k, V v2) {
            super.mo15715g(k, v2);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.C2809b
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public C2797a<K, V> mo15716h(Map.Entry<? extends K, ? extends V> entry) {
            super.mo15716h(entry);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.C2809b
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public C2797a<K, V> mo15717i(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.mo15717i(iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.C2809b
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public C2797a<K, V> mo15718j(Map<? extends K, ? extends V> map) {
            super.mo15718j(map);
            return this;
        }

        public C2797a(int i) {
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
    public static <K, V> ImmutableBiMap<K, V> m15702of(K k, V v2) {
        se5.m185515a(k, v2);
        return new RegularImmutableBiMap(new Object[]{k, v2}, 1);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m15703of(K k, V v2, K k2, V v3) {
        se5.m185515a(k, v2);
        se5.m185515a(k2, v3);
        return new RegularImmutableBiMap(new Object[]{k, v2, k2, v3}, 2);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m15704of(K k, V v2, K k2, V v3, K k3, V v4) {
        se5.m185515a(k, v2);
        se5.m185515a(k2, v3);
        se5.m185515a(k3, v4);
        return new RegularImmutableBiMap(new Object[]{k, v2, k2, v3, k3, v4}, 3);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m15705of(K k, V v2, K k2, V v3, K k3, V v4, K k4, V v5) {
        se5.m185515a(k, v2);
        se5.m185515a(k2, v3);
        se5.m185515a(k3, v4);
        se5.m185515a(k4, v5);
        return new RegularImmutableBiMap(new Object[]{k, v2, k2, v3, k3, v4, k4, v5}, 4);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m15706of(K k, V v2, K k2, V v3, K k3, V v4, K k4, V v5, K k5, V v6) {
        se5.m185515a(k, v2);
        se5.m185515a(k2, v3);
        se5.m185515a(k3, v4);
        se5.m185515a(k4, v5);
        se5.m185515a(k5, v6);
        return new RegularImmutableBiMap(new Object[]{k, v2, k2, v3, k3, v4, k4, v5, k5, v6}, 5);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m15707of(K k, V v2, K k2, V v3, K k3, V v4, K k4, V v5, K k5, V v6, K k6, V v7) {
        se5.m185515a(k, v2);
        se5.m185515a(k2, v3);
        se5.m185515a(k3, v4);
        se5.m185515a(k4, v5);
        se5.m185515a(k5, v6);
        se5.m185515a(k6, v7);
        return new RegularImmutableBiMap(new Object[]{k, v2, k2, v3, k3, v4, k4, v5, k5, v6, k6, v7}, 6);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m15708of(K k, V v2, K k2, V v3, K k3, V v4, K k4, V v5, K k5, V v6, K k6, V v7, K k7, V v8) {
        se5.m185515a(k, v2);
        se5.m185515a(k2, v3);
        se5.m185515a(k3, v4);
        se5.m185515a(k4, v5);
        se5.m185515a(k5, v6);
        se5.m185515a(k6, v7);
        se5.m185515a(k7, v8);
        return new RegularImmutableBiMap(new Object[]{k, v2, k2, v3, k3, v4, k4, v5, k5, v6, k6, v7, k7, v8}, 7);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m15709of(K k, V v2, K k2, V v3, K k3, V v4, K k4, V v5, K k5, V v6, K k6, V v7, K k7, V v8, K k8, V v9) {
        se5.m185515a(k, v2);
        se5.m185515a(k2, v3);
        se5.m185515a(k3, v4);
        se5.m185515a(k4, v5);
        se5.m185515a(k5, v6);
        se5.m185515a(k6, v7);
        se5.m185515a(k7, v8);
        se5.m185515a(k8, v9);
        return new RegularImmutableBiMap(new Object[]{k, v2, k2, v3, k3, v4, k4, v5, k5, v6, k6, v7, k7, v8, k8, v9}, 8);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m15710of(K k, V v2, K k2, V v3, K k3, V v4, K k4, V v5, K k5, V v6, K k6, V v7, K k7, V v8, K k8, V v9, K k9, V v10) {
        se5.m185515a(k, v2);
        se5.m185515a(k2, v3);
        se5.m185515a(k3, v4);
        se5.m185515a(k4, v5);
        se5.m185515a(k5, v6);
        se5.m185515a(k6, v7);
        se5.m185515a(k7, v8);
        se5.m185515a(k8, v9);
        se5.m185515a(k9, v10);
        return new RegularImmutableBiMap(new Object[]{k, v2, k2, v3, k3, v4, k4, v5, k5, v6, k6, v7, k7, v8, k8, v9, k9, v10}, 9);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m15701of() {
        return RegularImmutableBiMap.EMPTY;
    }
}
