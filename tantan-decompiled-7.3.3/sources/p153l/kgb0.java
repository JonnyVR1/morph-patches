package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.p058ui.purchase.page.PurchasePrivilegeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class kgb0 {
    /* JADX INFO: renamed from: a */
    public static void m149743a(PurchasePrivilegeView purchasePrivilegeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        purchasePrivilegeView._container = (FrameLayout) viewGroup.getChildAt(0);
        purchasePrivilegeView._description = (VText) viewGroup.getChildAt(1);
    }
}
