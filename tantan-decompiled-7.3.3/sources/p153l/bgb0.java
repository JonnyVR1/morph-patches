package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.purchase.page.PurchasePrivilegeCommonStyleView;
import p151v.AutoVDraweeView;
import p151v.VDraweeView;
import p151v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class bgb0 {
    /* JADX INFO: renamed from: a */
    public static void m104116a(PurchasePrivilegeCommonStyleView purchasePrivilegeCommonStyleView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        purchasePrivilegeCommonStyleView._avatar_right = (VDraweeView) viewGroup.getChildAt(0);
        purchasePrivilegeCommonStyleView._avatar_left = (AutoVDraweeView) viewGroup.getChildAt(1);
        purchasePrivilegeCommonStyleView._icon = (VImage) viewGroup.getChildAt(2);
    }
}
