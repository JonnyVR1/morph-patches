package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p147v.VRelative;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class bob0 {
    /* JADX INFO: renamed from: a */
    public static void m102911a(aob0 aob0Var, View view) {
        aob0Var.f70827a = (VRelative) view;
        ViewGroup viewGroup = (ViewGroup) view;
        aob0Var.f70828b = (VNavigationBar) viewGroup.getChildAt(0);
        aob0Var.f70829c = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        aob0Var.f70830d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        aob0Var.f70831e = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m102912b(aob0 aob0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f96001sd, viewGroup, false);
        m102911a(aob0Var, viewInflate);
        return viewInflate;
    }
}
