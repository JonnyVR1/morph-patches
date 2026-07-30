package p006l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class cr60 {
    /* JADX INFO: renamed from: a */
    public static void m13614a(br60 br60Var, View view) {
        br60Var.f9041c = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        br60Var.f9042d = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        br60Var.f9043e = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        br60Var.f9044f = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        br60Var.f9045g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        br60Var.f9046h = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        br60Var.f9047i = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        br60Var.f9048j = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1);
        br60Var.f9049k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3);
        br60Var.f9050l = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(4)).getChildAt(0);
        br60Var.f9051m = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(4)).getChildAt(1);
        br60Var.f9052n = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5);
        br60Var.f9053o = viewGroup.getChildAt(1);
        br60Var.f9054p = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m13615b(br60 br60Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f9430g0, viewGroup, false);
        m13614a(br60Var, viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: c */
    public static void m13616c(br60 br60Var) {
        br60Var.f9041c = null;
        br60Var.f9042d = null;
        br60Var.f9043e = null;
        br60Var.f9044f = null;
        br60Var.f9045g = null;
        br60Var.f9046h = null;
        br60Var.f9047i = null;
        br60Var.f9048j = null;
        br60Var.f9049k = null;
        br60Var.f9050l = null;
        br60Var.f9051m = null;
        br60Var.f9052n = null;
        br60Var.f9053o = null;
        br60Var.f9054p = null;
    }
}
