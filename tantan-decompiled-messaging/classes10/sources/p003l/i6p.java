package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.ui.purchase.intlpage.IntlPurchasePageContentNewView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class i6p {
    /* JADX INFO: renamed from: a */
    public static void m7131a(IntlPurchasePageContentNewView intlPurchasePageContentNewView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlPurchasePageContentNewView.a = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        intlPurchasePageContentNewView.b = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        intlPurchasePageContentNewView.c = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        intlPurchasePageContentNewView.d = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3);
        intlPurchasePageContentNewView.e = viewGroup.getChildAt(1);
    }
}
