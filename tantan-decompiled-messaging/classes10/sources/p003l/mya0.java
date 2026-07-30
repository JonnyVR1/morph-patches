package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import l.lya0;
import l.m6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class mya0 {
    /* JADX INFO: renamed from: a */
    public static void m8291a(lya0 lya0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        lya0Var.j = viewGroup.getChildAt(0);
        lya0Var.k = viewGroup.getChildAt(1);
        lya0Var.l = viewGroup.getChildAt(2);
        lya0Var.m = viewGroup.getChildAt(3);
        lya0Var.n = viewGroup.getChildAt(4);
        lya0Var.o = viewGroup.getChildAt(5);
        lya0Var.p = viewGroup.getChildAt(6);
        lya0Var.q = (LinearLayout) viewGroup.getChildAt(7);
        lya0Var.r = ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(0);
        lya0Var.s = ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(1);
        lya0Var.t = (RelativeLayout) viewGroup.getChildAt(8);
        lya0Var.u = (TextView) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(1);
        lya0Var.v = ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(2);
        lya0Var.w = viewGroup.getChildAt(9);
        lya0Var.x = viewGroup.getChildAt(10);
        lya0Var.y = (LinearLayout) viewGroup.getChildAt(11);
        lya0Var.z = ((ViewGroup) viewGroup.getChildAt(11)).getChildAt(0);
        lya0Var.A = ((ViewGroup) viewGroup.getChildAt(11)).getChildAt(1);
        lya0Var.B = viewGroup.getChildAt(12);
        lya0Var.C = viewGroup.getChildAt(13);
    }

    /* JADX INFO: renamed from: b */
    public static View m8292b(lya0 lya0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(m6c0.Y0, viewGroup, false);
        m8291a(lya0Var, viewInflate);
        return viewInflate;
    }
}
