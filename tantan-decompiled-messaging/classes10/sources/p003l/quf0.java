package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import l.f6c0;
import l.puf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class quf0 {
    /* JADX INFO: renamed from: a */
    public static void m9034a(puf0 puf0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        puf0Var.j = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        puf0Var.k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        puf0Var.l = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        puf0Var.m = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        puf0Var.n = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3);
        puf0Var.o = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(4);
        puf0Var.p = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5);
        puf0Var.q = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        puf0Var.r = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        puf0Var.s = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        puf0Var.t = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m9035b(puf0 puf0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.mc, viewGroup, false);
        m9034a(puf0Var, viewInflate);
        return viewInflate;
    }
}
