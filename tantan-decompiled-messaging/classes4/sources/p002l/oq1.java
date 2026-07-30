package p002l;

import android.view.View;
import com.p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p1.mobile.putong.live.base.data.BLiveButtonType;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class oq1 extends yp1 {
    public oq1(bsm bsmVar, BLiveBottomButton bLiveBottomButton) {
        super(bsmVar, i3c0.f12765d6, bLiveBottomButton);
        this.f23012r = true;
    }

    @Override // p002l.df2
    /* JADX INFO: renamed from: V3 */
    public void mo10610V3(View view) {
        super.mo10610V3(view);
        m25548F2().BootBubbleEvent.dismissBubble().j("giftButtonBubble");
        m25548F2().GiftDialogEventGroup.openGiftDialogEvent().j(new fp50().m13445i(800));
    }

    @Override // p002l.df2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo10613X3() {
        return BLiveButtonType.get("giftButton");
    }
}
