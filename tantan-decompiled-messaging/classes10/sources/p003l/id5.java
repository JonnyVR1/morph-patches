package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.ui.purchase.CoinPurchaseSheetItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class id5 {
    /* JADX INFO: renamed from: a */
    public static void m7154a(CoinPurchaseSheetItemView coinPurchaseSheetItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        coinPurchaseSheetItemView.a = (LinearLayout) viewGroup.getChildAt(0);
        coinPurchaseSheetItemView.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        coinPurchaseSheetItemView.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        coinPurchaseSheetItemView.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        coinPurchaseSheetItemView.e = viewGroup.getChildAt(1);
    }
}
