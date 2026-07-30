package p153l;

/* JADX INFO: loaded from: classes5.dex */
public class zdu extends y8s<oo2, xdu> {
    public zdu(dum<? extends oo2> dumVar) {
        super(dumVar);
        mo52715C(new xdu(this));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m213811F2().LiveTipEvent.showTip().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.ydu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f198626a.m219385T3((vdu) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v2, types: [l.oo2] */
    /* JADX INFO: renamed from: T3 */
    public final void m219385T3(vdu vduVar) {
        int i = vduVar.f183659a;
        if (i == 0) {
            ((xdu) this.viewModel).m210492I(m213810E2().m168532l0().m61308fp().url, m213810E2().m168532l0().name, vduVar.f183662d, vduVar.f183663e);
        } else if (i == 1) {
            ((xdu) this.viewModel).m210492I(vduVar.f183660b, vduVar.f183661c, vduVar.f183662d, vduVar.f183663e);
        }
    }
}
