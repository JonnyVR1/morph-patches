package p002l;

import android.view.View;
import com.p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p1.mobile.putong.live.base.data.BLiveButtonType;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class lq1 extends yp1 {
    public lq1(bsm bsmVar, BLiveBottomButton bLiveBottomButton) {
        super(bsmVar, 0, bLiveBottomButton);
        this.f23012r = true;
    }

    @Override // p002l.df2
    /* JADX INFO: renamed from: V3 */
    public void mo10610V3(View view) {
        super.mo10610V3(view);
        m11812c4();
    }

    @Override // p002l.df2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo10613X3() {
        return BLiveButtonType.get("firstRechargeStimulus");
    }
}
