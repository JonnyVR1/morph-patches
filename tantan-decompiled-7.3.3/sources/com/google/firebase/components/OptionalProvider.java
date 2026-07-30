package com.google.firebase.components;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import p153l.wtq0;

/* JADX INFO: loaded from: classes7.dex */
class OptionalProvider<T> implements Provider<T>, Deferred<T> {
    private volatile Provider<T> delegate;

    @GuardedBy("this")
    private Deferred.DeferredHandler<T> handler;
    private static final Deferred.DeferredHandler<Object> NOOP_HANDLER = new Deferred.DeferredHandler() { // from class: com.google.firebase.components.d
        @Override // com.google.firebase.inject.Deferred.DeferredHandler
        public final void handle(Provider provider) {
            OptionalProvider.m16741c(provider);
        }
    };
    private static final Provider<Object> EMPTY_PROVIDER = new Provider() { // from class: com.google.firebase.components.e
        @Override // com.google.firebase.inject.Provider
        public final Object get() {
            return OptionalProvider.m16739a();
        }
    };

    private OptionalProvider(Deferred.DeferredHandler<T> deferredHandler, Provider<T> provider) {
        this.handler = deferredHandler;
        this.delegate = provider;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m16739a() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m16740b(Deferred.DeferredHandler deferredHandler, Deferred.DeferredHandler deferredHandler2, Provider provider) {
        deferredHandler.handle(provider);
        deferredHandler2.handle(provider);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m16741c(Provider provider) {
    }

    public static <T> OptionalProvider<T> empty() {
        return new OptionalProvider<>(NOOP_HANDLER, EMPTY_PROVIDER);
    }

    /* JADX INFO: renamed from: of */
    public static <T> OptionalProvider<T> m16742of(Provider<T> provider) {
        return new OptionalProvider<>(null, provider);
    }

    @Override // com.google.firebase.inject.Provider
    public T get() {
        return this.delegate.get();
    }

    public void set(Provider<T> provider) {
        Deferred.DeferredHandler<T> deferredHandler;
        if (this.delegate != EMPTY_PROVIDER) {
            wtq0.m207906a("provide() can be called only once.");
            return;
        }
        synchronized (this) {
            deferredHandler = this.handler;
            this.handler = null;
            this.delegate = provider;
        }
        deferredHandler.handle(provider);
    }

    @Override // com.google.firebase.inject.Deferred
    public void whenAvailable(@NonNull final Deferred.DeferredHandler<T> deferredHandler) {
        Provider<T> provider;
        Provider<T> provider2;
        Provider<T> provider3 = this.delegate;
        Provider<Object> provider4 = EMPTY_PROVIDER;
        if (provider3 != provider4) {
            deferredHandler.handle(provider3);
            return;
        }
        synchronized (this) {
            provider = this.delegate;
            if (provider != provider4) {
                provider2 = provider;
            } else {
                final Deferred.DeferredHandler<T> deferredHandler2 = this.handler;
                this.handler = new Deferred.DeferredHandler() { // from class: com.google.firebase.components.f
                    @Override // com.google.firebase.inject.Deferred.DeferredHandler
                    public final void handle(Provider provider5) {
                        OptionalProvider.m16740b(deferredHandler2, deferredHandler, provider5);
                    }
                };
                provider2 = null;
            }
        }
        if (provider2 != null) {
            deferredHandler.handle(provider);
        }
    }
}
