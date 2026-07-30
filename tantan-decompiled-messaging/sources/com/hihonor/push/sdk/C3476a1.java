package com.hihonor.push.sdk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.hihonor.push.sdk.a1 */
/* JADX INFO: loaded from: classes7.dex */
public final class C3476a1 {

    /* JADX INFO: renamed from: b */
    public boolean f11841b;

    /* JADX INFO: renamed from: c */
    public Object f11842c;

    /* JADX INFO: renamed from: d */
    public Exception f11843d;

    /* JADX INFO: renamed from: a */
    public final Object f11840a = new Object();

    /* JADX INFO: renamed from: e */
    public List<InterfaceC3502j0<Object>> f11844e = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final void m17481a() {
        synchronized (this.f11840a) {
            Iterator<InterfaceC3502j0<Object>> it = this.f11844e.iterator();
            while (it.hasNext()) {
                try {
                    it.next().mo17517a(this);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            }
            this.f11844e = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final Exception m17482b() {
        Exception exc;
        synchronized (this.f11840a) {
            exc = this.f11843d;
        }
        return exc;
    }

    /* JADX INFO: renamed from: c */
    public final Object m17483c() {
        Object obj;
        synchronized (this.f11840a) {
            try {
                Exception exc = this.f11843d;
                if (exc != null) {
                    throw new RuntimeException(exc);
                }
                obj = this.f11842c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m17484d() {
        synchronized (this.f11840a) {
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0012  */
    /* JADX INFO: renamed from: e */
    public final boolean m17485e() {
        boolean z;
        synchronized (this.f11840a) {
            try {
                if (this.f11841b) {
                    m17484d();
                    if (this.f11843d == null) {
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
    public final C3476a1 m17480a(InterfaceC3502j0 interfaceC3502j0) {
        synchronized (this.f11840a) {
            try {
                if (!this.f11841b) {
                    this.f11844e.add(interfaceC3502j0);
                } else {
                    interfaceC3502j0.mo17517a(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }
}
