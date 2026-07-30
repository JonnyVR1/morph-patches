package com.tencent.liteav.basic.util;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.tencent.liteav.basic.util.a */
/* JADX INFO: loaded from: classes2.dex */
public class C14210a<T> {

    /* JADX INFO: renamed from: b */
    private final a<T> f59337b;

    /* JADX INFO: renamed from: a */
    private final ThreadLocal<T> f59336a = new ThreadLocal<>();

    /* JADX INFO: renamed from: c */
    private WeakReference<T> f59338c = new WeakReference<>(null);

    /* JADX INFO: renamed from: com.tencent.liteav.basic.util.a$a */
    public interface a<T> {
        /* JADX INFO: renamed from: a */
        T mo84196a();
    }

    public C14210a(a<T> aVar) {
        this.f59337b = aVar;
    }

    /* JADX INFO: renamed from: b */
    private T m84194b() {
        T tMo84196a;
        T t = this.f59338c.get();
        if (t != null) {
            return t;
        }
        synchronized (this) {
            try {
                tMo84196a = this.f59338c.get();
                if (tMo84196a == null) {
                    tMo84196a = this.f59337b.mo84196a();
                    this.f59338c = new WeakReference<>(tMo84196a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return tMo84196a;
    }

    /* JADX INFO: renamed from: a */
    public T m84195a() {
        T t = this.f59336a.get();
        if (t != null) {
            return t;
        }
        T tM84194b = m84194b();
        this.f59336a.set(tM84194b);
        return tM84194b;
    }
}
