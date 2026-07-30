package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import l.h6c0;
import l.k1l0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class l1l0 {
    /* JADX INFO: renamed from: a */
    public static void m7657a(k1l0 k1l0Var, View view) {
        k1l0Var.f = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        k1l0Var.g = (FrameLayout) viewGroup.getChildAt(0);
        k1l0Var.h = viewGroup.getChildAt(1);
        k1l0Var.i = viewGroup.getChildAt(2);
        k1l0Var.j = viewGroup.getChildAt(3);
        k1l0Var.k = viewGroup.getChildAt(4);
        k1l0Var.l = (FrameLayout) viewGroup.getChildAt(5);
        k1l0Var.m = ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        k1l0Var.n = viewGroup.getChildAt(6);
        k1l0Var.o = viewGroup.getChildAt(7);
        k1l0Var.p = ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(0);
        k1l0Var.q = ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(1);
        k1l0Var.r = viewGroup.getChildAt(8);
        k1l0Var.s = viewGroup.getChildAt(9);
    }

    /* JADX INFO: renamed from: b */
    public static View m7658b(k1l0 k1l0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(h6c0.E, viewGroup, false);
        m7657a(k1l0Var, viewInflate);
        return viewInflate;
    }
}
