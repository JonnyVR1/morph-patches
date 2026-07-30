package com.google.common.base;

import java.io.Serializable;
import java.util.Map;
import p149l.gaj;
import p149l.sf80;
import p149l.xu40;

/* JADX INFO: loaded from: classes7.dex */
class Functions$FunctionForMapNoDefault<K, V> implements gaj<K, V>, Serializable {
    private static final long serialVersionUID = 0;
    final Map<K, V> map;

    public Functions$FunctionForMapNoDefault(Map<K, V> map) {
        this.map = (Map) sf80.m183894p(map);
    }

    @Override // p149l.gaj
    public V apply(K k) {
        V v2 = this.map.get(k);
        sf80.m183889k(v2 != null || this.map.containsKey(k), "Key '%s' not present in map", k);
        return (V) xu40.m211079a(v2);
    }

    @Override // p149l.gaj
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
