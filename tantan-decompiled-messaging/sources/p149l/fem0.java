package p149l;

import android.content.Intent;
import com.p046p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import com.p046p1.mobile.putong.p065ui.webview.AccessTokenWebViewAct;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class fem0 extends h4t<fcm0, evo0> {
    public fem0(bsm<fcm0> bsmVar) {
        super(bsmVar);
        mo51532C(new evo0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O3 */
    public /* synthetic */ void m121046O3(soj0 soj0Var) {
        m121055U3();
    }

    /* JADX INFO: renamed from: K3 */
    public void m121047K3() {
        w8n0.m202192f().m202199j(act(), m206028F2(), 3);
    }

    /* JADX INFO: renamed from: L3 */
    public void m121048L3() {
        w8n0.m202192f().m202199j(act(), m206028F2(), 2);
    }

    /* JADX INFO: renamed from: M3 */
    public void m121049M3() {
        w8n0.m202192f().m202199j(act(), m206028F2(), 1);
    }

    /* JADX INFO: renamed from: N3 */
    public void m121050N3() {
        m206028F2().LivePusherEvent.closeLive().m172467p();
    }

    /* JADX INFO: renamed from: P3 */
    public void m121051P3() {
        m206028F2().VoiceCloseEvent.showFloatWindow().mo172463j(new z0n0(true, "click_collapse_button"));
    }

    /* JADX INFO: renamed from: S3 */
    public void m121053S3() {
        m206028F2().VoiceLiveManagerEvent.openManagerInviteDialog().mo172463j(Boolean.TRUE);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m129304h3(m206028F2().VoiceTopMenuEvent.showTopMenu(), new e30() { // from class: l.eem0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f90753a.m121046O3((soj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: U3 */
    public void m121055U3() {
        List<BLiveCommonViewConfig> listM195841g6 = ypv.m215672k().m195841g6();
        if (vwb.m200296J(listM195841g6)) {
            return;
        }
        ((evo0) this.viewModel).m118307i(listM195841g6);
    }

    /* JADX INFO: renamed from: V3 */
    public void m121056V3() {
        w8n0.m202192f().m202199j(act(), m206028F2(), 4);
    }

    /* JADX INFO: renamed from: X3 */
    public void m121058X3() {
        Intent intent = new Intent(act(), (Class<?>) AccessTokenWebViewAct.class);
        intent.putExtra("url", ddv.f85675y);
        intent.putExtra("hideNavigationBar", true);
        act().startActivity(intent);
    }

    /* JADX INFO: renamed from: R3 */
    public void m121052R3() {
    }

    /* JADX INFO: renamed from: T3 */
    public void m121054T3() {
    }

    /* JADX INFO: renamed from: W3 */
    public void m121057W3() {
    }
}
