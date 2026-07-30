package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.purchase.page.PurchasePrivilegeOdiamondSkinView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class b8b0 {
    /* JADX INFO: renamed from: a */
    public static void m5699a(PurchasePrivilegeOdiamondSkinView purchasePrivilegeOdiamondSkinView, View view) {
        purchasePrivilegeOdiamondSkinView.a = (PurchasePrivilegeOdiamondSkinView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        purchasePrivilegeOdiamondSkinView.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        purchasePrivilegeOdiamondSkinView.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
