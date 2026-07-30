package p153l;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class dxv0 implements wuv0 {

    /* JADX INFO: renamed from: a */
    public final ebt0 f91117a;

    /* JADX INFO: renamed from: b */
    public final String f91118b;

    /* JADX INFO: renamed from: c */
    public final ScheduledExecutorService f91119c;

    /* JADX INFO: renamed from: d */
    public final xvw0 f91120d;

    /* JADX INFO: renamed from: e */
    public final cbs0 f91121e;

    public dxv0(String str, cbs0 cbs0Var, ebt0 ebt0Var, ScheduledExecutorService scheduledExecutorService, xvw0 xvw0Var) {
        this.f91118b = str;
        this.f91121e = cbs0Var;
        this.f91117a = ebt0Var;
        this.f91119c = scheduledExecutorService;
        this.f91120d = xvw0Var;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ exv0 m118575a(Exception exc) {
        this.f91117a.m120275w(exc, "AppSetIdInfoGmscoreSignal");
        return new exv0(null, -1);
    }

    @Override // p153l.wuv0
    public final int zza() {
        return 43;
    }

    @Override // p153l.wuv0
    public final hpr zzb() {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f167942C2)).booleanValue()) {
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168002H2)).booleanValue()) {
                hpr hprVarM173987n = pvw0.m173987n(olw0.m168174a(toi0.m192068f(null), null), new xuw0() { // from class: l.bxv0
                    @Override // p153l.xuw0
                    public final hpr zza(Object obj) {
                        gx0 gx0Var = (gx0) obj;
                        return gx0Var == null ? pvw0.m173981h(new exv0(null, -1)) : pvw0.m173981h(new exv0(gx0Var.m132709a(), gx0Var.m132710b()));
                    }
                }, this.f91120d);
                if (((Boolean) nis0.f142164a.m149974e()).booleanValue()) {
                    hprVarM173987n = pvw0.m173988o(hprVarM173987n, ((Long) nis0.f142165b.m149974e()).longValue(), TimeUnit.MILLISECONDS, this.f91119c);
                }
                return pvw0.m173978e(hprVarM173987n, Exception.class, new eow0() { // from class: l.cxv0
                    @Override // p153l.eow0
                    public final Object apply(Object obj) {
                        return this.f84277a.m118575a((Exception) obj);
                    }
                }, this.f91120d);
            }
        }
        return pvw0.m173981h(new exv0(null, -1));
    }
}
