package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.p053ui.purchase.intlpage.IntlPremiumDiscountPurchaseContentView;
import com.p046p1.mobile.putong.core.p053ui.purchase.intlpage.IntlPurchasePagePaymentView;

/* JADX INFO: loaded from: classes10.dex */
public class jvo {
    /* JADX INFO: renamed from: a */
    public static void m143532a(IntlPremiumDiscountPurchaseContentView intlPremiumDiscountPurchaseContentView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlPremiumDiscountPurchaseContentView._privilege = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        intlPremiumDiscountPurchaseContentView._introduce = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        intlPremiumDiscountPurchaseContentView._payment_view = (IntlPurchasePagePaymentView) viewGroup.getChildAt(1);
    }
}
