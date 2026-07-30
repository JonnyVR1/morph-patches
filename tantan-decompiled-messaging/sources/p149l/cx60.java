package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VPullDownRefreshLayout;
import p147v.VRecyclerView;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
public class cx60 {
    /* JADX INFO: renamed from: a */
    public static void m109086a(bx60 bx60Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        bx60Var.f77756o = (VNavigationBar) viewGroup.getChildAt(0);
        bx60Var.f77757p = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        bx60Var.f77758q = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        bx60Var.f77759r = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        bx60Var.f77760s = (VPullDownRefreshLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        bx60Var.f77761t = (VRecyclerView) view.findViewById(b5c0.f73624y);
        ViewGroup viewGroup2 = (ViewGroup) view;
        bx60Var.f77762u = (VLinear) viewGroup2.getChildAt(2);
        bx60Var.f77763v = (VDraweeView) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(0);
        bx60Var.f77764w = (VText) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(1);
        bx60Var.f77765x = (VText) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m109087b(bx60 bx60Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142242m5, viewGroup, false);
        m109086a(bx60Var, viewInflate);
        return viewInflate;
    }
}
