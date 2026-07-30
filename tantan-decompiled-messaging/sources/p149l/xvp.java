package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.livingroom.archi.message.event.KeyboardEventData;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTrays;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTraysPresenter;

/* JADX INFO: loaded from: classes5.dex */
public class xvp extends LiveGiftTraysPresenter<nnn0> {
    public xvp(bsm bsmVar, LiveGiftTrays liveGiftTrays) {
        super(bsmVar, liveGiftTrays);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTraysPresenter
    /* JADX INFO: renamed from: a4 */
    public boolean mo74230a4(GiftTrayData giftTrayData) {
        if (!nqe.m160608n(giftTrayData) && !TextUtils.isEmpty(giftTrayData.f50072B)) {
            fld0<hdv> fld0Var = fld0.f98150e;
            if (((hdv) ypv.m215673l(fld0Var)).f107306l.get().booleanValue()) {
                return !((hdv) ypv.m215673l(fld0Var)).f107305k.get().booleanValue();
            }
        }
        return true;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTraysPresenter
    /* JADX INFO: renamed from: f4 */
    public void mo74232f4(tzd tzdVar) {
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTraysPresenter
    /* JADX INFO: renamed from: l4 */
    public void mo74236l4(KeyboardEventData keyboardEventData) {
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTraysPresenter
    /* JADX INFO: renamed from: g4 */
    public void mo74233g4() {
    }
}
