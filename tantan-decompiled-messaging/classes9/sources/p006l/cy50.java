package p006l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class cy50 {
    /* JADX INFO: renamed from: a */
    public static void m13686a(by50 by50Var, View view) {
        by50Var.f9208a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        by50Var.f9209b = viewGroup.getChildAt(0);
        by50Var.f9210c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        by50Var.f9211d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        by50Var.f9212e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3);
        by50Var.f9213f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(4);
        by50Var.f9214g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(5);
        by50Var.f9215h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(6);
        by50Var.f9216i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(7);
        by50Var.f9217j = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(8);
        by50Var.f9218k = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m13687b(by50 by50Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f9401K, viewGroup, false);
        m13686a(by50Var, viewInflate);
        return viewInflate;
    }
}
