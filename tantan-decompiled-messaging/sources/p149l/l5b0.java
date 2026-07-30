package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.p053ui.purchase.page.PurchasePageContentNewView;
import com.p046p1.mobile.putong.core.p053ui.purchase.page.PurchasePagePaymentView;

/* JADX INFO: loaded from: classes10.dex */
public class l5b0 {
    /* JADX INFO: renamed from: a */
    public static void m148618a(PurchasePageContentNewView purchasePageContentNewView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        purchasePageContentNewView._privilege = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        purchasePageContentNewView._showcase = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        purchasePageContentNewView._introduce = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        purchasePageContentNewView._payment_view = (PurchasePagePaymentView) viewGroup.getChildAt(1);
    }
}
