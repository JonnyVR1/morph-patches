package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.p053ui.purchase.page.PurchasePagePaymentView;

/* JADX INFO: loaded from: classes10.dex */
public class u5b0 {
    /* JADX INFO: renamed from: a */
    public static void m191856a(PurchasePagePaymentView purchasePagePaymentView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        purchasePagePaymentView._payment = (FrameLayout) viewGroup.getChildAt(0);
        purchasePagePaymentView._agreement = (FrameLayout) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m191857b(PurchasePagePaymentView purchasePagePaymentView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(m6c0.f131619m1, viewGroup, true);
        m191856a(purchasePagePaymentView, viewInflate);
        return viewInflate;
    }
}
