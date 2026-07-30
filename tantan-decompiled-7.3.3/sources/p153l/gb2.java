package p153l;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.PkBottomMenuView;

/* JADX INFO: loaded from: classes4.dex */
public class gb2 extends kf2<PkBottomMenuView> {
    public gb2(dum dumVar, BLiveBottomButton bLiveBottomButton) {
        super(dumVar, yec0.f198876P4, bLiveBottomButton);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public /* synthetic */ void m129756k4(vxj0 vxj0Var) {
        m129759n4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l4 */
    public /* synthetic */ void m129757l4(vxj0 vxj0Var) {
        m129760o4();
    }

    @Override // p153l.kf2, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m213811F2().BottomEvent.startPkAnim().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.eb2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f92825a.m129756k4((vxj0) obj);
            }
        }));
        duringCreated(m213811F2().BottomEvent.stopPkAnim().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.fb2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f98033a.m129757l4((vxj0) obj);
            }
        }));
    }

    @Override // p153l.kf2
    /* JADX INFO: renamed from: V3 */
    public void mo96798V3(View view) {
        super.mo96798V3(view);
        m213811F2().LivePkEvent.clickBottomPkIcon().m199277p();
        i4g0.m138520r("e_pk_button", mo78457R2());
    }

    @Override // p153l.kf2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo96799X3() {
        return BLiveButtonType.get(BLiveButtonType.pkButton);
    }

    @Override // p153l.kf2
    /* JADX INFO: renamed from: m4, reason: merged with bridge method [inline-methods] */
    public void mo108591d4(PkBottomMenuView pkBottomMenuView) {
        super.mo108591d4(pkBottomMenuView);
        pkBottomMenuView.setLayoutParams(new LinearLayout.LayoutParams(kf2.f126229o, kf2.f126230p));
        String strMo119793Z3 = mo119793Z3();
        if (!TextUtils.isEmpty(strMo119793Z3)) {
            pkBottomMenuView.setIcon(strMo119793Z3);
        } else if (this.f126233l.fillUp) {
            pkBottomMenuView.setIcon(obc0.f146356h6);
            pkBottomMenuView.setPkBackGround(true);
        } else {
            pkBottomMenuView.setIcon(obc0.f146344g6);
            pkBottomMenuView.setPkBackGround(false);
        }
        i4g0.m138526x("e_pk_button", mo78457R2());
    }

    /* JADX INFO: renamed from: n4 */
    public void m129759n4() {
        ((PkBottomMenuView) this.f126232k).m73370b();
    }

    /* JADX INFO: renamed from: o4 */
    public void m129760o4() {
        ((PkBottomMenuView) this.f126232k).m73371c();
    }
}
