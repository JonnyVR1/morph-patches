package com.google.common.collect;

import java.io.Serializable;
import java.util.Map;
import p153l.gyj0;

/* JADX INFO: loaded from: classes7.dex */
final class ImmutableMapValues<K, V> extends ImmutableCollection<V> {
    private final ImmutableMap<K, V> map;

    public static class SerializedForm<V> implements Serializable {
        private static final long serialVersionUID = 0;
        final ImmutableMap<?, V> map;

        public SerializedForm(ImmutableMap<?, V> immutableMap) {
            this.map = immutableMap;
        }

        public Object readResolve() {
            return this.map.values();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableMapValues$a */
    public class C2811a extends gyj0<V> {

        /* JADX INFO: renamed from: a */
        public final gyj0<Map.Entry<K, V>> f10933a;

        public C2811a() {
            this.f10933a = ImmutableMapValues.this.map.entrySet().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f10933a.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            return this.f10933a.next().getValue();
        }
    }

    public ImmutableMapValues(ImmutableMap<K, V> immutableMap) {
        this.map = immutableMap;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public ImmutableList<V> asList() {
        final ImmutableList<Map.Entry<K, V>> immutableListAsList = this.map.entrySet().asList();
        return new ImmutableList<V>(this) { // from class: com.google.common.collect.ImmutableMapValues.2
            @Override // java.util.List
            public V get(int i) {
                return (V) ((Map.Entry) immutableListAsList.get(i)).getValue();
            }

            @Override // com.google.common.collect.ImmutableCollection
            public boolean isPartialView() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return immutableListAsList.size();
            }
        };
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return obj != null && Iterators.m15931g(iterator(), obj);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return true;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public gyj0<V> iterator() {
        return new C2811a();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.map.size();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(this.map);
    }
}
