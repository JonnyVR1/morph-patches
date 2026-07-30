package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.purchase.PurchaseAutoRenewConfirmView;
import p147v.VButton;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class d1b0 {
    /* JADX INFO: renamed from: a */
    public static void m109606a(PurchaseAutoRenewConfirmView purchaseAutoRenewConfirmView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        purchaseAutoRenewConfirmView._close = (VImage) viewGroup.getChildAt(0);
        purchaseAutoRenewConfirmView._title = (VText) viewGroup.getChildAt(1);
        purchaseAutoRenewConfirmView._sub_title = (VText) viewGroup.getChildAt(2);
        purchaseAutoRenewConfirmView._confirm_button = (VButton) viewGroup.getChildAt(3);
    }
}
