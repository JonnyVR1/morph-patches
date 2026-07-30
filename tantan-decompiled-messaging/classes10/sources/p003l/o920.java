package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import l.l920;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class o920 {
    /* JADX INFO: renamed from: a */
    public static void m8434a(l920 l920Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        l920Var.b = viewGroup.getChildAt(0);
        l920Var.c = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        l920Var.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        l920Var.e = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        l920Var.f = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        l920Var.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        l920Var.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        l920Var.i = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        l920Var.j = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        l920Var.k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        l920Var.l = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2);
        l920Var.m = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        l920Var.n = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        l920Var.o = view.findViewById(x4c0.f8346p);
        l920Var.p = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) view).getChildAt(1)).getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m8435b(l920 l920Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f5491Q0, viewGroup, false);
        m8434a(l920Var, viewInflate);
        return viewInflate;
    }
}
