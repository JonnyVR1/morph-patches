package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.purchase.intlpage.IntlPurchasePagePaymentView;
import l.m6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class z6p {
    /* JADX INFO: renamed from: a */
    public static void m11351a(IntlPurchasePagePaymentView intlPurchasePagePaymentView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlPurchasePagePaymentView.a = (TextView) viewGroup.getChildAt(0);
        intlPurchasePagePaymentView.b = (FrameLayout) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m11352b(IntlPurchasePagePaymentView intlPurchasePagePaymentView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(m6c0.Q, viewGroup, true);
        m11351a(intlPurchasePagePaymentView, viewInflate);
        return viewInflate;
    }
}
