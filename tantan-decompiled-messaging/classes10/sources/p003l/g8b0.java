package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.ui.purchase.page.PurchasePrivilegeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class g8b0 {
    /* JADX INFO: renamed from: a */
    public static void m6614a(PurchasePrivilegeView purchasePrivilegeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        purchasePrivilegeView.a = (FrameLayout) viewGroup.getChildAt(0);
        purchasePrivilegeView.b = viewGroup.getChildAt(1);
    }
}
