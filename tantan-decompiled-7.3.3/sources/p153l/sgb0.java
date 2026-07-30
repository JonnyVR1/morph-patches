package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.result.PurchaseReceivingAnimView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class sgb0 {
    /* JADX INFO: renamed from: a */
    public static void m185767a(PurchaseReceivingAnimView purchaseReceivingAnimView, View view) {
        purchaseReceivingAnimView.f36439a = (PurchaseReceivingAnimView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        purchaseReceivingAnimView.f36440b = (FrameLayout) viewGroup.getChildAt(0);
        purchaseReceivingAnimView.f36441c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        purchaseReceivingAnimView.f36442d = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        purchaseReceivingAnimView.f36443e = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        purchaseReceivingAnimView.f36444f = (ImageView) viewGroup.getChildAt(1);
    }
}
