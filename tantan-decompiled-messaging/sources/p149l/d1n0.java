package p149l;

import android.content.Intent;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.close.VoiceCloseView;
import com.p046p1.mobile.putong.p065ui.webview.AccessTokenWebViewAct;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct;

/* JADX INFO: loaded from: classes5.dex */
public class d1n0 extends h4t<nnn0, VoiceCloseView> {
    public d1n0(bsm bsmVar, VoiceCloseView voiceCloseView) {
        super(bsmVar);
        mo51532C(voiceCloseView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M3 */
    private void m109648M3(String str) {
        Act act;
        ((nnn0) m206027E2()).m160252Q3(true);
        boolean zM214201l = ycp0.m214190d().m214201l(new lqi<>((nnn0) m206027E2(), m129308n3(), (String) m129297F3(new ghc0(3400)), str));
        ((nnn0) m206027E2()).m132119b2(zM214201l);
        if (!zM214201l || (act = this.f188513f) == null || act.isDestroyed() || this.f188513f.isFinishing()) {
            return;
        }
        this.f188513f.m66873d2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N3 */
    public /* synthetic */ void m109649N3(z0n0 z0n0Var) {
        m109653S3(z0n0Var.f201004a, z0n0Var.f201005b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O3 */
    public /* synthetic */ Boolean m109650O3(o6f o6fVar) {
        return Boolean.valueOf(((nnn0) m206027E2()).m132109Y0());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m109651P3(BLiveVoiceCall bLiveVoiceCall) {
        ((VoiceCloseView) this.viewModel).setCollapseView(((nnn0) m206027E2()).mo149813j().liveMode);
    }

    /* JADX INFO: renamed from: R3 */
    public void m109652R3() {
        m206028F2().FragProxyEvent.clickClose().m172467p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S3 */
    public void m109653S3(boolean z, String str) {
        if (((nnn0) m206027E2()).m149816m().m137794a() != 0) {
            if (((nnn0) m206027E2()).m132143k0() == null && vdt.m198092b(3)) {
                return;
            }
            m109648M3(str);
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m206028F2().VoiceCloseEvent.showFloatWindow().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.b1n0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f72612a.m109649N3((z0n0) obj);
            }
        }));
        m129301d3(o6f.class, new w9j() { // from class: l.c1n0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f78288a.m109650O3((o6f) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T3 */
    public void m109654T3() {
        m109653S3(true, "click_left_top_button");
    }

    /* JADX INFO: renamed from: U3 */
    public void m109655U3() {
        m206028F2().VoiceTopMenuEvent.showTopMenu().m172467p();
    }

    /* JADX INFO: renamed from: W3 */
    public void m109657W3() {
        m109660Z3();
        m206028F2().VoiceVirtualLiveEvent.openSharePanelDialog().m172467p();
    }

    /* JADX INFO: renamed from: X3 */
    public void m109658X3() {
        Intent intent = new Intent(act(), (Class<?>) AccessTokenWebViewAct.class);
        intent.putExtra("url", ddv.f85675y);
        intent.putExtra("hideNavigationBar", true);
        act().startActivity(intent);
    }

    /* JADX INFO: renamed from: Y3 */
    public void m109659Y3() {
        Intent intent = new Intent(this.f188513f, (Class<?>) MkWebViewAct.class);
        intent.putExtra("url", ddv.f85672v);
        intent.putExtra("title", ypv.f199497e.getString(R$string.f47126ac));
        intent.putExtra("hideNavigationBar", true);
        this.f188513f.startActivity(intent);
        ((VoiceCloseView) this.viewModel).m78115p0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z3 */
    public void m109660Z3() {
        String str;
        if (((nnn0) m206027E2()).mo97490p()) {
            str = "anchor";
        } else {
            str = alk0.m97309h(((nnn0) m206027E2()).m160261Y2()) ? "audience_voicechat" : "audience";
        }
        zvf0.m220399u("e_audio_shareroom_button", ((nnn0) m206027E2()).mo97490p() ? "p_anchor_audio_room" : "p_user_audio_room", vwb.m200311Y("anchorId", ((nnn0) m206027E2()).m132146l0().f56011id), vwb.m200311Y("liveId", ((nnn0) m206027E2()).m149814k()), vwb.m200311Y("user_type", str), vwb.m200311Y("voice_template", btl0.m103863c(this.f188512e) ? "karaoke_room" : "normal_room"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        ((VoiceCloseView) this.viewModel).setCollapseView(((nnn0) m206027E2()).mo149813j().liveMode);
        duringCreated(((nnn0) m206027E2()).m160262Z2()).distinctUntilChanged().subscribe(ffw.m121197h(new e30() { // from class: l.a1n0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f67191a.m109651P3((BLiveVoiceCall) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V3 */
    public void m109656V3() {
    }
}
