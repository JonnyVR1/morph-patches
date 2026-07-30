package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.purchase.IntlCoinPurchaseSheetItemView;
import p147v.VImage;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class w5n {
    /* JADX INFO: renamed from: a */
    public static void m201658a(IntlCoinPurchaseSheetItemView intlCoinPurchaseSheetItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlCoinPurchaseSheetItemView.f34354a = (VRelative) viewGroup.getChildAt(0);
        intlCoinPurchaseSheetItemView.f34355b = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        intlCoinPurchaseSheetItemView.f34356c = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        intlCoinPurchaseSheetItemView.f34357d = (VImage) viewGroup.getChildAt(1);
    }
}
