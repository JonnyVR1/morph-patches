package com.google.common.base;

import java.util.Collections;
import java.util.Set;
import p149l.gaj;
import p149l.sf80;
import p149l.tyg0;

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
    public T mo15406or(T t) {
        sf80.m183895q(t, "use Optional.orNull() instead of Optional.or(null)");
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
    public <V> Optional<V> transform(gaj<? super T, V> gajVar) {
        return new Present(sf80.m183895q(gajVar.apply(this.reference), "the Function passed to Optional.transform() must not return null."));
    }

    @Override // com.google.common.base.Optional
    /* JADX INFO: renamed from: or */
    public Optional<T> mo15405or(Optional<? extends T> optional) {
        sf80.m183894p(optional);
        return this;
    }

    @Override // com.google.common.base.Optional
    /* JADX INFO: renamed from: or */
    public T mo15407or(tyg0<? extends T> tyg0Var) {
        sf80.m183894p(tyg0Var);
        return this.reference;
    }
}
