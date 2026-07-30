package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveMember;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoomTagInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceTagBubble;
import com.p051p1.mobile.putong.live.livingroom.view.SayHiBubbleView;
import com.p051p1.mobile.putong.live.livingroom.virtual.virtualmotion.creator.rightcall.VoiceMembersView;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes5.dex */
public class d9o0 extends usm0<jqm0> {

    /* JADX INFO: renamed from: j */
    public int f85800j;

    public d9o0(dum dumVar) {
        super(dumVar);
        this.f85800j = -2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j4 */
    private void m115087j4(String str) {
        if (((VoiceMembersView) this.viewModel).m78813t0()) {
            if (this.f85800j != ((VoiceMembersView) this.viewModel).m78814u0(str) || ((jqm0) m213810E2()).m183411P2().m136873l(str) == null) {
                ((VoiceMembersView) this.viewModel).m78800E0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public /* synthetic */ void m115088k4(BLiveVoiceRoomTagInfo bLiveVoiceRoomTagInfo) {
        m115089l4(bLiveVoiceRoomTagInfo.bubble);
    }

    /* JADX INFO: renamed from: l4 */
    private void m115089l4(BLiveVoiceTagBubble bLiveVoiceTagBubble) {
        String str = bLiveVoiceTagBubble.fromUserId;
        if (TextUtils.isEmpty(bLiveVoiceTagBubble.userName)) {
            return;
        }
        ((VoiceMembersView) this.viewModel).m78804J0(str, bLiveVoiceTagBubble);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.m1m0
    /* JADX INFO: renamed from: R3 */
    public void mo113719R3(hrk0.C17564a c17564a) {
        super.mo113719R3(c17564a);
        final BLiveVoiceRoomTagInfo bLiveVoiceRoomTagInfo = ((jqm0) m213810E2()).m183409O2().mo122891j().voiceRoomTagInfo;
        String focusUser = ((jqm0) m213810E2()).m146609b4().getFocusUser();
        if (c17564a.f111360b == 1 && !TextUtils.equals(focusUser, SayHiBubbleView.getGreetedToUserId())) {
            String strConsumeFocusUserLeftToast = ((jqm0) m213810E2()).m146609b4().consumeFocusUserLeftToast();
            if (TextUtils.isEmpty(focusUser)) {
                return;
            }
            BLiveMember bLiveMemberM97111G = ((jqm0) m213810E2()).m183411P2().m136879r().m97111G(focusUser);
            if (NullChecker.m82486a(bLiveMemberM97111G) && bLiveVoiceRoomTagInfo != null) {
                l51.m152886F(this.f196919f, new Runnable() { // from class: l.c9o0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f80510a.m115088k4(bLiveVoiceRoomTagInfo);
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
            m115087j4(bLiveVoiceRoomTagInfo.bubble.fromUserId);
        }
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        this.f85800j = -2;
    }
}
