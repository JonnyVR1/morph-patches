package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import p153l.etw0;
import p153l.hpr;
import p153l.pvw0;
import p153l.tow0;
import p153l.wvw0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.o3 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC2235o3 extends AbstractC2243p3 {

    /* JADX INFO: renamed from: o */
    public static final wvw0 f10049o = new wvw0(AbstractC2235o3.class);

    /* JADX INFO: renamed from: l */
    public zzfzv f10050l;

    /* JADX INFO: renamed from: m */
    public final boolean f10051m;

    /* JADX INFO: renamed from: n */
    public final boolean f10052n;

    public AbstractC2235o3(zzfzv zzfzvVar, boolean z, boolean z2) {
        super(zzfzvVar.size());
        this.f10050l = zzfzvVar;
        this.f10051m = z;
        this.f10052n = z2;
    }

    /* JADX INFO: renamed from: N */
    public static void m13129N(Throwable th) {
        f10049o.m208109a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    /* JADX INFO: renamed from: O */
    public static boolean m13130O(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2243p3
    /* JADX INFO: renamed from: I */
    public final void mo13131I(Set set) {
        set.getClass();
        if (isCancelled()) {
            return;
        }
        Throwable thMo13072a = mo13072a();
        Objects.requireNonNull(thMo13072a);
        m13130O(set, thMo13072a);
    }

    /* JADX INFO: renamed from: K */
    public final void m13132K(int i, Future future) {
        try {
            mo13135P(i, pvw0.m173989p(future));
        } catch (ExecutionException e) {
            m13134M(e.getCause());
        } catch (Throwable th) {
            m13134M(th);
        }
    }

    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public final void m13139T(zzfzv zzfzvVar) {
        int iM13207C = m13207C();
        int i = 0;
        tow0.m192095j(iM13207C >= 0, "Less than 0 remaining futures");
        if (iM13207C == 0) {
            if (zzfzvVar != null) {
                etw0 it = zzfzvVar.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        m13132K(i, future);
                    }
                    i++;
                }
            }
            m13209H();
            mo13136Q();
            mo13140U(2);
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m13134M(Throwable th) {
        th.getClass();
        if (this.f10051m && !mo13076f(th) && m13130O(m13208E(), th)) {
            m13129N(th);
        } else if (th instanceof Error) {
            m13129N(th);
        }
    }

    /* JADX INFO: renamed from: P */
    public abstract void mo13135P(int i, Object obj);

    /* JADX INFO: renamed from: Q */
    public abstract void mo13136Q();

    /* JADX INFO: renamed from: R */
    public final void m13137R() {
        Objects.requireNonNull(this.f10050l);
        if (this.f10050l.isEmpty()) {
            mo13136Q();
            return;
        }
        if (!this.f10051m) {
            final zzfzv zzfzvVar = this.f10052n ? this.f10050l : null;
            Runnable runnable = new Runnable() { // from class: l.quw0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f159653a.m13139T(zzfzvVar);
                }
            };
            etw0 it = this.f10050l.iterator();
            while (it.hasNext()) {
                ((hpr) it.next()).addListener(runnable, zzgeb.INSTANCE);
            }
            return;
        }
        etw0 it2 = this.f10050l.iterator();
        final int i = 0;
        while (it2.hasNext()) {
            final hpr hprVar = (hpr) it2.next();
            hprVar.addListener(new Runnable() { // from class: l.puw0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f154251a.m13138S(hprVar, i);
                }
            }, zzgeb.INSTANCE);
            i++;
        }
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m13138S(hpr hprVar, int i) {
        try {
            if (hprVar.isCancelled()) {
                this.f10050l = null;
                cancel(false);
            } else {
                m13132K(i, hprVar);
            }
        } finally {
            m13139T(null);
        }
    }

    /* JADX INFO: renamed from: U */
    public void mo13140U(int i) {
        this.f10050l = null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2227n3
    /* JADX INFO: renamed from: c */
    public final String mo13073c() {
        zzfzv zzfzvVar = this.f10050l;
        return zzfzvVar != null ? "futures=".concat(zzfzvVar.toString()) : super.mo13073c();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2227n3
    /* JADX INFO: renamed from: d */
    public final void mo13074d() {
        zzfzv zzfzvVar = this.f10050l;
        mo13140U(1);
        if ((zzfzvVar != null) && isCancelled()) {
            boolean zM13080v = m13080v();
            etw0 it = zzfzvVar.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zM13080v);
            }
        }
    }
}
