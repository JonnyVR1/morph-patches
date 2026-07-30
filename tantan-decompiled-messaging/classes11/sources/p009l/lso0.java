package p009l;

import com.p000p1.mobile.putong.live.livingroom.voice.intl.sweet.view.VoiceSweetRankListView;
import com.p1.mobile.putong.live.base.data.BLiveVoiceCpLeaderBoards;
import com.p1.mobile.putong.live.livingroom.R;
import l.bsm;
import l.bwr;
import l.e30;
import l.ffw;
import l.h4t;
import l.nnn0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class lso0 extends h4t<nnn0, VoiceSweetRankListView> {
    public lso0(bsm bsmVar, VoiceSweetRankListView voiceSweetRankListView) {
        super(bsmVar);
        C(voiceSweetRankListView);
    }

    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ void m18047L3(BLiveVoiceCpLeaderBoards bLiveVoiceCpLeaderBoards) {
        ((VoiceSweetRankListView) ((bwr) this).viewModel).m8760q0(bLiveVoiceCpLeaderBoards);
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ void m18048M3(Throwable th) {
        ((VoiceSweetRankListView) ((bwr) this).viewModel).m8761r0(true, R.string.J9);
        ((VoiceSweetRankListView) ((bwr) this).viewModel).m8760q0(null);
    }

    /* JADX INFO: renamed from: N3 */
    public void m18049N3() {
        duringCreated(bno0.m12169l()).subscribe(ffw.e(new e30() { // from class: l.jso0
            public final void call(Object obj) {
                this.f15277a.m18047L3((BLiveVoiceCpLeaderBoards) obj);
            }
        }, new e30() { // from class: l.kso0
            public final void call(Object obj) {
                this.f15842a.m18048M3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t */
    public void m18050t() {
        super/*l.k4t*/.t();
    }
}
