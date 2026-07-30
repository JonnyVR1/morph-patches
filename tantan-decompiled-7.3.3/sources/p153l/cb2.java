package p153l;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p051p1.mobile.putong.live.livingroom.archi.motion.MotionType;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.PkBottomMenuView;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class cb2 extends kf2<PkBottomMenuView> {
    public cb2(dum dumVar, BLiveBottomButton bLiveBottomButton) {
        super(dumVar, yec0.f198876P4, bLiveBottomButton);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public /* synthetic */ void m108589k4(vxj0 vxj0Var) {
        m108593n4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l4 */
    public /* synthetic */ void m108590l4(vxj0 vxj0Var) {
        m108594o4();
    }

    @Override // p153l.kf2, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m213811F2().BottomEvent.startPkAnim().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.ab2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f69195a.m108589k4((vxj0) obj);
            }
        }));
        duringCreated(m213811F2().BottomEvent.stopPkAnim().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.bb2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f75767a.m108590l4((vxj0) obj);
            }
        }));
    }

    @Override // p153l.kf2
    /* JADX INFO: renamed from: V3 */
    public void mo96798V3(View view) {
        super.mo96798V3(view);
        if (this.f196918e.f90824j.m209548L3(MotionType.multi_call)) {
            Boolean bool = (Boolean) m138856F3(new ss10(800).m187670e(zrv.f205799a.m207631D0()));
            Boolean bool2 = (Boolean) m138856F3(new ts10(800));
            if (bool.booleanValue() && bool2.booleanValue()) {
                m213811F2().MultiCallEvent.clickPkOver().mo199273j((List) m138856F3(new at10(800)));
            } else if (bool2.booleanValue()) {
                o1j0.m165651y("正在PK中，请稍后再试");
            } else {
                m213811F2().MultiCallEvent.clickBottomPkIcon().m199277p();
            }
        }
    }

    @Override // p153l.kf2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo96799X3() {
        return BLiveButtonType.get(BLiveButtonType.multiCallPkButton);
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
        m213811F2().BootBubbleEvent.showBubbleById().mo199273j("301");
    }

    /* JADX INFO: renamed from: n4 */
    public void m108593n4() {
        ((PkBottomMenuView) this.f126232k).m73370b();
    }

    /* JADX INFO: renamed from: o4 */
    public void m108594o4() {
        ((PkBottomMenuView) this.f126232k).m73371c();
    }
}
