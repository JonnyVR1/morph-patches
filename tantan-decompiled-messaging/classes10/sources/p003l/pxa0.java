package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import l.m6c0;
import l.oxa0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class pxa0 {
    /* JADX INFO: renamed from: a */
    public static void m8844a(oxa0 oxa0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        oxa0Var.j = viewGroup.getChildAt(0);
        oxa0Var.k = viewGroup.getChildAt(2);
        oxa0Var.l = viewGroup.getChildAt(3);
        oxa0Var.m = viewGroup.getChildAt(4);
        oxa0Var.n = viewGroup.getChildAt(5);
        oxa0Var.o = viewGroup.getChildAt(6);
        oxa0Var.p = viewGroup.getChildAt(7);
        oxa0Var.q = viewGroup.getChildAt(8);
        oxa0Var.r = viewGroup.getChildAt(9);
        oxa0Var.s = viewGroup.getChildAt(10);
        oxa0Var.t = (LinearLayout) viewGroup.getChildAt(11);
        oxa0Var.u = ((ViewGroup) viewGroup.getChildAt(11)).getChildAt(0);
        oxa0Var.v = ((ViewGroup) viewGroup.getChildAt(11)).getChildAt(1);
        oxa0Var.w = (RelativeLayout) viewGroup.getChildAt(12);
        oxa0Var.x = (TextView) ((ViewGroup) viewGroup.getChildAt(12)).getChildAt(0);
        oxa0Var.y = ((ViewGroup) viewGroup.getChildAt(12)).getChildAt(1);
        oxa0Var.z = viewGroup.getChildAt(13);
        oxa0Var.A = (LinearLayout) viewGroup.getChildAt(14);
        oxa0Var.B = ((ViewGroup) viewGroup.getChildAt(14)).getChildAt(0);
        oxa0Var.C = viewGroup.getChildAt(15);
    }

    /* JADX INFO: renamed from: b */
    public static View m8845b(oxa0 oxa0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(m6c0.W0, viewGroup, false);
        m8844a(oxa0Var, viewInflate);
        return viewInflate;
    }
}
