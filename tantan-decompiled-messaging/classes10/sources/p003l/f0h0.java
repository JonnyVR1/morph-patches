package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import l.e0h0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class f0h0 {
    /* JADX INFO: renamed from: a */
    public static void m6360a(e0h0 e0h0Var, View view) {
        e0h0Var.b = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        e0h0Var.c = (RelativeLayout) viewGroup.getChildAt(0);
        e0h0Var.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        e0h0Var.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        e0h0Var.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        e0h0Var.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        e0h0Var.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3);
        e0h0Var.i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(4);
        e0h0Var.j = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5);
        e0h0Var.k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(6);
        e0h0Var.l = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(7);
        e0h0Var.m = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(8);
        e0h0Var.n = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        e0h0Var.o = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        e0h0Var.p = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        e0h0Var.q = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(4);
        e0h0Var.r = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        e0h0Var.s = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        e0h0Var.t = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        e0h0Var.u = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(4);
        e0h0Var.v = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(5);
        e0h0Var.w = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(6);
        e0h0Var.x = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(7);
        e0h0Var.y = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(8);
        e0h0Var.z = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(9);
        e0h0Var.A = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(10);
        e0h0Var.B = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(11);
        e0h0Var.C = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        e0h0Var.D = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        e0h0Var.E = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1);
        e0h0Var.F = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(2);
        e0h0Var.G = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(3);
        e0h0Var.H = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(4);
        e0h0Var.I = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(5);
        e0h0Var.J = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(6);
        e0h0Var.K = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(7);
        e0h0Var.L = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(8);
        e0h0Var.M = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        e0h0Var.N = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m6361b(e0h0 e0h0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f5450C1, viewGroup, false);
        m6360a(e0h0Var, viewInflate);
        return viewInflate;
    }
}
