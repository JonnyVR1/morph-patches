package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import l.f6c0;
import l.s05;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class t05 {
    /* JADX INFO: renamed from: a */
    public static void m9517a(s05 s05Var, View view) {
        s05Var.a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        s05Var.b = viewGroup.getChildAt(1);
        s05Var.c = viewGroup.getChildAt(2);
        s05Var.d = viewGroup.getChildAt(3);
        s05Var.e = viewGroup.getChildAt(4);
        s05Var.f = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        s05Var.g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        s05Var.h = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        s05Var.i = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(0)).getChildAt(3);
        s05Var.j = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(0)).getChildAt(4);
        s05Var.k = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(0)).getChildAt(5);
        s05Var.l = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(0)).getChildAt(6);
        s05Var.m = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(0)).getChildAt(7);
        s05Var.n = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(0)).getChildAt(8);
        s05Var.o = viewGroup.getChildAt(6);
        s05Var.p = viewGroup.getChildAt(7);
    }

    /* JADX INFO: renamed from: b */
    public static View m9518b(s05 s05Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.l1, viewGroup, false);
        m9517a(s05Var, viewInflate);
        return viewInflate;
    }
}
