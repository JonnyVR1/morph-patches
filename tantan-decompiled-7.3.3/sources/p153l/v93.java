package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.purchase.showcase.BoostPurchaseSectionView;
import p151v.VText;
import p151v.VText_AutoFit;

/* JADX INFO: loaded from: classes10.dex */
public class v93 {
    /* JADX INFO: renamed from: a */
    public static void m200370a(BoostPurchaseSectionView boostPurchaseSectionView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        boostPurchaseSectionView._border = (LinearLayout) viewGroup.getChildAt(0);
        boostPurchaseSectionView._quantity = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        boostPurchaseSectionView._describe = (VText_AutoFit) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        boostPurchaseSectionView._discount_text = (TextView) viewGroup.getChildAt(1);
        boostPurchaseSectionView._bottom_price = (TextView) viewGroup.getChildAt(2);
        boostPurchaseSectionView._label = (TextView) viewGroup.getChildAt(3);
    }
}
