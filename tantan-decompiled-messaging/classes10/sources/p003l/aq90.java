package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.f6c0;
import l.zp90;
import v.VLinear_Dividers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class aq90 {
    /* JADX INFO: renamed from: a */
    public static void m5496a(zp90 zp90Var, View view) {
        zp90Var.u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        zp90Var.v = viewGroup.getChildAt(0);
        zp90Var.w = viewGroup.getChildAt(1);
        zp90Var.x = viewGroup.getChildAt(2);
        zp90Var.y = viewGroup.getChildAt(3);
        zp90Var.z = viewGroup.getChildAt(4);
        zp90Var.A = viewGroup.getChildAt(5);
        zp90Var.B = viewGroup.getChildAt(6);
        zp90Var.C = viewGroup.getChildAt(7);
        zp90Var.D = viewGroup.getChildAt(8);
        zp90Var.E = viewGroup.getChildAt(9);
        zp90Var.F = viewGroup.getChildAt(10);
        zp90Var.G = viewGroup.getChildAt(11);
        zp90Var.H = viewGroup.getChildAt(12);
        zp90Var.I = viewGroup.getChildAt(13);
        zp90Var.J = viewGroup.getChildAt(14);
        zp90Var.K = viewGroup.getChildAt(15);
        zp90Var.L = viewGroup.getChildAt(16);
        zp90Var.M = viewGroup.getChildAt(17);
        zp90Var.N = viewGroup.getChildAt(18);
        zp90Var.O = viewGroup.getChildAt(19);
        zp90Var.P = viewGroup.getChildAt(20);
        zp90Var.Q = viewGroup.getChildAt(21);
    }

    /* JADX INFO: renamed from: b */
    public static View m5497b(zp90 zp90Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.W9, viewGroup, false);
        m5496a(zp90Var, viewInflate);
        return viewInflate;
    }
}
