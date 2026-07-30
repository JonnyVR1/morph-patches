package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.purchase.IntlCoinPurchaseSheetItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class w5n {
    /* JADX INFO: renamed from: a */
    public static void m10449a(IntlCoinPurchaseSheetItemView intlCoinPurchaseSheetItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlCoinPurchaseSheetItemView.a = viewGroup.getChildAt(0);
        intlCoinPurchaseSheetItemView.b = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        intlCoinPurchaseSheetItemView.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        intlCoinPurchaseSheetItemView.d = viewGroup.getChildAt(1);
    }
}
