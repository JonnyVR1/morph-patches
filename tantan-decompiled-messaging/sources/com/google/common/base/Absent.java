package com.google.common.base;

import java.util.Collections;
import java.util.Set;
import p149l.gaj;
import p149l.sf80;
import p149l.tyg0;

/* JADX INFO: loaded from: classes7.dex */
final class Absent<T> extends Optional<T> {
    static final Absent<Object> INSTANCE = new Absent<>();
    private static final long serialVersionUID = 0;

    private Absent() {
    }

    private Object readResolve() {
        return INSTANCE;
    }

    public static <T> Optional<T> withType() {
        return INSTANCE;
    }

    @Override // com.google.common.base.Optional
    public Set<T> asSet() {
        return Collections.EMPTY_SET;
    }

    @Override // com.google.common.base.Optional
    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // com.google.common.base.Optional
    public T get() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.google.common.base.Optional
    public int hashCode() {
        return 2040732332;
    }

    @Override // com.google.common.base.Optional
    public boolean isPresent() {
        return false;
    }

    @Override // com.google.common.base.Optional
    /* JADX INFO: renamed from: or */
    public T mo15407or(tyg0<? extends T> tyg0Var) {
        return (T) sf80.m183895q(tyg0Var.get(), "use Optional.orNull() instead of a Supplier that returns null");
    }

    @Override // com.google.common.base.Optional
    public T orNull() {
        return null;
    }

    @Override // com.google.common.base.Optional
    public String toString() {
        return "Optional.absent()";
    }

    @Override // com.google.common.base.Optional
    public <V> Optional<V> transform(gaj<? super T, V> gajVar) {
        sf80.m183894p(gajVar);
        return Optional.absent();
    }

    @Override // com.google.common.base.Optional
    /* JADX INFO: renamed from: or */
    public Optional<T> mo15405or(Optional<? extends T> optional) {
        return (Optional) sf80.m183894p(optional);
    }

    @Override // com.google.common.base.Optional
    /* JADX INFO: renamed from: or */
    public T mo15406or(T t) {
        return (T) sf80.m183895q(t, "use Optional.orNull() instead of Optional.or(null)");
    }
}
