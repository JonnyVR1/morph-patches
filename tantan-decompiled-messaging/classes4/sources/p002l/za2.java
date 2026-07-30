package p002l;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.PkBottomMenuView;
import com.p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p1.mobile.putong.live.base.data.BLiveButtonType;
import l.e30;
import l.ffw;
import l.soj0;
import l.zvf0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class za2 extends df2<PkBottomMenuView> {
    public za2(bsm bsmVar, BLiveBottomButton bLiveBottomButton) {
        super(bsmVar, t6c0.f19640P4, bLiveBottomButton);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public /* synthetic */ void m27147k4(soj0 soj0Var) {
        m27150n4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l4 */
    public /* synthetic */ void m27148l4(soj0 soj0Var) {
        m27151o4();
    }

    @Override // p002l.df2
    /* JADX INFO: renamed from: T */
    public void mo10607T() {
        super.mo10607T();
        duringCreated((c) m25548F2().BottomEvent.startPkAnim().g()).subscribe(ffw.d(new e30() { // from class: l.xa2
            public final void call(Object obj) {
                this.f22192a.m27147k4((soj0) obj);
            }
        }));
        duringCreated((c) m25548F2().BottomEvent.stopPkAnim().g()).subscribe(ffw.d(new e30() { // from class: l.ya2
            public final void call(Object obj) {
                this.f22751a.m27148l4((soj0) obj);
            }
        }));
    }

    @Override // p002l.df2
    /* JADX INFO: renamed from: V3 */
    public void mo10610V3(View view) {
        super.mo10610V3(view);
        m25548F2().LivePkEvent.clickBottomPkIcon().p();
        zvf0.r("e_pk_button", mo21430R2());
    }

    @Override // p002l.df2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo10613X3() {
        return BLiveButtonType.get("pkButton");
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
        zvf0.x("e_pk_button", mo21430R2());
    }

    /* JADX INFO: renamed from: n4 */
    public void m27150n4() {
        ((PkBottomMenuView) this.f9196k).m5660b();
    }

    /* JADX INFO: renamed from: o4 */
    public void m27151o4() {
        ((PkBottomMenuView) this.f9196k).m5661c();
    }
}
