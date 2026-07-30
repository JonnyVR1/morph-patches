package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.purchase.page.PurchasePrivilegeCommonStyleView;
import p147v.AutoVDraweeView;
import p147v.VDraweeView;
import p147v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class x7b0 {
    /* JADX INFO: renamed from: a */
    public static void m207255a(PurchasePrivilegeCommonStyleView purchasePrivilegeCommonStyleView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        purchasePrivilegeCommonStyleView._avatar_right = (VDraweeView) viewGroup.getChildAt(0);
        purchasePrivilegeCommonStyleView._avatar_left = (AutoVDraweeView) viewGroup.getChildAt(1);
        purchasePrivilegeCommonStyleView._icon = (VImage) viewGroup.getChildAt(2);
    }
}
