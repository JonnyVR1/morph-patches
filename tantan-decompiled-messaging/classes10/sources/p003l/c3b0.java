package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.purchase.privilege.PurchaseDlgItemVisitorHideFootPrint;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class c3b0 {
    /* JADX INFO: renamed from: a */
    public static void m5844a(PurchaseDlgItemVisitorHideFootPrint purchaseDlgItemVisitorHideFootPrint, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        purchaseDlgItemVisitorHideFootPrint.a = viewGroup.getChildAt(0);
        purchaseDlgItemVisitorHideFootPrint.b = viewGroup.getChildAt(1);
        purchaseDlgItemVisitorHideFootPrint.c = viewGroup.getChildAt(2);
    }
}
