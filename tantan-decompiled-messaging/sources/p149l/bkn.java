package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.gears.GiftGearsLayerView;
import com.p046p1.mobile.putong.live.livingroom.intl.gift.IntlGiftComboView;
import com.p046p1.mobile.putong.live.livingroom.intl.gift.IntlLiveCountdownView;
import com.p046p1.mobile.putong.live.livingroom.intl.gift.IntlMultipleGiftItemView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class bkn {
    /* JADX INFO: renamed from: a */
    public static void m102415a(IntlGiftComboView intlGiftComboView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlGiftComboView.f51004d = (IntlLiveCountdownView) viewGroup.getChildAt(0);
        intlGiftComboView.f51005e = (GiftGearsLayerView) viewGroup.getChildAt(1);
        intlGiftComboView.f51006f = (IntlMultipleGiftItemView) viewGroup.getChildAt(2);
        intlGiftComboView.f51007g = (IntlMultipleGiftItemView) viewGroup.getChildAt(3);
        intlGiftComboView.f51008h = (IntlMultipleGiftItemView) viewGroup.getChildAt(4);
        intlGiftComboView.f51009i = viewGroup.getChildAt(5);
        intlGiftComboView.f51010j = (VText) viewGroup.getChildAt(6);
    }
}
