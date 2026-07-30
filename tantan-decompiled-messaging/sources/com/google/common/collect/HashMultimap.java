package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p149l.bm10;
import p149l.sf80;

/* JADX INFO: loaded from: classes7.dex */
public final class HashMultimap<K, V> extends HashMultimapGwtSerializationDependencies<K, V> {
    private static final int DEFAULT_VALUES_PER_KEY = 2;
    private static final long serialVersionUID = 0;
    transient int expectedValuesPerKey;

    private HashMultimap(bm10<? extends K, ? extends V> bm10Var) {
        super(C2974m.m16297c(bm10Var.keySet().size()));
        this.expectedValuesPerKey = 2;
        putAll(bm10Var);
    }

    public static <K, V> HashMultimap<K, V> create() {
        return new HashMultimap<>();
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.expectedValuesPerKey = 2;
        int iM16311h = C2976o.m16311h(objectInputStream);
        setMap(C2974m.m16297c(12));
        C2976o.m16308e(this, objectInputStream, iM16311h);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        C2976o.m16313j(this, objectOutputStream);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractC2962a, p149l.bm10
    public /* bridge */ /* synthetic */ Map asMap() {
        return super.asMap();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, p149l.bm10
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.google.common.collect.AbstractC2962a, p149l.bm10
    public /* bridge */ /* synthetic */ boolean containsEntry(Object obj, Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, p149l.bm10
    public /* bridge */ /* synthetic */ boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractC2962a, p149l.bm10
    public /* bridge */ /* synthetic */ boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    public Set<V> createCollection() {
        return C2974m.m16298d(this.expectedValuesPerKey);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractC2962a, p149l.bm10
    public /* bridge */ /* synthetic */ Set entries() {
        return super.entries();
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractC2962a, p149l.bm10
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, p149l.bm10, p149l.ymr
    public /* bridge */ /* synthetic */ Set get(Object obj) {
        return super.get(obj);
    }

    @Override // com.google.common.collect.AbstractC2962a, p149l.bm10
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.AbstractC2962a, p149l.bm10
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.AbstractC2962a, p149l.bm10
    public /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    @Override // com.google.common.collect.AbstractC2962a, p149l.bm10
    public /* bridge */ /* synthetic */ InterfaceC2972k keys() {
        return super.keys();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractC2962a, p149l.bm10
    public /* bridge */ /* synthetic */ boolean put(Object obj, Object obj2) {
        return super.put(obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractC2962a, p149l.bm10
    public /* bridge */ /* synthetic */ boolean putAll(Object obj, Iterable iterable) {
        return super.putAll(obj, iterable);
    }

    @Override // com.google.common.collect.AbstractC2962a, p149l.bm10
    public /* bridge */ /* synthetic */ boolean remove(Object obj, Object obj2) {
        return super.remove(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, p149l.bm10, p149l.ymr
    public /* bridge */ /* synthetic */ Set removeAll(Object obj) {
        return super.removeAll(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractC2962a, p149l.bm10, p149l.ymr
    public /* bridge */ /* synthetic */ Set replaceValues(Object obj, Iterable iterable) {
        return super.replaceValues(obj, iterable);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, p149l.bm10
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // com.google.common.collect.AbstractC2962a
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractC2962a, p149l.bm10
    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    @Override // com.google.common.collect.AbstractC2962a, p149l.bm10
    public /* bridge */ /* synthetic */ boolean putAll(bm10 bm10Var) {
        return super.putAll(bm10Var);
    }

    public static <K, V> HashMultimap<K, V> create(int i, int i2) {
        return new HashMultimap<>(i, i2);
    }

    public static <K, V> HashMultimap<K, V> create(bm10<? extends K, ? extends V> bm10Var) {
        return new HashMultimap<>(bm10Var);
    }

    private HashMultimap(int i, int i2) {
        super(C2974m.m16297c(i));
        this.expectedValuesPerKey = 2;
        sf80.m183882d(i2 >= 0);
        this.expectedValuesPerKey = i2;
    }

    private HashMultimap() {
        this(12, 2);
    }
}
