package p149l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public class ivt implements rql {

    /* JADX INFO: renamed from: a */
    public final l8d0 f115198a;

    public ivt(l8d0 l8d0Var) {
        this.f115198a = l8d0Var;
    }

    @Override // p149l.rql
    /* JADX INFO: renamed from: a */
    public void mo138634a(d1q<?> d1qVar, n80 n80Var) {
        ho2 ho2VarM138635b = m138635b();
        if (ho2VarM138635b != null && (d1qVar instanceof yvt)) {
            zcu.m218096k(m138636c((yvt) d1qVar, ho2VarM138635b).m129662a(), d1qVar.mo109667p(), n80Var.m158173a());
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [l.ho2] */
    @Nullable
    /* JADX INFO: renamed from: b */
    public final ho2 m138635b() {
        if (this.f115198a.m148918y0() == null) {
            return null;
        }
        return this.f115198a.m148918y0().m206027E2();
    }

    /* JADX INFO: renamed from: c */
    public final h7d0.C17241a m138636c(yvt yvtVar, ho2 ho2Var) {
        return kqv.m146959a(yvtVar.m216565I().m129684w("p_live_right_recommend").m129687z(yvtVar.m216230T()).m129659B(ho2Var.m132069I0().m218718e()).m129677p("0").m129675n(!this.f115198a.m148867D0().m76640j()), ho2Var);
    }

    /* JADX INFO: renamed from: d */
    public void m138637d(d1q<?> d1qVar) {
        ho2 ho2VarM138635b = m138635b();
        if (ho2VarM138635b == null) {
            return;
        }
        String str = ho2VarM138635b.m132146l0() == null ? "" : ho2VarM138635b.m132146l0().f56011id;
        if (d1qVar instanceof yvt) {
            zcu.m218093h(m138636c((yvt) d1qVar, ho2VarM138635b).m129672k(str).m129662a(), d1qVar.mo109667p());
        }
    }
}
