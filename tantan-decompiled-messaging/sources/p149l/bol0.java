package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveVoicePayGuideUser;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;

/* JADX INFO: loaded from: classes5.dex */
public class bol0 extends x6s<nnn0, eol0> {
    public bol0(bsm<? extends nnn0> bsmVar) {
        super(bsmVar);
        mo51532C(new eol0(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W3 */
    public void m102952W3(final BLiveVoicePayGuideUser bLiveVoicePayGuideUser) {
        ((eol0) this.viewModel).mo71838p();
        if (bLiveVoicePayGuideUser == null) {
            return;
        }
        zvf0.m220399u("e_audio_add_apply_button", fbp0.m120390f(((nnn0) m206027E2()).mo97490p()), vwb.m200311Y("anchorId", ((nnn0) m206027E2()).m132140j0()), vwb.m200311Y("roomId", ((nnn0) m206027E2()).m149818o()), vwb.m200311Y("liveId", ((nnn0) m206027E2()).m149814k()), vwb.m200311Y("other_user_id", bLiveVoicePayGuideUser.userId), vwb.m200311Y("button_type", "agree"));
        duringCreated(VirtualVoiceRoomApiProvider.postLike(ypv.f199493a.m199309D0(), bLiveVoicePayGuideUser.userId)).flatMap(new w9j() { // from class: l.znl0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71554q5(bLiveVoicePayGuideUser.userId);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.aol0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f70876a.m102953X3((User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m102953X3(User user) {
        if (User.isRelationshipMatched(user)) {
            ypv.f199493a.m199367q0(this.f188513f, user, "chatroom_male");
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m102954Y3(LongLinkVirtualVoice.VoicePayGuideUser voicePayGuideUser) {
        m102956a4(voicePayGuideUser.getUserId());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z3 */
    public final void m102955Z3(BLiveVoicePayGuideUser bLiveVoicePayGuideUser) {
        ((eol0) this.viewModel).m71834E();
        ((eol0) this.viewModel).m117366K(bLiveVoicePayGuideUser);
        zvf0.m220368A("e_audio_add_apply_button", fbp0.m120390f(((nnn0) m206027E2()).mo97490p()), vwb.m200311Y("anchorId", ((nnn0) m206027E2()).m132140j0()), vwb.m200311Y("roomId", ((nnn0) m206027E2()).m149818o()), vwb.m200311Y("liveId", ((nnn0) m206027E2()).m149814k()), vwb.m200311Y("other_user_id", bLiveVoicePayGuideUser.userId));
    }

    /* JADX INFO: renamed from: a4 */
    public void m102956a4(String str) {
        duringCreated(VirtualVoiceRoomApiProvider.getApplyMatchUserInfo(str)).subscribe(ffw.m121194e(new e30() { // from class: l.ynl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f199184a.m102955Z3((BLiveVoicePayGuideUser) obj);
            }
        }, new vud0()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(((nnn0) m206027E2()).m132160q1().m189112i1()).subscribe(ffw.m121197h(new e30() { // from class: l.wnl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f187316a.m102954Y3((LongLinkVirtualVoice.VoicePayGuideUser) obj);
            }
        }));
        m129304h3(m206028F2().VoiceVirtualLiveEvent.showVoicePayGuideUserDialog(), new e30() { // from class: l.xnl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f193710a.m102956a4((String) obj);
            }
        });
    }
}
