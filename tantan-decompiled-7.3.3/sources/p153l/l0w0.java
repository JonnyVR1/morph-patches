package p153l;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class l0w0 implements wuv0 {

    /* JADX INFO: renamed from: a */
    public final ebt0 f129601a;

    /* JADX INFO: renamed from: b */
    public final boolean f129602b;

    /* JADX INFO: renamed from: c */
    public final boolean f129603c;

    /* JADX INFO: renamed from: d */
    public final ScheduledExecutorService f129604d;

    /* JADX INFO: renamed from: e */
    public final xvw0 f129605e;

    /* JADX INFO: renamed from: f */
    public final String f129606f;

    /* JADX INFO: renamed from: g */
    public final tat0 f129607g;

    public l0w0(ebt0 ebt0Var, boolean z, boolean z2, tat0 tat0Var, xvw0 xvw0Var, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f129601a = ebt0Var;
        this.f129602b = z;
        this.f129603c = z2;
        this.f129607g = tat0Var;
        this.f129605e = xvw0Var;
        this.f129606f = str;
        this.f129604d = scheduledExecutorService;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ m0w0 m152390a(Exception exc) {
        this.f129601a.m120275w(exc, "TrustlessTokenSignal");
        return null;
    }

    @Override // p153l.wuv0
    public final int zza() {
        return 50;
    }

    @Override // p153l.wuv0
    public final hpr zzb() {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168326h7)).booleanValue() && this.f129603c) {
            return pvw0.m173981h(null);
        }
        if (!this.f129602b) {
            return pvw0.m173981h(null);
        }
        return pvw0.m173978e(pvw0.m173988o(pvw0.m173986m(pvw0.m173981h(null), new eow0() { // from class: l.j0w0
            @Override // p153l.eow0
            public final Object apply(Object obj) {
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                return new m0w0(str);
            }
        }, this.f129605e), ((Long) vjs0.f184440c.m149974e()).longValue(), TimeUnit.MILLISECONDS, this.f129604d), Exception.class, new eow0() { // from class: l.k0w0
            @Override // p153l.eow0
            public final Object apply(Object obj) {
                this.f123432a.m152390a((Exception) obj);
                return null;
            }
        }, this.f129605e);
    }
}
