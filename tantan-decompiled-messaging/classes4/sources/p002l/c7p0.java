package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import l.z6p0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class c7p0 {
    /* JADX INFO: renamed from: a */
    public static void m10810a(z6p0 z6p0Var, View view) {
        z6p0Var.l = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        z6p0Var.m = viewGroup.getChildAt(0);
        z6p0Var.n = viewGroup.getChildAt(1);
        z6p0Var.o = viewGroup.getChildAt(2);
        z6p0Var.p = viewGroup.getChildAt(3);
        z6p0Var.q = viewGroup.getChildAt(4);
        z6p0Var.r = viewGroup.getChildAt(5);
        z6p0Var.s = viewGroup.getChildAt(6);
        z6p0Var.t = viewGroup.getChildAt(7);
        z6p0Var.u = ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(0);
        z6p0Var.v = ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m10811b(z6p0 z6p0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19844fb, viewGroup, false);
        m10810a(z6p0Var, viewInflate);
        return viewInflate;
    }
}
