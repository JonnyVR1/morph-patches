package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import l.gq70;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class hq70 {
    /* JADX INFO: renamed from: a */
    public static void m14671a(gq70 gq70Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        gq70Var.i = viewGroup.getChildAt(0);
        gq70Var.j = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        gq70Var.k = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        gq70Var.l = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        gq70Var.m = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        gq70Var.n = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        gq70Var.o = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        gq70Var.p = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5)).getChildAt(0);
        gq70Var.q = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5)).getChildAt(1);
        gq70Var.r = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
        gq70Var.s = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7);
        gq70Var.t = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(8)).getChildAt(0);
        gq70Var.u = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(8)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m14672b(gq70 gq70Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19736X4, viewGroup, false);
        m14671a(gq70Var, viewInflate);
        return viewInflate;
    }
}
