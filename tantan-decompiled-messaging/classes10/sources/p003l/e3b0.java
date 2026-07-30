package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.ui.purchase.page.PurchaseExclusivePrivilegeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class e3b0 {
    /* JADX INFO: renamed from: a */
    public static void m6241a(PurchaseExclusivePrivilegeView purchaseExclusivePrivilegeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        purchaseExclusivePrivilegeView.a = (FrameLayout) viewGroup.getChildAt(0);
        purchaseExclusivePrivilegeView.b = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        purchaseExclusivePrivilegeView.c = viewGroup.getChildAt(1);
    }
}
