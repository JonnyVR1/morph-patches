package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8767f;
import com.p046p1.mobile.putong.core.p053ui.purchase.PurchaseTabViewContainer;
import com.p046p1.mobile.putong.core.p053ui.view.VPagerInPurchaseDialog;
import p147v.AutoVDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class hsh0 {
    /* JADX INFO: renamed from: a */
    public static void m132782a(C8767f c8767f, View view) {
        c8767f.f34593h = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        c8767f.f34594i = (FrameLayout) viewGroup.getChildAt(0);
        c8767f.f34595j = (AutoVDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        c8767f.f34596k = (PurchaseTabViewContainer) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        c8767f.f34597l = (VPagerInPurchaseDialog) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        c8767f.f34598m = (FrameLayout) viewGroup.getChildAt(1);
        c8767f.f34599n = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        c8767f.f34600o = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
