package p153l;

import com.google.android.gms.internal.ads.zzead;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class zzt0 {

    /* JADX INFO: renamed from: a */
    public final Executor f206739a;

    /* JADX INFO: renamed from: b */
    public final ScheduledExecutorService f206740b;

    /* JADX INFO: renamed from: c */
    public final hpr f206741c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f206742d = true;

    public zzt0(Executor executor, ScheduledExecutorService scheduledExecutorService, hpr hprVar) {
        this.f206739a = executor;
        this.f206740b = scheduledExecutorService;
        this.f206741c = hprVar;
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ void m222283b(final zzt0 zzt0Var, List list, final lvw0 lvw0Var) {
        if (list == null || list.isEmpty()) {
            zzt0Var.f206739a.execute(new Runnable() { // from class: l.uzt0
                @Override // java.lang.Runnable
                public final void run() {
                    lvw0Var.zza(new zzead(3));
                }
            });
            return;
        }
        hpr hprVarM173981h = pvw0.m173981h(null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final hpr hprVar = (hpr) it.next();
            hprVarM173981h = pvw0.m173987n(pvw0.m173979f(hprVarM173981h, Throwable.class, new xuw0() { // from class: l.vzt0
                @Override // p153l.xuw0
                public final hpr zza(Object obj) {
                    lvw0Var.zza((Throwable) obj);
                    return pvw0.m173981h(null);
                }
            }, zzt0Var.f206739a), new xuw0() { // from class: l.wzt0
                @Override // p153l.xuw0
                public final hpr zza(Object obj) {
                    return this.f191827a.m222285a(lvw0Var, hprVar, (kzt0) obj);
                }
            }, zzt0Var.f206739a);
        }
        pvw0.m173991r(hprVarM173981h, new yzt0(zzt0Var, lvw0Var), zzt0Var.f206739a);
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hpr m222285a(lvw0 lvw0Var, hpr hprVar, kzt0 kzt0Var) throws Exception {
        if (kzt0Var != null) {
            lvw0Var.zzb(kzt0Var);
        }
        return pvw0.m173988o(hprVar, ((Long) ujs0.f179333b.m149974e()).longValue(), TimeUnit.MILLISECONDS, this.f206740b);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m222286d() {
        this.f206742d = false;
    }

    /* JADX INFO: renamed from: e */
    public final void m222287e(lvw0 lvw0Var) {
        pvw0.m173991r(this.f206741c, new xzt0(this, lvw0Var), this.f206739a);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m222288f() {
        return this.f206742d;
    }
}
