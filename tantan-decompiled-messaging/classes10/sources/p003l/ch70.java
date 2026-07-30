package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import l.bh70;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ch70 {
    /* JADX INFO: renamed from: a */
    public static void m5948a(bh70 bh70Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        bh70Var.b = viewGroup.getChildAt(0);
        bh70Var.c = viewGroup.getChildAt(1);
        bh70Var.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        bh70Var.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        bh70Var.f = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        bh70Var.g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        bh70Var.h = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        bh70Var.i = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(3);
        bh70Var.j = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(4);
        bh70Var.k = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(4)).getChildAt(1)).getChildAt(0);
        bh70Var.l = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(4)).getChildAt(1)).getChildAt(1);
        bh70Var.m = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(4)).getChildAt(1)).getChildAt(2);
        bh70Var.n = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        bh70Var.o = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        bh70Var.p = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        bh70Var.q = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m5949b(bh70 bh70Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f5522a1, viewGroup, false);
        m5948a(bh70Var, viewInflate);
        return viewInflate;
    }
}
