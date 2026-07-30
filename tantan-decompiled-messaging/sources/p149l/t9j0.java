package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTrays;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTraysPresenter;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
public class t9j0<T extends ho2> extends LiveGiftTraysPresenter<T> {
    public t9j0(bsm<T> bsmVar, LiveGiftTrays liveGiftTrays) {
        super(bsmVar, liveGiftTrays);
    }

    /* JADX INFO: renamed from: A4 */
    public final boolean m187633A4(int i) {
        return i == 768;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTraysPresenter
    /* JADX INFO: renamed from: a4 */
    public boolean mo74230a4(GiftTrayData giftTrayData) {
        if (!nqe.m160608n(giftTrayData) && !TextUtils.isEmpty(giftTrayData.f50072B)) {
            fld0<hdv> fld0Var = fld0.f98150e;
            if (((hdv) ypv.m215673l(fld0Var)).f107306l.get().booleanValue() && !m187633A4(giftTrayData.f50099e)) {
                return !((hdv) ypv.m215673l(fld0Var)).f107305k.get().booleanValue();
            }
        }
        return true;
    }
}
