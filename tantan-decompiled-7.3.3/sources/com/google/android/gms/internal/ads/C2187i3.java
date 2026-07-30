package com.google.android.gms.internal.ads;

import p153l.huw0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.i3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2187i3 extends AbstractC2147d3 {
    public /* synthetic */ C2187i3(huw0 huw0Var) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2147d3
    /* JADX INFO: renamed from: a */
    public final C2163f3 mo12695a(AbstractC2227n3 abstractC2227n3, C2163f3 c2163f3) {
        C2163f3 c2163f4;
        synchronized (abstractC2227n3) {
            try {
                c2163f4 = abstractC2227n3.f10040b;
                if (c2163f4 != c2163f3) {
                    abstractC2227n3.f10040b = c2163f3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2163f4;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2147d3
    /* JADX INFO: renamed from: b */
    public final C2219m3 mo12696b(AbstractC2227n3 abstractC2227n3, C2219m3 c2219m3) {
        C2219m3 c2219m4;
        synchronized (abstractC2227n3) {
            try {
                c2219m4 = abstractC2227n3.f10041c;
                if (c2219m4 != c2219m3) {
                    abstractC2227n3.f10041c = c2219m3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2219m4;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2147d3
    /* JADX INFO: renamed from: c */
    public final void mo12697c(C2219m3 c2219m3, C2219m3 c2219m4) {
        c2219m3.f10028b = c2219m4;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2147d3
    /* JADX INFO: renamed from: d */
    public final void mo12698d(C2219m3 c2219m3, Thread thread) {
        c2219m3.f10027a = thread;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2147d3
    /* JADX INFO: renamed from: e */
    public final boolean mo12699e(AbstractC2227n3 abstractC2227n3, C2163f3 c2163f3, C2163f3 c2163f4) {
        synchronized (abstractC2227n3) {
            try {
                if (abstractC2227n3.f10040b != c2163f3) {
                    return false;
                }
                abstractC2227n3.f10040b = c2163f4;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2147d3
    /* JADX INFO: renamed from: f */
    public final boolean mo12700f(AbstractC2227n3 abstractC2227n3, Object obj, Object obj2) {
        synchronized (abstractC2227n3) {
            try {
                if (abstractC2227n3.f10039a != obj) {
                    return false;
                }
                abstractC2227n3.f10039a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2147d3
    /* JADX INFO: renamed from: g */
    public final boolean mo12701g(AbstractC2227n3 abstractC2227n3, C2219m3 c2219m3, C2219m3 c2219m4) {
        synchronized (abstractC2227n3) {
            try {
                if (abstractC2227n3.f10041c != c2219m3) {
                    return false;
                }
                abstractC2227n3.f10041c = c2219m4;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
