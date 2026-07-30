package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveMember;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.livingroom.virtual.virtualmotion.creator.rightcall.VoiceMemberItemView;
import com.p051p1.mobile.putong.live.livingroom.virtual.virtualmotion.creator.rightcall.VoiceMembersView;
import kotlin.Pair;
import p153l.rwn0;

/* JADX INFO: loaded from: classes5.dex */
public class usm0<D extends rwn0> extends m1m0<D, VoiceMembersView> {
    public usm0(dum dumVar) {
        super(dumVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f4 */
    public Pair<int[], Integer> m197943f4(nfn0 nfn0Var) {
        VoiceMemberItemView voiceMemberItemView = (VoiceMemberItemView) ((VoiceMembersView) this.viewModel).m78816w0(nfn0Var.f141748d);
        if (voiceMemberItemView == null) {
            return m213810E2().m183411P2().m136879r().m97107C(nfn0Var.f141748d) != null ? new Pair<>(i0k.m137975b(((VoiceMembersView) this.viewModel).f53678g), Integer.valueOf(qa00.m175859d(50.0f))) : new Pair<>(new int[2], 0);
        }
        return new Pair<>(i0k.m137975b(voiceMemberItemView.f53659e.getRealAvatarView()), Integer.valueOf(voiceMemberItemView.f53659e.getRealAvatarView().getWidth()));
    }

    @Override // p153l.m1m0
    /* JADX INFO: renamed from: N1 */
    public void mo156707N1(BLiveVoiceCall bLiveVoiceCall) {
        ((VoiceMembersView) this.viewModel).m78807N1(bLiveVoiceCall);
    }

    @Override // p153l.m1m0
    /* JADX INFO: renamed from: U3 */
    public void mo156710U3(nsv<h64> nsvVar) {
        ((VoiceMembersView) this.viewModel).m78803I0(nsvVar);
    }

    @Override // p153l.oam
    /* JADX INFO: renamed from: V1 */
    public void mo162760V1(nsv<h64> nsvVar) {
        ((VoiceMembersView) this.viewModel).m78806L0(nsvVar);
    }

    @Override // p153l.m1m0
    /* JADX INFO: renamed from: V3 */
    public void mo156711V3(nsv<h64> nsvVar, nsv<h64> nsvVar2, BLiveVoiceCall bLiveVoiceCall, BLiveVoiceCall bLiveVoiceCall2, boolean z, String str, String str2) {
        ((VoiceMembersView) this.viewModel).setData(m213810E2().m183411P2().m136879r());
    }

    @Override // p153l.m1m0
    /* JADX INFO: renamed from: W3 */
    public void mo156712W3(long j) {
        ((VoiceMembersView) this.viewModel).setMemberCount(j);
    }

    @Override // p153l.m1m0
    /* JADX INFO: renamed from: X3 */
    public void mo156713X3(ado0 ado0Var) {
        ((VoiceMembersView) this.viewModel).setData(ado0Var);
    }

    /* JADX INFO: renamed from: e4 */
    public void m197944e4(String str) {
        String str2;
        if (m213810E2().m168532l0() == null) {
            return;
        }
        if (!"guideGoCallUser".equals(str)) {
            ydn0.m215258k(this, m213810E2().m168532l0().f56859id, str);
            return;
        }
        if (guk0.m132329h(m213810E2().m183423Y2()) || m213810E2().mo118373p()) {
            m213811F2().MemberManagerEvent.showMemberManagerDialog().mo199273j(0);
            str2 = "invite";
        } else {
            m213811F2().VoiceCallEvent.callApplyEvent().mo199273j(new bzm0());
            str2 = "apply";
        }
        String str3 = str2;
        BLiveMember bLiveMemberM97111G = m213810E2().m183411P2().m136879r().m97111G(zrv.f205799a.m207631D0());
        if (bLiveMemberM97111G != null) {
            jkp0.m145873d(m213810E2().mo118373p(), m213810E2().m168532l0().f56859id, m213810E2().m202191k(), str3, bLiveMemberM97111G.isManager, m213810E2().mo183435j().template);
        }
    }

    /* JADX INFO: renamed from: g4 */
    public void m197945g4() {
        String str;
        if (m213810E2().mo118373p()) {
            str = "anchor";
        } else {
            str = guk0.m132329h(m213810E2().m183423Y2()) ? "audience_voicechat" : "audience";
        }
        i4g0.m138523u("e_audio_shareroom_button", m213810E2().mo118373p() ? "p_anchor_audio_room" : "p_user_audio_room", jyb.m147494Y("anchorId", m213810E2().m168532l0().f56859id), jyb.m147494Y("liveId", m213810E2().m202191k()), jyb.m147494Y("user_type", str), jyb.m147494Y("voice_template", f2m0.m123633c(this.f196918e) ? "karaoke_room" : "normal_room"));
        m213811F2().VoiceVirtualLiveEvent.openSharePanelDialog().m199277p();
    }

    /* JADX INFO: renamed from: h4 */
    public void m197946h4() {
        m213811F2().MemberManagerEvent.showMemberManagerDialog().mo199273j(0);
    }

    @Override // p153l.oam
    /* JADX INFO: renamed from: k0 */
    public void mo162767k0(BLiveVoiceCall bLiveVoiceCall) {
        ((VoiceMembersView) this.viewModel).m78805K0(bLiveVoiceCall);
    }

    @Override // p153l.m1m0, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m138860d3(nfn0.class, new qcj() { // from class: l.tsm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f176007a.m197943f4((nfn0) obj);
            }
        });
    }
}
