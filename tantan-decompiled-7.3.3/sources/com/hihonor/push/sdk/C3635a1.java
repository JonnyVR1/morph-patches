package com.hihonor.push.sdk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.hihonor.push.sdk.a1 */
/* JADX INFO: loaded from: classes7.dex */
public final class C3635a1 {

    /* JADX INFO: renamed from: b */
    public boolean f12582b;

    /* JADX INFO: renamed from: c */
    public Object f12583c;

    /* JADX INFO: renamed from: d */
    public Exception f12584d;

    /* JADX INFO: renamed from: a */
    public final Object f12581a = new Object();

    /* JADX INFO: renamed from: e */
    public List<InterfaceC3661j0<Object>> f12585e = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final void m18558a() {
        synchronized (this.f12581a) {
            Iterator<InterfaceC3661j0<Object>> it = this.f12585e.iterator();
            while (it.hasNext()) {
                try {
                    it.next().mo18594a(this);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            }
            this.f12585e = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final Exception m18559b() {
        Exception exc;
        synchronized (this.f12581a) {
            exc = this.f12584d;
        }
        return exc;
    }

    /* JADX INFO: renamed from: c */
    public final Object m18560c() {
        Object obj;
        synchronized (this.f12581a) {
            try {
                Exception exc = this.f12584d;
                if (exc != null) {
                    throw new RuntimeException(exc);
                }
                obj = this.f12583c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m18561d() {
        synchronized (this.f12581a) {
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0012  */
    /* JADX INFO: renamed from: e */
    public final boolean m18562e() {
        boolean z;
        synchronized (this.f12581a) {
            try {
                if (this.f12582b) {
                    m18561d();
                    if (this.f12584d == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: a */
    public final C3635a1 m18557a(InterfaceC3661j0 interfaceC3661j0) {
        synchronized (this.f12581a) {
            try {
                if (!this.f12582b) {
                    this.f12585e.add(interfaceC3661j0);
                } else {
                    interfaceC3661j0.mo18594a(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }
}
