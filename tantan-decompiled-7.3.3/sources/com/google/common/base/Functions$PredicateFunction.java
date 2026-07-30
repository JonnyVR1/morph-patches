package com.google.common.base;

import java.io.Serializable;
import p153l.adj;
import p153l.tp80;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
class Functions$PredicateFunction<T> implements adj<T, Boolean>, Serializable {
    private static final long serialVersionUID = 0;
    private final tp80<T> predicate;

    private Functions$PredicateFunction(tp80<T> tp80Var) {
        this.predicate = (tp80) xn80.m212111p(tp80Var);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p153l.adj
    public Boolean apply(T t) {
        return Boolean.valueOf(this.predicate.apply(t));
    }

    @Override // p153l.adj
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
