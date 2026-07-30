package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VRecyclerView;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class gy80 {
    /* JADX INFO: renamed from: a */
    public static void m132937a(ey80 ey80Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ey80Var.f96408a = (VNavigationBar) viewGroup.getChildAt(0);
        ey80Var.f96409b = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m132938b(ey80 ey80Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(xec0.f193776E0, viewGroup, false);
        m132937a(ey80Var, viewInflate);
        return viewInflate;
    }
}
