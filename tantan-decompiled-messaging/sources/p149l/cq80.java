package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VRecyclerView;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
public class cq80 {
    /* JADX INFO: renamed from: a */
    public static void m108233a(aq80 aq80Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        aq80Var.f71135a = (VNavigationBar) viewGroup.getChildAt(0);
        aq80Var.f71136b = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m108234b(aq80 aq80Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(s6c0.f162662E0, viewGroup, false);
        m108233a(aq80Var, viewInflate);
        return viewInflate;
    }
}
