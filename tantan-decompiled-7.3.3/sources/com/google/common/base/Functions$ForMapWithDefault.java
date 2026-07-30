package com.google.common.base;

import java.io.Serializable;
import java.util.Map;
import p153l.adj;
import p153l.k950;
import p153l.m350;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
class Functions$ForMapWithDefault<K, V> implements adj<K, V>, Serializable {
    private static final long serialVersionUID = 0;
    final V defaultValue;
    final Map<K, ? extends V> map;

    public Functions$ForMapWithDefault(Map<K, ? extends V> map, V v2) {
        this.map = (Map) xn80.m212111p(map);
        this.defaultValue = v2;
    }

    @Override // p153l.adj
    public V apply(K k) {
        V v2 = this.map.get(k);
        return (v2 != null || this.map.containsKey(k)) ? (V) m350.m156920a(v2) : this.defaultValue;
    }

    @Override // p153l.adj
    public boolean equals(Object obj) {
        if (obj instanceof Functions$ForMapWithDefault) {
            Functions$ForMapWithDefault functions$ForMapWithDefault = (Functions$ForMapWithDefault) obj;
            if (this.map.equals(functions$ForMapWithDefault.map) && k950.m148863a(this.defaultValue, functions$ForMapWithDefault.defaultValue)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return k950.m148864b(this.map, this.defaultValue);
    }

    public String toString() {
        String strValueOf = String.valueOf(this.map);
        String strValueOf2 = String.valueOf(this.defaultValue);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 33 + strValueOf2.length());
        sb.append("Functions.forMap(");
        sb.append(strValueOf);
        sb.append(", defaultValue=");
        sb.append(strValueOf2);
        sb.append(")");
        return sb.toString();
    }
}
