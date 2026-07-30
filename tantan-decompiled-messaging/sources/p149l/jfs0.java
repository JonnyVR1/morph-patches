package p149l;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class jfs0 implements vgs0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ a7u0 f117687a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ xkt0 f117688b;

    public /* synthetic */ jfs0(a7u0 a7u0Var, xkt0 xkt0Var) {
        this.f117687a = a7u0Var;
        this.f117688b = xkt0Var;
    }

    @Override // p149l.vgs0
    /* JADX INFO: renamed from: a */
    public final void mo12863a(Object obj, Map map) {
        q9t0 q9t0Var = (q9t0) obj;
        ugs0.m193574c(map, this.f117687a);
        final String str = (String) map.get("u");
        if (str == null) {
            x2t0.m206869g("URL missing from click GMSG.");
            return;
        }
        final xkt0 xkt0Var = this.f117688b;
        amw0 amw0VarM97696C = amw0.m97696C(ugs0.m193572a(q9t0Var, str));
        rlw0 rlw0Var = new rlw0() { // from class: l.lfs0
            @Override // p149l.rlw0
            public final gnr zza(Object obj2) {
                xkt0 xkt0Var2;
                String str2 = (String) obj2;
                vgs0 vgs0Var = ugs0.f176425a;
                return (((Boolean) d1s0.m109677c().m144697a(m7s0.f131986L9)).booleanValue() && (xkt0Var2 = xkt0Var) != null && xkt0.m209826h(str)) ? xkt0Var2.m209827b(str2, exr0.m118706e()) : jmw0.m142235h(str2);
            }
        };
        rmw0 rmw0Var = i3t0.f111372a;
        jmw0.m142245r(jmw0.m142241n(amw0VarM97696C, rlw0Var, rmw0Var), new zfs0(q9t0Var), rmw0Var);
    }
}
