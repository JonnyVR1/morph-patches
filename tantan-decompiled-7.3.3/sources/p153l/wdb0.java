package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.p058ui.purchase.page.PurchasePageTabsContainerView;
import p151v.VImage;
import p151v.VPager;

/* JADX INFO: loaded from: classes10.dex */
public class wdb0 {
    /* JADX INFO: renamed from: a */
    public static void m205853a(vdb0 vdb0Var, View view) {
        vdb0Var._layoutrootview = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        vdb0Var._top_bg = (VImage) viewGroup.getChildAt(0);
        vdb0Var._content = (LinearLayout) viewGroup.getChildAt(1);
        vdb0Var._tabs_container = (PurchasePageTabsContainerView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        vdb0Var._close = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        vdb0Var._pager = (VPager) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m205854b(vdb0 vdb0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(rec0.f162567j1, viewGroup, false);
        m205853a(vdb0Var, viewInflate);
        return viewInflate;
    }
}
