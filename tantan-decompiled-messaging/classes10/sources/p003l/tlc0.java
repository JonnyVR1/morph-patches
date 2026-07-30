package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import l.slc0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class tlc0 {
    /* JADX INFO: renamed from: a */
    public static void m9589a(slc0 slc0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        slc0Var.a = (RelativeLayout) viewGroup.getChildAt(0);
        slc0Var.b = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        slc0Var.c = (RelativeLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        slc0Var.d = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        slc0Var.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        slc0Var.f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        slc0Var.g = (RelativeLayout) viewGroup.getChildAt(1);
        slc0Var.h = (RelativeLayout) viewGroup.getChildAt(2);
        slc0Var.i = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        slc0Var.j = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        slc0Var.k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        slc0Var.l = (RelativeLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2);
        slc0Var.m = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        slc0Var.n = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        slc0Var.o = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        slc0Var.p = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(1);
        slc0Var.q = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(2);
        slc0Var.r = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(3);
        slc0Var.s = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(4);
        slc0Var.t = (RelativeLayout) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m9590b(slc0 slc0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f6043o4, viewGroup, false);
        m9589a(slc0Var, viewInflate);
        return viewInflate;
    }
}
