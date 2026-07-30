package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.purchase.intlpage.IntlPurchaseExclusivePrivilegeItemView;
import p151v.VIcon;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class n6p {
    /* JADX INFO: renamed from: a */
    public static void m161795a(IntlPurchaseExclusivePrivilegeItemView intlPurchaseExclusivePrivilegeItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlPurchaseExclusivePrivilegeItemView._icon = (VIcon) viewGroup.getChildAt(0);
        intlPurchaseExclusivePrivilegeItemView._content_layout = (VLinear) viewGroup.getChildAt(1);
        intlPurchaseExclusivePrivilegeItemView._privilege = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        intlPurchaseExclusivePrivilegeItemView._privilege_desc = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
