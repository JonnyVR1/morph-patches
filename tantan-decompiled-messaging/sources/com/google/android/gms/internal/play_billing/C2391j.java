package com.google.android.gms.internal.play_billing;

import p149l.luu0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C2391j extends AbstractC2381e {
    public /* synthetic */ C2391j(luu0 luu0Var) {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2381e
    /* JADX INFO: renamed from: a */
    public final C2385g mo14778a(AbstractC2401o abstractC2401o, C2385g c2385g) {
        C2385g c2385g2;
        synchronized (abstractC2401o) {
            try {
                c2385g2 = abstractC2401o.f10367b;
                if (c2385g2 != c2385g) {
                    abstractC2401o.f10367b = c2385g;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2385g2;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2381e
    /* JADX INFO: renamed from: b */
    public final C2399n mo14779b(AbstractC2401o abstractC2401o, C2399n c2399n) {
        C2399n c2399n2;
        synchronized (abstractC2401o) {
            try {
                c2399n2 = abstractC2401o.f10368c;
                if (c2399n2 != c2399n) {
                    abstractC2401o.f10368c = c2399n;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2399n2;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2381e
    /* JADX INFO: renamed from: c */
    public final void mo14780c(C2399n c2399n, C2399n c2399n2) {
        c2399n.f10361b = c2399n2;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2381e
    /* JADX INFO: renamed from: d */
    public final void mo14781d(C2399n c2399n, Thread thread) {
        c2399n.f10360a = thread;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2381e
    /* JADX INFO: renamed from: e */
    public final boolean mo14782e(AbstractC2401o abstractC2401o, C2385g c2385g, C2385g c2385g2) {
        synchronized (abstractC2401o) {
            try {
                if (abstractC2401o.f10367b != c2385g) {
                    return false;
                }
                abstractC2401o.f10367b = c2385g2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2381e
    /* JADX INFO: renamed from: f */
    public final boolean mo14783f(AbstractC2401o abstractC2401o, Object obj, Object obj2) {
        synchronized (abstractC2401o) {
            try {
                if (abstractC2401o.f10366a != obj) {
                    return false;
                }
                abstractC2401o.f10366a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2381e
    /* JADX INFO: renamed from: g */
    public final boolean mo14784g(AbstractC2401o abstractC2401o, C2399n c2399n, C2399n c2399n2) {
        synchronized (abstractC2401o) {
            try {
                if (abstractC2401o.f10368c != c2399n) {
                    return false;
                }
                abstractC2401o.f10368c = c2399n2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
