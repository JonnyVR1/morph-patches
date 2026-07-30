package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.Lazy;

/* JADX INFO: loaded from: classes6.dex */
public final class InstanceFactory<T> implements Factory<T>, Lazy<T> {
    private static final InstanceFactory<Object> NULL_INSTANCE_FACTORY = new InstanceFactory<>(null);
    private final T instance;

    private InstanceFactory(T t) {
        this.instance = t;
    }

    public static <T> Factory<T> create(T t) {
        return new InstanceFactory(Preconditions.checkNotNull(t, "instance cannot be null"));
    }

    public static <T> Factory<T> createNullable(T t) {
        return t == null ? nullInstanceFactory() : new InstanceFactory(t);
    }

    private static <T> InstanceFactory<T> nullInstanceFactory() {
        return (InstanceFactory<T>) NULL_INSTANCE_FACTORY;
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, p153l.i7b0
    public T get() {
        return this.instance;
    }
}
