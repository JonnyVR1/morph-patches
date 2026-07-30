package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveMember;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoomTagInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceTagBubble;
import com.p051p1.mobile.putong.live.livingroom.view.SayHiBubbleView;
import com.p051p1.mobile.putong.live.livingroom.virtual.ktv.member.VirtualVoiceMembersView;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes5.dex */
public class d2m0 extends s7m0<rwn0> {

    /* JADX INFO: renamed from: k */
    public int f84799k;

    public d2m0(dum dumVar, VirtualVoiceMembersView virtualVoiceMembersView) {
        super(dumVar, virtualVoiceMembersView);
        this.f84799k = -2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.m1m0
    /* JADX INFO: renamed from: R3 */
    public void mo113719R3(hrk0.C17564a c17564a) {
        super.mo113719R3(c17564a);
        final BLiveVoiceRoomTagInfo bLiveVoiceRoomTagInfo = ((rwn0) m213810E2()).m183409O2().mo122891j().voiceRoomTagInfo;
        if (m213810E2() instanceof jqm0) {
            jqm0 jqm0Var = (jqm0) m213810E2();
            String focusUser = jqm0Var.m146609b4().getFocusUser();
            if (c17564a.f111360b == 1 && !TextUtils.equals(focusUser, SayHiBubbleView.getGreetedToUserId())) {
                String strConsumeFocusUserLeftToast = jqm0Var.m146609b4().consumeFocusUserLeftToast();
                if (TextUtils.isEmpty(focusUser)) {
                    return;
                }
                BLiveMember bLiveMemberM97111G = ((rwn0) m213810E2()).m183411P2().m136879r().m97111G(focusUser);
                if (NullChecker.m82486a(bLiveMemberM97111G) && bLiveVoiceRoomTagInfo != null) {
                    l51.m152886F(this.f196919f, new Runnable() { // from class: l.c2m0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f79503a.m113721r4(bLiveVoiceRoomTagInfo);
                        }
                    });
                } else if (bLiveMemberM97111G == null) {
                    o1j0.m165651y("你的朋友刚刚离开了房间");
                } else if (!TextUtils.isEmpty(strConsumeFocusUserLeftToast)) {
                    o1j0.m165636j(strConsumeFocusUserLeftToast);
                }
                SayHiBubbleView.setGreetedToUserId(focusUser);
            }
            if (bLiveVoiceRoomTagInfo != null) {
                m113720q4(bLiveVoiceRoomTagInfo.bubble.fromUserId);
            }
        }
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        this.f84799k = -2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q4 */
    public final void m113720q4(String str) {
        if (((VirtualVoiceMembersView) this.viewModel).m78191p()) {
            if (this.f84799k != ((VirtualVoiceMembersView) this.viewModel).m78192q(str) || ((rwn0) m213810E2()).m183411P2().m136873l(str) == null) {
                ((VirtualVoiceMembersView) this.viewModel).m78189m();
            }
        }
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ void m113721r4(BLiveVoiceRoomTagInfo bLiveVoiceRoomTagInfo) {
        m113722s4(bLiveVoiceRoomTagInfo.bubble);
    }

    /* JADX INFO: renamed from: s4 */
    public final void m113722s4(BLiveVoiceTagBubble bLiveVoiceTagBubble) {
        String str = bLiveVoiceTagBubble.fromUserId;
        if (TextUtils.isEmpty(bLiveVoiceTagBubble.userName)) {
            return;
        }
        ((VirtualVoiceMembersView) this.viewModel).m78198x(str, bLiveVoiceTagBubble);
    }
}
