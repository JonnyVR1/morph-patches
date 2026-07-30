package p002l;

import android.widget.TextView;
import com.p1.mobile.putong.live.base.view.ClipRoundImageView;
import l.bwr;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class h5g extends lk2<g5g> {
    public h5g(bsm<? extends ho2> bsmVar, lk2 lk2Var, ClipRoundImageView clipRoundImageView, TextView textView, TextView textView2) {
        super(bsmVar);
        C(new g5g(clipRoundImageView, textView, textView2));
    }

    @Override // p002l.x6s
    /* JADX INFO: renamed from: O3 */
    public void mo9256O3() {
        super.mo9256O3();
        ((g5g) ((bwr) this).viewModel).m13642c();
    }

    @Override // p002l.lk2
    /* JADX INFO: renamed from: g4 */
    public void mo10746g4(mcg mcgVar) {
        ((g5g) ((bwr) this).viewModel).m13641b(mcgVar);
    }
}
