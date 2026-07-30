package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.purchase.page.PurchasePrivilegeCustomService;
import p151v.AutoVDraweeView;
import p151v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class cgb0 {
    /* JADX INFO: renamed from: a */
    public static void m109686a(PurchasePrivilegeCustomService purchasePrivilegeCustomService, View view) {
        purchasePrivilegeCustomService._root = (PurchasePrivilegeCustomService) view;
        ViewGroup viewGroup = (ViewGroup) view;
        purchasePrivilegeCustomService._img_background = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        purchasePrivilegeCustomService._img_avatar = (AutoVDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
