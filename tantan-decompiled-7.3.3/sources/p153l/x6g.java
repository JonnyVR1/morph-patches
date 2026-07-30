package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveAccommpanyTasks;
import com.p051p1.mobile.putong.live.livingroom.common.fansclub.view.FansClubCompanyItemView;
import com.p051p1.mobile.putong.live.livingroom.common.fansclub.view.FansClubCompanyViewGroup;

/* JADX INFO: loaded from: classes4.dex */
public class x6g extends tk2<w6g> {
    public x6g(dum<? extends oo2> dumVar, tk2 tk2Var, FansClubCompanyViewGroup fansClubCompanyViewGroup, FansClubCompanyItemView fansClubCompanyItemView, FansClubCompanyItemView fansClubCompanyItemView2, FansClubCompanyItemView fansClubCompanyItemView3, String str) {
        super(dumVar);
        mo52715C(new w6g(fansClubCompanyViewGroup, fansClubCompanyItemView, fansClubCompanyItemView2, fansClubCompanyItemView3, str));
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: O3 */
    public void mo96836O3() {
        super.mo96836O3();
        ((w6g) this.viewModel).m205099b();
    }

    @Override // p153l.tk2
    /* JADX INFO: renamed from: g4 */
    public void mo175592g4(aeg aegVar) {
        ((w6g) this.viewModel).m205100c(aegVar);
    }

    /* JADX INFO: renamed from: i4 */
    public void m209489i4(BLiveAccommpanyTasks bLiveAccommpanyTasks, String str, int i) {
        m213811F2().FansClubEvent.showFansClubSendGiftDialog().mo199273j(new kx50(true, bLiveAccommpanyTasks, str, i));
    }
}
