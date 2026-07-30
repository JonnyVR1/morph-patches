package com.google.common.collect;

import java.io.Serializable;
import p153l.AbstractC18359l7;

/* JADX INFO: loaded from: classes7.dex */
class ImmutableEntry<K, V> extends AbstractC18359l7<K, V> implements Serializable {
    private static final long serialVersionUID = 0;
    final K key;
    final V value;

    public ImmutableEntry(K k, V v2) {
        this.key = k;
        this.value = v2;
    }

    @Override // p153l.AbstractC18359l7, java.util.Map.Entry
    public final K getKey() {
        return this.key;
    }

    @Override // p153l.AbstractC18359l7, java.util.Map.Entry
    public final V getValue() {
        return this.value;
    }

    @Override // p153l.AbstractC18359l7, java.util.Map.Entry
    public final V setValue(V v2) {
        throw new UnsupportedOperationException();
    }
}
