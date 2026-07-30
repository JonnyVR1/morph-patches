package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.purchase.page.PurchasePrivilegeHideMeFromNearbyView;
import p151v.AutoVDraweeView;
import p151v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class dgb0 {
    /* JADX INFO: renamed from: a */
    public static void m115644a(PurchasePrivilegeHideMeFromNearbyView purchasePrivilegeHideMeFromNearbyView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        purchasePrivilegeHideMeFromNearbyView._model = (VImage) viewGroup.getChildAt(0);
        purchasePrivilegeHideMeFromNearbyView._avatar = (AutoVDraweeView) viewGroup.getChildAt(1);
        purchasePrivilegeHideMeFromNearbyView._mask = viewGroup.getChildAt(2);
        purchasePrivilegeHideMeFromNearbyView._hide_ic = (VImage) viewGroup.getChildAt(3);
    }
}
