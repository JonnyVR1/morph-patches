package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import p149l.gnr;
import p149l.jmw0;
import p149l.nfw0;
import p149l.qmw0;
import p149l.yjw0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.o3 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC2212o3 extends AbstractC2220p3 {

    /* JADX INFO: renamed from: o */
    public static final qmw0 f10012o = new qmw0(AbstractC2212o3.class);

    /* JADX INFO: renamed from: l */
    public zzfzv f10013l;

    /* JADX INFO: renamed from: m */
    public final boolean f10014m;

    /* JADX INFO: renamed from: n */
    public final boolean f10015n;

    public AbstractC2212o3(zzfzv zzfzvVar, boolean z, boolean z2) {
        super(zzfzvVar.size());
        this.f10013l = zzfzvVar;
        this.f10014m = z;
        this.f10015n = z2;
    }

    /* JADX INFO: renamed from: N */
    public static void m13075N(Throwable th) {
        f10012o.m175582a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    /* JADX INFO: renamed from: O */
    public static boolean m13076O(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2220p3
    /* JADX INFO: renamed from: I */
    public final void mo13077I(Set set) {
        set.getClass();
        if (isCancelled()) {
            return;
        }
        Throwable thMo13018a = mo13018a();
        Objects.requireNonNull(thMo13018a);
        m13076O(set, thMo13018a);
    }

    /* JADX INFO: renamed from: K */
    public final void m13078K(int i, Future future) {
        try {
            mo13081P(i, jmw0.m142243p(future));
        } catch (ExecutionException e) {
            m13080M(e.getCause());
        } catch (Throwable th) {
            m13080M(th);
        }
    }

    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public final void m13085T(zzfzv zzfzvVar) {
        int iM13153C = m13153C();
        int i = 0;
        nfw0.m159288j(iM13153C >= 0, "Less than 0 remaining futures");
        if (iM13153C == 0) {
            if (zzfzvVar != null) {
                yjw0 it = zzfzvVar.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        m13078K(i, future);
                    }
                    i++;
                }
            }
            m13155H();
            mo13082Q();
            mo13086U(2);
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m13080M(Throwable th) {
        th.getClass();
        if (this.f10014m && !mo13022f(th) && m13076O(m13154E(), th)) {
            m13075N(th);
        } else if (th instanceof Error) {
            m13075N(th);
        }
    }

    /* JADX INFO: renamed from: P */
    public abstract void mo13081P(int i, Object obj);

    /* JADX INFO: renamed from: Q */
    public abstract void mo13082Q();

    /* JADX INFO: renamed from: R */
    public final void m13083R() {
        Objects.requireNonNull(this.f10013l);
        if (this.f10013l.isEmpty()) {
            mo13082Q();
            return;
        }
        if (!this.f10014m) {
            final zzfzv zzfzvVar = this.f10015n ? this.f10013l : null;
            Runnable runnable = new Runnable() { // from class: l.klw0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f123721a.m13085T(zzfzvVar);
                }
            };
            yjw0 it = this.f10013l.iterator();
            while (it.hasNext()) {
                ((gnr) it.next()).addListener(runnable, zzgeb.INSTANCE);
            }
            return;
        }
        yjw0 it2 = this.f10013l.iterator();
        final int i = 0;
        while (it2.hasNext()) {
            final gnr gnrVar = (gnr) it2.next();
            gnrVar.addListener(new Runnable() { // from class: l.jlw0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f118596a.m13084S(gnrVar, i);
                }
            }, zzgeb.INSTANCE);
            i++;
        }
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m13084S(gnr gnrVar, int i) {
        try {
            if (gnrVar.isCancelled()) {
                this.f10013l = null;
                cancel(false);
            } else {
                m13078K(i, gnrVar);
            }
        } finally {
            m13085T(null);
        }
    }

    /* JADX INFO: renamed from: U */
    public void mo13086U(int i) {
        this.f10013l = null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2204n3
    /* JADX INFO: renamed from: c */
    public final String mo13019c() {
        zzfzv zzfzvVar = this.f10013l;
        return zzfzvVar != null ? "futures=".concat(zzfzvVar.toString()) : super.mo13019c();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2204n3
    /* JADX INFO: renamed from: d */
    public final void mo13020d() {
        zzfzv zzfzvVar = this.f10013l;
        mo13086U(1);
        if ((zzfzvVar != null) && isCancelled()) {
            boolean zM13026v = m13026v();
            yjw0 it = zzfzvVar.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zM13026v);
            }
        }
    }
}
