package p002l;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.live.livingroom.archi.motion.MotionType;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.PkBottomMenuView;
import com.p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p1.mobile.putong.live.base.data.BLiveButtonType;
import java.util.List;
import l.e30;
import l.ffw;
import l.ik10;
import l.jk10;
import l.lsi0;
import l.qk10;
import l.soj0;
import l.ypv;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class va2 extends df2<PkBottomMenuView> {
    public va2(bsm bsmVar, BLiveBottomButton bLiveBottomButton) {
        super(bsmVar, t6c0.f19640P4, bLiveBottomButton);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public /* synthetic */ void m23806k4(soj0 soj0Var) {
        m23809n4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l4 */
    public /* synthetic */ void m23807l4(soj0 soj0Var) {
        m23810o4();
    }

    @Override // p002l.df2
    /* JADX INFO: renamed from: T */
    public void mo10607T() {
        super.mo10607T();
        duringCreated((c) m25548F2().BottomEvent.startPkAnim().g()).subscribe(ffw.d(new e30() { // from class: l.ta2
            public final void call(Object obj) {
                this.f20142a.m23806k4((soj0) obj);
            }
        }));
        duringCreated((c) m25548F2().BottomEvent.stopPkAnim().g()).subscribe(ffw.d(new e30() { // from class: l.ua2
            public final void call(Object obj) {
                this.f20561a.m23807l4((soj0) obj);
            }
        }));
    }

    @Override // p002l.df2
    /* JADX INFO: renamed from: V3 */
    public void mo10610V3(View view) {
        super.mo10610V3(view);
        if (this.f22036e.f8341j.m24319L3(MotionType.multi_call)) {
            Boolean bool = (Boolean) m14184F3(new ik10(800).e(ypv.a.D0()));
            Boolean bool2 = (Boolean) m14184F3(new jk10(800));
            if (bool.booleanValue() && bool2.booleanValue()) {
                m25548F2().MultiCallEvent.clickPkOver().j((List) m14184F3(new qk10(800)));
            } else if (bool2.booleanValue()) {
                lsi0.y("正在PK中，请稍后再试");
            } else {
                m25548F2().MultiCallEvent.clickBottomPkIcon().p();
            }
        }
    }

    @Override // p002l.df2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo10613X3() {
        return BLiveButtonType.get("multiCallPkButton");
    }

    @Override // p002l.df2
    /* JADX INFO: renamed from: m4, reason: merged with bridge method [inline-methods] */
    public void mo11312d4(PkBottomMenuView pkBottomMenuView) {
        super.mo11312d4(pkBottomMenuView);
        pkBottomMenuView.setLayoutParams(new LinearLayout.LayoutParams(df2.f9193o, df2.f9194p));
        String strMo11809Z3 = mo11809Z3();
        if (!TextUtils.isEmpty(strMo11809Z3)) {
            pkBottomMenuView.setIcon(strMo11809Z3);
        } else if (this.f9197l.fillUp) {
            pkBottomMenuView.setIcon(i3c0.f12813h6);
            pkBottomMenuView.setPkBackGround(true);
        } else {
            pkBottomMenuView.setIcon(i3c0.f12801g6);
            pkBottomMenuView.setPkBackGround(false);
        }
        m25548F2().BootBubbleEvent.showBubbleById().j("301");
    }

    /* JADX INFO: renamed from: n4 */
    public void m23809n4() {
        ((PkBottomMenuView) this.f9196k).m5660b();
    }

    /* JADX INFO: renamed from: o4 */
    public void m23810o4() {
        ((PkBottomMenuView) this.f9196k).m5661c();
    }
}
