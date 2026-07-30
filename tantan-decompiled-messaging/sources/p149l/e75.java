package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VProgressBar;
import p147v.VPullUpRecyclerView;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class e75 {
    /* JADX INFO: renamed from: a */
    public static void m115179a(d75 d75Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        d75Var.f84692a = (VNavigationBar) viewGroup.getChildAt(0);
        d75Var.f84693b = (VFrame) viewGroup.getChildAt(1);
        d75Var.f84694c = (VFrame) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        d75Var.f84695d = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        d75Var.f84696e = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        d75Var.f84697f = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        d75Var.f84698g = (VProgressBar) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        d75Var.f84699h = (VPullUpRecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m115180b(d75 d75Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95989s1, viewGroup, false);
        m115179a(d75Var, viewInflate);
        return viewInflate;
    }
}
