package p149l;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import p149l.pn40;

/* JADX INFO: loaded from: classes4.dex */
public class iie<D extends pn40> extends qj2<D, hie> {
    public iie(bsm<D> bsmVar, FrameLayout frameLayout) {
        super(bsmVar);
        mo51532C(new hie(frameLayout));
        frameLayout.removeAllViews();
        m144512z2(new z6e(bsmVar));
        m144512z2(new k7n(bsmVar, frameLayout));
    }

    @Override // p149l.qj2
    /* JADX INFO: renamed from: T3 */
    public ViewGroup mo104532T3() {
        return ((hie) this.viewModel).f107922b;
    }
}
