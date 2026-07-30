package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.Enum;
import java.util.EnumMap;
import java.util.Map;
import java.util.Set;
import p149l.sf80;
import p149l.tw2;

/* JADX INFO: loaded from: classes7.dex */
public final class EnumBiMap<K extends Enum<K>, V extends Enum<V>> extends AbstractBiMap<K, V> {
    private static final long serialVersionUID = 0;
    private transient Class<K> keyType;
    private transient Class<V> valueType;

    private EnumBiMap(Class<K> cls, Class<V> cls2) {
        super(new EnumMap(cls), new EnumMap(cls2));
        this.keyType = cls;
        this.valueType = cls2;
    }

    public static <K extends Enum<K>, V extends Enum<V>> EnumBiMap<K, V> create(Map<K, V> map) {
        EnumBiMap<K, V> enumBiMapCreate = create(inferKeyType(map), inferValueType(map));
        enumBiMapCreate.putAll(map);
        return enumBiMapCreate;
    }

    public static <K extends Enum<K>> Class<K> inferKeyType(Map<K, ?> map) {
        if (map instanceof EnumBiMap) {
            return ((EnumBiMap) map).keyType();
        }
        if (map instanceof EnumHashBiMap) {
            return ((EnumHashBiMap) map).keyType();
        }
        sf80.m183882d(!map.isEmpty());
        return map.keySet().iterator().next().getDeclaringClass();
    }

    private static <V extends Enum<V>> Class<V> inferValueType(Map<?, V> map) {
        if (map instanceof EnumBiMap) {
            return ((EnumBiMap) map).valueType;
        }
        sf80.m183882d(!map.isEmpty());
        return map.values().iterator().next().getDeclaringClass();
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.keyType = (Class) objectInputStream.readObject();
        this.valueType = (Class) objectInputStream.readObject();
        setDelegates(new EnumMap(this.keyType), new EnumMap(this.valueType));
        C2976o.m16305b(this, objectInputStream);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.keyType);
        objectOutputStream.writeObject(this.valueType);
        C2976o.m16312i(this, objectOutputStream);
    }

    @Override // com.google.common.collect.AbstractBiMap, p149l.xzi, java.util.Map
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.google.common.collect.AbstractBiMap, p149l.xzi, java.util.Map
    public /* bridge */ /* synthetic */ boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    @Override // com.google.common.collect.AbstractBiMap, p149l.xzi, java.util.Map
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractBiMap, p149l.tw2
    public /* bridge */ /* synthetic */ Object forcePut(Object obj, Object obj2) {
        return super.forcePut(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractBiMap, p149l.tw2
    public /* bridge */ /* synthetic */ tw2 inverse() {
        return super.inverse();
    }

    @Override // com.google.common.collect.AbstractBiMap, p149l.xzi, java.util.Map
    public /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    public Class<K> keyType() {
        return this.keyType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractBiMap, p149l.xzi, java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return super.put(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractBiMap, p149l.xzi, java.util.Map
    public /* bridge */ /* synthetic */ void putAll(Map map) {
        super.putAll(map);
    }

    @Override // com.google.common.collect.AbstractBiMap, p149l.xzi, java.util.Map
    public /* bridge */ /* synthetic */ Object remove(Object obj) {
        return super.remove(obj);
    }

    public Class<V> valueType() {
        return this.valueType;
    }

    @Override // com.google.common.collect.AbstractBiMap, p149l.xzi, java.util.Map, p149l.tw2
    public /* bridge */ /* synthetic */ Set values() {
        return super.values();
    }

    @Override // com.google.common.collect.AbstractBiMap
    public K checkKey(K k) {
        return (K) sf80.m183894p(k);
    }

    @Override // com.google.common.collect.AbstractBiMap
    public V checkValue(V v2) {
        return (V) sf80.m183894p(v2);
    }

    public static <K extends Enum<K>, V extends Enum<V>> EnumBiMap<K, V> create(Class<K> cls, Class<V> cls2) {
        return new EnumBiMap<>(cls, cls2);
    }
}
