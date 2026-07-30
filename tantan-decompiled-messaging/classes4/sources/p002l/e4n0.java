package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import l.d4n0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class e4n0 {
    /* JADX INFO: renamed from: a */
    public static void m12186a(d4n0 d4n0Var, View view) {
        d4n0Var.e = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        d4n0Var.f = (LinearLayout) viewGroup.getChildAt(0);
        d4n0Var.g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        d4n0Var.h = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        d4n0Var.i = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        d4n0Var.j = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        d4n0Var.k = (LinearLayout) viewGroup.getChildAt(1);
        d4n0Var.l = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        d4n0Var.m = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        d4n0Var.n = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        d4n0Var.o = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m12187b(d4n0 d4n0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19727W7, viewGroup, false);
        m12186a(d4n0Var, viewInflate);
        return viewInflate;
    }
}
