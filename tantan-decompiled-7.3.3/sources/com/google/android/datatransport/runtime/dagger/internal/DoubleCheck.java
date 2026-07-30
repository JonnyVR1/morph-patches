package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.Lazy;
import p153l.i7b0;

/* JADX INFO: loaded from: classes6.dex */
public final class DoubleCheck<T> implements i7b0<T>, Lazy<T> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Object UNINITIALIZED = new Object();
    private volatile Object instance = UNINITIALIZED;
    private volatile i7b0<T> provider;

    private DoubleCheck(i7b0<T> i7b0Var) {
        this.provider = i7b0Var;
    }

    public static <P extends i7b0<T>, T> Lazy<T> lazy(P p) {
        return p instanceof Lazy ? (Lazy) p : new DoubleCheck((i7b0) Preconditions.checkNotNull(p));
    }

    public static <P extends i7b0<T>, T> i7b0<T> provider(P p) {
        Preconditions.checkNotNull(p);
        return p instanceof DoubleCheck ? p : new DoubleCheck(p);
    }

    private static Object reentrantCheck(Object obj, Object obj2) {
        if (obj == UNINITIALIZED || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // p153l.i7b0
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
