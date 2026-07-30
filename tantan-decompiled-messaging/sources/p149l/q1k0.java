package p149l;

import android.view.View;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
public class q1k0<D extends ho2> extends n1k0<D> {

    /* JADX INFO: renamed from: r */
    public final View f152139r;

    public q1k0(bsm<D> bsmVar, View view) {
        super(bsmVar);
        this.f152139r = view;
    }

    @Override // p149l.n1k0, p149l.x6s
    /* JADX INFO: renamed from: R3 */
    public void mo96985R3() {
        super.mo96985R3();
        m144512z2(new mzj0(this.f188512e, ((xyj0) this.viewModel).f195060G));
    }

    @Override // p149l.n1k0, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        View view;
        super.mo72465t();
        if (m206027E2().m132146l0() == null || (view = this.f152139r) == null) {
            return;
        }
        ((xyj0) this.viewModel).m211813R0(view, m206027E2().m132146l0().f56011id);
    }
}
