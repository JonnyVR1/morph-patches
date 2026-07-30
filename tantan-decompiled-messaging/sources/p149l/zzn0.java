package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveMember;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoomTagInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceTagBubble;
import com.p046p1.mobile.putong.live.livingroom.view.SayHiBubbleView;
import com.p046p1.mobile.putong.live.livingroom.virtual.virtualmotion.creator.rightcall.VoiceMembersView;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes5.dex */
public class zzn0 extends qjm0<fhm0> {

    /* JADX INFO: renamed from: j */
    public int f205811j;

    public zzn0(bsm bsmVar) {
        super(bsmVar);
        this.f205811j = -2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j4 */
    private void m221023j4(String str) {
        if (((VoiceMembersView) this.viewModel).m77630t0()) {
            if (this.f205811j != ((VoiceMembersView) this.viewModel).m77631u0(str) || ((fhm0) m206027E2()).m160249P2().m102063l(str) == null) {
                ((VoiceMembersView) this.viewModel).m77617E0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public /* synthetic */ void m221024k4(BLiveVoiceRoomTagInfo bLiveVoiceRoomTagInfo) {
        m221025l4(bLiveVoiceRoomTagInfo.bubble);
    }

    /* JADX INFO: renamed from: l4 */
    private void m221025l4(BLiveVoiceTagBubble bLiveVoiceTagBubble) {
        String str = bLiveVoiceTagBubble.fromUserId;
        if (TextUtils.isEmpty(bLiveVoiceTagBubble.userName)) {
            return;
        }
        ((VoiceMembersView) this.viewModel).m77621J0(str, bLiveVoiceTagBubble);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.isl0
    /* JADX INFO: renamed from: R3 */
    public void mo138048R3(bik0.C15867a c15867a) {
        super.mo138048R3(c15867a);
        final BLiveVoiceRoomTagInfo bLiveVoiceRoomTagInfo = ((fhm0) m206027E2()).m160247O2().mo165469j().voiceRoomTagInfo;
        String focusUser = ((fhm0) m206027E2()).m121381b4().getFocusUser();
        if (c15867a.f75773b == 1 && !TextUtils.equals(focusUser, SayHiBubbleView.getGreetedToUserId())) {
            String strConsumeFocusUserLeftToast = ((fhm0) m206027E2()).m121381b4().consumeFocusUserLeftToast();
            if (TextUtils.isEmpty(focusUser)) {
                return;
            }
            BLiveMember bLiveMemberM201354G = ((fhm0) m206027E2()).m160249P2().m102069r().m201354G(focusUser);
            if (NullChecker.m81303a(bLiveMemberM201354G) && bLiveVoiceRoomTagInfo != null) {
                e51.m114741F(this.f188513f, new Runnable() { // from class: l.yzn0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f200899a.m221024k4(bLiveVoiceRoomTagInfo);
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
            m221023j4(bLiveVoiceRoomTagInfo.bubble.fromUserId);
        }
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        this.f205811j = -2;
    }
}
