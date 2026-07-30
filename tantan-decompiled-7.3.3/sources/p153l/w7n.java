package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.purchase.IntlCoinPurchaseSheetItemView;
import p151v.VImage;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class w7n {
    /* JADX INFO: renamed from: a */
    public static void m205352a(IntlCoinPurchaseSheetItemView intlCoinPurchaseSheetItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlCoinPurchaseSheetItemView.f35202a = (VRelative) viewGroup.getChildAt(0);
        intlCoinPurchaseSheetItemView.f35203b = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        intlCoinPurchaseSheetItemView.f35204c = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        intlCoinPurchaseSheetItemView.f35205d = (VImage) viewGroup.getChildAt(1);
    }
}
