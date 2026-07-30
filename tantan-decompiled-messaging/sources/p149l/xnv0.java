package p149l;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class xnv0 implements qlv0 {

    /* JADX INFO: renamed from: a */
    public final y1t0 f193760a;

    /* JADX INFO: renamed from: b */
    public final String f193761b;

    /* JADX INFO: renamed from: c */
    public final ScheduledExecutorService f193762c;

    /* JADX INFO: renamed from: d */
    public final rmw0 f193763d;

    /* JADX INFO: renamed from: e */
    public final w1s0 f193764e;

    public xnv0(String str, w1s0 w1s0Var, y1t0 y1t0Var, ScheduledExecutorService scheduledExecutorService, rmw0 rmw0Var) {
        this.f193761b = str;
        this.f193764e = w1s0Var;
        this.f193760a = y1t0Var;
        this.f193762c = scheduledExecutorService;
        this.f193763d = rmw0Var;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ynv0 m210244a(Exception exc) {
        this.f193760a.m212290w(exc, "AppSetIdInfoGmscoreSignal");
        return new ynv0(null, -1);
    }

    @Override // p149l.qlv0
    public final int zza() {
        return 43;
    }

    @Override // p149l.qlv0
    public final gnr zzb() {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131871C2)).booleanValue()) {
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131931H2)).booleanValue()) {
                gnr gnrVarM142241n = jmw0.m142241n(icw0.m135370a(tfi0.m188734f(null), null), new rlw0() { // from class: l.vnv0
                    @Override // p149l.rlw0
                    public final gnr zza(Object obj) {
                        zw0 zw0Var = (zw0) obj;
                        return zw0Var == null ? jmw0.m142235h(new ynv0(null, -1)) : jmw0.m142235h(new ynv0(zw0Var.m220497a(), zw0Var.m220498b()));
                    }
                }, this.f193763d);
                if (((Boolean) h9s0.f106633a.m115379e()).booleanValue()) {
                    gnrVarM142241n = jmw0.m142242o(gnrVarM142241n, ((Long) h9s0.f106634b.m115379e()).longValue(), TimeUnit.MILLISECONDS, this.f193762c);
                }
                return jmw0.m142232e(gnrVarM142241n, Exception.class, new yew0() { // from class: l.wnv0
                    @Override // p149l.yew0
                    public final Object apply(Object obj) {
                        return this.f187349a.m210244a((Exception) obj);
                    }
                }, this.f193763d);
            }
        }
        return jmw0.m142235h(new ynv0(null, -1));
    }
}
