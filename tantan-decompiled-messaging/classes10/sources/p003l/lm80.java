package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import l.km80;
import l.m6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class lm80 {
    /* JADX INFO: renamed from: a */
    public static void m7755a(km80 km80Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        km80Var.j = viewGroup.getChildAt(0);
        km80Var.k = viewGroup.getChildAt(1);
        km80Var.l = (LinearLayout) viewGroup.getChildAt(2);
        km80Var.m = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        km80Var.n = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        km80Var.o = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        km80Var.p = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        km80Var.q = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        km80Var.r = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        km80Var.s = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3)).getChildAt(0);
        km80Var.t = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4);
        km80Var.u = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5);
        km80Var.v = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5)).getChildAt(0)).getChildAt(0);
        km80Var.w = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5)).getChildAt(0)).getChildAt(1);
        km80Var.x = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5)).getChildAt(1)).getChildAt(0);
        km80Var.y = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5)).getChildAt(1)).getChildAt(1);
        km80Var.z = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(6);
        km80Var.A = viewGroup.getChildAt(3);
        km80Var.B = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        km80Var.C = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        km80Var.D = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        km80Var.E = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(3);
        km80Var.F = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(4);
        km80Var.G = (RelativeLayout) viewGroup.getChildAt(4);
        km80Var.H = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        km80Var.I = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        km80Var.J = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(3);
        km80Var.K = viewGroup.getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m7756b(km80 km80Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(m6c0.u0, viewGroup, false);
        m7755a(km80Var, viewInflate);
        return viewInflate;
    }
}
