package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.ui.purchase.showcase.NewUITotalPricePurchaseSectionView1;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class vc40 {
    /* JADX INFO: renamed from: a */
    public static void m10210a(NewUITotalPricePurchaseSectionView1 newUITotalPricePurchaseSectionView1, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        newUITotalPricePurchaseSectionView1.b = (LinearLayout) viewGroup.getChildAt(0);
        newUITotalPricePurchaseSectionView1.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        newUITotalPricePurchaseSectionView1.d = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        newUITotalPricePurchaseSectionView1.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        newUITotalPricePurchaseSectionView1.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        newUITotalPricePurchaseSectionView1.g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        newUITotalPricePurchaseSectionView1.h = viewGroup.getChildAt(1);
    }
}
