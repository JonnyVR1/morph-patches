package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.gears.GiftGearsLayerView;
import com.p000p1.mobile.putong.live.livingroom.intl.gift.IntlGiftComboView;
import com.p000p1.mobile.putong.live.livingroom.intl.gift.IntlLiveCountdownView;
import com.p000p1.mobile.putong.live.livingroom.intl.gift.IntlMultipleGiftItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class bkn {
    /* JADX INFO: renamed from: a */
    public static void m10420a(IntlGiftComboView intlGiftComboView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlGiftComboView.f7046d = (IntlLiveCountdownView) viewGroup.getChildAt(0);
        intlGiftComboView.f7047e = (GiftGearsLayerView) viewGroup.getChildAt(1);
        intlGiftComboView.f7048f = (IntlMultipleGiftItemView) viewGroup.getChildAt(2);
        intlGiftComboView.f7049g = (IntlMultipleGiftItemView) viewGroup.getChildAt(3);
        intlGiftComboView.f7050h = (IntlMultipleGiftItemView) viewGroup.getChildAt(4);
        intlGiftComboView.f7051i = viewGroup.getChildAt(5);
        intlGiftComboView.f7052j = viewGroup.getChildAt(6);
    }
}
