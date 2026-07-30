package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.purchase.intlpage.IntlPurchaseExclusivePrivilegeItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class n4p {
    /* JADX INFO: renamed from: a */
    public static void m8310a(IntlPurchaseExclusivePrivilegeItemView intlPurchaseExclusivePrivilegeItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlPurchaseExclusivePrivilegeItemView.a = viewGroup.getChildAt(0);
        intlPurchaseExclusivePrivilegeItemView.b = viewGroup.getChildAt(1);
        intlPurchaseExclusivePrivilegeItemView.c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        intlPurchaseExclusivePrivilegeItemView.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
