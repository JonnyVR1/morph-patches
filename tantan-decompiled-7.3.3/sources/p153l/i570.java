package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VPullDownRefreshLayout;
import p151v.VRecyclerView;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
public class i570 {
    /* JADX INFO: renamed from: a */
    public static void m138641a(h570 h570Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        h570Var.f107916o = (VNavigationBar) viewGroup.getChildAt(0);
        h570Var.f107917p = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        h570Var.f107918q = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        h570Var.f107919r = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        h570Var.f107920s = (VPullDownRefreshLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        h570Var.f107921t = (VRecyclerView) view.findViewById(hdc0.f108977y);
        ViewGroup viewGroup2 = (ViewGroup) view;
        h570Var.f107922u = (VLinear) viewGroup2.getChildAt(2);
        h570Var.f107923v = (VDraweeView) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(0);
        h570Var.f107924w = (VText) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(1);
        h570Var.f107925x = (VText) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m138642b(h570 h570Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173711m5, viewGroup, false);
        m138641a(h570Var, viewInflate);
        return viewInflate;
    }
}
