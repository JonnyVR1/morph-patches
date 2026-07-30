package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.guo0;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class huo0 {
    /* JADX INFO: renamed from: a */
    public static void m14833a(guo0 guo0Var, View view) {
        guo0Var.e = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        guo0Var.f = viewGroup.getChildAt(0);
        guo0Var.g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        guo0Var.h = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        guo0Var.i = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        guo0Var.j = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        guo0Var.k = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        guo0Var.l = viewGroup.getChildAt(1);
        guo0Var.m = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        guo0Var.n = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        guo0Var.o = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        guo0Var.p = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        guo0Var.q = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m14834b(guo0 guo0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19828e8, viewGroup, false);
        m14833a(guo0Var, viewInflate);
        return viewInflate;
    }
}
