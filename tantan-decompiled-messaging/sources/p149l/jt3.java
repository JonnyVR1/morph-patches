package p149l;

import android.view.View;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.BottomItemView;
import com.p046p1.mobile.putong.live.livingroom.common.signin.SignInEvent;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class jt3 extends mz0 {
    public jt3(bsm bsmVar, BLiveBottomButton bLiveBottomButton, int i, int i2, String str, String str2) {
        super(bsmVar, bLiveBottomButton, i, i2, str, 0, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q4 */
    public /* synthetic */ void m143075q4(soj0 soj0Var) {
        m143078s4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r4 */
    public /* synthetic */ void m143076r4(soj0 soj0Var) {
        m143077t4();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: t4 */
    private void m143077t4() {
        HashMap map = new HashMap();
        map.put("anchor_id", m206027E2().m132146l0().f56011id);
        map.put("live_id", m206027E2().mo149813j().f44323id);
        zvf0.m220403y("e_live_sign_tips_button", "p_user_live_room", map);
    }

    @Override // p149l.df2, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m206028F2().BottomEvent.clearSignRedPoint().m172462i(true)).subscribe(ffw.m121193d(new e30() { // from class: l.ht3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f109363a.m143075q4((soj0) obj);
            }
        }));
        duringCreated(m206028F2().BottomEvent.onSettingDialogShow().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.it3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f114818a.m143076r4((soj0) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2, l.lh20] */
    @Override // p149l.i80, p149l.df2
    /* JADX INFO: renamed from: V3 */
    public void mo103804V3(View view) {
        super.mo103804V3(view);
        m206028F2().SignInEvent.showSignDialog().mo172463j(new SignInEvent.C12768a().m73137c("tips_button").m73136b(SignInEvent.Page.MAIN).m73135a());
        HashMap map = new HashMap();
        map.put("anchor_id", m206027E2().m132146l0().f56011id);
        map.put("live_id", m206027E2().mo149813j().f44323id);
        zvf0.m220397s("e_live_sign_tips_button", "p_user_live_room", map);
    }

    @Override // p149l.df2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo103807X3() {
        return BLiveButtonType.get(BLiveButtonType.signIn);
    }

    /* JADX INFO: renamed from: s4 */
    public final void m143078s4() {
        V v2 = this.f85887k;
        if (v2 != 0) {
            ((BottomItemView) v2).mo72138g0(false);
        }
        m206028F2().BottomEvent.onClearSignRedDot().m172467p();
        m206028F2().BottomEvent.refreshSettingButtonRedDot().m172467p();
    }
}
