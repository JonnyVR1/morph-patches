package p002l;

import android.view.View;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.C0323a;
import com.p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p1.mobile.putong.live.base.data.BLiveButtonType;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class kt3 extends mz0 {
    public kt3(bsm bsmVar, BLiveBottomButton bLiveBottomButton, int i, int i2, String str, String str2) {
        super(bsmVar, bLiveBottomButton, i, i2, str, 0, str2);
        z2(new C0323a(bsmVar));
    }

    @Override // p002l.i80, p002l.df2
    /* JADX INFO: renamed from: V3 */
    public void mo10610V3(View view) {
        super.mo10610V3(view);
        m25548F2().BottomEvent.showDialog().j(BLiveButtonType.get("sticker"));
    }

    @Override // p002l.df2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo10613X3() {
        return BLiveButtonType.get("sticker");
    }
}
