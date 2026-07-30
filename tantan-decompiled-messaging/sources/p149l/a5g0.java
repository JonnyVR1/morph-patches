package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VLinear;
import p147v.VProgressBar;
import p147v.VRecyclerView;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class a5g0 {
    /* JADX INFO: renamed from: a */
    public static void m95023a(z4g0 z4g0Var, View view) {
        z4g0Var.f201592a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        z4g0Var.f201593b = (VNavigationBar) viewGroup.getChildAt(0);
        z4g0Var.f201594c = (VProgressBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        z4g0Var.f201595d = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m95024b(z4g0 z4g0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95665Ye, viewGroup, false);
        m95023a(z4g0Var, viewInflate);
        return viewInflate;
    }
}
