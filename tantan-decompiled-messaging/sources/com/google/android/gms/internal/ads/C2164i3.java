package com.google.android.gms.internal.ads;

import p149l.blw0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.i3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2164i3 extends AbstractC2124d3 {
    public /* synthetic */ C2164i3(blw0 blw0Var) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2124d3
    /* JADX INFO: renamed from: a */
    public final C2140f3 mo12641a(AbstractC2204n3 abstractC2204n3, C2140f3 c2140f3) {
        C2140f3 c2140f4;
        synchronized (abstractC2204n3) {
            try {
                c2140f4 = abstractC2204n3.f10003b;
                if (c2140f4 != c2140f3) {
                    abstractC2204n3.f10003b = c2140f3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2140f4;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2124d3
    /* JADX INFO: renamed from: b */
    public final C2196m3 mo12642b(AbstractC2204n3 abstractC2204n3, C2196m3 c2196m3) {
        C2196m3 c2196m4;
        synchronized (abstractC2204n3) {
            try {
                c2196m4 = abstractC2204n3.f10004c;
                if (c2196m4 != c2196m3) {
                    abstractC2204n3.f10004c = c2196m3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2196m4;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2124d3
    /* JADX INFO: renamed from: c */
    public final void mo12643c(C2196m3 c2196m3, C2196m3 c2196m4) {
        c2196m3.f9991b = c2196m4;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2124d3
    /* JADX INFO: renamed from: d */
    public final void mo12644d(C2196m3 c2196m3, Thread thread) {
        c2196m3.f9990a = thread;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2124d3
    /* JADX INFO: renamed from: e */
    public final boolean mo12645e(AbstractC2204n3 abstractC2204n3, C2140f3 c2140f3, C2140f3 c2140f4) {
        synchronized (abstractC2204n3) {
            try {
                if (abstractC2204n3.f10003b != c2140f3) {
                    return false;
                }
                abstractC2204n3.f10003b = c2140f4;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2124d3
    /* JADX INFO: renamed from: f */
    public final boolean mo12646f(AbstractC2204n3 abstractC2204n3, Object obj, Object obj2) {
        synchronized (abstractC2204n3) {
            try {
                if (abstractC2204n3.f10002a != obj) {
                    return false;
                }
                abstractC2204n3.f10002a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2124d3
    /* JADX INFO: renamed from: g */
    public final boolean mo12647g(AbstractC2204n3 abstractC2204n3, C2196m3 c2196m3, C2196m3 c2196m4) {
        synchronized (abstractC2204n3) {
            try {
                if (abstractC2204n3.f10004c != c2196m3) {
                    return false;
                }
                abstractC2204n3.f10004c = c2196m4;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
