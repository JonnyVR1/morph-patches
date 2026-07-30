package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCpLeaderBoards;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.sweet.view.VoiceSweetRankListView;

/* JADX INFO: loaded from: classes11.dex */
public class lso0 extends h4t<nnn0, VoiceSweetRankListView> {
    public lso0(bsm bsmVar, VoiceSweetRankListView voiceSweetRankListView) {
        super(bsmVar);
        mo51532C(voiceSweetRankListView);
    }

    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ void m151632L3(BLiveVoiceCpLeaderBoards bLiveVoiceCpLeaderBoards) {
        ((VoiceSweetRankListView) this.viewModel).m78547q0(bLiveVoiceCpLeaderBoards);
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ void m151633M3(Throwable th) {
        ((VoiceSweetRankListView) this.viewModel).m78548r0(true, R$string.f46764J9);
        ((VoiceSweetRankListView) this.viewModel).m78547q0(null);
    }

    /* JADX INFO: renamed from: N3 */
    public void m151634N3() {
        duringCreated(bno0.m102809l()).subscribe(ffw.m121194e(new e30() { // from class: l.jso0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f119529a.m151632L3((BLiveVoiceCpLeaderBoards) obj);
            }
        }, new e30() { // from class: l.kso0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f124496a.m151633M3((Throwable) obj);
            }
        }));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
    }
}
