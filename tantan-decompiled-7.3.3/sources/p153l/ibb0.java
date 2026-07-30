package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.p058ui.purchase.page.PurchaseExclusivePrivilegeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ibb0 {
    /* JADX INFO: renamed from: a */
    public static void m139304a(PurchaseExclusivePrivilegeView purchaseExclusivePrivilegeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        purchaseExclusivePrivilegeView._root_view = (FrameLayout) viewGroup.getChildAt(0);
        purchaseExclusivePrivilegeView._root_view_container = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        purchaseExclusivePrivilegeView._privilege_title = (VText) viewGroup.getChildAt(1);
    }
}
