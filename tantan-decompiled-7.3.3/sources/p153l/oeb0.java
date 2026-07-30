package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.p058ui.alifree.AliFreeClipLinearLayout;
import com.p051p1.mobile.putong.core.p058ui.purchase.PurchaseTabViewContainer;
import com.p051p1.mobile.putong.core.p058ui.view.VPagerInPurchaseDialog;

/* JADX INFO: loaded from: classes10.dex */
public class oeb0 {
    /* JADX INFO: renamed from: a */
    public static void m167356a(neb0 neb0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        neb0Var._content = (AliFreeClipLinearLayout) viewGroup.getChildAt(0);
        neb0Var._tabs_container = (PurchaseTabViewContainer) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        neb0Var._pager = (VPagerInPurchaseDialog) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        neb0Var._agreement_container_1 = (FrameLayout) viewGroup.getChildAt(1);
        neb0Var._agreement_container_2 = (FrameLayout) viewGroup.getChildAt(2);
    }
}
