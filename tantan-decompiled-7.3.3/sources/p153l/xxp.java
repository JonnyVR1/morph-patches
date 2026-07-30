package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.livingroom.archi.message.event.KeyboardEventData;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTrays;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTraysPresenter;

/* JADX INFO: loaded from: classes5.dex */
public class xxp extends LiveGiftTraysPresenter<rwn0> {
    public xxp(dum dumVar, LiveGiftTrays liveGiftTrays) {
        super(dumVar, liveGiftTrays);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTraysPresenter
    /* JADX INFO: renamed from: a4 */
    public boolean mo75413a4(GiftTrayData giftTrayData) {
        if (!rre.m182742n(giftTrayData) && !TextUtils.isEmpty(giftTrayData.f50920B)) {
            htd0<ifv> htd0Var = htd0.f111523e;
            if (((ifv) zrv.m221194l(htd0Var)).f114703l.get().booleanValue()) {
                return !((ifv) zrv.m221194l(htd0Var)).f114702k.get().booleanValue();
            }
        }
        return true;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTraysPresenter
    /* JADX INFO: renamed from: f4 */
    public void mo75415f4(h1e h1eVar) {
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTraysPresenter
    /* JADX INFO: renamed from: l4 */
    public void mo75419l4(KeyboardEventData keyboardEventData) {
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTraysPresenter
    /* JADX INFO: renamed from: g4 */
    public void mo75416g4() {
    }
}
