package p002l;

import android.view.View;
import com.p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p1.mobile.putong.live.base.data.BLiveButtonType;
import l.d30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class mq1 extends yp1 {

    /* JADX INFO: renamed from: s */
    public final joi f15559s;

    public mq1(bsm bsmVar, BLiveBottomButton bLiveBottomButton) {
        super(bsmVar, 0, bLiveBottomButton);
        this.f15559s = (joi) z2(new joi(this.f22036e, this));
    }

    @Override // p002l.df2
    /* JADX INFO: renamed from: V3 */
    public void mo10610V3(View view) {
        super.mo10610V3(view);
        m25548F2().BootBubbleEvent.dismissBubble().j("firstRechargeBubble");
        d30 d30Var = this.f15559s.f13890j;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    @Override // p002l.df2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo10613X3() {
        return BLiveButtonType.get("firstRechargeButton");
    }

    /* JADX INFO: renamed from: t */
    public void m18131t() {
        super.t();
        this.f15559s.m16061b4();
    }
}
