package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.ho4;
import l.n6c0;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class io4 {
    /* JADX INFO: renamed from: a */
    public static void m7278a(ho4 ho4Var, View view) {
        ho4Var.g = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ho4Var.h = viewGroup.getChildAt(0);
        ho4Var.i = viewGroup.getChildAt(1);
        ho4Var.j = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        ho4Var.k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        ho4Var.l = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2);
        ho4Var.m = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(3);
        ho4Var.n = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0);
        ho4Var.o = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(1);
        ho4Var.p = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(2);
        ho4Var.q = viewGroup.getChildAt(3);
        ho4Var.r = viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m7279b(ho4 ho4Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.X0, viewGroup, false);
        m7278a(ho4Var, viewInflate);
        return viewInflate;
    }
}
