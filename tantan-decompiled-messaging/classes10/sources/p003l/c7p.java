package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.ui.purchase.intlpage.IntlPurchasePrivilegeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class c7p {
    /* JADX INFO: renamed from: a */
    public static void m5867a(IntlPurchasePrivilegeView intlPurchasePrivilegeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlPurchasePrivilegeView.a = (FrameLayout) viewGroup.getChildAt(0);
        intlPurchasePrivilegeView.b = viewGroup.getChildAt(1);
    }
}
