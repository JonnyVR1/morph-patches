package p153l;

import android.view.View;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public class wak0<D extends oo2> extends tak0<D> {

    /* JADX INFO: renamed from: r */
    public final View f188139r;

    public wak0(dum<D> dumVar, View view) {
        super(dumVar);
        this.f188139r = view;
    }

    @Override // p153l.tak0, p153l.y8s
    /* JADX INFO: renamed from: R3 */
    public void mo103124R3() {
        super.mo103124R3();
        m153103z2(new s8k0(this.f196918e, ((d8k0) this.viewModel).f85621G));
    }

    @Override // p153l.tak0, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        View view;
        super.mo73648t();
        if (m213810E2().m168532l0() == null || (view = this.f188139r) == null) {
            return;
        }
        ((d8k0) this.viewModel).m114888R0(view, m213810E2().m168532l0().f56859id);
    }
}
