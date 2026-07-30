package com.google.common.base;

import java.io.Serializable;
import p149l.gaj;
import p149l.sf80;
import p149l.v050;

/* JADX INFO: loaded from: classes7.dex */
final class FunctionalEquivalence<F, T> extends Equivalence<F> implements Serializable {
    private static final long serialVersionUID = 0;
    private final gaj<? super F, ? extends T> function;
    private final Equivalence<T> resultEquivalence;

    public FunctionalEquivalence(gaj<? super F, ? extends T> gajVar, Equivalence<T> equivalence) {
        this.function = (gaj) sf80.m183894p(gajVar);
        this.resultEquivalence = (Equivalence) sf80.m183894p(equivalence);
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
        return v050.m196471b(this.function, this.resultEquivalence);
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
