package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p000p1.mobile.putong.live.livingroom.common.chat.list.ChatListView;
import com.p1.mobile.longlink.msg.liveroom.VoiceUpdateUserMaskProto;
import com.p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p1.mobile.putong.live.livingroom.util.pref.LiveWatchCounter;
import l.bwr;
import l.e30;
import l.ffw;
import l.jo0;
import l.nnn0;
import l.qqn0;
import l.rxn0;
import l.uvr;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class tmn0 extends yim0<nnn0> {

    /* JADX INFO: renamed from: q */
    public boolean f20306q;

    public tmn0(qqn0 qqn0Var, ChatListView chatListView) {
        super(qqn0Var, chatListView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C5 */
    public /* synthetic */ void m23054C5(final String str) {
        m21979j4("approveChatGroupApply", new w9j() { // from class: l.smn0
            public final Object call(Object obj) {
                return tmn0.m23060x5(str, (LiveMessage) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D5 */
    public /* synthetic */ void m23055D5(String str) {
        m21979j4("createChatGroup", null);
    }

    /* JADX INFO: renamed from: x5 */
    public static /* synthetic */ Boolean m23060x5(String str, LiveMessage liveMessage) {
        LiveMessage.ExtInfo extInfo = liveMessage.extInfo;
        return Boolean.valueOf(extInfo != null && TextUtils.equals(extInfo.voiceChatApplyId, str));
    }

    /* JADX INFO: renamed from: A5 */
    public final /* synthetic */ void m23063A5(BLiveUserMask bLiveUserMask) {
        ((ChatListView) ((bwr) this).viewModel).m6195N(bLiveUserMask);
    }

    /* JADX INFO: renamed from: B5 */
    public final /* synthetic */ void m23064B5(VoiceUpdateUserMaskProto.UserMaskUpdate userMaskUpdate) {
        ((ChatListView) ((bwr) this).viewModel).m6195N(rxn0.a(userMaskUpdate.getMask()));
    }

    @Override // p002l.rh2
    public void init() {
        super.init();
        if (!LiveWatchCounter.h().m()) {
            m25548F2().BootBubbleEvent.showBubbleByType().j("voiceChatButtonBubble");
        }
        duringCreated(((nnn0) m25547E2()).E3()).subscribe(ffw.d(new e30() { // from class: l.mmn0
            public final void call(Object obj) {
                this.f15485a.m23063A5((BLiveUserMask) obj);
            }
        }));
        duringCreated(((nnn0) m25547E2()).m14596q1().l0()).observeOn(jo0.a()).subscribe(ffw.d(new e30() { // from class: l.nmn0
            public final void call(Object obj) {
                this.f16107a.m23064B5((VoiceUpdateUserMaskProto.UserMaskUpdate) obj);
            }
        }));
    }

    @Override // p002l.rh2
    /* JADX INFO: renamed from: p4 */
    public String mo10952p4() {
        return k25.f14173b;
    }

    @Override // p002l.rh2
    /* JADX INFO: renamed from: q4 */
    public String mo10953q4() {
        return "voiceLiveRoom";
    }

    @Override // p002l.rh2
    /* JADX INFO: renamed from: s4 */
    public boolean mo10954s4() {
        int iB0 = uvr.d().B0();
        boolean z = this.f22910p && iB0 > 0 && ((nnn0) m25547E2()).P2().r().J() >= ((long) iB0);
        if (z) {
            this.f20306q = true;
        }
        return !z;
    }

    @Override // p002l.yim0, p002l.rh2
    /* JADX INFO: renamed from: t */
    public void mo10955t() {
        super.mo10955t();
        duringCreated((c) m25548F2().LiveVoiceChatGroupEvent.dismissApproveSpanEvent().g()).observeOn(jo0.a()).filter(new w9j() { // from class: l.omn0
            public final Object call(Object obj) {
                return Boolean.valueOf(!TextUtils.isEmpty((String) obj));
            }
        }).subscribe(ffw.d(new e30() { // from class: l.pmn0
            public final void call(Object obj) {
                this.f17538a.m23054C5((String) obj);
            }
        }));
        duringCreated((c) m25548F2().LiveVoiceChatGroupEvent.dismissCreateGroupSpanEvent().g()).observeOn(jo0.a()).filter(new w9j() { // from class: l.qmn0
            public final Object call(Object obj) {
                return Boolean.valueOf(!TextUtils.isEmpty((String) obj));
            }
        }).subscribe(ffw.d(new e30() { // from class: l.rmn0
            public final void call(Object obj) {
                this.f18611a.m23055D5((String) obj);
            }
        }));
    }
}
