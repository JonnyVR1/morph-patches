package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.purchase.page.PurchasePrivilegeCustomService;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class y7b0 {
    /* JADX INFO: renamed from: a */
    public static void m11157a(PurchasePrivilegeCustomService purchasePrivilegeCustomService, View view) {
        purchasePrivilegeCustomService.a = (PurchasePrivilegeCustomService) view;
        ViewGroup viewGroup = (ViewGroup) view;
        purchasePrivilegeCustomService.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        purchasePrivilegeCustomService.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
