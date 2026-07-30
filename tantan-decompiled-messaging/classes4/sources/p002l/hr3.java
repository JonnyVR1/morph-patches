package p002l;

import android.view.View;
import com.p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p1.mobile.putong.live.base.data.BLiveButtonType;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class hr3 extends mz0 {
    public hr3(bsm bsmVar, BLiveBottomButton bLiveBottomButton, int i, int i2, String str, String str2) {
        super(bsmVar, bLiveBottomButton, i, i2, str, i3c0.f12599O8, str2);
        z2(new ny4(bsmVar));
    }

    @Override // p002l.i80, p002l.df2
    /* JADX INFO: renamed from: V3 */
    public void mo10610V3(View view) {
        super.mo10610V3(view);
        m25548F2().BottomEvent.showDialog().j(BLiveButtonType.get("chatManager"));
    }

    @Override // p002l.df2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo10613X3() {
        return BLiveButtonType.get("chatManager");
    }
}
