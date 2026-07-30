package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveMember;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.livingroom.virtual.virtualmotion.creator.rightcall.VoiceMemberItemView;
import com.p046p1.mobile.putong.live.livingroom.virtual.virtualmotion.creator.rightcall.VoiceMembersView;
import kotlin.Pair;
import p149l.nnn0;

/* JADX INFO: loaded from: classes5.dex */
public class qjm0<D extends nnn0> extends isl0<D, VoiceMembersView> {
    public qjm0(bsm bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f4 */
    public Pair<int[], Integer> m175017f4(j6n0 j6n0Var) {
        VoiceMemberItemView voiceMemberItemView = (VoiceMemberItemView) ((VoiceMembersView) this.viewModel).m77633w0(j6n0Var.f116489d);
        if (voiceMemberItemView == null) {
            return m206027E2().m160249P2().m102069r().m201350C(j6n0Var.f116489d) != null ? new Pair<>(sxj.m186441b(((VoiceMembersView) this.viewModel).f52830g), Integer.valueOf(t100.m186890d(50.0f))) : new Pair<>(new int[2], 0);
        }
        return new Pair<>(sxj.m186441b(voiceMemberItemView.f52811e.getRealAvatarView()), Integer.valueOf(voiceMemberItemView.f52811e.getRealAvatarView().getWidth()));
    }

    @Override // p149l.isl0
    /* JADX INFO: renamed from: N1 */
    public void mo138047N1(BLiveVoiceCall bLiveVoiceCall) {
        ((VoiceMembersView) this.viewModel).m77624N1(bLiveVoiceCall);
    }

    @Override // p149l.isl0
    /* JADX INFO: renamed from: U3 */
    public void mo138051U3(mqv<i54> mqvVar) {
        ((VoiceMembersView) this.viewModel).m77620I0(mqvVar);
    }

    @Override // p149l.y7m
    /* JADX INFO: renamed from: V1 */
    public void mo139728V1(mqv<i54> mqvVar) {
        ((VoiceMembersView) this.viewModel).m77623L0(mqvVar);
    }

    @Override // p149l.isl0
    /* JADX INFO: renamed from: V3 */
    public void mo138052V3(mqv<i54> mqvVar, mqv<i54> mqvVar2, BLiveVoiceCall bLiveVoiceCall, BLiveVoiceCall bLiveVoiceCall2, boolean z, String str, String str2) {
        ((VoiceMembersView) this.viewModel).setData(m206027E2().m160249P2().m102069r());
    }

    @Override // p149l.isl0
    /* JADX INFO: renamed from: W3 */
    public void mo138053W3(long j) {
        ((VoiceMembersView) this.viewModel).setMemberCount(j);
    }

    @Override // p149l.isl0
    /* JADX INFO: renamed from: X3 */
    public void mo138054X3(w3o0 w3o0Var) {
        ((VoiceMembersView) this.viewModel).setData(w3o0Var);
    }

    /* JADX INFO: renamed from: e4 */
    public void m175018e4(String str) {
        String str2;
        if (m206027E2().m132146l0() == null) {
            return;
        }
        if (!"guideGoCallUser".equals(str)) {
            u4n0.m191752k(this, m206027E2().m132146l0().f56011id, str);
            return;
        }
        if (alk0.m97309h(m206027E2().m160261Y2()) || m206027E2().mo97490p()) {
            m206028F2().MemberManagerEvent.showMemberManagerDialog().mo172463j(0);
            str2 = "invite";
        } else {
            m206028F2().VoiceCallEvent.callApplyEvent().mo172463j(new xpm0());
            str2 = "apply";
        }
        String str3 = str2;
        BLiveMember bLiveMemberM201354G = m206027E2().m160249P2().m102069r().m201354G(ypv.f199493a.m199309D0());
        if (bLiveMemberM201354G != null) {
            fbp0.m120388d(m206027E2().mo97490p(), m206027E2().m132146l0().f56011id, m206027E2().m149814k(), str3, bLiveMemberM201354G.isManager, m206027E2().mo149813j().template);
        }
    }

    /* JADX INFO: renamed from: g4 */
    public void m175019g4() {
        String str;
        if (m206027E2().mo97490p()) {
            str = "anchor";
        } else {
            str = alk0.m97309h(m206027E2().m160261Y2()) ? "audience_voicechat" : "audience";
        }
        zvf0.m220399u("e_audio_shareroom_button", m206027E2().mo97490p() ? "p_anchor_audio_room" : "p_user_audio_room", vwb.m200311Y("anchorId", m206027E2().m132146l0().f56011id), vwb.m200311Y("liveId", m206027E2().m149814k()), vwb.m200311Y("user_type", str), vwb.m200311Y("voice_template", btl0.m103863c(this.f188512e) ? "karaoke_room" : "normal_room"));
        m206028F2().VoiceVirtualLiveEvent.openSharePanelDialog().m172467p();
    }

    /* JADX INFO: renamed from: h4 */
    public void m175020h4() {
        m206028F2().MemberManagerEvent.showMemberManagerDialog().mo172463j(0);
    }

    @Override // p149l.y7m
    /* JADX INFO: renamed from: k0 */
    public void mo139738k0(BLiveVoiceCall bLiveVoiceCall) {
        ((VoiceMembersView) this.viewModel).m77622K0(bLiveVoiceCall);
    }

    @Override // p149l.isl0, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m129301d3(j6n0.class, new w9j() { // from class: l.pjm0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f149844a.m175017f4((j6n0) obj);
            }
        });
    }
}
