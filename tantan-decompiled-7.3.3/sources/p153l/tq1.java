package p153l;

import android.view.View;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;

/* JADX INFO: loaded from: classes4.dex */
public class tq1 extends fq1 {

    /* JADX INFO: renamed from: s */
    public final fri f175669s;

    public tq1(dum dumVar, BLiveBottomButton bLiveBottomButton) {
        super(dumVar, 0, bLiveBottomButton);
        this.f175669s = (fri) m153103z2(new fri(this.f196918e, this));
    }

    @Override // p153l.kf2
    /* JADX INFO: renamed from: V3 */
    public void mo96798V3(View view) {
        super.mo96798V3(view);
        m213811F2().BootBubbleEvent.dismissBubble().mo199273j("firstRechargeBubble");
        x20 x20Var = this.f175669s.f100428j;
        if (x20Var != null) {
            x20Var.call();
        }
    }

    @Override // p153l.kf2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo96799X3() {
        return BLiveButtonType.get("firstRechargeButton");
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        this.f175669s.m126945b4();
    }
}
