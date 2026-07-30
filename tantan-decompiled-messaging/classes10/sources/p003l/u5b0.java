package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.ui.purchase.page.PurchasePagePaymentView;
import l.m6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class u5b0 {
    /* JADX INFO: renamed from: a */
    public static void m9649a(PurchasePagePaymentView purchasePagePaymentView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        purchasePagePaymentView.a = (FrameLayout) viewGroup.getChildAt(0);
        purchasePagePaymentView.b = (FrameLayout) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m9650b(PurchasePagePaymentView purchasePagePaymentView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(m6c0.m1, viewGroup, true);
        m9649a(purchasePagePaymentView, viewInflate);
        return viewInflate;
    }
}
