package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VPullUpRecyclerView;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class cvg0 {
    /* JADX INFO: renamed from: a */
    public static void m108861a(bvg0 bvg0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        bvg0Var.f77443a = (VNavigationBar) viewGroup.getChildAt(0);
        bvg0Var.f77444b = (VPullUpRecyclerView) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m108862b(bvg0 bvg0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95797gc, viewGroup, false);
        m108861a(bvg0Var, viewInflate);
        return viewInflate;
    }
}
