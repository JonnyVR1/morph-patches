package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceLeaderBoardEntranceItem;
import com.p051p1.mobile.putong.live.livingroom.virtual.board.VirtualLeadBoardEntranceView;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class u0m0 extends i6t<rwn0, VirtualLeadBoardEntranceView> {

    /* JADX INFO: renamed from: i */
    public boolean f176915i;

    public u0m0(dum dumVar, VirtualLeadBoardEntranceView virtualLeadBoardEntranceView) {
        super(dumVar);
        mo52715C(virtualLeadBoardEntranceView);
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ void m193850N3(List list) {
        ((VirtualLeadBoardEntranceView) this.viewModel).m78020n(list);
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m193851O3(LongLinkVirtualVoice.VoiceRoomPersonalUpdate voiceRoomPersonalUpdate) {
        this.f176915i = voiceRoomPersonalUpdate.getIsPersonal();
        m193855c();
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m193852P3(LongLinkVirtualVoice.VoiceLiveTemplateMessage voiceLiveTemplateMessage) {
        m193855c();
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m193853R3(LongLinkLiveMessage.RefreshVoiceRoomLeaderboard refreshVoiceRoomLeaderboard) {
        m193855c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S3 */
    public void m193854S3(BLiveVoiceLeaderBoardEntranceItem bLiveVoiceLeaderBoardEntranceItem) {
        t3m0.m189112z(this, bLiveVoiceLeaderBoardEntranceItem.trackData.eid);
        if (bLiveVoiceLeaderBoardEntranceItem.type.equals("auction")) {
            m213811F2().VoiceAuctionEvent.openAuctionLeaderboardDlg().mo199273j(((rwn0) m213810E2()).m202194o());
        } else {
            m213811F2().SchemeHandleEvent.handleScheme().mo199273j(new bae0.C15953a(7012).m103154e(bLiveVoiceLeaderBoardEntranceItem.scheme).m103152c());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public void m193855c() {
        duringCreated(dcr.m115281e(((rwn0) m213810E2()).m202194o(), ((rwn0) m213810E2()).m202191k(), ((rwn0) m213810E2()).m168526j0(), ((rwn0) m213810E2()).mo183435j().template, this.f176915i)).subscribe(dhw.m115829h(new y20() { // from class: l.t0m0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f171543a.m193850N3((List) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m193855c();
        duringCreated(((rwn0) m213810E2()).m168545q1().m98312o1()).subscribe(dhw.m115829h(new y20() { // from class: l.q0m0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f155070a.m193851O3((LongLinkVirtualVoice.VoiceRoomPersonalUpdate) obj);
            }
        }));
        duringCreated(((rwn0) m213810E2()).f148282z.m170284r().m98261W0()).subscribe(dhw.m115829h(new y20() { // from class: l.r0m0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f160656a.m193852P3((LongLinkVirtualVoice.VoiceLiveTemplateMessage) obj);
            }
        }));
        duringCreated(((rwn0) m213810E2()).m168545q1().m98323s0()).subscribe(dhw.m115829h(new y20() { // from class: l.s0m0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f165712a.m193853R3((LongLinkLiveMessage.RefreshVoiceRoomLeaderboard) obj);
            }
        }));
    }
}
