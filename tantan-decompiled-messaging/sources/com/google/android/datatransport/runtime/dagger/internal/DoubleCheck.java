package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.Lazy;
import p149l.eza0;

/* JADX INFO: loaded from: classes6.dex */
public final class DoubleCheck<T> implements eza0<T>, Lazy<T> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Object UNINITIALIZED = new Object();
    private volatile Object instance = UNINITIALIZED;
    private volatile eza0<T> provider;

    private DoubleCheck(eza0<T> eza0Var) {
        this.provider = eza0Var;
    }

    public static <P extends eza0<T>, T> Lazy<T> lazy(P p) {
        return p instanceof Lazy ? (Lazy) p : new DoubleCheck((eza0) Preconditions.checkNotNull(p));
    }

    public static <P extends eza0<T>, T> eza0<T> provider(P p) {
        Preconditions.checkNotNull(p);
        return p instanceof DoubleCheck ? p : new DoubleCheck(p);
    }

    private static Object reentrantCheck(Object obj, Object obj2) {
        if (obj == UNINITIALIZED || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // p149l.eza0
    public T get() {
        T t;
        T t2 = (T) this.instance;
        Object obj = UNINITIALIZED;
        if (t2 != obj) {
            return t2;
        }
        synchronized (this) {
            try {
                t = (T) this.instance;
                if (t == obj) {
                    t = this.provider.get();
                    this.instance = reentrantCheck(this.instance, t);
                    this.provider = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t;
    }
}
