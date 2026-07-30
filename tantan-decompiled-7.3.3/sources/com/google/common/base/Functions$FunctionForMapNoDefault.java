package com.google.common.base;

import java.io.Serializable;
import java.util.Map;
import p153l.adj;
import p153l.m350;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
class Functions$FunctionForMapNoDefault<K, V> implements adj<K, V>, Serializable {
    private static final long serialVersionUID = 0;
    final Map<K, V> map;

    public Functions$FunctionForMapNoDefault(Map<K, V> map) {
        this.map = (Map) xn80.m212111p(map);
    }

    @Override // p153l.adj
    public V apply(K k) {
        V v2 = this.map.get(k);
        xn80.m212106k(v2 != null || this.map.containsKey(k), "Key '%s' not present in map", k);
        return (V) m350.m156920a(v2);
    }

    @Override // p153l.adj
    public boolean equals(Object obj) {
        if (obj instanceof Functions$FunctionForMapNoDefault) {
            return this.map.equals(((Functions$FunctionForMapNoDefault) obj).map);
        }
        return false;
    }

    public int hashCode() {
        return this.map.hashCode();
    }

    public String toString() {
        String strValueOf = String.valueOf(this.map);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 18);
        sb.append("Functions.forMap(");
        sb.append(strValueOf);
        sb.append(")");
        return sb.toString();
    }
}
