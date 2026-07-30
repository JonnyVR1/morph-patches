package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.p053ui.purchase.page.PurchasePrivilegeView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class g8b0 {
    /* JADX INFO: renamed from: a */
    public static void m124746a(PurchasePrivilegeView purchasePrivilegeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        purchasePrivilegeView._container = (FrameLayout) viewGroup.getChildAt(0);
        purchasePrivilegeView._description = (VText) viewGroup.getChildAt(1);
    }
}
