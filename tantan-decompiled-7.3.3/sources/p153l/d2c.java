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
public class d2c<D extends oo2> extends qhl<D, a2c> {

    /* JADX INFO: renamed from: j */
    public List<BLiveHourLeaderBoardItem> f84767j;

    public d2c(dum<D> dumVar) {
        super(dumVar);
        this.f84767j = new ArrayList();
        mo52715C(new a2c(dumVar.f90815a));
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: O3 */
    public void mo96836O3() {
        super.mo96836O3();
        this.f84767j.clear();
        ((a2c) this.viewModel).f67948a.f51583a.check(mdc0.f136005N4);
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: P3 */
    public void mo96837P3() {
        super.mo96837P3();
        ((a2c) this.viewModel).m95628l();
    }

    @Override // p153l.qhl
    @NonNull
    /* JADX INFO: renamed from: S3 */
    public tll mo113680S3() {
        return new tll("主播日榜", ((a2c) this.viewModel).m95622d(), 1);
    }

    @Override // p153l.qhl
    /* JADX INFO: renamed from: T3 */
    public int mo113681T3() {
        return 1;
    }

    @Override // p153l.qhl
    /* JADX INFO: renamed from: V3 */
    public void mo113682V3() {
        int size = this.f84767j.size();
        V v2 = this.viewModel;
        if (size <= 0) {
            m113683Y3(((a2c) v2).f67948a.f51583a.getCheckedRadioButtonId() == mdc0.f136005N4 ? "today" : "yesterday");
        } else {
            ((a2c) v2).f67948a.m76102k();
            ((a2c) this.viewModel).m95625i(this.f84767j);
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public void m113683Y3(String str) {
        ((a2c) this.viewModel).f67948a.m76102k();
        duringCreated(LivingNormalApiProvider.m72387D6(m213810E2().m168526j0(), m213810E2().mo183435j().liveMode, str)).subscribe(dhw.m115826e(new y20() { // from class: l.b2c
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f74601a.m113684Z3((BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.c2c
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f79465a.m113685a4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m113684Z3(BLiveEnvelope bLiveEnvelope) {
        ((a2c) this.viewModel).m95629m();
        BLiveAnchorLeaderboard bLiveAnchorLeaderboard = bLiveEnvelope.data.anchorLeaderboard;
        if (bLiveAnchorLeaderboard == null) {
            return;
        }
        ((a2c) this.viewModel).m95627k(bLiveAnchorLeaderboard.notices);
        ((a2c) this.viewModel).m95626j(bLiveAnchorLeaderboard.currentLeaderboard);
        List<BLiveHourLeaderBoardItem> list = bLiveAnchorLeaderboard.leaderboards;
        this.f84767j = list;
        ((a2c) this.viewModel).m95625i(list);
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ void m113685a4(Throwable th) {
        ((a2c) this.viewModel).m95629m();
    }
}
