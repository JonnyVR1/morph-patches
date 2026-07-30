package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.alifree.AliFreeAutoView;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8767f;
import com.p046p1.mobile.putong.core.p053ui.purchase.PurchaseTabViewContainer;
import com.p046p1.mobile.putong.core.p053ui.view.VPagerInPurchaseDialog;
import p147v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class ish0 {
    /* JADX INFO: renamed from: a */
    public static void m137982a(C8767f c8767f, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        c8767f.f34589d = (AliFreeAutoView) viewGroup.getChildAt(0);
        c8767f.f34590e = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        c8767f.f34591f = (PurchaseTabViewContainer) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        c8767f.f34592g = (VPagerInPurchaseDialog) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
    }
}
