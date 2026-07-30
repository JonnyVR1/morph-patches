package p149l;

import android.view.View;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;

/* JADX INFO: loaded from: classes4.dex */
public class mq1 extends yp1 {

    /* JADX INFO: renamed from: s */
    public final joi f135145s;

    public mq1(bsm bsmVar, BLiveBottomButton bLiveBottomButton) {
        super(bsmVar, 0, bLiveBottomButton);
        this.f135145s = (joi) m144512z2(new joi(this.f188512e, this));
    }

    @Override // p149l.df2
    /* JADX INFO: renamed from: V3 */
    public void mo103804V3(View view) {
        super.mo103804V3(view);
        m206028F2().BootBubbleEvent.dismissBubble().mo172463j("firstRechargeBubble");
        d30 d30Var = this.f135145s.f118982j;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    @Override // p149l.df2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo103807X3() {
        return BLiveButtonType.get("firstRechargeButton");
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        this.f135145s.m142511b4();
    }
}
