package com.google.common.collect;

import java.io.Serializable;
import java.lang.Enum;
import java.util.EnumMap;
import java.util.Map;
import p149l.aiq;
import p149l.dpj0;
import p149l.sf80;

/* JADX INFO: loaded from: classes7.dex */
final class ImmutableEnumMap<K extends Enum<K>, V> extends ImmutableMap.IteratorBasedImmutableMap<K, V> {
    private final transient EnumMap<K, V> delegate;

    public static class EnumSerializedForm<K extends Enum<K>, V> implements Serializable {
        private static final long serialVersionUID = 0;
        final EnumMap<K, V> delegate;

        public EnumSerializedForm(EnumMap<K, V> enumMap) {
            this.delegate = enumMap;
        }

        public Object readResolve() {
            return new ImmutableEnumMap(this.delegate);
        }
    }

    private ImmutableEnumMap(EnumMap<K, V> enumMap) {
        this.delegate = enumMap;
        sf80.m183882d(!enumMap.isEmpty());
    }

    public static <K extends Enum<K>, V> ImmutableMap<K, V> asImmutable(EnumMap<K, V> enumMap) {
        int size = enumMap.size();
        if (size == 0) {
            return ImmutableMap.m15715of();
        }
        if (size != 1) {
            return new ImmutableEnumMap(enumMap);
        }
        Map.Entry entry = (Map.Entry) aiq.m96884j(enumMap.entrySet());
        return ImmutableMap.m15716of((Enum) entry.getKey(), entry.getValue());
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.delegate.containsKey(obj);
    }

    @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap
    public dpj0<Map.Entry<K, V>> entryIterator() {
        return Maps.m16018G(this.delegate.entrySet().iterator());
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImmutableEnumMap) {
            obj = ((ImmutableEnumMap) obj).delegate;
        }
        return this.delegate.equals(obj);
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public V get(Object obj) {
        return this.delegate.get(obj);
    }

    @Override // com.google.common.collect.ImmutableMap
    public boolean isPartialView() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableMap
    public dpj0<K> keyIterator() {
        return Iterators.m15870C(this.delegate.keySet().iterator());
    }

    @Override // java.util.Map
    public int size() {
        return this.delegate.size();
    }

    @Override // com.google.common.collect.ImmutableMap
    public Object writeReplace() {
        return new EnumSerializedForm(this.delegate);
    }
}
