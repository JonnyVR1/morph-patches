package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import l.f6c0;
import l.ihl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class jhl0 {
    /* JADX INFO: renamed from: a */
    public static void m7420a(ihl0 ihl0Var, View view) {
        ihl0Var.a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ihl0Var.b = (FrameLayout) viewGroup.getChildAt(0);
        ihl0Var.c = (FrameLayout) viewGroup.getChildAt(1);
        ihl0Var.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        ihl0Var.e = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        ihl0Var.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0);
        ihl0Var.g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        ihl0Var.h = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        ihl0Var.i = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        ihl0Var.j = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        ihl0Var.k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0);
        ihl0Var.l = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(1);
        ihl0Var.m = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(2);
        ihl0Var.n = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(3);
        ihl0Var.o = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(4);
        ihl0Var.p = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(5);
        ihl0Var.q = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(6);
        ihl0Var.r = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(6)).getChildAt(0)).getChildAt(0);
        ihl0Var.s = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(7);
    }

    /* JADX INFO: renamed from: b */
    public static View m7421b(ihl0 ihl0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.Q8, viewGroup, false);
        m7420a(ihl0Var, viewInflate);
        return viewInflate;
    }
}
