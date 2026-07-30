package com.google.common.base;

import java.util.Collections;
import java.util.Set;
import p153l.adj;
import p153l.b7h0;
import p153l.xn80;

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
    public T mo15461or(b7h0<? extends T> b7h0Var) {
        return (T) xn80.m212112q(b7h0Var.get(), "use Optional.orNull() instead of a Supplier that returns null");
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
    public <V> Optional<V> transform(adj<? super T, V> adjVar) {
        xn80.m212111p(adjVar);
        return Optional.absent();
    }

    @Override // com.google.common.base.Optional
    /* JADX INFO: renamed from: or */
    public Optional<T> mo15459or(Optional<? extends T> optional) {
        return (Optional) xn80.m212111p(optional);
    }

    @Override // com.google.common.base.Optional
    /* JADX INFO: renamed from: or */
    public T mo15460or(T t) {
        return (T) xn80.m212112q(t, "use Optional.orNull() instead of Optional.or(null)");
    }
}
