package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VList;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class kia0 {
    /* JADX INFO: renamed from: a */
    public static void m146055a(jia0 jia0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        jia0Var.f118074a = (VNavigationBar) viewGroup.getChildAt(0);
        jia0Var.f118075b = (VList) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m146056b(jia0 jia0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.f137390z, viewGroup, false);
        m146055a(jia0Var, viewInflate);
        return viewInflate;
    }
}
