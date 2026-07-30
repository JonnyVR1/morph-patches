package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.purchase.intlpage.IntlPurchaseExclusivePrivilegeItemView;
import p147v.VIcon;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class n4p {
    /* JADX INFO: renamed from: a */
    public static void m157884a(IntlPurchaseExclusivePrivilegeItemView intlPurchaseExclusivePrivilegeItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlPurchaseExclusivePrivilegeItemView._icon = (VIcon) viewGroup.getChildAt(0);
        intlPurchaseExclusivePrivilegeItemView._content_layout = (VLinear) viewGroup.getChildAt(1);
        intlPurchaseExclusivePrivilegeItemView._privilege = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        intlPurchaseExclusivePrivilegeItemView._privilege_desc = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
