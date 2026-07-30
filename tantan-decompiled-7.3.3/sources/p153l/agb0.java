package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.p058ui.purchase.page.PurchasePrivilegeBadgeView;
import p151v.AutoVDraweeView;
import p151v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class agb0 {
    /* JADX INFO: renamed from: a */
    public static void m97592a(PurchasePrivilegeBadgeView purchasePrivilegeBadgeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        purchasePrivilegeBadgeView._avatar_area = (FrameLayout) viewGroup.getChildAt(0);
        purchasePrivilegeBadgeView._avatar = (AutoVDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        purchasePrivilegeBadgeView._vip_icon = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        purchasePrivilegeBadgeView._vip_badge = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
