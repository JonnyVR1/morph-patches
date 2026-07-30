package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.p058ui.purchase.intlpage.IntlPurchasePageContentNewView;
import com.p051p1.mobile.putong.core.p058ui.purchase.intlpage.IntlPurchasePagePaymentView;

/* JADX INFO: loaded from: classes10.dex */
public class i8p {
    /* JADX INFO: renamed from: a */
    public static void m139020a(IntlPurchasePageContentNewView intlPurchasePageContentNewView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlPurchasePageContentNewView._privilege = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        intlPurchasePageContentNewView._showcase_root = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        intlPurchasePageContentNewView._weekly_promo_banner_container = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        intlPurchasePageContentNewView._introduce = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3);
        intlPurchasePageContentNewView._payment_view = (IntlPurchasePagePaymentView) viewGroup.getChildAt(1);
    }
}
