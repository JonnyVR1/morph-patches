package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.common.chat.list.ChatListView;
import com.p1.mobile.longlink.msg.liveroom.VoiceUpdateUserMaskProto;
import com.p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p1.mobile.putong.live.livingroom.util.pref.LiveWatchCounter;
import l.bwr;
import l.e30;
import l.ffw;
import l.jfo0;
import l.jo0;
import l.nnn0;
import l.rxn0;
import l.uvr;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ceo0 extends yim0<nnn0> {

    /* JADX INFO: renamed from: q */
    public boolean f8617q;

    public ceo0(jfo0 jfo0Var, ChatListView chatListView) {
        super(jfo0Var, chatListView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z5 */
    public /* synthetic */ void m10951z5(String str) {
        m21979j4("voiceCallApply", null);
    }

    @Override // p002l.rh2
    public void init() {
        super.init();
        if (!LiveWatchCounter.h().m()) {
            m25548F2().BootBubbleEvent.showBubbleByType().j("voiceChatButtonBubble");
        }
        duringCreated(((nnn0) m25547E2()).E3()).subscribe(ffw.d(new e30() { // from class: l.aeo0
            public final void call(Object obj) {
                this.f7523a.m10956x5((BLiveUserMask) obj);
            }
        }));
        duringCreated(((nnn0) m25547E2()).m14596q1().l0()).subscribe(ffw.d(new e30() { // from class: l.beo0
            public final void call(Object obj) {
                this.f8096a.m10957y5((VoiceUpdateUserMaskProto.UserMaskUpdate) obj);
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
            this.f8617q = true;
        }
        return !z;
    }

    @Override // p002l.yim0, p002l.rh2
    /* JADX INFO: renamed from: t */
    public void mo10955t() {
        super.mo10955t();
        duringCreated((c) m25548F2().VoiceChatEvent.dismissInviteSpanEvent().g()).observeOn(jo0.a()).filter(new w9j() { // from class: l.ydo0
            public final Object call(Object obj) {
                return Boolean.valueOf(!TextUtils.isEmpty((String) obj));
            }
        }).subscribe(ffw.d(new e30() { // from class: l.zdo0
            public final void call(Object obj) {
                this.f23349a.m10951z5((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x5 */
    public final /* synthetic */ void m10956x5(BLiveUserMask bLiveUserMask) {
        ((ChatListView) ((bwr) this).viewModel).m6195N(bLiveUserMask);
    }

    /* JADX INFO: renamed from: y5 */
    public final /* synthetic */ void m10957y5(VoiceUpdateUserMaskProto.UserMaskUpdate userMaskUpdate) {
        ((ChatListView) ((bwr) this).viewModel).m6195N(rxn0.a(userMaskUpdate.getMask()));
    }
}
