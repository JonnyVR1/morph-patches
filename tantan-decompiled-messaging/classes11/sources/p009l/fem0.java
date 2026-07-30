package p009l;

import android.content.Context;
import android.content.Intent;
import com.p000p1.mobile.putong.p004ui.webview.AccessTokenWebViewAct;
import com.p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import java.util.List;
import l.bsm;
import l.bwr;
import l.ddv;
import l.e30;
import l.fcm0;
import l.h4t;
import l.soj0;
import l.vwb;
import l.w8n0;
import l.z0n0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class fem0 extends h4t<fcm0, evo0> {
    public fem0(bsm<fcm0> bsmVar) {
        super(bsmVar);
        C(new evo0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O3 */
    public /* synthetic */ void m14414O3(soj0 soj0Var) {
        m14424U3();
    }

    /* JADX INFO: renamed from: K3 */
    public void m14415K3() {
        w8n0.f().j(act(), F2(), 3);
    }

    /* JADX INFO: renamed from: L3 */
    public void m14416L3() {
        w8n0.f().j(act(), F2(), 2);
    }

    /* JADX INFO: renamed from: M3 */
    public void m14417M3() {
        w8n0.f().j(act(), F2(), 1);
    }

    /* JADX INFO: renamed from: N3 */
    public void m14418N3() {
        F2().LivePusherEvent.closeLive().p();
    }

    /* JADX INFO: renamed from: P3 */
    public void m14419P3() {
        F2().VoiceCloseEvent.showFloatWindow().j(new z0n0(true, "click_collapse_button"));
    }

    /* JADX INFO: renamed from: S3 */
    public void m14421S3() {
        F2().VoiceLiveManagerEvent.openManagerInviteDialog().j(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: T */
    public void m14422T() {
        super/*l.k4t*/.T();
        h3(F2().VoiceTopMenuEvent.showTopMenu(), new e30() { // from class: l.eem0
            public final void call(Object obj) {
                this.f12526a.m14414O3((soj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: U3 */
    public void m14424U3() {
        List<BLiveCommonViewConfig> listG6 = ypv.m25490k().g6();
        if (vwb.J(listG6)) {
            return;
        }
        ((evo0) ((bwr) this).viewModel).m14112i(listG6);
    }

    /* JADX INFO: renamed from: V3 */
    public void m14425V3() {
        w8n0.f().j(act(), F2(), 4);
    }

    /* JADX INFO: renamed from: X3 */
    public void m14427X3() {
        Intent intent = new Intent((Context) act(), (Class<?>) AccessTokenWebViewAct.class);
        intent.putExtra("url", ddv.y);
        intent.putExtra("hideNavigationBar", true);
        act().startActivity(intent);
    }

    /* JADX INFO: renamed from: R3 */
    public void m14420R3() {
    }

    /* JADX INFO: renamed from: T3 */
    public void m14423T3() {
    }

    /* JADX INFO: renamed from: W3 */
    public void m14426W3() {
    }
}
