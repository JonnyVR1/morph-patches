package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.ui.purchase.page.PurchasePrivilegeUndoView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class f8b0 {
    /* JADX INFO: renamed from: a */
    public static void m6458a(PurchasePrivilegeUndoView purchasePrivilegeUndoView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        purchasePrivilegeUndoView.a = (FrameLayout) viewGroup.getChildAt(0);
        purchasePrivilegeUndoView.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        purchasePrivilegeUndoView.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        purchasePrivilegeUndoView.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        purchasePrivilegeUndoView.e = viewGroup.getChildAt(1);
    }
}
