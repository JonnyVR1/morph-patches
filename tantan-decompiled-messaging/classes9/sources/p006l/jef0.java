package p006l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class jef0 {
    /* JADX INFO: renamed from: a */
    public static void m17434a(ief0 ief0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ief0Var.f14393a = viewGroup.getChildAt(0);
        ief0Var.f14394b = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        ief0Var.f14395c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        ief0Var.f14396d = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        ief0Var.f14397e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        ief0Var.f14398f = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(0);
        ief0Var.f14399g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(2);
        ief0Var.f14400h = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(4);
        ief0Var.f14401i = viewGroup.getChildAt(1);
        ief0Var.f14402j = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        ief0Var.f14403k = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        ief0Var.f14404l = viewGroup.getChildAt(2);
        ief0Var.f14405m = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        ief0Var.f14406n = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        ief0Var.f14407o = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        ief0Var.f14408p = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m17435b(ief0 ief0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f9432h0, viewGroup, false);
        m17434a(ief0Var, viewInflate);
        return viewInflate;
    }
}
