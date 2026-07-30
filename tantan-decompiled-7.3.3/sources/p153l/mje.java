package p153l;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import p153l.dw40;

/* JADX INFO: loaded from: classes4.dex */
public class mje<D extends dw40> extends yj2<D, lje> {
    public mje(dum<D> dumVar, FrameLayout frameLayout) {
        super(dumVar);
        mo52715C(new lje(frameLayout));
        frameLayout.removeAllViews();
        m153103z2(new o8e(dumVar));
        m153103z2(new k9n(dumVar, frameLayout));
    }

    @Override // p153l.yj2
    /* JADX INFO: renamed from: T3 */
    public ViewGroup mo130467T3() {
        return ((lje) this.viewModel).f132329b;
    }
}
