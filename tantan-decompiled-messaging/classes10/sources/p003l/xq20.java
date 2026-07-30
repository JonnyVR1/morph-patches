package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import l.n6c0;
import l.wq20;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class xq20 {
    /* JADX INFO: renamed from: a */
    public static void m10943a(wq20 wq20Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        wq20Var.a = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        wq20Var.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        wq20Var.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        wq20Var.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        wq20Var.e = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        wq20Var.f = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        wq20Var.g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        wq20Var.h = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(3);
        wq20Var.i = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(4);
        wq20Var.j = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(5);
        wq20Var.k = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(6);
        wq20Var.l = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(6)).getChildAt(0);
        wq20Var.m = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(6)).getChildAt(1);
        wq20Var.n = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(8);
        wq20Var.o = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(9);
        wq20Var.p = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        wq20Var.q = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m10944b(wq20 wq20Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.n0, viewGroup, false);
        m10943a(wq20Var, viewInflate);
        return viewInflate;
    }
}
