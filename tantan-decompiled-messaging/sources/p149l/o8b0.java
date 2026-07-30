package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.result.PurchaseReceivingAnimView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class o8b0 {
    /* JADX INFO: renamed from: a */
    public static void m163110a(PurchaseReceivingAnimView purchaseReceivingAnimView, View view) {
        purchaseReceivingAnimView.f35591a = (PurchaseReceivingAnimView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        purchaseReceivingAnimView.f35592b = (FrameLayout) viewGroup.getChildAt(0);
        purchaseReceivingAnimView.f35593c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        purchaseReceivingAnimView.f35594d = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        purchaseReceivingAnimView.f35595e = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        purchaseReceivingAnimView.f35596f = (ImageView) viewGroup.getChildAt(1);
    }
}
