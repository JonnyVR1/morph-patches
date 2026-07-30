package com.google.common.base;

import java.io.Serializable;
import p149l.gaj;
import p149l.v050;

/* JADX INFO: loaded from: classes7.dex */
class Functions$ConstantFunction<E> implements gaj<Object, E>, Serializable {
    private static final long serialVersionUID = 0;
    private final E value;

    public Functions$ConstantFunction(E e) {
        this.value = e;
    }

    @Override // p149l.gaj
    public E apply(Object obj) {
        return this.value;
    }

    @Override // p149l.gaj
    public boolean equals(Object obj) {
        if (obj instanceof Functions$ConstantFunction) {
            return v050.m196470a(this.value, ((Functions$ConstantFunction) obj).value);
        }
        return false;
    }

    public int hashCode() {
        E e = this.value;
        if (e == null) {
            return 0;
        }
        return e.hashCode();
    }

    public String toString() {
        String strValueOf = String.valueOf(this.value);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 20);
        sb.append("Functions.constant(");
        sb.append(strValueOf);
        sb.append(")");
        return sb.toString();
    }
}
