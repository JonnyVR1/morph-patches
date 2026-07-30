package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.purchase.page.PurchaseExclusivePrivilegeItemView;
import p147v.VIcon;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class d3b0 {
    /* JADX INFO: renamed from: a */
    public static void m109902a(PurchaseExclusivePrivilegeItemView purchaseExclusivePrivilegeItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        purchaseExclusivePrivilegeItemView._icon = (VIcon) viewGroup.getChildAt(0);
        purchaseExclusivePrivilegeItemView._privilege = (VText) viewGroup.getChildAt(1);
    }
}
