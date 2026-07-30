package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.purchase.showcase.BoostPurchaseSectionView;
import p147v.VText;
import p147v.VText_AutoFit;

/* JADX INFO: loaded from: classes10.dex */
public class g93 {
    /* JADX INFO: renamed from: a */
    public static void m124776a(BoostPurchaseSectionView boostPurchaseSectionView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        boostPurchaseSectionView._border = (LinearLayout) viewGroup.getChildAt(0);
        boostPurchaseSectionView._quantity = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        boostPurchaseSectionView._describe = (VText_AutoFit) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        boostPurchaseSectionView._discount_text = (TextView) viewGroup.getChildAt(1);
        boostPurchaseSectionView._bottom_price = (TextView) viewGroup.getChildAt(2);
        boostPurchaseSectionView._label = (TextView) viewGroup.getChildAt(3);
    }
}
