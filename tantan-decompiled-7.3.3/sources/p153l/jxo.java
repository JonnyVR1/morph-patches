package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.p058ui.purchase.intlpage.IntlPremiumDiscountPurchaseContentView;
import com.p051p1.mobile.putong.core.p058ui.purchase.intlpage.IntlPurchasePagePaymentView;

/* JADX INFO: loaded from: classes10.dex */
public class jxo {
    /* JADX INFO: renamed from: a */
    public static void m147388a(IntlPremiumDiscountPurchaseContentView intlPremiumDiscountPurchaseContentView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlPremiumDiscountPurchaseContentView._privilege = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        intlPremiumDiscountPurchaseContentView._introduce = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        intlPremiumDiscountPurchaseContentView._payment_view = (IntlPurchasePagePaymentView) viewGroup.getChildAt(1);
    }
}
