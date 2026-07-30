package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.longlink.msg.liveroom.VoiceUpdateUserMaskProto;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p046p1.mobile.putong.live.livingroom.common.chat.list.ChatListView;
import com.p046p1.mobile.putong.live.livingroom.util.pref.LiveWatchCounter;

/* JADX INFO: loaded from: classes4.dex */
public class ceo0 extends yim0<nnn0> {

    /* JADX INFO: renamed from: q */
    public boolean f80480q;

    public ceo0(jfo0 jfo0Var, ChatListView chatListView) {
        super(jfo0Var, chatListView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z5 */
    public /* synthetic */ void m106338z5(String str) {
        m179314j4("voiceCallApply", null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.rh2
    public void init() {
        super.init();
        if (!LiveWatchCounter.m76330h().m76338m()) {
            m206028F2().BootBubbleEvent.showBubbleByType().mo172463j("voiceChatButtonBubble");
        }
        duringCreated(((nnn0) m206027E2()).m160234E3()).subscribe(ffw.m121193d(new e30() { // from class: l.aeo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f69072a.m106342x5((BLiveUserMask) obj);
            }
        }));
        duringCreated(((nnn0) m206027E2()).m132160q1().m189120l0()).subscribe(ffw.m121193d(new e30() { // from class: l.beo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f75178a.m106343y5((VoiceUpdateUserMaskProto.UserMaskUpdate) obj);
            }
        }));
    }

    @Override // p149l.rh2
    /* JADX INFO: renamed from: p4 */
    public String mo106339p4() {
        return k25.f120691b;
    }

    @Override // p149l.rh2
    /* JADX INFO: renamed from: q4 */
    public String mo106340q4() {
        return "voiceLiveRoom";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.rh2
    /* JADX INFO: renamed from: s4 */
    public boolean mo106341s4() {
        int iM162659B0 = uvr.m196087d().m162659B0();
        boolean z = this.f198521p && iM162659B0 > 0 && ((nnn0) m206027E2()).m160249P2().m102069r().m201357J() >= ((long) iM162659B0);
        if (z) {
            this.f80480q = true;
        }
        return !z;
    }

    @Override // p149l.yim0, p149l.rh2, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().VoiceChatEvent.dismissInviteSpanEvent().m172460g()).observeOn(jo0.m142408a()).filter(new w9j() { // from class: l.ydo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!TextUtils.isEmpty((String) obj));
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.zdo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f202691a.m106338z5((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x5 */
    public final /* synthetic */ void m106342x5(BLiveUserMask bLiveUserMask) {
        ((ChatListView) this.viewModel).m72692N(bLiveUserMask);
    }

    /* JADX INFO: renamed from: y5 */
    public final /* synthetic */ void m106343y5(VoiceUpdateUserMaskProto.UserMaskUpdate userMaskUpdate) {
        ((ChatListView) this.viewModel).m72692N(rxn0.m181617a(userMaskUpdate.getMask()));
    }
}
