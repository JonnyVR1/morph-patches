package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import l.c15;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class d15 {
    /* JADX INFO: renamed from: a */
    public static void m6030a(c15 c15Var, View view) {
        c15Var.a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        c15Var.b = viewGroup.getChildAt(0);
        c15Var.c = viewGroup.getChildAt(1);
        c15Var.d = viewGroup.getChildAt(2);
        c15Var.e = viewGroup.getChildAt(3);
        c15Var.f = viewGroup.getChildAt(4);
        c15Var.g = viewGroup.getChildAt(5);
        c15Var.h = ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        c15Var.i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1)).getChildAt(2);
        c15Var.j = ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(2);
        c15Var.k = viewGroup.getChildAt(6);
        c15Var.l = viewGroup.getChildAt(7);
        c15Var.m = viewGroup.getChildAt(8);
        c15Var.n = (FrameLayout) viewGroup.getChildAt(9);
        c15Var.o = ((ViewGroup) viewGroup.getChildAt(9)).getChildAt(0);
        c15Var.p = (TextView) ((ViewGroup) viewGroup.getChildAt(9)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m6031b(c15 c15Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.n1, viewGroup, false);
        m6030a(c15Var, viewInflate);
        return viewInflate;
    }
}
