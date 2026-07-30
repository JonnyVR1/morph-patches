package p002l;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import l.bwr;
import p002l.ho2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class cie<D extends ho2> extends qj2<D, hie> {
    public cie(bsm<D> bsmVar, FrameLayout frameLayout) {
        super(bsmVar);
        C(new hie(frameLayout));
        frameLayout.removeAllViews();
        if (!m25552L2()) {
            z2(new z6e(bsmVar));
        }
        z2(new tfe(bsmVar));
        z2(new k7n(bsmVar, frameLayout));
    }

    @Override // p002l.qj2
    /* JADX INFO: renamed from: T3 */
    public ViewGroup mo10687T3() {
        return ((hie) ((bwr) this).viewModel).f12047b;
    }
}
