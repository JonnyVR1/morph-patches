package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoomTagInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceTagBubble;
import com.p051p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p051p1.mobile.putong.live.livingroom.virtual.fans.VoiceVirtualFansView;
import com.tantanapp.common.utils.NullChecker;
import p137rx.C22421c;
import p153l.rwn0;

/* JADX INFO: loaded from: classes5.dex */
public class bep0<T extends rwn0> extends i6t<T, VoiceVirtualFansView> {

    /* JADX INFO: renamed from: i */
    public boolean f76407i;

    public bep0(dum<T> dumVar, VoiceVirtualFansView voiceVirtualFansView) {
        super(dumVar);
        mo52715C(voiceVirtualFansView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P3 */
    public void m103763P3(hrk0.C17564a c17564a) {
        fhw.m125605a("[voice][call]", "handleDeputyModel:" + c17564a.f111360b);
        m103772X3(((rwn0) m213810E2()).m183411P2().m136879r());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S3 */
    public void m103764S3(LongLinkLiveMessage.VoiceMemberUpdate voiceMemberUpdate) {
        fhw.m125605a("[voice][call]", "handleMemberUpdate");
        if (voiceMemberUpdate.getType().equals(LongLinkLiveMessage.VoiceMemberUpdate.UpdateType.Count)) {
            ((rwn0) m213810E2()).m183411P2().m136879r().m97125U(voiceMemberUpdate.getTotal());
            ((VoiceVirtualFansView) this.viewModel).m78135v(voiceMemberUpdate.getTotal());
            return;
        }
        if (voiceMemberUpdate.getType().equals(LongLinkLiveMessage.VoiceMemberUpdate.UpdateType.Remove)) {
            ((rwn0) m213810E2()).m183411P2().m136885x(voiceMemberUpdate.getMemberId());
        } else {
            ((rwn0) m213810E2()).m183411P2().m136868g(nsv.m164636f(new h64(voiceMemberUpdate.getMemberId(), voiceMemberUpdate.getUserMask().getName(), voiceMemberUpdate.getUserMask().getAvatar())).m164639c(voiceMemberUpdate.getMemberId(), v6o0.m200134a(voiceMemberUpdate.getUserMask()), ((rwn0) m213810E2()).mo168489W0()), i9o0.m139135f((rwn0) m213810E2(), voiceMemberUpdate.getMemberId()));
        }
        m103772X3(((rwn0) m213810E2()).m183411P2().m136879r());
    }

    /* JADX INFO: renamed from: Y3 */
    private void m103765Y3(BLiveVoiceTagBubble bLiveVoiceTagBubble) {
        String str = bLiveVoiceTagBubble.fromUserId;
        if (TextUtils.isEmpty(bLiveVoiceTagBubble.userName)) {
            return;
        }
        ((VoiceVirtualFansView) this.viewModel).m78132q(str, bLiveVoiceTagBubble);
    }

    /* JADX INFO: renamed from: O3 */
    public void m103766O3() {
        ((VoiceVirtualFansView) this.viewModel).m78131p();
        ((VoiceVirtualFansView) this.viewModel).m78134u(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R3 */
    public void m103767R3() {
        if (NullChecker.m82486a(((rwn0) m213810E2()).mo183435j()) && (y6s.m214493a(((rwn0) m213810E2()).mo183435j().liveMode) || y6s.m214495c(((rwn0) m213810E2()).mo183435j().liveMode))) {
            ((VoiceVirtualFansView) this.viewModel).m78134u(true);
            init();
        } else if (y6s.m214496d(((rwn0) m213810E2()).mo183435j().liveMode) && VirtualVoiceMotionType.ktv.equals(((rwn0) m213810E2()).mo183435j().template)) {
            ((VoiceVirtualFansView) this.viewModel).m78130n();
        } else {
            ((VoiceVirtualFansView) this.viewModel).m78134u(false);
        }
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ void m103768T3(BLiveVoiceRoomTagInfo bLiveVoiceRoomTagInfo) {
        m103765Y3(bLiveVoiceRoomTagInfo.bubble);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m103769U3(String str) {
        if (((rwn0) m213810E2()).m183411P2().m136875n(str) == null) {
            r1j0.m179420g("你的朋友刚刚离开了房间");
        } else {
            final BLiveVoiceRoomTagInfo bLiveVoiceRoomTagInfo = ((rwn0) m213810E2()).m183409O2().mo122891j().voiceRoomTagInfo;
            l51.m152886F(this.f196919f, new Runnable() { // from class: l.aep0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f70819a.m103768T3(bLiveVoiceRoomTagInfo);
                }
            });
        }
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m103770V3(BLiveVoice bLiveVoice) {
        m103767R3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W3 */
    public void m103771W3() {
        String str;
        if (((rwn0) m213810E2()).mo118373p()) {
            str = "anchor";
        } else {
            str = guk0.m132329h(((rwn0) m213810E2()).m183423Y2()) ? "audience_voicechat" : "audience";
        }
        i4g0.m138523u("e_audio_shareroom_button", ((rwn0) m213810E2()).mo118373p() ? "p_anchor_audio_room" : "p_user_audio_room", jyb.m147494Y("anchorId", ((rwn0) m213810E2()).m168532l0().f56859id), jyb.m147494Y("liveId", ((rwn0) m213810E2()).m202191k()), jyb.m147494Y("user_type", str), jyb.m147494Y("voice_template", f2m0.m123633c(this.f196918e) ? "karaoke_room" : "normal_room"));
        m213811F2().VoiceVirtualLiveEvent.openSharePanelDialog().m199277p();
    }

    /* JADX INFO: renamed from: X3 */
    public final void m103772X3(ado0 ado0Var) {
        fhw.m125605a("[voice][call]", "setDataToView");
        ((VoiceVirtualFansView) this.viewModel).setData(ado0Var);
    }

    /* JADX INFO: renamed from: Z3 */
    public void m103773Z3() {
        m213811F2().MemberManagerEvent.showMemberManagerDialog().mo199273j(0);
    }

    public void init() {
        if (this.f76407i) {
            return;
        }
        this.f76407i = true;
        duringCreated((C22421c<T>) ((rwn0) m213810E2()).m183413Q2()).observeOn(fo0.m126432a()).subscribe(dhw.m115829h(new y20() { // from class: l.xdp0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f193618a.m103763P3((hrk0.C17564a) obj);
            }
        }));
        duringCreated((C22421c<T>) ((rwn0) m213810E2()).m168545q1().m98276c1()).subscribe(dhw.m115829h(new y20() { // from class: l.ydp0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f198614a.m103764S3((LongLinkLiveMessage.VoiceMemberUpdate) obj);
            }
        }));
        m138863h3(m213811F2().VoiceVirtualLiveEvent.showSayHiBubble(), new y20() { // from class: l.zdp0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f203920a.m103769U3((String) obj);
            }
        });
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        m103766O3();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated((C22421c<T>) ((rwn0) m213810E2()).m183409O2().m188658d()).subscribe(dhw.m115829h(new y20() { // from class: l.wdp0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f188627a.m103770V3((BLiveVoice) obj);
            }
        }));
    }
}
