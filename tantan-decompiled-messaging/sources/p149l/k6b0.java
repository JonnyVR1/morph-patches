package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.p053ui.alifree.AliFreeClipLinearLayout;
import com.p046p1.mobile.putong.core.p053ui.purchase.PurchaseTabViewContainer;
import com.p046p1.mobile.putong.core.p053ui.view.VPagerInPurchaseDialog;

/* JADX INFO: loaded from: classes10.dex */
public class k6b0 {
    /* JADX INFO: renamed from: a */
    public static void m144576a(j6b0 j6b0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        j6b0Var._content = (AliFreeClipLinearLayout) viewGroup.getChildAt(0);
        j6b0Var._tabs_container = (PurchaseTabViewContainer) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        j6b0Var._pager = (VPagerInPurchaseDialog) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        j6b0Var._agreement_container_1 = (FrameLayout) viewGroup.getChildAt(1);
        j6b0Var._agreement_container_2 = (FrameLayout) viewGroup.getChildAt(2);
    }
}
