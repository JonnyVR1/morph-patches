package com.google.common.base;

import java.io.Serializable;
import p149l.gaj;
import p149l.sf80;
import p149l.tyg0;

/* JADX INFO: loaded from: classes7.dex */
class Functions$SupplierFunction<F, T> implements gaj<F, T>, Serializable {
    private static final long serialVersionUID = 0;
    private final tyg0<T> supplier;

    private Functions$SupplierFunction(tyg0<T> tyg0Var) {
        this.supplier = (tyg0) sf80.m183894p(tyg0Var);
    }

    @Override // p149l.gaj
    public T apply(F f) {
        return this.supplier.get();
    }

    @Override // p149l.gaj
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
