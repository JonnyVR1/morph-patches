package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCpLeaderBoards;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.sweet.view.VoiceSweetRankListView;

/* JADX INFO: loaded from: classes10.dex */
public class p1p0 extends i6t<rwn0, VoiceSweetRankListView> {
    public p1p0(dum dumVar, VoiceSweetRankListView voiceSweetRankListView) {
        super(dumVar);
        mo52715C(voiceSweetRankListView);
    }

    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ void m170256L3(BLiveVoiceCpLeaderBoards bLiveVoiceCpLeaderBoards) {
        ((VoiceSweetRankListView) this.viewModel).m79730q0(bLiveVoiceCpLeaderBoards);
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ void m170257M3(Throwable th) {
        ((VoiceSweetRankListView) this.viewModel).m79731r0(true, R$string.f47612J9);
        ((VoiceSweetRankListView) this.viewModel).m79730q0(null);
    }

    /* JADX INFO: renamed from: N3 */
    public void m170258N3() {
        duringCreated(fwo0.m127819l()).subscribe(dhw.m115826e(new y20() { // from class: l.n1p0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f139778a.m170256L3((BLiveVoiceCpLeaderBoards) obj);
            }
        }, new y20() { // from class: l.o1p0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f144677a.m170257M3((Throwable) obj);
            }
        }));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
    }
}
