package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import l.hu70;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class iu70 {
    /* JADX INFO: renamed from: a */
    public static void m15396a(hu70 hu70Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        hu70Var.i = viewGroup.getChildAt(0);
        hu70Var.j = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        hu70Var.k = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        hu70Var.l = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        hu70Var.m = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        hu70Var.n = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        hu70Var.o = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        hu70Var.p = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
        hu70Var.q = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6)).getChildAt(0);
        hu70Var.r = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6)).getChildAt(1);
        hu70Var.s = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7);
        hu70Var.t = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(0);
        hu70Var.u = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(1);
        hu70Var.v = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        hu70Var.w = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        hu70Var.x = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7)).getChildAt(0)).getChildAt(1)).getChildAt(2);
        hu70Var.y = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7)).getChildAt(1);
        hu70Var.z = (Button) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(8);
        hu70Var.A = (Button) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(9);
        hu70Var.B = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(10);
    }

    /* JADX INFO: renamed from: b */
    public static View m15397b(hu70 hu70Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19799c5, viewGroup, false);
        m15396a(hu70Var, viewInflate);
        return viewInflate;
    }
}
