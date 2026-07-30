package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.purchase.PurchaseAutoRenewConfirmView;
import p151v.VButton;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class h9b0 {
    /* JADX INFO: renamed from: a */
    public static void m134044a(PurchaseAutoRenewConfirmView purchaseAutoRenewConfirmView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        purchaseAutoRenewConfirmView._close = (VImage) viewGroup.getChildAt(0);
        purchaseAutoRenewConfirmView._title = (VText) viewGroup.getChildAt(1);
        purchaseAutoRenewConfirmView._sub_title = (VText) viewGroup.getChildAt(2);
        purchaseAutoRenewConfirmView._confirm_button = (VButton) viewGroup.getChildAt(3);
    }
}
