package com.tencent.liteav.basic.util;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.tencent.liteav.basic.util.a */
/* JADX INFO: loaded from: classes2.dex */
public class C14047a<T> {

    /* JADX INFO: renamed from: b */
    private final a<T> f58489b;

    /* JADX INFO: renamed from: a */
    private final ThreadLocal<T> f58488a = new ThreadLocal<>();

    /* JADX INFO: renamed from: c */
    private WeakReference<T> f58490c = new WeakReference<>(null);

    /* JADX INFO: renamed from: com.tencent.liteav.basic.util.a$a */
    public interface a<T> {
        /* JADX INFO: renamed from: a */
        T mo83013a();
    }

    public C14047a(a<T> aVar) {
        this.f58489b = aVar;
    }

    /* JADX INFO: renamed from: b */
    private T m83011b() {
        T tMo83013a;
        T t = this.f58490c.get();
        if (t != null) {
            return t;
        }
        synchronized (this) {
            try {
                tMo83013a = this.f58490c.get();
                if (tMo83013a == null) {
                    tMo83013a = this.f58489b.mo83013a();
                    this.f58490c = new WeakReference<>(tMo83013a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return tMo83013a;
    }

    /* JADX INFO: renamed from: a */
    public T m83012a() {
        T t = this.f58488a.get();
        if (t != null) {
            return t;
        }
        T tM83011b = m83011b();
        this.f58488a.set(tM83011b);
        return tM83011b;
    }
}
