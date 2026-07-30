package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import p147v.VImage;
import p147v.VProgressBar;
import p147v.VPullDownRefreshLayout;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class aj30 {
    /* JADX INFO: renamed from: a */
    public static void m96969a(zi30 zi30Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        zi30Var.f203282a = (VNavigationBar) viewGroup.getChildAt(0);
        zi30Var.f203283b = (VPullDownRefreshLayout) viewGroup.getChildAt(1);
        zi30Var.f203284c = (RecyclerView) view.findViewById(x4c0.f191005p);
        ViewGroup viewGroup2 = (ViewGroup) view;
        zi30Var.f203285d = (LinearLayout) viewGroup2.getChildAt(2);
        zi30Var.f203286e = (VProgressBar) viewGroup2.getChildAt(3);
        zi30Var.f203287f = (VImage) viewGroup2.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m96970b(zi30 zi30Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f121337T0, viewGroup, false);
        m96969a(zi30Var, viewInflate);
        return viewInflate;
    }
}
