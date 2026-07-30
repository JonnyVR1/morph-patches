package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveVoicePayGuideUser;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;

/* JADX INFO: loaded from: classes5.dex */
public class fxl0 extends y8s<rwn0, ixl0> {
    public fxl0(dum<? extends rwn0> dumVar) {
        super(dumVar);
        mo52715C(new ixl0(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W3 */
    public void m127988W3(final BLiveVoicePayGuideUser bLiveVoicePayGuideUser) {
        ((ixl0) this.viewModel).mo73021p();
        if (bLiveVoicePayGuideUser == null) {
            return;
        }
        i4g0.m138523u("e_audio_add_apply_button", jkp0.m145875f(((rwn0) m213810E2()).mo118373p()), jyb.m147494Y("anchorId", ((rwn0) m213810E2()).m168526j0()), jyb.m147494Y("roomId", ((rwn0) m213810E2()).m202194o()), jyb.m147494Y("liveId", ((rwn0) m213810E2()).m202191k()), jyb.m147494Y("other_user_id", bLiveVoicePayGuideUser.userId), jyb.m147494Y("button_type", "agree"));
        duringCreated(VirtualVoiceRoomApiProvider.postLike(zrv.f205799a.m207631D0(), bLiveVoicePayGuideUser.userId)).flatMap(new qcj() { // from class: l.dxl0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72737q5(bLiveVoicePayGuideUser.userId);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.exl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f96300a.m127989X3((User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m127989X3(User user) {
        if (User.isRelationshipMatched(user)) {
            zrv.f205799a.m207689q0(this.f196919f, user, "chatroom_male");
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m127990Y3(LongLinkVirtualVoice.VoicePayGuideUser voicePayGuideUser) {
        m127992a4(voicePayGuideUser.getUserId());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z3 */
    public final void m127991Z3(BLiveVoicePayGuideUser bLiveVoicePayGuideUser) {
        ((ixl0) this.viewModel).m73017E();
        ((ixl0) this.viewModel).m142536K(bLiveVoicePayGuideUser);
        i4g0.m138492A("e_audio_add_apply_button", jkp0.m145875f(((rwn0) m213810E2()).mo118373p()), jyb.m147494Y("anchorId", ((rwn0) m213810E2()).m168526j0()), jyb.m147494Y("roomId", ((rwn0) m213810E2()).m202194o()), jyb.m147494Y("liveId", ((rwn0) m213810E2()).m202191k()), jyb.m147494Y("other_user_id", bLiveVoicePayGuideUser.userId));
    }

    /* JADX INFO: renamed from: a4 */
    public void m127992a4(String str) {
        duringCreated(VirtualVoiceRoomApiProvider.getApplyMatchUserInfo(str)).subscribe(dhw.m115826e(new y20() { // from class: l.cxl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f84257a.m127991Z3((BLiveVoicePayGuideUser) obj);
            }
        }, new z2e0()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(((rwn0) m213810E2()).m168545q1().m98294i1()).subscribe(dhw.m115829h(new y20() { // from class: l.axl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f73868a.m127990Y3((LongLinkVirtualVoice.VoicePayGuideUser) obj);
            }
        }));
        m138863h3(m213811F2().VoiceVirtualLiveEvent.showVoicePayGuideUserDialog(), new y20() { // from class: l.bxl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f78888a.m127992a4((String) obj);
            }
        });
    }
}
