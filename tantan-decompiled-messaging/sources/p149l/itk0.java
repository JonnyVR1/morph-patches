package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VDraweeView;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class itk0 {
    /* JADX INFO: renamed from: a */
    public static void m138214a(htk0 htk0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        htk0Var.f109394a = (VNavigationBar) viewGroup.getChildAt(0);
        htk0Var.f109395b = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m138215b(htk0 htk0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95375Gc, viewGroup, false);
        m138214a(htk0Var, viewInflate);
        return viewInflate;
    }
}
