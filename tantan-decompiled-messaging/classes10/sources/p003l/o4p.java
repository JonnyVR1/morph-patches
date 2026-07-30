package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.ui.purchase.intlpage.IntlPurchaseExclusivePrivilegeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class o4p {
    /* JADX INFO: renamed from: a */
    public static void m8396a(IntlPurchaseExclusivePrivilegeView intlPurchaseExclusivePrivilegeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlPurchaseExclusivePrivilegeView.a = (FrameLayout) viewGroup.getChildAt(0);
        intlPurchaseExclusivePrivilegeView.b = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        intlPurchaseExclusivePrivilegeView.c = viewGroup.getChildAt(1);
    }
}
