package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.purchase.intlpage.IntlPurchasePagePaymentView;

/* JADX INFO: loaded from: classes10.dex */
public class z6p {
    /* JADX INFO: renamed from: a */
    public static void m217401a(IntlPurchasePagePaymentView intlPurchasePagePaymentView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlPurchasePagePaymentView._renewal_detail = (TextView) viewGroup.getChildAt(0);
        intlPurchasePagePaymentView._payment = (FrameLayout) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m217402b(IntlPurchasePagePaymentView intlPurchasePagePaymentView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(m6c0.f131521Q, viewGroup, true);
        m217401a(intlPurchasePagePaymentView, viewInflate);
        return viewInflate;
    }
}
