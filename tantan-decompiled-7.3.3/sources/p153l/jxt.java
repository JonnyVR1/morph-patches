package p153l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public class jxt implements dtl {

    /* JADX INFO: renamed from: a */
    public final ogd0 f123078a;

    public jxt(ogd0 ogd0Var) {
        this.f123078a = ogd0Var;
    }

    @Override // p153l.dtl
    /* JADX INFO: renamed from: a */
    public void mo117882a(d3q<?> d3qVar, j80 j80Var) {
        oo2 oo2VarM147396b = m147396b();
        if (oo2VarM147396b != null && (d3qVar instanceof zxt)) {
            afu.m97562k(m147397c((zxt) d3qVar, oo2VarM147396b).m149392a(), d3qVar.mo113885p(), j80Var.m143819a());
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [l.oo2] */
    @Nullable
    /* JADX INFO: renamed from: b */
    public final oo2 m147396b() {
        if (this.f123078a.m167593y0() == null) {
            return null;
        }
        return this.f123078a.m167593y0().m213810E2();
    }

    /* JADX INFO: renamed from: c */
    public final kfd0.C18147a m147397c(zxt zxtVar, oo2 oo2Var) {
        return lsv.m155732a(zxtVar.m218162I().m149414w("p_live_right_recommend").m149417z(zxtVar.m222074T()).m149389B(oo2Var.m168458I0().m98482e()).m149407p("0").m149405n(!this.f123078a.m167542D0().m77823j()), oo2Var);
    }

    /* JADX INFO: renamed from: d */
    public void m147398d(d3q<?> d3qVar) {
        oo2 oo2VarM147396b = m147396b();
        if (oo2VarM147396b == null) {
            return;
        }
        String str = oo2VarM147396b.m168532l0() == null ? "" : oo2VarM147396b.m168532l0().f56859id;
        if (d3qVar instanceof zxt) {
            afu.m97559h(m147397c((zxt) d3qVar, oo2VarM147396b).m149402k(str).m149392a(), d3qVar.mo113885p());
        }
    }
}
