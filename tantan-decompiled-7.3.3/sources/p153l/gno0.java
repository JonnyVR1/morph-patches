package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.longlink.msg.liveroom.VoiceUpdateUserMaskProto;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p051p1.mobile.putong.live.livingroom.common.chat.list.ChatListView;
import com.p051p1.mobile.putong.live.livingroom.util.pref.LiveWatchCounter;

/* JADX INFO: loaded from: classes4.dex */
public class gno0 extends csm0<rwn0> {

    /* JADX INFO: renamed from: q */
    public boolean f105127q;

    public gno0(noo0 noo0Var, ChatListView chatListView) {
        super(noo0Var, chatListView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z5 */
    public /* synthetic */ void m130932z5(String str) {
        m215925j4("voiceCallApply", null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.yh2
    public void init() {
        super.init();
        if (!LiveWatchCounter.m77513h().m77521m()) {
            m213811F2().BootBubbleEvent.showBubbleByType().mo199273j("voiceChatButtonBubble");
        }
        duringCreated(((rwn0) m213810E2()).m183396E3()).subscribe(dhw.m115825d(new y20() { // from class: l.eno0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f94800a.m130936x5((BLiveUserMask) obj);
            }
        }));
        duringCreated(((rwn0) m213810E2()).m168545q1().m98302l0()).subscribe(dhw.m115825d(new y20() { // from class: l.fno0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f99939a.m130937y5((VoiceUpdateUserMaskProto.UserMaskUpdate) obj);
            }
        }));
    }

    @Override // p153l.yh2
    /* JADX INFO: renamed from: p4 */
    public String mo130933p4() {
        return j35.f118152b;
    }

    @Override // p153l.yh2
    /* JADX INFO: renamed from: q4 */
    public String mo130934q4() {
        return "voiceLiveRoom";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.yh2
    /* JADX INFO: renamed from: s4 */
    public boolean mo130935s4() {
        int iM170966B0 = vxr.m203876d().m170966B0();
        boolean z = this.f83467p && iM170966B0 > 0 && ((rwn0) m213810E2()).m183411P2().m136879r().m97114J() >= ((long) iM170966B0);
        if (z) {
            this.f105127q = true;
        }
        return !z;
    }

    @Override // p153l.csm0, p153l.yh2, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().VoiceChatEvent.dismissInviteSpanEvent().m199270g()).observeOn(fo0.m126432a()).filter(new qcj() { // from class: l.cno0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!TextUtils.isEmpty((String) obj));
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.dno0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f89818a.m130932z5((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x5 */
    public final /* synthetic */ void m130936x5(BLiveUserMask bLiveUserMask) {
        ((ChatListView) this.viewModel).m73875N(bLiveUserMask);
    }

    /* JADX INFO: renamed from: y5 */
    public final /* synthetic */ void m130937y5(VoiceUpdateUserMaskProto.UserMaskUpdate userMaskUpdate) {
        ((ChatListView) this.viewModel).m73875N(v6o0.m200134a(userMaskUpdate.getMask()));
    }
}
