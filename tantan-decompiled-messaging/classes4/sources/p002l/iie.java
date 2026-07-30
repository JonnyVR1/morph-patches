package p002l;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import l.bwr;
import p002l.pn40;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class iie<D extends pn40> extends qj2<D, hie> {
    public iie(bsm<D> bsmVar, FrameLayout frameLayout) {
        super(bsmVar);
        C(new hie(frameLayout));
        frameLayout.removeAllViews();
        z2(new z6e(bsmVar));
        z2(new k7n(bsmVar, frameLayout));
    }

    @Override // p002l.qj2
    /* JADX INFO: renamed from: T3 */
    public ViewGroup mo10687T3() {
        return ((hie) ((bwr) this).viewModel).f12047b;
    }
}
