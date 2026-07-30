package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatBottomView;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes5.dex */
public class rb3 extends i6t<oo2, VoiceChatBottomView> {
    public rb3(dum dumVar, VoiceChatBottomView voiceChatBottomView) {
        super(dumVar);
        mo52715C(voiceChatBottomView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M3 */
    public /* synthetic */ void m180726M3(BLiveVoiceCall bLiveVoiceCall) {
        ((VoiceChatBottomView) this.viewModel).m79168f(!guk0.m132329h(bLiveVoiceCall));
    }

    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ AbstractC17128g4.a m180727L3(vf3.C20827c c20827c) {
        return new AbstractC17128g4.a(((VoiceChatBottomView) this.viewModel).getBubbleHookedView());
    }

    /* JADX INFO: renamed from: N3 */
    public void m180728N3() {
        m213811F2().VoiceChatEvent.chatEmojiVisibleEvent().mo199273j(Boolean.TRUE);
        if (NullChecker.m82486a(this.f196918e) && NullChecker.m82486a(this.f196918e.f90822h)) {
            i4g0.m138523u("e_audio_chat_sticker_button", mo78457R2(), jyb.m147494Y("anchorId", this.f196918e.f90822h.m168526j0()), jyb.m147494Y("liveId", this.f196918e.f90822h.m202191k()), jyb.m147494Y("roomId", this.f196918e.f90822h.m202194o()));
        }
    }

    /* JADX INFO: renamed from: O3 */
    public void m180729O3() {
        m213811F2().ChatEvent.chatInputClick().mo199273j(new vv4(false, "").m202992b("0"));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m138860d3(vf3.C20827c.class, new qcj() { // from class: l.qb3
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f156451a.m180727L3((vf3.C20827c) obj);
            }
        });
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        ((VoiceChatBottomView) this.viewModel).m79168f(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        ((VoiceChatBottomView) this.viewModel).m79168f(true);
        if (!(m213810E2() instanceof rwn0) || wft.m206159b(3)) {
            return;
        }
        duringCreated(((rwn0) m213810E2()).m183424Z2()).subscribe(dhw.m115829h(new y20() { // from class: l.pb3
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f151344a.m180726M3((BLiveVoiceCall) obj);
            }
        }));
    }
}
