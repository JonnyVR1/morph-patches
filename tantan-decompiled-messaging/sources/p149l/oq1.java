package p149l;

import android.view.View;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;

/* JADX INFO: loaded from: classes4.dex */
public class oq1 extends yp1 {
    public oq1(bsm bsmVar, BLiveBottomButton bLiveBottomButton) {
        super(bsmVar, i3c0.f110980d6, bLiveBottomButton);
        this.f199380r = true;
    }

    @Override // p149l.df2
    /* JADX INFO: renamed from: V3 */
    public void mo103804V3(View view) {
        super.mo103804V3(view);
        m206028F2().BootBubbleEvent.dismissBubble().mo172463j("giftButtonBubble");
        m206028F2().GiftDialogEventGroup.openGiftDialogEvent().mo172463j(new fp50().m122565i(800));
    }

    @Override // p149l.df2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo103807X3() {
        return BLiveButtonType.get("giftButton");
    }
}
