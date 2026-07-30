package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.Enum;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p153l.jx2;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
public final class EnumHashBiMap<K extends Enum<K>, V> extends AbstractBiMap<K, V> {
    private static final long serialVersionUID = 0;
    private transient Class<K> keyType;

    private EnumHashBiMap(Class<K> cls) {
        super(new EnumMap(cls), Maps.m16096q(cls.getEnumConstants().length));
        this.keyType = cls;
    }

    public static <K extends Enum<K>, V> EnumHashBiMap<K, V> create(Map<K, ? extends V> map) {
        EnumHashBiMap<K, V> enumHashBiMapCreate = create(EnumBiMap.inferKeyType(map));
        enumHashBiMapCreate.putAll(map);
        return enumHashBiMapCreate;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.keyType = (Class) objectInputStream.readObject();
        setDelegates(new EnumMap(this.keyType), new HashMap((this.keyType.getEnumConstants().length * 3) / 2));
        C2999o.m16359b(this, objectInputStream);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.keyType);
        C2999o.m16366i(this, objectOutputStream);
    }

    @Override // com.google.common.collect.AbstractBiMap, p153l.s2j, java.util.Map
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.google.common.collect.AbstractBiMap, p153l.s2j, java.util.Map
    public /* bridge */ /* synthetic */ boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    @Override // com.google.common.collect.AbstractBiMap, p153l.s2j, java.util.Map
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.AbstractBiMap, p153l.jx2
    public /* bridge */ /* synthetic */ jx2 inverse() {
        return super.inverse();
    }

    @Override // com.google.common.collect.AbstractBiMap, p153l.s2j, java.util.Map
    public /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    public Class<K> keyType() {
        return this.keyType;
    }

    @Override // com.google.common.collect.AbstractBiMap, p153l.s2j, java.util.Map
    public /* bridge */ /* synthetic */ void putAll(Map map) {
        super.putAll(map);
    }

    @Override // com.google.common.collect.AbstractBiMap, p153l.s2j, java.util.Map
    public /* bridge */ /* synthetic */ Object remove(Object obj) {
        return super.remove(obj);
    }

    @Override // com.google.common.collect.AbstractBiMap, p153l.s2j, java.util.Map, p153l.jx2
    public /* bridge */ /* synthetic */ Set values() {
        return super.values();
    }

    @Override // com.google.common.collect.AbstractBiMap
    public K checkKey(K k) {
        return (K) xn80.m212111p(k);
    }

    @Override // com.google.common.collect.AbstractBiMap, p153l.jx2
    public V forcePut(K k, V v2) {
        return (V) super.forcePut(k, (Object) v2);
    }

    @Override // com.google.common.collect.AbstractBiMap, p153l.s2j, java.util.Map
    public V put(K k, V v2) {
        return (V) super.put(k, (Object) v2);
    }

    public static <K extends Enum<K>, V> EnumHashBiMap<K, V> create(Class<K> cls) {
        return new EnumHashBiMap<>(cls);
    }
}
