package p153l;

import android.content.Intent;
import com.p051p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import com.p051p1.mobile.putong.p070ui.webview.AccessTokenWebViewAct;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class jnm0 extends i6t<jlm0, i4p0> {
    public jnm0(dum<jlm0> dumVar) {
        super(dumVar);
        mo52715C(new i4p0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O3 */
    public /* synthetic */ void m146268O3(vxj0 vxj0Var) {
        m146277U3();
    }

    /* JADX INFO: renamed from: K3 */
    public void m146269K3() {
        ain0.m98000f().m98007j(act(), m213811F2(), 3);
    }

    /* JADX INFO: renamed from: L3 */
    public void m146270L3() {
        ain0.m98000f().m98007j(act(), m213811F2(), 2);
    }

    /* JADX INFO: renamed from: M3 */
    public void m146271M3() {
        ain0.m98000f().m98007j(act(), m213811F2(), 1);
    }

    /* JADX INFO: renamed from: N3 */
    public void m146272N3() {
        m213811F2().LivePusherEvent.closeLive().m199277p();
    }

    /* JADX INFO: renamed from: P3 */
    public void m146273P3() {
        m213811F2().VoiceCloseEvent.showFloatWindow().mo199273j(new dan0(true, "click_collapse_button"));
    }

    /* JADX INFO: renamed from: S3 */
    public void m146275S3() {
        m213811F2().VoiceLiveManagerEvent.openManagerInviteDialog().mo199273j(Boolean.TRUE);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m138863h3(m213811F2().VoiceTopMenuEvent.showTopMenu(), new y20() { // from class: l.inm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f115982a.m146268O3((vxj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: U3 */
    public void m146277U3() {
        List<BLiveCommonViewConfig> listM203628g6 = zrv.m221193k().m203628g6();
        if (jyb.m147479J(listM203628g6)) {
            return;
        }
        ((i4p0) this.viewModel).m138579i(listM203628g6);
    }

    /* JADX INFO: renamed from: V3 */
    public void m146278V3() {
        ain0.m98000f().m98007j(act(), m213811F2(), 4);
    }

    /* JADX INFO: renamed from: X3 */
    public void m146280X3() {
        Intent intent = new Intent(act(), (Class<?>) AccessTokenWebViewAct.class);
        intent.putExtra("url", efv.f93868y);
        intent.putExtra("hideNavigationBar", true);
        act().startActivity(intent);
    }

    /* JADX INFO: renamed from: R3 */
    public void m146274R3() {
    }

    /* JADX INFO: renamed from: T3 */
    public void m146276T3() {
    }

    /* JADX INFO: renamed from: W3 */
    public void m146279W3() {
    }
}
