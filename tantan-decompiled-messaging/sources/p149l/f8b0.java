package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.p053ui.purchase.page.PurchasePrivilegeUndoView;
import p147v.VDraweeView;
import p147v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class f8b0 {
    /* JADX INFO: renamed from: a */
    public static void m119873a(PurchasePrivilegeUndoView purchasePrivilegeUndoView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        purchasePrivilegeUndoView._certain = (FrameLayout) viewGroup.getChildAt(0);
        purchasePrivilegeUndoView._avatar_right = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        purchasePrivilegeUndoView._avatar_left = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        purchasePrivilegeUndoView._icon = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        purchasePrivilegeUndoView._uncertain = (VImage) viewGroup.getChildAt(1);
    }
}
