package com.google.common.collect;

import java.io.Serializable;
import p149l.gaj;
import p149l.sf80;
import p149l.v050;

/* JADX INFO: loaded from: classes7.dex */
final class ByFunctionOrdering<F, T> extends Ordering<F> implements Serializable {
    private static final long serialVersionUID = 0;
    final gaj<F, ? extends T> function;
    final Ordering<T> ordering;

    public ByFunctionOrdering(gaj<F, ? extends T> gajVar, Ordering<T> ordering) {
        this.function = (gaj) sf80.m183894p(gajVar);
        this.ordering = (Ordering) sf80.m183894p(ordering);
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
        return v050.m196471b(this.function, this.ordering);
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
