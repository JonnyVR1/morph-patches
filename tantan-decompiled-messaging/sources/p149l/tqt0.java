package p149l;

import com.google.android.gms.internal.ads.zzead;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class tqt0 {

    /* JADX INFO: renamed from: a */
    public final Executor f171624a;

    /* JADX INFO: renamed from: b */
    public final ScheduledExecutorService f171625b;

    /* JADX INFO: renamed from: c */
    public final gnr f171626c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f171627d = true;

    public tqt0(Executor executor, ScheduledExecutorService scheduledExecutorService, gnr gnrVar) {
        this.f171624a = executor;
        this.f171625b = scheduledExecutorService;
        this.f171626c = gnrVar;
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ void m190156b(final tqt0 tqt0Var, List list, final fmw0 fmw0Var) {
        if (list == null || list.isEmpty()) {
            tqt0Var.f171624a.execute(new Runnable() { // from class: l.oqt0
                @Override // java.lang.Runnable
                public final void run() {
                    fmw0Var.zza(new zzead(3));
                }
            });
            return;
        }
        gnr gnrVarM142235h = jmw0.m142235h(null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final gnr gnrVar = (gnr) it.next();
            gnrVarM142235h = jmw0.m142241n(jmw0.m142233f(gnrVarM142235h, Throwable.class, new rlw0() { // from class: l.pqt0
                @Override // p149l.rlw0
                public final gnr zza(Object obj) {
                    fmw0Var.zza((Throwable) obj);
                    return jmw0.m142235h(null);
                }
            }, tqt0Var.f171624a), new rlw0() { // from class: l.qqt0
                @Override // p149l.rlw0
                public final gnr zza(Object obj) {
                    return this.f155932a.m190158a(fmw0Var, gnrVar, (eqt0) obj);
                }
            }, tqt0Var.f171624a);
        }
        jmw0.m142245r(gnrVarM142235h, new sqt0(tqt0Var, fmw0Var), tqt0Var.f171624a);
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gnr m190158a(fmw0 fmw0Var, gnr gnrVar, eqt0 eqt0Var) throws Exception {
        if (eqt0Var != null) {
            fmw0Var.zzb(eqt0Var);
        }
        return jmw0.m142242o(gnrVar, ((Long) oas0.f142864b.m115379e()).longValue(), TimeUnit.MILLISECONDS, this.f171625b);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m190159d() {
        this.f171627d = false;
    }

    /* JADX INFO: renamed from: e */
    public final void m190160e(fmw0 fmw0Var) {
        jmw0.m142245r(this.f171626c, new rqt0(this, fmw0Var), this.f171624a);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m190161f() {
        return this.f171627d;
    }
}
