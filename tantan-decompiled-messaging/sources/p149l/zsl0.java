package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveMember;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoomTagInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceTagBubble;
import com.p046p1.mobile.putong.live.livingroom.view.SayHiBubbleView;
import com.p046p1.mobile.putong.live.livingroom.virtual.ktv.member.VirtualVoiceMembersView;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes5.dex */
public class zsl0 extends oyl0<nnn0> {

    /* JADX INFO: renamed from: k */
    public int f204609k;

    public zsl0(bsm bsmVar, VirtualVoiceMembersView virtualVoiceMembersView) {
        super(bsmVar, virtualVoiceMembersView);
        this.f204609k = -2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.isl0
    /* JADX INFO: renamed from: R3 */
    public void mo138048R3(bik0.C15867a c15867a) {
        super.mo138048R3(c15867a);
        final BLiveVoiceRoomTagInfo bLiveVoiceRoomTagInfo = ((nnn0) m206027E2()).m160247O2().mo165469j().voiceRoomTagInfo;
        if (m206027E2() instanceof fhm0) {
            fhm0 fhm0Var = (fhm0) m206027E2();
            String focusUser = fhm0Var.m121381b4().getFocusUser();
            if (c15867a.f75773b == 1 && !TextUtils.equals(focusUser, SayHiBubbleView.getGreetedToUserId())) {
                String strConsumeFocusUserLeftToast = fhm0Var.m121381b4().consumeFocusUserLeftToast();
                if (TextUtils.isEmpty(focusUser)) {
                    return;
                }
                BLiveMember bLiveMemberM201354G = ((nnn0) m206027E2()).m160249P2().m102069r().m201354G(focusUser);
                if (NullChecker.m81303a(bLiveMemberM201354G) && bLiveVoiceRoomTagInfo != null) {
                    e51.m114741F(this.f188513f, new Runnable() { // from class: l.ysl0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f199792a.m220039r4(bLiveVoiceRoomTagInfo);
                        }
                    });
                } else if (bLiveMemberM201354G == null) {
                    lsi0.m151595y("你的朋友刚刚离开了房间");
                } else if (!TextUtils.isEmpty(strConsumeFocusUserLeftToast)) {
                    lsi0.m151580j(strConsumeFocusUserLeftToast);
                }
                SayHiBubbleView.setGreetedToUserId(focusUser);
            }
            if (bLiveVoiceRoomTagInfo != null) {
                m220038q4(bLiveVoiceRoomTagInfo.bubble.fromUserId);
            }
        }
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        this.f204609k = -2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q4 */
    public final void m220038q4(String str) {
        if (((VirtualVoiceMembersView) this.viewModel).m77008p()) {
            if (this.f204609k != ((VirtualVoiceMembersView) this.viewModel).m77009q(str) || ((nnn0) m206027E2()).m160249P2().m102063l(str) == null) {
                ((VirtualVoiceMembersView) this.viewModel).m77006m();
            }
        }
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ void m220039r4(BLiveVoiceRoomTagInfo bLiveVoiceRoomTagInfo) {
        m220040s4(bLiveVoiceRoomTagInfo.bubble);
    }

    /* JADX INFO: renamed from: s4 */
    public final void m220040s4(BLiveVoiceTagBubble bLiveVoiceTagBubble) {
        String str = bLiveVoiceTagBubble.fromUserId;
        if (TextUtils.isEmpty(bLiveVoiceTagBubble.userName)) {
            return;
        }
        ((VirtualVoiceMembersView) this.viewModel).m77015x(str, bLiveVoiceTagBubble);
    }
}
