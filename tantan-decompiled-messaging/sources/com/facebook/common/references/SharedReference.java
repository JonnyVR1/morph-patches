package com.facebook.common.references;

import java.util.IdentityHashMap;
import java.util.Map;
import p149l.rf80;
import p149l.tsf;
import p149l.twc0;

/* JADX INFO: loaded from: classes.dex */
public class SharedReference<T> {

    /* JADX INFO: renamed from: d */
    public static final Map<Object, Integer> f6259d = new IdentityHashMap();

    /* JADX INFO: renamed from: a */
    public T f6260a;

    /* JADX INFO: renamed from: b */
    public int f6261b = 1;

    /* JADX INFO: renamed from: c */
    public final twc0<T> f6262c;

    public static class NullReferenceException extends RuntimeException {
        public NullReferenceException() {
            super("Null shared reference");
        }
    }

    public SharedReference(T t, twc0<T> twc0Var, boolean z) {
        this.f6260a = (T) rf80.m179116g(t);
        this.f6262c = twc0Var;
        if (z) {
            m8158a(t);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m8158a(Object obj) {
        Map<Object, Integer> map = f6259d;
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
    public static boolean m8159h(SharedReference<?> sharedReference) {
        return sharedReference != null && sharedReference.m8166g();
    }

    /* JADX INFO: renamed from: i */
    public static void m8160i(Object obj) {
        Map<Object, Integer> map = f6259d;
        synchronized (map) {
            try {
                Integer num = map.get(obj);
                if (num == null) {
                    tsf.m190534B("SharedReference", "No entry in sLiveObjects for value of type %s", obj.getClass());
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
    public synchronized void m8161b() {
        m8164e();
        this.f6261b++;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized int m8162c() {
        int i;
        m8164e();
        rf80.m179111b(Boolean.valueOf(this.f6261b > 0));
        i = this.f6261b - 1;
        this.f6261b = i;
        return i;
    }

    /* JADX INFO: renamed from: d */
    public void m8163d() {
        T t;
        if (m8162c() == 0) {
            synchronized (this) {
                t = this.f6260a;
                this.f6260a = null;
            }
            if (t != null) {
                twc0<T> twc0Var = this.f6262c;
                if (twc0Var != null) {
                    twc0Var.release(t);
                }
                m8160i(t);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m8164e() {
        if (!m8159h(this)) {
            throw new NullReferenceException();
        }
    }

    /* JADX INFO: renamed from: f */
    public synchronized T m8165f() {
        return this.f6260a;
    }

    /* JADX INFO: renamed from: g */
    public synchronized boolean m8166g() {
        return this.f6261b > 0;
    }
}
