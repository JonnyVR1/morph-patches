package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.purchase.page.PurchasePrivilegeOdiamondSkinView;
import p147v.AutoVDraweeView;
import p147v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class b8b0 {
    /* JADX INFO: renamed from: a */
    public static void m100760a(PurchasePrivilegeOdiamondSkinView purchasePrivilegeOdiamondSkinView, View view) {
        purchasePrivilegeOdiamondSkinView._root = (PurchasePrivilegeOdiamondSkinView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        purchasePrivilegeOdiamondSkinView._avatar = (AutoVDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        purchasePrivilegeOdiamondSkinView._icon = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
