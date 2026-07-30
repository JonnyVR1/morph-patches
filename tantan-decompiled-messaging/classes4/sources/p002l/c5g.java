package p002l;

import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import l.bwr;
import v.VDraweeView;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class c5g extends lk2<b5g> {
    public c5g(bsm<? extends ho2> bsmVar, VDraweeView vDraweeView, VDraweeView vDraweeView2, AnimEffectPlayer animEffectPlayer, VImage vImage, boolean z) {
        super(bsmVar);
        C(new b5g(vDraweeView, vDraweeView2, animEffectPlayer, vImage, z));
    }

    @Override // p002l.x6s
    /* JADX INFO: renamed from: O3 */
    public void mo9256O3() {
        super.mo9256O3();
        ((b5g) ((bwr) this).viewModel).m10167b();
    }

    @Override // p002l.lk2
    /* JADX INFO: renamed from: g4 */
    public void mo10746g4(mcg mcgVar) {
        ((b5g) ((bwr) this).viewModel).m10168c(mcgVar);
    }
}
