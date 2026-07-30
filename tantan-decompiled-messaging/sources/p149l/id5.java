package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.p053ui.purchase.CoinPurchaseSheetItemView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class id5 {
    /* JADX INFO: renamed from: a */
    public static void m135425a(CoinPurchaseSheetItemView coinPurchaseSheetItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        coinPurchaseSheetItemView.f34349a = (LinearLayout) viewGroup.getChildAt(0);
        coinPurchaseSheetItemView.f34350b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        coinPurchaseSheetItemView.f34351c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        coinPurchaseSheetItemView.f34352d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        coinPurchaseSheetItemView.f34353e = (VText) viewGroup.getChildAt(1);
    }
}
