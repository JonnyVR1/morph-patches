package com.google.android.gms.internal.play_billing;

import p153l.r3v0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C2414j extends AbstractC2404e {
    public /* synthetic */ C2414j(r3v0 r3v0Var) {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2404e
    /* JADX INFO: renamed from: a */
    public final C2408g mo14832a(AbstractC2424o abstractC2424o, C2408g c2408g) {
        C2408g c2408g2;
        synchronized (abstractC2424o) {
            try {
                c2408g2 = abstractC2424o.f10404b;
                if (c2408g2 != c2408g) {
                    abstractC2424o.f10404b = c2408g;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2408g2;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2404e
    /* JADX INFO: renamed from: b */
    public final C2422n mo14833b(AbstractC2424o abstractC2424o, C2422n c2422n) {
        C2422n c2422n2;
        synchronized (abstractC2424o) {
            try {
                c2422n2 = abstractC2424o.f10405c;
                if (c2422n2 != c2422n) {
                    abstractC2424o.f10405c = c2422n;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2422n2;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2404e
    /* JADX INFO: renamed from: c */
    public final void mo14834c(C2422n c2422n, C2422n c2422n2) {
        c2422n.f10398b = c2422n2;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2404e
    /* JADX INFO: renamed from: d */
    public final void mo14835d(C2422n c2422n, Thread thread) {
        c2422n.f10397a = thread;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2404e
    /* JADX INFO: renamed from: e */
    public final boolean mo14836e(AbstractC2424o abstractC2424o, C2408g c2408g, C2408g c2408g2) {
        synchronized (abstractC2424o) {
            try {
                if (abstractC2424o.f10404b != c2408g) {
                    return false;
                }
                abstractC2424o.f10404b = c2408g2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2404e
    /* JADX INFO: renamed from: f */
    public final boolean mo14837f(AbstractC2424o abstractC2424o, Object obj, Object obj2) {
        synchronized (abstractC2424o) {
            try {
                if (abstractC2424o.f10403a != obj) {
                    return false;
                }
                abstractC2424o.f10403a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2404e
    /* JADX INFO: renamed from: g */
    public final boolean mo14838g(AbstractC2424o abstractC2424o, C2422n c2422n, C2422n c2422n2) {
        synchronized (abstractC2424o) {
            try {
                if (abstractC2424o.f10405c != c2422n) {
                    return false;
                }
                abstractC2424o.f10405c = c2422n2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
