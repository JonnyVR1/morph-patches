package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import l.r9m0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class s9m0 {
    /* JADX INFO: renamed from: a */
    public static void m9246a(r9m0 r9m0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        r9m0Var.b = viewGroup.getChildAt(0);
        r9m0Var.c = viewGroup.getChildAt(1);
        r9m0Var.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        r9m0Var.e = view.findViewById(x4c0.f8329W);
        ViewGroup viewGroup2 = (ViewGroup) view;
        r9m0Var.f = (FrameLayout) viewGroup2.getChildAt(2);
        r9m0Var.g = (LinearLayout) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(0);
        r9m0Var.h = (TextView) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(0)).getChildAt(0);
        r9m0Var.i = (TextView) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(0)).getChildAt(1);
        r9m0Var.j = viewGroup2.getChildAt(3);
        r9m0Var.k = ((ViewGroup) viewGroup2.getChildAt(3)).getChildAt(0);
        r9m0Var.l = ((ViewGroup) viewGroup2.getChildAt(3)).getChildAt(1);
        r9m0Var.m = viewGroup2.getChildAt(4);
        r9m0Var.n = ((ViewGroup) viewGroup2.getChildAt(4)).getChildAt(0);
        r9m0Var.o = ((ViewGroup) viewGroup2.getChildAt(4)).getChildAt(1);
        r9m0Var.p = ((ViewGroup) viewGroup2.getChildAt(4)).getChildAt(2);
        r9m0Var.q = ((ViewGroup) viewGroup2.getChildAt(4)).getChildAt(3);
        r9m0Var.r = (FrameLayout) viewGroup2.getChildAt(5);
        r9m0Var.s = ((ViewGroup) viewGroup2.getChildAt(5)).getChildAt(0);
        r9m0Var.t = ((ViewGroup) viewGroup2.getChildAt(5)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m9247b(r9m0 r9m0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f5555i2, viewGroup, false);
        m9246a(r9m0Var, viewInflate);
        return viewInflate;
    }
}
