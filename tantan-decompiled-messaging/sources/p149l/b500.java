package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import p147v.VLinear;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
public class b500 {
    /* JADX INFO: renamed from: a */
    public static void m100304a(a500 a500Var, View view) {
        a500Var.f67595a = (VLinear) view.findViewById(s4c0.f162314R);
        ViewGroup viewGroup = (ViewGroup) view;
        a500Var.f67596b = (VNavigationBar) viewGroup.getChildAt(0);
        a500Var.f67597c = (FrameLayout) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m100305b(a500 a500Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(e6c0.f89523E, viewGroup, false);
        m100304a(a500Var, viewInflate);
        return viewInflate;
    }
}
