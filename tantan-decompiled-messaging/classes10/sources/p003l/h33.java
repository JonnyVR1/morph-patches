package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import l.f6c0;
import l.g33;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class h33 {
    /* JADX INFO: renamed from: a */
    public static void m6908a(g33 g33Var, View view) {
        g33Var.a = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        g33Var.b = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        g33Var.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        g33Var.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        g33Var.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        g33Var.f = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        g33Var.g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        g33Var.h = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        g33Var.i = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        g33Var.j = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(3);
        g33Var.k = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        g33Var.l = (Space) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        g33Var.m = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0);
        g33Var.n = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0)).getChildAt(0);
        g33Var.o = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0)).getChildAt(1);
        g33Var.p = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0)).getChildAt(2);
        g33Var.q = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(1);
        g33Var.r = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(1)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m6909b(g33 g33Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.U7, viewGroup, false);
        m6908a(g33Var, viewInflate);
        return viewInflate;
    }
}
