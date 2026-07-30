package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import l.glm0;
import l.h6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class hlm0 {
    /* JADX INFO: renamed from: a */
    public static void m7015a(glm0 glm0Var, View view) {
        glm0Var.f = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        glm0Var.g = viewGroup.getChildAt(0);
        glm0Var.h = viewGroup.getChildAt(1);
        glm0Var.i = viewGroup.getChildAt(2);
        glm0Var.j = viewGroup.getChildAt(3);
        glm0Var.k = viewGroup.getChildAt(4);
        glm0Var.l = viewGroup.getChildAt(5);
        glm0Var.m = viewGroup.getChildAt(6);
        glm0Var.n = viewGroup.getChildAt(7);
        glm0Var.o = viewGroup.getChildAt(8);
        glm0Var.p = viewGroup.getChildAt(9);
        glm0Var.q = ((ViewGroup) viewGroup.getChildAt(9)).getChildAt(0);
        glm0Var.r = ((ViewGroup) viewGroup.getChildAt(9)).getChildAt(1);
        glm0Var.s = viewGroup.getChildAt(10);
        glm0Var.t = viewGroup.getChildAt(11);
        glm0Var.u = (FrameLayout) viewGroup.getChildAt(12);
        glm0Var.v = ((ViewGroup) viewGroup.getChildAt(12)).getChildAt(0);
        glm0Var.w = viewGroup.getChildAt(13);
        glm0Var.x = viewGroup.getChildAt(14);
    }

    /* JADX INFO: renamed from: b */
    public static View m7016b(glm0 glm0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(h6c0.H, viewGroup, false);
        m7015a(glm0Var, viewInflate);
        return viewInflate;
    }
}
