package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import l.f6c0;
import l.jp60;
import v.VFrame_Anim;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class kp60 {
    /* JADX INFO: renamed from: a */
    public static void m7627a(jp60 jp60Var, View view) {
        jp60Var.c = (VFrame_Anim) view;
        ViewGroup viewGroup = (ViewGroup) view;
        jp60Var.d = viewGroup.getChildAt(0);
        jp60Var.e = viewGroup.getChildAt(0);
        jp60Var.f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        jp60Var.g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        jp60Var.h = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        jp60Var.i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        jp60Var.j = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        jp60Var.k = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(2);
        jp60Var.l = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(3);
        jp60Var.m = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        jp60Var.n = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0);
        jp60Var.o = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(1);
        jp60Var.p = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        jp60Var.q = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
        jp60Var.r = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7);
        jp60Var.s = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7)).getChildAt(0)).getChildAt(0);
        jp60Var.t = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7)).getChildAt(0)).getChildAt(1);
        jp60Var.u = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7)).getChildAt(1)).getChildAt(0);
        jp60Var.v = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7)).getChildAt(1)).getChildAt(1);
        jp60Var.w = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7)).getChildAt(2)).getChildAt(0);
        jp60Var.x = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7)).getChildAt(2)).getChildAt(1);
        jp60Var.y = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(8);
        jp60Var.z = viewGroup.getChildAt(1);
        jp60Var.A = viewGroup.getChildAt(1);
        jp60Var.B = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        jp60Var.C = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        jp60Var.D = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        jp60Var.E = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        jp60Var.F = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        jp60Var.G = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        jp60Var.H = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        jp60Var.I = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        jp60Var.J = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
        jp60Var.K = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7);
        jp60Var.L = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(8);
        jp60Var.M = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(9);
        jp60Var.N = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(10);
        jp60Var.O = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(10)).getChildAt(0)).getChildAt(0);
        jp60Var.P = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(10)).getChildAt(0)).getChildAt(1);
        jp60Var.Q = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(10)).getChildAt(1)).getChildAt(0);
        jp60Var.R = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(10)).getChildAt(1)).getChildAt(1);
        jp60Var.S = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(10)).getChildAt(2)).getChildAt(0);
        jp60Var.T = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(10)).getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m7628b(jp60 jp60Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.o5, viewGroup, false);
        m7627a(jp60Var, viewInflate);
        return viewInflate;
    }
}
