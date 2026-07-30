package p002l;

import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p1.mobile.putong.live.base.data.BLiveAnchorLeaderboard;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import java.util.ArrayList;
import java.util.List;
import l.bwr;
import l.e30;
import l.ffw;
import l.s7m;
import p002l.ho2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class q0c<D extends ho2> extends zel<D, n0c> {

    /* JADX INFO: renamed from: j */
    public List<BLiveHourLeaderBoardItem> f17741j;

    public q0c(bsm<D> bsmVar) {
        super(bsmVar);
        this.f17741j = new ArrayList();
        C(new n0c(bsmVar.f8332a));
    }

    @Override // p002l.x6s
    /* JADX INFO: renamed from: O3 */
    public void mo9256O3() {
        super.mo9256O3();
        this.f17741j.clear();
        ((n0c) ((bwr) this).viewModel).f15767a.f6777a.check(g5c0.f10910N4);
    }

    @Override // p002l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo10254P3() {
        super.mo10254P3();
        ((n0c) ((bwr) this).viewModel).m18340l();
    }

    @Override // p002l.zel
    @NonNull
    /* JADX INFO: renamed from: S3 */
    public cjl mo15251S3() {
        return new cjl("主播日榜", ((n0c) ((bwr) this).viewModel).m18333d(), 1);
    }

    @Override // p002l.zel
    /* JADX INFO: renamed from: T3 */
    public int mo15252T3() {
        return 1;
    }

    @Override // p002l.zel
    /* JADX INFO: renamed from: V3 */
    public void mo15253V3() {
        int size = this.f17741j.size();
        s7m s7mVar = ((bwr) this).viewModel;
        if (size <= 0) {
            m20773Y3(((n0c) s7mVar).f15767a.f6777a.getCheckedRadioButtonId() == g5c0.f10910N4 ? "today" : "yesterday");
        } else {
            ((n0c) s7mVar).f15767a.m8521k();
            ((n0c) ((bwr) this).viewModel).m18336i(this.f17741j);
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public void m20773Y3(String str) {
        ((n0c) ((bwr) this).viewModel).f15767a.m8521k();
        duringCreated(LivingNormalApiProvider.m4570D6(m25547E2().m14576j0(), m25547E2().m17234j().liveMode, str)).subscribe(ffw.e(new e30() { // from class: l.o0c
            public final void call(Object obj) {
                this.f16326a.m20774Z3((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.p0c
            public final void call(Object obj) {
                this.f16946a.m20775a4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m20774Z3(BLiveEnvelope bLiveEnvelope) {
        ((n0c) ((bwr) this).viewModel).m18341m();
        BLiveAnchorLeaderboard bLiveAnchorLeaderboard = bLiveEnvelope.data.anchorLeaderboard;
        if (bLiveAnchorLeaderboard == null) {
            return;
        }
        ((n0c) ((bwr) this).viewModel).m18339k(bLiveAnchorLeaderboard.notices);
        ((n0c) ((bwr) this).viewModel).m18338j(bLiveAnchorLeaderboard.currentLeaderboard);
        List<BLiveHourLeaderBoardItem> list = bLiveAnchorLeaderboard.leaderboards;
        this.f17741j = list;
        ((n0c) ((bwr) this).viewModel).m18336i(list);
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ void m20775a4(Throwable th) {
        ((n0c) ((bwr) this).viewModel).m18341m();
    }
}
