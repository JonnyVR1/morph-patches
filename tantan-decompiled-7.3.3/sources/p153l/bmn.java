package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.gears.GiftGearsLayerView;
import com.p051p1.mobile.putong.live.livingroom.intl.gift.IntlGiftComboView;
import com.p051p1.mobile.putong.live.livingroom.intl.gift.IntlLiveCountdownView;
import com.p051p1.mobile.putong.live.livingroom.intl.gift.IntlMultipleGiftItemView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class bmn {
    /* JADX INFO: renamed from: a */
    public static void m105212a(IntlGiftComboView intlGiftComboView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlGiftComboView.f51852d = (IntlLiveCountdownView) viewGroup.getChildAt(0);
        intlGiftComboView.f51853e = (GiftGearsLayerView) viewGroup.getChildAt(1);
        intlGiftComboView.f51854f = (IntlMultipleGiftItemView) viewGroup.getChildAt(2);
        intlGiftComboView.f51855g = (IntlMultipleGiftItemView) viewGroup.getChildAt(3);
        intlGiftComboView.f51856h = (IntlMultipleGiftItemView) viewGroup.getChildAt(4);
        intlGiftComboView.f51857i = viewGroup.getChildAt(5);
        intlGiftComboView.f51858j = (VText) viewGroup.getChildAt(6);
    }
}
