package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.ui.purchase.intlpage.IntlPremiumDiscountPurchaseContentView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class jvo {
    /* JADX INFO: renamed from: a */
    public static void m7465a(IntlPremiumDiscountPurchaseContentView intlPremiumDiscountPurchaseContentView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlPremiumDiscountPurchaseContentView.a = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        intlPremiumDiscountPurchaseContentView.b = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        intlPremiumDiscountPurchaseContentView.c = viewGroup.getChildAt(1);
    }
}
