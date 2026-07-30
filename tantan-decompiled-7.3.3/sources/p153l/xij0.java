package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTrays;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTraysPresenter;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public class xij0<T extends oo2> extends LiveGiftTraysPresenter<T> {
    public xij0(dum<T> dumVar, LiveGiftTrays liveGiftTrays) {
        super(dumVar, liveGiftTrays);
    }

    /* JADX INFO: renamed from: A4 */
    public final boolean m211142A4(int i) {
        return i == 768;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTraysPresenter
    /* JADX INFO: renamed from: a4 */
    public boolean mo75413a4(GiftTrayData giftTrayData) {
        if (!rre.m182742n(giftTrayData) && !TextUtils.isEmpty(giftTrayData.f50920B)) {
            htd0<ifv> htd0Var = htd0.f111523e;
            if (((ifv) zrv.m221194l(htd0Var)).f114703l.get().booleanValue() && !m211142A4(giftTrayData.f50947e)) {
                return !((ifv) zrv.m221194l(htd0Var)).f114702k.get().booleanValue();
            }
        }
        return true;
    }
}
