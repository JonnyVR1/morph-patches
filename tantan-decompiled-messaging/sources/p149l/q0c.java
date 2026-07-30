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
public class q0c<D extends ho2> extends zel<D, n0c> {

    /* JADX INFO: renamed from: j */
    public List<BLiveHourLeaderBoardItem> f152045j;

    public q0c(bsm<D> bsmVar) {
        super(bsmVar);
        this.f152045j = new ArrayList();
        mo51532C(new n0c(bsmVar.f77095a));
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: O3 */
    public void mo94471O3() {
        super.mo94471O3();
        this.f152045j.clear();
        ((n0c) this.viewModel).f136490a.f50735a.check(g5c0.f100760N4);
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo99576P3() {
        super.mo99576P3();
        ((n0c) this.viewModel).m157266l();
    }

    @Override // p149l.zel
    @NonNull
    /* JADX INFO: renamed from: S3 */
    public cjl mo137153S3() {
        return new cjl("主播日榜", ((n0c) this.viewModel).m157260d(), 1);
    }

    @Override // p149l.zel
    /* JADX INFO: renamed from: T3 */
    public int mo137154T3() {
        return 1;
    }

    @Override // p149l.zel
    /* JADX INFO: renamed from: V3 */
    public void mo137155V3() {
        int size = this.f152045j.size();
        V v2 = this.viewModel;
        if (size <= 0) {
            m172318Y3(((n0c) v2).f136490a.f50735a.getCheckedRadioButtonId() == g5c0.f100760N4 ? "today" : "yesterday");
        } else {
            ((n0c) v2).f136490a.m74919k();
            ((n0c) this.viewModel).m157263i(this.f152045j);
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public void m172318Y3(String str) {
        ((n0c) this.viewModel).f136490a.m74919k();
        duringCreated(LivingNormalApiProvider.m71204D6(m206027E2().m132140j0(), m206027E2().mo149813j().liveMode, str)).subscribe(ffw.m121194e(new e30() { // from class: l.o0c
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f141311a.m172319Z3((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.p0c
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f146579a.m172320a4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m172319Z3(BLiveEnvelope bLiveEnvelope) {
        ((n0c) this.viewModel).m157267m();
        BLiveAnchorLeaderboard bLiveAnchorLeaderboard = bLiveEnvelope.data.anchorLeaderboard;
        if (bLiveAnchorLeaderboard == null) {
            return;
        }
        ((n0c) this.viewModel).m157265k(bLiveAnchorLeaderboard.notices);
        ((n0c) this.viewModel).m157264j(bLiveAnchorLeaderboard.currentLeaderboard);
        List<BLiveHourLeaderBoardItem> list = bLiveAnchorLeaderboard.leaderboards;
        this.f152045j = list;
        ((n0c) this.viewModel).m157263i(list);
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ void m172320a4(Throwable th) {
        ((n0c) this.viewModel).m157267m();
    }
}
