package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.p058ui.purchase.showcase.ScrollerGPUpgradePurchaseSectionView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p151v.VText_AutoFit;

/* JADX INFO: loaded from: classes10.dex */
public class iee0 {
    /* JADX INFO: renamed from: a */
    public static void m139597a(ScrollerGPUpgradePurchaseSectionView scrollerGPUpgradePurchaseSectionView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        scrollerGPUpgradePurchaseSectionView._border = (ConstraintLayout) viewGroup.getChildAt(0);
        scrollerGPUpgradePurchaseSectionView._border_hot_tag = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        scrollerGPUpgradePurchaseSectionView._border_select_img = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        scrollerGPUpgradePurchaseSectionView._border_origin_price = (VText_AutoFit) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        scrollerGPUpgradePurchaseSectionView._border_count = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        scrollerGPUpgradePurchaseSectionView._border_unit = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        scrollerGPUpgradePurchaseSectionView._border_center_price_bg = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        scrollerGPUpgradePurchaseSectionView._border_top_price = (VText_AutoFit) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
        scrollerGPUpgradePurchaseSectionView._border_ll_select = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7);
        scrollerGPUpgradePurchaseSectionView._border_ll_select_label = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7)).getChildAt(0);
        scrollerGPUpgradePurchaseSectionView._border_ll_select_icon = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7)).getChildAt(1);
    }
}
