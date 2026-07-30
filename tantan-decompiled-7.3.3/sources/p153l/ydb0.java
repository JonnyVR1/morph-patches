package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.p058ui.purchase.page.PurchasePagePaymentView;

/* JADX INFO: loaded from: classes10.dex */
public class ydb0 {
    /* JADX INFO: renamed from: a */
    public static void m215206a(PurchasePagePaymentView purchasePagePaymentView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        purchasePagePaymentView._payment = (FrameLayout) viewGroup.getChildAt(0);
        purchasePagePaymentView._agreement = (FrameLayout) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m215207b(PurchasePagePaymentView purchasePagePaymentView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(rec0.f162579m1, viewGroup, true);
        m215206a(purchasePagePaymentView, viewInflate);
        return viewInflate;
    }
}
