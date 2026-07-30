package com.facebook.common.references;

import java.util.IdentityHashMap;
import java.util.Map;
import p153l.huf;
import p153l.w4d0;
import p153l.wn80;

/* JADX INFO: loaded from: classes.dex */
public class SharedReference<T> {

    /* JADX INFO: renamed from: d */
    public static final Map<Object, Integer> f6296d = new IdentityHashMap();

    /* JADX INFO: renamed from: a */
    public T f6297a;

    /* JADX INFO: renamed from: b */
    public int f6298b = 1;

    /* JADX INFO: renamed from: c */
    public final w4d0<T> f6299c;

    public static class NullReferenceException extends RuntimeException {
        public NullReferenceException() {
            super("Null shared reference");
        }
    }

    public SharedReference(T t, w4d0<T> w4d0Var, boolean z) {
        this.f6297a = (T) wn80.m207182g(t);
        this.f6299c = w4d0Var;
        if (z) {
            m8212a(t);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m8212a(Object obj) {
        Map<Object, Integer> map = f6296d;
        synchronized (map) {
            try {
                Integer num = map.get(obj);
                if (num == null) {
                    map.put(obj, 1);
                } else {
                    map.put(obj, Integer.valueOf(num.intValue() + 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m8213h(SharedReference<?> sharedReference) {
        return sharedReference != null && sharedReference.m8220g();
    }

    /* JADX INFO: renamed from: i */
    public static void m8214i(Object obj) {
        Map<Object, Integer> map = f6296d;
        synchronized (map) {
            try {
                Integer num = map.get(obj);
                if (num == null) {
                    huf.m137172B("SharedReference", "No entry in sLiveObjects for value of type %s", obj.getClass());
                } else if (num.intValue() == 1) {
                    map.remove(obj);
                } else {
                    map.put(obj, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m8215b() {
        m8218e();
        this.f6298b++;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized int m8216c() {
        int i;
        m8218e();
        wn80.m207177b(Boolean.valueOf(this.f6298b > 0));
        i = this.f6298b - 1;
        this.f6298b = i;
        return i;
    }

    /* JADX INFO: renamed from: d */
    public void m8217d() {
        T t;
        if (m8216c() == 0) {
            synchronized (this) {
                t = this.f6297a;
                this.f6297a = null;
            }
            if (t != null) {
                w4d0<T> w4d0Var = this.f6299c;
                if (w4d0Var != null) {
                    w4d0Var.release(t);
                }
                m8214i(t);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m8218e() {
        if (!m8213h(this)) {
            throw new NullReferenceException();
        }
    }

    /* JADX INFO: renamed from: f */
    public synchronized T m8219f() {
        return this.f6297a;
    }

    /* JADX INFO: renamed from: g */
    public synchronized boolean m8220g() {
        return this.f6298b > 0;
    }
}
