package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.alifree.AliFreeAutoView;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8930f;
import com.p051p1.mobile.putong.core.p058ui.purchase.PurchaseTabViewContainer;
import com.p051p1.mobile.putong.core.p058ui.view.VPagerInPurchaseDialog;
import p151v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class q0i0 {
    /* JADX INFO: renamed from: a */
    public static void m174709a(C8930f c8930f, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        c8930f.f35437d = (AliFreeAutoView) viewGroup.getChildAt(0);
        c8930f.f35438e = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        c8930f.f35439f = (PurchaseTabViewContainer) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        c8930f.f35440g = (VPagerInPurchaseDialog) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
    }
}
