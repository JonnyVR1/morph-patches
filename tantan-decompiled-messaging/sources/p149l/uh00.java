package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VLinear;
import p147v.VList;
import p147v.VProgressBar;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class uh00 {
    /* JADX INFO: renamed from: a */
    public static void m193605a(th00 th00Var, View view) {
        th00Var.f170172a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        th00Var.f170173b = (VNavigationBar) viewGroup.getChildAt(0);
        th00Var.f170174c = (VProgressBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        th00Var.f170175d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        th00Var.f170176e = (VList) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m193606b(th00 th00Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95505Oe, viewGroup, false);
        m193605a(th00Var, viewInflate);
        return viewInflate;
    }
}
