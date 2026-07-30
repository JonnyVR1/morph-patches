package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.constraintlayout.widget.ConstraintLayout;
import l.dg2;
import l.h6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class eg2 {
    /* JADX INFO: renamed from: a */
    public static void m6295a(dg2 dg2Var, View view) {
        dg2Var.d = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        dg2Var.e = viewGroup.getChildAt(0);
        dg2Var.f = viewGroup.getChildAt(1);
        dg2Var.g = viewGroup.getChildAt(2);
        dg2Var.h = viewGroup.getChildAt(3);
        dg2Var.i = viewGroup.getChildAt(4);
        dg2Var.j = viewGroup.getChildAt(5);
        dg2Var.k = ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0);
        dg2Var.l = ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1);
        dg2Var.m = viewGroup.getChildAt(7);
        dg2Var.n = viewGroup.getChildAt(8);
        dg2Var.o = viewGroup.getChildAt(9);
        dg2Var.p = (ViewStub) viewGroup.getChildAt(10);
        dg2Var.q = viewGroup.getChildAt(11);
    }

    /* JADX INFO: renamed from: b */
    public static View m6296b(dg2 dg2Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(h6c0.b, viewGroup, false);
        m6295a(dg2Var, viewInflate);
        return viewInflate;
    }
}
