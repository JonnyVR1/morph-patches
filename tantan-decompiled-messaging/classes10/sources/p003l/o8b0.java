package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.result.PurchaseReceivingAnimView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class o8b0 {
    /* JADX INFO: renamed from: a */
    public static void m8432a(PurchaseReceivingAnimView purchaseReceivingAnimView, View view) {
        purchaseReceivingAnimView.a = (PurchaseReceivingAnimView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        purchaseReceivingAnimView.b = (FrameLayout) viewGroup.getChildAt(0);
        purchaseReceivingAnimView.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        purchaseReceivingAnimView.d = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        purchaseReceivingAnimView.e = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        purchaseReceivingAnimView.f = (ImageView) viewGroup.getChildAt(1);
    }
}
