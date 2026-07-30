package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.f6c0;
import l.zn1;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ao1 {
    /* JADX INFO: renamed from: a */
    public static void m5476a(zn1 zn1Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        zn1Var.a = viewGroup.getChildAt(0);
        zn1Var.b = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        zn1Var.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        zn1Var.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        zn1Var.e = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        zn1Var.f = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        zn1Var.g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(2);
        zn1Var.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        zn1Var.i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3);
        zn1Var.j = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(4);
        zn1Var.k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(5);
        zn1Var.l = viewGroup.getChildAt(2);
        zn1Var.m = viewGroup.getChildAt(3);
        zn1Var.n = viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m5477b(zn1 zn1Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.Q, viewGroup, false);
        m5476a(zn1Var, viewInflate);
        return viewInflate;
    }
}
