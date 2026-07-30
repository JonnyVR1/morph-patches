package p153l;

import android.view.View;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.BottomItemView;
import com.p051p1.mobile.putong.live.livingroom.common.signin.SignInEvent;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class iu3 extends tz0 {
    public iu3(dum dumVar, BLiveBottomButton bLiveBottomButton, int i, int i2, String str, String str2) {
        super(dumVar, bLiveBottomButton, i, i2, str, 0, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q4 */
    public /* synthetic */ void m142135q4(vxj0 vxj0Var) {
        m142138s4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r4 */
    public /* synthetic */ void m142136r4(vxj0 vxj0Var) {
        m142137t4();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: t4 */
    private void m142137t4() {
        HashMap map = new HashMap();
        map.put("anchor_id", m213810E2().m168532l0().f56859id);
        map.put("live_id", m213810E2().mo183435j().f45171id);
        i4g0.m138527y("e_live_sign_tips_button", "p_user_live_room", map);
    }

    @Override // p153l.kf2, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m213811F2().BottomEvent.clearSignRedPoint().m199272i(true)).subscribe(dhw.m115825d(new y20() { // from class: l.gu3
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f106463a.m142135q4((vxj0) obj);
            }
        }));
        duringCreated(m213811F2().BottomEvent.onSettingDialogShow().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.hu3
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f111614a.m142136r4((vxj0) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.oo2, l.vp20] */
    @Override // p153l.e80, p153l.kf2
    /* JADX INFO: renamed from: V3 */
    public void mo96798V3(View view) {
        super.mo96798V3(view);
        m213811F2().SignInEvent.showSignDialog().mo199273j(new SignInEvent.C12931a().m74320c("tips_button").m74319b(SignInEvent.Page.MAIN).m74318a());
        HashMap map = new HashMap();
        map.put("anchor_id", m213810E2().m168532l0().f56859id);
        map.put("live_id", m213810E2().mo183435j().f45171id);
        i4g0.m138521s("e_live_sign_tips_button", "p_user_live_room", map);
    }

    @Override // p153l.kf2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo96799X3() {
        return BLiveButtonType.get(BLiveButtonType.signIn);
    }

    /* JADX INFO: renamed from: s4 */
    public final void m142138s4() {
        V v2 = this.f126232k;
        if (v2 != 0) {
            ((BottomItemView) v2).mo73321g0(false);
        }
        m213811F2().BottomEvent.onClearSignRedDot().m199277p();
        m213811F2().BottomEvent.refreshSettingButtonRedDot().m199277p();
    }
}
