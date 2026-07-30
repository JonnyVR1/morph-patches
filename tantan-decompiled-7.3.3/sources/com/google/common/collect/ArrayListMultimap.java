package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p153l.ju10;
import p153l.se5;

/* JADX INFO: loaded from: classes7.dex */
public final class ArrayListMultimap<K, V> extends ArrayListMultimapGwtSerializationDependencies<K, V> {
    private static final int DEFAULT_VALUES_PER_KEY = 3;
    private static final long serialVersionUID = 0;
    transient int expectedValuesPerKey;

    private ArrayListMultimap(ju10<? extends K, ? extends V> ju10Var) {
        this(ju10Var.keySet().size(), ju10Var instanceof ArrayListMultimap ? ((ArrayListMultimap) ju10Var).expectedValuesPerKey : 3);
        putAll(ju10Var);
    }

    public static <K, V> ArrayListMultimap<K, V> create() {
        return new ArrayListMultimap<>();
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.expectedValuesPerKey = 3;
        int iM16365h = C2999o.m16365h(objectInputStream);
        setMap(CompactHashMap.create());
        C2999o.m16362e(this, objectInputStream, iM16365h);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        C2999o.m16367j(this, objectOutputStream);
    }

    @Override // com.google.common.collect.AbstractListMultimap, com.google.common.collect.AbstractC2985a, p153l.ju10
    public /* bridge */ /* synthetic */ Map asMap() {
        return super.asMap();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, p153l.ju10
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
    public /* bridge */ /* synthetic */ boolean containsEntry(Object obj, Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, p153l.ju10
    public /* bridge */ /* synthetic */ boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
    public /* bridge */ /* synthetic */ boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    @Override // com.google.common.collect.AbstractListMultimap, com.google.common.collect.AbstractMapBasedMultimap
    public List<V> createCollection() {
        return new ArrayList(this.expectedValuesPerKey);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractC2985a, p153l.ju10
    public /* bridge */ /* synthetic */ Collection entries() {
        return super.entries();
    }

    @Override // com.google.common.collect.AbstractListMultimap, com.google.common.collect.AbstractC2985a, p153l.ju10
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractListMultimap, com.google.common.collect.AbstractMapBasedMultimap, p153l.ju10, p153l.zor
    public /* bridge */ /* synthetic */ List get(Object obj) {
        return super.get(obj);
    }

    @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
    public /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
    public /* bridge */ /* synthetic */ InterfaceC2995k keys() {
        return super.keys();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractListMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractC2985a, p153l.ju10
    public /* bridge */ /* synthetic */ boolean put(Object obj, Object obj2) {
        return super.put(obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
    public /* bridge */ /* synthetic */ boolean putAll(Object obj, Iterable iterable) {
        return super.putAll(obj, iterable);
    }

    @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
    public /* bridge */ /* synthetic */ boolean remove(Object obj, Object obj2) {
        return super.remove(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractListMultimap, com.google.common.collect.AbstractMapBasedMultimap, p153l.ju10, p153l.zor
    public /* bridge */ /* synthetic */ List removeAll(Object obj) {
        return super.removeAll(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractListMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractC2985a, p153l.ju10, p153l.zor
    public /* bridge */ /* synthetic */ List replaceValues(Object obj, Iterable iterable) {
        return super.replaceValues(obj, iterable);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, p153l.ju10
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // com.google.common.collect.AbstractC2985a
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Deprecated
    public void trimToSize() {
        Iterator<Collection<V>> it = backingMap().values().iterator();
        while (it.hasNext()) {
            ((ArrayList) it.next()).trimToSize();
        }
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractC2985a, p153l.ju10
    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    @Override // com.google.common.collect.AbstractC2985a, p153l.ju10
    public /* bridge */ /* synthetic */ boolean putAll(ju10 ju10Var) {
        return super.putAll(ju10Var);
    }

    public static <K, V> ArrayListMultimap<K, V> create(int i, int i2) {
        return new ArrayListMultimap<>(i, i2);
    }

    public static <K, V> ArrayListMultimap<K, V> create(ju10<? extends K, ? extends V> ju10Var) {
        return new ArrayListMultimap<>(ju10Var);
    }

    private ArrayListMultimap(int i, int i2) {
        super(C2997m.m16351c(i));
        se5.m185516b(i2, "expectedValuesPerKey");
        this.expectedValuesPerKey = i2;
    }

    private ArrayListMultimap() {
        this(12, 3);
    }
}
