package p153l;

import android.view.View;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;

/* JADX INFO: loaded from: classes4.dex */
public class vq1 extends fq1 {
    public vq1(dum dumVar, BLiveBottomButton bLiveBottomButton) {
        super(dumVar, obc0.f146308d6, bLiveBottomButton);
        this.f100239r = true;
    }

    @Override // p153l.kf2
    /* JADX INFO: renamed from: V3 */
    public void mo96798V3(View view) {
        super.mo96798V3(view);
        m213811F2().BootBubbleEvent.dismissBubble().mo199273j("giftButtonBubble");
        m213811F2().GiftDialogEventGroup.openGiftDialogEvent().mo199273j(new lx50().m156159i(800));
    }

    @Override // p153l.kf2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo96799X3() {
        return BLiveButtonType.get("giftButton");
    }
}
