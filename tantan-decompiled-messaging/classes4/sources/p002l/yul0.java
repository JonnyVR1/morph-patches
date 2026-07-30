package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import l.xul0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class yul0 {
    /* JADX INFO: renamed from: a */
    public static void m26940a(xul0 xul0Var, View view) {
        xul0Var.l = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        xul0Var.m = viewGroup.getChildAt(0);
        xul0Var.n = viewGroup.getChildAt(1);
        xul0Var.o = viewGroup.getChildAt(2);
        xul0Var.p = (ImageView) viewGroup.getChildAt(3);
        xul0Var.q = (TextView) viewGroup.getChildAt(4);
        xul0Var.r = (ImageView) viewGroup.getChildAt(5);
        xul0Var.s = (ScrollView) viewGroup.getChildAt(6);
        xul0Var.t = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(0);
        xul0Var.u = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(1);
        xul0Var.v = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(2);
        xul0Var.w = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(3);
        xul0Var.x = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(4);
        xul0Var.y = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(5);
        xul0Var.z = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(6);
        xul0Var.A = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(7);
        xul0Var.B = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(10);
    }

    /* JADX INFO: renamed from: b */
    public static View m26941b(xul0 xul0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19666R6, viewGroup, false);
        m26940a(xul0Var, viewInflate);
        return viewInflate;
    }
}
