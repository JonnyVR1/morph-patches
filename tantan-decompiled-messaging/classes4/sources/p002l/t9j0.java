package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTrays;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTraysPresenter;
import l.fld0;
import l.hdv;
import l.ypv;
import p002l.ho2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class t9j0<T extends ho2> extends LiveGiftTraysPresenter<T> {
    public t9j0(bsm<T> bsmVar, LiveGiftTrays liveGiftTrays) {
        super(bsmVar, liveGiftTrays);
    }

    /* JADX INFO: renamed from: A4 */
    public final boolean m22822A4(int i) {
        return i == 768;
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTraysPresenter
    /* JADX INFO: renamed from: a4 */
    public boolean mo7800a4(GiftTrayData giftTrayData) {
        if (!nqe.m18959n(giftTrayData) && !TextUtils.isEmpty(giftTrayData.f6114B)) {
            fld0 fld0Var = fld0.e;
            if (((Boolean) ((hdv) ypv.l(fld0Var)).l.get()).booleanValue() && !m22822A4(giftTrayData.f6141e)) {
                return !((Boolean) ((hdv) ypv.l(fld0Var)).k.get()).booleanValue();
            }
        }
        return true;
    }
}
