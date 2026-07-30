package com.google.common.base;

import java.util.Collections;
import java.util.Set;
import p153l.adj;
import p153l.b7h0;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
final class Present<T> extends Optional<T> {
    private static final long serialVersionUID = 0;
    private final T reference;

    public Present(T t) {
        this.reference = t;
    }

    @Override // com.google.common.base.Optional
    public Set<T> asSet() {
        return Collections.singleton(this.reference);
    }

    @Override // com.google.common.base.Optional
    public boolean equals(Object obj) {
        if (obj instanceof Present) {
            return this.reference.equals(((Present) obj).reference);
        }
        return false;
    }

    @Override // com.google.common.base.Optional
    public T get() {
        return this.reference;
    }

    @Override // com.google.common.base.Optional
    public int hashCode() {
        return this.reference.hashCode() + 1502476572;
    }

    @Override // com.google.common.base.Optional
    public boolean isPresent() {
        return true;
    }

    @Override // com.google.common.base.Optional
    /* JADX INFO: renamed from: or */
    public T mo15460or(T t) {
        xn80.m212112q(t, "use Optional.orNull() instead of Optional.or(null)");
        return this.reference;
    }

    @Override // com.google.common.base.Optional
    public T orNull() {
        return this.reference;
    }

    @Override // com.google.common.base.Optional
    public String toString() {
        String strValueOf = String.valueOf(this.reference);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 13);
        sb.append("Optional.of(");
        sb.append(strValueOf);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.common.base.Optional
    public <V> Optional<V> transform(adj<? super T, V> adjVar) {
        return new Present(xn80.m212112q(adjVar.apply(this.reference), "the Function passed to Optional.transform() must not return null."));
    }

    @Override // com.google.common.base.Optional
    /* JADX INFO: renamed from: or */
    public Optional<T> mo15459or(Optional<? extends T> optional) {
        xn80.m212111p(optional);
        return this;
    }

    @Override // com.google.common.base.Optional
    /* JADX INFO: renamed from: or */
    public T mo15461or(b7h0<? extends T> b7h0Var) {
        xn80.m212111p(b7h0Var);
        return this.reference;
    }
}
