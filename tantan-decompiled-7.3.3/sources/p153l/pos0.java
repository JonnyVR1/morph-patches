package p153l;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class pos0 implements bqs0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ggu0 f153425a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dut0 f153426b;

    public /* synthetic */ pos0(ggu0 ggu0Var, dut0 dut0Var) {
        this.f153425a = ggu0Var;
        this.f153426b = dut0Var;
    }

    @Override // p153l.bqs0
    /* JADX INFO: renamed from: a */
    public final void mo12917a(Object obj, Map map) {
        wit0 wit0Var = (wit0) obj;
        aqs0.m99556c(map, this.f153425a);
        final String str = (String) map.get("u");
        if (str == null) {
            dct0.m115298g("URL missing from click GMSG.");
            return;
        }
        final dut0 dut0Var = this.f153426b;
        gvw0 gvw0VarM132580C = gvw0.m132580C(aqs0.m99554a(wit0Var, str));
        xuw0 xuw0Var = new xuw0() { // from class: l.ros0
            @Override // p153l.xuw0
            public final hpr zza(Object obj2) {
                dut0 dut0Var2;
                String str2 = (String) obj2;
                bqs0 bqs0Var = aqs0.f72852a;
                return (((Boolean) jas0.m144075c().m176505a(sgs0.f168057L9)).booleanValue() && (dut0Var2 = dut0Var) != null && dut0.m118172h(str)) ? dut0Var2.m118173b(str2, k6s0.m148572e()) : pvw0.m173981h(str2);
            }
        };
        xvw0 xvw0Var = oct0.f146733a;
        pvw0.m173991r(pvw0.m173987n(gvw0VarM132580C, xuw0Var, xvw0Var), new fps0(wit0Var), xvw0Var);
    }
}
