package p149l;

import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.live.base.data.BLiveAnchorLeaderboard;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import java.util.ArrayList;
import java.util.List;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
public class inp0<D extends ho2> extends zel<D, fnp0> {

    /* JADX INFO: renamed from: j */
    public List<BLiveHourLeaderBoardItem> f114029j;

    public inp0(bsm<D> bsmVar) {
        super(bsmVar);
        this.f114029j = new ArrayList();
        mo51532C(new fnp0(bsmVar.f77095a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z3 */
    public /* synthetic */ void m137151Z3(BLiveEnvelope bLiveEnvelope) {
        ((fnp0) this.viewModel).m122339m();
        BLiveAnchorLeaderboard bLiveAnchorLeaderboard = bLiveEnvelope.data.anchorLeaderboard;
        if (bLiveAnchorLeaderboard == null) {
            return;
        }
        ((fnp0) this.viewModel).m122337k(bLiveAnchorLeaderboard.notices);
        ((fnp0) this.viewModel).m122336j(bLiveAnchorLeaderboard.currentLeaderboard);
        List<BLiveHourLeaderBoardItem> list = bLiveAnchorLeaderboard.leaderboards;
        this.f114029j = list;
        ((fnp0) this.viewModel).m122335i(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public /* synthetic */ void m137152a4(Throwable th) {
        ((fnp0) this.viewModel).m122339m();
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: O3 */
    public void mo94471O3() {
        super.mo94471O3();
        this.f114029j.clear();
        ((fnp0) this.viewModel).f98440a.f50735a.check(g5c0.f100760N4);
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo99576P3() {
        super.mo99576P3();
        ((fnp0) this.viewModel).m122338l();
    }

    @Override // p149l.zel
    @NonNull
    /* JADX INFO: renamed from: S3 */
    public cjl mo137153S3() {
        return new cjl("主播周榜", ((fnp0) this.viewModel).m122334d(), 2);
    }

    @Override // p149l.zel
    /* JADX INFO: renamed from: T3 */
    public int mo137154T3() {
        return 2;
    }

    @Override // p149l.zel
    /* JADX INFO: renamed from: V3 */
    public void mo137155V3() {
        int size = this.f114029j.size();
        V v2 = this.viewModel;
        if (size <= 0) {
            m137156Y3(((fnp0) v2).f98440a.f50735a.getCheckedRadioButtonId() == g5c0.f100760N4 ? "currentWeek" : "lastWeek");
        } else {
            ((fnp0) v2).f98440a.m74919k();
            ((fnp0) this.viewModel).m122335i(this.f114029j);
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public void m137156Y3(String str) {
        ((fnp0) this.viewModel).f98440a.m74919k();
        duringCreated(LivingNormalApiProvider.m71204D6(m206027E2().m132140j0(), m206027E2().mo149813j().liveMode, str)).subscribe(ffw.m121194e(new e30() { // from class: l.gnp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f103613a.m137151Z3((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.hnp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f108661a.m137152a4((Throwable) obj);
            }
        }));
    }
}
