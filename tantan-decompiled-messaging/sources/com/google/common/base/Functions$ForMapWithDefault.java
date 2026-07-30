package com.google.common.base;

import java.io.Serializable;
import java.util.Map;
import p149l.gaj;
import p149l.sf80;
import p149l.v050;
import p149l.xu40;

/* JADX INFO: loaded from: classes7.dex */
class Functions$ForMapWithDefault<K, V> implements gaj<K, V>, Serializable {
    private static final long serialVersionUID = 0;
    final V defaultValue;
    final Map<K, ? extends V> map;

    public Functions$ForMapWithDefault(Map<K, ? extends V> map, V v2) {
        this.map = (Map) sf80.m183894p(map);
        this.defaultValue = v2;
    }

    @Override // p149l.gaj
    public V apply(K k) {
        V v2 = this.map.get(k);
        return (v2 != null || this.map.containsKey(k)) ? (V) xu40.m211079a(v2) : this.defaultValue;
    }

    @Override // p149l.gaj
    public boolean equals(Object obj) {
        if (obj instanceof Functions$ForMapWithDefault) {
            Functions$ForMapWithDefault functions$ForMapWithDefault = (Functions$ForMapWithDefault) obj;
            if (this.map.equals(functions$ForMapWithDefault.map) && v050.m196470a(this.defaultValue, functions$ForMapWithDefault.defaultValue)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return v050.m196471b(this.map, this.defaultValue);
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
