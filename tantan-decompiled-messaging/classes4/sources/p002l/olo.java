package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.intl.gift.IntlMultipleGiftItemView;
import com.p000p1.mobile.putong.live.livingroom.intl.gift.IntlMultipleGiftView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class olo {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m19603a(IntlMultipleGiftView intlMultipleGiftView, View view) {
        intlMultipleGiftView.f7080d = (IntlMultipleGiftView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        intlMultipleGiftView.f7081e = (IntlMultipleGiftItemView) viewGroup.getChildAt(0);
        intlMultipleGiftView.f7082f = (IntlMultipleGiftItemView) viewGroup.getChildAt(1);
        intlMultipleGiftView.f7083g = (IntlMultipleGiftItemView) viewGroup.getChildAt(2);
    }
}
