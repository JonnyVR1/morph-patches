package p153l;

import android.content.Intent;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.close.VoiceCloseView;
import com.p051p1.mobile.putong.p070ui.webview.AccessTokenWebViewAct;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct;

/* JADX INFO: loaded from: classes5.dex */
public class han0 extends i6t<rwn0, VoiceCloseView> {
    public han0(dum dumVar, VoiceCloseView voiceCloseView) {
        super(dumVar);
        mo52715C(voiceCloseView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M3 */
    private void m134177M3(String str) {
        Act act;
        ((rwn0) m213810E2()).m183414Q3(true);
        boolean zM111310l = cmp0.m111299d().m111310l(new hti<>((rwn0) m213810E2(), m138867n3(), (String) m138856F3(new npc0(3400)), str));
        ((rwn0) m213810E2()).m168505b2(zM111310l);
        if (!zM111310l || (act = this.f196919f) == null || act.isDestroyed() || this.f196919f.isFinishing()) {
            return;
        }
        this.f196919f.m68056e2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N3 */
    public /* synthetic */ void m134178N3(dan0 dan0Var) {
        m134182S3(dan0Var.f85896a, dan0Var.f85897b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O3 */
    public /* synthetic */ Boolean m134179O3(u7f u7fVar) {
        return Boolean.valueOf(((rwn0) m213810E2()).m168495Y0());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m134180P3(BLiveVoiceCall bLiveVoiceCall) {
        ((VoiceCloseView) this.viewModel).setCollapseView(((rwn0) m213810E2()).mo183435j().liveMode);
    }

    /* JADX INFO: renamed from: R3 */
    public void m134181R3() {
        m213811F2().FragProxyEvent.clickClose().m199277p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S3 */
    public void m134182S3(boolean z, String str) {
        if (((rwn0) m213810E2()).m202193m().m146875a() != 0) {
            if (((rwn0) m213810E2()).m168529k0() == null && wft.m206159b(3)) {
                return;
            }
            m134177M3(str);
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m213811F2().VoiceCloseEvent.showFloatWindow().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.fan0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f97992a.m134178N3((dan0) obj);
            }
        }));
        m138860d3(u7f.class, new qcj() { // from class: l.gan0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f103014a.m134179O3((u7f) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T3 */
    public void m134183T3() {
        m134182S3(true, "click_left_top_button");
    }

    /* JADX INFO: renamed from: U3 */
    public void m134184U3() {
        m213811F2().VoiceTopMenuEvent.showTopMenu().m199277p();
    }

    /* JADX INFO: renamed from: W3 */
    public void m134186W3() {
        m134189Z3();
        m213811F2().VoiceVirtualLiveEvent.openSharePanelDialog().m199277p();
    }

    /* JADX INFO: renamed from: X3 */
    public void m134187X3() {
        Intent intent = new Intent(act(), (Class<?>) AccessTokenWebViewAct.class);
        intent.putExtra("url", efv.f93868y);
        intent.putExtra("hideNavigationBar", true);
        act().startActivity(intent);
    }

    /* JADX INFO: renamed from: Y3 */
    public void m134188Y3() {
        Intent intent = new Intent(this.f196919f, (Class<?>) MkWebViewAct.class);
        intent.putExtra("url", efv.f93865v);
        intent.putExtra("title", zrv.f205803e.getString(R$string.f47974ac));
        intent.putExtra("hideNavigationBar", true);
        this.f196919f.startActivity(intent);
        ((VoiceCloseView) this.viewModel).m79298p0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z3 */
    public void m134189Z3() {
        String str;
        if (((rwn0) m213810E2()).mo118373p()) {
            str = "anchor";
        } else {
            str = guk0.m132329h(((rwn0) m213810E2()).m183423Y2()) ? "audience_voicechat" : "audience";
        }
        i4g0.m138523u("e_audio_shareroom_button", ((rwn0) m213810E2()).mo118373p() ? "p_anchor_audio_room" : "p_user_audio_room", jyb.m147494Y("anchorId", ((rwn0) m213810E2()).m168532l0().f56859id), jyb.m147494Y("liveId", ((rwn0) m213810E2()).m202191k()), jyb.m147494Y("user_type", str), jyb.m147494Y("voice_template", f2m0.m123633c(this.f196918e) ? "karaoke_room" : "normal_room"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        ((VoiceCloseView) this.viewModel).setCollapseView(((rwn0) m213810E2()).mo183435j().liveMode);
        duringCreated(((rwn0) m213810E2()).m183424Z2()).distinctUntilChanged().subscribe(dhw.m115829h(new y20() { // from class: l.ean0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f92793a.m134180P3((BLiveVoiceCall) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V3 */
    public void m134185V3() {
    }
}
