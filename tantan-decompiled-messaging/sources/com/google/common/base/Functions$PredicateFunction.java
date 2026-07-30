package com.google.common.base;

import java.io.Serializable;
import p149l.gaj;
import p149l.oh80;
import p149l.sf80;

/* JADX INFO: loaded from: classes7.dex */
class Functions$PredicateFunction<T> implements gaj<T, Boolean>, Serializable {
    private static final long serialVersionUID = 0;
    private final oh80<T> predicate;

    private Functions$PredicateFunction(oh80<T> oh80Var) {
        this.predicate = (oh80) sf80.m183894p(oh80Var);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p149l.gaj
    public Boolean apply(T t) {
        return Boolean.valueOf(this.predicate.apply(t));
    }

    @Override // p149l.gaj
    public boolean equals(Object obj) {
        if (obj instanceof Functions$PredicateFunction) {
            return this.predicate.equals(((Functions$PredicateFunction) obj).predicate);
        }
        return false;
    }

    public int hashCode() {
        return this.predicate.hashCode();
    }

    public String toString() {
        String strValueOf = String.valueOf(this.predicate);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 24);
        sb.append("Functions.forPredicate(");
        sb.append(strValueOf);
        sb.append(")");
        return sb.toString();
    }
}
