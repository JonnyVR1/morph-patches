package com.google.common.collect;

import java.io.Serializable;
import p153l.adj;
import p153l.k950;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
final class ByFunctionOrdering<F, T> extends Ordering<F> implements Serializable {
    private static final long serialVersionUID = 0;
    final adj<F, ? extends T> function;
    final Ordering<T> ordering;

    public ByFunctionOrdering(adj<F, ? extends T> adjVar, Ordering<T> ordering) {
        this.function = (adj) xn80.m212111p(adjVar);
        this.ordering = (Ordering) xn80.m212111p(ordering);
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(F f, F f2) {
        return this.ordering.compare(this.function.apply(f), this.function.apply(f2));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByFunctionOrdering) {
            ByFunctionOrdering byFunctionOrdering = (ByFunctionOrdering) obj;
            if (this.function.equals(byFunctionOrdering.function) && this.ordering.equals(byFunctionOrdering.ordering)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return k950.m148864b(this.function, this.ordering);
    }

    public String toString() {
        String strValueOf = String.valueOf(this.ordering);
        String strValueOf2 = String.valueOf(this.function);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 13 + strValueOf2.length());
        sb.append(strValueOf);
        sb.append(".onResultOf(");
        sb.append(strValueOf2);
        sb.append(")");
        return sb.toString();
    }
}
