package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.purchase.intlpage.IntlPurchasePageTabsItemView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class b9p {
    /* JADX INFO: renamed from: a */
    public static void m103128a(IntlPurchasePageTabsItemView intlPurchasePageTabsItemView, View view) {
        intlPurchasePageTabsItemView._root = (IntlPurchasePageTabsItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        intlPurchasePageTabsItemView._title = (VText) viewGroup.getChildAt(0);
        intlPurchasePageTabsItemView._subtitle = (VText) viewGroup.getChildAt(1);
    }
}
