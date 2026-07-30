package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceLeaderBoardEntranceItem;
import com.p046p1.mobile.putong.live.livingroom.virtual.board.VirtualLeadBoardEntranceView;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class qrl0 extends h4t<nnn0, VirtualLeadBoardEntranceView> {

    /* JADX INFO: renamed from: i */
    public boolean f156003i;

    public qrl0(bsm bsmVar, VirtualLeadBoardEntranceView virtualLeadBoardEntranceView) {
        super(bsmVar);
        mo51532C(virtualLeadBoardEntranceView);
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ void m176044N3(List list) {
        ((VirtualLeadBoardEntranceView) this.viewModel).m76837n(list);
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m176045O3(LongLinkVirtualVoice.VoiceRoomPersonalUpdate voiceRoomPersonalUpdate) {
        this.f156003i = voiceRoomPersonalUpdate.getIsPersonal();
        m176049c();
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m176046P3(LongLinkVirtualVoice.VoiceLiveTemplateMessage voiceLiveTemplateMessage) {
        m176049c();
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m176047R3(LongLinkLiveMessage.RefreshVoiceRoomLeaderboard refreshVoiceRoomLeaderboard) {
        m176049c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S3 */
    public void m176048S3(BLiveVoiceLeaderBoardEntranceItem bLiveVoiceLeaderBoardEntranceItem) {
        pul0.m171468z(this, bLiveVoiceLeaderBoardEntranceItem.trackData.eid);
        if (bLiveVoiceLeaderBoardEntranceItem.type.equals("auction")) {
            m206028F2().VoiceAuctionEvent.openAuctionLeaderboardDlg().mo172463j(((nnn0) m206027E2()).m149818o());
        } else {
            m206028F2().SchemeHandleEvent.handleScheme().mo172463j(new x1e0.C21018a(7012).m206701e(bLiveVoiceLeaderBoardEntranceItem.scheme).m206699c());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public void m176049c() {
        duringCreated(bar.m100925e(((nnn0) m206027E2()).m149818o(), ((nnn0) m206027E2()).m149814k(), ((nnn0) m206027E2()).m132140j0(), ((nnn0) m206027E2()).mo149813j().template, this.f156003i)).subscribe(ffw.m121197h(new e30() { // from class: l.prl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f150923a.m176044N3((List) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m176049c();
        duringCreated(((nnn0) m206027E2()).m132160q1().m189130o1()).subscribe(ffw.m121197h(new e30() { // from class: l.mrl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f135374a.m176045O3((LongLinkVirtualVoice.VoiceRoomPersonalUpdate) obj);
            }
        }));
        duringCreated(((nnn0) m206027E2()).f108769z.m181789r().m189079W0()).subscribe(ffw.m121197h(new e30() { // from class: l.nrl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f140204a.m176046P3((LongLinkVirtualVoice.VoiceLiveTemplateMessage) obj);
            }
        }));
        duringCreated(((nnn0) m206027E2()).m132160q1().m189141s0()).subscribe(ffw.m121197h(new e30() { // from class: l.orl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f145337a.m176047R3((LongLinkLiveMessage.RefreshVoiceRoomLeaderboard) obj);
            }
        }));
    }
}
