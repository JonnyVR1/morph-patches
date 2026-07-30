package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.purchase.intlpage.IntlPurchasePagePaymentView;

/* JADX INFO: loaded from: classes10.dex */
public class z8p {
    /* JADX INFO: renamed from: a */
    public static void m219015a(IntlPurchasePagePaymentView intlPurchasePagePaymentView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlPurchasePagePaymentView._renewal_detail = (TextView) viewGroup.getChildAt(0);
        intlPurchasePagePaymentView._payment = (FrameLayout) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m219016b(IntlPurchasePagePaymentView intlPurchasePagePaymentView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(rec0.f162481Q, viewGroup, true);
        m219015a(intlPurchasePagePaymentView, viewInflate);
        return viewInflate;
    }
}
