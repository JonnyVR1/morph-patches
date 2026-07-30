package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatBottomView;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes5.dex */
public class cb3 extends h4t<ho2, VoiceChatBottomView> {
    public cb3(bsm bsmVar, VoiceChatBottomView voiceChatBottomView) {
        super(bsmVar);
        mo51532C(voiceChatBottomView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M3 */
    public /* synthetic */ void m105966M3(BLiveVoiceCall bLiveVoiceCall) {
        ((VoiceChatBottomView) this.viewModel).m77985f(!alk0.m97309h(bLiveVoiceCall));
    }

    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ AbstractC16991g4.a m105967L3(hf3.C17296c c17296c) {
        return new AbstractC16991g4.a(((VoiceChatBottomView) this.viewModel).getBubbleHookedView());
    }

    /* JADX INFO: renamed from: N3 */
    public void m105968N3() {
        m206028F2().VoiceChatEvent.chatEmojiVisibleEvent().mo172463j(Boolean.TRUE);
        if (NullChecker.m81303a(this.f188512e) && NullChecker.m81303a(this.f188512e.f77102h)) {
            zvf0.m220399u("e_audio_chat_sticker_button", mo77274R2(), vwb.m200311Y("anchorId", this.f188512e.f77102h.m132140j0()), vwb.m200311Y("liveId", this.f188512e.f77102h.m149814k()), vwb.m200311Y("roomId", this.f188512e.f77102h.m149818o()));
        }
    }

    /* JADX INFO: renamed from: O3 */
    public void m105969O3() {
        m206028F2().ChatEvent.chatInputClick().mo172463j(new wu4(false, "").m205592b("0"));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m129301d3(hf3.C17296c.class, new w9j() { // from class: l.bb3
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f74762a.m105967L3((hf3.C17296c) obj);
            }
        });
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        ((VoiceChatBottomView) this.viewModel).m77985f(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        ((VoiceChatBottomView) this.viewModel).m77985f(true);
        if (!(m206027E2() instanceof nnn0) || vdt.m198092b(3)) {
            return;
        }
        duringCreated(((nnn0) m206027E2()).m160262Z2()).subscribe(ffw.m121197h(new e30() { // from class: l.ab3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f68620a.m105966M3((BLiveVoiceCall) obj);
            }
        }));
    }
}
