package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import l.f6c0;
import l.owb0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class pwb0 {
    /* JADX INFO: renamed from: a */
    public static void m8816a(owb0 owb0Var, View view) {
        owb0Var.b = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        owb0Var.c = (ImageView) viewGroup.getChildAt(0);
        owb0Var.d = viewGroup.getChildAt(1);
        owb0Var.e = viewGroup.getChildAt(2);
        owb0Var.f = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        owb0Var.g = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        owb0Var.h = viewGroup.getChildAt(3);
        owb0Var.i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0);
        owb0Var.j = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        owb0Var.k = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        owb0Var.l = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        owb0Var.m = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1);
        owb0Var.n = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        owb0Var.o = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        owb0Var.p = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1)).getChildAt(2);
        owb0Var.q = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1)).getChildAt(3);
        owb0Var.r = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(2);
        owb0Var.s = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        owb0Var.t = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(2)).getChildAt(1);
        owb0Var.u = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(3);
        owb0Var.v = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(3)).getChildAt(0);
        owb0Var.w = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(3)).getChildAt(1);
        owb0Var.x = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(3)).getChildAt(1)).getChildAt(0);
        owb0Var.y = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(3)).getChildAt(1)).getChildAt(2);
        owb0Var.z = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(3)).getChildAt(2);
        owb0Var.A = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(3)).getChildAt(2)).getChildAt(1)).getChildAt(1);
        owb0Var.B = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(3)).getChildAt(2)).getChildAt(2);
        owb0Var.C = viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m8817b(owb0 owb0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.ib, viewGroup, false);
        m8816a(owb0Var, viewInflate);
        return viewInflate;
    }
}
