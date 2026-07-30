package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.p053ui.purchase.page.PurchasePageTabsContainerView;
import p147v.VImage;
import p147v.VPager;

/* JADX INFO: loaded from: classes10.dex */
public class s5b0 {
    /* JADX INFO: renamed from: a */
    public static void m182325a(r5b0 r5b0Var, View view) {
        r5b0Var._layoutrootview = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        r5b0Var._top_bg = (VImage) viewGroup.getChildAt(0);
        r5b0Var._content = (LinearLayout) viewGroup.getChildAt(1);
        r5b0Var._tabs_container = (PurchasePageTabsContainerView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        r5b0Var._close = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        r5b0Var._pager = (VPager) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m182326b(r5b0 r5b0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(m6c0.f131607j1, viewGroup, false);
        m182325a(r5b0Var, viewInflate);
        return viewInflate;
    }
}
