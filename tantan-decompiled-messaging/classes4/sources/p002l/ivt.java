package p002l;

import androidx.annotation.Nullable;
import com.tantanapp.common.data.DbObject;
import l.d1q;
import l.h7d0;
import l.kqv;
import l.n80;
import l.rql;
import l.zcu;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ivt implements rql {

    /* JADX INFO: renamed from: a */
    public final l8d0 f13440a;

    public ivt(l8d0 l8d0Var) {
        this.f13440a = l8d0Var;
    }

    /* JADX INFO: renamed from: a */
    public void m15429a(d1q<?> d1qVar, n80 n80Var) {
        ho2 ho2VarM15430b = m15430b();
        if (ho2VarM15430b != null && (d1qVar instanceof yvt)) {
            zcu.k(m15431c((yvt) d1qVar, ho2VarM15430b).a(), d1qVar.p(), n80Var.a());
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [l.ho2] */
    @Nullable
    /* JADX INFO: renamed from: b */
    public final ho2 m15430b() {
        if (this.f13440a.m17109y0() == null) {
            return null;
        }
        return this.f13440a.m17109y0().m25547E2();
    }

    /* JADX INFO: renamed from: c */
    public final h7d0.a m15431c(yvt yvtVar, ho2 ho2Var) {
        return kqv.a(yvtVar.I().w("p_live_right_recommend").z(yvtVar.m26948T()).B(ho2Var.m14505I0().m27369e()).p("0").n(!this.f13440a.m17058D0().j()), ho2Var);
    }

    /* JADX INFO: renamed from: d */
    public void m15432d(d1q<?> d1qVar) {
        ho2 ho2VarM15430b = m15430b();
        if (ho2VarM15430b == null) {
            return;
        }
        String str = ho2VarM15430b.m14582l0() == null ? "" : ((DbObject) ho2VarM15430b.m14582l0()).id;
        if (d1qVar instanceof yvt) {
            zcu.h(m15431c((yvt) d1qVar, ho2VarM15430b).k(str).a(), d1qVar.p());
        }
    }
}
