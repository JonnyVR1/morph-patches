package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.p058ui.purchase.CoinPurchaseSheetItemView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ie5 {
    /* JADX INFO: renamed from: a */
    public static void m139590a(CoinPurchaseSheetItemView coinPurchaseSheetItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        coinPurchaseSheetItemView.f35197a = (LinearLayout) viewGroup.getChildAt(0);
        coinPurchaseSheetItemView.f35198b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        coinPurchaseSheetItemView.f35199c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        coinPurchaseSheetItemView.f35200d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        coinPurchaseSheetItemView.f35201e = (VText) viewGroup.getChildAt(1);
    }
}
