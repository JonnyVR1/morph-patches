package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.p053ui.purchase.showcase.ScrollerGPPurchaseSectionView;
import p147v.VImage;
import p147v.VText;
import p147v.VText_AutoFit;
import p147v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes10.dex */
public class a6e0 {
    /* JADX INFO: renamed from: a */
    public static void m95125a(ScrollerGPPurchaseSectionView scrollerGPPurchaseSectionView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        scrollerGPPurchaseSectionView._boost_tip_container = (LinearLayout) viewGroup.getChildAt(0);
        scrollerGPPurchaseSectionView._boost_tip_text = (VText_NoTopPadding) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        scrollerGPPurchaseSectionView._boost_tip_price = (VText_NoTopPadding) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        scrollerGPPurchaseSectionView._border = (ConstraintLayout) viewGroup.getChildAt(1);
        scrollerGPPurchaseSectionView._border_hot_tag = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        scrollerGPPurchaseSectionView._border_select_img = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        scrollerGPPurchaseSectionView._border_count = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        scrollerGPPurchaseSectionView._border_unit = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        scrollerGPPurchaseSectionView._border_center_price_bg = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        scrollerGPPurchaseSectionView._border_top_price = (VText_AutoFit) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        scrollerGPPurchaseSectionView._border_label = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
    }
}
