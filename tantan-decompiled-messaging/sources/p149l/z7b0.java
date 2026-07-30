package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.purchase.page.PurchasePrivilegeHideMeFromNearbyView;
import p147v.AutoVDraweeView;
import p147v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class z7b0 {
    /* JADX INFO: renamed from: a */
    public static void m217450a(PurchasePrivilegeHideMeFromNearbyView purchasePrivilegeHideMeFromNearbyView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        purchasePrivilegeHideMeFromNearbyView._model = (VImage) viewGroup.getChildAt(0);
        purchasePrivilegeHideMeFromNearbyView._avatar = (AutoVDraweeView) viewGroup.getChildAt(1);
        purchasePrivilegeHideMeFromNearbyView._mask = viewGroup.getChildAt(2);
        purchasePrivilegeHideMeFromNearbyView._hide_ic = (VImage) viewGroup.getChildAt(3);
    }
}
