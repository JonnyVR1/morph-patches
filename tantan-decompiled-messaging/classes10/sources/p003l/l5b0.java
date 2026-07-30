package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.ui.purchase.page.PurchasePageContentNewView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class l5b0 {
    /* JADX INFO: renamed from: a */
    public static void m7698a(PurchasePageContentNewView purchasePageContentNewView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        purchasePageContentNewView.a = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        purchasePageContentNewView.b = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        purchasePageContentNewView.c = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        purchasePageContentNewView.d = viewGroup.getChildAt(1);
    }
}
