package p149l;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
public class cie<D extends ho2> extends qj2<D, hie> {
    public cie(bsm<D> bsmVar, FrameLayout frameLayout) {
        super(bsmVar);
        mo51532C(new hie(frameLayout));
        frameLayout.removeAllViews();
        if (!m206032L2()) {
            m144512z2(new z6e(bsmVar));
        }
        m144512z2(new tfe(bsmVar));
        m144512z2(new k7n(bsmVar, frameLayout));
    }

    @Override // p149l.qj2
    /* JADX INFO: renamed from: T3 */
    public ViewGroup mo104532T3() {
        return ((hie) this.viewModel).f107922b;
    }
}
