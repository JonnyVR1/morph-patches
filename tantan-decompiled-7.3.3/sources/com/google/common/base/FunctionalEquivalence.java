package com.google.common.base;

import java.io.Serializable;
import p153l.adj;
import p153l.k950;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
final class FunctionalEquivalence<F, T> extends Equivalence<F> implements Serializable {
    private static final long serialVersionUID = 0;
    private final adj<? super F, ? extends T> function;
    private final Equivalence<T> resultEquivalence;

    public FunctionalEquivalence(adj<? super F, ? extends T> adjVar, Equivalence<T> equivalence) {
        this.function = (adj) xn80.m212111p(adjVar);
        this.resultEquivalence = (Equivalence) xn80.m212111p(equivalence);
    }

    @Override // com.google.common.base.Equivalence
    public boolean doEquivalent(F f, F f2) {
        return this.resultEquivalence.equivalent(this.function.apply(f), this.function.apply(f2));
    }

    @Override // com.google.common.base.Equivalence
    public int doHash(F f) {
        return this.resultEquivalence.hash(this.function.apply(f));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FunctionalEquivalence) {
            FunctionalEquivalence functionalEquivalence = (FunctionalEquivalence) obj;
            if (this.function.equals(functionalEquivalence.function) && this.resultEquivalence.equals(functionalEquivalence.resultEquivalence)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return k950.m148864b(this.function, this.resultEquivalence);
    }

    public String toString() {
        String strValueOf = String.valueOf(this.resultEquivalence);
        String strValueOf2 = String.valueOf(this.function);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 13 + strValueOf2.length());
        sb.append(strValueOf);
        sb.append(".onResultOf(");
        sb.append(strValueOf2);
        sb.append(")");
        return sb.toString();
    }
}
