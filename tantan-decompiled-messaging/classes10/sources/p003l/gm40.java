package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import l.f6c0;
import l.fm40;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class gm40 {
    /* JADX INFO: renamed from: a */
    public static void m6768a(fm40 fm40Var, View view) {
        fm40Var.e = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        fm40Var.f = viewGroup.getChildAt(0);
        fm40Var.g = viewGroup.getChildAt(1);
        fm40Var.h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        fm40Var.i = (RelativeLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        fm40Var.j = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        fm40Var.k = (RelativeLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        fm40Var.l = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        fm40Var.m = (RelativeLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        fm40Var.n = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        fm40Var.o = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3);
        fm40Var.p = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(1);
        fm40Var.q = (RelativeLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(4);
        fm40Var.r = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(4)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m6769b(fm40 fm40Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.p9, viewGroup, false);
        m6768a(fm40Var, viewInflate);
        return viewInflate;
    }
}
