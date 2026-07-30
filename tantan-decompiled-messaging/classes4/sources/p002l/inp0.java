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
public class inp0<D extends ho2> extends zel<D, fnp0> {

    /* JADX INFO: renamed from: j */
    public List<BLiveHourLeaderBoardItem> f13319j;

    public inp0(bsm<D> bsmVar) {
        super(bsmVar);
        this.f13319j = new ArrayList();
        C(new fnp0(bsmVar.f8332a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z3 */
    public /* synthetic */ void m15249Z3(BLiveEnvelope bLiveEnvelope) {
        ((fnp0) ((bwr) this).viewModel).m13402m();
        BLiveAnchorLeaderboard bLiveAnchorLeaderboard = bLiveEnvelope.data.anchorLeaderboard;
        if (bLiveAnchorLeaderboard == null) {
            return;
        }
        ((fnp0) ((bwr) this).viewModel).m13400k(bLiveAnchorLeaderboard.notices);
        ((fnp0) ((bwr) this).viewModel).m13399j(bLiveAnchorLeaderboard.currentLeaderboard);
        List<BLiveHourLeaderBoardItem> list = bLiveAnchorLeaderboard.leaderboards;
        this.f13319j = list;
        ((fnp0) ((bwr) this).viewModel).m13397i(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public /* synthetic */ void m15250a4(Throwable th) {
        ((fnp0) ((bwr) this).viewModel).m13402m();
    }

    @Override // p002l.x6s
    /* JADX INFO: renamed from: O3 */
    public void mo9256O3() {
        super.mo9256O3();
        this.f13319j.clear();
        ((fnp0) ((bwr) this).viewModel).f10538a.f6777a.check(g5c0.f10910N4);
    }

    @Override // p002l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo10254P3() {
        super.mo10254P3();
        ((fnp0) ((bwr) this).viewModel).m13401l();
    }

    @Override // p002l.zel
    @NonNull
    /* JADX INFO: renamed from: S3 */
    public cjl mo15251S3() {
        return new cjl("主播周榜", ((fnp0) ((bwr) this).viewModel).m13396d(), 2);
    }

    @Override // p002l.zel
    /* JADX INFO: renamed from: T3 */
    public int mo15252T3() {
        return 2;
    }

    @Override // p002l.zel
    /* JADX INFO: renamed from: V3 */
    public void mo15253V3() {
        int size = this.f13319j.size();
        s7m s7mVar = ((bwr) this).viewModel;
        if (size <= 0) {
            m15254Y3(((fnp0) s7mVar).f10538a.f6777a.getCheckedRadioButtonId() == g5c0.f10910N4 ? "currentWeek" : "lastWeek");
        } else {
            ((fnp0) s7mVar).f10538a.m8521k();
            ((fnp0) ((bwr) this).viewModel).m13397i(this.f13319j);
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public void m15254Y3(String str) {
        ((fnp0) ((bwr) this).viewModel).f10538a.m8521k();
        duringCreated(LivingNormalApiProvider.m4570D6(m25547E2().m14576j0(), m25547E2().m17234j().liveMode, str)).subscribe(ffw.e(new e30() { // from class: l.gnp0
            public final void call(Object obj) {
                this.f11557a.m15249Z3((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.hnp0
            public final void call(Object obj) {
                this.f12138a.m15250a4((Throwable) obj);
            }
        }));
    }
}
