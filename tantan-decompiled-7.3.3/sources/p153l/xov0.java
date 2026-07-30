package p153l;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class xov0 implements wuv0 {

    /* JADX INFO: renamed from: a */
    @VisibleForTesting
    public final ebt0 f195603a;

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    public fx0 f195604b;

    /* JADX INFO: renamed from: c */
    public final ScheduledExecutorService f195605c;

    /* JADX INFO: renamed from: d */
    public final xvw0 f195606d;

    /* JADX INFO: renamed from: e */
    public final Context f195607e;

    public xov0(Context context, ebt0 ebt0Var, ScheduledExecutorService scheduledExecutorService, xvw0 xvw0Var) {
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f167990G2)).booleanValue()) {
            this.f195604b = ex0.m122996a(context);
        }
        this.f195607e = context;
        this.f195603a = ebt0Var;
        this.f195605c = scheduledExecutorService;
        this.f195606d = xvw0Var;
    }

    @Override // p153l.wuv0
    public final int zza() {
        return 11;
    }

    @Override // p153l.wuv0
    public final hpr zzb() {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f167942C2)).booleanValue()) {
            if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168002H2)).booleanValue()) {
                if (!((Boolean) jas0.m144075c().m176505a(sgs0.f167954D2)).booleanValue()) {
                    return pvw0.m173986m(olw0.m168174a(this.f195604b.mo13809a(), null), new eow0() { // from class: l.uov0
                        @Override // p153l.eow0
                        public final Object apply(Object obj) {
                            gx0 gx0Var = (gx0) obj;
                            return new yov0(gx0Var.m132709a(), gx0Var.m132710b());
                        }
                    }, oct0.f146738f);
                }
                Task<gx0> taskM214780a = ((Boolean) jas0.m144075c().m176505a(sgs0.f167990G2)).booleanValue() ? y8w0.m214780a(this.f195607e) : this.f195604b.mo13809a();
                if (taskM214780a == null) {
                    return pvw0.m173981h(new yov0(null, -1));
                }
                hpr hprVarM173987n = pvw0.m173987n(olw0.m168174a(taskM214780a, null), new xuw0() { // from class: l.vov0
                    @Override // p153l.xuw0
                    public final hpr zza(Object obj) {
                        gx0 gx0Var = (gx0) obj;
                        return gx0Var == null ? pvw0.m173981h(new yov0(null, -1)) : pvw0.m173981h(new yov0(gx0Var.m132709a(), gx0Var.m132710b()));
                    }
                }, oct0.f146738f);
                if (((Boolean) jas0.m144075c().m176505a(sgs0.f167966E2)).booleanValue()) {
                    hprVarM173987n = pvw0.m173988o(hprVarM173987n, ((Long) jas0.m144075c().m176505a(sgs0.f167978F2)).longValue(), TimeUnit.MILLISECONDS, this.f195605c);
                }
                return pvw0.m173978e(hprVarM173987n, Exception.class, new eow0() { // from class: l.wov0
                    @Override // p153l.eow0
                    public final Object apply(Object obj) {
                        this.f190197a.f195603a.m120275w((Exception) obj, "AppSetIdInfoSignal");
                        return new yov0(null, -1);
                    }
                }, this.f195606d);
            }
        }
        return pvw0.m173981h(new yov0(null, -1));
    }
}
