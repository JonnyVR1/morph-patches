package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import l.nw70;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ow70 {
    /* JADX INFO: renamed from: a */
    public static void m19765a(nw70 nw70Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        nw70Var.i = viewGroup.getChildAt(0);
        nw70Var.j = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        nw70Var.k = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        nw70Var.l = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        nw70Var.m = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        nw70Var.n = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        nw70Var.o = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(1);
        nw70Var.p = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        nw70Var.q = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5)).getChildAt(0);
        nw70Var.r = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5)).getChildAt(0)).getChildAt(0);
        nw70Var.s = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5)).getChildAt(0)).getChildAt(1);
        nw70Var.t = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5)).getChildAt(0)).getChildAt(2);
        nw70Var.u = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5)).getChildAt(1);
        nw70Var.v = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5)).getChildAt(1)).getChildAt(0);
        nw70Var.w = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5)).getChildAt(1)).getChildAt(1);
        nw70Var.x = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5)).getChildAt(1)).getChildAt(2);
        nw70Var.y = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5)).getChildAt(1)).getChildAt(3);
        nw70Var.z = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5)).getChildAt(2);
        nw70Var.A = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5)).getChildAt(2)).getChildAt(0);
        nw70Var.B = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5)).getChildAt(2)).getChildAt(1);
        nw70Var.C = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5)).getChildAt(2)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m19766b(nw70 nw70Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19760Z4, viewGroup, false);
        m19765a(nw70Var, viewInflate);
        return viewInflate;
    }
}
