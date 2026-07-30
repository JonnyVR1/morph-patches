package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveAccommpanyTasks;
import com.p046p1.mobile.putong.live.livingroom.common.fansclub.view.FansClubCompanyItemView;
import com.p046p1.mobile.putong.live.livingroom.common.fansclub.view.FansClubCompanyViewGroup;

/* JADX INFO: loaded from: classes4.dex */
public class j5g extends lk2<i5g> {
    public j5g(bsm<? extends ho2> bsmVar, lk2 lk2Var, FansClubCompanyViewGroup fansClubCompanyViewGroup, FansClubCompanyItemView fansClubCompanyItemView, FansClubCompanyItemView fansClubCompanyItemView2, FansClubCompanyItemView fansClubCompanyItemView3, String str) {
        super(bsmVar);
        mo51532C(new i5g(fansClubCompanyViewGroup, fansClubCompanyItemView, fansClubCompanyItemView2, fansClubCompanyItemView3, str));
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: O3 */
    public void mo94471O3() {
        super.mo94471O3();
        ((i5g) this.viewModel).m134480b();
    }

    @Override // p149l.lk2
    /* JADX INFO: renamed from: g4 */
    public void mo105325g4(mcg mcgVar) {
        ((i5g) this.viewModel).m134481c(mcgVar);
    }

    /* JADX INFO: renamed from: i4 */
    public void m139864i4(BLiveAccommpanyTasks bLiveAccommpanyTasks, String str, int i) {
        m206028F2().FansClubEvent.showFansClubSendGiftDialog().mo172463j(new ep50(true, bLiveAccommpanyTasks, str, i));
    }
}
