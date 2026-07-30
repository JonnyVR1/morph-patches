package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import l.phe0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class qhe0 {
    /* JADX INFO: renamed from: a */
    public static void m9002a(phe0 phe0Var, View view) {
        phe0Var.a = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        phe0Var.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        phe0Var.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        phe0Var.d = viewGroup.getChildAt(1);
        phe0Var.e = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        phe0Var.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0);
        phe0Var.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(1);
        phe0Var.h = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        phe0Var.i = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        phe0Var.j = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0);
        phe0Var.k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(1);
        phe0Var.l = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        phe0Var.m = viewGroup.getChildAt(4);
        phe0Var.n = ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        phe0Var.o = ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1);
        phe0Var.p = viewGroup.getChildAt(7);
        phe0Var.q = ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m9003b(phe0 phe0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f6064r4, viewGroup, false);
        m9002a(phe0Var, viewInflate);
        return viewInflate;
    }
}
