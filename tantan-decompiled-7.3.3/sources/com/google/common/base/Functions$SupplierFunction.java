package com.google.common.base;

import java.io.Serializable;
import p153l.adj;
import p153l.b7h0;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
class Functions$SupplierFunction<F, T> implements adj<F, T>, Serializable {
    private static final long serialVersionUID = 0;
    private final b7h0<T> supplier;

    private Functions$SupplierFunction(b7h0<T> b7h0Var) {
        this.supplier = (b7h0) xn80.m212111p(b7h0Var);
    }

    @Override // p153l.adj
    public T apply(F f) {
        return this.supplier.get();
    }

    @Override // p153l.adj
    public boolean equals(Object obj) {
        if (obj instanceof Functions$SupplierFunction) {
            return this.supplier.equals(((Functions$SupplierFunction) obj).supplier);
        }
        return false;
    }

    public int hashCode() {
        return this.supplier.hashCode();
    }

    public String toString() {
        String strValueOf = String.valueOf(this.supplier);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 23);
        sb.append("Functions.forSupplier(");
        sb.append(strValueOf);
        sb.append(")");
        return sb.toString();
    }
}
