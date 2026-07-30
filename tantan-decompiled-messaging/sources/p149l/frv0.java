package p149l;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class frv0 implements qlv0 {

    /* JADX INFO: renamed from: a */
    public final y1t0 f99004a;

    /* JADX INFO: renamed from: b */
    public final boolean f99005b;

    /* JADX INFO: renamed from: c */
    public final boolean f99006c;

    /* JADX INFO: renamed from: d */
    public final ScheduledExecutorService f99007d;

    /* JADX INFO: renamed from: e */
    public final rmw0 f99008e;

    /* JADX INFO: renamed from: f */
    public final String f99009f;

    /* JADX INFO: renamed from: g */
    public final n1t0 f99010g;

    public frv0(y1t0 y1t0Var, boolean z, boolean z2, n1t0 n1t0Var, rmw0 rmw0Var, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f99004a = y1t0Var;
        this.f99005b = z;
        this.f99006c = z2;
        this.f99010g = n1t0Var;
        this.f99008e = rmw0Var;
        this.f99009f = str;
        this.f99007d = scheduledExecutorService;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ grv0 m122900a(Exception exc) {
        this.f99004a.m212290w(exc, "TrustlessTokenSignal");
        return null;
    }

    @Override // p149l.qlv0
    public final int zza() {
        return 50;
    }

    @Override // p149l.qlv0
    public final gnr zzb() {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132255h7)).booleanValue() && this.f99006c) {
            return jmw0.m142235h(null);
        }
        if (!this.f99005b) {
            return jmw0.m142235h(null);
        }
        return jmw0.m142232e(jmw0.m142242o(jmw0.m142240m(jmw0.m142235h(null), new yew0() { // from class: l.drv0
            @Override // p149l.yew0
            public final Object apply(Object obj) {
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                return new grv0(str);
            }
        }, this.f99008e), ((Long) pas0.f148009c.m115379e()).longValue(), TimeUnit.MILLISECONDS, this.f99007d), Exception.class, new yew0() { // from class: l.erv0
            @Override // p149l.yew0
            public final Object apply(Object obj) {
                this.f92971a.m122900a((Exception) obj);
                return null;
            }
        }, this.f99008e);
    }
}
