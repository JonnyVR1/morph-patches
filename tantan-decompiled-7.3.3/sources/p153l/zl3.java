package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class zl3 {
    /* JADX INFO: renamed from: a */
    public static void m220163a(yl3 yl3Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        yl3Var.f200519a = (VNavigationBar) viewGroup.getChildAt(0);
        yl3Var.f200520b = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        yl3Var.f200521c = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        yl3Var.f200522d = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(4);
        yl3Var.f200523e = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m220164b(yl3 yl3Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125804e, viewGroup, false);
        m220163a(yl3Var, viewInflate);
        return viewInflate;
    }
}
