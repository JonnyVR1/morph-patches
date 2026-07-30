package com.google.common.base;

import java.io.Serializable;
import p153l.adj;
import p153l.k950;

/* JADX INFO: loaded from: classes7.dex */
class Functions$ConstantFunction<E> implements adj<Object, E>, Serializable {
    private static final long serialVersionUID = 0;
    private final E value;

    public Functions$ConstantFunction(E e) {
        this.value = e;
    }

    @Override // p153l.adj
    public E apply(Object obj) {
        return this.value;
    }

    @Override // p153l.adj
    public boolean equals(Object obj) {
        if (obj instanceof Functions$ConstantFunction) {
            return k950.m148863a(this.value, ((Functions$ConstantFunction) obj).value);
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
