package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoomTagInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceTagBubble;
import com.p046p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p046p1.mobile.putong.live.livingroom.virtual.fans.VoiceVirtualFansView;
import com.tantanapp.common.utils.NullChecker;
import p133rx.C22306c;
import p149l.nnn0;

/* JADX INFO: loaded from: classes5.dex */
public class x4p0<T extends nnn0> extends h4t<T, VoiceVirtualFansView> {

    /* JADX INFO: renamed from: i */
    public boolean f191044i;

    public x4p0(bsm<T> bsmVar, VoiceVirtualFansView voiceVirtualFansView) {
        super(bsmVar);
        mo51532C(voiceVirtualFansView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P3 */
    public void m207000P3(bik0.C15867a c15867a) {
        hfw.m130790a("[voice][call]", "handleDeputyModel:" + c15867a.f75773b);
        m207009X3(((nnn0) m206027E2()).m160249P2().m102069r());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S3 */
    public void m207001S3(LongLinkLiveMessage.VoiceMemberUpdate voiceMemberUpdate) {
        hfw.m130790a("[voice][call]", "handleMemberUpdate");
        if (voiceMemberUpdate.getType().equals(LongLinkLiveMessage.VoiceMemberUpdate.UpdateType.Count)) {
            ((nnn0) m206027E2()).m160249P2().m102069r().m201368U(voiceMemberUpdate.getTotal());
            ((VoiceVirtualFansView) this.viewModel).m76952v(voiceMemberUpdate.getTotal());
            return;
        }
        if (voiceMemberUpdate.getType().equals(LongLinkLiveMessage.VoiceMemberUpdate.UpdateType.Remove)) {
            ((nnn0) m206027E2()).m160249P2().m102075x(voiceMemberUpdate.getMemberId());
        } else {
            ((nnn0) m206027E2()).m160249P2().m102058g(mqv.m155998f(new i54(voiceMemberUpdate.getMemberId(), voiceMemberUpdate.getUserMask().getName(), voiceMemberUpdate.getUserMask().getAvatar())).m156001c(voiceMemberUpdate.getMemberId(), rxn0.m181617a(voiceMemberUpdate.getUserMask()), ((nnn0) m206027E2()).mo132103W0()), e0o0.m114320f((nnn0) m206027E2(), voiceMemberUpdate.getMemberId()));
        }
        m207009X3(((nnn0) m206027E2()).m160249P2().m102069r());
    }

    /* JADX INFO: renamed from: Y3 */
    private void m207002Y3(BLiveVoiceTagBubble bLiveVoiceTagBubble) {
        String str = bLiveVoiceTagBubble.fromUserId;
        if (TextUtils.isEmpty(bLiveVoiceTagBubble.userName)) {
            return;
        }
        ((VoiceVirtualFansView) this.viewModel).m76949q(str, bLiveVoiceTagBubble);
    }

    /* JADX INFO: renamed from: O3 */
    public void m207003O3() {
        ((VoiceVirtualFansView) this.viewModel).m76948p();
        ((VoiceVirtualFansView) this.viewModel).m76951u(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R3 */
    public void m207004R3() {
        if (NullChecker.m81303a(((nnn0) m206027E2()).mo149813j()) && (x4s.m207011a(((nnn0) m206027E2()).mo149813j().liveMode) || x4s.m207013c(((nnn0) m206027E2()).mo149813j().liveMode))) {
            ((VoiceVirtualFansView) this.viewModel).m76951u(true);
            init();
        } else if (x4s.m207014d(((nnn0) m206027E2()).mo149813j().liveMode) && VirtualVoiceMotionType.ktv.equals(((nnn0) m206027E2()).mo149813j().template)) {
            ((VoiceVirtualFansView) this.viewModel).m76947n();
        } else {
            ((VoiceVirtualFansView) this.viewModel).m76951u(false);
        }
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ void m207005T3(BLiveVoiceRoomTagInfo bLiveVoiceRoomTagInfo) {
        m207002Y3(bLiveVoiceRoomTagInfo.bubble);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m207006U3(String str) {
        if (((nnn0) m206027E2()).m160249P2().m102065n(str) == null) {
            osi0.m165783g("你的朋友刚刚离开了房间");
        } else {
            final BLiveVoiceRoomTagInfo bLiveVoiceRoomTagInfo = ((nnn0) m206027E2()).m160247O2().mo165469j().voiceRoomTagInfo;
            e51.m114741F(this.f188513f, new Runnable() { // from class: l.w4p0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f184582a.m207005T3(bLiveVoiceRoomTagInfo);
                }
            });
        }
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m207007V3(BLiveVoice bLiveVoice) {
        m207004R3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W3 */
    public void m207008W3() {
        String str;
        if (((nnn0) m206027E2()).mo97490p()) {
            str = "anchor";
        } else {
            str = alk0.m97309h(((nnn0) m206027E2()).m160261Y2()) ? "audience_voicechat" : "audience";
        }
        zvf0.m220399u("e_audio_shareroom_button", ((nnn0) m206027E2()).mo97490p() ? "p_anchor_audio_room" : "p_user_audio_room", vwb.m200311Y("anchorId", ((nnn0) m206027E2()).m132146l0().f56011id), vwb.m200311Y("liveId", ((nnn0) m206027E2()).m149814k()), vwb.m200311Y("user_type", str), vwb.m200311Y("voice_template", btl0.m103863c(this.f188512e) ? "karaoke_room" : "normal_room"));
        m206028F2().VoiceVirtualLiveEvent.openSharePanelDialog().m172467p();
    }

    /* JADX INFO: renamed from: X3 */
    public final void m207009X3(w3o0 w3o0Var) {
        hfw.m130790a("[voice][call]", "setDataToView");
        ((VoiceVirtualFansView) this.viewModel).setData(w3o0Var);
    }

    /* JADX INFO: renamed from: Z3 */
    public void m207010Z3() {
        m206028F2().MemberManagerEvent.showMemberManagerDialog().mo172463j(0);
    }

    public void init() {
        if (this.f191044i) {
            return;
        }
        this.f191044i = true;
        duringCreated((C22306c<T>) ((nnn0) m206027E2()).m160251Q2()).observeOn(jo0.m142408a()).subscribe(ffw.m121197h(new e30() { // from class: l.t4p0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f167742a.m207000P3((bik0.C15867a) obj);
            }
        }));
        duringCreated((C22306c<T>) ((nnn0) m206027E2()).m132160q1().m189094c1()).subscribe(ffw.m121197h(new e30() { // from class: l.u4p0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f174613a.m207001S3((LongLinkLiveMessage.VoiceMemberUpdate) obj);
            }
        }));
        m129304h3(m206028F2().VoiceVirtualLiveEvent.showSayHiBubble(), new e30() { // from class: l.v4p0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f179967a.m207006U3((String) obj);
            }
        });
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        m207003O3();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated((C22306c<T>) ((nnn0) m206027E2()).m160247O2().m165466d()).subscribe(ffw.m121197h(new e30() { // from class: l.s4p0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f162459a.m207007V3((BLiveVoice) obj);
            }
        }));
    }
}
