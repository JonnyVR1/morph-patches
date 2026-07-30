package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.p058ui.purchase.intlpage.IntlPurchaseExclusivePrivilegeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class o6p {
    /* JADX INFO: renamed from: a */
    public static void m166279a(IntlPurchaseExclusivePrivilegeView intlPurchaseExclusivePrivilegeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlPurchaseExclusivePrivilegeView._root_view = (FrameLayout) viewGroup.getChildAt(0);
        intlPurchaseExclusivePrivilegeView._root_view_container = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        intlPurchaseExclusivePrivilegeView._privilege_title = (VText) viewGroup.getChildAt(1);
    }
}
