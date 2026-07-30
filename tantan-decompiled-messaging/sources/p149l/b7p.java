package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.purchase.intlpage.IntlPurchasePageTabsItemView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class b7p {
    /* JADX INFO: renamed from: a */
    public static void m100693a(IntlPurchasePageTabsItemView intlPurchasePageTabsItemView, View view) {
        intlPurchasePageTabsItemView._root = (IntlPurchasePageTabsItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        intlPurchasePageTabsItemView._title = (VText) viewGroup.getChildAt(0);
        intlPurchasePageTabsItemView._subtitle = (VText) viewGroup.getChildAt(1);
    }
}
