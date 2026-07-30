package p153l;

import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.live.base.data.BLiveAnchorLeaderboard;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import java.util.ArrayList;
import java.util.List;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public class mwp0<D extends oo2> extends qhl<D, jwp0> {

    /* JADX INFO: renamed from: j */
    public List<BLiveHourLeaderBoardItem> f139140j;

    public mwp0(dum<D> dumVar) {
        super(dumVar);
        this.f139140j = new ArrayList();
        mo52715C(new jwp0(dumVar.f90815a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z3 */
    public /* synthetic */ void m160581Z3(BLiveEnvelope bLiveEnvelope) {
        ((jwp0) this.viewModel).m147184m();
        BLiveAnchorLeaderboard bLiveAnchorLeaderboard = bLiveEnvelope.data.anchorLeaderboard;
        if (bLiveAnchorLeaderboard == null) {
            return;
        }
        ((jwp0) this.viewModel).m147182k(bLiveAnchorLeaderboard.notices);
        ((jwp0) this.viewModel).m147181j(bLiveAnchorLeaderboard.currentLeaderboard);
        List<BLiveHourLeaderBoardItem> list = bLiveAnchorLeaderboard.leaderboards;
        this.f139140j = list;
        ((jwp0) this.viewModel).m147180i(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public /* synthetic */ void m160582a4(Throwable th) {
        ((jwp0) this.viewModel).m147184m();
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: O3 */
    public void mo96836O3() {
        super.mo96836O3();
        this.f139140j.clear();
        ((jwp0) this.viewModel).f122950a.f51583a.check(mdc0.f136005N4);
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: P3 */
    public void mo96837P3() {
        super.mo96837P3();
        ((jwp0) this.viewModel).m147183l();
    }

    @Override // p153l.qhl
    @NonNull
    /* JADX INFO: renamed from: S3 */
    public tll mo113680S3() {
        return new tll("主播周榜", ((jwp0) this.viewModel).m147179d(), 2);
    }

    @Override // p153l.qhl
    /* JADX INFO: renamed from: T3 */
    public int mo113681T3() {
        return 2;
    }

    @Override // p153l.qhl
    /* JADX INFO: renamed from: V3 */
    public void mo113682V3() {
        int size = this.f139140j.size();
        V v2 = this.viewModel;
        if (size <= 0) {
            m160583Y3(((jwp0) v2).f122950a.f51583a.getCheckedRadioButtonId() == mdc0.f136005N4 ? "currentWeek" : "lastWeek");
        } else {
            ((jwp0) v2).f122950a.m76102k();
            ((jwp0) this.viewModel).m147180i(this.f139140j);
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public void m160583Y3(String str) {
        ((jwp0) this.viewModel).f122950a.m76102k();
        duringCreated(LivingNormalApiProvider.m72387D6(m213810E2().m168526j0(), m213810E2().mo183435j().liveMode, str)).subscribe(dhw.m115826e(new y20() { // from class: l.kwp0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f129086a.m160581Z3((BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.lwp0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f133845a.m160582a4((Throwable) obj);
            }
        }));
    }
}
