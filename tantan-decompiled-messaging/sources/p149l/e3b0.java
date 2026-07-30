package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.p053ui.purchase.page.PurchaseExclusivePrivilegeView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class e3b0 {
    /* JADX INFO: renamed from: a */
    public static void m114586a(PurchaseExclusivePrivilegeView purchaseExclusivePrivilegeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        purchaseExclusivePrivilegeView._root_view = (FrameLayout) viewGroup.getChildAt(0);
        purchaseExclusivePrivilegeView._root_view_container = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        purchaseExclusivePrivilegeView._privilege_title = (VText) viewGroup.getChildAt(1);
    }
}
