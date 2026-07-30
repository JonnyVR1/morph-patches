package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.ui.purchase.page.PurchasePrivilegeBadgeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class w7b0 {
    /* JADX INFO: renamed from: a */
    public static void m10450a(PurchasePrivilegeBadgeView purchasePrivilegeBadgeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        purchasePrivilegeBadgeView.a = (FrameLayout) viewGroup.getChildAt(0);
        purchasePrivilegeBadgeView.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        purchasePrivilegeBadgeView.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        purchasePrivilegeBadgeView.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
