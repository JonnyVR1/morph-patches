package p002l;

import com.p000p1.mobile.putong.live.livingroom.common.fansclub.view.FansClubCompanyItemView;
import com.p000p1.mobile.putong.live.livingroom.common.fansclub.view.FansClubCompanyViewGroup;
import com.p1.mobile.putong.live.base.data.BLiveAccommpanyTasks;
import l.bwr;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class j5g extends lk2<i5g> {
    public j5g(bsm<? extends ho2> bsmVar, lk2 lk2Var, FansClubCompanyViewGroup fansClubCompanyViewGroup, FansClubCompanyItemView fansClubCompanyItemView, FansClubCompanyItemView fansClubCompanyItemView2, FansClubCompanyItemView fansClubCompanyItemView3, String str) {
        super(bsmVar);
        C(new i5g(fansClubCompanyViewGroup, fansClubCompanyItemView, fansClubCompanyItemView2, fansClubCompanyItemView3, str));
    }

    @Override // p002l.x6s
    /* JADX INFO: renamed from: O3 */
    public void mo9256O3() {
        super.mo9256O3();
        ((i5g) ((bwr) this).viewModel).m15001b();
    }

    @Override // p002l.lk2
    /* JADX INFO: renamed from: g4 */
    public void mo10746g4(mcg mcgVar) {
        ((i5g) ((bwr) this).viewModel).m15002c(mcgVar);
    }

    /* JADX INFO: renamed from: i4 */
    public void m15664i4(BLiveAccommpanyTasks bLiveAccommpanyTasks, String str, int i) {
        m25548F2().FansClubEvent.showFansClubSendGiftDialog().j(new ep50(true, bLiveAccommpanyTasks, str, i));
    }
}
