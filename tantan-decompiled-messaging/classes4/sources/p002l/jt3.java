package p002l;

import android.view.View;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.BottomItemView;
import com.p000p1.mobile.putong.live.livingroom.common.signin.SignInEvent;
import com.p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p1.mobile.putong.live.base.data.BLiveButtonType;
import com.tantanapp.common.data.DbObject;
import java.util.HashMap;
import l.e30;
import l.ffw;
import l.soj0;
import l.zvf0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class jt3 extends mz0 {
    public jt3(bsm bsmVar, BLiveBottomButton bLiveBottomButton, int i, int i2, String str, String str2) {
        super(bsmVar, bLiveBottomButton, i, i2, str, 0, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q4 */
    public /* synthetic */ void m16216q4(soj0 soj0Var) {
        m16219s4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r4 */
    public /* synthetic */ void m16217r4(soj0 soj0Var) {
        m16218t4();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: t4 */
    private void m16218t4() {
        HashMap map = new HashMap();
        map.put("anchor_id", ((DbObject) m25547E2().m14582l0()).id);
        map.put("live_id", m25547E2().m17234j().id);
        zvf0.y("e_live_sign_tips_button", "p_user_live_room", map);
    }

    @Override // p002l.df2
    /* JADX INFO: renamed from: T */
    public void mo10607T() {
        super.mo10607T();
        duringCreated((c) m25548F2().BottomEvent.clearSignRedPoint().i(true)).subscribe(ffw.d(new e30() { // from class: l.ht3
            public final void call(Object obj) {
                this.f12265a.m16216q4((soj0) obj);
            }
        }));
        duringCreated((c) m25548F2().BottomEvent.onSettingDialogShow().g()).subscribe(ffw.d(new e30() { // from class: l.it3
            public final void call(Object obj) {
                this.f13404a.m16217r4((soj0) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2, l.lh20] */
    @Override // p002l.i80, p002l.df2
    /* JADX INFO: renamed from: V3 */
    public void mo10610V3(View view) {
        super.mo10610V3(view);
        m25548F2().SignInEvent.showSignDialog().j(new SignInEvent.C0357a().m6665c("tips_button").m6664b(SignInEvent.Page.MAIN).m6663a());
        HashMap map = new HashMap();
        map.put("anchor_id", ((DbObject) m25547E2().m14582l0()).id);
        map.put("live_id", m25547E2().m17234j().id);
        zvf0.s("e_live_sign_tips_button", "p_user_live_room", map);
    }

    @Override // p002l.df2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo10613X3() {
        return BLiveButtonType.get("signIn");
    }

    /* JADX INFO: renamed from: s4 */
    public final void m16219s4() {
        V v = this.f9196k;
        if (v != 0) {
            ((BottomItemView) v).mo5611g0(false);
        }
        m25548F2().BottomEvent.onClearSignRedDot().p();
        m25548F2().BottomEvent.refreshSettingButtonRedDot().p();
    }
}
