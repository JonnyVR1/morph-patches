package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.purchase.page.PurchasePrivilegeCustomService;
import p147v.AutoVDraweeView;
import p147v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class y7b0 {
    /* JADX INFO: renamed from: a */
    public static void m213310a(PurchasePrivilegeCustomService purchasePrivilegeCustomService, View view) {
        purchasePrivilegeCustomService._root = (PurchasePrivilegeCustomService) view;
        ViewGroup viewGroup = (ViewGroup) view;
        purchasePrivilegeCustomService._img_background = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        purchasePrivilegeCustomService._img_avatar = (AutoVDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
