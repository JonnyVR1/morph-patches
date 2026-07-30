package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8930f;
import com.p051p1.mobile.putong.core.p058ui.purchase.PurchaseTabViewContainer;
import com.p051p1.mobile.putong.core.p058ui.view.VPagerInPurchaseDialog;
import p151v.AutoVDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class p0i0 {
    /* JADX INFO: renamed from: a */
    public static void m170056a(C8930f c8930f, View view) {
        c8930f.f35441h = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        c8930f.f35442i = (FrameLayout) viewGroup.getChildAt(0);
        c8930f.f35443j = (AutoVDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        c8930f.f35444k = (PurchaseTabViewContainer) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        c8930f.f35445l = (VPagerInPurchaseDialog) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        c8930f.f35446m = (FrameLayout) viewGroup.getChildAt(1);
        c8930f.f35447n = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        c8930f.f35448o = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
