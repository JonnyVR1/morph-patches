package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.purchase.page.PurchasePrivilegeOdiamondSkinView;
import p151v.AutoVDraweeView;
import p151v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class fgb0 {
    /* JADX INFO: renamed from: a */
    public static void m125493a(PurchasePrivilegeOdiamondSkinView purchasePrivilegeOdiamondSkinView, View view) {
        purchasePrivilegeOdiamondSkinView._root = (PurchasePrivilegeOdiamondSkinView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        purchasePrivilegeOdiamondSkinView._avatar = (AutoVDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        purchasePrivilegeOdiamondSkinView._icon = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
