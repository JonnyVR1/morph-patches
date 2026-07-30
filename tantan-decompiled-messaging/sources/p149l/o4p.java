package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.p053ui.purchase.intlpage.IntlPurchaseExclusivePrivilegeView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class o4p {
    /* JADX INFO: renamed from: a */
    public static void m162609a(IntlPurchaseExclusivePrivilegeView intlPurchaseExclusivePrivilegeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlPurchaseExclusivePrivilegeView._root_view = (FrameLayout) viewGroup.getChildAt(0);
        intlPurchaseExclusivePrivilegeView._root_view_container = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        intlPurchaseExclusivePrivilegeView._privilege_title = (VText) viewGroup.getChildAt(1);
    }
}
